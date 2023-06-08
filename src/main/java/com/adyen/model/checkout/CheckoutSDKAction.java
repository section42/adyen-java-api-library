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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.adyen.service.JSON;


/**
 * CheckoutSDKAction
 */
@JsonPropertyOrder({
  CheckoutSDKAction.JSON_PROPERTY_PAYMENT_DATA,
  CheckoutSDKAction.JSON_PROPERTY_PAYMENT_METHOD_TYPE,
  CheckoutSDKAction.JSON_PROPERTY_SDK_DATA,
  CheckoutSDKAction.JSON_PROPERTY_TYPE,
  CheckoutSDKAction.JSON_PROPERTY_URL
})

public class CheckoutSDKAction {
  public static final String JSON_PROPERTY_PAYMENT_DATA = "paymentData";
  private String paymentData;

  public static final String JSON_PROPERTY_PAYMENT_METHOD_TYPE = "paymentMethodType";
  private String paymentMethodType;

  public static final String JSON_PROPERTY_SDK_DATA = "sdkData";
  private Map<String, String> sdkData = null;

  /**
   * The type of the action.
   */
  public enum TypeEnum {
    SDK("sdk"),
    
    WECHATPAYSDK("wechatpaySDK");

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

  public CheckoutSDKAction() { 
  }

  public CheckoutSDKAction paymentData(String paymentData) {
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


  public CheckoutSDKAction paymentMethodType(String paymentMethodType) {
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


  public CheckoutSDKAction sdkData(Map<String, String> sdkData) {
    this.sdkData = sdkData;
    return this;
  }

  public CheckoutSDKAction putSdkDataItem(String key, String sdkDataItem) {
    if (this.sdkData == null) {
      this.sdkData = new HashMap<>();
    }
    this.sdkData.put(key, sdkDataItem);
    return this;
  }

   /**
   * The data to pass to the SDK.
   * @return sdkData
  **/
  @ApiModelProperty(value = "The data to pass to the SDK.")
  @JsonProperty(JSON_PROPERTY_SDK_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getSdkData() {
    return sdkData;
  }


  @JsonProperty(JSON_PROPERTY_SDK_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSdkData(Map<String, String> sdkData) {
    this.sdkData = sdkData;
  }


  public CheckoutSDKAction type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the action.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the action.")
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


  public CheckoutSDKAction url(String url) {
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
   * Return true if this CheckoutSDKAction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutSDKAction checkoutSDKAction = (CheckoutSDKAction) o;
    return Objects.equals(this.paymentData, checkoutSDKAction.paymentData) &&
        Objects.equals(this.paymentMethodType, checkoutSDKAction.paymentMethodType) &&
        Objects.equals(this.sdkData, checkoutSDKAction.sdkData) &&
        Objects.equals(this.type, checkoutSDKAction.type) &&
        Objects.equals(this.url, checkoutSDKAction.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentData, paymentMethodType, sdkData, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutSDKAction {\n");
    sb.append("    paymentData: ").append(toIndentedString(paymentData)).append("\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    sdkData: ").append(toIndentedString(sdkData)).append("\n");
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
   * Create an instance of CheckoutSDKAction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CheckoutSDKAction
   * @throws JsonProcessingException if the JSON string is invalid with respect to CheckoutSDKAction
   */
  public static CheckoutSDKAction fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CheckoutSDKAction.class);
  }
/**
  * Convert an instance of CheckoutSDKAction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

