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
 * Url
 */
@JsonPropertyOrder({
  Url.JSON_PROPERTY_ENCRYPTED,
  Url.JSON_PROPERTY_PASSWORD,
  Url.JSON_PROPERTY_URL,
  Url.JSON_PROPERTY_USERNAME
})

public class Url {
  public static final String JSON_PROPERTY_ENCRYPTED = "encrypted";
  private Boolean encrypted;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public Url() { 
  }

  public Url encrypted(Boolean encrypted) {
    this.encrypted = encrypted;
    return this;
  }

   /**
   * Indicates if the message sent to this URL should be encrypted.
   * @return encrypted
  **/
  @ApiModelProperty(value = "Indicates if the message sent to this URL should be encrypted.")
  @JsonProperty(JSON_PROPERTY_ENCRYPTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEncrypted() {
    return encrypted;
  }


  @JsonProperty(JSON_PROPERTY_ENCRYPTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncrypted(Boolean encrypted) {
    this.encrypted = encrypted;
  }


  public Url password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password for authentication of the notifications.
   * @return password
  **/
  @ApiModelProperty(value = "The password for authentication of the notifications.")
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(String password) {
    this.password = password;
  }


  public Url url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL in the format: http(s)://domain.com.
   * @return url
  **/
  @ApiModelProperty(value = "The URL in the format: http(s)://domain.com.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public Url username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The username for authentication of the notifications.
   * @return username
  **/
  @ApiModelProperty(value = "The username for authentication of the notifications.")
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(String username) {
    this.username = username;
  }


  /**
   * Return true if this Url object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Url url = (Url) o;
    return Objects.equals(this.encrypted, url.encrypted) &&
        Objects.equals(this.password, url.password) &&
        Objects.equals(this.url, url.url) &&
        Objects.equals(this.username, url.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encrypted, password, url, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Url {\n");
    sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
   * Create an instance of Url given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Url
   * @throws JsonProcessingException if the JSON string is invalid with respect to Url
   */
  public static Url fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Url.class);
  }
/**
  * Convert an instance of Url to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

