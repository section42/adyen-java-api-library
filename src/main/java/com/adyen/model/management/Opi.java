/*
 * Management API
 *
 * The version of the OpenAPI document: 3
 * 
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
 * Opi
 */
@JsonPropertyOrder({
  Opi.JSON_PROPERTY_ENABLE_PAY_AT_TABLE,
  Opi.JSON_PROPERTY_PAY_AT_TABLE_STORE_NUMBER,
  Opi.JSON_PROPERTY_PAY_AT_TABLE_U_R_L
})

public class Opi {
  public static final String JSON_PROPERTY_ENABLE_PAY_AT_TABLE = "enablePayAtTable";
  private Boolean enablePayAtTable;

  public static final String JSON_PROPERTY_PAY_AT_TABLE_STORE_NUMBER = "payAtTableStoreNumber";
  private String payAtTableStoreNumber;

  public static final String JSON_PROPERTY_PAY_AT_TABLE_U_R_L = "payAtTableURL";
  private String payAtTableURL;

  public Opi() { 
  }

  public Opi enablePayAtTable(Boolean enablePayAtTable) {
    this.enablePayAtTable = enablePayAtTable;
    return this;
  }

   /**
   * Indicates if Pay at table is enabled.
   * @return enablePayAtTable
  **/
  @ApiModelProperty(value = "Indicates if Pay at table is enabled.")
  @JsonProperty(JSON_PROPERTY_ENABLE_PAY_AT_TABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnablePayAtTable() {
    return enablePayAtTable;
  }


 /**
  * Indicates if Pay at table is enabled.
  *
  * @param enablePayAtTable
  */ 
  @JsonProperty(JSON_PROPERTY_ENABLE_PAY_AT_TABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnablePayAtTable(Boolean enablePayAtTable) {
    this.enablePayAtTable = enablePayAtTable;
  }


  public Opi payAtTableStoreNumber(String payAtTableStoreNumber) {
    this.payAtTableStoreNumber = payAtTableStoreNumber;
    return this;
  }

   /**
   * The store number to use for Pay at Table.
   * @return payAtTableStoreNumber
  **/
  @ApiModelProperty(value = "The store number to use for Pay at Table.")
  @JsonProperty(JSON_PROPERTY_PAY_AT_TABLE_STORE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayAtTableStoreNumber() {
    return payAtTableStoreNumber;
  }


 /**
  * The store number to use for Pay at Table.
  *
  * @param payAtTableStoreNumber
  */ 
  @JsonProperty(JSON_PROPERTY_PAY_AT_TABLE_STORE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayAtTableStoreNumber(String payAtTableStoreNumber) {
    this.payAtTableStoreNumber = payAtTableStoreNumber;
  }


  public Opi payAtTableURL(String payAtTableURL) {
    this.payAtTableURL = payAtTableURL;
    return this;
  }

   /**
   * The URL and port number used for Pay at Table communication.
   * @return payAtTableURL
  **/
  @ApiModelProperty(value = "The URL and port number used for Pay at Table communication.")
  @JsonProperty(JSON_PROPERTY_PAY_AT_TABLE_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayAtTableURL() {
    return payAtTableURL;
  }


 /**
  * The URL and port number used for Pay at Table communication.
  *
  * @param payAtTableURL
  */ 
  @JsonProperty(JSON_PROPERTY_PAY_AT_TABLE_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayAtTableURL(String payAtTableURL) {
    this.payAtTableURL = payAtTableURL;
  }


  /**
   * Return true if this Opi object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Opi opi = (Opi) o;
    return Objects.equals(this.enablePayAtTable, opi.enablePayAtTable) &&
        Objects.equals(this.payAtTableStoreNumber, opi.payAtTableStoreNumber) &&
        Objects.equals(this.payAtTableURL, opi.payAtTableURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enablePayAtTable, payAtTableStoreNumber, payAtTableURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Opi {\n");
    sb.append("    enablePayAtTable: ").append(toIndentedString(enablePayAtTable)).append("\n");
    sb.append("    payAtTableStoreNumber: ").append(toIndentedString(payAtTableStoreNumber)).append("\n");
    sb.append("    payAtTableURL: ").append(toIndentedString(payAtTableURL)).append("\n");
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
   * Create an instance of Opi given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Opi
   * @throws JsonProcessingException if the JSON string is invalid with respect to Opi
   */
  public static Opi fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Opi.class);
  }
/**
  * Convert an instance of Opi to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

