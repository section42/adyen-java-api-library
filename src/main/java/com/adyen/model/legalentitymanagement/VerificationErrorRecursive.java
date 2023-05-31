/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.legalentitymanagement.RemediatingAction;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

import com.adyen.model.legalentitymanagement.JSON;

/**
 * VerificationErrorRecursive
 */

public class VerificationErrorRecursive {
  /**
   * Gets or Sets capabilities
   */
  @JsonAdapter(CapabilitiesEnum.Adapter.class)
  public enum CapabilitiesEnum {
    ACCEPTEXTERNALFUNDING("acceptExternalFunding"),
    
    ACCEPTPSPFUNDING("acceptPspFunding"),
    
    ACCEPTTRANSACTIONINRESTRICTEDCOUNTRIES("acceptTransactionInRestrictedCountries"),
    
    ACCEPTTRANSACTIONINRESTRICTEDCOUNTRIESCOMMERCIAL("acceptTransactionInRestrictedCountriesCommercial"),
    
    ACCEPTTRANSACTIONINRESTRICTEDCOUNTRIESCONSUMER("acceptTransactionInRestrictedCountriesConsumer"),
    
    ACCEPTTRANSACTIONINRESTRICTEDINDUSTRIES("acceptTransactionInRestrictedIndustries"),
    
    ACCEPTTRANSACTIONINRESTRICTEDINDUSTRIESCOMMERCIAL("acceptTransactionInRestrictedIndustriesCommercial"),
    
    ACCEPTTRANSACTIONINRESTRICTEDINDUSTRIESCONSUMER("acceptTransactionInRestrictedIndustriesConsumer"),
    
    ACQUIRING("acquiring"),
    
    ATMWITHDRAWAL("atmWithdrawal"),
    
    ATMWITHDRAWALCOMMERCIAL("atmWithdrawalCommercial"),
    
    ATMWITHDRAWALCONSUMER("atmWithdrawalConsumer"),
    
    ATMWITHDRAWALINRESTRICTEDCOUNTRIES("atmWithdrawalInRestrictedCountries"),
    
    ATMWITHDRAWALINRESTRICTEDCOUNTRIESCOMMERCIAL("atmWithdrawalInRestrictedCountriesCommercial"),
    
    ATMWITHDRAWALINRESTRICTEDCOUNTRIESCONSUMER("atmWithdrawalInRestrictedCountriesConsumer"),
    
    AUTHORISEDPAYMENTINSTRUMENTUSER("authorisedPaymentInstrumentUser"),
    
    GETGRANTOFFERS("getGrantOffers"),
    
    ISSUEBANKACCOUNT("issueBankAccount"),
    
    ISSUECARD("issueCard"),
    
    ISSUECARDCOMMERCIAL("issueCardCommercial"),
    
    ISSUECARDCONSUMER("issueCardConsumer"),
    
    LOCALACCEPTANCE("localAcceptance"),
    
    PAYOUT("payout"),
    
    PAYOUTTOTRANSFERINSTRUMENT("payoutToTransferInstrument"),
    
    PROCESSING("processing"),
    
    RECEIVEFROMBALANCEACCOUNT("receiveFromBalanceAccount"),
    
    RECEIVEFROMPLATFORMPAYMENTS("receiveFromPlatformPayments"),
    
    RECEIVEFROMTHIRDPARTY("receiveFromThirdParty"),
    
    RECEIVEFROMTRANSFERINSTRUMENT("receiveFromTransferInstrument"),
    
    RECEIVEGRANTS("receiveGrants"),
    
    RECEIVEPAYMENTS("receivePayments"),
    
    SENDTOBALANCEACCOUNT("sendToBalanceAccount"),
    
    SENDTOTHIRDPARTY("sendToThirdParty"),
    
    SENDTOTRANSFERINSTRUMENT("sendToTransferInstrument"),
    
    THIRDPARTYFUNDING("thirdPartyFunding"),
    
    USECARD("useCard"),
    
    USECARDCOMMERCIAL("useCardCommercial"),
    
    USECARDCONSUMER("useCardConsumer"),
    
    USECARDINRESTRICTEDCOUNTRIES("useCardInRestrictedCountries"),
    
    USECARDINRESTRICTEDCOUNTRIESCOMMERCIAL("useCardInRestrictedCountriesCommercial"),
    
    USECARDINRESTRICTEDCOUNTRIESCONSUMER("useCardInRestrictedCountriesConsumer"),
    
    USECARDINRESTRICTEDINDUSTRIES("useCardInRestrictedIndustries"),
    
    USECARDINRESTRICTEDINDUSTRIESCOMMERCIAL("useCardInRestrictedIndustriesCommercial"),
    
    USECARDINRESTRICTEDINDUSTRIESCONSUMER("useCardInRestrictedIndustriesConsumer"),
    
    WITHDRAWFROMATM("withdrawFromAtm"),
    
    WITHDRAWFROMATMCOMMERCIAL("withdrawFromAtmCommercial"),
    
    WITHDRAWFROMATMCONSUMER("withdrawFromAtmConsumer"),
    
    WITHDRAWFROMATMINRESTRICTEDCOUNTRIES("withdrawFromAtmInRestrictedCountries"),
    
    WITHDRAWFROMATMINRESTRICTEDCOUNTRIESCOMMERCIAL("withdrawFromAtmInRestrictedCountriesCommercial"),
    
    WITHDRAWFROMATMINRESTRICTEDCOUNTRIESCONSUMER("withdrawFromAtmInRestrictedCountriesConsumer");

    private String value;

    CapabilitiesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CapabilitiesEnum fromValue(String value) {
      for (CapabilitiesEnum b : CapabilitiesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CapabilitiesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CapabilitiesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CapabilitiesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CapabilitiesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CAPABILITIES = "capabilities";
  @SerializedName(SERIALIZED_NAME_CAPABILITIES)
  private List<CapabilitiesEnum> capabilities = null;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  /**
   * The type of error.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    DATAMISSING("dataMissing"),
    
    INVALIDINPUT("invalidInput"),
    
    PENDINGSTATUS("pendingStatus");

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
  private TypeEnum type;

  public static final String SERIALIZED_NAME_REMEDIATING_ACTIONS = "remediatingActions";
  @SerializedName(SERIALIZED_NAME_REMEDIATING_ACTIONS)
  private List<RemediatingAction> remediatingActions = null;

  public VerificationErrorRecursive() { 
  }

  public VerificationErrorRecursive capabilities(List<CapabilitiesEnum> capabilities) {
    
    this.capabilities = capabilities;
    return this;
  }

  public VerificationErrorRecursive addCapabilitiesItem(CapabilitiesEnum capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new ArrayList<>();
    }
    this.capabilities.add(capabilitiesItem);
    return this;
  }

   /**
   * Contains key-value pairs that specify the actions that the legal entity can do in your platform. The key is a capability required for your integration. For example, **issueCard** for Issuing.The value is an object containing the settings for the capability.
   * @return capabilities
  **/
  @ApiModelProperty(value = "Contains key-value pairs that specify the actions that the legal entity can do in your platform. The key is a capability required for your integration. For example, **issueCard** for Issuing.The value is an object containing the settings for the capability.")

  public List<CapabilitiesEnum> getCapabilities() {
    return capabilities;
  }


  public void setCapabilities(List<CapabilitiesEnum> capabilities) {
    this.capabilities = capabilities;
  }


  public VerificationErrorRecursive code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The general error code.
   * @return code
  **/
  @ApiModelProperty(value = "The general error code.")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public VerificationErrorRecursive message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * The general error message.
   * @return message
  **/
  @ApiModelProperty(value = "The general error message.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public VerificationErrorRecursive type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of error.
   * @return type
  **/
  @ApiModelProperty(value = "The type of error.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public VerificationErrorRecursive remediatingActions(List<RemediatingAction> remediatingActions) {
    
    this.remediatingActions = remediatingActions;
    return this;
  }

  public VerificationErrorRecursive addRemediatingActionsItem(RemediatingAction remediatingActionsItem) {
    if (this.remediatingActions == null) {
      this.remediatingActions = new ArrayList<>();
    }
    this.remediatingActions.add(remediatingActionsItem);
    return this;
  }

   /**
   * An object containing possible solutions to fix a verification error.
   * @return remediatingActions
  **/
  @ApiModelProperty(value = "An object containing possible solutions to fix a verification error.")

  public List<RemediatingAction> getRemediatingActions() {
    return remediatingActions;
  }


  public void setRemediatingActions(List<RemediatingAction> remediatingActions) {
    this.remediatingActions = remediatingActions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationErrorRecursive verificationErrorRecursive = (VerificationErrorRecursive) o;
    return Objects.equals(this.capabilities, verificationErrorRecursive.capabilities) &&
        Objects.equals(this.code, verificationErrorRecursive.code) &&
        Objects.equals(this.message, verificationErrorRecursive.message) &&
        Objects.equals(this.type, verificationErrorRecursive.type) &&
        Objects.equals(this.remediatingActions, verificationErrorRecursive.remediatingActions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilities, code, message, type, remediatingActions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationErrorRecursive {\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    remediatingActions: ").append(toIndentedString(remediatingActions)).append("\n");
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
    openapiFields.add("capabilities");
    openapiFields.add("code");
    openapiFields.add("message");
    openapiFields.add("type");
    openapiFields.add("remediatingActions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(VerificationErrorRecursive.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VerificationErrorRecursive
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VerificationErrorRecursive.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VerificationErrorRecursive is not found in the empty JSON string", VerificationErrorRecursive.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VerificationErrorRecursive.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `VerificationErrorRecursive` properties.", entry.getKey()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("capabilities") != null && !jsonObj.get("capabilities").isJsonArray()) {
        log.log(Level.WARNING, String.format("Expected the field `capabilities` to be an array in the JSON string but got `%s`", jsonObj.get("capabilities").toString()));
      }
      // validate the optional field code
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      // validate the optional field message
      if (jsonObj.get("message") != null && !jsonObj.get("message").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // ensure the field type can be parsed to an enum value
      if (jsonObj.get("type") != null) {
        if(!jsonObj.get("type").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
        }
        TypeEnum.fromValue(jsonObj.get("type").getAsString());
      }
      JsonArray jsonArrayremediatingActions = jsonObj.getAsJsonArray("remediatingActions");
      if (jsonArrayremediatingActions != null) {
        // ensure the json data is an array
        if (!jsonObj.get("remediatingActions").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `remediatingActions` to be an array in the JSON string but got `%s`", jsonObj.get("remediatingActions").toString()));
        }

        // validate the optional field `remediatingActions` (array)
        for (int i = 0; i < jsonArrayremediatingActions.size(); i++) {
          RemediatingAction.validateJsonObject(jsonArrayremediatingActions.get(i).getAsJsonObject());
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VerificationErrorRecursive.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VerificationErrorRecursive' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VerificationErrorRecursive> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VerificationErrorRecursive.class));

       return (TypeAdapter<T>) new TypeAdapter<VerificationErrorRecursive>() {
           @Override
           public void write(JsonWriter out, VerificationErrorRecursive value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VerificationErrorRecursive read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VerificationErrorRecursive given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VerificationErrorRecursive
  * @throws IOException if the JSON string is invalid with respect to VerificationErrorRecursive
  */
  public static VerificationErrorRecursive fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VerificationErrorRecursive.class);
  }

 /**
  * Convert an instance of VerificationErrorRecursive to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

