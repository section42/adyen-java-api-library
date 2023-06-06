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
import com.adyen.model.checkout.RecurringDetail;
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
 * PaymentSetupResponse
 */
@JsonPropertyOrder({
  PaymentSetupResponse.JSON_PROPERTY_PAYMENT_SESSION,
  PaymentSetupResponse.JSON_PROPERTY_RECURRING_DETAILS
})

public class PaymentSetupResponse {
  public static final String JSON_PROPERTY_PAYMENT_SESSION = "paymentSession";
  private String paymentSession;

  public static final String JSON_PROPERTY_RECURRING_DETAILS = "recurringDetails";
  private List<RecurringDetail> recurringDetails = null;

  public PaymentSetupResponse() { 
  }

  public PaymentSetupResponse paymentSession(String paymentSession) {
    this.paymentSession = paymentSession;
    return this;
  }

   /**
   * The encoded payment session that you need to pass to the SDK.
   * @return paymentSession
  **/
  @ApiModelProperty(value = "The encoded payment session that you need to pass to the SDK.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_SESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentSession() {
    return paymentSession;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_SESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentSession(String paymentSession) {
    this.paymentSession = paymentSession;
  }


  public PaymentSetupResponse recurringDetails(List<RecurringDetail> recurringDetails) {
    this.recurringDetails = recurringDetails;
    return this;
  }

  public PaymentSetupResponse addRecurringDetailsItem(RecurringDetail recurringDetailsItem) {
    if (this.recurringDetails == null) {
      this.recurringDetails = new ArrayList<>();
    }
    this.recurringDetails.add(recurringDetailsItem);
    return this;
  }

   /**
   * The detailed list of stored payment details required to generate payment forms. Will be empty if oneClick is set to false in the request.
   * @return recurringDetails
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "The detailed list of stored payment details required to generate payment forms. Will be empty if oneClick is set to false in the request.")
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RecurringDetail> getRecurringDetails() {
    return recurringDetails;
  }


  @JsonProperty(JSON_PROPERTY_RECURRING_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringDetails(List<RecurringDetail> recurringDetails) {
    this.recurringDetails = recurringDetails;
  }


  /**
   * Return true if this PaymentSetupResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSetupResponse paymentSetupResponse = (PaymentSetupResponse) o;
    return Objects.equals(this.paymentSession, paymentSetupResponse.paymentSession) &&
        Objects.equals(this.recurringDetails, paymentSetupResponse.recurringDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentSession, recurringDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSetupResponse {\n");
    sb.append("    paymentSession: ").append(toIndentedString(paymentSession)).append("\n");
    sb.append("    recurringDetails: ").append(toIndentedString(recurringDetails)).append("\n");
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
   * Create an instance of PaymentSetupResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentSetupResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaymentSetupResponse
   */
  public static PaymentSetupResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaymentSetupResponse.class);
  }
/**
  * Convert an instance of PaymentSetupResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

