/*
 * Transfers API
 *
 * The version of the OpenAPI document: 3
 * Contact: developer-experience@adyen.com
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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * JSONPath
 */
@JsonPropertyOrder({
  JSONPath.JSON_PROPERTY_CONTENT
})

public class JSONPath {
  public static final String JSON_PROPERTY_CONTENT = "content";
  private List<String> content = null;

  public JSONPath() { 
  }

  public JSONPath content(List<String> content) {
    this.content = content;
    return this;
  }

  public JSONPath addContentItem(String contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(List<String> content) {
    this.content = content;
  }


  /**
   * Return true if this JSONPath object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JSONPath jsONPath = (JSONPath) o;
    return Objects.equals(this.content, jsONPath.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JSONPath {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
   * Create an instance of JSONPath given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of JSONPath
   * @throws JsonProcessingException if the JSON string is invalid with respect to JSONPath
   */
  public static JSONPath fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, JSONPath.class);
  }
/**
  * Convert an instance of JSONPath to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

