/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

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

import com.adyen.model.legalentitymanagement.JSON;

/**
 * Attachment
 */

public class Attachment {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private byte[] content;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename;

  public static final String SERIALIZED_NAME_PAGE_NAME = "pageName";
  @SerializedName(SERIALIZED_NAME_PAGE_NAME)
  private String pageName;

  public static final String SERIALIZED_NAME_PAGE_TYPE = "pageType";
  @SerializedName(SERIALIZED_NAME_PAGE_TYPE)
  private String pageType;

  public Attachment() { 
  }

  public Attachment content(byte[] content) {
    
    this.content = content;
    return this;
  }

   /**
   * The document in Base64-encoded string format.
   * @return content
  **/
  @ApiModelProperty(required = true, value = "The document in Base64-encoded string format.")

  public byte[] getContent() {
    return content;
  }


  public void setContent(byte[] content) {
    this.content = content;
  }


  @Deprecated
  public Attachment contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * The file format.   Possible values: **application/pdf**, **image/jpg**, **image/jpeg**, **image/png**. 
   * @return contentType
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "The file format.   Possible values: **application/pdf**, **image/jpg**, **image/jpeg**, **image/png**. ")

  public String getContentType() {
    return contentType;
  }


  @Deprecated
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  @Deprecated
  public Attachment filename(String filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * The name of the file including the file extension.
   * @return filename
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "The name of the file including the file extension.")

  public String getFilename() {
    return filename;
  }


  @Deprecated
  public void setFilename(String filename) {
    this.filename = filename;
  }


  public Attachment pageName(String pageName) {
    
    this.pageName = pageName;
    return this;
  }

   /**
   * The name of the file including the file extension.
   * @return pageName
  **/
  @ApiModelProperty(value = "The name of the file including the file extension.")

  public String getPageName() {
    return pageName;
  }


  public void setPageName(String pageName) {
    this.pageName = pageName;
  }


  public Attachment pageType(String pageType) {
    
    this.pageType = pageType;
    return this;
  }

   /**
   * Specifies which side of the ID card is uploaded.  * When &#x60;type&#x60; is **driversLicense** or **identityCard**, set this to **front** or **back**.  * When omitted, we infer the page number based on the order of attachments.
   * @return pageType
  **/
  @ApiModelProperty(value = "Specifies which side of the ID card is uploaded.  * When `type` is **driversLicense** or **identityCard**, set this to **front** or **back**.  * When omitted, we infer the page number based on the order of attachments.")

  public String getPageType() {
    return pageType;
  }


  public void setPageType(String pageType) {
    this.pageType = pageType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Arrays.equals(this.content, attachment.content) &&
        Objects.equals(this.contentType, attachment.contentType) &&
        Objects.equals(this.filename, attachment.filename) &&
        Objects.equals(this.pageName, attachment.pageName) &&
        Objects.equals(this.pageType, attachment.pageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(content), contentType, filename, pageName, pageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    pageName: ").append(toIndentedString(pageName)).append("\n");
    sb.append("    pageType: ").append(toIndentedString(pageType)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("contentType");
    openapiFields.add("filename");
    openapiFields.add("pageName");
    openapiFields.add("pageType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("content");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Attachment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Attachment.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Attachment is not found in the empty JSON string", Attachment.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Attachment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Attachment` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Attachment.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field contentType
      if (jsonObj.get("contentType") != null && !jsonObj.get("contentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contentType").toString()));
      }
      // validate the optional field filename
      if (jsonObj.get("filename") != null && !jsonObj.get("filename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filename").toString()));
      }
      // validate the optional field pageName
      if (jsonObj.get("pageName") != null && !jsonObj.get("pageName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pageName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pageName").toString()));
      }
      // validate the optional field pageType
      if (jsonObj.get("pageType") != null && !jsonObj.get("pageType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pageType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pageType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Attachment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Attachment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Attachment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Attachment.class));

       return (TypeAdapter<T>) new TypeAdapter<Attachment>() {
           @Override
           public void write(JsonWriter out, Attachment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Attachment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Attachment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Attachment
  * @throws IOException if the JSON string is invalid with respect to Attachment
  */
  public static Attachment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Attachment.class);
  }

 /**
  * Convert an instance of Attachment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

