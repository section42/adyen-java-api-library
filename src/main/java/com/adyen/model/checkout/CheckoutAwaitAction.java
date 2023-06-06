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
 * CheckoutAwaitAction
 */
@JsonPropertyOrder({
  CheckoutAwaitAction.JSON_PROPERTY_PAYMENT_DATA,
  CheckoutAwaitAction.JSON_PROPERTY_PAYMENT_METHOD_TYPE,
  CheckoutAwaitAction.JSON_PROPERTY_TYPE,
  CheckoutAwaitAction.JSON_PROPERTY_URL
})

public class CheckoutAwaitAction {
  public static final String JSON_PROPERTY_PAYMENT_DATA = "paymentData";
  private String paymentData;

  public static final String JSON_PROPERTY_PAYMENT_METHOD_TYPE = "paymentMethodType";
  private String paymentMethodType;

  /**
   * **await**
   */
  public enum TypeEnum {
    AWAIT("await");

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

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public CheckoutAwaitAction() { 
  }

  public CheckoutAwaitAction paymentData(String paymentData) {
    this.paymentData = paymentData;
    return this;
  }

   /**
   * A value that must be submitted to the &#x60;/payments/details&#x60; endpoint to verify this payment.
   * @return paymentData
  **/
  @ApiModelProperty(value = "A value that must be submitted to the `/payments/details` endpoint to verify this payment.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentData() {
    return paymentData;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentData(String paymentData) {
    this.paymentData = paymentData;
  }


  public CheckoutAwaitAction paymentMethodType(String paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
    return this;
  }

   /**
   * Specifies the payment method.
   * @return paymentMethodType
  **/
  @ApiModelProperty(value = "Specifies the payment method.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentMethodType() {
    return paymentMethodType;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethodType(String paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }


  public CheckoutAwaitAction type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **await**
   * @return type
  **/
  @ApiModelProperty(required = true, value = "**await**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CheckoutAwaitAction url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Specifies the URL to redirect to.
   * @return url
  **/
  @ApiModelProperty(value = "Specifies the URL to redirect to.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Return true if this CheckoutAwaitAction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutAwaitAction checkoutAwaitAction = (CheckoutAwaitAction) o;
    return Objects.equals(this.paymentData, checkoutAwaitAction.paymentData) &&
        Objects.equals(this.paymentMethodType, checkoutAwaitAction.paymentMethodType) &&
        Objects.equals(this.type, checkoutAwaitAction.type) &&
        Objects.equals(this.url, checkoutAwaitAction.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentData, paymentMethodType, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutAwaitAction {\n");
    sb.append("    paymentData: ").append(toIndentedString(paymentData)).append("\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
   * Create an instance of CheckoutAwaitAction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CheckoutAwaitAction
   * @throws JsonProcessingException if the JSON string is invalid with respect to CheckoutAwaitAction
   */
  public static CheckoutAwaitAction fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CheckoutAwaitAction.class);
  }
/**
  * Convert an instance of CheckoutAwaitAction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

