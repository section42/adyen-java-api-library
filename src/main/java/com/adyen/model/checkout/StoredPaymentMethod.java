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
 * StoredPaymentMethod
 */
@JsonPropertyOrder({
  StoredPaymentMethod.JSON_PROPERTY_BANK_ACCOUNT_NUMBER,
  StoredPaymentMethod.JSON_PROPERTY_BANK_LOCATION_ID,
  StoredPaymentMethod.JSON_PROPERTY_BRAND,
  StoredPaymentMethod.JSON_PROPERTY_EXPIRY_MONTH,
  StoredPaymentMethod.JSON_PROPERTY_EXPIRY_YEAR,
  StoredPaymentMethod.JSON_PROPERTY_HOLDER_NAME,
  StoredPaymentMethod.JSON_PROPERTY_IBAN,
  StoredPaymentMethod.JSON_PROPERTY_ID,
  StoredPaymentMethod.JSON_PROPERTY_LABEL,
  StoredPaymentMethod.JSON_PROPERTY_LAST_FOUR,
  StoredPaymentMethod.JSON_PROPERTY_NAME,
  StoredPaymentMethod.JSON_PROPERTY_NETWORK_TX_REFERENCE,
  StoredPaymentMethod.JSON_PROPERTY_OWNER_NAME,
  StoredPaymentMethod.JSON_PROPERTY_SHOPPER_EMAIL,
  StoredPaymentMethod.JSON_PROPERTY_SUPPORTED_RECURRING_PROCESSING_MODELS,
  StoredPaymentMethod.JSON_PROPERTY_SUPPORTED_SHOPPER_INTERACTIONS,
  StoredPaymentMethod.JSON_PROPERTY_TYPE
})

public class StoredPaymentMethod {
  public static final String JSON_PROPERTY_BANK_ACCOUNT_NUMBER = "bankAccountNumber";
  private String bankAccountNumber;

  public static final String JSON_PROPERTY_BANK_LOCATION_ID = "bankLocationId";
  private String bankLocationId;

  public static final String JSON_PROPERTY_BRAND = "brand";
  private String brand;

  public static final String JSON_PROPERTY_EXPIRY_MONTH = "expiryMonth";
  private String expiryMonth;

  public static final String JSON_PROPERTY_EXPIRY_YEAR = "expiryYear";
  private String expiryYear;

  public static final String JSON_PROPERTY_HOLDER_NAME = "holderName";
  private String holderName;

  public static final String JSON_PROPERTY_IBAN = "iban";
  private String iban;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_LAST_FOUR = "lastFour";
  private String lastFour;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NETWORK_TX_REFERENCE = "networkTxReference";
  private String networkTxReference;

  public static final String JSON_PROPERTY_OWNER_NAME = "ownerName";
  private String ownerName;

  public static final String JSON_PROPERTY_SHOPPER_EMAIL = "shopperEmail";
  private String shopperEmail;

  public static final String JSON_PROPERTY_SUPPORTED_RECURRING_PROCESSING_MODELS = "supportedRecurringProcessingModels";
  private List<String> supportedRecurringProcessingModels = null;

  public static final String JSON_PROPERTY_SUPPORTED_SHOPPER_INTERACTIONS = "supportedShopperInteractions";
  private List<String> supportedShopperInteractions = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public StoredPaymentMethod() { 
  }

  public StoredPaymentMethod bankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
    return this;
  }

   /**
   * The bank account number (without separators).
   * @return bankAccountNumber
  **/
  @ApiModelProperty(value = "The bank account number (without separators).")
  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankAccountNumber() {
    return bankAccountNumber;
  }


 /**
  * The bank account number (without separators).
  *
  * @param bankAccountNumber
  */ 
  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
  }


  public StoredPaymentMethod bankLocationId(String bankLocationId) {
    this.bankLocationId = bankLocationId;
    return this;
  }

   /**
   * The location id of the bank. The field value is &#x60;nil&#x60; in most cases.
   * @return bankLocationId
  **/
  @ApiModelProperty(value = "The location id of the bank. The field value is `nil` in most cases.")
  @JsonProperty(JSON_PROPERTY_BANK_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankLocationId() {
    return bankLocationId;
  }


 /**
  * The location id of the bank. The field value is &#x60;nil&#x60; in most cases.
  *
  * @param bankLocationId
  */ 
  @JsonProperty(JSON_PROPERTY_BANK_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankLocationId(String bankLocationId) {
    this.bankLocationId = bankLocationId;
  }


  public StoredPaymentMethod brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * The brand of the card.
   * @return brand
  **/
  @ApiModelProperty(value = "The brand of the card.")
  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrand() {
    return brand;
  }


 /**
  * The brand of the card.
  *
  * @param brand
  */ 
  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrand(String brand) {
    this.brand = brand;
  }


  public StoredPaymentMethod expiryMonth(String expiryMonth) {
    this.expiryMonth = expiryMonth;
    return this;
  }

   /**
   * The month the card expires.
   * @return expiryMonth
  **/
  @ApiModelProperty(value = "The month the card expires.")
  @JsonProperty(JSON_PROPERTY_EXPIRY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpiryMonth() {
    return expiryMonth;
  }


 /**
  * The month the card expires.
  *
  * @param expiryMonth
  */ 
  @JsonProperty(JSON_PROPERTY_EXPIRY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiryMonth(String expiryMonth) {
    this.expiryMonth = expiryMonth;
  }


  public StoredPaymentMethod expiryYear(String expiryYear) {
    this.expiryYear = expiryYear;
    return this;
  }

   /**
   * The last two digits of the year the card expires. For example, **22** for the year 2022.
   * @return expiryYear
  **/
  @ApiModelProperty(value = "The last two digits of the year the card expires. For example, **22** for the year 2022.")
  @JsonProperty(JSON_PROPERTY_EXPIRY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpiryYear() {
    return expiryYear;
  }


 /**
  * The last two digits of the year the card expires. For example, **22** for the year 2022.
  *
  * @param expiryYear
  */ 
  @JsonProperty(JSON_PROPERTY_EXPIRY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiryYear(String expiryYear) {
    this.expiryYear = expiryYear;
  }


  public StoredPaymentMethod holderName(String holderName) {
    this.holderName = holderName;
    return this;
  }

   /**
   * The unique payment method code.
   * @return holderName
  **/
  @ApiModelProperty(value = "The unique payment method code.")
  @JsonProperty(JSON_PROPERTY_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHolderName() {
    return holderName;
  }


 /**
  * The unique payment method code.
  *
  * @param holderName
  */ 
  @JsonProperty(JSON_PROPERTY_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHolderName(String holderName) {
    this.holderName = holderName;
  }


  public StoredPaymentMethod iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * The IBAN of the bank account.
   * @return iban
  **/
  @ApiModelProperty(value = "The IBAN of the bank account.")
  @JsonProperty(JSON_PROPERTY_IBAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIban() {
    return iban;
  }


 /**
  * The IBAN of the bank account.
  *
  * @param iban
  */ 
  @JsonProperty(JSON_PROPERTY_IBAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIban(String iban) {
    this.iban = iban;
  }


  public StoredPaymentMethod id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identifier of this stored payment method.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier of this stored payment method.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


 /**
  * A unique identifier of this stored payment method.
  *
  * @param id
  */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public StoredPaymentMethod label(String label) {
    this.label = label;
    return this;
  }

   /**
   * The shopper’s issuer account label
   * @return label
  **/
  @ApiModelProperty(value = "The shopper’s issuer account label")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabel() {
    return label;
  }


 /**
  * The shopper’s issuer account label
  *
  * @param label
  */ 
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(String label) {
    this.label = label;
  }


  public StoredPaymentMethod lastFour(String lastFour) {
    this.lastFour = lastFour;
    return this;
  }

   /**
   * The last four digits of the PAN.
   * @return lastFour
  **/
  @ApiModelProperty(value = "The last four digits of the PAN.")
  @JsonProperty(JSON_PROPERTY_LAST_FOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastFour() {
    return lastFour;
  }


 /**
  * The last four digits of the PAN.
  *
  * @param lastFour
  */ 
  @JsonProperty(JSON_PROPERTY_LAST_FOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastFour(String lastFour) {
    this.lastFour = lastFour;
  }


  public StoredPaymentMethod name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The display name of the stored payment method.
   * @return name
  **/
  @ApiModelProperty(value = "The display name of the stored payment method.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


 /**
  * The display name of the stored payment method.
  *
  * @param name
  */ 
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public StoredPaymentMethod networkTxReference(String networkTxReference) {
    this.networkTxReference = networkTxReference;
    return this;
  }

   /**
   * Returned in the response if you are not tokenizing with Adyen and are using the Merchant-initiated transactions (MIT) framework from Mastercard or Visa.  This contains either the Mastercard Trace ID or the Visa Transaction ID.
   * @return networkTxReference
  **/
  @ApiModelProperty(value = "Returned in the response if you are not tokenizing with Adyen and are using the Merchant-initiated transactions (MIT) framework from Mastercard or Visa.  This contains either the Mastercard Trace ID or the Visa Transaction ID.")
  @JsonProperty(JSON_PROPERTY_NETWORK_TX_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNetworkTxReference() {
    return networkTxReference;
  }


 /**
  * Returned in the response if you are not tokenizing with Adyen and are using the Merchant-initiated transactions (MIT) framework from Mastercard or Visa.  This contains either the Mastercard Trace ID or the Visa Transaction ID.
  *
  * @param networkTxReference
  */ 
  @JsonProperty(JSON_PROPERTY_NETWORK_TX_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkTxReference(String networkTxReference) {
    this.networkTxReference = networkTxReference;
  }


  public StoredPaymentMethod ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

   /**
   * The name of the bank account holder.
   * @return ownerName
  **/
  @ApiModelProperty(value = "The name of the bank account holder.")
  @JsonProperty(JSON_PROPERTY_OWNER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOwnerName() {
    return ownerName;
  }


 /**
  * The name of the bank account holder.
  *
  * @param ownerName
  */ 
  @JsonProperty(JSON_PROPERTY_OWNER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }


  public StoredPaymentMethod shopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
    return this;
  }

   /**
   * The shopper’s email address.
   * @return shopperEmail
  **/
  @ApiModelProperty(value = "The shopper’s email address.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShopperEmail() {
    return shopperEmail;
  }


 /**
  * The shopper’s email address.
  *
  * @param shopperEmail
  */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
  }


  public StoredPaymentMethod supportedRecurringProcessingModels(List<String> supportedRecurringProcessingModels) {
    this.supportedRecurringProcessingModels = supportedRecurringProcessingModels;
    return this;
  }

  public StoredPaymentMethod addSupportedRecurringProcessingModelsItem(String supportedRecurringProcessingModelsItem) {
    if (this.supportedRecurringProcessingModels == null) {
      this.supportedRecurringProcessingModels = new ArrayList<>();
    }
    this.supportedRecurringProcessingModels.add(supportedRecurringProcessingModelsItem);
    return this;
  }

   /**
   * The supported recurring processing models for this stored payment method.
   * @return supportedRecurringProcessingModels
  **/
  @ApiModelProperty(value = "The supported recurring processing models for this stored payment method.")
  @JsonProperty(JSON_PROPERTY_SUPPORTED_RECURRING_PROCESSING_MODELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSupportedRecurringProcessingModels() {
    return supportedRecurringProcessingModels;
  }


 /**
  * The supported recurring processing models for this stored payment method.
  *
  * @param supportedRecurringProcessingModels
  */ 
  @JsonProperty(JSON_PROPERTY_SUPPORTED_RECURRING_PROCESSING_MODELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupportedRecurringProcessingModels(List<String> supportedRecurringProcessingModels) {
    this.supportedRecurringProcessingModels = supportedRecurringProcessingModels;
  }


  public StoredPaymentMethod supportedShopperInteractions(List<String> supportedShopperInteractions) {
    this.supportedShopperInteractions = supportedShopperInteractions;
    return this;
  }

  public StoredPaymentMethod addSupportedShopperInteractionsItem(String supportedShopperInteractionsItem) {
    if (this.supportedShopperInteractions == null) {
      this.supportedShopperInteractions = new ArrayList<>();
    }
    this.supportedShopperInteractions.add(supportedShopperInteractionsItem);
    return this;
  }

   /**
   * The supported shopper interactions for this stored payment method.
   * @return supportedShopperInteractions
  **/
  @ApiModelProperty(value = "The supported shopper interactions for this stored payment method.")
  @JsonProperty(JSON_PROPERTY_SUPPORTED_SHOPPER_INTERACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSupportedShopperInteractions() {
    return supportedShopperInteractions;
  }


 /**
  * The supported shopper interactions for this stored payment method.
  *
  * @param supportedShopperInteractions
  */ 
  @JsonProperty(JSON_PROPERTY_SUPPORTED_SHOPPER_INTERACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupportedShopperInteractions(List<String> supportedShopperInteractions) {
    this.supportedShopperInteractions = supportedShopperInteractions;
  }


  public StoredPaymentMethod type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of payment method.
   * @return type
  **/
  @ApiModelProperty(value = "The type of payment method.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


 /**
  * The type of payment method.
  *
  * @param type
  */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Return true if this StoredPaymentMethod object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoredPaymentMethod storedPaymentMethod = (StoredPaymentMethod) o;
    return Objects.equals(this.bankAccountNumber, storedPaymentMethod.bankAccountNumber) &&
        Objects.equals(this.bankLocationId, storedPaymentMethod.bankLocationId) &&
        Objects.equals(this.brand, storedPaymentMethod.brand) &&
        Objects.equals(this.expiryMonth, storedPaymentMethod.expiryMonth) &&
        Objects.equals(this.expiryYear, storedPaymentMethod.expiryYear) &&
        Objects.equals(this.holderName, storedPaymentMethod.holderName) &&
        Objects.equals(this.iban, storedPaymentMethod.iban) &&
        Objects.equals(this.id, storedPaymentMethod.id) &&
        Objects.equals(this.label, storedPaymentMethod.label) &&
        Objects.equals(this.lastFour, storedPaymentMethod.lastFour) &&
        Objects.equals(this.name, storedPaymentMethod.name) &&
        Objects.equals(this.networkTxReference, storedPaymentMethod.networkTxReference) &&
        Objects.equals(this.ownerName, storedPaymentMethod.ownerName) &&
        Objects.equals(this.shopperEmail, storedPaymentMethod.shopperEmail) &&
        Objects.equals(this.supportedRecurringProcessingModels, storedPaymentMethod.supportedRecurringProcessingModels) &&
        Objects.equals(this.supportedShopperInteractions, storedPaymentMethod.supportedShopperInteractions) &&
        Objects.equals(this.type, storedPaymentMethod.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccountNumber, bankLocationId, brand, expiryMonth, expiryYear, holderName, iban, id, label, lastFour, name, networkTxReference, ownerName, shopperEmail, supportedRecurringProcessingModels, supportedShopperInteractions, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoredPaymentMethod {\n");
    sb.append("    bankAccountNumber: ").append(toIndentedString(bankAccountNumber)).append("\n");
    sb.append("    bankLocationId: ").append(toIndentedString(bankLocationId)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    expiryMonth: ").append(toIndentedString(expiryMonth)).append("\n");
    sb.append("    expiryYear: ").append(toIndentedString(expiryYear)).append("\n");
    sb.append("    holderName: ").append(toIndentedString(holderName)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    lastFour: ").append(toIndentedString(lastFour)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    networkTxReference: ").append(toIndentedString(networkTxReference)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    shopperEmail: ").append(toIndentedString(shopperEmail)).append("\n");
    sb.append("    supportedRecurringProcessingModels: ").append(toIndentedString(supportedRecurringProcessingModels)).append("\n");
    sb.append("    supportedShopperInteractions: ").append(toIndentedString(supportedShopperInteractions)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
   * Create an instance of StoredPaymentMethod given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StoredPaymentMethod
   * @throws JsonProcessingException if the JSON string is invalid with respect to StoredPaymentMethod
   */
  public static StoredPaymentMethod fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, StoredPaymentMethod.class);
  }
/**
  * Convert an instance of StoredPaymentMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

