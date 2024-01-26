/*
 * Adyen BinLookup API
 * The BIN Lookup API provides endpoints for retrieving information, such as cost estimates, and 3D Secure supported version based on a given BIN.  ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning The BinLookup API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/BinLookup/v54/get3dsAvailability ```## Going live  To authneticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/BinLookup/v54/get3dsAvailability ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 54
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.binlookup;

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
 * BinDetail
 */
@JsonPropertyOrder({
  BinDetail.JSON_PROPERTY_ISSUER_COUNTRY
})

public class BinDetail {
  public static final String JSON_PROPERTY_ISSUER_COUNTRY = "issuerCountry";
  private String issuerCountry;

  public BinDetail() { 
  }

  public BinDetail issuerCountry(String issuerCountry) {
    this.issuerCountry = issuerCountry;
    return this;
  }

   /**
   * The country where the card was issued.
   * @return issuerCountry
  **/
  @ApiModelProperty(value = "The country where the card was issued.")
  @JsonProperty(JSON_PROPERTY_ISSUER_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssuerCountry() {
    return issuerCountry;
  }


 /**
  * The country where the card was issued.
  *
  * @param issuerCountry
  */ 
  @JsonProperty(JSON_PROPERTY_ISSUER_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuerCountry(String issuerCountry) {
    this.issuerCountry = issuerCountry;
  }


  /**
   * Return true if this BinDetail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BinDetail binDetail = (BinDetail) o;
    return Objects.equals(this.issuerCountry, binDetail.issuerCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuerCountry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BinDetail {\n");
    sb.append("    issuerCountry: ").append(toIndentedString(issuerCountry)).append("\n");
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
   * Create an instance of BinDetail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BinDetail
   * @throws JsonProcessingException if the JSON string is invalid with respect to BinDetail
   */
  public static BinDetail fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, BinDetail.class);
  }
/**
  * Convert an instance of BinDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

