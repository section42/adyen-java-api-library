/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.balanceplatform.AccountSupportingEntityCapability;
import com.adyen.model.balanceplatform.CapabilitySettings;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * AccountHolderCapability
 */
@JsonPropertyOrder({
  AccountHolderCapability.JSON_PROPERTY_ALLOWED,
  AccountHolderCapability.JSON_PROPERTY_ALLOWED_LEVEL,
  AccountHolderCapability.JSON_PROPERTY_ALLOWED_SETTINGS,
  AccountHolderCapability.JSON_PROPERTY_ENABLED,
  AccountHolderCapability.JSON_PROPERTY_PROBLEMS,
  AccountHolderCapability.JSON_PROPERTY_REQUESTED,
  AccountHolderCapability.JSON_PROPERTY_REQUESTED_LEVEL,
  AccountHolderCapability.JSON_PROPERTY_REQUESTED_SETTINGS,
  AccountHolderCapability.JSON_PROPERTY_TRANSFER_INSTRUMENTS,
  AccountHolderCapability.JSON_PROPERTY_VERIFICATION_STATUS
})

public class AccountHolderCapability {
  public static final String JSON_PROPERTY_ALLOWED = "allowed";
  private Boolean allowed;

  /**
   * The capability level that is allowed for the account holder.  Possible values: **notApplicable**, **low**, **medium**, **high**.
   */
  public enum AllowedLevelEnum {
    HIGH("high"),
    
    LOW("low"),
    
    MEDIUM("medium"),
    
    NOTAPPLICABLE("notApplicable");

    private String value;

    AllowedLevelEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AllowedLevelEnum fromValue(String value) {
      for (AllowedLevelEnum b : AllowedLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ALLOWED_LEVEL = "allowedLevel";
  private AllowedLevelEnum allowedLevel;

  public static final String JSON_PROPERTY_ALLOWED_SETTINGS = "allowedSettings";
  private CapabilitySettings allowedSettings;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_PROBLEMS = "problems";
  private List<Object> problems = null;

  public static final String JSON_PROPERTY_REQUESTED = "requested";
  private Boolean requested;

  /**
   * The requested level of the capability. Some capabilities, such as those used in [card issuing](https://docs.adyen.com/issuing/add-capabilities#capability-levels), have different levels. Levels increase the capability, but also require additional checks and increased monitoring.  Possible values: **notApplicable**, **low**, **medium**, **high**.
   */
  public enum RequestedLevelEnum {
    HIGH("high"),
    
    LOW("low"),
    
    MEDIUM("medium"),
    
    NOTAPPLICABLE("notApplicable");

    private String value;

    RequestedLevelEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RequestedLevelEnum fromValue(String value) {
      for (RequestedLevelEnum b : RequestedLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REQUESTED_LEVEL = "requestedLevel";
  private RequestedLevelEnum requestedLevel;

  public static final String JSON_PROPERTY_REQUESTED_SETTINGS = "requestedSettings";
  private CapabilitySettings requestedSettings;

  public static final String JSON_PROPERTY_TRANSFER_INSTRUMENTS = "transferInstruments";
  private List<AccountSupportingEntityCapability> transferInstruments = null;

  /**
   * The status of the verification checks for the capability.  Possible values:  * **pending**: Adyen is running the verification.  * **invalid**: The verification failed. Check if the &#x60;errors&#x60; array contains more information.  * **valid**: The verification has been successfully completed.  * **rejected**: Adyen has verified the information, but found reasons to not allow the capability. 
   */
  public enum VerificationStatusEnum {
    INVALID("invalid"),
    
    PENDING("pending"),
    
    REJECTED("rejected"),
    
    VALID("valid");

    private String value;

    VerificationStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VerificationStatusEnum fromValue(String value) {
      for (VerificationStatusEnum b : VerificationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VERIFICATION_STATUS = "verificationStatus";
  private VerificationStatusEnum verificationStatus;

  public AccountHolderCapability() { 
  }

  public AccountHolderCapability allowed(Boolean allowed) {
    this.allowed = allowed;
    return this;
  }

   /**
   * Indicates whether the capability is allowed. Adyen sets this to **true** if the verification is successful and the account holder is permitted to use the capability.
   * @return allowed
  **/
  @ApiModelProperty(value = "Indicates whether the capability is allowed. Adyen sets this to **true** if the verification is successful and the account holder is permitted to use the capability.")
  @JsonProperty(JSON_PROPERTY_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowed() {
    return allowed;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }


  public AccountHolderCapability allowedLevel(AllowedLevelEnum allowedLevel) {
    this.allowedLevel = allowedLevel;
    return this;
  }

   /**
   * The capability level that is allowed for the account holder.  Possible values: **notApplicable**, **low**, **medium**, **high**.
   * @return allowedLevel
  **/
  @ApiModelProperty(value = "The capability level that is allowed for the account holder.  Possible values: **notApplicable**, **low**, **medium**, **high**.")
  @JsonProperty(JSON_PROPERTY_ALLOWED_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AllowedLevelEnum getAllowedLevel() {
    return allowedLevel;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedLevel(AllowedLevelEnum allowedLevel) {
    this.allowedLevel = allowedLevel;
  }


  public AccountHolderCapability allowedSettings(CapabilitySettings allowedSettings) {
    this.allowedSettings = allowedSettings;
    return this;
  }

   /**
   * Get allowedSettings
   * @return allowedSettings
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ALLOWED_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CapabilitySettings getAllowedSettings() {
    return allowedSettings;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedSettings(CapabilitySettings allowedSettings) {
    this.allowedSettings = allowedSettings;
  }


  public AccountHolderCapability enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the capability is enabled. If **false**, the capability is temporarily disabled for the account holder.
   * @return enabled
  **/
  @ApiModelProperty(value = "Indicates whether the capability is enabled. If **false**, the capability is temporarily disabled for the account holder.")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public AccountHolderCapability problems(List<Object> problems) {
    this.problems = problems;
    return this;
  }

  public AccountHolderCapability addProblemsItem(Object problemsItem) {
    if (this.problems == null) {
      this.problems = new ArrayList<>();
    }
    this.problems.add(problemsItem);
    return this;
  }

   /**
   * Contains verification errors and the actions that you can take to resolve them.
   * @return problems
  **/
  @ApiModelProperty(value = "Contains verification errors and the actions that you can take to resolve them.")
  @JsonProperty(JSON_PROPERTY_PROBLEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getProblems() {
    return problems;
  }


  @JsonProperty(JSON_PROPERTY_PROBLEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProblems(List<Object> problems) {
    this.problems = problems;
  }


  public AccountHolderCapability requested(Boolean requested) {
    this.requested = requested;
    return this;
  }

   /**
   * Indicates whether the capability is requested. To check whether the account holder is permitted to use the capability, refer to the &#x60;allowed&#x60; field.
   * @return requested
  **/
  @ApiModelProperty(value = "Indicates whether the capability is requested. To check whether the account holder is permitted to use the capability, refer to the `allowed` field.")
  @JsonProperty(JSON_PROPERTY_REQUESTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRequested() {
    return requested;
  }


  @JsonProperty(JSON_PROPERTY_REQUESTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequested(Boolean requested) {
    this.requested = requested;
  }


  public AccountHolderCapability requestedLevel(RequestedLevelEnum requestedLevel) {
    this.requestedLevel = requestedLevel;
    return this;
  }

   /**
   * The requested level of the capability. Some capabilities, such as those used in [card issuing](https://docs.adyen.com/issuing/add-capabilities#capability-levels), have different levels. Levels increase the capability, but also require additional checks and increased monitoring.  Possible values: **notApplicable**, **low**, **medium**, **high**.
   * @return requestedLevel
  **/
  @ApiModelProperty(value = "The requested level of the capability. Some capabilities, such as those used in [card issuing](https://docs.adyen.com/issuing/add-capabilities#capability-levels), have different levels. Levels increase the capability, but also require additional checks and increased monitoring.  Possible values: **notApplicable**, **low**, **medium**, **high**.")
  @JsonProperty(JSON_PROPERTY_REQUESTED_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RequestedLevelEnum getRequestedLevel() {
    return requestedLevel;
  }


  @JsonProperty(JSON_PROPERTY_REQUESTED_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestedLevel(RequestedLevelEnum requestedLevel) {
    this.requestedLevel = requestedLevel;
  }


  public AccountHolderCapability requestedSettings(CapabilitySettings requestedSettings) {
    this.requestedSettings = requestedSettings;
    return this;
  }

   /**
   * Get requestedSettings
   * @return requestedSettings
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REQUESTED_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CapabilitySettings getRequestedSettings() {
    return requestedSettings;
  }


  @JsonProperty(JSON_PROPERTY_REQUESTED_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestedSettings(CapabilitySettings requestedSettings) {
    this.requestedSettings = requestedSettings;
  }


  public AccountHolderCapability transferInstruments(List<AccountSupportingEntityCapability> transferInstruments) {
    this.transferInstruments = transferInstruments;
    return this;
  }

  public AccountHolderCapability addTransferInstrumentsItem(AccountSupportingEntityCapability transferInstrumentsItem) {
    if (this.transferInstruments == null) {
      this.transferInstruments = new ArrayList<>();
    }
    this.transferInstruments.add(transferInstrumentsItem);
    return this;
  }

   /**
   * Contains the status of the transfer instruments associated with this capability. 
   * @return transferInstruments
  **/
  @ApiModelProperty(value = "Contains the status of the transfer instruments associated with this capability. ")
  @JsonProperty(JSON_PROPERTY_TRANSFER_INSTRUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AccountSupportingEntityCapability> getTransferInstruments() {
    return transferInstruments;
  }


  @JsonProperty(JSON_PROPERTY_TRANSFER_INSTRUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransferInstruments(List<AccountSupportingEntityCapability> transferInstruments) {
    this.transferInstruments = transferInstruments;
  }


  public AccountHolderCapability verificationStatus(VerificationStatusEnum verificationStatus) {
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * The status of the verification checks for the capability.  Possible values:  * **pending**: Adyen is running the verification.  * **invalid**: The verification failed. Check if the &#x60;errors&#x60; array contains more information.  * **valid**: The verification has been successfully completed.  * **rejected**: Adyen has verified the information, but found reasons to not allow the capability. 
   * @return verificationStatus
  **/
  @ApiModelProperty(value = "The status of the verification checks for the capability.  Possible values:  * **pending**: Adyen is running the verification.  * **invalid**: The verification failed. Check if the `errors` array contains more information.  * **valid**: The verification has been successfully completed.  * **rejected**: Adyen has verified the information, but found reasons to not allow the capability. ")
  @JsonProperty(JSON_PROPERTY_VERIFICATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VerificationStatusEnum getVerificationStatus() {
    return verificationStatus;
  }


  @JsonProperty(JSON_PROPERTY_VERIFICATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerificationStatus(VerificationStatusEnum verificationStatus) {
    this.verificationStatus = verificationStatus;
  }


  /**
   * Return true if this AccountHolderCapability object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountHolderCapability accountHolderCapability = (AccountHolderCapability) o;
    return Objects.equals(this.allowed, accountHolderCapability.allowed) &&
        Objects.equals(this.allowedLevel, accountHolderCapability.allowedLevel) &&
        Objects.equals(this.allowedSettings, accountHolderCapability.allowedSettings) &&
        Objects.equals(this.enabled, accountHolderCapability.enabled) &&
        Objects.equals(this.problems, accountHolderCapability.problems) &&
        Objects.equals(this.requested, accountHolderCapability.requested) &&
        Objects.equals(this.requestedLevel, accountHolderCapability.requestedLevel) &&
        Objects.equals(this.requestedSettings, accountHolderCapability.requestedSettings) &&
        Objects.equals(this.transferInstruments, accountHolderCapability.transferInstruments) &&
        Objects.equals(this.verificationStatus, accountHolderCapability.verificationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowed, allowedLevel, allowedSettings, enabled, problems, requested, requestedLevel, requestedSettings, transferInstruments, verificationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountHolderCapability {\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    allowedLevel: ").append(toIndentedString(allowedLevel)).append("\n");
    sb.append("    allowedSettings: ").append(toIndentedString(allowedSettings)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    problems: ").append(toIndentedString(problems)).append("\n");
    sb.append("    requested: ").append(toIndentedString(requested)).append("\n");
    sb.append("    requestedLevel: ").append(toIndentedString(requestedLevel)).append("\n");
    sb.append("    requestedSettings: ").append(toIndentedString(requestedSettings)).append("\n");
    sb.append("    transferInstruments: ").append(toIndentedString(transferInstruments)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

/**
   * Create an instance of AccountHolderCapability given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccountHolderCapability
   * @throws JsonProcessingException if the JSON string is invalid with respect to AccountHolderCapability
   */
  public static AccountHolderCapability fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AccountHolderCapability.class);
  }
/**
  * Convert an instance of AccountHolderCapability to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

