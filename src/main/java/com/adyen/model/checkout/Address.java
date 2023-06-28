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
 * Address
 */

public class Address {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_HOUSE_NUMBER_OR_NAME = "houseNumberOrName";
  @SerializedName(SERIALIZED_NAME_HOUSE_NUMBER_OR_NAME)
  private String houseNumberOrName;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_STATE_OR_PROVINCE = "stateOrProvince";
  @SerializedName(SERIALIZED_NAME_STATE_OR_PROVINCE)
  private String stateOrProvince;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public Address() { 
  }

  public Address city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The name of the city. Maximum length: 3000 characters.
   * @return city
  **/
  @ApiModelProperty(required = true, value = "The name of the city. Maximum length: 3000 characters.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public Address country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The two-character ISO-3166-1 alpha-2 country code. For example, **US**. &gt; If you don&#39;t know the country or are not collecting the country from the shopper, provide &#x60;country&#x60; as &#x60;ZZ&#x60;.
   * @return country
  **/
  @ApiModelProperty(required = true, value = "The two-character ISO-3166-1 alpha-2 country code. For example, **US**. > If you don't know the country or are not collecting the country from the shopper, provide `country` as `ZZ`.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public Address houseNumberOrName(String houseNumberOrName) {
    
    this.houseNumberOrName = houseNumberOrName;
    return this;
  }

   /**
   * The number or name of the house. Maximum length: 3000 characters.
   * @return houseNumberOrName
  **/
  @ApiModelProperty(required = true, value = "The number or name of the house. Maximum length: 3000 characters.")

  public String getHouseNumberOrName() {
    return houseNumberOrName;
  }


  public void setHouseNumberOrName(String houseNumberOrName) {
    this.houseNumberOrName = houseNumberOrName;
  }


  public Address postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * A maximum of five digits for an address in the US, or a maximum of ten characters for an address in all other countries.
   * @return postalCode
  **/
  @ApiModelProperty(required = true, value = "A maximum of five digits for an address in the US, or a maximum of ten characters for an address in all other countries.")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public Address stateOrProvince(String stateOrProvince) {
    
    this.stateOrProvince = stateOrProvince;
    return this;
  }

   /**
   * The two-character ISO 3166-2 state or province code. For example, **CA** in the US or **ON** in Canada. &gt; Required for the US and Canada.
   * @return stateOrProvince
  **/
  @ApiModelProperty(value = "The two-character ISO 3166-2 state or province code. For example, **CA** in the US or **ON** in Canada. > Required for the US and Canada.")

  public String getStateOrProvince() {
    return stateOrProvince;
  }


  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }


  public Address street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * The name of the street. Maximum length: 3000 characters. &gt; The house number should not be included in this field; it should be separately provided via &#x60;houseNumberOrName&#x60;.
   * @return street
  **/
  @ApiModelProperty(required = true, value = "The name of the street. Maximum length: 3000 characters. > The house number should not be included in this field; it should be separately provided via `houseNumberOrName`.")

  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.city, address.city) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.houseNumberOrName, address.houseNumberOrName) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.stateOrProvince, address.stateOrProvince) &&
        Objects.equals(this.street, address.street);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, houseNumberOrName, postalCode, stateOrProvince, street);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    houseNumberOrName: ").append(toIndentedString(houseNumberOrName)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
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
    openapiFields.add("city");
    openapiFields.add("country");
    openapiFields.add("houseNumberOrName");
    openapiFields.add("postalCode");
    openapiFields.add("stateOrProvince");
    openapiFields.add("street");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("city");
    openapiRequiredFields.add("country");
    openapiRequiredFields.add("houseNumberOrName");
    openapiRequiredFields.add("postalCode");
    openapiRequiredFields.add("street");
  }

  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    validateJsonObject(jsonObj, false);
  }
 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @param strictValidation reject (new) fields missing from the specifications
  * @throws IOException if the JSON Object is invalid with respect to Address
  */
  public static void validateJsonObject(JsonObject jsonObj, boolean strictValidation) throws IOException {
      if (jsonObj == null) {
        if (Address.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Address is not found in the empty JSON string", Address.openapiRequiredFields.toString()));
        }
      }
      if (strictValidation) {
          Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
          // check to see if the JSON string contains additional fields
          for (Entry<String, JsonElement> entry : entries) {
            if (!Address.openapiFields.contains(entry.getKey())) {
              throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Address` properties.", entry.getKey()));
            }
          }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Address.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field city
      if (jsonObj.get("city") != null && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      // validate the optional field country
      if (jsonObj.get("country") != null && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      // validate the optional field houseNumberOrName
      if (jsonObj.get("houseNumberOrName") != null && !jsonObj.get("houseNumberOrName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `houseNumberOrName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("houseNumberOrName").toString()));
      }
      // validate the optional field postalCode
      if (jsonObj.get("postalCode") != null && !jsonObj.get("postalCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postalCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postalCode").toString()));
      }
      // validate the optional field stateOrProvince
      if (jsonObj.get("stateOrProvince") != null && !jsonObj.get("stateOrProvince").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stateOrProvince` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stateOrProvince").toString()));
      }
      // validate the optional field street
      if (jsonObj.get("street") != null && !jsonObj.get("street").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Address.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Address' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Address> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Address.class));

       return (TypeAdapter<T>) new TypeAdapter<Address>() {
           @Override
           public void write(JsonWriter out, Address value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Address read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Address given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Address
  * @throws IOException if the JSON string is invalid with respect to Address
  */
  public static Address fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Address.class);
  }

 /**
  * Convert an instance of Address to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

