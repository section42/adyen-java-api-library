/*
 * Adyen Recurring API
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.recurring;

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
 * NotifyShopperResult
 */
@JsonPropertyOrder({
  NotifyShopperResult.JSON_PROPERTY_DISPLAYED_REFERENCE,
  NotifyShopperResult.JSON_PROPERTY_MESSAGE,
  NotifyShopperResult.JSON_PROPERTY_PSP_REFERENCE,
  NotifyShopperResult.JSON_PROPERTY_REFERENCE,
  NotifyShopperResult.JSON_PROPERTY_RESULT_CODE,
  NotifyShopperResult.JSON_PROPERTY_SHOPPER_NOTIFICATION_REFERENCE,
  NotifyShopperResult.JSON_PROPERTY_STORED_PAYMENT_METHOD_ID
})

public class NotifyShopperResult {
  public static final String JSON_PROPERTY_DISPLAYED_REFERENCE = "displayedReference";
  private String displayedReference;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_PSP_REFERENCE = "pspReference";
  private String pspReference;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_RESULT_CODE = "resultCode";
  private String resultCode;

  public static final String JSON_PROPERTY_SHOPPER_NOTIFICATION_REFERENCE = "shopperNotificationReference";
  private String shopperNotificationReference;

  public static final String JSON_PROPERTY_STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
  private String storedPaymentMethodId;

  public NotifyShopperResult() { 
  }

  public NotifyShopperResult displayedReference(String displayedReference) {
    this.displayedReference = displayedReference;
    return this;
  }

   /**
   * Reference of Pre-debit notification that is displayed to the shopper
   * @return displayedReference
  **/
  @ApiModelProperty(value = "Reference of Pre-debit notification that is displayed to the shopper")
  @JsonProperty(JSON_PROPERTY_DISPLAYED_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayedReference() {
    return displayedReference;
  }


 /**
  * Reference of Pre-debit notification that is displayed to the shopper
  *
  * @param displayedReference
  */ 
  @JsonProperty(JSON_PROPERTY_DISPLAYED_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayedReference(String displayedReference) {
    this.displayedReference = displayedReference;
  }


  public NotifyShopperResult message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A simple description of the &#x60;resultCode&#x60;.
   * @return message
  **/
  @ApiModelProperty(value = "A simple description of the `resultCode`.")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


 /**
  * A simple description of the &#x60;resultCode&#x60;.
  *
  * @param message
  */ 
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public NotifyShopperResult pspReference(String pspReference) {
    this.pspReference = pspReference;
    return this;
  }

   /**
   * The unique reference that is associated with the request.
   * @return pspReference
  **/
  @ApiModelProperty(value = "The unique reference that is associated with the request.")
  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPspReference() {
    return pspReference;
  }


 /**
  * The unique reference that is associated with the request.
  *
  * @param pspReference
  */ 
  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }


  public NotifyShopperResult reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Reference of Pre-debit notification sent in my the merchant
   * @return reference
  **/
  @ApiModelProperty(value = "Reference of Pre-debit notification sent in my the merchant")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


 /**
  * Reference of Pre-debit notification sent in my the merchant
  *
  * @param reference
  */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  public NotifyShopperResult resultCode(String resultCode) {
    this.resultCode = resultCode;
    return this;
  }

   /**
   * The code indicating the status of notification.
   * @return resultCode
  **/
  @ApiModelProperty(value = "The code indicating the status of notification.")
  @JsonProperty(JSON_PROPERTY_RESULT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResultCode() {
    return resultCode;
  }


 /**
  * The code indicating the status of notification.
  *
  * @param resultCode
  */ 
  @JsonProperty(JSON_PROPERTY_RESULT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }


  public NotifyShopperResult shopperNotificationReference(String shopperNotificationReference) {
    this.shopperNotificationReference = shopperNotificationReference;
    return this;
  }

   /**
   * The unique reference for the request sent downstream.
   * @return shopperNotificationReference
  **/
  @ApiModelProperty(value = "The unique reference for the request sent downstream.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_NOTIFICATION_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShopperNotificationReference() {
    return shopperNotificationReference;
  }


 /**
  * The unique reference for the request sent downstream.
  *
  * @param shopperNotificationReference
  */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_NOTIFICATION_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperNotificationReference(String shopperNotificationReference) {
    this.shopperNotificationReference = shopperNotificationReference;
  }


  public NotifyShopperResult storedPaymentMethodId(String storedPaymentMethodId) {
    this.storedPaymentMethodId = storedPaymentMethodId;
    return this;
  }

   /**
   * This is the recurringDetailReference returned in the response when token was created
   * @return storedPaymentMethodId
  **/
  @ApiModelProperty(value = "This is the recurringDetailReference returned in the response when token was created")
  @JsonProperty(JSON_PROPERTY_STORED_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStoredPaymentMethodId() {
    return storedPaymentMethodId;
  }


 /**
  * This is the recurringDetailReference returned in the response when token was created
  *
  * @param storedPaymentMethodId
  */ 
  @JsonProperty(JSON_PROPERTY_STORED_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoredPaymentMethodId(String storedPaymentMethodId) {
    this.storedPaymentMethodId = storedPaymentMethodId;
  }


  /**
   * Return true if this NotifyShopperResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotifyShopperResult notifyShopperResult = (NotifyShopperResult) o;
    return Objects.equals(this.displayedReference, notifyShopperResult.displayedReference) &&
        Objects.equals(this.message, notifyShopperResult.message) &&
        Objects.equals(this.pspReference, notifyShopperResult.pspReference) &&
        Objects.equals(this.reference, notifyShopperResult.reference) &&
        Objects.equals(this.resultCode, notifyShopperResult.resultCode) &&
        Objects.equals(this.shopperNotificationReference, notifyShopperResult.shopperNotificationReference) &&
        Objects.equals(this.storedPaymentMethodId, notifyShopperResult.storedPaymentMethodId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayedReference, message, pspReference, reference, resultCode, shopperNotificationReference, storedPaymentMethodId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotifyShopperResult {\n");
    sb.append("    displayedReference: ").append(toIndentedString(displayedReference)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    shopperNotificationReference: ").append(toIndentedString(shopperNotificationReference)).append("\n");
    sb.append("    storedPaymentMethodId: ").append(toIndentedString(storedPaymentMethodId)).append("\n");
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
   * Create an instance of NotifyShopperResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NotifyShopperResult
   * @throws JsonProcessingException if the JSON string is invalid with respect to NotifyShopperResult
   */
  public static NotifyShopperResult fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, NotifyShopperResult.class);
  }
/**
  * Convert an instance of NotifyShopperResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

