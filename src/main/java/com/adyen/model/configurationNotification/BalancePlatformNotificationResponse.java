/*
 * Configuration webhooks
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.configurationNotification;

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

import com.adyen.model.configurationNotification.JSON;

/**
 * BalancePlatformNotificationResponse
 */

public class BalancePlatformNotificationResponse {
  public static final String SERIALIZED_NAME_NOTIFICATION_RESPONSE = "notificationResponse";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_RESPONSE)
  private String notificationResponse;

  public BalancePlatformNotificationResponse() { 
  }

  public BalancePlatformNotificationResponse notificationResponse(String notificationResponse) {
    
    this.notificationResponse = notificationResponse;
    return this;
  }

   /**
   * Respond with **HTTP 200 OK** and &#x60;[accepted]&#x60; in the response body to [accept the webhook](https://docs.adyen.com/development-resources/webhooks#accept-notifications).
   * @return notificationResponse
  **/
  @ApiModelProperty(value = "Respond with **HTTP 200 OK** and `[accepted]` in the response body to [accept the webhook](https://docs.adyen.com/development-resources/webhooks#accept-notifications).")

  public String getNotificationResponse() {
    return notificationResponse;
  }


  public void setNotificationResponse(String notificationResponse) {
    this.notificationResponse = notificationResponse;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalancePlatformNotificationResponse balancePlatformNotificationResponse = (BalancePlatformNotificationResponse) o;
    return Objects.equals(this.notificationResponse, balancePlatformNotificationResponse.notificationResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalancePlatformNotificationResponse {\n");
    sb.append("    notificationResponse: ").append(toIndentedString(notificationResponse)).append("\n");
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
    openapiFields.add("notificationResponse");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(BalancePlatformNotificationResponse.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BalancePlatformNotificationResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BalancePlatformNotificationResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BalancePlatformNotificationResponse is not found in the empty JSON string", BalancePlatformNotificationResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BalancePlatformNotificationResponse.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `BalancePlatformNotificationResponse` properties.", entry.getKey()));
        }
      }
      // validate the optional field notificationResponse
      if (jsonObj.get("notificationResponse") != null && !jsonObj.get("notificationResponse").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `notificationResponse` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notificationResponse").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BalancePlatformNotificationResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BalancePlatformNotificationResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BalancePlatformNotificationResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BalancePlatformNotificationResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<BalancePlatformNotificationResponse>() {
           @Override
           public void write(JsonWriter out, BalancePlatformNotificationResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BalancePlatformNotificationResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BalancePlatformNotificationResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BalancePlatformNotificationResponse
  * @throws IOException if the JSON string is invalid with respect to BalancePlatformNotificationResponse
  */
  public static BalancePlatformNotificationResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BalancePlatformNotificationResponse.class);
  }

 /**
  * Convert an instance of BalancePlatformNotificationResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

