/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * 
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
 * WeChatPayMiniProgramDetails
 */

public class WeChatPayMiniProgramDetails {
  public static final String SERIALIZED_NAME_APP_ID = "appId";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public static final String SERIALIZED_NAME_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  @SerializedName(SERIALIZED_NAME_CHECKOUT_ATTEMPT_ID)
  private String checkoutAttemptId;

  public static final String SERIALIZED_NAME_OPENID = "openid";
  @SerializedName(SERIALIZED_NAME_OPENID)
  private String openid;

  /**
   * **wechatpayMiniProgram**
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    WECHATPAYMINIPROGRAM("wechatpayMiniProgram");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.WECHATPAYMINIPROGRAM;

  public WeChatPayMiniProgramDetails() { 
  }

  public WeChatPayMiniProgramDetails appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @ApiModelProperty(value = "")

  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public WeChatPayMiniProgramDetails checkoutAttemptId(String checkoutAttemptId) {
    
    this.checkoutAttemptId = checkoutAttemptId;
    return this;
  }

   /**
   * The checkout attempt identifier.
   * @return checkoutAttemptId
  **/
  @ApiModelProperty(value = "The checkout attempt identifier.")

  public String getCheckoutAttemptId() {
    return checkoutAttemptId;
  }


  public void setCheckoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
  }


  public WeChatPayMiniProgramDetails openid(String openid) {
    
    this.openid = openid;
    return this;
  }

   /**
   * Get openid
   * @return openid
  **/
  @ApiModelProperty(value = "")

  public String getOpenid() {
    return openid;
  }


  public void setOpenid(String openid) {
    this.openid = openid;
  }


  public WeChatPayMiniProgramDetails type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * **wechatpayMiniProgram**
   * @return type
  **/
  @ApiModelProperty(value = "**wechatpayMiniProgram**")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeChatPayMiniProgramDetails weChatPayMiniProgramDetails = (WeChatPayMiniProgramDetails) o;
    return Objects.equals(this.appId, weChatPayMiniProgramDetails.appId) &&
        Objects.equals(this.checkoutAttemptId, weChatPayMiniProgramDetails.checkoutAttemptId) &&
        Objects.equals(this.openid, weChatPayMiniProgramDetails.openid) &&
        Objects.equals(this.type, weChatPayMiniProgramDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, checkoutAttemptId, openid, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeChatPayMiniProgramDetails {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
    sb.append("    openid: ").append(toIndentedString(openid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("appId");
    openapiFields.add("checkoutAttemptId");
    openapiFields.add("openid");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(WeChatPayMiniProgramDetails.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WeChatPayMiniProgramDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WeChatPayMiniProgramDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WeChatPayMiniProgramDetails is not found in the empty JSON string", WeChatPayMiniProgramDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WeChatPayMiniProgramDetails.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `WeChatPayMiniProgramDetails` properties.", entry.getKey()));
        }
      }
      // validate the optional field appId
      if (jsonObj.get("appId") != null && !jsonObj.get("appId").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `appId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appId").toString()));
      }
      // validate the optional field checkoutAttemptId
      if (jsonObj.get("checkoutAttemptId") != null && !jsonObj.get("checkoutAttemptId").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `checkoutAttemptId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkoutAttemptId").toString()));
      }
      // validate the optional field openid
      if (jsonObj.get("openid") != null && !jsonObj.get("openid").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `openid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("openid").toString()));
      }
      // ensure the field type can be parsed to an enum value
      if (jsonObj.get("type") != null) {
        if(!jsonObj.get("type").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
        }
        TypeEnum.fromValue(jsonObj.get("type").getAsString());
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WeChatPayMiniProgramDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WeChatPayMiniProgramDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WeChatPayMiniProgramDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WeChatPayMiniProgramDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<WeChatPayMiniProgramDetails>() {
           @Override
           public void write(JsonWriter out, WeChatPayMiniProgramDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WeChatPayMiniProgramDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WeChatPayMiniProgramDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WeChatPayMiniProgramDetails
  * @throws IOException if the JSON string is invalid with respect to WeChatPayMiniProgramDetails
  */
  public static WeChatPayMiniProgramDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WeChatPayMiniProgramDetails.class);
  }

 /**
  * Convert an instance of WeChatPayMiniProgramDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

