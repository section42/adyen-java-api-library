/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.adyen.model.checkout.JSON;

/**
 * Card
 */

public class Card {
  public static final String SERIALIZED_NAME_CVC = "cvc";
  @SerializedName(SERIALIZED_NAME_CVC)
  private String cvc;

  public static final String SERIALIZED_NAME_EXPIRY_MONTH = "expiryMonth";
  @SerializedName(SERIALIZED_NAME_EXPIRY_MONTH)
  private String expiryMonth;

  public static final String SERIALIZED_NAME_EXPIRY_YEAR = "expiryYear";
  @SerializedName(SERIALIZED_NAME_EXPIRY_YEAR)
  private String expiryYear;

  public static final String SERIALIZED_NAME_HOLDER_NAME = "holderName";
  @SerializedName(SERIALIZED_NAME_HOLDER_NAME)
  private String holderName;

  public static final String SERIALIZED_NAME_ISSUE_NUMBER = "issueNumber";
  @SerializedName(SERIALIZED_NAME_ISSUE_NUMBER)
  private String issueNumber;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_START_MONTH = "startMonth";
  @SerializedName(SERIALIZED_NAME_START_MONTH)
  private String startMonth;

  public static final String SERIALIZED_NAME_START_YEAR = "startYear";
  @SerializedName(SERIALIZED_NAME_START_YEAR)
  private String startYear;

  public Card() { 
  }

  public Card cvc(String cvc) {
    
    this.cvc = cvc;
    return this;
  }

   /**
   * The [card verification code](https://docs.adyen.com/payments-fundamentals/payment-glossary#card-security-code-cvc-cvv-cid) (1-20 characters). Depending on the card brand, it is known also as: * CVV2/CVC2 – length: 3 digits * CID – length: 4 digits &gt; If you are using [Client-Side Encryption](https://docs.adyen.com/classic-integration/cse-integration-ecommerce), the CVC code is present in the encrypted data. You must never post the card details to the server. &gt; This field must be always present in a [one-click payment request](https://docs.adyen.com/classic-integration/recurring-payments). &gt; When this value is returned in a response, it is always empty because it is not stored.
   * @return cvc
  **/
  @ApiModelProperty(value = "The [card verification code](https://docs.adyen.com/payments-fundamentals/payment-glossary#card-security-code-cvc-cvv-cid) (1-20 characters). Depending on the card brand, it is known also as: * CVV2/CVC2 – length: 3 digits * CID – length: 4 digits > If you are using [Client-Side Encryption](https://docs.adyen.com/classic-integration/cse-integration-ecommerce), the CVC code is present in the encrypted data. You must never post the card details to the server. > This field must be always present in a [one-click payment request](https://docs.adyen.com/classic-integration/recurring-payments). > When this value is returned in a response, it is always empty because it is not stored.")

  public String getCvc() {
    return cvc;
  }


  public void setCvc(String cvc) {
    this.cvc = cvc;
  }


  public Card expiryMonth(String expiryMonth) {
    
    this.expiryMonth = expiryMonth;
    return this;
  }

   /**
   * The card expiry month. Format: 2 digits, zero-padded for single digits. For example: * 03 &#x3D; March * 11 &#x3D; November
   * @return expiryMonth
  **/
  @ApiModelProperty(value = "The card expiry month. Format: 2 digits, zero-padded for single digits. For example: * 03 = March * 11 = November")

  public String getExpiryMonth() {
    return expiryMonth;
  }


  public void setExpiryMonth(String expiryMonth) {
    this.expiryMonth = expiryMonth;
  }


  public Card expiryYear(String expiryYear) {
    
    this.expiryYear = expiryYear;
    return this;
  }

   /**
   * The card expiry year. Format: 4 digits. For example: 2020
   * @return expiryYear
  **/
  @ApiModelProperty(value = "The card expiry year. Format: 4 digits. For example: 2020")

  public String getExpiryYear() {
    return expiryYear;
  }


  public void setExpiryYear(String expiryYear) {
    this.expiryYear = expiryYear;
  }


  public Card holderName(String holderName) {
    
    this.holderName = holderName;
    return this;
  }

   /**
   * The name of the cardholder, as printed on the card.
   * @return holderName
  **/
  @ApiModelProperty(value = "The name of the cardholder, as printed on the card.")

  public String getHolderName() {
    return holderName;
  }


  public void setHolderName(String holderName) {
    this.holderName = holderName;
  }


  public Card issueNumber(String issueNumber) {
    
    this.issueNumber = issueNumber;
    return this;
  }

   /**
   * The issue number of the card (for some UK debit cards only).
   * @return issueNumber
  **/
  @ApiModelProperty(value = "The issue number of the card (for some UK debit cards only).")

  public String getIssueNumber() {
    return issueNumber;
  }


  public void setIssueNumber(String issueNumber) {
    this.issueNumber = issueNumber;
  }


  public Card number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * The card number (4-19 characters). Do not use any separators. When this value is returned in a response, only the last 4 digits of the card number are returned.
   * @return number
  **/
  @ApiModelProperty(value = "The card number (4-19 characters). Do not use any separators. When this value is returned in a response, only the last 4 digits of the card number are returned.")

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }


  public Card startMonth(String startMonth) {
    
    this.startMonth = startMonth;
    return this;
  }

   /**
   * The month component of the start date (for some UK debit cards only).
   * @return startMonth
  **/
  @ApiModelProperty(value = "The month component of the start date (for some UK debit cards only).")

  public String getStartMonth() {
    return startMonth;
  }


  public void setStartMonth(String startMonth) {
    this.startMonth = startMonth;
  }


  public Card startYear(String startYear) {
    
    this.startYear = startYear;
    return this;
  }

   /**
   * The year component of the start date (for some UK debit cards only).
   * @return startYear
  **/
  @ApiModelProperty(value = "The year component of the start date (for some UK debit cards only).")

  public String getStartYear() {
    return startYear;
  }


  public void setStartYear(String startYear) {
    this.startYear = startYear;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return Objects.equals(this.cvc, card.cvc) &&
        Objects.equals(this.expiryMonth, card.expiryMonth) &&
        Objects.equals(this.expiryYear, card.expiryYear) &&
        Objects.equals(this.holderName, card.holderName) &&
        Objects.equals(this.issueNumber, card.issueNumber) &&
        Objects.equals(this.number, card.number) &&
        Objects.equals(this.startMonth, card.startMonth) &&
        Objects.equals(this.startYear, card.startYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cvc, expiryMonth, expiryYear, holderName, issueNumber, number, startMonth, startYear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    sb.append("    cvc: ").append(toIndentedString(cvc)).append("\n");
    sb.append("    expiryMonth: ").append(toIndentedString(expiryMonth)).append("\n");
    sb.append("    expiryYear: ").append(toIndentedString(expiryYear)).append("\n");
    sb.append("    holderName: ").append(toIndentedString(holderName)).append("\n");
    sb.append("    issueNumber: ").append(toIndentedString(issueNumber)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    startMonth: ").append(toIndentedString(startMonth)).append("\n");
    sb.append("    startYear: ").append(toIndentedString(startYear)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("cvc");
    openapiFields.add("expiryMonth");
    openapiFields.add("expiryYear");
    openapiFields.add("holderName");
    openapiFields.add("issueNumber");
    openapiFields.add("number");
    openapiFields.add("startMonth");
    openapiFields.add("startYear");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    validateJsonObject(jsonObj, false);
  }
 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @param strictValidation reject (new) fields missing from the specifications
  * @throws IOException if the JSON Object is invalid with respect to Card
  */
  public static void validateJsonObject(JsonObject jsonObj, boolean strictValidation) throws IOException {
      if (jsonObj == null) {
        if (Card.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Card is not found in the empty JSON string", Card.openapiRequiredFields.toString()));
        }
      }
      if (strictValidation) {
          Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
          // check to see if the JSON string contains additional fields
          for (Entry<String, JsonElement> entry : entries) {
            if (!Card.openapiFields.contains(entry.getKey())) {
              throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Card` properties.", entry.getKey()));
            }
          }
      }
      // validate the optional field cvc
      if (jsonObj.get("cvc") != null && !jsonObj.get("cvc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cvc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cvc").toString()));
      }
      // validate the optional field expiryMonth
      if (jsonObj.get("expiryMonth") != null && !jsonObj.get("expiryMonth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiryMonth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiryMonth").toString()));
      }
      // validate the optional field expiryYear
      if (jsonObj.get("expiryYear") != null && !jsonObj.get("expiryYear").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiryYear` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiryYear").toString()));
      }
      // validate the optional field holderName
      if (jsonObj.get("holderName") != null && !jsonObj.get("holderName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `holderName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("holderName").toString()));
      }
      // validate the optional field issueNumber
      if (jsonObj.get("issueNumber") != null && !jsonObj.get("issueNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issueNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issueNumber").toString()));
      }
      // validate the optional field number
      if (jsonObj.get("number") != null && !jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
      // validate the optional field startMonth
      if (jsonObj.get("startMonth") != null && !jsonObj.get("startMonth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startMonth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startMonth").toString()));
      }
      // validate the optional field startYear
      if (jsonObj.get("startYear") != null && !jsonObj.get("startYear").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startYear` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startYear").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Card.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Card' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Card> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Card.class));

       return (TypeAdapter<T>) new TypeAdapter<Card>() {
           @Override
           public void write(JsonWriter out, Card value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Card read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Card given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Card
  * @throws IOException if the JSON string is invalid with respect to Card
  */
  public static Card fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Card.class);
  }

 /**
  * Convert an instance of Card to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

