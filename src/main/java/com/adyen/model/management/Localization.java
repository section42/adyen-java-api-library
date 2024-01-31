/*
 * Management API
 *
 * The version of the OpenAPI document: 3
 * 
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
 * Localization
 */
@JsonPropertyOrder({
  Localization.JSON_PROPERTY_LANGUAGE,
  Localization.JSON_PROPERTY_SECONDARY_LANGUAGE,
  Localization.JSON_PROPERTY_TIMEZONE
})

public class Localization {
  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_SECONDARY_LANGUAGE = "secondaryLanguage";
  private String secondaryLanguage;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public Localization() { 
  }

  public Localization language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Language of the terminal.
   * @return language
  **/
  @ApiModelProperty(value = "Language of the terminal.")
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }


 /**
  * Language of the terminal.
  *
  * @param language
  */ 
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(String language) {
    this.language = language;
  }


  public Localization secondaryLanguage(String secondaryLanguage) {
    this.secondaryLanguage = secondaryLanguage;
    return this;
  }

   /**
   * Secondary language of the terminal.
   * @return secondaryLanguage
  **/
  @ApiModelProperty(value = "Secondary language of the terminal.")
  @JsonProperty(JSON_PROPERTY_SECONDARY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecondaryLanguage() {
    return secondaryLanguage;
  }


 /**
  * Secondary language of the terminal.
  *
  * @param secondaryLanguage
  */ 
  @JsonProperty(JSON_PROPERTY_SECONDARY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecondaryLanguage(String secondaryLanguage) {
    this.secondaryLanguage = secondaryLanguage;
  }


  public Localization timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * The time zone of the terminal.
   * @return timezone
  **/
  @ApiModelProperty(value = "The time zone of the terminal.")
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimezone() {
    return timezone;
  }


 /**
  * The time zone of the terminal.
  *
  * @param timezone
  */ 
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  /**
   * Return true if this Localization object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Localization localization = (Localization) o;
    return Objects.equals(this.language, localization.language) &&
        Objects.equals(this.secondaryLanguage, localization.secondaryLanguage) &&
        Objects.equals(this.timezone, localization.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, secondaryLanguage, timezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Localization {\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    secondaryLanguage: ").append(toIndentedString(secondaryLanguage)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
   * Create an instance of Localization given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Localization
   * @throws JsonProcessingException if the JSON string is invalid with respect to Localization
   */
  public static Localization fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Localization.class);
  }
/**
  * Convert an instance of Localization to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

