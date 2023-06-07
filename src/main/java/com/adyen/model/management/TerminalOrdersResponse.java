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
import com.adyen.model.management.TerminalOrder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * TerminalOrdersResponse
 */
@JsonPropertyOrder({
  TerminalOrdersResponse.JSON_PROPERTY_DATA
})

public class TerminalOrdersResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<TerminalOrder> data = null;

  public TerminalOrdersResponse() { 
  }

  public TerminalOrdersResponse data(List<TerminalOrder> data) {
    this.data = data;
    return this;
  }

  public TerminalOrdersResponse addDataItem(TerminalOrder dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * List of orders for payment terminal packages and parts.
   * @return data
  **/
  @ApiModelProperty(value = "List of orders for payment terminal packages and parts.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TerminalOrder> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<TerminalOrder> data) {
    this.data = data;
  }


  /**
   * Return true if this TerminalOrdersResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalOrdersResponse terminalOrdersResponse = (TerminalOrdersResponse) o;
    return Objects.equals(this.data, terminalOrdersResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalOrdersResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
   * Create an instance of TerminalOrdersResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TerminalOrdersResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to TerminalOrdersResponse
   */
  public static TerminalOrdersResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TerminalOrdersResponse.class);
  }
/**
  * Convert an instance of TerminalOrdersResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

