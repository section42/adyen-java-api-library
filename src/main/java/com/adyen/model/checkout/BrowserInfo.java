/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * Contact: developer-experience@adyen.com
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
import com.adyen.service.JSON;


/**
 * BrowserInfo
 */
@JsonPropertyOrder({
  BrowserInfo.JSON_PROPERTY_ACCEPT_HEADER,
  BrowserInfo.JSON_PROPERTY_COLOR_DEPTH,
  BrowserInfo.JSON_PROPERTY_JAVA_ENABLED,
  BrowserInfo.JSON_PROPERTY_JAVA_SCRIPT_ENABLED,
  BrowserInfo.JSON_PROPERTY_LANGUAGE,
  BrowserInfo.JSON_PROPERTY_SCREEN_HEIGHT,
  BrowserInfo.JSON_PROPERTY_SCREEN_WIDTH,
  BrowserInfo.JSON_PROPERTY_TIME_ZONE_OFFSET,
  BrowserInfo.JSON_PROPERTY_USER_AGENT
})

public class BrowserInfo {
  public static final String JSON_PROPERTY_ACCEPT_HEADER = "acceptHeader";
  private String acceptHeader;

  public static final String JSON_PROPERTY_COLOR_DEPTH = "colorDepth";
  private Integer colorDepth;

  public static final String JSON_PROPERTY_JAVA_ENABLED = "javaEnabled";
  private Boolean javaEnabled;

  public static final String JSON_PROPERTY_JAVA_SCRIPT_ENABLED = "javaScriptEnabled";
  private Boolean javaScriptEnabled = true;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_SCREEN_HEIGHT = "screenHeight";
  private Integer screenHeight;

  public static final String JSON_PROPERTY_SCREEN_WIDTH = "screenWidth";
  private Integer screenWidth;

  public static final String JSON_PROPERTY_TIME_ZONE_OFFSET = "timeZoneOffset";
  private Integer timeZoneOffset;

  public static final String JSON_PROPERTY_USER_AGENT = "userAgent";
  private String userAgent;

  public BrowserInfo() { 
  }

  public BrowserInfo acceptHeader(String acceptHeader) {
    this.acceptHeader = acceptHeader;
    return this;
  }

   /**
   * The accept header value of the shopper&#39;s browser.
   * @return acceptHeader
  **/
  @ApiModelProperty(required = true, value = "The accept header value of the shopper's browser.")
  @JsonProperty(JSON_PROPERTY_ACCEPT_HEADER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAcceptHeader() {
    return acceptHeader;
  }


  @JsonProperty(JSON_PROPERTY_ACCEPT_HEADER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAcceptHeader(String acceptHeader) {
    this.acceptHeader = acceptHeader;
  }


  public BrowserInfo colorDepth(Integer colorDepth) {
    this.colorDepth = colorDepth;
    return this;
  }

   /**
   * The color depth of the shopper&#39;s browser in bits per pixel. This should be obtained by using the browser&#39;s &#x60;screen.colorDepth&#x60; property. Accepted values: 1, 4, 8, 15, 16, 24, 30, 32 or 48 bit color depth.
   * @return colorDepth
  **/
  @ApiModelProperty(required = true, value = "The color depth of the shopper's browser in bits per pixel. This should be obtained by using the browser's `screen.colorDepth` property. Accepted values: 1, 4, 8, 15, 16, 24, 30, 32 or 48 bit color depth.")
  @JsonProperty(JSON_PROPERTY_COLOR_DEPTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getColorDepth() {
    return colorDepth;
  }


  @JsonProperty(JSON_PROPERTY_COLOR_DEPTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setColorDepth(Integer colorDepth) {
    this.colorDepth = colorDepth;
  }


  public BrowserInfo javaEnabled(Boolean javaEnabled) {
    this.javaEnabled = javaEnabled;
    return this;
  }

   /**
   * Boolean value indicating if the shopper&#39;s browser is able to execute Java.
   * @return javaEnabled
  **/
  @ApiModelProperty(required = true, value = "Boolean value indicating if the shopper's browser is able to execute Java.")
  @JsonProperty(JSON_PROPERTY_JAVA_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getJavaEnabled() {
    return javaEnabled;
  }


  @JsonProperty(JSON_PROPERTY_JAVA_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setJavaEnabled(Boolean javaEnabled) {
    this.javaEnabled = javaEnabled;
  }


  public BrowserInfo javaScriptEnabled(Boolean javaScriptEnabled) {
    this.javaScriptEnabled = javaScriptEnabled;
    return this;
  }

   /**
   * Boolean value indicating if the shopper&#39;s browser is able to execute JavaScript. A default &#39;true&#39; value is assumed if the field is not present.
   * @return javaScriptEnabled
  **/
  @ApiModelProperty(value = "Boolean value indicating if the shopper's browser is able to execute JavaScript. A default 'true' value is assumed if the field is not present.")
  @JsonProperty(JSON_PROPERTY_JAVA_SCRIPT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getJavaScriptEnabled() {
    return javaScriptEnabled;
  }


  @JsonProperty(JSON_PROPERTY_JAVA_SCRIPT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJavaScriptEnabled(Boolean javaScriptEnabled) {
    this.javaScriptEnabled = javaScriptEnabled;
  }


  public BrowserInfo language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The &#x60;navigator.language&#x60; value of the shopper&#39;s browser (as defined in IETF BCP 47).
   * @return language
  **/
  @ApiModelProperty(required = true, value = "The `navigator.language` value of the shopper's browser (as defined in IETF BCP 47).")
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLanguage(String language) {
    this.language = language;
  }


  public BrowserInfo screenHeight(Integer screenHeight) {
    this.screenHeight = screenHeight;
    return this;
  }

   /**
   * The total height of the shopper&#39;s device screen in pixels.
   * @return screenHeight
  **/
  @ApiModelProperty(required = true, value = "The total height of the shopper's device screen in pixels.")
  @JsonProperty(JSON_PROPERTY_SCREEN_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getScreenHeight() {
    return screenHeight;
  }


  @JsonProperty(JSON_PROPERTY_SCREEN_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScreenHeight(Integer screenHeight) {
    this.screenHeight = screenHeight;
  }


  public BrowserInfo screenWidth(Integer screenWidth) {
    this.screenWidth = screenWidth;
    return this;
  }

   /**
   * The total width of the shopper&#39;s device screen in pixels.
   * @return screenWidth
  **/
  @ApiModelProperty(required = true, value = "The total width of the shopper's device screen in pixels.")
  @JsonProperty(JSON_PROPERTY_SCREEN_WIDTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getScreenWidth() {
    return screenWidth;
  }


  @JsonProperty(JSON_PROPERTY_SCREEN_WIDTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScreenWidth(Integer screenWidth) {
    this.screenWidth = screenWidth;
  }


  public BrowserInfo timeZoneOffset(Integer timeZoneOffset) {
    this.timeZoneOffset = timeZoneOffset;
    return this;
  }

   /**
   * Time difference between UTC time and the shopper&#39;s browser local time, in minutes.
   * @return timeZoneOffset
  **/
  @ApiModelProperty(required = true, value = "Time difference between UTC time and the shopper's browser local time, in minutes.")
  @JsonProperty(JSON_PROPERTY_TIME_ZONE_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTimeZoneOffset() {
    return timeZoneOffset;
  }


  @JsonProperty(JSON_PROPERTY_TIME_ZONE_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimeZoneOffset(Integer timeZoneOffset) {
    this.timeZoneOffset = timeZoneOffset;
  }


  public BrowserInfo userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * The user agent value of the shopper&#39;s browser.
   * @return userAgent
  **/
  @ApiModelProperty(required = true, value = "The user agent value of the shopper's browser.")
  @JsonProperty(JSON_PROPERTY_USER_AGENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUserAgent() {
    return userAgent;
  }


  @JsonProperty(JSON_PROPERTY_USER_AGENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  /**
   * Return true if this BrowserInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrowserInfo browserInfo = (BrowserInfo) o;
    return Objects.equals(this.acceptHeader, browserInfo.acceptHeader) &&
        Objects.equals(this.colorDepth, browserInfo.colorDepth) &&
        Objects.equals(this.javaEnabled, browserInfo.javaEnabled) &&
        Objects.equals(this.javaScriptEnabled, browserInfo.javaScriptEnabled) &&
        Objects.equals(this.language, browserInfo.language) &&
        Objects.equals(this.screenHeight, browserInfo.screenHeight) &&
        Objects.equals(this.screenWidth, browserInfo.screenWidth) &&
        Objects.equals(this.timeZoneOffset, browserInfo.timeZoneOffset) &&
        Objects.equals(this.userAgent, browserInfo.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptHeader, colorDepth, javaEnabled, javaScriptEnabled, language, screenHeight, screenWidth, timeZoneOffset, userAgent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrowserInfo {\n");
    sb.append("    acceptHeader: ").append(toIndentedString(acceptHeader)).append("\n");
    sb.append("    colorDepth: ").append(toIndentedString(colorDepth)).append("\n");
    sb.append("    javaEnabled: ").append(toIndentedString(javaEnabled)).append("\n");
    sb.append("    javaScriptEnabled: ").append(toIndentedString(javaScriptEnabled)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    screenHeight: ").append(toIndentedString(screenHeight)).append("\n");
    sb.append("    screenWidth: ").append(toIndentedString(screenWidth)).append("\n");
    sb.append("    timeZoneOffset: ").append(toIndentedString(timeZoneOffset)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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
   * Create an instance of BrowserInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BrowserInfo
   * @throws JsonProcessingException if the JSON string is invalid with respect to BrowserInfo
   */
  public static BrowserInfo fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, BrowserInfo.class);
  }
/**
  * Convert an instance of BrowserInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

