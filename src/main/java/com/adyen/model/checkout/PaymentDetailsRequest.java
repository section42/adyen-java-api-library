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
import com.adyen.model.checkout.DetailsRequestAuthenticationData;
import com.adyen.model.checkout.PaymentCompletionDetails;
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
 * PaymentDetailsRequest
 */
@JsonPropertyOrder({
  PaymentDetailsRequest.JSON_PROPERTY_AUTHENTICATION_DATA,
  PaymentDetailsRequest.JSON_PROPERTY_DETAILS,
  PaymentDetailsRequest.JSON_PROPERTY_PAYMENT_DATA,
  PaymentDetailsRequest.JSON_PROPERTY_THREE_D_S_AUTHENTICATION_ONLY
})

public class PaymentDetailsRequest {
  public static final String JSON_PROPERTY_AUTHENTICATION_DATA = "authenticationData";
  private DetailsRequestAuthenticationData authenticationData;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private PaymentCompletionDetails details;

  public static final String JSON_PROPERTY_PAYMENT_DATA = "paymentData";
  private String paymentData;

  public static final String JSON_PROPERTY_THREE_D_S_AUTHENTICATION_ONLY = "threeDSAuthenticationOnly";
  @Deprecated
  private Boolean threeDSAuthenticationOnly;

  public PaymentDetailsRequest() { 
  }

  public PaymentDetailsRequest authenticationData(DetailsRequestAuthenticationData authenticationData) {
    this.authenticationData = authenticationData;
    return this;
  }

   /**
   * Get authenticationData
   * @return authenticationData
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DetailsRequestAuthenticationData getAuthenticationData() {
    return authenticationData;
  }


 /**
  * authenticationData
  *
  * @param authenticationData
  */ 
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthenticationData(DetailsRequestAuthenticationData authenticationData) {
    this.authenticationData = authenticationData;
  }


  public PaymentDetailsRequest details(PaymentCompletionDetails details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentCompletionDetails getDetails() {
    return details;
  }


 /**
  * details
  *
  * @param details
  */ 
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetails(PaymentCompletionDetails details) {
    this.details = details;
  }


  public PaymentDetailsRequest paymentData(String paymentData) {
    this.paymentData = paymentData;
    return this;
  }

   /**
   * Encoded payment data. For [authorizing a payment after using 3D Secure 2 Authentication-only](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only/#authorise-the-payment-with-adyen):  If you received &#x60;resultCode&#x60;: **AuthenticationNotRequired** in the &#x60;/payments&#x60; response, use the &#x60;threeDSPaymentData&#x60; from the same response.  If you received &#x60;resultCode&#x60;: **AuthenticationFinished** in the &#x60;/payments&#x60; response, use the &#x60;action.paymentData&#x60; from the same response.
   * @return paymentData
  **/
  @ApiModelProperty(value = "Encoded payment data. For [authorizing a payment after using 3D Secure 2 Authentication-only](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only/#authorise-the-payment-with-adyen):  If you received `resultCode`: **AuthenticationNotRequired** in the `/payments` response, use the `threeDSPaymentData` from the same response.  If you received `resultCode`: **AuthenticationFinished** in the `/payments` response, use the `action.paymentData` from the same response.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentData() {
    return paymentData;
  }


 /**
  * Encoded payment data. For [authorizing a payment after using 3D Secure 2 Authentication-only](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only/#authorise-the-payment-with-adyen):  If you received &#x60;resultCode&#x60;: **AuthenticationNotRequired** in the &#x60;/payments&#x60; response, use the &#x60;threeDSPaymentData&#x60; from the same response.  If you received &#x60;resultCode&#x60;: **AuthenticationFinished** in the &#x60;/payments&#x60; response, use the &#x60;action.paymentData&#x60; from the same response.
  *
  * @param paymentData
  */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentData(String paymentData) {
    this.paymentData = paymentData;
  }


  @Deprecated
  public PaymentDetailsRequest threeDSAuthenticationOnly(Boolean threeDSAuthenticationOnly) {
    this.threeDSAuthenticationOnly = threeDSAuthenticationOnly;
    return this;
  }

   /**
   * Change the &#x60;authenticationOnly&#x60; indicator originally set in the &#x60;/payments&#x60; request. Only needs to be set if you want to modify the value set previously.
   * @return threeDSAuthenticationOnly
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "Change the `authenticationOnly` indicator originally set in the `/payments` request. Only needs to be set if you want to modify the value set previously.")
  @JsonProperty(JSON_PROPERTY_THREE_D_S_AUTHENTICATION_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getThreeDSAuthenticationOnly() {
    return threeDSAuthenticationOnly;
  }


 /**
  * Change the &#x60;authenticationOnly&#x60; indicator originally set in the &#x60;/payments&#x60; request. Only needs to be set if you want to modify the value set previously.
  *
  * @param threeDSAuthenticationOnly
  */ 
  @Deprecated
  @JsonProperty(JSON_PROPERTY_THREE_D_S_AUTHENTICATION_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDSAuthenticationOnly(Boolean threeDSAuthenticationOnly) {
    this.threeDSAuthenticationOnly = threeDSAuthenticationOnly;
  }


  /**
   * Return true if this PaymentDetailsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentDetailsRequest paymentDetailsRequest = (PaymentDetailsRequest) o;
    return Objects.equals(this.authenticationData, paymentDetailsRequest.authenticationData) &&
        Objects.equals(this.details, paymentDetailsRequest.details) &&
        Objects.equals(this.paymentData, paymentDetailsRequest.paymentData) &&
        Objects.equals(this.threeDSAuthenticationOnly, paymentDetailsRequest.threeDSAuthenticationOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationData, details, paymentData, threeDSAuthenticationOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDetailsRequest {\n");
    sb.append("    authenticationData: ").append(toIndentedString(authenticationData)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    paymentData: ").append(toIndentedString(paymentData)).append("\n");
    sb.append("    threeDSAuthenticationOnly: ").append(toIndentedString(threeDSAuthenticationOnly)).append("\n");
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
   * Create an instance of PaymentDetailsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentDetailsRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaymentDetailsRequest
   */
  public static PaymentDetailsRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaymentDetailsRequest.class);
  }
/**
  * Convert an instance of PaymentDetailsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

