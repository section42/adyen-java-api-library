/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 71
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * AdditionalDataRiskStandalone
 */
@JsonPropertyOrder({
  AdditionalDataRiskStandalone.JSON_PROPERTY_PAY_PAL_COUNTRY_CODE,
  AdditionalDataRiskStandalone.JSON_PROPERTY_PAY_PAL_EMAIL_ID,
  AdditionalDataRiskStandalone.JSON_PROPERTY_PAY_PAL_FIRST_NAME,
  AdditionalDataRiskStandalone.JSON_PROPERTY_PAY_PAL_LAST_NAME,
  AdditionalDataRiskStandalone.JSON_PROPERTY_PAY_PAL_PAYER_ID,
  AdditionalDataRiskStandalone.JSON_PROPERTY_PAY_PAL_PHONE,
  AdditionalDataRiskStandalone.JSON_PROPERTY_PAY_PAL_PROTECTION_ELIGIBILITY,
  AdditionalDataRiskStandalone.JSON_PROPERTY_PAY_PAL_TRANSACTION_ID,
  AdditionalDataRiskStandalone.JSON_PROPERTY_AVS_RESULT_RAW,
  AdditionalDataRiskStandalone.JSON_PROPERTY_BIN,
  AdditionalDataRiskStandalone.JSON_PROPERTY_CVC_RESULT_RAW,
  AdditionalDataRiskStandalone.JSON_PROPERTY_RISK_TOKEN,
  AdditionalDataRiskStandalone.JSON_PROPERTY_THREE_D_AUTHENTICATED,
  AdditionalDataRiskStandalone.JSON_PROPERTY_THREE_D_OFFERED,
  AdditionalDataRiskStandalone.JSON_PROPERTY_TOKEN_DATA_TYPE
})

public class AdditionalDataRiskStandalone {
  public static final String JSON_PROPERTY_PAY_PAL_COUNTRY_CODE = "PayPal.CountryCode";
  private String payPalCountryCode;

  public static final String JSON_PROPERTY_PAY_PAL_EMAIL_ID = "PayPal.EmailId";
  private String payPalEmailId;

  public static final String JSON_PROPERTY_PAY_PAL_FIRST_NAME = "PayPal.FirstName";
  private String payPalFirstName;

  public static final String JSON_PROPERTY_PAY_PAL_LAST_NAME = "PayPal.LastName";
  private String payPalLastName;

  public static final String JSON_PROPERTY_PAY_PAL_PAYER_ID = "PayPal.PayerId";
  private String payPalPayerId;

  public static final String JSON_PROPERTY_PAY_PAL_PHONE = "PayPal.Phone";
  private String payPalPhone;

  public static final String JSON_PROPERTY_PAY_PAL_PROTECTION_ELIGIBILITY = "PayPal.ProtectionEligibility";
  private String payPalProtectionEligibility;

  public static final String JSON_PROPERTY_PAY_PAL_TRANSACTION_ID = "PayPal.TransactionId";
  private String payPalTransactionId;

  public static final String JSON_PROPERTY_AVS_RESULT_RAW = "avsResultRaw";
  private String avsResultRaw;

  public static final String JSON_PROPERTY_BIN = "bin";
  private String bin;

  public static final String JSON_PROPERTY_CVC_RESULT_RAW = "cvcResultRaw";
  private String cvcResultRaw;

  public static final String JSON_PROPERTY_RISK_TOKEN = "riskToken";
  private String riskToken;

  public static final String JSON_PROPERTY_THREE_D_AUTHENTICATED = "threeDAuthenticated";
  private String threeDAuthenticated;

  public static final String JSON_PROPERTY_THREE_D_OFFERED = "threeDOffered";
  private String threeDOffered;

  public static final String JSON_PROPERTY_TOKEN_DATA_TYPE = "tokenDataType";
  private String tokenDataType;

  public AdditionalDataRiskStandalone() { 
  }

  public AdditionalDataRiskStandalone payPalCountryCode(String payPalCountryCode) {
    this.payPalCountryCode = payPalCountryCode;
    return this;
  }

   /**
   * Shopper&#39;s country of residence in the form of ISO standard 3166 2-character country codes.
   * @return payPalCountryCode
  **/
  @ApiModelProperty(value = "Shopper's country of residence in the form of ISO standard 3166 2-character country codes.")
  @JsonProperty(JSON_PROPERTY_PAY_PAL_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayPalCountryCode() {
    return payPalCountryCode;
  }


 /**
  * Shopper&#39;s country of residence in the form of ISO standard 3166 2-character country codes.
  *
  * @param payPalCountryCode
  */ 
  @JsonProperty(JSON_PROPERTY_PAY_PAL_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayPalCountryCode(String payPalCountryCode) {
    this.payPalCountryCode = payPalCountryCode;
  }


  public AdditionalDataRiskStandalone payPalEmailId(String payPalEmailId) {
    this.payPalEmailId = payPalEmailId;
    return this;
  }

   /**
   * Shopper&#39;s email.
   * @return payPalEmailId
  **/
  @ApiModelProperty(value = "Shopper's email.")
  @JsonProperty(JSON_PROPERTY_PAY_PAL_EMAIL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayPalEmailId() {
    return payPalEmailId;
  }


 /**
  * Shopper&#39;s email.
  *
  * @param payPalEmailId
  */ 
  @JsonProperty(JSON_PROPERTY_PAY_PAL_EMAIL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayPalEmailId(String payPalEmailId) {
    this.payPalEmailId = payPalEmailId;
  }


  public AdditionalDataRiskStandalone payPalFirstName(String payPalFirstName) {
    this.payPalFirstName = payPalFirstName;
    return this;
  }

   /**
   * Shopper&#39;s first name.
   * @return payPalFirstName
  **/
  @ApiModelProperty(value = "Shopper's first name.")
  @JsonProperty(JSON_PROPERTY_PAY_PAL_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayPalFirstName() {
    return payPalFirstName;
  }


 /**
  * Shopper&#39;s first name.
  *
  * @param payPalFirstName
  */ 
  @JsonProperty(JSON_PROPERTY_PAY_PAL_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayPalFirstName(String payPalFirstName) {
    this.payPalFirstName = payPalFirstName;
  }


  public AdditionalDataRiskStandalone payPalLastName(String payPalLastName) {
    this.payPalLastName = payPalLastName;
    return this;
  }

   /**
   * Shopper&#39;s last name.
   * @return payPalLastName
  **/
  @ApiModelProperty(value = "Shopper's last name.")
  @JsonProperty(JSON_PROPERTY_PAY_PAL_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayPalLastName() {
    return payPalLastName;
  }


 /**
  * Shopper&#39;s last name.
  *
  * @param payPalLastName
  */ 
  @JsonProperty(JSON_PROPERTY_PAY_PAL_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayPalLastName(String payPalLastName) {
    this.payPalLastName = payPalLastName;
  }


  public AdditionalDataRiskStandalone payPalPayerId(String payPalPayerId) {
    this.payPalPayerId = payPalPayerId;
    return this;
  }

   /**
   * Unique PayPal Customer Account identification number. Character length and limitations: 13 single-byte alphanumeric characters.
   * @return payPalPayerId
  **/
  @ApiModelProperty(value = "Unique PayPal Customer Account identification number. Character length and limitations: 13 single-byte alphanumeric characters.")
  @JsonProperty(JSON_PROPERTY_PAY_PAL_PAYER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayPalPayerId() {
    return payPalPayerId;
  }


 /**
  * Unique PayPal Customer Account identification number. Character length and limitations: 13 single-byte alphanumeric characters.
  *
  * @param payPalPayerId
  */ 
  @JsonProperty(JSON_PROPERTY_PAY_PAL_PAYER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayPalPayerId(String payPalPayerId) {
    this.payPalPayerId = payPalPayerId;
  }


  public AdditionalDataRiskStandalone payPalPhone(String payPalPhone) {
    this.payPalPhone = payPalPhone;
    return this;
  }

   /**
   * Shopper&#39;s phone number.
   * @return payPalPhone
  **/
  @ApiModelProperty(value = "Shopper's phone number.")
  @JsonProperty(JSON_PROPERTY_PAY_PAL_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayPalPhone() {
    return payPalPhone;
  }


 /**
  * Shopper&#39;s phone number.
  *
  * @param payPalPhone
  */ 
  @JsonProperty(JSON_PROPERTY_PAY_PAL_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayPalPhone(String payPalPhone) {
    this.payPalPhone = payPalPhone;
  }


  public AdditionalDataRiskStandalone payPalProtectionEligibility(String payPalProtectionEligibility) {
    this.payPalProtectionEligibility = payPalProtectionEligibility;
    return this;
  }

   /**
   * Allowed values: * **Eligible** — Merchant is protected by PayPal&#39;s Seller Protection Policy for Unauthorized Payments and Item Not Received.  * **PartiallyEligible** — Merchant is protected by PayPal&#39;s Seller Protection Policy for Item Not Received.  * **Ineligible** — Merchant is not protected under the Seller Protection Policy.
   * @return payPalProtectionEligibility
  **/
  @ApiModelProperty(value = "Allowed values: * **Eligible** — Merchant is protected by PayPal's Seller Protection Policy for Unauthorized Payments and Item Not Received.  * **PartiallyEligible** — Merchant is protected by PayPal's Seller Protection Policy for Item Not Received.  * **Ineligible** — Merchant is not protected under the Seller Protection Policy.")
  @JsonProperty(JSON_PROPERTY_PAY_PAL_PROTECTION_ELIGIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayPalProtectionEligibility() {
    return payPalProtectionEligibility;
  }


 /**
  * Allowed values: * **Eligible** — Merchant is protected by PayPal&#39;s Seller Protection Policy for Unauthorized Payments and Item Not Received.  * **PartiallyEligible** — Merchant is protected by PayPal&#39;s Seller Protection Policy for Item Not Received.  * **Ineligible** — Merchant is not protected under the Seller Protection Policy.
  *
  * @param payPalProtectionEligibility
  */ 
  @JsonProperty(JSON_PROPERTY_PAY_PAL_PROTECTION_ELIGIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayPalProtectionEligibility(String payPalProtectionEligibility) {
    this.payPalProtectionEligibility = payPalProtectionEligibility;
  }


  public AdditionalDataRiskStandalone payPalTransactionId(String payPalTransactionId) {
    this.payPalTransactionId = payPalTransactionId;
    return this;
  }

   /**
   * Unique transaction ID of the payment.
   * @return payPalTransactionId
  **/
  @ApiModelProperty(value = "Unique transaction ID of the payment.")
  @JsonProperty(JSON_PROPERTY_PAY_PAL_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayPalTransactionId() {
    return payPalTransactionId;
  }


 /**
  * Unique transaction ID of the payment.
  *
  * @param payPalTransactionId
  */ 
  @JsonProperty(JSON_PROPERTY_PAY_PAL_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayPalTransactionId(String payPalTransactionId) {
    this.payPalTransactionId = payPalTransactionId;
  }


  public AdditionalDataRiskStandalone avsResultRaw(String avsResultRaw) {
    this.avsResultRaw = avsResultRaw;
    return this;
  }

   /**
   * Raw AVS result received from the acquirer, where available. Example: D
   * @return avsResultRaw
  **/
  @ApiModelProperty(value = "Raw AVS result received from the acquirer, where available. Example: D")
  @JsonProperty(JSON_PROPERTY_AVS_RESULT_RAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAvsResultRaw() {
    return avsResultRaw;
  }


 /**
  * Raw AVS result received from the acquirer, where available. Example: D
  *
  * @param avsResultRaw
  */ 
  @JsonProperty(JSON_PROPERTY_AVS_RESULT_RAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvsResultRaw(String avsResultRaw) {
    this.avsResultRaw = avsResultRaw;
  }


  public AdditionalDataRiskStandalone bin(String bin) {
    this.bin = bin;
    return this;
  }

   /**
   * The Bank Identification Number of a credit card, which is the first six digits of a card number. Required for [tokenized card request](https://docs.adyen.com/risk-management/standalone-risk#tokenised-pan-request).
   * @return bin
  **/
  @ApiModelProperty(value = "The Bank Identification Number of a credit card, which is the first six digits of a card number. Required for [tokenized card request](https://docs.adyen.com/risk-management/standalone-risk#tokenised-pan-request).")
  @JsonProperty(JSON_PROPERTY_BIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBin() {
    return bin;
  }


 /**
  * The Bank Identification Number of a credit card, which is the first six digits of a card number. Required for [tokenized card request](https://docs.adyen.com/risk-management/standalone-risk#tokenised-pan-request).
  *
  * @param bin
  */ 
  @JsonProperty(JSON_PROPERTY_BIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBin(String bin) {
    this.bin = bin;
  }


  public AdditionalDataRiskStandalone cvcResultRaw(String cvcResultRaw) {
    this.cvcResultRaw = cvcResultRaw;
    return this;
  }

   /**
   * Raw CVC result received from the acquirer, where available. Example: 1
   * @return cvcResultRaw
  **/
  @ApiModelProperty(value = "Raw CVC result received from the acquirer, where available. Example: 1")
  @JsonProperty(JSON_PROPERTY_CVC_RESULT_RAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCvcResultRaw() {
    return cvcResultRaw;
  }


 /**
  * Raw CVC result received from the acquirer, where available. Example: 1
  *
  * @param cvcResultRaw
  */ 
  @JsonProperty(JSON_PROPERTY_CVC_RESULT_RAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCvcResultRaw(String cvcResultRaw) {
    this.cvcResultRaw = cvcResultRaw;
  }


  public AdditionalDataRiskStandalone riskToken(String riskToken) {
    this.riskToken = riskToken;
    return this;
  }

   /**
   * Unique identifier or token for the shopper&#39;s card details.
   * @return riskToken
  **/
  @ApiModelProperty(value = "Unique identifier or token for the shopper's card details.")
  @JsonProperty(JSON_PROPERTY_RISK_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskToken() {
    return riskToken;
  }


 /**
  * Unique identifier or token for the shopper&#39;s card details.
  *
  * @param riskToken
  */ 
  @JsonProperty(JSON_PROPERTY_RISK_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskToken(String riskToken) {
    this.riskToken = riskToken;
  }


  public AdditionalDataRiskStandalone threeDAuthenticated(String threeDAuthenticated) {
    this.threeDAuthenticated = threeDAuthenticated;
    return this;
  }

   /**
   * A Boolean value indicating whether 3DS authentication was completed on this payment. Example: true
   * @return threeDAuthenticated
  **/
  @ApiModelProperty(value = "A Boolean value indicating whether 3DS authentication was completed on this payment. Example: true")
  @JsonProperty(JSON_PROPERTY_THREE_D_AUTHENTICATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThreeDAuthenticated() {
    return threeDAuthenticated;
  }


 /**
  * A Boolean value indicating whether 3DS authentication was completed on this payment. Example: true
  *
  * @param threeDAuthenticated
  */ 
  @JsonProperty(JSON_PROPERTY_THREE_D_AUTHENTICATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDAuthenticated(String threeDAuthenticated) {
    this.threeDAuthenticated = threeDAuthenticated;
  }


  public AdditionalDataRiskStandalone threeDOffered(String threeDOffered) {
    this.threeDOffered = threeDOffered;
    return this;
  }

   /**
   * A Boolean value indicating whether 3DS was offered for this payment. Example: true
   * @return threeDOffered
  **/
  @ApiModelProperty(value = "A Boolean value indicating whether 3DS was offered for this payment. Example: true")
  @JsonProperty(JSON_PROPERTY_THREE_D_OFFERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThreeDOffered() {
    return threeDOffered;
  }


 /**
  * A Boolean value indicating whether 3DS was offered for this payment. Example: true
  *
  * @param threeDOffered
  */ 
  @JsonProperty(JSON_PROPERTY_THREE_D_OFFERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDOffered(String threeDOffered) {
    this.threeDOffered = threeDOffered;
  }


  public AdditionalDataRiskStandalone tokenDataType(String tokenDataType) {
    this.tokenDataType = tokenDataType;
    return this;
  }

   /**
   * Required for PayPal payments only. The only supported value is: **paypal**.
   * @return tokenDataType
  **/
  @ApiModelProperty(value = "Required for PayPal payments only. The only supported value is: **paypal**.")
  @JsonProperty(JSON_PROPERTY_TOKEN_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTokenDataType() {
    return tokenDataType;
  }


 /**
  * Required for PayPal payments only. The only supported value is: **paypal**.
  *
  * @param tokenDataType
  */ 
  @JsonProperty(JSON_PROPERTY_TOKEN_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenDataType(String tokenDataType) {
    this.tokenDataType = tokenDataType;
  }


  /**
   * Return true if this AdditionalDataRiskStandalone object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalDataRiskStandalone additionalDataRiskStandalone = (AdditionalDataRiskStandalone) o;
    return Objects.equals(this.payPalCountryCode, additionalDataRiskStandalone.payPalCountryCode) &&
        Objects.equals(this.payPalEmailId, additionalDataRiskStandalone.payPalEmailId) &&
        Objects.equals(this.payPalFirstName, additionalDataRiskStandalone.payPalFirstName) &&
        Objects.equals(this.payPalLastName, additionalDataRiskStandalone.payPalLastName) &&
        Objects.equals(this.payPalPayerId, additionalDataRiskStandalone.payPalPayerId) &&
        Objects.equals(this.payPalPhone, additionalDataRiskStandalone.payPalPhone) &&
        Objects.equals(this.payPalProtectionEligibility, additionalDataRiskStandalone.payPalProtectionEligibility) &&
        Objects.equals(this.payPalTransactionId, additionalDataRiskStandalone.payPalTransactionId) &&
        Objects.equals(this.avsResultRaw, additionalDataRiskStandalone.avsResultRaw) &&
        Objects.equals(this.bin, additionalDataRiskStandalone.bin) &&
        Objects.equals(this.cvcResultRaw, additionalDataRiskStandalone.cvcResultRaw) &&
        Objects.equals(this.riskToken, additionalDataRiskStandalone.riskToken) &&
        Objects.equals(this.threeDAuthenticated, additionalDataRiskStandalone.threeDAuthenticated) &&
        Objects.equals(this.threeDOffered, additionalDataRiskStandalone.threeDOffered) &&
        Objects.equals(this.tokenDataType, additionalDataRiskStandalone.tokenDataType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payPalCountryCode, payPalEmailId, payPalFirstName, payPalLastName, payPalPayerId, payPalPhone, payPalProtectionEligibility, payPalTransactionId, avsResultRaw, bin, cvcResultRaw, riskToken, threeDAuthenticated, threeDOffered, tokenDataType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalDataRiskStandalone {\n");
    sb.append("    payPalCountryCode: ").append(toIndentedString(payPalCountryCode)).append("\n");
    sb.append("    payPalEmailId: ").append(toIndentedString(payPalEmailId)).append("\n");
    sb.append("    payPalFirstName: ").append(toIndentedString(payPalFirstName)).append("\n");
    sb.append("    payPalLastName: ").append(toIndentedString(payPalLastName)).append("\n");
    sb.append("    payPalPayerId: ").append(toIndentedString(payPalPayerId)).append("\n");
    sb.append("    payPalPhone: ").append(toIndentedString(payPalPhone)).append("\n");
    sb.append("    payPalProtectionEligibility: ").append(toIndentedString(payPalProtectionEligibility)).append("\n");
    sb.append("    payPalTransactionId: ").append(toIndentedString(payPalTransactionId)).append("\n");
    sb.append("    avsResultRaw: ").append(toIndentedString(avsResultRaw)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    cvcResultRaw: ").append(toIndentedString(cvcResultRaw)).append("\n");
    sb.append("    riskToken: ").append(toIndentedString(riskToken)).append("\n");
    sb.append("    threeDAuthenticated: ").append(toIndentedString(threeDAuthenticated)).append("\n");
    sb.append("    threeDOffered: ").append(toIndentedString(threeDOffered)).append("\n");
    sb.append("    tokenDataType: ").append(toIndentedString(tokenDataType)).append("\n");
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
   * Create an instance of AdditionalDataRiskStandalone given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdditionalDataRiskStandalone
   * @throws JsonProcessingException if the JSON string is invalid with respect to AdditionalDataRiskStandalone
   */
  public static AdditionalDataRiskStandalone fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AdditionalDataRiskStandalone.class);
  }
/**
  * Convert an instance of AdditionalDataRiskStandalone to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

