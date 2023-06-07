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
 * TerminalActionScheduleDetail
 */
@JsonPropertyOrder({
  TerminalActionScheduleDetail.JSON_PROPERTY_ID,
  TerminalActionScheduleDetail.JSON_PROPERTY_TERMINAL_ID
})

public class TerminalActionScheduleDetail {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TERMINAL_ID = "terminalId";
  private String terminalId;

  public TerminalActionScheduleDetail() { 
  }

  public TerminalActionScheduleDetail id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the action on the specified terminal.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the action on the specified terminal.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public TerminalActionScheduleDetail terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

   /**
   * The unique ID of the terminal that the action applies to.
   * @return terminalId
  **/
  @ApiModelProperty(value = "The unique ID of the terminal that the action applies to.")
  @JsonProperty(JSON_PROPERTY_TERMINAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTerminalId() {
    return terminalId;
  }


  @JsonProperty(JSON_PROPERTY_TERMINAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }


  /**
   * Return true if this TerminalActionScheduleDetail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalActionScheduleDetail terminalActionScheduleDetail = (TerminalActionScheduleDetail) o;
    return Objects.equals(this.id, terminalActionScheduleDetail.id) &&
        Objects.equals(this.terminalId, terminalActionScheduleDetail.terminalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, terminalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalActionScheduleDetail {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
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
   * Create an instance of TerminalActionScheduleDetail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TerminalActionScheduleDetail
   * @throws JsonProcessingException if the JSON string is invalid with respect to TerminalActionScheduleDetail
   */
  public static TerminalActionScheduleDetail fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TerminalActionScheduleDetail.class);
  }
/**
  * Convert an instance of TerminalActionScheduleDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

