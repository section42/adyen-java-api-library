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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.adyen.model.checkout.JSON;

/**
 * BrowserInfo
 */

public class BrowserInfo {
  public static final String SERIALIZED_NAME_ACCEPT_HEADER = "acceptHeader";
  @SerializedName(SERIALIZED_NAME_ACCEPT_HEADER)
  private String acceptHeader;

  public static final String SERIALIZED_NAME_COLOR_DEPTH = "colorDepth";
  @SerializedName(SERIALIZED_NAME_COLOR_DEPTH)
  private Integer colorDepth;

  public static final String SERIALIZED_NAME_JAVA_ENABLED = "javaEnabled";
  @SerializedName(SERIALIZED_NAME_JAVA_ENABLED)
  private Boolean javaEnabled;

  public static final String SERIALIZED_NAME_JAVA_SCRIPT_ENABLED = "javaScriptEnabled";
  @SerializedName(SERIALIZED_NAME_JAVA_SCRIPT_ENABLED)
  private Boolean javaScriptEnabled = true;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_SCREEN_HEIGHT = "screenHeight";
  @SerializedName(SERIALIZED_NAME_SCREEN_HEIGHT)
  private Integer screenHeight;

  public static final String SERIALIZED_NAME_SCREEN_WIDTH = "screenWidth";
  @SerializedName(SERIALIZED_NAME_SCREEN_WIDTH)
  private Integer screenWidth;

  public static final String SERIALIZED_NAME_TIME_ZONE_OFFSET = "timeZoneOffset";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE_OFFSET)
  private Integer timeZoneOffset;

  public static final String SERIALIZED_NAME_USER_AGENT = "userAgent";
  @SerializedName(SERIALIZED_NAME_USER_AGENT)
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

  public String getAcceptHeader() {
    return acceptHeader;
  }


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

  public Integer getColorDepth() {
    return colorDepth;
  }


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

  public Boolean getJavaEnabled() {
    return javaEnabled;
  }


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

  public Boolean getJavaScriptEnabled() {
    return javaScriptEnabled;
  }


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

  public String getLanguage() {
    return language;
  }


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

  public Integer getScreenHeight() {
    return screenHeight;
  }


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

  public Integer getScreenWidth() {
    return screenWidth;
  }


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

  public Integer getTimeZoneOffset() {
    return timeZoneOffset;
  }


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

  public String getUserAgent() {
    return userAgent;
  }


  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }



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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("acceptHeader");
    openapiFields.add("colorDepth");
    openapiFields.add("javaEnabled");
    openapiFields.add("javaScriptEnabled");
    openapiFields.add("language");
    openapiFields.add("screenHeight");
    openapiFields.add("screenWidth");
    openapiFields.add("timeZoneOffset");
    openapiFields.add("userAgent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("acceptHeader");
    openapiRequiredFields.add("colorDepth");
    openapiRequiredFields.add("javaEnabled");
    openapiRequiredFields.add("language");
    openapiRequiredFields.add("screenHeight");
    openapiRequiredFields.add("screenWidth");
    openapiRequiredFields.add("timeZoneOffset");
    openapiRequiredFields.add("userAgent");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(BrowserInfo.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BrowserInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BrowserInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BrowserInfo is not found in the empty JSON string", BrowserInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BrowserInfo.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `BrowserInfo` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BrowserInfo.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field acceptHeader
      if (jsonObj.get("acceptHeader") != null && !jsonObj.get("acceptHeader").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `acceptHeader` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acceptHeader").toString()));
      }
      // validate the optional field language
      if (jsonObj.get("language") != null && !jsonObj.get("language").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      // validate the optional field userAgent
      if (jsonObj.get("userAgent") != null && !jsonObj.get("userAgent").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `userAgent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userAgent").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrowserInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrowserInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrowserInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrowserInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrowserInfo>() {
           @Override
           public void write(JsonWriter out, BrowserInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrowserInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrowserInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrowserInfo
  * @throws IOException if the JSON string is invalid with respect to BrowserInfo
  */
  public static BrowserInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrowserInfo.class);
  }

 /**
  * Convert an instance of BrowserInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

