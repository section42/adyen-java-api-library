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
 * ResponseAdditionalDataInstallments
 */

public class ResponseAdditionalDataInstallments {
  public static final String SERIALIZED_NAME_INSTALLMENT_PAYMENT_DATA_INSTALLMENT_TYPE = "installmentPaymentData.installmentType";
  @SerializedName(SERIALIZED_NAME_INSTALLMENT_PAYMENT_DATA_INSTALLMENT_TYPE)
  private String installmentPaymentDataInstallmentType;

  public static final String SERIALIZED_NAME_INSTALLMENT_PAYMENT_DATA_OPTION_ITEM_NR_ANNUAL_PERCENTAGE_RATE = "installmentPaymentData.option[itemNr].annualPercentageRate";
  @SerializedName(SERIALIZED_NAME_INSTALLMENT_PAYMENT_DATA_OPTION_ITEM_NR_ANNUAL_PERCENTAGE_RATE)
  private String installmentPaymentDataOptionItemNrAnnualPercentageRate;

  public static final String SERIALIZED_NAME_INSTALLMENT_PAYMENT_DATA_OPTION_ITEM_NR_FIRST_INSTALLMENT_AMOUNT = "installmentPaymentData.option[itemNr].firstInstallmentAmount";
  @SerializedName(SERIALIZED_NAME_INSTALLMENT_PAYMENT_DATA_OPTION_ITEM_NR_FIRST_INSTALLMENT_AMOUNT)
  private String installmentPaymentDataOptionItemNrFirstInstallmentAmount;

  public static final String SERIALIZED_NAME_INSTALLMENT_PAYMENT_DATA_OPTION_ITEM_NR_INSTALLMENT_FEE = "installmentPaymentData.option[itemNr].installmentFee";
  @SerializedName(SERIALIZED_NAME_INSTALLMENT_PAYMENT_DATA_OPTION_ITEM_NR_INSTALLMENT_FEE)
  private String installmentPaymentDataOptionItemNrInstallmentFee;

  public static final String SERIALIZED_NAME_INSTALLMENT_PAYMENT_DATA_OPTION_ITEM_NR_INTEREST_RATE = "installmentPaymentData.option[itemNr].interestRate";
  @SerializedName(SERIALIZED_NAME_INSTALLMENT_PAYMENT_DATA_OPTION_ITEM_NR_INTEREST_RATE)
  private String installmentPaymentDataOptionItemNrInterestRate;

  public static final String SERIALIZED_NAME_INSTALLMENT_PAYMENT_DATA_OPTION_ITEM_NR_MAXIMUM_NUMBER_OF_INSTALLMENTS = "installmentPaymentData.option[itemNr].maximumNumberOfInstallments";
  @SerializedName(SERIALIZED_NAME_INSTALLMENT_PAYMENT_DATA_OPTION_ITEM_NR_MAXIMUM_NUMBER_OF_INSTALLMENTS)
  private String installmentPaymentDataOptionItemNrMaximumNumberOfInstallments;

  public static final String SERIALIZED_NAME_INSTALLMENT_PAYMENT_DATA_OPTION_ITEM_NR_MINIMUM_NUMBER_OF_INSTALLMENTS = "installmentPaymentData.option[itemNr].minimumNumberOfInstallments";
  @SerializedName(SERIALIZED_NAME_INSTALLMENT_PAYMENT_DATA_OPTION_ITEM_NR_MINIMUM_NUMBER_OF_INSTALLMENTS)
  private String installmentPaymentDataOptionItemNrMinimumNumberOfInstallments;

  public static final String SERIALIZED_NAME_INSTALLMENT_PAYMENT_DATA_OPTION_ITEM_NR_NUMBER_OF_INSTALLMENTS = "installmentPaymentData.option[itemNr].numberOfInstallments";
  @SerializedName(SERIALIZED_NAME_INSTALLMENT_PAYMENT_DATA_OPTION_ITEM_NR_NUMBER_OF_INSTALLMENTS)
  private String installmentPaymentDataOptionItemNrNumberOfInstallments;

  public static final String SERIALIZED_NAME_INSTALLMENT_PAYMENT_DATA_OPTION_ITEM_NR_SUBSEQUENT_INSTALLMENT_AMOUNT = "installmentPaymentData.option[itemNr].subsequentInstallmentAmount";
  @SerializedName(SERIALIZED_NAME_INSTALLMENT_PAYMENT_DATA_OPTION_ITEM_NR_SUBSEQUENT_INSTALLMENT_AMOUNT)
  private String installmentPaymentDataOptionItemNrSubsequentInstallmentAmount;

  public static final String SERIALIZED_NAME_INSTALLMENT_PAYMENT_DATA_OPTION_ITEM_NR_TOTAL_AMOUNT_DUE = "installmentPaymentData.option[itemNr].totalAmountDue";
  @SerializedName(SERIALIZED_NAME_INSTALLMENT_PAYMENT_DATA_OPTION_ITEM_NR_TOTAL_AMOUNT_DUE)
  private String installmentPaymentDataOptionItemNrTotalAmountDue;

  public static final String SERIALIZED_NAME_INSTALLMENT_PAYMENT_DATA_PAYMENT_OPTIONS = "installmentPaymentData.paymentOptions";
  @SerializedName(SERIALIZED_NAME_INSTALLMENT_PAYMENT_DATA_PAYMENT_OPTIONS)
  private String installmentPaymentDataPaymentOptions;

  public static final String SERIALIZED_NAME_INSTALLMENTS_VALUE = "installments.value";
  @SerializedName(SERIALIZED_NAME_INSTALLMENTS_VALUE)
  private String installmentsValue;

  public ResponseAdditionalDataInstallments() { 
  }

  public ResponseAdditionalDataInstallments installmentPaymentDataInstallmentType(String installmentPaymentDataInstallmentType) {
    
    this.installmentPaymentDataInstallmentType = installmentPaymentDataInstallmentType;
    return this;
  }

   /**
   * Type of installment. The value of &#x60;installmentType&#x60; should be **IssuerFinanced**.
   * @return installmentPaymentDataInstallmentType
  **/
  @ApiModelProperty(value = "Type of installment. The value of `installmentType` should be **IssuerFinanced**.")

  public String getInstallmentPaymentDataInstallmentType() {
    return installmentPaymentDataInstallmentType;
  }


  public void setInstallmentPaymentDataInstallmentType(String installmentPaymentDataInstallmentType) {
    this.installmentPaymentDataInstallmentType = installmentPaymentDataInstallmentType;
  }


  public ResponseAdditionalDataInstallments installmentPaymentDataOptionItemNrAnnualPercentageRate(String installmentPaymentDataOptionItemNrAnnualPercentageRate) {
    
    this.installmentPaymentDataOptionItemNrAnnualPercentageRate = installmentPaymentDataOptionItemNrAnnualPercentageRate;
    return this;
  }

   /**
   * Annual interest rate.
   * @return installmentPaymentDataOptionItemNrAnnualPercentageRate
  **/
  @ApiModelProperty(value = "Annual interest rate.")

  public String getInstallmentPaymentDataOptionItemNrAnnualPercentageRate() {
    return installmentPaymentDataOptionItemNrAnnualPercentageRate;
  }


  public void setInstallmentPaymentDataOptionItemNrAnnualPercentageRate(String installmentPaymentDataOptionItemNrAnnualPercentageRate) {
    this.installmentPaymentDataOptionItemNrAnnualPercentageRate = installmentPaymentDataOptionItemNrAnnualPercentageRate;
  }


  public ResponseAdditionalDataInstallments installmentPaymentDataOptionItemNrFirstInstallmentAmount(String installmentPaymentDataOptionItemNrFirstInstallmentAmount) {
    
    this.installmentPaymentDataOptionItemNrFirstInstallmentAmount = installmentPaymentDataOptionItemNrFirstInstallmentAmount;
    return this;
  }

   /**
   * First Installment Amount in minor units.
   * @return installmentPaymentDataOptionItemNrFirstInstallmentAmount
  **/
  @ApiModelProperty(value = "First Installment Amount in minor units.")

  public String getInstallmentPaymentDataOptionItemNrFirstInstallmentAmount() {
    return installmentPaymentDataOptionItemNrFirstInstallmentAmount;
  }


  public void setInstallmentPaymentDataOptionItemNrFirstInstallmentAmount(String installmentPaymentDataOptionItemNrFirstInstallmentAmount) {
    this.installmentPaymentDataOptionItemNrFirstInstallmentAmount = installmentPaymentDataOptionItemNrFirstInstallmentAmount;
  }


  public ResponseAdditionalDataInstallments installmentPaymentDataOptionItemNrInstallmentFee(String installmentPaymentDataOptionItemNrInstallmentFee) {
    
    this.installmentPaymentDataOptionItemNrInstallmentFee = installmentPaymentDataOptionItemNrInstallmentFee;
    return this;
  }

   /**
   * Installment fee amount in minor units.
   * @return installmentPaymentDataOptionItemNrInstallmentFee
  **/
  @ApiModelProperty(value = "Installment fee amount in minor units.")

  public String getInstallmentPaymentDataOptionItemNrInstallmentFee() {
    return installmentPaymentDataOptionItemNrInstallmentFee;
  }


  public void setInstallmentPaymentDataOptionItemNrInstallmentFee(String installmentPaymentDataOptionItemNrInstallmentFee) {
    this.installmentPaymentDataOptionItemNrInstallmentFee = installmentPaymentDataOptionItemNrInstallmentFee;
  }


  public ResponseAdditionalDataInstallments installmentPaymentDataOptionItemNrInterestRate(String installmentPaymentDataOptionItemNrInterestRate) {
    
    this.installmentPaymentDataOptionItemNrInterestRate = installmentPaymentDataOptionItemNrInterestRate;
    return this;
  }

   /**
   * Interest rate for the installment period.
   * @return installmentPaymentDataOptionItemNrInterestRate
  **/
  @ApiModelProperty(value = "Interest rate for the installment period.")

  public String getInstallmentPaymentDataOptionItemNrInterestRate() {
    return installmentPaymentDataOptionItemNrInterestRate;
  }


  public void setInstallmentPaymentDataOptionItemNrInterestRate(String installmentPaymentDataOptionItemNrInterestRate) {
    this.installmentPaymentDataOptionItemNrInterestRate = installmentPaymentDataOptionItemNrInterestRate;
  }


  public ResponseAdditionalDataInstallments installmentPaymentDataOptionItemNrMaximumNumberOfInstallments(String installmentPaymentDataOptionItemNrMaximumNumberOfInstallments) {
    
    this.installmentPaymentDataOptionItemNrMaximumNumberOfInstallments = installmentPaymentDataOptionItemNrMaximumNumberOfInstallments;
    return this;
  }

   /**
   * Maximum number of installments possible for this payment.
   * @return installmentPaymentDataOptionItemNrMaximumNumberOfInstallments
  **/
  @ApiModelProperty(value = "Maximum number of installments possible for this payment.")

  public String getInstallmentPaymentDataOptionItemNrMaximumNumberOfInstallments() {
    return installmentPaymentDataOptionItemNrMaximumNumberOfInstallments;
  }


  public void setInstallmentPaymentDataOptionItemNrMaximumNumberOfInstallments(String installmentPaymentDataOptionItemNrMaximumNumberOfInstallments) {
    this.installmentPaymentDataOptionItemNrMaximumNumberOfInstallments = installmentPaymentDataOptionItemNrMaximumNumberOfInstallments;
  }


  public ResponseAdditionalDataInstallments installmentPaymentDataOptionItemNrMinimumNumberOfInstallments(String installmentPaymentDataOptionItemNrMinimumNumberOfInstallments) {
    
    this.installmentPaymentDataOptionItemNrMinimumNumberOfInstallments = installmentPaymentDataOptionItemNrMinimumNumberOfInstallments;
    return this;
  }

   /**
   * Minimum number of installments possible for this payment.
   * @return installmentPaymentDataOptionItemNrMinimumNumberOfInstallments
  **/
  @ApiModelProperty(value = "Minimum number of installments possible for this payment.")

  public String getInstallmentPaymentDataOptionItemNrMinimumNumberOfInstallments() {
    return installmentPaymentDataOptionItemNrMinimumNumberOfInstallments;
  }


  public void setInstallmentPaymentDataOptionItemNrMinimumNumberOfInstallments(String installmentPaymentDataOptionItemNrMinimumNumberOfInstallments) {
    this.installmentPaymentDataOptionItemNrMinimumNumberOfInstallments = installmentPaymentDataOptionItemNrMinimumNumberOfInstallments;
  }


  public ResponseAdditionalDataInstallments installmentPaymentDataOptionItemNrNumberOfInstallments(String installmentPaymentDataOptionItemNrNumberOfInstallments) {
    
    this.installmentPaymentDataOptionItemNrNumberOfInstallments = installmentPaymentDataOptionItemNrNumberOfInstallments;
    return this;
  }

   /**
   * Total number of installments possible for this payment.
   * @return installmentPaymentDataOptionItemNrNumberOfInstallments
  **/
  @ApiModelProperty(value = "Total number of installments possible for this payment.")

  public String getInstallmentPaymentDataOptionItemNrNumberOfInstallments() {
    return installmentPaymentDataOptionItemNrNumberOfInstallments;
  }


  public void setInstallmentPaymentDataOptionItemNrNumberOfInstallments(String installmentPaymentDataOptionItemNrNumberOfInstallments) {
    this.installmentPaymentDataOptionItemNrNumberOfInstallments = installmentPaymentDataOptionItemNrNumberOfInstallments;
  }


  public ResponseAdditionalDataInstallments installmentPaymentDataOptionItemNrSubsequentInstallmentAmount(String installmentPaymentDataOptionItemNrSubsequentInstallmentAmount) {
    
    this.installmentPaymentDataOptionItemNrSubsequentInstallmentAmount = installmentPaymentDataOptionItemNrSubsequentInstallmentAmount;
    return this;
  }

   /**
   * Subsequent Installment Amount in minor units.
   * @return installmentPaymentDataOptionItemNrSubsequentInstallmentAmount
  **/
  @ApiModelProperty(value = "Subsequent Installment Amount in minor units.")

  public String getInstallmentPaymentDataOptionItemNrSubsequentInstallmentAmount() {
    return installmentPaymentDataOptionItemNrSubsequentInstallmentAmount;
  }


  public void setInstallmentPaymentDataOptionItemNrSubsequentInstallmentAmount(String installmentPaymentDataOptionItemNrSubsequentInstallmentAmount) {
    this.installmentPaymentDataOptionItemNrSubsequentInstallmentAmount = installmentPaymentDataOptionItemNrSubsequentInstallmentAmount;
  }


  public ResponseAdditionalDataInstallments installmentPaymentDataOptionItemNrTotalAmountDue(String installmentPaymentDataOptionItemNrTotalAmountDue) {
    
    this.installmentPaymentDataOptionItemNrTotalAmountDue = installmentPaymentDataOptionItemNrTotalAmountDue;
    return this;
  }

   /**
   * Total amount in minor units.
   * @return installmentPaymentDataOptionItemNrTotalAmountDue
  **/
  @ApiModelProperty(value = "Total amount in minor units.")

  public String getInstallmentPaymentDataOptionItemNrTotalAmountDue() {
    return installmentPaymentDataOptionItemNrTotalAmountDue;
  }


  public void setInstallmentPaymentDataOptionItemNrTotalAmountDue(String installmentPaymentDataOptionItemNrTotalAmountDue) {
    this.installmentPaymentDataOptionItemNrTotalAmountDue = installmentPaymentDataOptionItemNrTotalAmountDue;
  }


  public ResponseAdditionalDataInstallments installmentPaymentDataPaymentOptions(String installmentPaymentDataPaymentOptions) {
    
    this.installmentPaymentDataPaymentOptions = installmentPaymentDataPaymentOptions;
    return this;
  }

   /**
   * Possible values: * PayInInstallmentsOnly * PayInFullOnly * PayInFullOrInstallments
   * @return installmentPaymentDataPaymentOptions
  **/
  @ApiModelProperty(value = "Possible values: * PayInInstallmentsOnly * PayInFullOnly * PayInFullOrInstallments")

  public String getInstallmentPaymentDataPaymentOptions() {
    return installmentPaymentDataPaymentOptions;
  }


  public void setInstallmentPaymentDataPaymentOptions(String installmentPaymentDataPaymentOptions) {
    this.installmentPaymentDataPaymentOptions = installmentPaymentDataPaymentOptions;
  }


  public ResponseAdditionalDataInstallments installmentsValue(String installmentsValue) {
    
    this.installmentsValue = installmentsValue;
    return this;
  }

   /**
   * The number of installments that the payment amount should be charged with.  Example: 5 &gt; Only relevant for card payments in countries that support installments.
   * @return installmentsValue
  **/
  @ApiModelProperty(value = "The number of installments that the payment amount should be charged with.  Example: 5 > Only relevant for card payments in countries that support installments.")

  public String getInstallmentsValue() {
    return installmentsValue;
  }


  public void setInstallmentsValue(String installmentsValue) {
    this.installmentsValue = installmentsValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseAdditionalDataInstallments responseAdditionalDataInstallments = (ResponseAdditionalDataInstallments) o;
    return Objects.equals(this.installmentPaymentDataInstallmentType, responseAdditionalDataInstallments.installmentPaymentDataInstallmentType) &&
        Objects.equals(this.installmentPaymentDataOptionItemNrAnnualPercentageRate, responseAdditionalDataInstallments.installmentPaymentDataOptionItemNrAnnualPercentageRate) &&
        Objects.equals(this.installmentPaymentDataOptionItemNrFirstInstallmentAmount, responseAdditionalDataInstallments.installmentPaymentDataOptionItemNrFirstInstallmentAmount) &&
        Objects.equals(this.installmentPaymentDataOptionItemNrInstallmentFee, responseAdditionalDataInstallments.installmentPaymentDataOptionItemNrInstallmentFee) &&
        Objects.equals(this.installmentPaymentDataOptionItemNrInterestRate, responseAdditionalDataInstallments.installmentPaymentDataOptionItemNrInterestRate) &&
        Objects.equals(this.installmentPaymentDataOptionItemNrMaximumNumberOfInstallments, responseAdditionalDataInstallments.installmentPaymentDataOptionItemNrMaximumNumberOfInstallments) &&
        Objects.equals(this.installmentPaymentDataOptionItemNrMinimumNumberOfInstallments, responseAdditionalDataInstallments.installmentPaymentDataOptionItemNrMinimumNumberOfInstallments) &&
        Objects.equals(this.installmentPaymentDataOptionItemNrNumberOfInstallments, responseAdditionalDataInstallments.installmentPaymentDataOptionItemNrNumberOfInstallments) &&
        Objects.equals(this.installmentPaymentDataOptionItemNrSubsequentInstallmentAmount, responseAdditionalDataInstallments.installmentPaymentDataOptionItemNrSubsequentInstallmentAmount) &&
        Objects.equals(this.installmentPaymentDataOptionItemNrTotalAmountDue, responseAdditionalDataInstallments.installmentPaymentDataOptionItemNrTotalAmountDue) &&
        Objects.equals(this.installmentPaymentDataPaymentOptions, responseAdditionalDataInstallments.installmentPaymentDataPaymentOptions) &&
        Objects.equals(this.installmentsValue, responseAdditionalDataInstallments.installmentsValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installmentPaymentDataInstallmentType, installmentPaymentDataOptionItemNrAnnualPercentageRate, installmentPaymentDataOptionItemNrFirstInstallmentAmount, installmentPaymentDataOptionItemNrInstallmentFee, installmentPaymentDataOptionItemNrInterestRate, installmentPaymentDataOptionItemNrMaximumNumberOfInstallments, installmentPaymentDataOptionItemNrMinimumNumberOfInstallments, installmentPaymentDataOptionItemNrNumberOfInstallments, installmentPaymentDataOptionItemNrSubsequentInstallmentAmount, installmentPaymentDataOptionItemNrTotalAmountDue, installmentPaymentDataPaymentOptions, installmentsValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseAdditionalDataInstallments {\n");
    sb.append("    installmentPaymentDataInstallmentType: ").append(toIndentedString(installmentPaymentDataInstallmentType)).append("\n");
    sb.append("    installmentPaymentDataOptionItemNrAnnualPercentageRate: ").append(toIndentedString(installmentPaymentDataOptionItemNrAnnualPercentageRate)).append("\n");
    sb.append("    installmentPaymentDataOptionItemNrFirstInstallmentAmount: ").append(toIndentedString(installmentPaymentDataOptionItemNrFirstInstallmentAmount)).append("\n");
    sb.append("    installmentPaymentDataOptionItemNrInstallmentFee: ").append(toIndentedString(installmentPaymentDataOptionItemNrInstallmentFee)).append("\n");
    sb.append("    installmentPaymentDataOptionItemNrInterestRate: ").append(toIndentedString(installmentPaymentDataOptionItemNrInterestRate)).append("\n");
    sb.append("    installmentPaymentDataOptionItemNrMaximumNumberOfInstallments: ").append(toIndentedString(installmentPaymentDataOptionItemNrMaximumNumberOfInstallments)).append("\n");
    sb.append("    installmentPaymentDataOptionItemNrMinimumNumberOfInstallments: ").append(toIndentedString(installmentPaymentDataOptionItemNrMinimumNumberOfInstallments)).append("\n");
    sb.append("    installmentPaymentDataOptionItemNrNumberOfInstallments: ").append(toIndentedString(installmentPaymentDataOptionItemNrNumberOfInstallments)).append("\n");
    sb.append("    installmentPaymentDataOptionItemNrSubsequentInstallmentAmount: ").append(toIndentedString(installmentPaymentDataOptionItemNrSubsequentInstallmentAmount)).append("\n");
    sb.append("    installmentPaymentDataOptionItemNrTotalAmountDue: ").append(toIndentedString(installmentPaymentDataOptionItemNrTotalAmountDue)).append("\n");
    sb.append("    installmentPaymentDataPaymentOptions: ").append(toIndentedString(installmentPaymentDataPaymentOptions)).append("\n");
    sb.append("    installmentsValue: ").append(toIndentedString(installmentsValue)).append("\n");
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
    openapiFields.add("installmentPaymentData.installmentType");
    openapiFields.add("installmentPaymentData.option[itemNr].annualPercentageRate");
    openapiFields.add("installmentPaymentData.option[itemNr].firstInstallmentAmount");
    openapiFields.add("installmentPaymentData.option[itemNr].installmentFee");
    openapiFields.add("installmentPaymentData.option[itemNr].interestRate");
    openapiFields.add("installmentPaymentData.option[itemNr].maximumNumberOfInstallments");
    openapiFields.add("installmentPaymentData.option[itemNr].minimumNumberOfInstallments");
    openapiFields.add("installmentPaymentData.option[itemNr].numberOfInstallments");
    openapiFields.add("installmentPaymentData.option[itemNr].subsequentInstallmentAmount");
    openapiFields.add("installmentPaymentData.option[itemNr].totalAmountDue");
    openapiFields.add("installmentPaymentData.paymentOptions");
    openapiFields.add("installments.value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    validateJsonObject(jsonObj, false);
  }
 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @param strictValidation reject (new) fields missing from the specifications
  * @throws IOException if the JSON Object is invalid with respect to ResponseAdditionalDataInstallments
  */
  public static void validateJsonObject(JsonObject jsonObj, boolean strictValidation) throws IOException {
      if (jsonObj == null) {
        if (ResponseAdditionalDataInstallments.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResponseAdditionalDataInstallments is not found in the empty JSON string", ResponseAdditionalDataInstallments.openapiRequiredFields.toString()));
        }
      }
      if (strictValidation) {
          Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
          // check to see if the JSON string contains additional fields
          for (Entry<String, JsonElement> entry : entries) {
            if (!ResponseAdditionalDataInstallments.openapiFields.contains(entry.getKey())) {
              throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResponseAdditionalDataInstallments` properties.", entry.getKey()));
            }
          }
      }
      // validate the optional field installmentPaymentData.installmentType
      if (jsonObj.get("installmentPaymentData.installmentType") != null && !jsonObj.get("installmentPaymentData.installmentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `installmentPaymentData.installmentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("installmentPaymentData.installmentType").toString()));
      }
      // validate the optional field installmentPaymentData.option[itemNr].annualPercentageRate
      if (jsonObj.get("installmentPaymentData.option[itemNr].annualPercentageRate") != null && !jsonObj.get("installmentPaymentData.option[itemNr].annualPercentageRate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `installmentPaymentData.option[itemNr].annualPercentageRate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("installmentPaymentData.option[itemNr].annualPercentageRate").toString()));
      }
      // validate the optional field installmentPaymentData.option[itemNr].firstInstallmentAmount
      if (jsonObj.get("installmentPaymentData.option[itemNr].firstInstallmentAmount") != null && !jsonObj.get("installmentPaymentData.option[itemNr].firstInstallmentAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `installmentPaymentData.option[itemNr].firstInstallmentAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("installmentPaymentData.option[itemNr].firstInstallmentAmount").toString()));
      }
      // validate the optional field installmentPaymentData.option[itemNr].installmentFee
      if (jsonObj.get("installmentPaymentData.option[itemNr].installmentFee") != null && !jsonObj.get("installmentPaymentData.option[itemNr].installmentFee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `installmentPaymentData.option[itemNr].installmentFee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("installmentPaymentData.option[itemNr].installmentFee").toString()));
      }
      // validate the optional field installmentPaymentData.option[itemNr].interestRate
      if (jsonObj.get("installmentPaymentData.option[itemNr].interestRate") != null && !jsonObj.get("installmentPaymentData.option[itemNr].interestRate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `installmentPaymentData.option[itemNr].interestRate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("installmentPaymentData.option[itemNr].interestRate").toString()));
      }
      // validate the optional field installmentPaymentData.option[itemNr].maximumNumberOfInstallments
      if (jsonObj.get("installmentPaymentData.option[itemNr].maximumNumberOfInstallments") != null && !jsonObj.get("installmentPaymentData.option[itemNr].maximumNumberOfInstallments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `installmentPaymentData.option[itemNr].maximumNumberOfInstallments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("installmentPaymentData.option[itemNr].maximumNumberOfInstallments").toString()));
      }
      // validate the optional field installmentPaymentData.option[itemNr].minimumNumberOfInstallments
      if (jsonObj.get("installmentPaymentData.option[itemNr].minimumNumberOfInstallments") != null && !jsonObj.get("installmentPaymentData.option[itemNr].minimumNumberOfInstallments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `installmentPaymentData.option[itemNr].minimumNumberOfInstallments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("installmentPaymentData.option[itemNr].minimumNumberOfInstallments").toString()));
      }
      // validate the optional field installmentPaymentData.option[itemNr].numberOfInstallments
      if (jsonObj.get("installmentPaymentData.option[itemNr].numberOfInstallments") != null && !jsonObj.get("installmentPaymentData.option[itemNr].numberOfInstallments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `installmentPaymentData.option[itemNr].numberOfInstallments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("installmentPaymentData.option[itemNr].numberOfInstallments").toString()));
      }
      // validate the optional field installmentPaymentData.option[itemNr].subsequentInstallmentAmount
      if (jsonObj.get("installmentPaymentData.option[itemNr].subsequentInstallmentAmount") != null && !jsonObj.get("installmentPaymentData.option[itemNr].subsequentInstallmentAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `installmentPaymentData.option[itemNr].subsequentInstallmentAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("installmentPaymentData.option[itemNr].subsequentInstallmentAmount").toString()));
      }
      // validate the optional field installmentPaymentData.option[itemNr].totalAmountDue
      if (jsonObj.get("installmentPaymentData.option[itemNr].totalAmountDue") != null && !jsonObj.get("installmentPaymentData.option[itemNr].totalAmountDue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `installmentPaymentData.option[itemNr].totalAmountDue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("installmentPaymentData.option[itemNr].totalAmountDue").toString()));
      }
      // validate the optional field installmentPaymentData.paymentOptions
      if (jsonObj.get("installmentPaymentData.paymentOptions") != null && !jsonObj.get("installmentPaymentData.paymentOptions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `installmentPaymentData.paymentOptions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("installmentPaymentData.paymentOptions").toString()));
      }
      // validate the optional field installments.value
      if (jsonObj.get("installments.value") != null && !jsonObj.get("installments.value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `installments.value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("installments.value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResponseAdditionalDataInstallments.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResponseAdditionalDataInstallments' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResponseAdditionalDataInstallments> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResponseAdditionalDataInstallments.class));

       return (TypeAdapter<T>) new TypeAdapter<ResponseAdditionalDataInstallments>() {
           @Override
           public void write(JsonWriter out, ResponseAdditionalDataInstallments value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResponseAdditionalDataInstallments read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResponseAdditionalDataInstallments given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResponseAdditionalDataInstallments
  * @throws IOException if the JSON string is invalid with respect to ResponseAdditionalDataInstallments
  */
  public static ResponseAdditionalDataInstallments fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResponseAdditionalDataInstallments.class);
  }

 /**
  * Convert an instance of ResponseAdditionalDataInstallments to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

