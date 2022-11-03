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
 * PayPalDetails
 */

public class PayPalDetails {
  public static final String SERIALIZED_NAME_ORDER_I_D = "orderID";
  @SerializedName(SERIALIZED_NAME_ORDER_I_D)
  private String orderID;

  public static final String SERIALIZED_NAME_PAYER_I_D = "payerID";
  @SerializedName(SERIALIZED_NAME_PAYER_I_D)
  private String payerID;

  public static final String SERIALIZED_NAME_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  @SerializedName(SERIALIZED_NAME_RECURRING_DETAIL_REFERENCE)
  private String recurringDetailReference;

  public static final String SERIALIZED_NAME_STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
  @SerializedName(SERIALIZED_NAME_STORED_PAYMENT_METHOD_ID)
  private String storedPaymentMethodId;

  /**
   * The type of flow to initiate.
   */
  @JsonAdapter(SubtypeEnum.Adapter.class)
  public enum SubtypeEnum {
    REDIRECT("redirect"),
    
    SDK("sdk");

    private String value;

    SubtypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubtypeEnum fromValue(String value) {
      for (SubtypeEnum b : SubtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SubtypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubtypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubtypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SubtypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SUBTYPE = "subtype";
  @SerializedName(SERIALIZED_NAME_SUBTYPE)
  private SubtypeEnum subtype;

  /**
   * **paypal**
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PAYPAL("paypal");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.PAYPAL;

  public PayPalDetails() { 
  }

  public PayPalDetails orderID(String orderID) {
    
    this.orderID = orderID;
    return this;
  }

   /**
   * The unique ID associated with the order.
   * @return orderID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID associated with the order.")

  public String getOrderID() {
    return orderID;
  }


  public void setOrderID(String orderID) {
    this.orderID = orderID;
  }


  public PayPalDetails payerID(String payerID) {
    
    this.payerID = payerID;
    return this;
  }

   /**
   * The unique ID associated with the payer.
   * @return payerID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID associated with the payer.")

  public String getPayerID() {
    return payerID;
  }


  public void setPayerID(String payerID) {
    this.payerID = payerID;
  }


  public PayPalDetails recurringDetailReference(String recurringDetailReference) {
    
    this.recurringDetailReference = recurringDetailReference;
    return this;
  }

   /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   * @return recurringDetailReference
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This is the `recurringDetailReference` returned in the response when you created the token.")

  public String getRecurringDetailReference() {
    return recurringDetailReference;
  }


  public void setRecurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
  }


  public PayPalDetails storedPaymentMethodId(String storedPaymentMethodId) {
    
    this.storedPaymentMethodId = storedPaymentMethodId;
    return this;
  }

   /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   * @return storedPaymentMethodId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This is the `recurringDetailReference` returned in the response when you created the token.")

  public String getStoredPaymentMethodId() {
    return storedPaymentMethodId;
  }


  public void setStoredPaymentMethodId(String storedPaymentMethodId) {
    this.storedPaymentMethodId = storedPaymentMethodId;
  }


  public PayPalDetails subtype(SubtypeEnum subtype) {
    
    this.subtype = subtype;
    return this;
  }

   /**
   * The type of flow to initiate.
   * @return subtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of flow to initiate.")

  public SubtypeEnum getSubtype() {
    return subtype;
  }


  public void setSubtype(SubtypeEnum subtype) {
    this.subtype = subtype;
  }


  public PayPalDetails type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * **paypal**
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "**paypal**")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
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
    PayPalDetails payPalDetails = (PayPalDetails) o;
    return Objects.equals(this.orderID, payPalDetails.orderID) &&
        Objects.equals(this.payerID, payPalDetails.payerID) &&
        Objects.equals(this.recurringDetailReference, payPalDetails.recurringDetailReference) &&
        Objects.equals(this.storedPaymentMethodId, payPalDetails.storedPaymentMethodId) &&
        Objects.equals(this.subtype, payPalDetails.subtype) &&
        Objects.equals(this.type, payPalDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderID, payerID, recurringDetailReference, storedPaymentMethodId, subtype, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayPalDetails {\n");
    sb.append("    orderID: ").append(toIndentedString(orderID)).append("\n");
    sb.append("    payerID: ").append(toIndentedString(payerID)).append("\n");
    sb.append("    recurringDetailReference: ").append(toIndentedString(recurringDetailReference)).append("\n");
    sb.append("    storedPaymentMethodId: ").append(toIndentedString(storedPaymentMethodId)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
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
    openapiFields.add("orderID");
    openapiFields.add("payerID");
    openapiFields.add("recurringDetailReference");
    openapiFields.add("storedPaymentMethodId");
    openapiFields.add("subtype");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayPalDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PayPalDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayPalDetails is not found in the empty JSON string", PayPalDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PayPalDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PayPalDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PayPalDetails.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field orderID
      if (jsonObj.get("orderID") != null && !jsonObj.get("orderID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderID").toString()));
      }
      // validate the optional field payerID
      if (jsonObj.get("payerID") != null && !jsonObj.get("payerID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payerID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payerID").toString()));
      }
      // validate the optional field recurringDetailReference
      if (jsonObj.get("recurringDetailReference") != null && !jsonObj.get("recurringDetailReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recurringDetailReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recurringDetailReference").toString()));
      }
      // validate the optional field storedPaymentMethodId
      if (jsonObj.get("storedPaymentMethodId") != null && !jsonObj.get("storedPaymentMethodId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storedPaymentMethodId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storedPaymentMethodId").toString()));
      }
      // ensure the field subtype can be parsed to an enum value
      if (jsonObj.get("subtype") != null) {
        if(!jsonObj.get("subtype").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `subtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subtype").toString()));
        }
        SubtypeEnum.fromValue(jsonObj.get("subtype").getAsString());
      }
      // ensure the field type can be parsed to an enum value
      if (jsonObj.get("type") != null) {
        if(!jsonObj.get("type").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
        }
        TypeEnum.fromValue(jsonObj.get("type").getAsString());
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayPalDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayPalDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayPalDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayPalDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<PayPalDetails>() {
           @Override
           public void write(JsonWriter out, PayPalDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PayPalDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PayPalDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayPalDetails
  * @throws IOException if the JSON string is invalid with respect to PayPalDetails
  */
  public static PayPalDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayPalDetails.class);
  }

 /**
  * Convert an instance of PayPalDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

