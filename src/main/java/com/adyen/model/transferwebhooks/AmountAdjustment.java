/*
 * Transfer webhooks
 *
 * The version of the OpenAPI document: 4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transferwebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.transferwebhooks.Amount;
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
 * AmountAdjustment
 */
@JsonPropertyOrder({
  AmountAdjustment.JSON_PROPERTY_AMOUNT,
  AmountAdjustment.JSON_PROPERTY_AMOUNT_ADJUSTMENT_TYPE,
  AmountAdjustment.JSON_PROPERTY_BASEPOINTS
})

public class AmountAdjustment {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Amount amount;

  /**
   * The type of markup that is applied to an authorised payment.  Possible values: **exchange**, **forexMarkup**, **authHoldReserve**, **atmMarkup**.
   */
  public enum AmountAdjustmentTypeEnum {
    ATMMARKUP("atmMarkup"),
    
    AUTHHOLDRESERVE("authHoldReserve"),
    
    EXCHANGE("exchange"),
    
    FOREXMARKUP("forexMarkup");

    private String value;

    AmountAdjustmentTypeEnum(String value) {
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
    public static AmountAdjustmentTypeEnum fromValue(String value) {
      for (AmountAdjustmentTypeEnum b : AmountAdjustmentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_AMOUNT_ADJUSTMENT_TYPE = "amountAdjustmentType";
  private AmountAdjustmentTypeEnum amountAdjustmentType;

  public static final String JSON_PROPERTY_BASEPOINTS = "basepoints";
  private Integer basepoints;

  public AmountAdjustment() { 
  }

  public AmountAdjustment amount(Amount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Amount getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public AmountAdjustment amountAdjustmentType(AmountAdjustmentTypeEnum amountAdjustmentType) {
    this.amountAdjustmentType = amountAdjustmentType;
    return this;
  }

   /**
   * The type of markup that is applied to an authorised payment.  Possible values: **exchange**, **forexMarkup**, **authHoldReserve**, **atmMarkup**.
   * @return amountAdjustmentType
  **/
  @ApiModelProperty(value = "The type of markup that is applied to an authorised payment.  Possible values: **exchange**, **forexMarkup**, **authHoldReserve**, **atmMarkup**.")
  @JsonProperty(JSON_PROPERTY_AMOUNT_ADJUSTMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AmountAdjustmentTypeEnum getAmountAdjustmentType() {
    return amountAdjustmentType;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_ADJUSTMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountAdjustmentType(AmountAdjustmentTypeEnum amountAdjustmentType) {
    this.amountAdjustmentType = amountAdjustmentType;
  }


  public AmountAdjustment basepoints(Integer basepoints) {
    this.basepoints = basepoints;
    return this;
  }

   /**
   * The basepoints associated with the applied markup.
   * @return basepoints
  **/
  @ApiModelProperty(value = "The basepoints associated with the applied markup.")
  @JsonProperty(JSON_PROPERTY_BASEPOINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBasepoints() {
    return basepoints;
  }


  @JsonProperty(JSON_PROPERTY_BASEPOINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBasepoints(Integer basepoints) {
    this.basepoints = basepoints;
  }


  /**
   * Return true if this AmountAdjustment object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmountAdjustment amountAdjustment = (AmountAdjustment) o;
    return Objects.equals(this.amount, amountAdjustment.amount) &&
        Objects.equals(this.amountAdjustmentType, amountAdjustment.amountAdjustmentType) &&
        Objects.equals(this.basepoints, amountAdjustment.basepoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, amountAdjustmentType, basepoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmountAdjustment {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountAdjustmentType: ").append(toIndentedString(amountAdjustmentType)).append("\n");
    sb.append("    basepoints: ").append(toIndentedString(basepoints)).append("\n");
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
   * Create an instance of AmountAdjustment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AmountAdjustment
   * @throws JsonProcessingException if the JSON string is invalid with respect to AmountAdjustment
   */
  public static AmountAdjustment fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AmountAdjustment.class);
  }
/**
  * Convert an instance of AmountAdjustment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

