/*
 * Capital API
 * Adyen Capital allows you to build an embedded financing offering for your users to serve their operational needs. Learn more about [Adyen Capital](https://docs.adyen.com/marketplaces-and-platforms/capital).  ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -H \"Content-Type: application/json\" \\ -U \"ws@BalancePlatform.YOUR_BALANCE_PLATFORM\":\"YOUR_WS_PASSWORD\" \\ ... ``` ## Roles and permissions To use the Capital API, you need an additional role for your API credential. Your Adyen contact will set up the roles and permissions for you. ## Versioning The Capital API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://balanceplatform-api-test.adyen.com/btl/v3/grants ``` ## Going live When going live, your Adyen contact will provide your API credential for the live environment. You can then use the username and password to send requests to `https://balanceplatform-api-live.adyen.com/btl/v3`.  
 *
 * The version of the OpenAPI document: 3
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.capital;

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
 * InvalidField
 */
@JsonPropertyOrder({
  InvalidField.JSON_PROPERTY_MESSAGE,
  InvalidField.JSON_PROPERTY_NAME,
  InvalidField.JSON_PROPERTY_VALUE
})

public class InvalidField {
  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public InvalidField() { 
  }

  public InvalidField message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Description of the validation error.
   * @return message
  **/
  @ApiModelProperty(required = true, value = "Description of the validation error.")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public InvalidField name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The field that has an invalid value.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The field that has an invalid value.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public InvalidField value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The invalid value.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The invalid value.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * Return true if this InvalidField object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvalidField invalidField = (InvalidField) o;
    return Objects.equals(this.message, invalidField.message) &&
        Objects.equals(this.name, invalidField.name) &&
        Objects.equals(this.value, invalidField.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidField {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
   * Create an instance of InvalidField given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InvalidField
   * @throws JsonProcessingException if the JSON string is invalid with respect to InvalidField
   */
  public static InvalidField fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, InvalidField.class);
  }
/**
  * Convert an instance of InvalidField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

