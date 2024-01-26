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
import com.adyen.model.balanceplatform.PlatformPaymentConfiguration;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * BalanceAccountUpdateRequest
 */
@JsonPropertyOrder({
  BalanceAccountUpdateRequest.JSON_PROPERTY_ACCOUNT_HOLDER_ID,
  BalanceAccountUpdateRequest.JSON_PROPERTY_DESCRIPTION,
  BalanceAccountUpdateRequest.JSON_PROPERTY_METADATA,
  BalanceAccountUpdateRequest.JSON_PROPERTY_PLATFORM_PAYMENT_CONFIGURATION,
  BalanceAccountUpdateRequest.JSON_PROPERTY_REFERENCE,
  BalanceAccountUpdateRequest.JSON_PROPERTY_STATUS,
  BalanceAccountUpdateRequest.JSON_PROPERTY_TIME_ZONE
})

public class BalanceAccountUpdateRequest {
  public static final String JSON_PROPERTY_ACCOUNT_HOLDER_ID = "accountHolderId";
  private String accountHolderId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;

  public static final String JSON_PROPERTY_PLATFORM_PAYMENT_CONFIGURATION = "platformPaymentConfiguration";
  private PlatformPaymentConfiguration platformPaymentConfiguration;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  /**
   * The status of the balance account. Payment instruments linked to the balance account can only be used if the balance account status is **active**.  Possible values: **active**, **inactive**, **closed**, **suspended**.
   */
  public enum StatusEnum {
    ACTIVE("active"),
    
    CLOSED("closed"),
    
    INACTIVE("inactive"),
    
    SUSPENDED("suspended");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  private String timeZone;

  public BalanceAccountUpdateRequest() { 
  }

  public BalanceAccountUpdateRequest accountHolderId(String accountHolderId) {
    this.accountHolderId = accountHolderId;
    return this;
  }

   /**
   * The unique identifier of the [account holder](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/accountHolders__resParam_id) associated with the balance account.
   * @return accountHolderId
  **/
  @ApiModelProperty(value = "The unique identifier of the [account holder](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/accountHolders__resParam_id) associated with the balance account.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountHolderId() {
    return accountHolderId;
  }


 /**
  * The unique identifier of the [account holder](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/accountHolders__resParam_id) associated with the balance account.
  *
  * @param accountHolderId
  */ 
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountHolderId(String accountHolderId) {
    this.accountHolderId = accountHolderId;
  }


  public BalanceAccountUpdateRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A human-readable description of the balance account, maximum 300 characters. You can use this parameter to distinguish between multiple balance accounts under an account holder.
   * @return description
  **/
  @ApiModelProperty(value = "A human-readable description of the balance account, maximum 300 characters. You can use this parameter to distinguish between multiple balance accounts under an account holder.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


 /**
  * A human-readable description of the balance account, maximum 300 characters. You can use this parameter to distinguish between multiple balance accounts under an account holder.
  *
  * @param description
  */ 
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public BalanceAccountUpdateRequest metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public BalanceAccountUpdateRequest putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * A set of key and value pairs for general use. The keys do not have specific names and may be used for storing miscellaneous data as desired. &gt; Note that during an update of metadata, the omission of existing key-value pairs will result in the deletion of those key-value pairs.
   * @return metadata
  **/
  @ApiModelProperty(value = "A set of key and value pairs for general use. The keys do not have specific names and may be used for storing miscellaneous data as desired. > Note that during an update of metadata, the omission of existing key-value pairs will result in the deletion of those key-value pairs.")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetadata() {
    return metadata;
  }


 /**
  * A set of key and value pairs for general use. The keys do not have specific names and may be used for storing miscellaneous data as desired. &gt; Note that during an update of metadata, the omission of existing key-value pairs will result in the deletion of those key-value pairs.
  *
  * @param metadata
  */ 
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public BalanceAccountUpdateRequest platformPaymentConfiguration(PlatformPaymentConfiguration platformPaymentConfiguration) {
    this.platformPaymentConfiguration = platformPaymentConfiguration;
    return this;
  }

   /**
   * Get platformPaymentConfiguration
   * @return platformPaymentConfiguration
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLATFORM_PAYMENT_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PlatformPaymentConfiguration getPlatformPaymentConfiguration() {
    return platformPaymentConfiguration;
  }


 /**
  * platformPaymentConfiguration
  *
  * @param platformPaymentConfiguration
  */ 
  @JsonProperty(JSON_PROPERTY_PLATFORM_PAYMENT_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatformPaymentConfiguration(PlatformPaymentConfiguration platformPaymentConfiguration) {
    this.platformPaymentConfiguration = platformPaymentConfiguration;
  }


  public BalanceAccountUpdateRequest reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Your reference to the balance account, maximum 150 characters.
   * @return reference
  **/
  @ApiModelProperty(value = "Your reference to the balance account, maximum 150 characters.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


 /**
  * Your reference to the balance account, maximum 150 characters.
  *
  * @param reference
  */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  public BalanceAccountUpdateRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the balance account. Payment instruments linked to the balance account can only be used if the balance account status is **active**.  Possible values: **active**, **inactive**, **closed**, **suspended**.
   * @return status
  **/
  @ApiModelProperty(value = "The status of the balance account. Payment instruments linked to the balance account can only be used if the balance account status is **active**.  Possible values: **active**, **inactive**, **closed**, **suspended**.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


 /**
  * The status of the balance account. Payment instruments linked to the balance account can only be used if the balance account status is **active**.  Possible values: **active**, **inactive**, **closed**, **suspended**.
  *
  * @param status
  */ 
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public BalanceAccountUpdateRequest timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * The time zone of the balance account. For example, **Europe/Amsterdam**. Defaults to the time zone of the account holder if no time zone is set. For possible values, see the [list of time zone codes](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).
   * @return timeZone
  **/
  @ApiModelProperty(value = "The time zone of the balance account. For example, **Europe/Amsterdam**. Defaults to the time zone of the account holder if no time zone is set. For possible values, see the [list of time zone codes](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).")
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZone() {
    return timeZone;
  }


 /**
  * The time zone of the balance account. For example, **Europe/Amsterdam**. Defaults to the time zone of the account holder if no time zone is set. For possible values, see the [list of time zone codes](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).
  *
  * @param timeZone
  */ 
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  /**
   * Return true if this BalanceAccountUpdateRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceAccountUpdateRequest balanceAccountUpdateRequest = (BalanceAccountUpdateRequest) o;
    return Objects.equals(this.accountHolderId, balanceAccountUpdateRequest.accountHolderId) &&
        Objects.equals(this.description, balanceAccountUpdateRequest.description) &&
        Objects.equals(this.metadata, balanceAccountUpdateRequest.metadata) &&
        Objects.equals(this.platformPaymentConfiguration, balanceAccountUpdateRequest.platformPaymentConfiguration) &&
        Objects.equals(this.reference, balanceAccountUpdateRequest.reference) &&
        Objects.equals(this.status, balanceAccountUpdateRequest.status) &&
        Objects.equals(this.timeZone, balanceAccountUpdateRequest.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolderId, description, metadata, platformPaymentConfiguration, reference, status, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceAccountUpdateRequest {\n");
    sb.append("    accountHolderId: ").append(toIndentedString(accountHolderId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    platformPaymentConfiguration: ").append(toIndentedString(platformPaymentConfiguration)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
   * Create an instance of BalanceAccountUpdateRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BalanceAccountUpdateRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to BalanceAccountUpdateRequest
   */
  public static BalanceAccountUpdateRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, BalanceAccountUpdateRequest.class);
  }
/**
  * Convert an instance of BalanceAccountUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

