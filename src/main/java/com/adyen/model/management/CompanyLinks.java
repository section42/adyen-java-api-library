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
import com.adyen.model.management.LinksElement;
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
 * CompanyLinks
 */
@JsonPropertyOrder({
  CompanyLinks.JSON_PROPERTY_API_CREDENTIALS,
  CompanyLinks.JSON_PROPERTY_SELF,
  CompanyLinks.JSON_PROPERTY_USERS,
  CompanyLinks.JSON_PROPERTY_WEBHOOKS
})

public class CompanyLinks {
  public static final String JSON_PROPERTY_API_CREDENTIALS = "apiCredentials";
  private LinksElement apiCredentials;

  public static final String JSON_PROPERTY_SELF = "self";
  private LinksElement self;

  public static final String JSON_PROPERTY_USERS = "users";
  private LinksElement users;

  public static final String JSON_PROPERTY_WEBHOOKS = "webhooks";
  private LinksElement webhooks;

  public CompanyLinks() { 
  }

  public CompanyLinks apiCredentials(LinksElement apiCredentials) {
    this.apiCredentials = apiCredentials;
    return this;
  }

   /**
   * Get apiCredentials
   * @return apiCredentials
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_API_CREDENTIALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LinksElement getApiCredentials() {
    return apiCredentials;
  }


  @JsonProperty(JSON_PROPERTY_API_CREDENTIALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiCredentials(LinksElement apiCredentials) {
    this.apiCredentials = apiCredentials;
  }


  public CompanyLinks self(LinksElement self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LinksElement getSelf() {
    return self;
  }


  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelf(LinksElement self) {
    this.self = self;
  }


  public CompanyLinks users(LinksElement users) {
    this.users = users;
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LinksElement getUsers() {
    return users;
  }


  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsers(LinksElement users) {
    this.users = users;
  }


  public CompanyLinks webhooks(LinksElement webhooks) {
    this.webhooks = webhooks;
    return this;
  }

   /**
   * Get webhooks
   * @return webhooks
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WEBHOOKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LinksElement getWebhooks() {
    return webhooks;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebhooks(LinksElement webhooks) {
    this.webhooks = webhooks;
  }


  /**
   * Return true if this CompanyLinks object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyLinks companyLinks = (CompanyLinks) o;
    return Objects.equals(this.apiCredentials, companyLinks.apiCredentials) &&
        Objects.equals(this.self, companyLinks.self) &&
        Objects.equals(this.users, companyLinks.users) &&
        Objects.equals(this.webhooks, companyLinks.webhooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiCredentials, self, users, webhooks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyLinks {\n");
    sb.append("    apiCredentials: ").append(toIndentedString(apiCredentials)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    webhooks: ").append(toIndentedString(webhooks)).append("\n");
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
   * Create an instance of CompanyLinks given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CompanyLinks
   * @throws JsonProcessingException if the JSON string is invalid with respect to CompanyLinks
   */
  public static CompanyLinks fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CompanyLinks.class);
  }
/**
  * Convert an instance of CompanyLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

