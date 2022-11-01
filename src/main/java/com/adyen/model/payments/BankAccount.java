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

/**
 * BankAccount
 */

public class BankAccount {
  public static final String SERIALIZED_NAME_BANK_ACCOUNT_NUMBER = "bankAccountNumber";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT_NUMBER)
  private String bankAccountNumber;

  public static final String SERIALIZED_NAME_BANK_CITY = "bankCity";
  @SerializedName(SERIALIZED_NAME_BANK_CITY)
  private String bankCity;

  public static final String SERIALIZED_NAME_BANK_LOCATION_ID = "bankLocationId";
  @SerializedName(SERIALIZED_NAME_BANK_LOCATION_ID)
  private String bankLocationId;

  public static final String SERIALIZED_NAME_BANK_NAME = "bankName";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private String bankName;

  public static final String SERIALIZED_NAME_BIC = "bic";
  @SerializedName(SERIALIZED_NAME_BIC)
  private String bic;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  private String iban;

  public static final String SERIALIZED_NAME_OWNER_NAME = "ownerName";
  @SerializedName(SERIALIZED_NAME_OWNER_NAME)
  private String ownerName;

  public static final String SERIALIZED_NAME_TAX_ID = "taxId";
  @SerializedName(SERIALIZED_NAME_TAX_ID)
  private String taxId;

  public BankAccount() { 
  }

  public BankAccount bankAccountNumber(String bankAccountNumber) {
    
    this.bankAccountNumber = bankAccountNumber;
    return this;
  }

   /**
   * The bank account number (without separators).
   * @return bankAccountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The bank account number (without separators).")

  public String getBankAccountNumber() {
    return bankAccountNumber;
  }


  public void setBankAccountNumber(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
  }


  public BankAccount bankCity(String bankCity) {
    
    this.bankCity = bankCity;
    return this;
  }

   /**
   * The bank city.
   * @return bankCity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The bank city.")

  public String getBankCity() {
    return bankCity;
  }


  public void setBankCity(String bankCity) {
    this.bankCity = bankCity;
  }


  public BankAccount bankLocationId(String bankLocationId) {
    
    this.bankLocationId = bankLocationId;
    return this;
  }

   /**
   * The location id of the bank. The field value is &#x60;nil&#x60; in most cases.
   * @return bankLocationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The location id of the bank. The field value is `nil` in most cases.")

  public String getBankLocationId() {
    return bankLocationId;
  }


  public void setBankLocationId(String bankLocationId) {
    this.bankLocationId = bankLocationId;
  }


  public BankAccount bankName(String bankName) {
    
    this.bankName = bankName;
    return this;
  }

   /**
   * The name of the bank.
   * @return bankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the bank.")

  public String getBankName() {
    return bankName;
  }


  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  public BankAccount bic(String bic) {
    
    this.bic = bic;
    return this;
  }

   /**
   * The [Business Identifier Code](https://en.wikipedia.org/wiki/ISO_9362) (BIC) is the SWIFT address assigned to a bank. The field value is &#x60;nil&#x60; in most cases.
   * @return bic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The [Business Identifier Code](https://en.wikipedia.org/wiki/ISO_9362) (BIC) is the SWIFT address assigned to a bank. The field value is `nil` in most cases.")

  public String getBic() {
    return bic;
  }


  public void setBic(String bic) {
    this.bic = bic;
  }


  public BankAccount countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Country code where the bank is located.  A valid value is an ISO two-character country code (e.g. &#39;NL&#39;).
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country code where the bank is located.  A valid value is an ISO two-character country code (e.g. 'NL').")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public BankAccount iban(String iban) {
    
    this.iban = iban;
    return this;
  }

   /**
   * The [International Bank Account Number](https://en.wikipedia.org/wiki/International_Bank_Account_Number) (IBAN).
   * @return iban
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The [International Bank Account Number](https://en.wikipedia.org/wiki/International_Bank_Account_Number) (IBAN).")

  public String getIban() {
    return iban;
  }


  public void setIban(String iban) {
    this.iban = iban;
  }


  public BankAccount ownerName(String ownerName) {
    
    this.ownerName = ownerName;
    return this;
  }

   /**
   * The name of the bank account holder. If you submit a name with non-Latin characters, we automatically replace some of them with corresponding Latin characters to meet the FATF recommendations. For example: * χ12 is converted to ch12. * üA is converted to euA. * Peter Møller is converted to Peter Mller, because banks don&#39;t accept &#39;ø&#39;. After replacement, the ownerName must have at least three alphanumeric characters (A-Z, a-z, 0-9), and at least one of them must be a valid Latin character (A-Z, a-z). For example: * John17 - allowed. * J17 - allowed. * 171 - not allowed. * John-7 - allowed. &gt; If provided details don&#39;t match the required format, the response returns the error message: 203 &#39;Invalid bank account holder name&#39;.
   * @return ownerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the bank account holder. If you submit a name with non-Latin characters, we automatically replace some of them with corresponding Latin characters to meet the FATF recommendations. For example: * χ12 is converted to ch12. * üA is converted to euA. * Peter Møller is converted to Peter Mller, because banks don't accept 'ø'. After replacement, the ownerName must have at least three alphanumeric characters (A-Z, a-z, 0-9), and at least one of them must be a valid Latin character (A-Z, a-z). For example: * John17 - allowed. * J17 - allowed. * 171 - not allowed. * John-7 - allowed. > If provided details don't match the required format, the response returns the error message: 203 'Invalid bank account holder name'.")

  public String getOwnerName() {
    return ownerName;
  }


  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }


  public BankAccount taxId(String taxId) {
    
    this.taxId = taxId;
    return this;
  }

   /**
   * The bank account holder&#39;s tax ID.
   * @return taxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The bank account holder's tax ID.")

  public String getTaxId() {
    return taxId;
  }


  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankAccount bankAccount = (BankAccount) o;
    return Objects.equals(this.bankAccountNumber, bankAccount.bankAccountNumber) &&
        Objects.equals(this.bankCity, bankAccount.bankCity) &&
        Objects.equals(this.bankLocationId, bankAccount.bankLocationId) &&
        Objects.equals(this.bankName, bankAccount.bankName) &&
        Objects.equals(this.bic, bankAccount.bic) &&
        Objects.equals(this.countryCode, bankAccount.countryCode) &&
        Objects.equals(this.iban, bankAccount.iban) &&
        Objects.equals(this.ownerName, bankAccount.ownerName) &&
        Objects.equals(this.taxId, bankAccount.taxId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccountNumber, bankCity, bankLocationId, bankName, bic, countryCode, iban, ownerName, taxId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankAccount {\n");
    sb.append("    bankAccountNumber: ").append(toIndentedString(bankAccountNumber)).append("\n");
    sb.append("    bankCity: ").append(toIndentedString(bankCity)).append("\n");
    sb.append("    bankLocationId: ").append(toIndentedString(bankLocationId)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
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
    openapiFields.add("bankAccountNumber");
    openapiFields.add("bankCity");
    openapiFields.add("bankLocationId");
    openapiFields.add("bankName");
    openapiFields.add("bic");
    openapiFields.add("countryCode");
    openapiFields.add("iban");
    openapiFields.add("ownerName");
    openapiFields.add("taxId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BankAccount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BankAccount.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BankAccount is not found in the empty JSON string", BankAccount.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BankAccount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BankAccount` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("bankAccountNumber") != null && !jsonObj.get("bankAccountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bankAccountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bankAccountNumber").toString()));
      }
      if (jsonObj.get("bankCity") != null && !jsonObj.get("bankCity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bankCity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bankCity").toString()));
      }
      if (jsonObj.get("bankLocationId") != null && !jsonObj.get("bankLocationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bankLocationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bankLocationId").toString()));
      }
      if (jsonObj.get("bankName") != null && !jsonObj.get("bankName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bankName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bankName").toString()));
      }
      if (jsonObj.get("bic") != null && !jsonObj.get("bic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bic").toString()));
      }
      if (jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      if (jsonObj.get("iban") != null && !jsonObj.get("iban").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iban` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iban").toString()));
      }
      if (jsonObj.get("ownerName") != null && !jsonObj.get("ownerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownerName").toString()));
      }
      if (jsonObj.get("taxId") != null && !jsonObj.get("taxId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BankAccount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BankAccount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BankAccount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BankAccount.class));

       return (TypeAdapter<T>) new TypeAdapter<BankAccount>() {
           @Override
           public void write(JsonWriter out, BankAccount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BankAccount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

}

