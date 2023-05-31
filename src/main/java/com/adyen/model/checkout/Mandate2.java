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
 * Mandate2
 */

public class Mandate2 {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  /**
   * The limitation rule of the billing amount.  Possible values:  * **max**: The transaction amount can not exceed the &#x60;amount&#x60;.   * **exact**: The transaction amount should be the same as the &#x60;amount&#x60;.  
   */
  @JsonAdapter(AmountRuleEnum.Adapter.class)
  public enum AmountRuleEnum {
    MAX("max"),
    
    EXACT("exact");

    private String value;

    AmountRuleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AmountRuleEnum fromValue(String value) {
      for (AmountRuleEnum b : AmountRuleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AmountRuleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AmountRuleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AmountRuleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AmountRuleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AMOUNT_RULE = "amountRule";
  @SerializedName(SERIALIZED_NAME_AMOUNT_RULE)
  private AmountRuleEnum amountRule;

  /**
   * The rule to specify the period, within which the recurring debit can happen, relative to the mandate recurring date.  Possible values:   * **on**: On a specific date.   * **before**:  Before and on a specific date.   * **after**: On and after a specific date.  
   */
  @JsonAdapter(BillingAttemptsRuleEnum.Adapter.class)
  public enum BillingAttemptsRuleEnum {
    ON("on"),
    
    BEFORE("before"),
    
    AFTER("after");

    private String value;

    BillingAttemptsRuleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BillingAttemptsRuleEnum fromValue(String value) {
      for (BillingAttemptsRuleEnum b : BillingAttemptsRuleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BillingAttemptsRuleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BillingAttemptsRuleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BillingAttemptsRuleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BillingAttemptsRuleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BILLING_ATTEMPTS_RULE = "billingAttemptsRule";
  @SerializedName(SERIALIZED_NAME_BILLING_ATTEMPTS_RULE)
  private BillingAttemptsRuleEnum billingAttemptsRule;

  public static final String SERIALIZED_NAME_BILLING_DAY = "billingDay";
  @SerializedName(SERIALIZED_NAME_BILLING_DAY)
  private String billingDay;

  public static final String SERIALIZED_NAME_ENDS_AT = "endsAt";
  @SerializedName(SERIALIZED_NAME_ENDS_AT)
  private String endsAt;

  /**
   * The frequency with which a shopper should be charged.  Possible values: **daily**, **weekly**, **biWeekly**, **monthly**, **quarterly**, **halfYearly**, **yearly**.
   */
  @JsonAdapter(FrequencyEnum.Adapter.class)
  public enum FrequencyEnum {
    ADHOC("adhoc"),
    
    DAILY("daily"),
    
    WEEKLY("weekly"),
    
    BIWEEKLY("biWeekly"),
    
    MONTHLY("monthly"),
    
    QUARTERLY("quarterly"),
    
    HALFYEARLY("halfYearly"),
    
    YEARLY("yearly");

    private String value;

    FrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FrequencyEnum fromValue(String value) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FrequencyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private FrequencyEnum frequency;

  public static final String SERIALIZED_NAME_REMARKS = "remarks";
  @SerializedName(SERIALIZED_NAME_REMARKS)
  private String remarks;

  public static final String SERIALIZED_NAME_STARTS_AT = "startsAt";
  @SerializedName(SERIALIZED_NAME_STARTS_AT)
  private String startsAt;

  public Mandate2() { 
  }

  public Mandate2 amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The billing amount (in minor units) of the recurring transactions.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The billing amount (in minor units) of the recurring transactions.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public Mandate2 amountRule(AmountRuleEnum amountRule) {
    
    this.amountRule = amountRule;
    return this;
  }

   /**
   * The limitation rule of the billing amount.  Possible values:  * **max**: The transaction amount can not exceed the &#x60;amount&#x60;.   * **exact**: The transaction amount should be the same as the &#x60;amount&#x60;.  
   * @return amountRule
  **/
  @ApiModelProperty(value = "The limitation rule of the billing amount.  Possible values:  * **max**: The transaction amount can not exceed the `amount`.   * **exact**: The transaction amount should be the same as the `amount`.  ")

  public AmountRuleEnum getAmountRule() {
    return amountRule;
  }


  public void setAmountRule(AmountRuleEnum amountRule) {
    this.amountRule = amountRule;
  }


  public Mandate2 billingAttemptsRule(BillingAttemptsRuleEnum billingAttemptsRule) {
    
    this.billingAttemptsRule = billingAttemptsRule;
    return this;
  }

   /**
   * The rule to specify the period, within which the recurring debit can happen, relative to the mandate recurring date.  Possible values:   * **on**: On a specific date.   * **before**:  Before and on a specific date.   * **after**: On and after a specific date.  
   * @return billingAttemptsRule
  **/
  @ApiModelProperty(value = "The rule to specify the period, within which the recurring debit can happen, relative to the mandate recurring date.  Possible values:   * **on**: On a specific date.   * **before**:  Before and on a specific date.   * **after**: On and after a specific date.  ")

  public BillingAttemptsRuleEnum getBillingAttemptsRule() {
    return billingAttemptsRule;
  }


  public void setBillingAttemptsRule(BillingAttemptsRuleEnum billingAttemptsRule) {
    this.billingAttemptsRule = billingAttemptsRule;
  }


  public Mandate2 billingDay(String billingDay) {
    
    this.billingDay = billingDay;
    return this;
  }

   /**
   * The number of the day, on which the recurring debit can happen. Should be within the same calendar month as the mandate recurring date.  Possible values: 1-31 based on the &#x60;frequency&#x60;.
   * @return billingDay
  **/
  @ApiModelProperty(value = "The number of the day, on which the recurring debit can happen. Should be within the same calendar month as the mandate recurring date.  Possible values: 1-31 based on the `frequency`.")

  public String getBillingDay() {
    return billingDay;
  }


  public void setBillingDay(String billingDay) {
    this.billingDay = billingDay;
  }


  public Mandate2 endsAt(String endsAt) {
    
    this.endsAt = endsAt;
    return this;
  }

   /**
   * End date of the billing plan, in YYYY-MM-DD format.
   * @return endsAt
  **/
  @ApiModelProperty(required = true, value = "End date of the billing plan, in YYYY-MM-DD format.")

  public String getEndsAt() {
    return endsAt;
  }


  public void setEndsAt(String endsAt) {
    this.endsAt = endsAt;
  }


  public Mandate2 frequency(FrequencyEnum frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * The frequency with which a shopper should be charged.  Possible values: **daily**, **weekly**, **biWeekly**, **monthly**, **quarterly**, **halfYearly**, **yearly**.
   * @return frequency
  **/
  @ApiModelProperty(required = true, value = "The frequency with which a shopper should be charged.  Possible values: **daily**, **weekly**, **biWeekly**, **monthly**, **quarterly**, **halfYearly**, **yearly**.")

  public FrequencyEnum getFrequency() {
    return frequency;
  }


  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }


  public Mandate2 remarks(String remarks) {
    
    this.remarks = remarks;
    return this;
  }

   /**
   * The message shown by UPI to the shopper on the approval screen.
   * @return remarks
  **/
  @ApiModelProperty(value = "The message shown by UPI to the shopper on the approval screen.")

  public String getRemarks() {
    return remarks;
  }


  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }


  public Mandate2 startsAt(String startsAt) {
    
    this.startsAt = startsAt;
    return this;
  }

   /**
   * Start date of the billing plan, in YYYY-MM-DD format. By default, the transaction date.
   * @return startsAt
  **/
  @ApiModelProperty(value = "Start date of the billing plan, in YYYY-MM-DD format. By default, the transaction date.")

  public String getStartsAt() {
    return startsAt;
  }


  public void setStartsAt(String startsAt) {
    this.startsAt = startsAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mandate2 mandate2 = (Mandate2) o;
    return Objects.equals(this.amount, mandate2.amount) &&
        Objects.equals(this.amountRule, mandate2.amountRule) &&
        Objects.equals(this.billingAttemptsRule, mandate2.billingAttemptsRule) &&
        Objects.equals(this.billingDay, mandate2.billingDay) &&
        Objects.equals(this.endsAt, mandate2.endsAt) &&
        Objects.equals(this.frequency, mandate2.frequency) &&
        Objects.equals(this.remarks, mandate2.remarks) &&
        Objects.equals(this.startsAt, mandate2.startsAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, amountRule, billingAttemptsRule, billingDay, endsAt, frequency, remarks, startsAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mandate2 {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountRule: ").append(toIndentedString(amountRule)).append("\n");
    sb.append("    billingAttemptsRule: ").append(toIndentedString(billingAttemptsRule)).append("\n");
    sb.append("    billingDay: ").append(toIndentedString(billingDay)).append("\n");
    sb.append("    endsAt: ").append(toIndentedString(endsAt)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
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
    openapiFields.add("amountRule");
    openapiFields.add("billingAttemptsRule");
    openapiFields.add("billingDay");
    openapiFields.add("endsAt");
    openapiFields.add("frequency");
    openapiFields.add("remarks");
    openapiFields.add("startsAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("endsAt");
    openapiRequiredFields.add("frequency");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(Mandate2.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Mandate2
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Mandate2.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Mandate2 is not found in the empty JSON string", Mandate2.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Mandate2.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `Mandate2` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Mandate2.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field amount
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      // ensure the field amountRule can be parsed to an enum value
      if (jsonObj.get("amountRule") != null) {
        if(!jsonObj.get("amountRule").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `amountRule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amountRule").toString()));
        }
        AmountRuleEnum.fromValue(jsonObj.get("amountRule").getAsString());
      }
      // ensure the field billingAttemptsRule can be parsed to an enum value
      if (jsonObj.get("billingAttemptsRule") != null) {
        if(!jsonObj.get("billingAttemptsRule").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `billingAttemptsRule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingAttemptsRule").toString()));
        }
        BillingAttemptsRuleEnum.fromValue(jsonObj.get("billingAttemptsRule").getAsString());
      }
      // validate the optional field billingDay
      if (jsonObj.get("billingDay") != null && !jsonObj.get("billingDay").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `billingDay` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingDay").toString()));
      }
      // validate the optional field endsAt
      if (jsonObj.get("endsAt") != null && !jsonObj.get("endsAt").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `endsAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endsAt").toString()));
      }
      // ensure the field frequency can be parsed to an enum value
      if (jsonObj.get("frequency") != null) {
        if(!jsonObj.get("frequency").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `frequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frequency").toString()));
        }
        FrequencyEnum.fromValue(jsonObj.get("frequency").getAsString());
      }
      // validate the optional field remarks
      if (jsonObj.get("remarks") != null && !jsonObj.get("remarks").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `remarks` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remarks").toString()));
      }
      // validate the optional field startsAt
      if (jsonObj.get("startsAt") != null && !jsonObj.get("startsAt").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `startsAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startsAt").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Mandate2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Mandate2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Mandate2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Mandate2.class));

       return (TypeAdapter<T>) new TypeAdapter<Mandate2>() {
           @Override
           public void write(JsonWriter out, Mandate2 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Mandate2 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Mandate2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Mandate2
  * @throws IOException if the JSON string is invalid with respect to Mandate2
  */
  public static Mandate2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Mandate2.class);
  }

 /**
  * Convert an instance of Mandate2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

