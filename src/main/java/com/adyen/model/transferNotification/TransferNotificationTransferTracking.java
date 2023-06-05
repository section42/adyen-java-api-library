/*
 * Transfer webhooks
 *
 * The version of the OpenAPI document: 3
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transferNotification;

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
import java.time.OffsetDateTime;

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

import com.adyen.model.transferNotification.JSON;

/**
 * TransferNotificationTransferTracking
 */

public class TransferNotificationTransferTracking {
  public static final String SERIALIZED_NAME_ESTIMATED_ARRIVAL_TIME = "estimatedArrivalTime";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_ARRIVAL_TIME)
  private OffsetDateTime estimatedArrivalTime;

  /**
   * The tracking status of the transfer.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CREDITED("credited");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public TransferNotificationTransferTracking() { 
  }

  public TransferNotificationTransferTracking estimatedArrivalTime(OffsetDateTime estimatedArrivalTime) {
    
    this.estimatedArrivalTime = estimatedArrivalTime;
    return this;
  }

   /**
   * The estimated time the beneficiary should have access to the funds.
   * @return estimatedArrivalTime
  **/
  @ApiModelProperty(value = "The estimated time the beneficiary should have access to the funds.")

  public OffsetDateTime getEstimatedArrivalTime() {
    return estimatedArrivalTime;
  }


  public void setEstimatedArrivalTime(OffsetDateTime estimatedArrivalTime) {
    this.estimatedArrivalTime = estimatedArrivalTime;
  }


  public TransferNotificationTransferTracking status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The tracking status of the transfer.
   * @return status
  **/
  @ApiModelProperty(value = "The tracking status of the transfer.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferNotificationTransferTracking transferNotificationTransferTracking = (TransferNotificationTransferTracking) o;
    return Objects.equals(this.estimatedArrivalTime, transferNotificationTransferTracking.estimatedArrivalTime) &&
        Objects.equals(this.status, transferNotificationTransferTracking.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedArrivalTime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferNotificationTransferTracking {\n");
    sb.append("    estimatedArrivalTime: ").append(toIndentedString(estimatedArrivalTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("estimatedArrivalTime");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(TransferNotificationTransferTracking.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransferNotificationTransferTracking
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TransferNotificationTransferTracking.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransferNotificationTransferTracking is not found in the empty JSON string", TransferNotificationTransferTracking.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TransferNotificationTransferTracking.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `TransferNotificationTransferTracking` properties.", entry.getKey()));
        }
      }
      // ensure the field status can be parsed to an enum value
      if (jsonObj.get("status") != null) {
        if(!jsonObj.get("status").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
        }
        StatusEnum.fromValue(jsonObj.get("status").getAsString());
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransferNotificationTransferTracking.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransferNotificationTransferTracking' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransferNotificationTransferTracking> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransferNotificationTransferTracking.class));

       return (TypeAdapter<T>) new TypeAdapter<TransferNotificationTransferTracking>() {
           @Override
           public void write(JsonWriter out, TransferNotificationTransferTracking value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransferNotificationTransferTracking read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransferNotificationTransferTracking given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransferNotificationTransferTracking
  * @throws IOException if the JSON string is invalid with respect to TransferNotificationTransferTracking
  */
  public static TransferNotificationTransferTracking fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransferNotificationTransferTracking.class);
  }

 /**
  * Convert an instance of TransferNotificationTransferTracking to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

