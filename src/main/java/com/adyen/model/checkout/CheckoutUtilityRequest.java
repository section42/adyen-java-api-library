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
import java.util.ArrayList;
import java.util.List;

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
 * CheckoutUtilityRequest
 */

public class CheckoutUtilityRequest {
  public static final String SERIALIZED_NAME_ORIGIN_DOMAINS = "originDomains";
  @SerializedName(SERIALIZED_NAME_ORIGIN_DOMAINS)
  private List<String> originDomains = new ArrayList<>();

  public CheckoutUtilityRequest() { 
  }

  public CheckoutUtilityRequest originDomains(List<String> originDomains) {
    
    this.originDomains = originDomains;
    return this;
  }

  public CheckoutUtilityRequest addOriginDomainsItem(String originDomainsItem) {
    this.originDomains.add(originDomainsItem);
    return this;
  }

   /**
   * The list of origin domains, for which origin keys are requested.
   * @return originDomains
  **/
  @ApiModelProperty(required = true, value = "The list of origin domains, for which origin keys are requested.")

  public List<String> getOriginDomains() {
    return originDomains;
  }


  public void setOriginDomains(List<String> originDomains) {
    this.originDomains = originDomains;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutUtilityRequest checkoutUtilityRequest = (CheckoutUtilityRequest) o;
    return Objects.equals(this.originDomains, checkoutUtilityRequest.originDomains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originDomains);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutUtilityRequest {\n");
    sb.append("    originDomains: ").append(toIndentedString(originDomains)).append("\n");
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
    openapiFields.add("originDomains");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("originDomains");
  }

  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    validateJsonObject(jsonObj, false);
  }
 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @param strictValidation reject (new) fields missing from the specifications
  * @throws IOException if the JSON Object is invalid with respect to CheckoutUtilityRequest
  */
  public static void validateJsonObject(JsonObject jsonObj, boolean strictValidation) throws IOException {
      if (jsonObj == null) {
        if (CheckoutUtilityRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckoutUtilityRequest is not found in the empty JSON string", CheckoutUtilityRequest.openapiRequiredFields.toString()));
        }
      }
      if (strictValidation) {
          Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
          // check to see if the JSON string contains additional fields
          for (Entry<String, JsonElement> entry : entries) {
            if (!CheckoutUtilityRequest.openapiFields.contains(entry.getKey())) {
              throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CheckoutUtilityRequest` properties.", entry.getKey()));
            }
          }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CheckoutUtilityRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("originDomains") != null && !jsonObj.get("originDomains").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `originDomains` to be an array in the JSON string but got `%s`", jsonObj.get("originDomains").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckoutUtilityRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckoutUtilityRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckoutUtilityRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckoutUtilityRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckoutUtilityRequest>() {
           @Override
           public void write(JsonWriter out, CheckoutUtilityRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CheckoutUtilityRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CheckoutUtilityRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CheckoutUtilityRequest
  * @throws IOException if the JSON string is invalid with respect to CheckoutUtilityRequest
  */
  public static CheckoutUtilityRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckoutUtilityRequest.class);
  }

 /**
  * Convert an instance of CheckoutUtilityRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

