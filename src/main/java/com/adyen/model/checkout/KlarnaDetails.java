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
 * KlarnaDetails
 */

public class KlarnaDetails {
  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private String billingAddress;

  public static final String SERIALIZED_NAME_DELIVERY_ADDRESS = "deliveryAddress";
  @SerializedName(SERIALIZED_NAME_DELIVERY_ADDRESS)
  private String deliveryAddress;

  public static final String SERIALIZED_NAME_PERSONAL_DETAILS = "personalDetails";
  @SerializedName(SERIALIZED_NAME_PERSONAL_DETAILS)
  private String personalDetails;

  public static final String SERIALIZED_NAME_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  @SerializedName(SERIALIZED_NAME_RECURRING_DETAIL_REFERENCE)
  private String recurringDetailReference;

  public static final String SERIALIZED_NAME_STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
  @SerializedName(SERIALIZED_NAME_STORED_PAYMENT_METHOD_ID)
  private String storedPaymentMethodId;

  /**
   * **klarna**
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    KLARNA("klarna"),
    
    KLARNAPAYMENTS("klarnapayments"),
    
    KLARNAPAYMENTS_ACCOUNT("klarnapayments_account"),
    
    KLARNAPAYMENTS_B2B("klarnapayments_b2b"),
    
    KLARNA_PAYNOW("klarna_paynow"),
    
    KLARNA_ACCOUNT("klarna_account"),
    
    KLARNA_B2B("klarna_b2b");

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
  private TypeEnum type = TypeEnum.KLARNA;

  public KlarnaDetails() { 
  }

  public KlarnaDetails billingAddress(String billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * The address where to send the invoice.
   * @return billingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The address where to send the invoice.")

  public String getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(String billingAddress) {
    this.billingAddress = billingAddress;
  }


  public KlarnaDetails deliveryAddress(String deliveryAddress) {
    
    this.deliveryAddress = deliveryAddress;
    return this;
  }

   /**
   * The address where the goods should be delivered.
   * @return deliveryAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The address where the goods should be delivered.")

  public String getDeliveryAddress() {
    return deliveryAddress;
  }


  public void setDeliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }


  public KlarnaDetails personalDetails(String personalDetails) {
    
    this.personalDetails = personalDetails;
    return this;
  }

   /**
   * Shopper name, date of birth, phone number, and email address.
   * @return personalDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shopper name, date of birth, phone number, and email address.")

  public String getPersonalDetails() {
    return personalDetails;
  }


  public void setPersonalDetails(String personalDetails) {
    this.personalDetails = personalDetails;
  }


  public KlarnaDetails recurringDetailReference(String recurringDetailReference) {
    
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


  public KlarnaDetails storedPaymentMethodId(String storedPaymentMethodId) {
    
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


  public KlarnaDetails type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * **klarna**
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "**klarna**")

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
    KlarnaDetails klarnaDetails = (KlarnaDetails) o;
    return Objects.equals(this.billingAddress, klarnaDetails.billingAddress) &&
        Objects.equals(this.deliveryAddress, klarnaDetails.deliveryAddress) &&
        Objects.equals(this.personalDetails, klarnaDetails.personalDetails) &&
        Objects.equals(this.recurringDetailReference, klarnaDetails.recurringDetailReference) &&
        Objects.equals(this.storedPaymentMethodId, klarnaDetails.storedPaymentMethodId) &&
        Objects.equals(this.type, klarnaDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, deliveryAddress, personalDetails, recurringDetailReference, storedPaymentMethodId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KlarnaDetails {\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
    sb.append("    personalDetails: ").append(toIndentedString(personalDetails)).append("\n");
    sb.append("    recurringDetailReference: ").append(toIndentedString(recurringDetailReference)).append("\n");
    sb.append("    storedPaymentMethodId: ").append(toIndentedString(storedPaymentMethodId)).append("\n");
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
    openapiFields.add("billingAddress");
    openapiFields.add("deliveryAddress");
    openapiFields.add("personalDetails");
    openapiFields.add("recurringDetailReference");
    openapiFields.add("storedPaymentMethodId");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KlarnaDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (KlarnaDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in KlarnaDetails is not found in the empty JSON string", KlarnaDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KlarnaDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KlarnaDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : KlarnaDetails.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field billingAddress
      if (jsonObj.get("billingAddress") != null && !jsonObj.get("billingAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billingAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingAddress").toString()));
      }
      // validate the optional field deliveryAddress
      if (jsonObj.get("deliveryAddress") != null && !jsonObj.get("deliveryAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliveryAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveryAddress").toString()));
      }
      // validate the optional field personalDetails
      if (jsonObj.get("personalDetails") != null && !jsonObj.get("personalDetails").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `personalDetails` to be a primitive type in the JSON string but got `%s`", jsonObj.get("personalDetails").toString()));
      }
      // validate the optional field recurringDetailReference
      if (jsonObj.get("recurringDetailReference") != null && !jsonObj.get("recurringDetailReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recurringDetailReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recurringDetailReference").toString()));
      }
      // validate the optional field storedPaymentMethodId
      if (jsonObj.get("storedPaymentMethodId") != null && !jsonObj.get("storedPaymentMethodId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storedPaymentMethodId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storedPaymentMethodId").toString()));
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
       if (!KlarnaDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KlarnaDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KlarnaDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KlarnaDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<KlarnaDetails>() {
           @Override
           public void write(JsonWriter out, KlarnaDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KlarnaDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KlarnaDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KlarnaDetails
  * @throws IOException if the JSON string is invalid with respect to KlarnaDetails
  */
  public static KlarnaDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KlarnaDetails.class);
  }

 /**
  * Convert an instance of KlarnaDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

