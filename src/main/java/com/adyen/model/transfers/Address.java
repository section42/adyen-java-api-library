/*
 * Transfers API
 *
 * The version of the OpenAPI document: 4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transfers;

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
 * Address
 */
@JsonPropertyOrder({
  Address.JSON_PROPERTY_CITY,
  Address.JSON_PROPERTY_COUNTRY,
  Address.JSON_PROPERTY_LINE1,
  Address.JSON_PROPERTY_LINE2,
  Address.JSON_PROPERTY_POSTAL_CODE,
  Address.JSON_PROPERTY_STATE_OR_PROVINCE
})

public class Address {
  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_LINE1 = "line1";
  private String line1;

  public static final String JSON_PROPERTY_LINE2 = "line2";
  private String line2;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postalCode";
  private String postalCode;

  public static final String JSON_PROPERTY_STATE_OR_PROVINCE = "stateOrProvince";
  private String stateOrProvince;

  public Address() { 
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The name of the city.
   * @return city
  **/
  @ApiModelProperty(value = "The name of the city.")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


 /**
  * The name of the city.
  *
  * @param city
  */ 
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }


  public Address country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The two-character ISO 3166-1 alpha-2 country code. For example, **US**, **NL**, or **GB**.
   * @return country
  **/
  @ApiModelProperty(required = true, value = "The two-character ISO 3166-1 alpha-2 country code. For example, **US**, **NL**, or **GB**.")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountry() {
    return country;
  }


 /**
  * The two-character ISO 3166-1 alpha-2 country code. For example, **US**, **NL**, or **GB**.
  *
  * @param country
  */ 
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(String country) {
    this.country = country;
  }


  public Address line1(String line1) {
    this.line1 = line1;
    return this;
  }

   /**
   * First line of the street address.
   * @return line1
  **/
  @ApiModelProperty(value = "First line of the street address.")
  @JsonProperty(JSON_PROPERTY_LINE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLine1() {
    return line1;
  }


 /**
  * First line of the street address.
  *
  * @param line1
  */ 
  @JsonProperty(JSON_PROPERTY_LINE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLine1(String line1) {
    this.line1 = line1;
  }


  public Address line2(String line2) {
    this.line2 = line2;
    return this;
  }

   /**
   * Second line of the street address.
   * @return line2
  **/
  @ApiModelProperty(value = "Second line of the street address.")
  @JsonProperty(JSON_PROPERTY_LINE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLine2() {
    return line2;
  }


 /**
  * Second line of the street address.
  *
  * @param line2
  */ 
  @JsonProperty(JSON_PROPERTY_LINE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLine2(String line2) {
    this.line2 = line2;
  }


  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code. Maximum length: * 5 digits for an address in the US. * 10 characters for an address in all other countries.
   * @return postalCode
  **/
  @ApiModelProperty(value = "The postal code. Maximum length: * 5 digits for an address in the US. * 10 characters for an address in all other countries.")
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostalCode() {
    return postalCode;
  }


 /**
  * The postal code. Maximum length: * 5 digits for an address in the US. * 10 characters for an address in all other countries.
  *
  * @param postalCode
  */ 
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public Address stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

   /**
   * The two-letter ISO 3166-2 state or province code. For example, **CA** in the US or **ON** in Canada. &gt; Required for the US and Canada.
   * @return stateOrProvince
  **/
  @ApiModelProperty(value = "The two-letter ISO 3166-2 state or province code. For example, **CA** in the US or **ON** in Canada. > Required for the US and Canada.")
  @JsonProperty(JSON_PROPERTY_STATE_OR_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStateOrProvince() {
    return stateOrProvince;
  }


 /**
  * The two-letter ISO 3166-2 state or province code. For example, **CA** in the US or **ON** in Canada. &gt; Required for the US and Canada.
  *
  * @param stateOrProvince
  */ 
  @JsonProperty(JSON_PROPERTY_STATE_OR_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }


  /**
   * Return true if this Address object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.city, address.city) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.line1, address.line1) &&
        Objects.equals(this.line2, address.line2) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.stateOrProvince, address.stateOrProvince);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, line1, line2, postalCode, stateOrProvince);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
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
   * Create an instance of Address given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Address
   * @throws JsonProcessingException if the JSON string is invalid with respect to Address
   */
  public static Address fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Address.class);
  }
/**
  * Convert an instance of Address to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

