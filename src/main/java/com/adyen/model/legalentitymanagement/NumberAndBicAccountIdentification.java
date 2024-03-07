/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.legalentitymanagement.AdditionalBankIdentification;
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
 * NumberAndBicAccountIdentification
 */
@JsonPropertyOrder({
  NumberAndBicAccountIdentification.JSON_PROPERTY_ACCOUNT_NUMBER,
  NumberAndBicAccountIdentification.JSON_PROPERTY_ADDITIONAL_BANK_IDENTIFICATION,
  NumberAndBicAccountIdentification.JSON_PROPERTY_BIC,
  NumberAndBicAccountIdentification.JSON_PROPERTY_FORM_FACTOR,
  NumberAndBicAccountIdentification.JSON_PROPERTY_TYPE
})

public class NumberAndBicAccountIdentification {
  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "accountNumber";
  private String accountNumber;

  public static final String JSON_PROPERTY_ADDITIONAL_BANK_IDENTIFICATION = "additionalBankIdentification";
  private AdditionalBankIdentification additionalBankIdentification;

  public static final String JSON_PROPERTY_BIC = "bic";
  private String bic;

  public static final String JSON_PROPERTY_FORM_FACTOR = "formFactor";
  private String formFactor = "physical";

  /**
   * **numberAndBic**
   */
  public enum TypeEnum {
    NUMBERANDBIC("numberAndBic");

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
  private TypeEnum type = TypeEnum.NUMBERANDBIC;

  public NumberAndBicAccountIdentification() { 
  }

  public NumberAndBicAccountIdentification accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * The bank account number, without separators or whitespace. The length and format depends on the bank or country.
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "The bank account number, without separators or whitespace. The length and format depends on the bank or country.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountNumber() {
    return accountNumber;
  }


 /**
  * The bank account number, without separators or whitespace. The length and format depends on the bank or country.
  *
  * @param accountNumber
  */ 
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public NumberAndBicAccountIdentification additionalBankIdentification(AdditionalBankIdentification additionalBankIdentification) {
    this.additionalBankIdentification = additionalBankIdentification;
    return this;
  }

   /**
   * Get additionalBankIdentification
   * @return additionalBankIdentification
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_BANK_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdditionalBankIdentification getAdditionalBankIdentification() {
    return additionalBankIdentification;
  }


 /**
  * additionalBankIdentification
  *
  * @param additionalBankIdentification
  */ 
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_BANK_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalBankIdentification(AdditionalBankIdentification additionalBankIdentification) {
    this.additionalBankIdentification = additionalBankIdentification;
  }


  public NumberAndBicAccountIdentification bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * The bank&#39;s 8- or 11-character BIC or SWIFT code.
   * @return bic
  **/
  @ApiModelProperty(required = true, value = "The bank's 8- or 11-character BIC or SWIFT code.")
  @JsonProperty(JSON_PROPERTY_BIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBic() {
    return bic;
  }


 /**
  * The bank&#39;s 8- or 11-character BIC or SWIFT code.
  *
  * @param bic
  */ 
  @JsonProperty(JSON_PROPERTY_BIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBic(String bic) {
    this.bic = bic;
  }


  public NumberAndBicAccountIdentification formFactor(String formFactor) {
    this.formFactor = formFactor;
    return this;
  }

   /**
   * Business accounts with a &#x60;formFactor&#x60; value of **physical** are business accounts issued under the central bank of that country. The default value is **physical** for NL, US, and UK business accounts.   Adyen creates a local IBAN for business accounts when the &#x60;formFactor&#x60;å value is set to **virtual**. The local IBANs that are supported are for DE and FR, which reference a physical NL account, with funds being routed through the central bank of NL.
   * @return formFactor
  **/
  @ApiModelProperty(value = "Business accounts with a `formFactor` value of **physical** are business accounts issued under the central bank of that country. The default value is **physical** for NL, US, and UK business accounts.   Adyen creates a local IBAN for business accounts when the `formFactor`å value is set to **virtual**. The local IBANs that are supported are for DE and FR, which reference a physical NL account, with funds being routed through the central bank of NL.")
  @JsonProperty(JSON_PROPERTY_FORM_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFormFactor() {
    return formFactor;
  }


 /**
  * Business accounts with a &#x60;formFactor&#x60; value of **physical** are business accounts issued under the central bank of that country. The default value is **physical** for NL, US, and UK business accounts.   Adyen creates a local IBAN for business accounts when the &#x60;formFactor&#x60;å value is set to **virtual**. The local IBANs that are supported are for DE and FR, which reference a physical NL account, with funds being routed through the central bank of NL.
  *
  * @param formFactor
  */ 
  @JsonProperty(JSON_PROPERTY_FORM_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormFactor(String formFactor) {
    this.formFactor = formFactor;
  }


  public NumberAndBicAccountIdentification type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **numberAndBic**
   * @return type
  **/
  @ApiModelProperty(required = true, value = "**numberAndBic**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


 /**
  * **numberAndBic**
  *
  * @param type
  */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this NumberAndBicAccountIdentification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberAndBicAccountIdentification numberAndBicAccountIdentification = (NumberAndBicAccountIdentification) o;
    return Objects.equals(this.accountNumber, numberAndBicAccountIdentification.accountNumber) &&
        Objects.equals(this.additionalBankIdentification, numberAndBicAccountIdentification.additionalBankIdentification) &&
        Objects.equals(this.bic, numberAndBicAccountIdentification.bic) &&
        Objects.equals(this.formFactor, numberAndBicAccountIdentification.formFactor) &&
        Objects.equals(this.type, numberAndBicAccountIdentification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, additionalBankIdentification, bic, formFactor, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberAndBicAccountIdentification {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    additionalBankIdentification: ").append(toIndentedString(additionalBankIdentification)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    formFactor: ").append(toIndentedString(formFactor)).append("\n");
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
   * Create an instance of NumberAndBicAccountIdentification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NumberAndBicAccountIdentification
   * @throws JsonProcessingException if the JSON string is invalid with respect to NumberAndBicAccountIdentification
   */
  public static NumberAndBicAccountIdentification fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, NumberAndBicAccountIdentification.class);
  }
/**
  * Convert an instance of NumberAndBicAccountIdentification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

