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
 * IdealDetails
 */
@JsonPropertyOrder({
  IdealDetails.JSON_PROPERTY_CHECKOUT_ATTEMPT_ID,
  IdealDetails.JSON_PROPERTY_ISSUER,
  IdealDetails.JSON_PROPERTY_RECURRING_DETAIL_REFERENCE,
  IdealDetails.JSON_PROPERTY_STORED_PAYMENT_METHOD_ID,
  IdealDetails.JSON_PROPERTY_TYPE
})

public class IdealDetails {
  public static final String JSON_PROPERTY_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  private String checkoutAttemptId;

  public static final String JSON_PROPERTY_ISSUER = "issuer";
  private String issuer;

  public static final String JSON_PROPERTY_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  private String recurringDetailReference;

  public static final String JSON_PROPERTY_STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
  private String storedPaymentMethodId;

  /**
   * **ideal**
   */
  public enum TypeEnum {
    IDEAL("ideal");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type = TypeEnum.IDEAL;

  public IdealDetails() { 
  }

  public IdealDetails checkoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
    return this;
  }

   /**
   * The checkout attempt identifier.
   * @return checkoutAttemptId
  **/
  @ApiModelProperty(value = "The checkout attempt identifier.")
  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCheckoutAttemptId() {
    return checkoutAttemptId;
  }


  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
  }


  public IdealDetails issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * The iDEAL issuer value of the shopper&#39;s selected bank. Set this to an **id** of an iDEAL issuer to preselect it.
   * @return issuer
  **/
  @ApiModelProperty(required = true, value = "The iDEAL issuer value of the shopper's selected bank. Set this to an **id** of an iDEAL issuer to preselect it.")
  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIssuer() {
    return issuer;
  }


  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  public IdealDetails recurringDetailReference(String recurringDetailReference) {
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
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecurringDetailReference() {
    return recurringDetailReference;
  }


  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
  }


  public IdealDetails storedPaymentMethodId(String storedPaymentMethodId) {
    this.storedPaymentMethodId = storedPaymentMethodId;
    return this;
  }

   /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   * @return storedPaymentMethodId
  **/
  @ApiModelProperty(value = "This is the `recurringDetailReference` returned in the response when you created the token.")
  @JsonProperty(JSON_PROPERTY_STORED_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStoredPaymentMethodId() {
    return storedPaymentMethodId;
  }


  @JsonProperty(JSON_PROPERTY_STORED_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoredPaymentMethodId(String storedPaymentMethodId) {
    this.storedPaymentMethodId = storedPaymentMethodId;
  }


  public IdealDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **ideal**
   * @return type
  **/
  @ApiModelProperty(value = "**ideal**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this IdealDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdealDetails idealDetails = (IdealDetails) o;
    return Objects.equals(this.checkoutAttemptId, idealDetails.checkoutAttemptId) &&
        Objects.equals(this.issuer, idealDetails.issuer) &&
        Objects.equals(this.recurringDetailReference, idealDetails.recurringDetailReference) &&
        Objects.equals(this.storedPaymentMethodId, idealDetails.storedPaymentMethodId) &&
        Objects.equals(this.type, idealDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutAttemptId, issuer, recurringDetailReference, storedPaymentMethodId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdealDetails {\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
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

/**
   * Create an instance of IdealDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IdealDetails
   * @throws JsonProcessingException if the JSON string is invalid with respect to IdealDetails
   */
  public static IdealDetails fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, IdealDetails.class);
  }
/**
  * Convert an instance of IdealDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

