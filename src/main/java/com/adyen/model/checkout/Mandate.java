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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * Mandate
 */
@JsonPropertyOrder({
  Mandate.JSON_PROPERTY_AMOUNT,
  Mandate.JSON_PROPERTY_AMOUNT_RULE,
  Mandate.JSON_PROPERTY_BILLING_ATTEMPTS_RULE,
  Mandate.JSON_PROPERTY_BILLING_DAY,
  Mandate.JSON_PROPERTY_ENDS_AT,
  Mandate.JSON_PROPERTY_FREQUENCY,
  Mandate.JSON_PROPERTY_REMARKS,
  Mandate.JSON_PROPERTY_STARTS_AT
})

public class Mandate {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  /**
   * The limitation rule of the billing amount.  Possible values:  * **max**: The transaction amount can not exceed the &#x60;amount&#x60;.   * **exact**: The transaction amount should be the same as the &#x60;amount&#x60;.  
   */
  public enum AmountRuleEnum {
    MAX("max"),
    
    EXACT("exact");

    private String value;

    AmountRuleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AmountRuleEnum fromValue(String value) {
      for (AmountRuleEnum b : AmountRuleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_AMOUNT_RULE = "amountRule";
  private AmountRuleEnum amountRule;

  /**
   * The rule to specify the period, within which the recurring debit can happen, relative to the mandate recurring date.  Possible values:   * **on**: On a specific date.   * **before**:  Before and on a specific date.   * **after**: On and after a specific date.  
   */
  public enum BillingAttemptsRuleEnum {
    ON("on"),
    
    BEFORE("before"),
    
    AFTER("after");

    private String value;

    BillingAttemptsRuleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BillingAttemptsRuleEnum fromValue(String value) {
      for (BillingAttemptsRuleEnum b : BillingAttemptsRuleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_BILLING_ATTEMPTS_RULE = "billingAttemptsRule";
  private BillingAttemptsRuleEnum billingAttemptsRule;

  public static final String JSON_PROPERTY_BILLING_DAY = "billingDay";
  private String billingDay;

  public static final String JSON_PROPERTY_ENDS_AT = "endsAt";
  private String endsAt;

  /**
   * The frequency with which a shopper should be charged.  Possible values: **daily**, **weekly**, **biWeekly**, **monthly**, **quarterly**, **halfYearly**, **yearly**.
   */
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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FrequencyEnum fromValue(String value) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private FrequencyEnum frequency;

  public static final String JSON_PROPERTY_REMARKS = "remarks";
  private String remarks;

  public static final String JSON_PROPERTY_STARTS_AT = "startsAt";
  private String startsAt;

  public Mandate() { 
  }

  public Mandate amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The billing amount (in minor units) of the recurring transactions.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The billing amount (in minor units) of the recurring transactions.")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(String amount) {
    this.amount = amount;
  }


  public Mandate amountRule(AmountRuleEnum amountRule) {
    this.amountRule = amountRule;
    return this;
  }

   /**
   * The limitation rule of the billing amount.  Possible values:  * **max**: The transaction amount can not exceed the &#x60;amount&#x60;.   * **exact**: The transaction amount should be the same as the &#x60;amount&#x60;.  
   * @return amountRule
  **/
  @ApiModelProperty(value = "The limitation rule of the billing amount.  Possible values:  * **max**: The transaction amount can not exceed the `amount`.   * **exact**: The transaction amount should be the same as the `amount`.  ")
  @JsonProperty(JSON_PROPERTY_AMOUNT_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AmountRuleEnum getAmountRule() {
    return amountRule;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountRule(AmountRuleEnum amountRule) {
    this.amountRule = amountRule;
  }


  public Mandate billingAttemptsRule(BillingAttemptsRuleEnum billingAttemptsRule) {
    this.billingAttemptsRule = billingAttemptsRule;
    return this;
  }

   /**
   * The rule to specify the period, within which the recurring debit can happen, relative to the mandate recurring date.  Possible values:   * **on**: On a specific date.   * **before**:  Before and on a specific date.   * **after**: On and after a specific date.  
   * @return billingAttemptsRule
  **/
  @ApiModelProperty(value = "The rule to specify the period, within which the recurring debit can happen, relative to the mandate recurring date.  Possible values:   * **on**: On a specific date.   * **before**:  Before and on a specific date.   * **after**: On and after a specific date.  ")
  @JsonProperty(JSON_PROPERTY_BILLING_ATTEMPTS_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BillingAttemptsRuleEnum getBillingAttemptsRule() {
    return billingAttemptsRule;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_ATTEMPTS_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAttemptsRule(BillingAttemptsRuleEnum billingAttemptsRule) {
    this.billingAttemptsRule = billingAttemptsRule;
  }


  public Mandate billingDay(String billingDay) {
    this.billingDay = billingDay;
    return this;
  }

   /**
   * The number of the day, on which the recurring debit can happen. Should be within the same calendar month as the mandate recurring date.  Possible values: 1-31 based on the &#x60;frequency&#x60;.
   * @return billingDay
  **/
  @ApiModelProperty(value = "The number of the day, on which the recurring debit can happen. Should be within the same calendar month as the mandate recurring date.  Possible values: 1-31 based on the `frequency`.")
  @JsonProperty(JSON_PROPERTY_BILLING_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBillingDay() {
    return billingDay;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingDay(String billingDay) {
    this.billingDay = billingDay;
  }


  public Mandate endsAt(String endsAt) {
    this.endsAt = endsAt;
    return this;
  }

   /**
   * End date of the billing plan, in YYYY-MM-DD format.
   * @return endsAt
  **/
  @ApiModelProperty(required = true, value = "End date of the billing plan, in YYYY-MM-DD format.")
  @JsonProperty(JSON_PROPERTY_ENDS_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEndsAt() {
    return endsAt;
  }


  @JsonProperty(JSON_PROPERTY_ENDS_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndsAt(String endsAt) {
    this.endsAt = endsAt;
  }


  public Mandate frequency(FrequencyEnum frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * The frequency with which a shopper should be charged.  Possible values: **daily**, **weekly**, **biWeekly**, **monthly**, **quarterly**, **halfYearly**, **yearly**.
   * @return frequency
  **/
  @ApiModelProperty(required = true, value = "The frequency with which a shopper should be charged.  Possible values: **daily**, **weekly**, **biWeekly**, **monthly**, **quarterly**, **halfYearly**, **yearly**.")
  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FrequencyEnum getFrequency() {
    return frequency;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }


  public Mandate remarks(String remarks) {
    this.remarks = remarks;
    return this;
  }

   /**
   * The message shown by UPI to the shopper on the approval screen.
   * @return remarks
  **/
  @ApiModelProperty(value = "The message shown by UPI to the shopper on the approval screen.")
  @JsonProperty(JSON_PROPERTY_REMARKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRemarks() {
    return remarks;
  }


  @JsonProperty(JSON_PROPERTY_REMARKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }


  public Mandate startsAt(String startsAt) {
    this.startsAt = startsAt;
    return this;
  }

   /**
   * Start date of the billing plan, in YYYY-MM-DD format. By default, the transaction date.
   * @return startsAt
  **/
  @ApiModelProperty(value = "Start date of the billing plan, in YYYY-MM-DD format. By default, the transaction date.")
  @JsonProperty(JSON_PROPERTY_STARTS_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartsAt() {
    return startsAt;
  }


  @JsonProperty(JSON_PROPERTY_STARTS_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartsAt(String startsAt) {
    this.startsAt = startsAt;
  }


  /**
   * Return true if this Mandate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mandate mandate = (Mandate) o;
    return Objects.equals(this.amount, mandate.amount) &&
        Objects.equals(this.amountRule, mandate.amountRule) &&
        Objects.equals(this.billingAttemptsRule, mandate.billingAttemptsRule) &&
        Objects.equals(this.billingDay, mandate.billingDay) &&
        Objects.equals(this.endsAt, mandate.endsAt) &&
        Objects.equals(this.frequency, mandate.frequency) &&
        Objects.equals(this.remarks, mandate.remarks) &&
        Objects.equals(this.startsAt, mandate.startsAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, amountRule, billingAttemptsRule, billingDay, endsAt, frequency, remarks, startsAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mandate {\n");
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

/**
   * Create an instance of Mandate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Mandate
   * @throws JsonProcessingException if the JSON string is invalid with respect to Mandate
   */
  public static Mandate fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Mandate.class);
  }
/**
  * Convert an instance of Mandate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

