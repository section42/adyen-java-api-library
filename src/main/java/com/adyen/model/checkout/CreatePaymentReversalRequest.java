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
 * CreatePaymentReversalRequest
 */

public class CreatePaymentReversalRequest {
  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT = "merchantAccount";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT)
  private String merchantAccount;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public CreatePaymentReversalRequest() { 
  }

  public CreatePaymentReversalRequest merchantAccount(String merchantAccount) {
    
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account that is used to process the payment.
   * @return merchantAccount
  **/
  @ApiModelProperty(required = true, value = "The merchant account that is used to process the payment.")

  public String getMerchantAccount() {
    return merchantAccount;
  }


  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public CreatePaymentReversalRequest reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the reversal request. Maximum length: 80 characters.
   * @return reference
  **/
  @ApiModelProperty(value = "Your reference for the reversal request. Maximum length: 80 characters.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePaymentReversalRequest createPaymentReversalRequest = (CreatePaymentReversalRequest) o;
    return Objects.equals(this.merchantAccount, createPaymentReversalRequest.merchantAccount) &&
        Objects.equals(this.reference, createPaymentReversalRequest.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantAccount, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePaymentReversalRequest {\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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
    openapiFields.add("merchantAccount");
    openapiFields.add("reference");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("merchantAccount");
  }

  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    validateJsonObject(jsonObj, false);
  }
 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @param strictValidation reject (new) fields missing from the specifications
  * @throws IOException if the JSON Object is invalid with respect to CreatePaymentReversalRequest
  */
  public static void validateJsonObject(JsonObject jsonObj, boolean strictValidation) throws IOException {
      if (jsonObj == null) {
        if (CreatePaymentReversalRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreatePaymentReversalRequest is not found in the empty JSON string", CreatePaymentReversalRequest.openapiRequiredFields.toString()));
        }
      }
      if (strictValidation) {
          Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
          // check to see if the JSON string contains additional fields
          for (Entry<String, JsonElement> entry : entries) {
            if (!CreatePaymentReversalRequest.openapiFields.contains(entry.getKey())) {
              throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreatePaymentReversalRequest` properties.", entry.getKey()));
            }
          }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreatePaymentReversalRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field merchantAccount
      if (jsonObj.get("merchantAccount") != null && !jsonObj.get("merchantAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantAccount").toString()));
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreatePaymentReversalRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreatePaymentReversalRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreatePaymentReversalRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreatePaymentReversalRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreatePaymentReversalRequest>() {
           @Override
           public void write(JsonWriter out, CreatePaymentReversalRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreatePaymentReversalRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreatePaymentReversalRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreatePaymentReversalRequest
  * @throws IOException if the JSON string is invalid with respect to CreatePaymentReversalRequest
  */
  public static CreatePaymentReversalRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreatePaymentReversalRequest.class);
  }

 /**
  * Convert an instance of CreatePaymentReversalRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

