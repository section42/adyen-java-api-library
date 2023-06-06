/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * Contact: developer-experience@adyen.com
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
 * PaymentVerificationRequest
 */
@JsonPropertyOrder({
  PaymentVerificationRequest.JSON_PROPERTY_PAYLOAD
})

public class PaymentVerificationRequest {
  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private String payload;

  public PaymentVerificationRequest() { 
  }

  public PaymentVerificationRequest payload(String payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Encrypted and signed payment result data. You should receive this value from the Checkout SDK after the shopper completes the payment.
   * @return payload
  **/
  @ApiModelProperty(required = true, value = "Encrypted and signed payment result data. You should receive this value from the Checkout SDK after the shopper completes the payment.")
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPayload() {
    return payload;
  }


  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayload(String payload) {
    this.payload = payload;
  }


  /**
   * Return true if this PaymentVerificationRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentVerificationRequest paymentVerificationRequest = (PaymentVerificationRequest) o;
    return Objects.equals(this.payload, paymentVerificationRequest.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentVerificationRequest {\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
   * Create an instance of PaymentVerificationRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentVerificationRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaymentVerificationRequest
   */
  public static PaymentVerificationRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaymentVerificationRequest.class);
  }
/**
  * Convert an instance of PaymentVerificationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

