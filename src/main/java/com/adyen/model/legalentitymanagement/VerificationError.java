/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.legalentitymanagement.RemediatingAction;
import com.adyen.model.legalentitymanagement.VerificationErrorRecursive;
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
 * VerificationError
 */
@JsonPropertyOrder({
  VerificationError.JSON_PROPERTY_CAPABILITIES,
  VerificationError.JSON_PROPERTY_CODE,
  VerificationError.JSON_PROPERTY_MESSAGE,
  VerificationError.JSON_PROPERTY_REMEDIATING_ACTIONS,
  VerificationError.JSON_PROPERTY_SUB_ERRORS,
  VerificationError.JSON_PROPERTY_TYPE
})

public class VerificationError {
  /**
   * Gets or Sets capabilities
   */
  public enum CapabilitiesEnum {
    ACCEPTEXTERNALFUNDING("acceptExternalFunding"),
    
    ACCEPTPSPFUNDING("acceptPspFunding"),
    
    ACCEPTTRANSACTIONINRESTRICTEDCOUNTRIES("acceptTransactionInRestrictedCountries"),
    
    ACCEPTTRANSACTIONINRESTRICTEDCOUNTRIESCOMMERCIAL("acceptTransactionInRestrictedCountriesCommercial"),
    
    ACCEPTTRANSACTIONINRESTRICTEDCOUNTRIESCONSUMER("acceptTransactionInRestrictedCountriesConsumer"),
    
    ACCEPTTRANSACTIONINRESTRICTEDINDUSTRIES("acceptTransactionInRestrictedIndustries"),
    
    ACCEPTTRANSACTIONINRESTRICTEDINDUSTRIESCOMMERCIAL("acceptTransactionInRestrictedIndustriesCommercial"),
    
    ACCEPTTRANSACTIONINRESTRICTEDINDUSTRIESCONSUMER("acceptTransactionInRestrictedIndustriesConsumer"),
    
    ACQUIRING("acquiring"),
    
    ATMWITHDRAWAL("atmWithdrawal"),
    
    ATMWITHDRAWALCOMMERCIAL("atmWithdrawalCommercial"),
    
    ATMWITHDRAWALCONSUMER("atmWithdrawalConsumer"),
    
    ATMWITHDRAWALINRESTRICTEDCOUNTRIES("atmWithdrawalInRestrictedCountries"),
    
    ATMWITHDRAWALINRESTRICTEDCOUNTRIESCOMMERCIAL("atmWithdrawalInRestrictedCountriesCommercial"),
    
    ATMWITHDRAWALINRESTRICTEDCOUNTRIESCONSUMER("atmWithdrawalInRestrictedCountriesConsumer"),
    
    AUTHORISEDPAYMENTINSTRUMENTUSER("authorisedPaymentInstrumentUser"),
    
    GETGRANTOFFERS("getGrantOffers"),
    
    ISSUEBANKACCOUNT("issueBankAccount"),
    
    ISSUECARD("issueCard"),
    
    ISSUECARDCOMMERCIAL("issueCardCommercial"),
    
    ISSUECARDCONSUMER("issueCardConsumer"),
    
    LOCALACCEPTANCE("localAcceptance"),
    
    PAYOUT("payout"),
    
    PAYOUTTOTRANSFERINSTRUMENT("payoutToTransferInstrument"),
    
    PROCESSING("processing"),
    
    RECEIVEFROMBALANCEACCOUNT("receiveFromBalanceAccount"),
    
    RECEIVEFROMPLATFORMPAYMENTS("receiveFromPlatformPayments"),
    
    RECEIVEFROMTHIRDPARTY("receiveFromThirdParty"),
    
    RECEIVEFROMTRANSFERINSTRUMENT("receiveFromTransferInstrument"),
    
    RECEIVEGRANTS("receiveGrants"),
    
    RECEIVEPAYMENTS("receivePayments"),
    
    SENDTOBALANCEACCOUNT("sendToBalanceAccount"),
    
    SENDTOTHIRDPARTY("sendToThirdParty"),
    
    SENDTOTRANSFERINSTRUMENT("sendToTransferInstrument"),
    
    THIRDPARTYFUNDING("thirdPartyFunding"),
    
    USECARD("useCard"),
    
    USECARDCOMMERCIAL("useCardCommercial"),
    
    USECARDCONSUMER("useCardConsumer"),
    
    USECARDINRESTRICTEDCOUNTRIES("useCardInRestrictedCountries"),
    
    USECARDINRESTRICTEDCOUNTRIESCOMMERCIAL("useCardInRestrictedCountriesCommercial"),
    
    USECARDINRESTRICTEDCOUNTRIESCONSUMER("useCardInRestrictedCountriesConsumer"),
    
    USECARDINRESTRICTEDINDUSTRIES("useCardInRestrictedIndustries"),
    
    USECARDINRESTRICTEDINDUSTRIESCOMMERCIAL("useCardInRestrictedIndustriesCommercial"),
    
    USECARDINRESTRICTEDINDUSTRIESCONSUMER("useCardInRestrictedIndustriesConsumer"),
    
    WITHDRAWFROMATM("withdrawFromAtm"),
    
    WITHDRAWFROMATMCOMMERCIAL("withdrawFromAtmCommercial"),
    
    WITHDRAWFROMATMCONSUMER("withdrawFromAtmConsumer"),
    
    WITHDRAWFROMATMINRESTRICTEDCOUNTRIES("withdrawFromAtmInRestrictedCountries"),
    
    WITHDRAWFROMATMINRESTRICTEDCOUNTRIESCOMMERCIAL("withdrawFromAtmInRestrictedCountriesCommercial"),
    
    WITHDRAWFROMATMINRESTRICTEDCOUNTRIESCONSUMER("withdrawFromAtmInRestrictedCountriesConsumer");

    private String value;

    CapabilitiesEnum(String value) {
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
    public static CapabilitiesEnum fromValue(String value) {
      for (CapabilitiesEnum b : CapabilitiesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CAPABILITIES = "capabilities";
  private List<CapabilitiesEnum> capabilities = null;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_REMEDIATING_ACTIONS = "remediatingActions";
  private List<RemediatingAction> remediatingActions = null;

  public static final String JSON_PROPERTY_SUB_ERRORS = "subErrors";
  private List<VerificationErrorRecursive> subErrors = null;

  /**
   * The type of error.
   */
  public enum TypeEnum {
    DATAMISSING("dataMissing"),
    
    DATAREVIEW("dataReview"),
    
    INVALIDINPUT("invalidInput"),
    
    PENDINGSTATUS("pendingStatus"),
    
    REJECTED("rejected");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public VerificationError() { 
  }

  public VerificationError capabilities(List<CapabilitiesEnum> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public VerificationError addCapabilitiesItem(CapabilitiesEnum capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new ArrayList<>();
    }
    this.capabilities.add(capabilitiesItem);
    return this;
  }

   /**
   * Contains key-value pairs that specify the actions that the legal entity can do in your platform. The key is a capability required for your integration. For example, **issueCard** for Issuing.The value is an object containing the settings for the capability.
   * @return capabilities
  **/
  @ApiModelProperty(value = "Contains key-value pairs that specify the actions that the legal entity can do in your platform. The key is a capability required for your integration. For example, **issueCard** for Issuing.The value is an object containing the settings for the capability.")
  @JsonProperty(JSON_PROPERTY_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CapabilitiesEnum> getCapabilities() {
    return capabilities;
  }


 /**
  * Contains key-value pairs that specify the actions that the legal entity can do in your platform. The key is a capability required for your integration. For example, **issueCard** for Issuing.The value is an object containing the settings for the capability.
  *
  * @param capabilities
  */ 
  @JsonProperty(JSON_PROPERTY_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapabilities(List<CapabilitiesEnum> capabilities) {
    this.capabilities = capabilities;
  }


  public VerificationError code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The general error code.
   * @return code
  **/
  @ApiModelProperty(value = "The general error code.")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


 /**
  * The general error code.
  *
  * @param code
  */ 
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public VerificationError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The general error message.
   * @return message
  **/
  @ApiModelProperty(value = "The general error message.")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


 /**
  * The general error message.
  *
  * @param message
  */ 
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public VerificationError remediatingActions(List<RemediatingAction> remediatingActions) {
    this.remediatingActions = remediatingActions;
    return this;
  }

  public VerificationError addRemediatingActionsItem(RemediatingAction remediatingActionsItem) {
    if (this.remediatingActions == null) {
      this.remediatingActions = new ArrayList<>();
    }
    this.remediatingActions.add(remediatingActionsItem);
    return this;
  }

   /**
   * An object containing possible solutions to fix a verification error.
   * @return remediatingActions
  **/
  @ApiModelProperty(value = "An object containing possible solutions to fix a verification error.")
  @JsonProperty(JSON_PROPERTY_REMEDIATING_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RemediatingAction> getRemediatingActions() {
    return remediatingActions;
  }


 /**
  * An object containing possible solutions to fix a verification error.
  *
  * @param remediatingActions
  */ 
  @JsonProperty(JSON_PROPERTY_REMEDIATING_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemediatingActions(List<RemediatingAction> remediatingActions) {
    this.remediatingActions = remediatingActions;
  }


  public VerificationError subErrors(List<VerificationErrorRecursive> subErrors) {
    this.subErrors = subErrors;
    return this;
  }

  public VerificationError addSubErrorsItem(VerificationErrorRecursive subErrorsItem) {
    if (this.subErrors == null) {
      this.subErrors = new ArrayList<>();
    }
    this.subErrors.add(subErrorsItem);
    return this;
  }

   /**
   * An array containing more granular information about the cause of the verification error.
   * @return subErrors
  **/
  @ApiModelProperty(value = "An array containing more granular information about the cause of the verification error.")
  @JsonProperty(JSON_PROPERTY_SUB_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<VerificationErrorRecursive> getSubErrors() {
    return subErrors;
  }


 /**
  * An array containing more granular information about the cause of the verification error.
  *
  * @param subErrors
  */ 
  @JsonProperty(JSON_PROPERTY_SUB_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubErrors(List<VerificationErrorRecursive> subErrors) {
    this.subErrors = subErrors;
  }


  public VerificationError type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of error.
   * @return type
  **/
  @ApiModelProperty(value = "The type of error.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


 /**
  * The type of error.
  *
  * @param type
  */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this VerificationError object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationError verificationError = (VerificationError) o;
    return Objects.equals(this.capabilities, verificationError.capabilities) &&
        Objects.equals(this.code, verificationError.code) &&
        Objects.equals(this.message, verificationError.message) &&
        Objects.equals(this.remediatingActions, verificationError.remediatingActions) &&
        Objects.equals(this.subErrors, verificationError.subErrors) &&
        Objects.equals(this.type, verificationError.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilities, code, message, remediatingActions, subErrors, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationError {\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    remediatingActions: ").append(toIndentedString(remediatingActions)).append("\n");
    sb.append("    subErrors: ").append(toIndentedString(subErrors)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
   * Create an instance of VerificationError given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VerificationError
   * @throws JsonProcessingException if the JSON string is invalid with respect to VerificationError
   */
  public static VerificationError fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, VerificationError.class);
  }
/**
  * Convert an instance of VerificationError to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

