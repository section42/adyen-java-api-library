/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 71
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

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
 * CommonField
 */
@JsonPropertyOrder({
  CommonField.JSON_PROPERTY_NAME,
  CommonField.JSON_PROPERTY_VERSION
})

public class CommonField {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public CommonField() { 
  }

  public CommonField name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the field. For example, Name of External Platform.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the field. For example, Name of External Platform.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


 /**
  * Name of the field. For example, Name of External Platform.
  *
  * @param name
  */ 
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public CommonField version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version of the field. For example, Version of External Platform.
   * @return version
  **/
  @ApiModelProperty(value = "Version of the field. For example, Version of External Platform.")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


 /**
  * Version of the field. For example, Version of External Platform.
  *
  * @param version
  */ 
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   * Return true if this CommonField object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonField commonField = (CommonField) o;
    return Objects.equals(this.name, commonField.name) &&
        Objects.equals(this.version, commonField.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonField {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
   * Create an instance of CommonField given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CommonField
   * @throws JsonProcessingException if the JSON string is invalid with respect to CommonField
   */
  public static CommonField fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CommonField.class);
  }
/**
  * Convert an instance of CommonField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

