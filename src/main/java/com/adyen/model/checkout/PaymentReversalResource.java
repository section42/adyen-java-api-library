/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
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
import java.util.logging.Level;
import java.util.logging.Logger;

import com.adyen.model.checkout.JSON;

/**
 * PaymentReversalResource
 */

public class PaymentReversalResource {
  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT = "merchantAccount";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT)
  private String merchantAccount;

  public static final String SERIALIZED_NAME_PAYMENT_PSP_REFERENCE = "paymentPspReference";
  @SerializedName(SERIALIZED_NAME_PAYMENT_PSP_REFERENCE)
  private String paymentPspReference;

  public static final String SERIALIZED_NAME_PSP_REFERENCE = "pspReference";
  @SerializedName(SERIALIZED_NAME_PSP_REFERENCE)
  private String pspReference;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  /**
   * The status of your request. This will always have the value **received**.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    RECEIVED("received");

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

  public PaymentReversalResource() { 
  }

  public PaymentReversalResource merchantAccount(String merchantAccount) {
    
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


  public PaymentReversalResource paymentPspReference(String paymentPspReference) {
    
    this.paymentPspReference = paymentPspReference;
    return this;
  }

   /**
   * The [&#x60;pspReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment to reverse. 
   * @return paymentPspReference
  **/
  @ApiModelProperty(required = true, value = "The [`pspReference`](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment to reverse. ")

  public String getPaymentPspReference() {
    return paymentPspReference;
  }


  public void setPaymentPspReference(String paymentPspReference) {
    this.paymentPspReference = paymentPspReference;
  }


  public PaymentReversalResource pspReference(String pspReference) {
    
    this.pspReference = pspReference;
    return this;
  }

   /**
   * Adyen&#39;s 16-character reference associated with the reversal request.
   * @return pspReference
  **/
  @ApiModelProperty(required = true, value = "Adyen's 16-character reference associated with the reversal request.")

  public String getPspReference() {
    return pspReference;
  }


  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }


  public PaymentReversalResource reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the reversal request.
   * @return reference
  **/
  @ApiModelProperty(value = "Your reference for the reversal request.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public PaymentReversalResource status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of your request. This will always have the value **received**.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of your request. This will always have the value **received**.")

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
    PaymentReversalResource paymentReversalResource = (PaymentReversalResource) o;
    return Objects.equals(this.merchantAccount, paymentReversalResource.merchantAccount) &&
        Objects.equals(this.paymentPspReference, paymentReversalResource.paymentPspReference) &&
        Objects.equals(this.pspReference, paymentReversalResource.pspReference) &&
        Objects.equals(this.reference, paymentReversalResource.reference) &&
        Objects.equals(this.status, paymentReversalResource.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantAccount, paymentPspReference, pspReference, reference, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentReversalResource {\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    paymentPspReference: ").append(toIndentedString(paymentPspReference)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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
    openapiFields.add("merchantAccount");
    openapiFields.add("paymentPspReference");
    openapiFields.add("pspReference");
    openapiFields.add("reference");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("merchantAccount");
    openapiRequiredFields.add("paymentPspReference");
    openapiRequiredFields.add("pspReference");
    openapiRequiredFields.add("status");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(PaymentReversalResource.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentReversalResource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentReversalResource.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentReversalResource is not found in the empty JSON string", PaymentReversalResource.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentReversalResource.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `PaymentReversalResource` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentReversalResource.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field merchantAccount
      if (jsonObj.get("merchantAccount") != null && !jsonObj.get("merchantAccount").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `merchantAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantAccount").toString()));
      }
      // validate the optional field paymentPspReference
      if (jsonObj.get("paymentPspReference") != null && !jsonObj.get("paymentPspReference").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `paymentPspReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentPspReference").toString()));
      }
      // validate the optional field pspReference
      if (jsonObj.get("pspReference") != null && !jsonObj.get("pspReference").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `pspReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pspReference").toString()));
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
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
       if (!PaymentReversalResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentReversalResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentReversalResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentReversalResource.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentReversalResource>() {
           @Override
           public void write(JsonWriter out, PaymentReversalResource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentReversalResource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentReversalResource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentReversalResource
  * @throws IOException if the JSON string is invalid with respect to PaymentReversalResource
  */
  public static PaymentReversalResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentReversalResource.class);
  }

 /**
  * Convert an instance of PaymentReversalResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

