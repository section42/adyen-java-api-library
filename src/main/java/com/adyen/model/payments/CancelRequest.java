/*
 * Adyen Payment API
 *
 * The version of the OpenAPI document: 68
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payments;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.payments.Split;
import com.adyen.model.payments.ThreeDSecureData;
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

/**
 * CancelRequest
 */

public class CancelRequest {
  public static final String SERIALIZED_NAME_ADDITIONAL_DATA = "additionalData";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DATA)
  private Map<String, String> additionalData = null;

  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT = "merchantAccount";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT)
  private String merchantAccount;

  public static final String SERIALIZED_NAME_MPI_DATA = "mpiData";
  @SerializedName(SERIALIZED_NAME_MPI_DATA)
  private ThreeDSecureData mpiData;

  public static final String SERIALIZED_NAME_ORIGINAL_MERCHANT_REFERENCE = "originalMerchantReference";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_MERCHANT_REFERENCE)
  private String originalMerchantReference;

  public static final String SERIALIZED_NAME_ORIGINAL_REFERENCE = "originalReference";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_REFERENCE)
  private String originalReference;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_SPLITS = "splits";
  @SerializedName(SERIALIZED_NAME_SPLITS)
  private List<Split> splits = null;

  public static final String SERIALIZED_NAME_TENDER_REFERENCE = "tenderReference";
  @SerializedName(SERIALIZED_NAME_TENDER_REFERENCE)
  private String tenderReference;

  public static final String SERIALIZED_NAME_UNIQUE_TERMINAL_ID = "uniqueTerminalId";
  @SerializedName(SERIALIZED_NAME_UNIQUE_TERMINAL_ID)
  private String uniqueTerminalId;

  public CancelRequest() { 
  }

  public CancelRequest additionalData(Map<String, String> additionalData) {
    
    this.additionalData = additionalData;
    return this;
  }

  public CancelRequest putAdditionalDataItem(String key, String additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new HashMap<>();
    }
    this.additionalData.put(key, additionalDataItem);
    return this;
  }

   /**
   * This field contains additional data, which may be required for a particular modification request.  The additionalData object consists of entries, each of which includes the key and value.
   * @return additionalData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field contains additional data, which may be required for a particular modification request.  The additionalData object consists of entries, each of which includes the key and value.")

  public Map<String, String> getAdditionalData() {
    return additionalData;
  }


  public void setAdditionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
  }


  public CancelRequest merchantAccount(String merchantAccount) {
    
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account that is used to process the payment.
   * @return merchantAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The merchant account that is used to process the payment.")

  public String getMerchantAccount() {
    return merchantAccount;
  }


  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public CancelRequest mpiData(ThreeDSecureData mpiData) {
    
    this.mpiData = mpiData;
    return this;
  }

   /**
   * Get mpiData
   * @return mpiData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ThreeDSecureData getMpiData() {
    return mpiData;
  }


  public void setMpiData(ThreeDSecureData mpiData) {
    this.mpiData = mpiData;
  }


  public CancelRequest originalMerchantReference(String originalMerchantReference) {
    
    this.originalMerchantReference = originalMerchantReference;
    return this;
  }

   /**
   * The original merchant reference to cancel.
   * @return originalMerchantReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The original merchant reference to cancel.")

  public String getOriginalMerchantReference() {
    return originalMerchantReference;
  }


  public void setOriginalMerchantReference(String originalMerchantReference) {
    this.originalMerchantReference = originalMerchantReference;
  }


  public CancelRequest originalReference(String originalReference) {
    
    this.originalReference = originalReference;
    return this;
  }

   /**
   * The original pspReference of the payment to modify. This reference is returned in: * authorisation response * authorisation notification  
   * @return originalReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The original pspReference of the payment to modify. This reference is returned in: * authorisation response * authorisation notification  ")

  public String getOriginalReference() {
    return originalReference;
  }


  public void setOriginalReference(String originalReference) {
    this.originalReference = originalReference;
  }


  public CancelRequest reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the payment modification. This reference is visible in Customer Area and in reports. Maximum length: 80 characters.
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your reference for the payment modification. This reference is visible in Customer Area and in reports. Maximum length: 80 characters.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public CancelRequest splits(List<Split> splits) {
    
    this.splits = splits;
    return this;
  }

  public CancelRequest addSplitsItem(Split splitsItem) {
    if (this.splits == null) {
      this.splits = new ArrayList<>();
    }
    this.splits.add(splitsItem);
    return this;
  }

   /**
   * An array of objects specifying how the amount should be split between accounts when using Adyen for Platforms. For details, refer to [Providing split information](https://docs.adyen.com/platforms/processing-payments#providing-split-information).
   * @return splits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of objects specifying how the amount should be split between accounts when using Adyen for Platforms. For details, refer to [Providing split information](https://docs.adyen.com/platforms/processing-payments#providing-split-information).")

  public List<Split> getSplits() {
    return splits;
  }


  public void setSplits(List<Split> splits) {
    this.splits = splits;
  }


  public CancelRequest tenderReference(String tenderReference) {
    
    this.tenderReference = tenderReference;
    return this;
  }

   /**
   * The transaction reference provided by the PED. For point-of-sale integrations only.
   * @return tenderReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The transaction reference provided by the PED. For point-of-sale integrations only.")

  public String getTenderReference() {
    return tenderReference;
  }


  public void setTenderReference(String tenderReference) {
    this.tenderReference = tenderReference;
  }


  public CancelRequest uniqueTerminalId(String uniqueTerminalId) {
    
    this.uniqueTerminalId = uniqueTerminalId;
    return this;
  }

   /**
   * Unique terminal ID for the PED that originally processed the request. For point-of-sale integrations only.
   * @return uniqueTerminalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique terminal ID for the PED that originally processed the request. For point-of-sale integrations only.")

  public String getUniqueTerminalId() {
    return uniqueTerminalId;
  }


  public void setUniqueTerminalId(String uniqueTerminalId) {
    this.uniqueTerminalId = uniqueTerminalId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelRequest cancelRequest = (CancelRequest) o;
    return Objects.equals(this.additionalData, cancelRequest.additionalData) &&
        Objects.equals(this.merchantAccount, cancelRequest.merchantAccount) &&
        Objects.equals(this.mpiData, cancelRequest.mpiData) &&
        Objects.equals(this.originalMerchantReference, cancelRequest.originalMerchantReference) &&
        Objects.equals(this.originalReference, cancelRequest.originalReference) &&
        Objects.equals(this.reference, cancelRequest.reference) &&
        Objects.equals(this.splits, cancelRequest.splits) &&
        Objects.equals(this.tenderReference, cancelRequest.tenderReference) &&
        Objects.equals(this.uniqueTerminalId, cancelRequest.uniqueTerminalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, merchantAccount, mpiData, originalMerchantReference, originalReference, reference, splits, tenderReference, uniqueTerminalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelRequest {\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    mpiData: ").append(toIndentedString(mpiData)).append("\n");
    sb.append("    originalMerchantReference: ").append(toIndentedString(originalMerchantReference)).append("\n");
    sb.append("    originalReference: ").append(toIndentedString(originalReference)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    splits: ").append(toIndentedString(splits)).append("\n");
    sb.append("    tenderReference: ").append(toIndentedString(tenderReference)).append("\n");
    sb.append("    uniqueTerminalId: ").append(toIndentedString(uniqueTerminalId)).append("\n");
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
    openapiFields.add("additionalData");
    openapiFields.add("merchantAccount");
    openapiFields.add("mpiData");
    openapiFields.add("originalMerchantReference");
    openapiFields.add("originalReference");
    openapiFields.add("reference");
    openapiFields.add("splits");
    openapiFields.add("tenderReference");
    openapiFields.add("uniqueTerminalId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("merchantAccount");
    openapiRequiredFields.add("originalReference");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CancelRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CancelRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CancelRequest is not found in the empty JSON string", CancelRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CancelRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CancelRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CancelRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("merchantAccount") != null && !jsonObj.get("merchantAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantAccount").toString()));
      }
      // validate the optional field `mpiData`
      if (jsonObj.getAsJsonObject("mpiData") != null) {
        ThreeDSecureData.validateJsonObject(jsonObj.getAsJsonObject("mpiData"));
      }
      if (jsonObj.get("originalMerchantReference") != null && !jsonObj.get("originalMerchantReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originalMerchantReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originalMerchantReference").toString()));
      }
      if (jsonObj.get("originalReference") != null && !jsonObj.get("originalReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originalReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originalReference").toString()));
      }
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      JsonArray jsonArraysplits = jsonObj.getAsJsonArray("splits");
      if (jsonArraysplits != null) {
        // ensure the json data is an array
        if (!jsonObj.get("splits").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `splits` to be an array in the JSON string but got `%s`", jsonObj.get("splits").toString()));
        }

        // validate the optional field `splits` (array)
        for (int i = 0; i < jsonArraysplits.size(); i++) {
          Split.validateJsonObject(jsonArraysplits.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("tenderReference") != null && !jsonObj.get("tenderReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenderReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenderReference").toString()));
      }
      if (jsonObj.get("uniqueTerminalId") != null && !jsonObj.get("uniqueTerminalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uniqueTerminalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uniqueTerminalId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CancelRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CancelRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CancelRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CancelRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CancelRequest>() {
           @Override
           public void write(JsonWriter out, CancelRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CancelRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

}

