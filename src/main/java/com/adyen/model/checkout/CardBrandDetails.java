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
 * CardBrandDetails
 */

public class CardBrandDetails {
  public static final String SERIALIZED_NAME_SUPPORTED = "supported";
  @SerializedName(SERIALIZED_NAME_SUPPORTED)
  private Boolean supported;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public CardBrandDetails() { 
  }

  public CardBrandDetails supported(Boolean supported) {
    
    this.supported = supported;
    return this;
  }

   /**
   * Indicates if you support the card brand.
   * @return supported
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if you support the card brand.")

  public Boolean getSupported() {
    return supported;
  }


  public void setSupported(Boolean supported) {
    this.supported = supported;
  }


  public CardBrandDetails type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The name of the card brand.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the card brand.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardBrandDetails cardBrandDetails = (CardBrandDetails) o;
    return Objects.equals(this.supported, cardBrandDetails.supported) &&
        Objects.equals(this.type, cardBrandDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supported, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardBrandDetails {\n");
    sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("supported");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CardBrandDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CardBrandDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CardBrandDetails is not found in the empty JSON string", CardBrandDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CardBrandDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CardBrandDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field type
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CardBrandDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CardBrandDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CardBrandDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CardBrandDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<CardBrandDetails>() {
           @Override
           public void write(JsonWriter out, CardBrandDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CardBrandDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CardBrandDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CardBrandDetails
  * @throws IOException if the JSON string is invalid with respect to CardBrandDetails
  */
  public static CardBrandDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CardBrandDetails.class);
  }

 /**
  * Convert an instance of CardBrandDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

