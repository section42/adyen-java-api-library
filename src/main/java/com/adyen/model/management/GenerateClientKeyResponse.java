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
 * GenerateClientKeyResponse
 */
@JsonPropertyOrder({
  GenerateClientKeyResponse.JSON_PROPERTY_CLIENT_KEY
})

public class GenerateClientKeyResponse {
  public static final String JSON_PROPERTY_CLIENT_KEY = "clientKey";
  private String clientKey;

  public GenerateClientKeyResponse() { 
  }

  public GenerateClientKeyResponse clientKey(String clientKey) {
    this.clientKey = clientKey;
    return this;
  }

   /**
   * Generated client key
   * @return clientKey
  **/
  @ApiModelProperty(required = true, value = "Generated client key")
  @JsonProperty(JSON_PROPERTY_CLIENT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientKey() {
    return clientKey;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientKey(String clientKey) {
    this.clientKey = clientKey;
  }


  /**
   * Return true if this GenerateClientKeyResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateClientKeyResponse generateClientKeyResponse = (GenerateClientKeyResponse) o;
    return Objects.equals(this.clientKey, generateClientKeyResponse.clientKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateClientKeyResponse {\n");
    sb.append("    clientKey: ").append(toIndentedString(clientKey)).append("\n");
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
   * Create an instance of GenerateClientKeyResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GenerateClientKeyResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to GenerateClientKeyResponse
   */
  public static GenerateClientKeyResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, GenerateClientKeyResponse.class);
  }
/**
  * Convert an instance of GenerateClientKeyResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

