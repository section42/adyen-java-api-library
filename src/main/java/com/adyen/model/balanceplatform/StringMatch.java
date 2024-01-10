/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

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
 * StringMatch
 */
@JsonPropertyOrder({
  StringMatch.JSON_PROPERTY_OPERATION,
  StringMatch.JSON_PROPERTY_VALUE
})

public class StringMatch {
  /**
   * The type of string matching operation. Possible values:  **startsWith**, **endsWith**, **isEqualTo**, **contains**,
   */
  public enum OperationEnum {
    CONTAINS("contains"),
    
    ENDSWITH("endsWith"),
    
    ISEQUALTO("isEqualTo"),
    
    STARTSWITH("startsWith");

    private String value;

    OperationEnum(String value) {
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
    public static OperationEnum fromValue(String value) {
      for (OperationEnum b : OperationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_OPERATION = "operation";
  private OperationEnum operation;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public StringMatch() { 
  }

  public StringMatch operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

   /**
   * The type of string matching operation. Possible values:  **startsWith**, **endsWith**, **isEqualTo**, **contains**,
   * @return operation
  **/
  @ApiModelProperty(value = "The type of string matching operation. Possible values:  **startsWith**, **endsWith**, **isEqualTo**, **contains**,")
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OperationEnum getOperation() {
    return operation;
  }


 /**
  * The type of string matching operation. Possible values:  **startsWith**, **endsWith**, **isEqualTo**, **contains**,
  *
  * @param operation
  */ 
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }


  public StringMatch value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The string to be matched.
   * @return value
  **/
  @ApiModelProperty(value = "The string to be matched.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


 /**
  * The string to be matched.
  *
  * @param value
  */ 
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * Return true if this StringMatch object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringMatch stringMatch = (StringMatch) o;
    return Objects.equals(this.operation, stringMatch.operation) &&
        Objects.equals(this.value, stringMatch.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringMatch {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
   * Create an instance of StringMatch given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StringMatch
   * @throws JsonProcessingException if the JSON string is invalid with respect to StringMatch
   */
  public static StringMatch fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, StringMatch.class);
  }
/**
  * Convert an instance of StringMatch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

