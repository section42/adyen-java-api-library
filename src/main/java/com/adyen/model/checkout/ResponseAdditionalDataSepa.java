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
 * ResponseAdditionalDataSepa
 */

public class ResponseAdditionalDataSepa {
  public static final String SERIALIZED_NAME_SEPADIRECTDEBIT_DATE_OF_SIGNATURE = "sepadirectdebit.dateOfSignature";
  @SerializedName(SERIALIZED_NAME_SEPADIRECTDEBIT_DATE_OF_SIGNATURE)
  private String sepadirectdebitDateOfSignature;

  public static final String SERIALIZED_NAME_SEPADIRECTDEBIT_MANDATE_ID = "sepadirectdebit.mandateId";
  @SerializedName(SERIALIZED_NAME_SEPADIRECTDEBIT_MANDATE_ID)
  private String sepadirectdebitMandateId;

  public static final String SERIALIZED_NAME_SEPADIRECTDEBIT_SEQUENCE_TYPE = "sepadirectdebit.sequenceType";
  @SerializedName(SERIALIZED_NAME_SEPADIRECTDEBIT_SEQUENCE_TYPE)
  private String sepadirectdebitSequenceType;

  public ResponseAdditionalDataSepa() { 
  }

  public ResponseAdditionalDataSepa sepadirectdebitDateOfSignature(String sepadirectdebitDateOfSignature) {
    
    this.sepadirectdebitDateOfSignature = sepadirectdebitDateOfSignature;
    return this;
  }

   /**
   * The transaction signature date.  Format: yyyy-MM-dd
   * @return sepadirectdebitDateOfSignature
  **/
  @ApiModelProperty(value = "The transaction signature date.  Format: yyyy-MM-dd")

  public String getSepadirectdebitDateOfSignature() {
    return sepadirectdebitDateOfSignature;
  }


  public void setSepadirectdebitDateOfSignature(String sepadirectdebitDateOfSignature) {
    this.sepadirectdebitDateOfSignature = sepadirectdebitDateOfSignature;
  }


  public ResponseAdditionalDataSepa sepadirectdebitMandateId(String sepadirectdebitMandateId) {
    
    this.sepadirectdebitMandateId = sepadirectdebitMandateId;
    return this;
  }

   /**
   * Its value corresponds to the pspReference value of the transaction.
   * @return sepadirectdebitMandateId
  **/
  @ApiModelProperty(value = "Its value corresponds to the pspReference value of the transaction.")

  public String getSepadirectdebitMandateId() {
    return sepadirectdebitMandateId;
  }


  public void setSepadirectdebitMandateId(String sepadirectdebitMandateId) {
    this.sepadirectdebitMandateId = sepadirectdebitMandateId;
  }


  public ResponseAdditionalDataSepa sepadirectdebitSequenceType(String sepadirectdebitSequenceType) {
    
    this.sepadirectdebitSequenceType = sepadirectdebitSequenceType;
    return this;
  }

   /**
   * This field can take one of the following values: * OneOff: (OOFF) Direct debit instruction to initiate exactly one direct debit transaction.  * First: (FRST) Initial/first collection in a series of direct debit instructions. * Recurring: (RCUR) Direct debit instruction to carry out regular direct debit transactions initiated by the creditor. * Final: (FNAL) Last/final collection in a series of direct debit instructions.  Example: OOFF
   * @return sepadirectdebitSequenceType
  **/
  @ApiModelProperty(value = "This field can take one of the following values: * OneOff: (OOFF) Direct debit instruction to initiate exactly one direct debit transaction.  * First: (FRST) Initial/first collection in a series of direct debit instructions. * Recurring: (RCUR) Direct debit instruction to carry out regular direct debit transactions initiated by the creditor. * Final: (FNAL) Last/final collection in a series of direct debit instructions.  Example: OOFF")

  public String getSepadirectdebitSequenceType() {
    return sepadirectdebitSequenceType;
  }


  public void setSepadirectdebitSequenceType(String sepadirectdebitSequenceType) {
    this.sepadirectdebitSequenceType = sepadirectdebitSequenceType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseAdditionalDataSepa responseAdditionalDataSepa = (ResponseAdditionalDataSepa) o;
    return Objects.equals(this.sepadirectdebitDateOfSignature, responseAdditionalDataSepa.sepadirectdebitDateOfSignature) &&
        Objects.equals(this.sepadirectdebitMandateId, responseAdditionalDataSepa.sepadirectdebitMandateId) &&
        Objects.equals(this.sepadirectdebitSequenceType, responseAdditionalDataSepa.sepadirectdebitSequenceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sepadirectdebitDateOfSignature, sepadirectdebitMandateId, sepadirectdebitSequenceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseAdditionalDataSepa {\n");
    sb.append("    sepadirectdebitDateOfSignature: ").append(toIndentedString(sepadirectdebitDateOfSignature)).append("\n");
    sb.append("    sepadirectdebitMandateId: ").append(toIndentedString(sepadirectdebitMandateId)).append("\n");
    sb.append("    sepadirectdebitSequenceType: ").append(toIndentedString(sepadirectdebitSequenceType)).append("\n");
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
    openapiFields.add("sepadirectdebit.dateOfSignature");
    openapiFields.add("sepadirectdebit.mandateId");
    openapiFields.add("sepadirectdebit.sequenceType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(ResponseAdditionalDataSepa.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResponseAdditionalDataSepa
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ResponseAdditionalDataSepa.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResponseAdditionalDataSepa is not found in the empty JSON string", ResponseAdditionalDataSepa.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ResponseAdditionalDataSepa.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `ResponseAdditionalDataSepa` properties.", entry.getKey()));
        }
      }
      // validate the optional field sepadirectdebit.dateOfSignature
      if (jsonObj.get("sepadirectdebit.dateOfSignature") != null && !jsonObj.get("sepadirectdebit.dateOfSignature").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `sepadirectdebit.dateOfSignature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sepadirectdebit.dateOfSignature").toString()));
      }
      // validate the optional field sepadirectdebit.mandateId
      if (jsonObj.get("sepadirectdebit.mandateId") != null && !jsonObj.get("sepadirectdebit.mandateId").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `sepadirectdebit.mandateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sepadirectdebit.mandateId").toString()));
      }
      // validate the optional field sepadirectdebit.sequenceType
      if (jsonObj.get("sepadirectdebit.sequenceType") != null && !jsonObj.get("sepadirectdebit.sequenceType").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `sepadirectdebit.sequenceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sepadirectdebit.sequenceType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResponseAdditionalDataSepa.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResponseAdditionalDataSepa' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResponseAdditionalDataSepa> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResponseAdditionalDataSepa.class));

       return (TypeAdapter<T>) new TypeAdapter<ResponseAdditionalDataSepa>() {
           @Override
           public void write(JsonWriter out, ResponseAdditionalDataSepa value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResponseAdditionalDataSepa read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResponseAdditionalDataSepa given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResponseAdditionalDataSepa
  * @throws IOException if the JSON string is invalid with respect to ResponseAdditionalDataSepa
  */
  public static ResponseAdditionalDataSepa fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResponseAdditionalDataSepa.class);
  }

 /**
  * Convert an instance of ResponseAdditionalDataSepa to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

