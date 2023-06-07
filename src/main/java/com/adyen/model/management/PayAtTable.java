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
 * PayAtTable
 */
@JsonPropertyOrder({
  PayAtTable.JSON_PROPERTY_AUTHENTICATION_METHOD,
  PayAtTable.JSON_PROPERTY_ENABLE_PAY_AT_TABLE
})

public class PayAtTable {
  /**
   * Allowed authentication methods: Magswipe, Manual Entry.
   */
  public enum AuthenticationMethodEnum {
    MAGSWIPE("MAGSWIPE"),
    
    MKE("MKE");

    private String value;

    AuthenticationMethodEnum(String value) {
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
    public static AuthenticationMethodEnum fromValue(String value) {
      for (AuthenticationMethodEnum b : AuthenticationMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_AUTHENTICATION_METHOD = "authenticationMethod";
  private AuthenticationMethodEnum authenticationMethod;

  public static final String JSON_PROPERTY_ENABLE_PAY_AT_TABLE = "enablePayAtTable";
  private Boolean enablePayAtTable;

  public PayAtTable() { 
  }

  public PayAtTable authenticationMethod(AuthenticationMethodEnum authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
    return this;
  }

   /**
   * Allowed authentication methods: Magswipe, Manual Entry.
   * @return authenticationMethod
  **/
  @ApiModelProperty(value = "Allowed authentication methods: Magswipe, Manual Entry.")
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AuthenticationMethodEnum getAuthenticationMethod() {
    return authenticationMethod;
  }


  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthenticationMethod(AuthenticationMethodEnum authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
  }


  public PayAtTable enablePayAtTable(Boolean enablePayAtTable) {
    this.enablePayAtTable = enablePayAtTable;
    return this;
  }

   /**
   * Enable Pay at table.
   * @return enablePayAtTable
  **/
  @ApiModelProperty(value = "Enable Pay at table.")
  @JsonProperty(JSON_PROPERTY_ENABLE_PAY_AT_TABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnablePayAtTable() {
    return enablePayAtTable;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_PAY_AT_TABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnablePayAtTable(Boolean enablePayAtTable) {
    this.enablePayAtTable = enablePayAtTable;
  }


  /**
   * Return true if this PayAtTable object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayAtTable payAtTable = (PayAtTable) o;
    return Objects.equals(this.authenticationMethod, payAtTable.authenticationMethod) &&
        Objects.equals(this.enablePayAtTable, payAtTable.enablePayAtTable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationMethod, enablePayAtTable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayAtTable {\n");
    sb.append("    authenticationMethod: ").append(toIndentedString(authenticationMethod)).append("\n");
    sb.append("    enablePayAtTable: ").append(toIndentedString(enablePayAtTable)).append("\n");
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
   * Create an instance of PayAtTable given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PayAtTable
   * @throws JsonProcessingException if the JSON string is invalid with respect to PayAtTable
   */
  public static PayAtTable fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PayAtTable.class);
  }
/**
  * Convert an instance of PayAtTable to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

