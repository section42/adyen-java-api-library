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
import com.adyen.model.management.Links;
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
 * CreateAllowedOriginRequest
 */
@JsonPropertyOrder({
  CreateAllowedOriginRequest.JSON_PROPERTY_LINKS,
  CreateAllowedOriginRequest.JSON_PROPERTY_DOMAIN,
  CreateAllowedOriginRequest.JSON_PROPERTY_ID
})

public class CreateAllowedOriginRequest {
  public static final String JSON_PROPERTY_LINKS = "_links";
  private Links links;

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public CreateAllowedOriginRequest() { 
  }

  public CreateAllowedOriginRequest links(Links links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Links getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(Links links) {
    this.links = links;
  }


  public CreateAllowedOriginRequest domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Domain of the allowed origin.
   * @return domain
  **/
  @ApiModelProperty(example = "https://adyen.com", required = true, value = "Domain of the allowed origin.")
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDomain() {
    return domain;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomain(String domain) {
    this.domain = domain;
  }


  public CreateAllowedOriginRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the allowed origin.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the allowed origin.")
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


  /**
   * Return true if this CreateAllowedOriginRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAllowedOriginRequest createAllowedOriginRequest = (CreateAllowedOriginRequest) o;
    return Objects.equals(this.links, createAllowedOriginRequest.links) &&
        Objects.equals(this.domain, createAllowedOriginRequest.domain) &&
        Objects.equals(this.id, createAllowedOriginRequest.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, domain, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAllowedOriginRequest {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
   * Create an instance of CreateAllowedOriginRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateAllowedOriginRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to CreateAllowedOriginRequest
   */
  public static CreateAllowedOriginRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CreateAllowedOriginRequest.class);
  }
/**
  * Convert an instance of CreateAllowedOriginRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

