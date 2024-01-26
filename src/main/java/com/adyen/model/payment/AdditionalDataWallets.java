/*
 * Adyen Payment API
 * A set of API endpoints that allow you to initiate, settle, and modify payments on the Adyen payments platform. You can use the API to accept card payments (including One-Click and 3D Secure), bank transfers, ewallets, and many other payment methods.  To learn more about the API, visit [Classic integration](https://docs.adyen.com/classic-integration).  ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning Payments API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/Payment/v68/authorise ```  ## Going live  To authenticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/Payment/v68/authorise ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payment;

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
 * AdditionalDataWallets
 */
@JsonPropertyOrder({
  AdditionalDataWallets.JSON_PROPERTY_ANDROIDPAY_TOKEN,
  AdditionalDataWallets.JSON_PROPERTY_MASTERPASS_TRANSACTION_ID,
  AdditionalDataWallets.JSON_PROPERTY_PAYMENT_TOKEN,
  AdditionalDataWallets.JSON_PROPERTY_PAYWITHGOOGLE_TOKEN,
  AdditionalDataWallets.JSON_PROPERTY_SAMSUNGPAY_TOKEN,
  AdditionalDataWallets.JSON_PROPERTY_VISACHECKOUT_CALL_ID
})

public class AdditionalDataWallets {
  public static final String JSON_PROPERTY_ANDROIDPAY_TOKEN = "androidpay.token";
  private String androidpayToken;

  public static final String JSON_PROPERTY_MASTERPASS_TRANSACTION_ID = "masterpass.transactionId";
  private String masterpassTransactionId;

  public static final String JSON_PROPERTY_PAYMENT_TOKEN = "payment.token";
  private String paymentToken;

  public static final String JSON_PROPERTY_PAYWITHGOOGLE_TOKEN = "paywithgoogle.token";
  private String paywithgoogleToken;

  public static final String JSON_PROPERTY_SAMSUNGPAY_TOKEN = "samsungpay.token";
  private String samsungpayToken;

  public static final String JSON_PROPERTY_VISACHECKOUT_CALL_ID = "visacheckout.callId";
  private String visacheckoutCallId;

  public AdditionalDataWallets() { 
  }

  public AdditionalDataWallets androidpayToken(String androidpayToken) {
    this.androidpayToken = androidpayToken;
    return this;
  }

   /**
   * The Android Pay token retrieved from the SDK.
   * @return androidpayToken
  **/
  @ApiModelProperty(value = "The Android Pay token retrieved from the SDK.")
  @JsonProperty(JSON_PROPERTY_ANDROIDPAY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAndroidpayToken() {
    return androidpayToken;
  }


 /**
  * The Android Pay token retrieved from the SDK.
  *
  * @param androidpayToken
  */ 
  @JsonProperty(JSON_PROPERTY_ANDROIDPAY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAndroidpayToken(String androidpayToken) {
    this.androidpayToken = androidpayToken;
  }


  public AdditionalDataWallets masterpassTransactionId(String masterpassTransactionId) {
    this.masterpassTransactionId = masterpassTransactionId;
    return this;
  }

   /**
   * The Mastercard Masterpass Transaction ID retrieved from the SDK.
   * @return masterpassTransactionId
  **/
  @ApiModelProperty(value = "The Mastercard Masterpass Transaction ID retrieved from the SDK.")
  @JsonProperty(JSON_PROPERTY_MASTERPASS_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMasterpassTransactionId() {
    return masterpassTransactionId;
  }


 /**
  * The Mastercard Masterpass Transaction ID retrieved from the SDK.
  *
  * @param masterpassTransactionId
  */ 
  @JsonProperty(JSON_PROPERTY_MASTERPASS_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMasterpassTransactionId(String masterpassTransactionId) {
    this.masterpassTransactionId = masterpassTransactionId;
  }


  public AdditionalDataWallets paymentToken(String paymentToken) {
    this.paymentToken = paymentToken;
    return this;
  }

   /**
   * The Apple Pay token retrieved from the SDK.
   * @return paymentToken
  **/
  @ApiModelProperty(value = "The Apple Pay token retrieved from the SDK.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentToken() {
    return paymentToken;
  }


 /**
  * The Apple Pay token retrieved from the SDK.
  *
  * @param paymentToken
  */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentToken(String paymentToken) {
    this.paymentToken = paymentToken;
  }


  public AdditionalDataWallets paywithgoogleToken(String paywithgoogleToken) {
    this.paywithgoogleToken = paywithgoogleToken;
    return this;
  }

   /**
   * The Google Pay token retrieved from the SDK.
   * @return paywithgoogleToken
  **/
  @ApiModelProperty(value = "The Google Pay token retrieved from the SDK.")
  @JsonProperty(JSON_PROPERTY_PAYWITHGOOGLE_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaywithgoogleToken() {
    return paywithgoogleToken;
  }


 /**
  * The Google Pay token retrieved from the SDK.
  *
  * @param paywithgoogleToken
  */ 
  @JsonProperty(JSON_PROPERTY_PAYWITHGOOGLE_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaywithgoogleToken(String paywithgoogleToken) {
    this.paywithgoogleToken = paywithgoogleToken;
  }


  public AdditionalDataWallets samsungpayToken(String samsungpayToken) {
    this.samsungpayToken = samsungpayToken;
    return this;
  }

   /**
   * The Samsung Pay token retrieved from the SDK.
   * @return samsungpayToken
  **/
  @ApiModelProperty(value = "The Samsung Pay token retrieved from the SDK.")
  @JsonProperty(JSON_PROPERTY_SAMSUNGPAY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSamsungpayToken() {
    return samsungpayToken;
  }


 /**
  * The Samsung Pay token retrieved from the SDK.
  *
  * @param samsungpayToken
  */ 
  @JsonProperty(JSON_PROPERTY_SAMSUNGPAY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSamsungpayToken(String samsungpayToken) {
    this.samsungpayToken = samsungpayToken;
  }


  public AdditionalDataWallets visacheckoutCallId(String visacheckoutCallId) {
    this.visacheckoutCallId = visacheckoutCallId;
    return this;
  }

   /**
   * The Visa Checkout Call ID retrieved from the SDK.
   * @return visacheckoutCallId
  **/
  @ApiModelProperty(value = "The Visa Checkout Call ID retrieved from the SDK.")
  @JsonProperty(JSON_PROPERTY_VISACHECKOUT_CALL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVisacheckoutCallId() {
    return visacheckoutCallId;
  }


 /**
  * The Visa Checkout Call ID retrieved from the SDK.
  *
  * @param visacheckoutCallId
  */ 
  @JsonProperty(JSON_PROPERTY_VISACHECKOUT_CALL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisacheckoutCallId(String visacheckoutCallId) {
    this.visacheckoutCallId = visacheckoutCallId;
  }


  /**
   * Return true if this AdditionalDataWallets object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalDataWallets additionalDataWallets = (AdditionalDataWallets) o;
    return Objects.equals(this.androidpayToken, additionalDataWallets.androidpayToken) &&
        Objects.equals(this.masterpassTransactionId, additionalDataWallets.masterpassTransactionId) &&
        Objects.equals(this.paymentToken, additionalDataWallets.paymentToken) &&
        Objects.equals(this.paywithgoogleToken, additionalDataWallets.paywithgoogleToken) &&
        Objects.equals(this.samsungpayToken, additionalDataWallets.samsungpayToken) &&
        Objects.equals(this.visacheckoutCallId, additionalDataWallets.visacheckoutCallId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidpayToken, masterpassTransactionId, paymentToken, paywithgoogleToken, samsungpayToken, visacheckoutCallId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalDataWallets {\n");
    sb.append("    androidpayToken: ").append(toIndentedString(androidpayToken)).append("\n");
    sb.append("    masterpassTransactionId: ").append(toIndentedString(masterpassTransactionId)).append("\n");
    sb.append("    paymentToken: ").append(toIndentedString(paymentToken)).append("\n");
    sb.append("    paywithgoogleToken: ").append(toIndentedString(paywithgoogleToken)).append("\n");
    sb.append("    samsungpayToken: ").append(toIndentedString(samsungpayToken)).append("\n");
    sb.append("    visacheckoutCallId: ").append(toIndentedString(visacheckoutCallId)).append("\n");
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
   * Create an instance of AdditionalDataWallets given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdditionalDataWallets
   * @throws JsonProcessingException if the JSON string is invalid with respect to AdditionalDataWallets
   */
  public static AdditionalDataWallets fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AdditionalDataWallets.class);
  }
/**
  * Convert an instance of AdditionalDataWallets to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

