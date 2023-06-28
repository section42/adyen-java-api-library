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
 * Installments
 */

public class Installments {
  /**
   * The installment plan, used for [card installments in Japan](https://docs.adyen.com/payment-methods/cards/credit-card-installments#make-a-payment-japan). By default, this is set to **regular**. Possible values: * **regular** * **revolving** 
   */
  @JsonAdapter(PlanEnum.Adapter.class)
  public enum PlanEnum {
    REGULAR("regular"),
    
    REVOLVING("revolving");

    private String value;

    PlanEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PlanEnum fromValue(String value) {
      for (PlanEnum b : PlanEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PlanEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlanEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PlanEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PlanEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PLAN = "plan";
  @SerializedName(SERIALIZED_NAME_PLAN)
  private PlanEnum plan;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Integer value;

  public Installments() { 
  }

  public Installments plan(PlanEnum plan) {
    
    this.plan = plan;
    return this;
  }

   /**
   * The installment plan, used for [card installments in Japan](https://docs.adyen.com/payment-methods/cards/credit-card-installments#make-a-payment-japan). By default, this is set to **regular**. Possible values: * **regular** * **revolving** 
   * @return plan
  **/
  @ApiModelProperty(value = "The installment plan, used for [card installments in Japan](https://docs.adyen.com/payment-methods/cards/credit-card-installments#make-a-payment-japan). By default, this is set to **regular**. Possible values: * **regular** * **revolving** ")

  public PlanEnum getPlan() {
    return plan;
  }


  public void setPlan(PlanEnum plan) {
    this.plan = plan;
  }


  public Installments value(Integer value) {
    
    this.value = value;
    return this;
  }

   /**
   * Defines the number of installments. Its value needs to be greater than zero.  Usually, the maximum allowed number of installments is capped. For example, it may not be possible to split a payment in more than 24 installments. The acquirer sets this upper limit, so its value may vary.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Defines the number of installments. Its value needs to be greater than zero.  Usually, the maximum allowed number of installments is capped. For example, it may not be possible to split a payment in more than 24 installments. The acquirer sets this upper limit, so its value may vary.")

  public Integer getValue() {
    return value;
  }


  public void setValue(Integer value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Installments installments = (Installments) o;
    return Objects.equals(this.plan, installments.plan) &&
        Objects.equals(this.value, installments.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plan, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Installments {\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("plan");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("value");
  }

  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    validateJsonObject(jsonObj, false);
  }
 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @param strictValidation reject (new) fields missing from the specifications
  * @throws IOException if the JSON Object is invalid with respect to Installments
  */
  public static void validateJsonObject(JsonObject jsonObj, boolean strictValidation) throws IOException {
      if (jsonObj == null) {
        if (Installments.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Installments is not found in the empty JSON string", Installments.openapiRequiredFields.toString()));
        }
      }
      if (strictValidation) {
          Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
          // check to see if the JSON string contains additional fields
          for (Entry<String, JsonElement> entry : entries) {
            if (!Installments.openapiFields.contains(entry.getKey())) {
              throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Installments` properties.", entry.getKey()));
            }
          }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Installments.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the field plan can be parsed to an enum value
      if (jsonObj.get("plan") != null) {
        if(!jsonObj.get("plan").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `plan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan").toString()));
        }
        PlanEnum.fromValue(jsonObj.get("plan").getAsString());
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Installments.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Installments' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Installments> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Installments.class));

       return (TypeAdapter<T>) new TypeAdapter<Installments>() {
           @Override
           public void write(JsonWriter out, Installments value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Installments read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Installments given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Installments
  * @throws IOException if the JSON string is invalid with respect to Installments
  */
  public static Installments fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Installments.class);
  }

 /**
  * Convert an instance of Installments to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

