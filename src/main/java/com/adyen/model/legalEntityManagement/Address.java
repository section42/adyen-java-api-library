/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 2
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalEntityManagement;

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

import com.adyen.model.legalEntityManagement.JSON;

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

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_STATE_OR_PROVINCE = "stateOrProvince";
  @SerializedName(SERIALIZED_NAME_STATE_OR_PROVINCE)
  private String stateOrProvince;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_STREET2 = "street2";
  @SerializedName(SERIALIZED_NAME_STREET2)
  private String street2;

  public Address() { 
  }

  public Address city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The name of the city. Required if &#x60;stateOrProvince&#x60; is provided.  If you specify the city, you must also send &#x60;postalCode&#x60; and &#x60;street&#x60;.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the city. Required if `stateOrProvince` is provided.  If you specify the city, you must also send `postalCode` and `street`.")

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
   * The two-letter [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code.
   * @return country
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The two-letter [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public Address postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code. Required if &#x60;stateOrProvince&#x60; and/or &#x60;city&#x60; is provided.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Postal code. Required if `stateOrProvince` and/or `city` is provided.")

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
   * The two-letter ISO 3166-2 state or province code. For example, **CA** in the US.   If you specify the state or province, you must also send &#x60;city&#x60;, &#x60;postalCode&#x60;, and &#x60;street&#x60;.
   * @return stateOrProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The two-letter ISO 3166-2 state or province code. For example, **CA** in the US.   If you specify the state or province, you must also send `city`, `postalCode`, and `street`.")

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
   * The name of the street, and the house or building number. Required if &#x60;stateOrProvince&#x60; and/or &#x60;city&#x60; is provided.
   * @return street
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the street, and the house or building number. Required if `stateOrProvince` and/or `city` is provided.")

  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }


  public Address street2(String street2) {
    
    this.street2 = street2;
    return this;
  }

   /**
   * The apartment, unit, or suite number.
   * @return street2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The apartment, unit, or suite number.")

  public String getStreet2() {
    return street2;
  }


  public void setStreet2(String street2) {
    this.street2 = street2;
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
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.stateOrProvince, address.stateOrProvince) &&
        Objects.equals(this.street, address.street) &&
        Objects.equals(this.street2, address.street2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, postalCode, stateOrProvince, street, street2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
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
    openapiFields.add("postalCode");
    openapiFields.add("stateOrProvince");
    openapiFields.add("street");
    openapiFields.add("street2");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("country");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Address
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Address.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Address is not found in the empty JSON string", Address.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Address.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Address` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      // validate the optional field street2
      if (jsonObj.get("street2") != null && !jsonObj.get("street2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street2").toString()));
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

