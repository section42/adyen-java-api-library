/*
 * Configuration webhooks
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.configurationwebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.configurationwebhooks.CardOrderItemDeliveryStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * CardOrderItem
 */
@JsonPropertyOrder({
  CardOrderItem.JSON_PROPERTY_BALANCE_PLATFORM,
  CardOrderItem.JSON_PROPERTY_CARD,
  CardOrderItem.JSON_PROPERTY_CARD_ORDER_ITEM_ID,
  CardOrderItem.JSON_PROPERTY_CREATION_DATE,
  CardOrderItem.JSON_PROPERTY_ID,
  CardOrderItem.JSON_PROPERTY_PAYMENT_INSTRUMENT_ID,
  CardOrderItem.JSON_PROPERTY_PIN,
  CardOrderItem.JSON_PROPERTY_SHIPPING_METHOD
})

public class CardOrderItem {
  public static final String JSON_PROPERTY_BALANCE_PLATFORM = "balancePlatform";
  private String balancePlatform;

  public static final String JSON_PROPERTY_CARD = "card";
  private CardOrderItemDeliveryStatus card;

  public static final String JSON_PROPERTY_CARD_ORDER_ITEM_ID = "cardOrderItemId";
  private String cardOrderItemId;

  public static final String JSON_PROPERTY_CREATION_DATE = "creationDate";
  private OffsetDateTime creationDate;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PAYMENT_INSTRUMENT_ID = "paymentInstrumentId";
  private String paymentInstrumentId;

  public static final String JSON_PROPERTY_PIN = "pin";
  private CardOrderItemDeliveryStatus pin;

  public static final String JSON_PROPERTY_SHIPPING_METHOD = "shippingMethod";
  private String shippingMethod;

  public CardOrderItem() { 
  }

  public CardOrderItem balancePlatform(String balancePlatform) {
    this.balancePlatform = balancePlatform;
    return this;
  }

   /**
   * The unique identifier of the balance platform.
   * @return balancePlatform
  **/
  @ApiModelProperty(value = "The unique identifier of the balance platform.")
  @JsonProperty(JSON_PROPERTY_BALANCE_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalancePlatform() {
    return balancePlatform;
  }


 /**
  * The unique identifier of the balance platform.
  *
  * @param balancePlatform
  */ 
  @JsonProperty(JSON_PROPERTY_BALANCE_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalancePlatform(String balancePlatform) {
    this.balancePlatform = balancePlatform;
  }


  public CardOrderItem card(CardOrderItemDeliveryStatus card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CardOrderItemDeliveryStatus getCard() {
    return card;
  }


 /**
  * card
  *
  * @param card
  */ 
  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCard(CardOrderItemDeliveryStatus card) {
    this.card = card;
  }


  public CardOrderItem cardOrderItemId(String cardOrderItemId) {
    this.cardOrderItemId = cardOrderItemId;
    return this;
  }

   /**
   * The unique identifier of the card order item.
   * @return cardOrderItemId
  **/
  @ApiModelProperty(value = "The unique identifier of the card order item.")
  @JsonProperty(JSON_PROPERTY_CARD_ORDER_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardOrderItemId() {
    return cardOrderItemId;
  }


 /**
  * The unique identifier of the card order item.
  *
  * @param cardOrderItemId
  */ 
  @JsonProperty(JSON_PROPERTY_CARD_ORDER_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardOrderItemId(String cardOrderItemId) {
    this.cardOrderItemId = cardOrderItemId;
  }


  public CardOrderItem creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * The date and time when the event was triggered, in ISO 8601 extended format. For example, **2020-12-18T10:15:30+01:00**.
   * @return creationDate
  **/
  @ApiModelProperty(value = "The date and time when the event was triggered, in ISO 8601 extended format. For example, **2020-12-18T10:15:30+01:00**.")
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


 /**
  * The date and time when the event was triggered, in ISO 8601 extended format. For example, **2020-12-18T10:15:30+01:00**.
  *
  * @param creationDate
  */ 
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public CardOrderItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the resource.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


 /**
  * The ID of the resource.
  *
  * @param id
  */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public CardOrderItem paymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
    return this;
  }

   /**
   * The unique identifier of the payment instrument related to the card order item.
   * @return paymentInstrumentId
  **/
  @ApiModelProperty(value = "The unique identifier of the payment instrument related to the card order item.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentInstrumentId() {
    return paymentInstrumentId;
  }


 /**
  * The unique identifier of the payment instrument related to the card order item.
  *
  * @param paymentInstrumentId
  */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
  }


  public CardOrderItem pin(CardOrderItemDeliveryStatus pin) {
    this.pin = pin;
    return this;
  }

   /**
   * Get pin
   * @return pin
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CardOrderItemDeliveryStatus getPin() {
    return pin;
  }


 /**
  * pin
  *
  * @param pin
  */ 
  @JsonProperty(JSON_PROPERTY_PIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPin(CardOrderItemDeliveryStatus pin) {
    this.pin = pin;
  }


  public CardOrderItem shippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
    return this;
  }

   /**
   * Shipping method used to deliver the card or the PIN.
   * @return shippingMethod
  **/
  @ApiModelProperty(value = "Shipping method used to deliver the card or the PIN.")
  @JsonProperty(JSON_PROPERTY_SHIPPING_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShippingMethod() {
    return shippingMethod;
  }


 /**
  * Shipping method used to deliver the card or the PIN.
  *
  * @param shippingMethod
  */ 
  @JsonProperty(JSON_PROPERTY_SHIPPING_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
  }


  /**
   * Return true if this CardOrderItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardOrderItem cardOrderItem = (CardOrderItem) o;
    return Objects.equals(this.balancePlatform, cardOrderItem.balancePlatform) &&
        Objects.equals(this.card, cardOrderItem.card) &&
        Objects.equals(this.cardOrderItemId, cardOrderItem.cardOrderItemId) &&
        Objects.equals(this.creationDate, cardOrderItem.creationDate) &&
        Objects.equals(this.id, cardOrderItem.id) &&
        Objects.equals(this.paymentInstrumentId, cardOrderItem.paymentInstrumentId) &&
        Objects.equals(this.pin, cardOrderItem.pin) &&
        Objects.equals(this.shippingMethod, cardOrderItem.shippingMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balancePlatform, card, cardOrderItemId, creationDate, id, paymentInstrumentId, pin, shippingMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardOrderItem {\n");
    sb.append("    balancePlatform: ").append(toIndentedString(balancePlatform)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    cardOrderItemId: ").append(toIndentedString(cardOrderItemId)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentInstrumentId: ").append(toIndentedString(paymentInstrumentId)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    shippingMethod: ").append(toIndentedString(shippingMethod)).append("\n");
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
   * Create an instance of CardOrderItem given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CardOrderItem
   * @throws JsonProcessingException if the JSON string is invalid with respect to CardOrderItem
   */
  public static CardOrderItem fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CardOrderItem.class);
  }
/**
  * Convert an instance of CardOrderItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

