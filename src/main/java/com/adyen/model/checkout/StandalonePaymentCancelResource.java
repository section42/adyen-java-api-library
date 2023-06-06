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
 * StandalonePaymentCancelResource
 */
@JsonPropertyOrder({
  StandalonePaymentCancelResource.JSON_PROPERTY_MERCHANT_ACCOUNT,
  StandalonePaymentCancelResource.JSON_PROPERTY_PAYMENT_REFERENCE,
  StandalonePaymentCancelResource.JSON_PROPERTY_PSP_REFERENCE,
  StandalonePaymentCancelResource.JSON_PROPERTY_REFERENCE,
  StandalonePaymentCancelResource.JSON_PROPERTY_STATUS
})

public class StandalonePaymentCancelResource {
  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  private String merchantAccount;

  public static final String JSON_PROPERTY_PAYMENT_REFERENCE = "paymentReference";
  private String paymentReference;

  public static final String JSON_PROPERTY_PSP_REFERENCE = "pspReference";
  private String pspReference;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  /**
   * The status of your request. This will always have the value **received**.
   */
  public enum StatusEnum {
    RECEIVED("received");

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

  public StandalonePaymentCancelResource() { 
  }

  public StandalonePaymentCancelResource merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account that is used to process the payment.
   * @return merchantAccount
  **/
  @ApiModelProperty(required = true, value = "The merchant account that is used to process the payment.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMerchantAccount() {
    return merchantAccount;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public StandalonePaymentCancelResource paymentReference(String paymentReference) {
    this.paymentReference = paymentReference;
    return this;
  }

   /**
   * The [&#x60;reference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__reqParam_reference) of the payment to cancel.
   * @return paymentReference
  **/
  @ApiModelProperty(required = true, value = "The [`reference`](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__reqParam_reference) of the payment to cancel.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPaymentReference() {
    return paymentReference;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentReference(String paymentReference) {
    this.paymentReference = paymentReference;
  }


  public StandalonePaymentCancelResource pspReference(String pspReference) {
    this.pspReference = pspReference;
    return this;
  }

   /**
   * Adyen&#39;s 16-character reference associated with the cancel request.
   * @return pspReference
  **/
  @ApiModelProperty(required = true, value = "Adyen's 16-character reference associated with the cancel request.")
  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPspReference() {
    return pspReference;
  }


  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }


  public StandalonePaymentCancelResource reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the cancel request.
   * @return reference
  **/
  @ApiModelProperty(value = "Your reference for the cancel request.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  public StandalonePaymentCancelResource status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of your request. This will always have the value **received**.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of your request. This will always have the value **received**.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Return true if this StandalonePaymentCancelResource object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandalonePaymentCancelResource standalonePaymentCancelResource = (StandalonePaymentCancelResource) o;
    return Objects.equals(this.merchantAccount, standalonePaymentCancelResource.merchantAccount) &&
        Objects.equals(this.paymentReference, standalonePaymentCancelResource.paymentReference) &&
        Objects.equals(this.pspReference, standalonePaymentCancelResource.pspReference) &&
        Objects.equals(this.reference, standalonePaymentCancelResource.reference) &&
        Objects.equals(this.status, standalonePaymentCancelResource.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantAccount, paymentReference, pspReference, reference, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandalonePaymentCancelResource {\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    paymentReference: ").append(toIndentedString(paymentReference)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
   * Create an instance of StandalonePaymentCancelResource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StandalonePaymentCancelResource
   * @throws JsonProcessingException if the JSON string is invalid with respect to StandalonePaymentCancelResource
   */
  public static StandalonePaymentCancelResource fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, StandalonePaymentCancelResource.class);
  }
/**
  * Convert an instance of StandalonePaymentCancelResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

