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
import com.adyen.model.checkout.InputDetail;
import com.adyen.model.checkout.PaymentMethodGroup;
import com.adyen.model.checkout.PaymentMethodIssuer;
import com.adyen.model.checkout.StoredDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
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

import com.adyen.model.checkout.JSON;

/**
 * RecurringDetail
 */

public class RecurringDetail {
  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_BRANDS = "brands";
  @SerializedName(SERIALIZED_NAME_BRANDS)
  private List<String> brands = null;

  public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION)
  private Map<String, String> configuration = null;

  /**
   * The funding source of the payment method.
   */
  @JsonAdapter(FundingSourceEnum.Adapter.class)
  public enum FundingSourceEnum {
    DEBIT("debit");

    private String value;

    FundingSourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FundingSourceEnum fromValue(String value) {
      for (FundingSourceEnum b : FundingSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FundingSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FundingSourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FundingSourceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FundingSourceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FUNDING_SOURCE = "fundingSource";
  @SerializedName(SERIALIZED_NAME_FUNDING_SOURCE)
  private FundingSourceEnum fundingSource;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private PaymentMethodGroup group;

  public static final String SERIALIZED_NAME_INPUT_DETAILS = "inputDetails";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_INPUT_DETAILS)
  private List<InputDetail> inputDetails = null;

  public static final String SERIALIZED_NAME_ISSUERS = "issuers";
  @SerializedName(SERIALIZED_NAME_ISSUERS)
  private List<PaymentMethodIssuer> issuers = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  @SerializedName(SERIALIZED_NAME_RECURRING_DETAIL_REFERENCE)
  private String recurringDetailReference;

  public static final String SERIALIZED_NAME_STORED_DETAILS = "storedDetails";
  @SerializedName(SERIALIZED_NAME_STORED_DETAILS)
  private StoredDetails storedDetails;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public RecurringDetail() { 
  }

  public RecurringDetail brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * Brand for the selected gift card. For example: plastix, hmclub.
   * @return brand
  **/
  @ApiModelProperty(value = "Brand for the selected gift card. For example: plastix, hmclub.")

  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {
    this.brand = brand;
  }


  public RecurringDetail brands(List<String> brands) {
    
    this.brands = brands;
    return this;
  }

  public RecurringDetail addBrandsItem(String brandsItem) {
    if (this.brands == null) {
      this.brands = new ArrayList<>();
    }
    this.brands.add(brandsItem);
    return this;
  }

   /**
   * List of possible brands. For example: visa, mc.
   * @return brands
  **/
  @ApiModelProperty(value = "List of possible brands. For example: visa, mc.")

  public List<String> getBrands() {
    return brands;
  }


  public void setBrands(List<String> brands) {
    this.brands = brands;
  }


  public RecurringDetail configuration(Map<String, String> configuration) {
    
    this.configuration = configuration;
    return this;
  }

  public RecurringDetail putConfigurationItem(String key, String configurationItem) {
    if (this.configuration == null) {
      this.configuration = new HashMap<>();
    }
    this.configuration.put(key, configurationItem);
    return this;
  }

   /**
   * The configuration of the payment method.
   * @return configuration
  **/
  @ApiModelProperty(value = "The configuration of the payment method.")

  public Map<String, String> getConfiguration() {
    return configuration;
  }


  public void setConfiguration(Map<String, String> configuration) {
    this.configuration = configuration;
  }


  public RecurringDetail fundingSource(FundingSourceEnum fundingSource) {
    
    this.fundingSource = fundingSource;
    return this;
  }

   /**
   * The funding source of the payment method.
   * @return fundingSource
  **/
  @ApiModelProperty(value = "The funding source of the payment method.")

  public FundingSourceEnum getFundingSource() {
    return fundingSource;
  }


  public void setFundingSource(FundingSourceEnum fundingSource) {
    this.fundingSource = fundingSource;
  }


  public RecurringDetail group(PaymentMethodGroup group) {
    
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(value = "")

  public PaymentMethodGroup getGroup() {
    return group;
  }


  public void setGroup(PaymentMethodGroup group) {
    this.group = group;
  }


  @Deprecated
  public RecurringDetail inputDetails(List<InputDetail> inputDetails) {
    
    this.inputDetails = inputDetails;
    return this;
  }

  public RecurringDetail addInputDetailsItem(InputDetail inputDetailsItem) {
    if (this.inputDetails == null) {
      this.inputDetails = new ArrayList<>();
    }
    this.inputDetails.add(inputDetailsItem);
    return this;
  }

   /**
   * All input details to be provided to complete the payment with this payment method.
   * @return inputDetails
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "All input details to be provided to complete the payment with this payment method.")

  public List<InputDetail> getInputDetails() {
    return inputDetails;
  }


  @Deprecated
  public void setInputDetails(List<InputDetail> inputDetails) {
    this.inputDetails = inputDetails;
  }


  public RecurringDetail issuers(List<PaymentMethodIssuer> issuers) {
    
    this.issuers = issuers;
    return this;
  }

  public RecurringDetail addIssuersItem(PaymentMethodIssuer issuersItem) {
    if (this.issuers == null) {
      this.issuers = new ArrayList<>();
    }
    this.issuers.add(issuersItem);
    return this;
  }

   /**
   * A list of issuers for this payment method.
   * @return issuers
  **/
  @ApiModelProperty(value = "A list of issuers for this payment method.")

  public List<PaymentMethodIssuer> getIssuers() {
    return issuers;
  }


  public void setIssuers(List<PaymentMethodIssuer> issuers) {
    this.issuers = issuers;
  }


  public RecurringDetail name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The displayable name of this payment method.
   * @return name
  **/
  @ApiModelProperty(value = "The displayable name of this payment method.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RecurringDetail recurringDetailReference(String recurringDetailReference) {
    
    this.recurringDetailReference = recurringDetailReference;
    return this;
  }

   /**
   * The reference that uniquely identifies the recurring detail.
   * @return recurringDetailReference
  **/
  @ApiModelProperty(value = "The reference that uniquely identifies the recurring detail.")

  public String getRecurringDetailReference() {
    return recurringDetailReference;
  }


  public void setRecurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
  }


  public RecurringDetail storedDetails(StoredDetails storedDetails) {
    
    this.storedDetails = storedDetails;
    return this;
  }

   /**
   * Get storedDetails
   * @return storedDetails
  **/
  @ApiModelProperty(value = "")

  public StoredDetails getStoredDetails() {
    return storedDetails;
  }


  public void setStoredDetails(StoredDetails storedDetails) {
    this.storedDetails = storedDetails;
  }


  public RecurringDetail type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The unique payment method code.
   * @return type
  **/
  @ApiModelProperty(value = "The unique payment method code.")

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
    RecurringDetail recurringDetail = (RecurringDetail) o;
    return Objects.equals(this.brand, recurringDetail.brand) &&
        Objects.equals(this.brands, recurringDetail.brands) &&
        Objects.equals(this.configuration, recurringDetail.configuration) &&
        Objects.equals(this.fundingSource, recurringDetail.fundingSource) &&
        Objects.equals(this.group, recurringDetail.group) &&
        Objects.equals(this.inputDetails, recurringDetail.inputDetails) &&
        Objects.equals(this.issuers, recurringDetail.issuers) &&
        Objects.equals(this.name, recurringDetail.name) &&
        Objects.equals(this.recurringDetailReference, recurringDetail.recurringDetailReference) &&
        Objects.equals(this.storedDetails, recurringDetail.storedDetails) &&
        Objects.equals(this.type, recurringDetail.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, brands, configuration, fundingSource, group, inputDetails, issuers, name, recurringDetailReference, storedDetails, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringDetail {\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    brands: ").append(toIndentedString(brands)).append("\n");
    sb.append("    configuration: ").append(toIndentedString(configuration)).append("\n");
    sb.append("    fundingSource: ").append(toIndentedString(fundingSource)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    inputDetails: ").append(toIndentedString(inputDetails)).append("\n");
    sb.append("    issuers: ").append(toIndentedString(issuers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recurringDetailReference: ").append(toIndentedString(recurringDetailReference)).append("\n");
    sb.append("    storedDetails: ").append(toIndentedString(storedDetails)).append("\n");
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
    openapiFields.add("brand");
    openapiFields.add("brands");
    openapiFields.add("configuration");
    openapiFields.add("fundingSource");
    openapiFields.add("group");
    openapiFields.add("inputDetails");
    openapiFields.add("issuers");
    openapiFields.add("name");
    openapiFields.add("recurringDetailReference");
    openapiFields.add("storedDetails");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(RecurringDetail.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RecurringDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RecurringDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecurringDetail is not found in the empty JSON string", RecurringDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RecurringDetail.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `RecurringDetail` properties.", entry.getKey()));
        }
      }
      // validate the optional field brand
      if (jsonObj.get("brand") != null && !jsonObj.get("brand").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("brands") != null && !jsonObj.get("brands").isJsonArray()) {
        log.log(Level.WARNING, String.format("Expected the field `brands` to be an array in the JSON string but got `%s`", jsonObj.get("brands").toString()));
      }
      // ensure the field fundingSource can be parsed to an enum value
      if (jsonObj.get("fundingSource") != null) {
        if(!jsonObj.get("fundingSource").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `fundingSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fundingSource").toString()));
        }
        FundingSourceEnum.fromValue(jsonObj.get("fundingSource").getAsString());
      }
      // validate the optional field `group`
      if (jsonObj.getAsJsonObject("group") != null) {
        PaymentMethodGroup.validateJsonObject(jsonObj.getAsJsonObject("group"));
      }
      JsonArray jsonArrayinputDetails = jsonObj.getAsJsonArray("inputDetails");
      if (jsonArrayinputDetails != null) {
        // ensure the json data is an array
        if (!jsonObj.get("inputDetails").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `inputDetails` to be an array in the JSON string but got `%s`", jsonObj.get("inputDetails").toString()));
        }

        // validate the optional field `inputDetails` (array)
        for (int i = 0; i < jsonArrayinputDetails.size(); i++) {
          InputDetail.validateJsonObject(jsonArrayinputDetails.get(i).getAsJsonObject());
        }
      }
      JsonArray jsonArrayissuers = jsonObj.getAsJsonArray("issuers");
      if (jsonArrayissuers != null) {
        // ensure the json data is an array
        if (!jsonObj.get("issuers").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `issuers` to be an array in the JSON string but got `%s`", jsonObj.get("issuers").toString()));
        }

        // validate the optional field `issuers` (array)
        for (int i = 0; i < jsonArrayissuers.size(); i++) {
          PaymentMethodIssuer.validateJsonObject(jsonArrayissuers.get(i).getAsJsonObject());
        }
      }
      // validate the optional field name
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field recurringDetailReference
      if (jsonObj.get("recurringDetailReference") != null && !jsonObj.get("recurringDetailReference").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `recurringDetailReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recurringDetailReference").toString()));
      }
      // validate the optional field `storedDetails`
      if (jsonObj.getAsJsonObject("storedDetails") != null) {
        StoredDetails.validateJsonObject(jsonObj.getAsJsonObject("storedDetails"));
      }
      // validate the optional field type
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecurringDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecurringDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecurringDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecurringDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<RecurringDetail>() {
           @Override
           public void write(JsonWriter out, RecurringDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecurringDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RecurringDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecurringDetail
  * @throws IOException if the JSON string is invalid with respect to RecurringDetail
  */
  public static RecurringDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecurringDetail.class);
  }

 /**
  * Convert an instance of RecurringDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

