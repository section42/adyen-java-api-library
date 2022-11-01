/*
 * Adyen Payment API
 *
 * The version of the OpenAPI document: 68
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payments;

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

/**
 * ThreeDS1Result
 */

public class ThreeDS1Result {
  public static final String SERIALIZED_NAME_CAVV = "cavv";
  @SerializedName(SERIALIZED_NAME_CAVV)
  private String cavv;

  public static final String SERIALIZED_NAME_CAVV_ALGORITHM = "cavvAlgorithm";
  @SerializedName(SERIALIZED_NAME_CAVV_ALGORITHM)
  private String cavvAlgorithm;

  public static final String SERIALIZED_NAME_ECI = "eci";
  @SerializedName(SERIALIZED_NAME_ECI)
  private String eci;

  public static final String SERIALIZED_NAME_THREE_D_AUTHENTICATED_RESPONSE = "threeDAuthenticatedResponse";
  @SerializedName(SERIALIZED_NAME_THREE_D_AUTHENTICATED_RESPONSE)
  private String threeDAuthenticatedResponse;

  public static final String SERIALIZED_NAME_THREE_D_OFFERED_RESPONSE = "threeDOfferedResponse";
  @SerializedName(SERIALIZED_NAME_THREE_D_OFFERED_RESPONSE)
  private String threeDOfferedResponse;

  public static final String SERIALIZED_NAME_XID = "xid";
  @SerializedName(SERIALIZED_NAME_XID)
  private String xid;

  public ThreeDS1Result() { 
  }

  public ThreeDS1Result cavv(String cavv) {
    
    this.cavv = cavv;
    return this;
  }

   /**
   * The cardholder authentication value (base64 encoded).
   * @return cavv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cardholder authentication value (base64 encoded).")

  public String getCavv() {
    return cavv;
  }


  public void setCavv(String cavv) {
    this.cavv = cavv;
  }


  public ThreeDS1Result cavvAlgorithm(String cavvAlgorithm) {
    
    this.cavvAlgorithm = cavvAlgorithm;
    return this;
  }

   /**
   * The CAVV algorithm used.
   * @return cavvAlgorithm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The CAVV algorithm used.")

  public String getCavvAlgorithm() {
    return cavvAlgorithm;
  }


  public void setCavvAlgorithm(String cavvAlgorithm) {
    this.cavvAlgorithm = cavvAlgorithm;
  }


  public ThreeDS1Result eci(String eci) {
    
    this.eci = eci;
    return this;
  }

   /**
   * 3D Secure Electronic Commerce Indicator (ECI).
   * @return eci
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "3D Secure Electronic Commerce Indicator (ECI).")

  public String getEci() {
    return eci;
  }


  public void setEci(String eci) {
    this.eci = eci;
  }


  public ThreeDS1Result threeDAuthenticatedResponse(String threeDAuthenticatedResponse) {
    
    this.threeDAuthenticatedResponse = threeDAuthenticatedResponse;
    return this;
  }

   /**
   * The authentication response from the ACS.
   * @return threeDAuthenticatedResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The authentication response from the ACS.")

  public String getThreeDAuthenticatedResponse() {
    return threeDAuthenticatedResponse;
  }


  public void setThreeDAuthenticatedResponse(String threeDAuthenticatedResponse) {
    this.threeDAuthenticatedResponse = threeDAuthenticatedResponse;
  }


  public ThreeDS1Result threeDOfferedResponse(String threeDOfferedResponse) {
    
    this.threeDOfferedResponse = threeDOfferedResponse;
    return this;
  }

   /**
   * Whether 3D Secure was offered or not.
   * @return threeDOfferedResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether 3D Secure was offered or not.")

  public String getThreeDOfferedResponse() {
    return threeDOfferedResponse;
  }


  public void setThreeDOfferedResponse(String threeDOfferedResponse) {
    this.threeDOfferedResponse = threeDOfferedResponse;
  }


  public ThreeDS1Result xid(String xid) {
    
    this.xid = xid;
    return this;
  }

   /**
   * A unique transaction identifier generated by the MPI on behalf of the merchant to identify the 3D Secure transaction, in &#x60;Base64&#x60; encoding.
   * @return xid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique transaction identifier generated by the MPI on behalf of the merchant to identify the 3D Secure transaction, in `Base64` encoding.")

  public String getXid() {
    return xid;
  }


  public void setXid(String xid) {
    this.xid = xid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDS1Result threeDS1Result = (ThreeDS1Result) o;
    return Objects.equals(this.cavv, threeDS1Result.cavv) &&
        Objects.equals(this.cavvAlgorithm, threeDS1Result.cavvAlgorithm) &&
        Objects.equals(this.eci, threeDS1Result.eci) &&
        Objects.equals(this.threeDAuthenticatedResponse, threeDS1Result.threeDAuthenticatedResponse) &&
        Objects.equals(this.threeDOfferedResponse, threeDS1Result.threeDOfferedResponse) &&
        Objects.equals(this.xid, threeDS1Result.xid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cavv, cavvAlgorithm, eci, threeDAuthenticatedResponse, threeDOfferedResponse, xid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDS1Result {\n");
    sb.append("    cavv: ").append(toIndentedString(cavv)).append("\n");
    sb.append("    cavvAlgorithm: ").append(toIndentedString(cavvAlgorithm)).append("\n");
    sb.append("    eci: ").append(toIndentedString(eci)).append("\n");
    sb.append("    threeDAuthenticatedResponse: ").append(toIndentedString(threeDAuthenticatedResponse)).append("\n");
    sb.append("    threeDOfferedResponse: ").append(toIndentedString(threeDOfferedResponse)).append("\n");
    sb.append("    xid: ").append(toIndentedString(xid)).append("\n");
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
    openapiFields.add("cavv");
    openapiFields.add("cavvAlgorithm");
    openapiFields.add("eci");
    openapiFields.add("threeDAuthenticatedResponse");
    openapiFields.add("threeDOfferedResponse");
    openapiFields.add("xid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ThreeDS1Result
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ThreeDS1Result.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ThreeDS1Result is not found in the empty JSON string", ThreeDS1Result.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ThreeDS1Result.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ThreeDS1Result` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("cavv") != null && !jsonObj.get("cavv").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cavv` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cavv").toString()));
      }
      if (jsonObj.get("cavvAlgorithm") != null && !jsonObj.get("cavvAlgorithm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cavvAlgorithm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cavvAlgorithm").toString()));
      }
      if (jsonObj.get("eci") != null && !jsonObj.get("eci").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eci` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eci").toString()));
      }
      if (jsonObj.get("threeDAuthenticatedResponse") != null && !jsonObj.get("threeDAuthenticatedResponse").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `threeDAuthenticatedResponse` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threeDAuthenticatedResponse").toString()));
      }
      if (jsonObj.get("threeDOfferedResponse") != null && !jsonObj.get("threeDOfferedResponse").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `threeDOfferedResponse` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threeDOfferedResponse").toString()));
      }
      if (jsonObj.get("xid") != null && !jsonObj.get("xid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ThreeDS1Result.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ThreeDS1Result' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ThreeDS1Result> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ThreeDS1Result.class));

       return (TypeAdapter<T>) new TypeAdapter<ThreeDS1Result>() {
           @Override
           public void write(JsonWriter out, ThreeDS1Result value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ThreeDS1Result read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

}

