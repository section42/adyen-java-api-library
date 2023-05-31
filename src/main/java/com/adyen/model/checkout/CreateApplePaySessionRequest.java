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
 * CreateApplePaySessionRequest
 */

public class CreateApplePaySessionRequest {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DOMAIN_NAME = "domainName";
  @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
  private String domainName;

  public static final String SERIALIZED_NAME_MERCHANT_IDENTIFIER = "merchantIdentifier";
  @SerializedName(SERIALIZED_NAME_MERCHANT_IDENTIFIER)
  private String merchantIdentifier;

  public CreateApplePaySessionRequest() { 
  }

  public CreateApplePaySessionRequest displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * This is the name that your shoppers will see in the Apple Pay interface.  The value returned as &#x60;configuration.merchantName&#x60; field from the [&#x60;/paymentMethods&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/paymentMethods) response.
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "This is the name that your shoppers will see in the Apple Pay interface.  The value returned as `configuration.merchantName` field from the [`/paymentMethods`](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/paymentMethods) response.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public CreateApplePaySessionRequest domainName(String domainName) {
    
    this.domainName = domainName;
    return this;
  }

   /**
   * The domain name you provided when you added Apple Pay in your Customer Area.  This must match the &#x60;window.location.hostname&#x60; of the web shop.
   * @return domainName
  **/
  @ApiModelProperty(required = true, value = "The domain name you provided when you added Apple Pay in your Customer Area.  This must match the `window.location.hostname` of the web shop.")

  public String getDomainName() {
    return domainName;
  }


  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }


  public CreateApplePaySessionRequest merchantIdentifier(String merchantIdentifier) {
    
    this.merchantIdentifier = merchantIdentifier;
    return this;
  }

   /**
   * Your merchant identifier registered with Apple Pay.  Use the value of the &#x60;configuration.merchantId&#x60; field from the [&#x60;/paymentMethods&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/paymentMethods) response.
   * @return merchantIdentifier
  **/
  @ApiModelProperty(required = true, value = "Your merchant identifier registered with Apple Pay.  Use the value of the `configuration.merchantId` field from the [`/paymentMethods`](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/paymentMethods) response.")

  public String getMerchantIdentifier() {
    return merchantIdentifier;
  }


  public void setMerchantIdentifier(String merchantIdentifier) {
    this.merchantIdentifier = merchantIdentifier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateApplePaySessionRequest createApplePaySessionRequest = (CreateApplePaySessionRequest) o;
    return Objects.equals(this.displayName, createApplePaySessionRequest.displayName) &&
        Objects.equals(this.domainName, createApplePaySessionRequest.domainName) &&
        Objects.equals(this.merchantIdentifier, createApplePaySessionRequest.merchantIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, domainName, merchantIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateApplePaySessionRequest {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    merchantIdentifier: ").append(toIndentedString(merchantIdentifier)).append("\n");
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
    openapiFields.add("displayName");
    openapiFields.add("domainName");
    openapiFields.add("merchantIdentifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("displayName");
    openapiRequiredFields.add("domainName");
    openapiRequiredFields.add("merchantIdentifier");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(CreateApplePaySessionRequest.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateApplePaySessionRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateApplePaySessionRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateApplePaySessionRequest is not found in the empty JSON string", CreateApplePaySessionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateApplePaySessionRequest.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `CreateApplePaySessionRequest` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateApplePaySessionRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field displayName
      if (jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      // validate the optional field domainName
      if (jsonObj.get("domainName") != null && !jsonObj.get("domainName").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `domainName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domainName").toString()));
      }
      // validate the optional field merchantIdentifier
      if (jsonObj.get("merchantIdentifier") != null && !jsonObj.get("merchantIdentifier").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `merchantIdentifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantIdentifier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateApplePaySessionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateApplePaySessionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateApplePaySessionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateApplePaySessionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateApplePaySessionRequest>() {
           @Override
           public void write(JsonWriter out, CreateApplePaySessionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateApplePaySessionRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateApplePaySessionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateApplePaySessionRequest
  * @throws IOException if the JSON string is invalid with respect to CreateApplePaySessionRequest
  */
  public static CreateApplePaySessionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateApplePaySessionRequest.class);
  }

 /**
  * Convert an instance of CreateApplePaySessionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

