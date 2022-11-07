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
import com.adyen.model.management.LinksElement;
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

import com.adyen.model.management.JSON;

/**
 * MerchantLinks
 */

public class MerchantLinks {
  public static final String SERIALIZED_NAME_API_CREDENTIALS = "apiCredentials";
  @SerializedName(SERIALIZED_NAME_API_CREDENTIALS)
  private LinksElement apiCredentials;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private LinksElement self;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private LinksElement users;

  public static final String SERIALIZED_NAME_WEBHOOKS = "webhooks";
  @SerializedName(SERIALIZED_NAME_WEBHOOKS)
  private LinksElement webhooks;

  public MerchantLinks() { 
  }

  public MerchantLinks apiCredentials(LinksElement apiCredentials) {
    
    this.apiCredentials = apiCredentials;
    return this;
  }

   /**
   * Get apiCredentials
   * @return apiCredentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinksElement getApiCredentials() {
    return apiCredentials;
  }


  public void setApiCredentials(LinksElement apiCredentials) {
    this.apiCredentials = apiCredentials;
  }


  public MerchantLinks self(LinksElement self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LinksElement getSelf() {
    return self;
  }


  public void setSelf(LinksElement self) {
    this.self = self;
  }


  public MerchantLinks users(LinksElement users) {
    
    this.users = users;
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinksElement getUsers() {
    return users;
  }


  public void setUsers(LinksElement users) {
    this.users = users;
  }


  public MerchantLinks webhooks(LinksElement webhooks) {
    
    this.webhooks = webhooks;
    return this;
  }

   /**
   * Get webhooks
   * @return webhooks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinksElement getWebhooks() {
    return webhooks;
  }


  public void setWebhooks(LinksElement webhooks) {
    this.webhooks = webhooks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantLinks merchantLinks = (MerchantLinks) o;
    return Objects.equals(this.apiCredentials, merchantLinks.apiCredentials) &&
        Objects.equals(this.self, merchantLinks.self) &&
        Objects.equals(this.users, merchantLinks.users) &&
        Objects.equals(this.webhooks, merchantLinks.webhooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiCredentials, self, users, webhooks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantLinks {\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("apiCredentials");
    openapiFields.add("self");
    openapiFields.add("users");
    openapiFields.add("webhooks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("self");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantLinks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MerchantLinks.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantLinks is not found in the empty JSON string", MerchantLinks.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MerchantLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MerchantLinks` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MerchantLinks.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `apiCredentials`
      if (jsonObj.getAsJsonObject("apiCredentials") != null) {
        LinksElement.validateJsonObject(jsonObj.getAsJsonObject("apiCredentials"));
      }
      // validate the optional field `self`
      if (jsonObj.getAsJsonObject("self") != null) {
        LinksElement.validateJsonObject(jsonObj.getAsJsonObject("self"));
      }
      // validate the optional field `users`
      if (jsonObj.getAsJsonObject("users") != null) {
        LinksElement.validateJsonObject(jsonObj.getAsJsonObject("users"));
      }
      // validate the optional field `webhooks`
      if (jsonObj.getAsJsonObject("webhooks") != null) {
        LinksElement.validateJsonObject(jsonObj.getAsJsonObject("webhooks"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantLinks>() {
           @Override
           public void write(JsonWriter out, MerchantLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MerchantLinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MerchantLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantLinks
  * @throws IOException if the JSON string is invalid with respect to MerchantLinks
  */
  public static MerchantLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantLinks.class);
  }

 /**
  * Convert an instance of MerchantLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

