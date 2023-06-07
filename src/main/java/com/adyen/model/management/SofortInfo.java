/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

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
 * SofortInfo
 */
@JsonPropertyOrder({
  SofortInfo.JSON_PROPERTY_CURRENCY_CODE,
  SofortInfo.JSON_PROPERTY_LOGO
})

public class SofortInfo {
  public static final String JSON_PROPERTY_CURRENCY_CODE = "currencyCode";
  private String currencyCode;

  public static final String JSON_PROPERTY_LOGO = "logo";
  private String logo;

  public SofortInfo() { 
  }

  public SofortInfo currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Sofort currency code. For example, **EUR**.
   * @return currencyCode
  **/
  @ApiModelProperty(required = true, value = "Sofort currency code. For example, **EUR**.")
  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrencyCode() {
    return currencyCode;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public SofortInfo logo(String logo) {
    this.logo = logo;
    return this;
  }

   /**
   * Sofort logo. Format: Base64-encoded string.
   * @return logo
  **/
  @ApiModelProperty(required = true, value = "Sofort logo. Format: Base64-encoded string.")
  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogo() {
    return logo;
  }


  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogo(String logo) {
    this.logo = logo;
  }


  /**
   * Return true if this SofortInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SofortInfo sofortInfo = (SofortInfo) o;
    return Objects.equals(this.currencyCode, sofortInfo.currencyCode) &&
        Objects.equals(this.logo, sofortInfo.logo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, logo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SofortInfo {\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
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
   * Create an instance of SofortInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SofortInfo
   * @throws JsonProcessingException if the JSON string is invalid with respect to SofortInfo
   */
  public static SofortInfo fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, SofortInfo.class);
  }
/**
  * Convert an instance of SofortInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

