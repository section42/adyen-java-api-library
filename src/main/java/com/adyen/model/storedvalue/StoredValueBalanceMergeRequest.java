/*
 * Adyen Stored Value API
 * A set of API endpoints to manage stored value products.
 *
 * The version of the OpenAPI document: 46
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.storedvalue;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.storedvalue.Amount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.adyen.model.storedvalue.JSON;

/**
 * StoredValueBalanceMergeRequest
 */

public class StoredValueBalanceMergeRequest {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Amount amount;

  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT = "merchantAccount";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT)
  private String merchantAccount;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "paymentMethod";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private Map<String, String> paymentMethod = new HashMap<>();

  public static final String SERIALIZED_NAME_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  @SerializedName(SERIALIZED_NAME_RECURRING_DETAIL_REFERENCE)
  private String recurringDetailReference;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  /**
   * Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * &#x60;Ecommerce&#x60; - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * &#x60;ContAuth&#x60; - Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * &#x60;Moto&#x60; - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * &#x60;POS&#x60; - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.
   */
  @JsonAdapter(ShopperInteractionEnum.Adapter.class)
  public enum ShopperInteractionEnum {
    ECOMMERCE("Ecommerce"),
    
    CONTAUTH("ContAuth"),
    
    MOTO("Moto"),
    
    POS("POS");

    private String value;

    ShopperInteractionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShopperInteractionEnum fromValue(String value) {
      for (ShopperInteractionEnum b : ShopperInteractionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ShopperInteractionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShopperInteractionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShopperInteractionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ShopperInteractionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SHOPPER_INTERACTION = "shopperInteraction";
  @SerializedName(SERIALIZED_NAME_SHOPPER_INTERACTION)
  private ShopperInteractionEnum shopperInteraction;

  public static final String SERIALIZED_NAME_SHOPPER_REFERENCE = "shopperReference";
  @SerializedName(SERIALIZED_NAME_SHOPPER_REFERENCE)
  private String shopperReference;

  public static final String SERIALIZED_NAME_SOURCE_PAYMENT_METHOD = "sourcePaymentMethod";
  @SerializedName(SERIALIZED_NAME_SOURCE_PAYMENT_METHOD)
  private Map<String, String> sourcePaymentMethod = new HashMap<>();

  public static final String SERIALIZED_NAME_STORE = "store";
  @SerializedName(SERIALIZED_NAME_STORE)
  private String store;

  public StoredValueBalanceMergeRequest() { 
  }

  public StoredValueBalanceMergeRequest amount(Amount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")

  public Amount getAmount() {
    return amount;
  }


  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public StoredValueBalanceMergeRequest merchantAccount(String merchantAccount) {
    
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account identifier, with which you want to process the transaction.
   * @return merchantAccount
  **/
  @ApiModelProperty(required = true, value = "The merchant account identifier, with which you want to process the transaction.")

  public String getMerchantAccount() {
    return merchantAccount;
  }


  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public StoredValueBalanceMergeRequest paymentMethod(Map<String, String> paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

  public StoredValueBalanceMergeRequest putPaymentMethodItem(String key, String paymentMethodItem) {
    this.paymentMethod.put(key, paymentMethodItem);
    return this;
  }

   /**
   * The collection that contains the type of the payment method and its specific information if available
   * @return paymentMethod
  **/
  @ApiModelProperty(required = true, value = "The collection that contains the type of the payment method and its specific information if available")

  public Map<String, String> getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(Map<String, String> paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public StoredValueBalanceMergeRequest recurringDetailReference(String recurringDetailReference) {
    
    this.recurringDetailReference = recurringDetailReference;
    return this;
  }

   /**
   * Get recurringDetailReference
   * @return recurringDetailReference
  **/
  @ApiModelProperty(value = "")

  public String getRecurringDetailReference() {
    return recurringDetailReference;
  }


  public void setRecurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
  }


  public StoredValueBalanceMergeRequest reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * The reference to uniquely identify a payment. This reference is used in all communication with you about the payment status. We recommend using a unique value per payment; however, it is not a requirement. If you need to provide multiple references for a transaction, separate them with hyphens (\&quot;-\&quot;). Maximum length: 80 characters.
   * @return reference
  **/
  @ApiModelProperty(required = true, value = "The reference to uniquely identify a payment. This reference is used in all communication with you about the payment status. We recommend using a unique value per payment; however, it is not a requirement. If you need to provide multiple references for a transaction, separate them with hyphens (\"-\"). Maximum length: 80 characters.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public StoredValueBalanceMergeRequest shopperInteraction(ShopperInteractionEnum shopperInteraction) {
    
    this.shopperInteraction = shopperInteraction;
    return this;
  }

   /**
   * Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * &#x60;Ecommerce&#x60; - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * &#x60;ContAuth&#x60; - Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * &#x60;Moto&#x60; - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * &#x60;POS&#x60; - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.
   * @return shopperInteraction
  **/
  @ApiModelProperty(value = "Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * `Ecommerce` - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * `ContAuth` - Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * `Moto` - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * `POS` - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.")

  public ShopperInteractionEnum getShopperInteraction() {
    return shopperInteraction;
  }


  public void setShopperInteraction(ShopperInteractionEnum shopperInteraction) {
    this.shopperInteraction = shopperInteraction;
  }


  public StoredValueBalanceMergeRequest shopperReference(String shopperReference) {
    
    this.shopperReference = shopperReference;
    return this;
  }

   /**
   * Get shopperReference
   * @return shopperReference
  **/
  @ApiModelProperty(value = "")

  public String getShopperReference() {
    return shopperReference;
  }


  public void setShopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
  }


  public StoredValueBalanceMergeRequest sourcePaymentMethod(Map<String, String> sourcePaymentMethod) {
    
    this.sourcePaymentMethod = sourcePaymentMethod;
    return this;
  }

  public StoredValueBalanceMergeRequest putSourcePaymentMethodItem(String key, String sourcePaymentMethodItem) {
    this.sourcePaymentMethod.put(key, sourcePaymentMethodItem);
    return this;
  }

   /**
   * The collection that contains the source payment method and its specific information if available. Note that type should not be included since it is inferred from the (target) payment method
   * @return sourcePaymentMethod
  **/
  @ApiModelProperty(required = true, value = "The collection that contains the source payment method and its specific information if available. Note that type should not be included since it is inferred from the (target) payment method")

  public Map<String, String> getSourcePaymentMethod() {
    return sourcePaymentMethod;
  }


  public void setSourcePaymentMethod(Map<String, String> sourcePaymentMethod) {
    this.sourcePaymentMethod = sourcePaymentMethod;
  }


  public StoredValueBalanceMergeRequest store(String store) {
    
    this.store = store;
    return this;
  }

   /**
   * The physical store, for which this payment is processed.
   * @return store
  **/
  @ApiModelProperty(value = "The physical store, for which this payment is processed.")

  public String getStore() {
    return store;
  }


  public void setStore(String store) {
    this.store = store;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoredValueBalanceMergeRequest storedValueBalanceMergeRequest = (StoredValueBalanceMergeRequest) o;
    return Objects.equals(this.amount, storedValueBalanceMergeRequest.amount) &&
        Objects.equals(this.merchantAccount, storedValueBalanceMergeRequest.merchantAccount) &&
        Objects.equals(this.paymentMethod, storedValueBalanceMergeRequest.paymentMethod) &&
        Objects.equals(this.recurringDetailReference, storedValueBalanceMergeRequest.recurringDetailReference) &&
        Objects.equals(this.reference, storedValueBalanceMergeRequest.reference) &&
        Objects.equals(this.shopperInteraction, storedValueBalanceMergeRequest.shopperInteraction) &&
        Objects.equals(this.shopperReference, storedValueBalanceMergeRequest.shopperReference) &&
        Objects.equals(this.sourcePaymentMethod, storedValueBalanceMergeRequest.sourcePaymentMethod) &&
        Objects.equals(this.store, storedValueBalanceMergeRequest.store);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, merchantAccount, paymentMethod, recurringDetailReference, reference, shopperInteraction, shopperReference, sourcePaymentMethod, store);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoredValueBalanceMergeRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    recurringDetailReference: ").append(toIndentedString(recurringDetailReference)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    shopperInteraction: ").append(toIndentedString(shopperInteraction)).append("\n");
    sb.append("    shopperReference: ").append(toIndentedString(shopperReference)).append("\n");
    sb.append("    sourcePaymentMethod: ").append(toIndentedString(sourcePaymentMethod)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("merchantAccount");
    openapiFields.add("paymentMethod");
    openapiFields.add("recurringDetailReference");
    openapiFields.add("reference");
    openapiFields.add("shopperInteraction");
    openapiFields.add("shopperReference");
    openapiFields.add("sourcePaymentMethod");
    openapiFields.add("store");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("merchantAccount");
    openapiRequiredFields.add("paymentMethod");
    openapiRequiredFields.add("reference");
    openapiRequiredFields.add("sourcePaymentMethod");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(StoredValueBalanceMergeRequest.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StoredValueBalanceMergeRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (StoredValueBalanceMergeRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in StoredValueBalanceMergeRequest is not found in the empty JSON string", StoredValueBalanceMergeRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StoredValueBalanceMergeRequest.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `StoredValueBalanceMergeRequest` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StoredValueBalanceMergeRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `amount`
      if (jsonObj.getAsJsonObject("amount") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("amount"));
      }
      // validate the optional field merchantAccount
      if (jsonObj.get("merchantAccount") != null && !jsonObj.get("merchantAccount").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `merchantAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantAccount").toString()));
      }
      // validate the optional field recurringDetailReference
      if (jsonObj.get("recurringDetailReference") != null && !jsonObj.get("recurringDetailReference").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `recurringDetailReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recurringDetailReference").toString()));
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      // ensure the field shopperInteraction can be parsed to an enum value
      if (jsonObj.get("shopperInteraction") != null) {
        if(!jsonObj.get("shopperInteraction").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `shopperInteraction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperInteraction").toString()));
        }
        ShopperInteractionEnum.fromValue(jsonObj.get("shopperInteraction").getAsString());
      }
      // validate the optional field shopperReference
      if (jsonObj.get("shopperReference") != null && !jsonObj.get("shopperReference").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `shopperReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperReference").toString()));
      }
      // validate the optional field store
      if (jsonObj.get("store") != null && !jsonObj.get("store").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `store` to be a primitive type in the JSON string but got `%s`", jsonObj.get("store").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StoredValueBalanceMergeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StoredValueBalanceMergeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StoredValueBalanceMergeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StoredValueBalanceMergeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<StoredValueBalanceMergeRequest>() {
           @Override
           public void write(JsonWriter out, StoredValueBalanceMergeRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StoredValueBalanceMergeRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StoredValueBalanceMergeRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StoredValueBalanceMergeRequest
  * @throws IOException if the JSON string is invalid with respect to StoredValueBalanceMergeRequest
  */
  public static StoredValueBalanceMergeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StoredValueBalanceMergeRequest.class);
  }

 /**
  * Convert an instance of StoredValueBalanceMergeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

