/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.balanceplatform.Authentication;
import com.adyen.model.balanceplatform.CardConfiguration;
import com.adyen.model.balanceplatform.DeliveryContact;
import com.adyen.model.balanceplatform.Expiry;
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
 * Card
 */
@JsonPropertyOrder({
  Card.JSON_PROPERTY_AUTHENTICATION,
  Card.JSON_PROPERTY_BIN,
  Card.JSON_PROPERTY_BRAND,
  Card.JSON_PROPERTY_BRAND_VARIANT,
  Card.JSON_PROPERTY_CARDHOLDER_NAME,
  Card.JSON_PROPERTY_CONFIGURATION,
  Card.JSON_PROPERTY_CVC,
  Card.JSON_PROPERTY_DELIVERY_CONTACT,
  Card.JSON_PROPERTY_EXPIRATION,
  Card.JSON_PROPERTY_FORM_FACTOR,
  Card.JSON_PROPERTY_LAST_FOUR,
  Card.JSON_PROPERTY_NUMBER,
  Card.JSON_PROPERTY_THREE_D_SECURE
})

public class Card {
  public static final String JSON_PROPERTY_AUTHENTICATION = "authentication";
  private Authentication authentication;

  public static final String JSON_PROPERTY_BIN = "bin";
  private String bin;

  public static final String JSON_PROPERTY_BRAND = "brand";
  private String brand;

  public static final String JSON_PROPERTY_BRAND_VARIANT = "brandVariant";
  private String brandVariant;

  public static final String JSON_PROPERTY_CARDHOLDER_NAME = "cardholderName";
  private String cardholderName;

  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  private CardConfiguration configuration;

  public static final String JSON_PROPERTY_CVC = "cvc";
  private String cvc;

  public static final String JSON_PROPERTY_DELIVERY_CONTACT = "deliveryContact";
  private DeliveryContact deliveryContact;

  public static final String JSON_PROPERTY_EXPIRATION = "expiration";
  private Expiry expiration;

  /**
   * The form factor of the card. Possible values: **virtual**, **physical**.
   */
  public enum FormFactorEnum {
    PHYSICAL("physical"),
    
    UNKNOWN("unknown"),
    
    VIRTUAL("virtual");

    private String value;

    FormFactorEnum(String value) {
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
    public static FormFactorEnum fromValue(String value) {
      for (FormFactorEnum b : FormFactorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FORM_FACTOR = "formFactor";
  private FormFactorEnum formFactor;

  public static final String JSON_PROPERTY_LAST_FOUR = "lastFour";
  private String lastFour;

  public static final String JSON_PROPERTY_NUMBER = "number";
  private String number;

  public static final String JSON_PROPERTY_THREE_D_SECURE = "threeDSecure";
  private String threeDSecure;

  public Card() { 
  }

  public Card authentication(Authentication authentication) {
    this.authentication = authentication;
    return this;
  }

   /**
   * Get authentication
   * @return authentication
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Authentication getAuthentication() {
    return authentication;
  }


  @JsonProperty(JSON_PROPERTY_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthentication(Authentication authentication) {
    this.authentication = authentication;
  }


  public Card bin(String bin) {
    this.bin = bin;
    return this;
  }

   /**
   * The bank identification number (BIN) of the card number.
   * @return bin
  **/
  @ApiModelProperty(value = "The bank identification number (BIN) of the card number.")
  @JsonProperty(JSON_PROPERTY_BIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBin() {
    return bin;
  }


  @JsonProperty(JSON_PROPERTY_BIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBin(String bin) {
    this.bin = bin;
  }


  public Card brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * The brand of the physical or the virtual card. Possible values: **visa**, **mc**.
   * @return brand
  **/
  @ApiModelProperty(required = true, value = "The brand of the physical or the virtual card. Possible values: **visa**, **mc**.")
  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrand() {
    return brand;
  }


  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrand(String brand) {
    this.brand = brand;
  }


  public Card brandVariant(String brandVariant) {
    this.brandVariant = brandVariant;
    return this;
  }

   /**
   * The brand variant of the physical or the virtual card. For example, **visadebit** or **mcprepaid**. &gt;Reach out to your Adyen contact to get the values relevant for your integration.
   * @return brandVariant
  **/
  @ApiModelProperty(required = true, value = "The brand variant of the physical or the virtual card. For example, **visadebit** or **mcprepaid**. >Reach out to your Adyen contact to get the values relevant for your integration.")
  @JsonProperty(JSON_PROPERTY_BRAND_VARIANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrandVariant() {
    return brandVariant;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_VARIANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrandVariant(String brandVariant) {
    this.brandVariant = brandVariant;
  }


  public Card cardholderName(String cardholderName) {
    this.cardholderName = cardholderName;
    return this;
  }

   /**
   * The name of the cardholder.  Maximum length: 26 characters.
   * @return cardholderName
  **/
  @ApiModelProperty(required = true, value = "The name of the cardholder.  Maximum length: 26 characters.")
  @JsonProperty(JSON_PROPERTY_CARDHOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardholderName() {
    return cardholderName;
  }


  @JsonProperty(JSON_PROPERTY_CARDHOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardholderName(String cardholderName) {
    this.cardholderName = cardholderName;
  }


  public Card configuration(CardConfiguration configuration) {
    this.configuration = configuration;
    return this;
  }

   /**
   * Get configuration
   * @return configuration
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CardConfiguration getConfiguration() {
    return configuration;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfiguration(CardConfiguration configuration) {
    this.configuration = configuration;
  }


  public Card cvc(String cvc) {
    this.cvc = cvc;
    return this;
  }

   /**
   * The CVC2 value of the card. &gt; The CVC2 is not sent by default. This is only returned in the &#x60;POST&#x60; response for single-use virtual cards.
   * @return cvc
  **/
  @ApiModelProperty(value = "The CVC2 value of the card. > The CVC2 is not sent by default. This is only returned in the `POST` response for single-use virtual cards.")
  @JsonProperty(JSON_PROPERTY_CVC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCvc() {
    return cvc;
  }


  @JsonProperty(JSON_PROPERTY_CVC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCvc(String cvc) {
    this.cvc = cvc;
  }


  public Card deliveryContact(DeliveryContact deliveryContact) {
    this.deliveryContact = deliveryContact;
    return this;
  }

   /**
   * Get deliveryContact
   * @return deliveryContact
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELIVERY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DeliveryContact getDeliveryContact() {
    return deliveryContact;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryContact(DeliveryContact deliveryContact) {
    this.deliveryContact = deliveryContact;
  }


  public Card expiration(Expiry expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * Get expiration
   * @return expiration
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Expiry getExpiration() {
    return expiration;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiration(Expiry expiration) {
    this.expiration = expiration;
  }


  public Card formFactor(FormFactorEnum formFactor) {
    this.formFactor = formFactor;
    return this;
  }

   /**
   * The form factor of the card. Possible values: **virtual**, **physical**.
   * @return formFactor
  **/
  @ApiModelProperty(required = true, value = "The form factor of the card. Possible values: **virtual**, **physical**.")
  @JsonProperty(JSON_PROPERTY_FORM_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FormFactorEnum getFormFactor() {
    return formFactor;
  }


  @JsonProperty(JSON_PROPERTY_FORM_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormFactor(FormFactorEnum formFactor) {
    this.formFactor = formFactor;
  }


  public Card lastFour(String lastFour) {
    this.lastFour = lastFour;
    return this;
  }

   /**
   * Last last four digits of the card number.
   * @return lastFour
  **/
  @ApiModelProperty(value = "Last last four digits of the card number.")
  @JsonProperty(JSON_PROPERTY_LAST_FOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastFour() {
    return lastFour;
  }


  @JsonProperty(JSON_PROPERTY_LAST_FOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastFour(String lastFour) {
    this.lastFour = lastFour;
  }


  public Card number(String number) {
    this.number = number;
    return this;
  }

   /**
   * The primary account number (PAN) of the card. &gt; The PAN is masked by default and returned only for single-use virtual cards.
   * @return number
  **/
  @ApiModelProperty(required = true, value = "The primary account number (PAN) of the card. > The PAN is masked by default and returned only for single-use virtual cards.")
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNumber() {
    return number;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumber(String number) {
    this.number = number;
  }


  public Card threeDSecure(String threeDSecure) {
    this.threeDSecure = threeDSecure;
    return this;
  }

   /**
   * Allocates a specific product range for either a physical or a virtual card. Possible values: **fullySupported**, **secureCorporate**. &gt;Reach out to your Adyen contact to get the values relevant for your integration.
   * @return threeDSecure
  **/
  @ApiModelProperty(value = "Allocates a specific product range for either a physical or a virtual card. Possible values: **fullySupported**, **secureCorporate**. >Reach out to your Adyen contact to get the values relevant for your integration.")
  @JsonProperty(JSON_PROPERTY_THREE_D_SECURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThreeDSecure() {
    return threeDSecure;
  }


  @JsonProperty(JSON_PROPERTY_THREE_D_SECURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDSecure(String threeDSecure) {
    this.threeDSecure = threeDSecure;
  }


  /**
   * Return true if this Card object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return Objects.equals(this.authentication, card.authentication) &&
        Objects.equals(this.bin, card.bin) &&
        Objects.equals(this.brand, card.brand) &&
        Objects.equals(this.brandVariant, card.brandVariant) &&
        Objects.equals(this.cardholderName, card.cardholderName) &&
        Objects.equals(this.configuration, card.configuration) &&
        Objects.equals(this.cvc, card.cvc) &&
        Objects.equals(this.deliveryContact, card.deliveryContact) &&
        Objects.equals(this.expiration, card.expiration) &&
        Objects.equals(this.formFactor, card.formFactor) &&
        Objects.equals(this.lastFour, card.lastFour) &&
        Objects.equals(this.number, card.number) &&
        Objects.equals(this.threeDSecure, card.threeDSecure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication, bin, brand, brandVariant, cardholderName, configuration, cvc, deliveryContact, expiration, formFactor, lastFour, number, threeDSecure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    brandVariant: ").append(toIndentedString(brandVariant)).append("\n");
    sb.append("    cardholderName: ").append(toIndentedString(cardholderName)).append("\n");
    sb.append("    configuration: ").append(toIndentedString(configuration)).append("\n");
    sb.append("    cvc: ").append(toIndentedString(cvc)).append("\n");
    sb.append("    deliveryContact: ").append(toIndentedString(deliveryContact)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    formFactor: ").append(toIndentedString(formFactor)).append("\n");
    sb.append("    lastFour: ").append(toIndentedString(lastFour)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    threeDSecure: ").append(toIndentedString(threeDSecure)).append("\n");
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
   * Create an instance of Card given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Card
   * @throws JsonProcessingException if the JSON string is invalid with respect to Card
   */
  public static Card fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Card.class);
  }
/**
  * Convert an instance of Card to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

