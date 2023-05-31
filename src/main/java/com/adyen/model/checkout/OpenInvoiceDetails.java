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
 * OpenInvoiceDetails
 */

public class OpenInvoiceDetails {
  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private String billingAddress;

  public static final String SERIALIZED_NAME_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  @SerializedName(SERIALIZED_NAME_CHECKOUT_ATTEMPT_ID)
  private String checkoutAttemptId;

  public static final String SERIALIZED_NAME_DELIVERY_ADDRESS = "deliveryAddress";
  @SerializedName(SERIALIZED_NAME_DELIVERY_ADDRESS)
  private String deliveryAddress;

  public static final String SERIALIZED_NAME_PERSONAL_DETAILS = "personalDetails";
  @SerializedName(SERIALIZED_NAME_PERSONAL_DETAILS)
  private String personalDetails;

  public static final String SERIALIZED_NAME_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_RECURRING_DETAIL_REFERENCE)
  private String recurringDetailReference;

  public static final String SERIALIZED_NAME_STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
  @SerializedName(SERIALIZED_NAME_STORED_PAYMENT_METHOD_ID)
  private String storedPaymentMethodId;

  /**
   * **openinvoice**
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    OPENINVOICE("openinvoice"),
    
    AFTERPAY_DIRECTDEBIT("afterpay_directdebit"),
    
    ATOME_POS("atome_pos");

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
  private TypeEnum type = TypeEnum.OPENINVOICE;

  public OpenInvoiceDetails() { 
  }

  public OpenInvoiceDetails billingAddress(String billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * The address where to send the invoice.
   * @return billingAddress
  **/
  @ApiModelProperty(value = "The address where to send the invoice.")

  public String getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(String billingAddress) {
    this.billingAddress = billingAddress;
  }


  public OpenInvoiceDetails checkoutAttemptId(String checkoutAttemptId) {
    
    this.checkoutAttemptId = checkoutAttemptId;
    return this;
  }

   /**
   * The checkout attempt identifier.
   * @return checkoutAttemptId
  **/
  @ApiModelProperty(value = "The checkout attempt identifier.")

  public String getCheckoutAttemptId() {
    return checkoutAttemptId;
  }


  public void setCheckoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
  }


  public OpenInvoiceDetails deliveryAddress(String deliveryAddress) {
    
    this.deliveryAddress = deliveryAddress;
    return this;
  }

   /**
   * The address where the goods should be delivered.
   * @return deliveryAddress
  **/
  @ApiModelProperty(value = "The address where the goods should be delivered.")

  public String getDeliveryAddress() {
    return deliveryAddress;
  }


  public void setDeliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }


  public OpenInvoiceDetails personalDetails(String personalDetails) {
    
    this.personalDetails = personalDetails;
    return this;
  }

   /**
   * Shopper name, date of birth, phone number, and email address.
   * @return personalDetails
  **/
  @ApiModelProperty(value = "Shopper name, date of birth, phone number, and email address.")

  public String getPersonalDetails() {
    return personalDetails;
  }


  public void setPersonalDetails(String personalDetails) {
    this.personalDetails = personalDetails;
  }


  @Deprecated
  public OpenInvoiceDetails recurringDetailReference(String recurringDetailReference) {
    
    this.recurringDetailReference = recurringDetailReference;
    return this;
  }

   /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   * @return recurringDetailReference
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "This is the `recurringDetailReference` returned in the response when you created the token.")

  public String getRecurringDetailReference() {
    return recurringDetailReference;
  }


  @Deprecated
  public void setRecurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
  }


  public OpenInvoiceDetails storedPaymentMethodId(String storedPaymentMethodId) {
    
    this.storedPaymentMethodId = storedPaymentMethodId;
    return this;
  }

   /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   * @return storedPaymentMethodId
  **/
  @ApiModelProperty(value = "This is the `recurringDetailReference` returned in the response when you created the token.")

  public String getStoredPaymentMethodId() {
    return storedPaymentMethodId;
  }


  public void setStoredPaymentMethodId(String storedPaymentMethodId) {
    this.storedPaymentMethodId = storedPaymentMethodId;
  }


  public OpenInvoiceDetails type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * **openinvoice**
   * @return type
  **/
  @ApiModelProperty(value = "**openinvoice**")

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
    OpenInvoiceDetails openInvoiceDetails = (OpenInvoiceDetails) o;
    return Objects.equals(this.billingAddress, openInvoiceDetails.billingAddress) &&
        Objects.equals(this.checkoutAttemptId, openInvoiceDetails.checkoutAttemptId) &&
        Objects.equals(this.deliveryAddress, openInvoiceDetails.deliveryAddress) &&
        Objects.equals(this.personalDetails, openInvoiceDetails.personalDetails) &&
        Objects.equals(this.recurringDetailReference, openInvoiceDetails.recurringDetailReference) &&
        Objects.equals(this.storedPaymentMethodId, openInvoiceDetails.storedPaymentMethodId) &&
        Objects.equals(this.type, openInvoiceDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, checkoutAttemptId, deliveryAddress, personalDetails, recurringDetailReference, storedPaymentMethodId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenInvoiceDetails {\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
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
    openapiFields.add("checkoutAttemptId");
    openapiFields.add("deliveryAddress");
    openapiFields.add("personalDetails");
    openapiFields.add("recurringDetailReference");
    openapiFields.add("storedPaymentMethodId");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(OpenInvoiceDetails.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OpenInvoiceDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OpenInvoiceDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OpenInvoiceDetails is not found in the empty JSON string", OpenInvoiceDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OpenInvoiceDetails.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `OpenInvoiceDetails` properties.", entry.getKey()));
        }
      }
      // validate the optional field billingAddress
      if (jsonObj.get("billingAddress") != null && !jsonObj.get("billingAddress").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `billingAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingAddress").toString()));
      }
      // validate the optional field checkoutAttemptId
      if (jsonObj.get("checkoutAttemptId") != null && !jsonObj.get("checkoutAttemptId").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `checkoutAttemptId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkoutAttemptId").toString()));
      }
      // validate the optional field deliveryAddress
      if (jsonObj.get("deliveryAddress") != null && !jsonObj.get("deliveryAddress").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `deliveryAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveryAddress").toString()));
      }
      // validate the optional field personalDetails
      if (jsonObj.get("personalDetails") != null && !jsonObj.get("personalDetails").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `personalDetails` to be a primitive type in the JSON string but got `%s`", jsonObj.get("personalDetails").toString()));
      }
      // validate the optional field recurringDetailReference
      if (jsonObj.get("recurringDetailReference") != null && !jsonObj.get("recurringDetailReference").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `recurringDetailReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recurringDetailReference").toString()));
      }
      // validate the optional field storedPaymentMethodId
      if (jsonObj.get("storedPaymentMethodId") != null && !jsonObj.get("storedPaymentMethodId").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `storedPaymentMethodId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storedPaymentMethodId").toString()));
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
       if (!OpenInvoiceDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OpenInvoiceDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OpenInvoiceDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OpenInvoiceDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<OpenInvoiceDetails>() {
           @Override
           public void write(JsonWriter out, OpenInvoiceDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OpenInvoiceDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OpenInvoiceDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OpenInvoiceDetails
  * @throws IOException if the JSON string is invalid with respect to OpenInvoiceDetails
  */
  public static OpenInvoiceDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpenInvoiceDetails.class);
  }

 /**
  * Convert an instance of OpenInvoiceDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

