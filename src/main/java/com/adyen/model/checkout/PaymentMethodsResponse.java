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
import com.adyen.model.checkout.PaymentMethod;
import com.adyen.model.checkout.StoredPaymentMethod;
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
 * PaymentMethodsResponse
 */
@JsonPropertyOrder({
  PaymentMethodsResponse.JSON_PROPERTY_PAYMENT_METHODS,
  PaymentMethodsResponse.JSON_PROPERTY_STORED_PAYMENT_METHODS
})

public class PaymentMethodsResponse {
  public static final String JSON_PROPERTY_PAYMENT_METHODS = "paymentMethods";
  private List<PaymentMethod> paymentMethods = null;

  public static final String JSON_PROPERTY_STORED_PAYMENT_METHODS = "storedPaymentMethods";
  private List<StoredPaymentMethod> storedPaymentMethods = null;

  public PaymentMethodsResponse() { 
  }

  public PaymentMethodsResponse paymentMethods(List<PaymentMethod> paymentMethods) {
    this.paymentMethods = paymentMethods;
    return this;
  }

  public PaymentMethodsResponse addPaymentMethodsItem(PaymentMethod paymentMethodsItem) {
    if (this.paymentMethods == null) {
      this.paymentMethods = new ArrayList<>();
    }
    this.paymentMethods.add(paymentMethodsItem);
    return this;
  }

   /**
   * Detailed list of payment methods required to generate payment forms.
   * @return paymentMethods
  **/
  @ApiModelProperty(value = "Detailed list of payment methods required to generate payment forms.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PaymentMethod> getPaymentMethods() {
    return paymentMethods;
  }


 /**
  * Detailed list of payment methods required to generate payment forms.
  *
  * @param paymentMethods
  */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }


  public PaymentMethodsResponse storedPaymentMethods(List<StoredPaymentMethod> storedPaymentMethods) {
    this.storedPaymentMethods = storedPaymentMethods;
    return this;
  }

  public PaymentMethodsResponse addStoredPaymentMethodsItem(StoredPaymentMethod storedPaymentMethodsItem) {
    if (this.storedPaymentMethods == null) {
      this.storedPaymentMethods = new ArrayList<>();
    }
    this.storedPaymentMethods.add(storedPaymentMethodsItem);
    return this;
  }

   /**
   * List of all stored payment methods.
   * @return storedPaymentMethods
  **/
  @ApiModelProperty(value = "List of all stored payment methods.")
  @JsonProperty(JSON_PROPERTY_STORED_PAYMENT_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<StoredPaymentMethod> getStoredPaymentMethods() {
    return storedPaymentMethods;
  }


 /**
  * List of all stored payment methods.
  *
  * @param storedPaymentMethods
  */ 
  @JsonProperty(JSON_PROPERTY_STORED_PAYMENT_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoredPaymentMethods(List<StoredPaymentMethod> storedPaymentMethods) {
    this.storedPaymentMethods = storedPaymentMethods;
  }


  /**
   * Return true if this PaymentMethodsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodsResponse paymentMethodsResponse = (PaymentMethodsResponse) o;
    return Objects.equals(this.paymentMethods, paymentMethodsResponse.paymentMethods) &&
        Objects.equals(this.storedPaymentMethods, paymentMethodsResponse.storedPaymentMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethods, storedPaymentMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodsResponse {\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
    sb.append("    storedPaymentMethods: ").append(toIndentedString(storedPaymentMethods)).append("\n");
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
   * Create an instance of PaymentMethodsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentMethodsResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaymentMethodsResponse
   */
  public static PaymentMethodsResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaymentMethodsResponse.class);
  }
/**
  * Convert an instance of PaymentMethodsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

