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
 * BalancePlatform
 */
@JsonPropertyOrder({
  BalancePlatform.JSON_PROPERTY_DESCRIPTION,
  BalancePlatform.JSON_PROPERTY_ID,
  BalancePlatform.JSON_PROPERTY_STATUS
})

public class BalancePlatform {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public BalancePlatform() { 
  }

  public BalancePlatform description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Your description of the balance platform, maximum 300 characters.
   * @return description
  **/
  @ApiModelProperty(value = "Your description of the balance platform, maximum 300 characters.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


 /**
  * Your description of the balance platform, maximum 300 characters.
  *
  * @param description
  */ 
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public BalancePlatform id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the balance platform.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the balance platform.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


 /**
  * The unique identifier of the balance platform.
  *
  * @param id
  */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public BalancePlatform status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the balance platform.  Possible values: **Active**, **Inactive**, **Closed**, **Suspended**.
   * @return status
  **/
  @ApiModelProperty(value = "The status of the balance platform.  Possible values: **Active**, **Inactive**, **Closed**, **Suspended**.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


 /**
  * The status of the balance platform.  Possible values: **Active**, **Inactive**, **Closed**, **Suspended**.
  *
  * @param status
  */ 
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * Return true if this BalancePlatform object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalancePlatform balancePlatform = (BalancePlatform) o;
    return Objects.equals(this.description, balancePlatform.description) &&
        Objects.equals(this.id, balancePlatform.id) &&
        Objects.equals(this.status, balancePlatform.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalancePlatform {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
   * Create an instance of BalancePlatform given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BalancePlatform
   * @throws JsonProcessingException if the JSON string is invalid with respect to BalancePlatform
   */
  public static BalancePlatform fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, BalancePlatform.class);
  }
/**
  * Convert an instance of BalancePlatform to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

