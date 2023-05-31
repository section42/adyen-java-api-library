/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

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

import com.adyen.model.balanceplatform.JSON;

/**
 * Expiry
 */

public class Expiry {
  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private String month;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private String year;

  public Expiry() { 
  }

  public Expiry month(String month) {
    
    this.month = month;
    return this;
  }

   /**
   * The month in which the card will expire.
   * @return month
  **/
  @ApiModelProperty(value = "The month in which the card will expire.")

  public String getMonth() {
    return month;
  }


  public void setMonth(String month) {
    this.month = month;
  }


  public Expiry year(String year) {
    
    this.year = year;
    return this;
  }

   /**
   * The year in which the card will expire.
   * @return year
  **/
  @ApiModelProperty(value = "The year in which the card will expire.")

  public String getYear() {
    return year;
  }


  public void setYear(String year) {
    this.year = year;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Expiry expiry = (Expiry) o;
    return Objects.equals(this.month, expiry.month) &&
        Objects.equals(this.year, expiry.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(month, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Expiry {\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
    openapiFields.add("month");
    openapiFields.add("year");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(Expiry.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Expiry
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Expiry.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Expiry is not found in the empty JSON string", Expiry.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Expiry.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `Expiry` properties.", entry.getKey()));
        }
      }
      // validate the optional field month
      if (jsonObj.get("month") != null && !jsonObj.get("month").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `month` to be a primitive type in the JSON string but got `%s`", jsonObj.get("month").toString()));
      }
      // validate the optional field year
      if (jsonObj.get("year") != null && !jsonObj.get("year").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `year` to be a primitive type in the JSON string but got `%s`", jsonObj.get("year").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Expiry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Expiry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Expiry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Expiry.class));

       return (TypeAdapter<T>) new TypeAdapter<Expiry>() {
           @Override
           public void write(JsonWriter out, Expiry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Expiry read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Expiry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Expiry
  * @throws IOException if the JSON string is invalid with respect to Expiry
  */
  public static Expiry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Expiry.class);
  }

 /**
  * Convert an instance of Expiry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

