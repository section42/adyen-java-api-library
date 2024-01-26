/*
 * Adyen Payment API
 * A set of API endpoints that allow you to initiate, settle, and modify payments on the Adyen payments platform. You can use the API to accept card payments (including One-Click and 3D Secure), bank transfers, ewallets, and many other payment methods.  To learn more about the API, visit [Classic integration](https://docs.adyen.com/classic-integration).  ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning Payments API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/Payment/v68/authorise ```  ## Going live  To authenticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/Payment/v68/authorise ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payment;

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
 * SubMerchant
 */
@JsonPropertyOrder({
  SubMerchant.JSON_PROPERTY_CITY,
  SubMerchant.JSON_PROPERTY_COUNTRY,
  SubMerchant.JSON_PROPERTY_MCC,
  SubMerchant.JSON_PROPERTY_NAME,
  SubMerchant.JSON_PROPERTY_TAX_ID
})

public class SubMerchant {
  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_MCC = "mcc";
  private String mcc;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TAX_ID = "taxId";
  private String taxId;

  public SubMerchant() { 
  }

  public SubMerchant city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city of the sub-merchant&#39;s address. * Format: Alphanumeric * Maximum length: 13 characters
   * @return city
  **/
  @ApiModelProperty(value = "The city of the sub-merchant's address. * Format: Alphanumeric * Maximum length: 13 characters")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


 /**
  * The city of the sub-merchant&#39;s address. * Format: Alphanumeric * Maximum length: 13 characters
  *
  * @param city
  */ 
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }


  public SubMerchant country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The three-letter country code of the sub-merchant&#39;s address. For example, **BRA** for Brazil.  * Format: [ISO 3166-1 alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) * Fixed length: 3 characters
   * @return country
  **/
  @ApiModelProperty(value = "The three-letter country code of the sub-merchant's address. For example, **BRA** for Brazil.  * Format: [ISO 3166-1 alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) * Fixed length: 3 characters")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountry() {
    return country;
  }


 /**
  * The three-letter country code of the sub-merchant&#39;s address. For example, **BRA** for Brazil.  * Format: [ISO 3166-1 alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) * Fixed length: 3 characters
  *
  * @param country
  */ 
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(String country) {
    this.country = country;
  }


  public SubMerchant mcc(String mcc) {
    this.mcc = mcc;
    return this;
  }

   /**
   * The sub-merchant&#39;s 4-digit Merchant Category Code (MCC).  * Format: Numeric * Fixed length: 4 digits
   * @return mcc
  **/
  @ApiModelProperty(value = "The sub-merchant's 4-digit Merchant Category Code (MCC).  * Format: Numeric * Fixed length: 4 digits")
  @JsonProperty(JSON_PROPERTY_MCC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMcc() {
    return mcc;
  }


 /**
  * The sub-merchant&#39;s 4-digit Merchant Category Code (MCC).  * Format: Numeric * Fixed length: 4 digits
  *
  * @param mcc
  */ 
  @JsonProperty(JSON_PROPERTY_MCC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMcc(String mcc) {
    this.mcc = mcc;
  }


  public SubMerchant name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the sub-merchant. Based on scheme specifications, this value will overwrite the shopper statement  that will appear in the card statement. * Format: Alphanumeric * Maximum length: 22 characters
   * @return name
  **/
  @ApiModelProperty(value = "The name of the sub-merchant. Based on scheme specifications, this value will overwrite the shopper statement  that will appear in the card statement. * Format: Alphanumeric * Maximum length: 22 characters")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


 /**
  * The name of the sub-merchant. Based on scheme specifications, this value will overwrite the shopper statement  that will appear in the card statement. * Format: Alphanumeric * Maximum length: 22 characters
  *
  * @param name
  */ 
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public SubMerchant taxId(String taxId) {
    this.taxId = taxId;
    return this;
  }

   /**
   * The tax ID of the sub-merchant. * Format: Numeric * Fixed length: 11 digits for the CPF or 14 digits for the CNPJ
   * @return taxId
  **/
  @ApiModelProperty(value = "The tax ID of the sub-merchant. * Format: Numeric * Fixed length: 11 digits for the CPF or 14 digits for the CNPJ")
  @JsonProperty(JSON_PROPERTY_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaxId() {
    return taxId;
  }


 /**
  * The tax ID of the sub-merchant. * Format: Numeric * Fixed length: 11 digits for the CPF or 14 digits for the CNPJ
  *
  * @param taxId
  */ 
  @JsonProperty(JSON_PROPERTY_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }


  /**
   * Return true if this SubMerchant object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubMerchant subMerchant = (SubMerchant) o;
    return Objects.equals(this.city, subMerchant.city) &&
        Objects.equals(this.country, subMerchant.country) &&
        Objects.equals(this.mcc, subMerchant.mcc) &&
        Objects.equals(this.name, subMerchant.name) &&
        Objects.equals(this.taxId, subMerchant.taxId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, mcc, name, taxId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubMerchant {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

/**
   * Create an instance of SubMerchant given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SubMerchant
   * @throws JsonProcessingException if the JSON string is invalid with respect to SubMerchant
   */
  public static SubMerchant fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, SubMerchant.class);
  }
/**
  * Convert an instance of SubMerchant to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

