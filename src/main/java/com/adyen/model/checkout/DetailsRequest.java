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
import com.adyen.model.checkout.PaymentCompletionDetails;
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
 * DetailsRequest
 */

public class DetailsRequest {
  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private PaymentCompletionDetails details;

  public static final String SERIALIZED_NAME_PAYMENT_DATA = "paymentData";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DATA)
  private String paymentData;

  public static final String SERIALIZED_NAME_THREE_D_S_AUTHENTICATION_ONLY = "threeDSAuthenticationOnly";
  @SerializedName(SERIALIZED_NAME_THREE_D_S_AUTHENTICATION_ONLY)
  private Boolean threeDSAuthenticationOnly;

  public DetailsRequest() { 
  }

  public DetailsRequest details(PaymentCompletionDetails details) {
    
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PaymentCompletionDetails getDetails() {
    return details;
  }


  public void setDetails(PaymentCompletionDetails details) {
    this.details = details;
  }


  public DetailsRequest paymentData(String paymentData) {
    
    this.paymentData = paymentData;
    return this;
  }

   /**
   * The &#x60;paymentData&#x60; value from the &#x60;/payments&#x60; response. Required if the &#x60;/payments&#x60; response returns this value. 
   * @return paymentData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `paymentData` value from the `/payments` response. Required if the `/payments` response returns this value. ")

  public String getPaymentData() {
    return paymentData;
  }


  public void setPaymentData(String paymentData) {
    this.paymentData = paymentData;
  }


  public DetailsRequest threeDSAuthenticationOnly(Boolean threeDSAuthenticationOnly) {
    
    this.threeDSAuthenticationOnly = threeDSAuthenticationOnly;
    return this;
  }

   /**
   * Change the &#x60;authenticationOnly&#x60; indicator originally set in the &#x60;/payments&#x60; request. Only needs to be set if you want to modify the value set previously.
   * @return threeDSAuthenticationOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Change the `authenticationOnly` indicator originally set in the `/payments` request. Only needs to be set if you want to modify the value set previously.")

  public Boolean getThreeDSAuthenticationOnly() {
    return threeDSAuthenticationOnly;
  }


  public void setThreeDSAuthenticationOnly(Boolean threeDSAuthenticationOnly) {
    this.threeDSAuthenticationOnly = threeDSAuthenticationOnly;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailsRequest detailsRequest = (DetailsRequest) o;
    return Objects.equals(this.details, detailsRequest.details) &&
        Objects.equals(this.paymentData, detailsRequest.paymentData) &&
        Objects.equals(this.threeDSAuthenticationOnly, detailsRequest.threeDSAuthenticationOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, paymentData, threeDSAuthenticationOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailsRequest {\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    paymentData: ").append(toIndentedString(paymentData)).append("\n");
    sb.append("    threeDSAuthenticationOnly: ").append(toIndentedString(threeDSAuthenticationOnly)).append("\n");
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
    openapiFields.add("details");
    openapiFields.add("paymentData");
    openapiFields.add("threeDSAuthenticationOnly");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("details");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DetailsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DetailsRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DetailsRequest is not found in the empty JSON string", DetailsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DetailsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DetailsRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DetailsRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `details`
      if (jsonObj.getAsJsonObject("details") != null) {
        PaymentCompletionDetails.validateJsonObject(jsonObj.getAsJsonObject("details"));
      }
      // validate the optional field paymentData
      if (jsonObj.get("paymentData") != null && !jsonObj.get("paymentData").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentData").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DetailsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DetailsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DetailsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DetailsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DetailsRequest>() {
           @Override
           public void write(JsonWriter out, DetailsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DetailsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DetailsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DetailsRequest
  * @throws IOException if the JSON string is invalid with respect to DetailsRequest
  */
  public static DetailsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DetailsRequest.class);
  }

 /**
  * Convert an instance of DetailsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

