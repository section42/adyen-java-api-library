/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 69
 * Contact: developer-experience@adyen.com
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

import com.adyen.model.checkout.JSON;

/**
 * ResponseAdditionalDataBillingAddress
 */

public class ResponseAdditionalDataBillingAddress {
  public static final String SERIALIZED_NAME_BILLING_ADDRESS_CITY = "billingAddress.city";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS_CITY)
  private String billingAddressCity;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS_COUNTRY = "billingAddress.country";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS_COUNTRY)
  private String billingAddressCountry;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS_HOUSE_NUMBER_OR_NAME = "billingAddress.houseNumberOrName";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS_HOUSE_NUMBER_OR_NAME)
  private String billingAddressHouseNumberOrName;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS_POSTAL_CODE = "billingAddress.postalCode";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS_POSTAL_CODE)
  private String billingAddressPostalCode;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS_STATE_OR_PROVINCE = "billingAddress.stateOrProvince";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS_STATE_OR_PROVINCE)
  private String billingAddressStateOrProvince;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS_STREET = "billingAddress.street";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS_STREET)
  private String billingAddressStreet;

  public ResponseAdditionalDataBillingAddress() { 
  }

  public ResponseAdditionalDataBillingAddress billingAddressCity(String billingAddressCity) {
    
    this.billingAddressCity = billingAddressCity;
    return this;
  }

   /**
   * The billing address city passed in the payment request.
   * @return billingAddressCity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The billing address city passed in the payment request.")

  public String getBillingAddressCity() {
    return billingAddressCity;
  }


  public void setBillingAddressCity(String billingAddressCity) {
    this.billingAddressCity = billingAddressCity;
  }


  public ResponseAdditionalDataBillingAddress billingAddressCountry(String billingAddressCountry) {
    
    this.billingAddressCountry = billingAddressCountry;
    return this;
  }

   /**
   * The billing address country passed in the payment request.  Example: NL
   * @return billingAddressCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The billing address country passed in the payment request.  Example: NL")

  public String getBillingAddressCountry() {
    return billingAddressCountry;
  }


  public void setBillingAddressCountry(String billingAddressCountry) {
    this.billingAddressCountry = billingAddressCountry;
  }


  public ResponseAdditionalDataBillingAddress billingAddressHouseNumberOrName(String billingAddressHouseNumberOrName) {
    
    this.billingAddressHouseNumberOrName = billingAddressHouseNumberOrName;
    return this;
  }

   /**
   * The billing address house number or name passed in the payment request.
   * @return billingAddressHouseNumberOrName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The billing address house number or name passed in the payment request.")

  public String getBillingAddressHouseNumberOrName() {
    return billingAddressHouseNumberOrName;
  }


  public void setBillingAddressHouseNumberOrName(String billingAddressHouseNumberOrName) {
    this.billingAddressHouseNumberOrName = billingAddressHouseNumberOrName;
  }


  public ResponseAdditionalDataBillingAddress billingAddressPostalCode(String billingAddressPostalCode) {
    
    this.billingAddressPostalCode = billingAddressPostalCode;
    return this;
  }

   /**
   * The billing address postal code passed in the payment request.  Example: 1011 DJ
   * @return billingAddressPostalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The billing address postal code passed in the payment request.  Example: 1011 DJ")

  public String getBillingAddressPostalCode() {
    return billingAddressPostalCode;
  }


  public void setBillingAddressPostalCode(String billingAddressPostalCode) {
    this.billingAddressPostalCode = billingAddressPostalCode;
  }


  public ResponseAdditionalDataBillingAddress billingAddressStateOrProvince(String billingAddressStateOrProvince) {
    
    this.billingAddressStateOrProvince = billingAddressStateOrProvince;
    return this;
  }

   /**
   * The billing address state or province passed in the payment request.  Example: NH
   * @return billingAddressStateOrProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The billing address state or province passed in the payment request.  Example: NH")

  public String getBillingAddressStateOrProvince() {
    return billingAddressStateOrProvince;
  }


  public void setBillingAddressStateOrProvince(String billingAddressStateOrProvince) {
    this.billingAddressStateOrProvince = billingAddressStateOrProvince;
  }


  public ResponseAdditionalDataBillingAddress billingAddressStreet(String billingAddressStreet) {
    
    this.billingAddressStreet = billingAddressStreet;
    return this;
  }

   /**
   * The billing address street passed in the payment request.
   * @return billingAddressStreet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The billing address street passed in the payment request.")

  public String getBillingAddressStreet() {
    return billingAddressStreet;
  }


  public void setBillingAddressStreet(String billingAddressStreet) {
    this.billingAddressStreet = billingAddressStreet;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseAdditionalDataBillingAddress responseAdditionalDataBillingAddress = (ResponseAdditionalDataBillingAddress) o;
    return Objects.equals(this.billingAddressCity, responseAdditionalDataBillingAddress.billingAddressCity) &&
        Objects.equals(this.billingAddressCountry, responseAdditionalDataBillingAddress.billingAddressCountry) &&
        Objects.equals(this.billingAddressHouseNumberOrName, responseAdditionalDataBillingAddress.billingAddressHouseNumberOrName) &&
        Objects.equals(this.billingAddressPostalCode, responseAdditionalDataBillingAddress.billingAddressPostalCode) &&
        Objects.equals(this.billingAddressStateOrProvince, responseAdditionalDataBillingAddress.billingAddressStateOrProvince) &&
        Objects.equals(this.billingAddressStreet, responseAdditionalDataBillingAddress.billingAddressStreet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddressCity, billingAddressCountry, billingAddressHouseNumberOrName, billingAddressPostalCode, billingAddressStateOrProvince, billingAddressStreet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseAdditionalDataBillingAddress {\n");
    sb.append("    billingAddressCity: ").append(toIndentedString(billingAddressCity)).append("\n");
    sb.append("    billingAddressCountry: ").append(toIndentedString(billingAddressCountry)).append("\n");
    sb.append("    billingAddressHouseNumberOrName: ").append(toIndentedString(billingAddressHouseNumberOrName)).append("\n");
    sb.append("    billingAddressPostalCode: ").append(toIndentedString(billingAddressPostalCode)).append("\n");
    sb.append("    billingAddressStateOrProvince: ").append(toIndentedString(billingAddressStateOrProvince)).append("\n");
    sb.append("    billingAddressStreet: ").append(toIndentedString(billingAddressStreet)).append("\n");
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
    openapiFields.add("billingAddress.city");
    openapiFields.add("billingAddress.country");
    openapiFields.add("billingAddress.houseNumberOrName");
    openapiFields.add("billingAddress.postalCode");
    openapiFields.add("billingAddress.stateOrProvince");
    openapiFields.add("billingAddress.street");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResponseAdditionalDataBillingAddress
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ResponseAdditionalDataBillingAddress.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResponseAdditionalDataBillingAddress is not found in the empty JSON string", ResponseAdditionalDataBillingAddress.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ResponseAdditionalDataBillingAddress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResponseAdditionalDataBillingAddress` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field billingAddress.city
      if (jsonObj.get("billingAddress.city") != null && !jsonObj.get("billingAddress.city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billingAddress.city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingAddress.city").toString()));
      }
      // validate the optional field billingAddress.country
      if (jsonObj.get("billingAddress.country") != null && !jsonObj.get("billingAddress.country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billingAddress.country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingAddress.country").toString()));
      }
      // validate the optional field billingAddress.houseNumberOrName
      if (jsonObj.get("billingAddress.houseNumberOrName") != null && !jsonObj.get("billingAddress.houseNumberOrName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billingAddress.houseNumberOrName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingAddress.houseNumberOrName").toString()));
      }
      // validate the optional field billingAddress.postalCode
      if (jsonObj.get("billingAddress.postalCode") != null && !jsonObj.get("billingAddress.postalCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billingAddress.postalCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingAddress.postalCode").toString()));
      }
      // validate the optional field billingAddress.stateOrProvince
      if (jsonObj.get("billingAddress.stateOrProvince") != null && !jsonObj.get("billingAddress.stateOrProvince").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billingAddress.stateOrProvince` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingAddress.stateOrProvince").toString()));
      }
      // validate the optional field billingAddress.street
      if (jsonObj.get("billingAddress.street") != null && !jsonObj.get("billingAddress.street").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billingAddress.street` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingAddress.street").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResponseAdditionalDataBillingAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResponseAdditionalDataBillingAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResponseAdditionalDataBillingAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResponseAdditionalDataBillingAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<ResponseAdditionalDataBillingAddress>() {
           @Override
           public void write(JsonWriter out, ResponseAdditionalDataBillingAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResponseAdditionalDataBillingAddress read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResponseAdditionalDataBillingAddress given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResponseAdditionalDataBillingAddress
  * @throws IOException if the JSON string is invalid with respect to ResponseAdditionalDataBillingAddress
  */
  public static ResponseAdditionalDataBillingAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResponseAdditionalDataBillingAddress.class);
  }

 /**
  * Convert an instance of ResponseAdditionalDataBillingAddress to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

