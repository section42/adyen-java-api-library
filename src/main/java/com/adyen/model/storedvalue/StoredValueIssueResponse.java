/*
 * Adyen Stored Value API
 * A set of API endpoints to manage stored value products.
 *
 * The version of the OpenAPI document: 46
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.storedvalue;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.storedvalue.Amount;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * StoredValueIssueResponse
 */
@JsonPropertyOrder({
  StoredValueIssueResponse.JSON_PROPERTY_AUTH_CODE,
  StoredValueIssueResponse.JSON_PROPERTY_CURRENT_BALANCE,
  StoredValueIssueResponse.JSON_PROPERTY_PAYMENT_METHOD,
  StoredValueIssueResponse.JSON_PROPERTY_PSP_REFERENCE,
  StoredValueIssueResponse.JSON_PROPERTY_REFUSAL_REASON,
  StoredValueIssueResponse.JSON_PROPERTY_RESULT_CODE,
  StoredValueIssueResponse.JSON_PROPERTY_THIRD_PARTY_REFUSAL_REASON
})

public class StoredValueIssueResponse {
  public static final String JSON_PROPERTY_AUTH_CODE = "authCode";
  private String authCode;

  public static final String JSON_PROPERTY_CURRENT_BALANCE = "currentBalance";
  private Amount currentBalance;

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "paymentMethod";
  private Map<String, String> paymentMethod = null;

  public static final String JSON_PROPERTY_PSP_REFERENCE = "pspReference";
  private String pspReference;

  public static final String JSON_PROPERTY_REFUSAL_REASON = "refusalReason";
  private String refusalReason;

  /**
   * The result of the payment. Possible values:  * **Success** – The operation has been completed successfully.  * **Refused** – The operation was refused. The reason is given in the &#x60;refusalReason&#x60; field.  * **Error** – There was an error when the operation was processed. The reason is given in the &#x60;refusalReason&#x60; field.  * **NotEnoughBalance** – The amount on the payment method is lower than the amount given in the request. Only applicable to balance checks.  
   */
  public enum ResultCodeEnum {
    SUCCESS("Success"),
    
    REFUSED("Refused"),
    
    ERROR("Error"),
    
    NOTENOUGHBALANCE("NotEnoughBalance");

    private String value;

    ResultCodeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResultCodeEnum fromValue(String value) {
      for (ResultCodeEnum b : ResultCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RESULT_CODE = "resultCode";
  private ResultCodeEnum resultCode;

  public static final String JSON_PROPERTY_THIRD_PARTY_REFUSAL_REASON = "thirdPartyRefusalReason";
  private String thirdPartyRefusalReason;

  public StoredValueIssueResponse() { 
  }

  public StoredValueIssueResponse authCode(String authCode) {
    this.authCode = authCode;
    return this;
  }

   /**
   * Authorisation code: * When the payment is authorised, this field holds the authorisation code for the payment. * When the payment is not authorised, this field is empty.
   * @return authCode
  **/
  @ApiModelProperty(value = "Authorisation code: * When the payment is authorised, this field holds the authorisation code for the payment. * When the payment is not authorised, this field is empty.")
  @JsonProperty(JSON_PROPERTY_AUTH_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthCode() {
    return authCode;
  }


 /**
  * Authorisation code: * When the payment is authorised, this field holds the authorisation code for the payment. * When the payment is not authorised, this field is empty.
  *
  * @param authCode
  */ 
  @JsonProperty(JSON_PROPERTY_AUTH_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthCode(String authCode) {
    this.authCode = authCode;
  }


  public StoredValueIssueResponse currentBalance(Amount currentBalance) {
    this.currentBalance = currentBalance;
    return this;
  }

   /**
   * Get currentBalance
   * @return currentBalance
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENT_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Amount getCurrentBalance() {
    return currentBalance;
  }


 /**
  * currentBalance
  *
  * @param currentBalance
  */ 
  @JsonProperty(JSON_PROPERTY_CURRENT_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentBalance(Amount currentBalance) {
    this.currentBalance = currentBalance;
  }


  public StoredValueIssueResponse paymentMethod(Map<String, String> paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  public StoredValueIssueResponse putPaymentMethodItem(String key, String paymentMethodItem) {
    if (this.paymentMethod == null) {
      this.paymentMethod = new HashMap<>();
    }
    this.paymentMethod.put(key, paymentMethodItem);
    return this;
  }

   /**
   * The collection that contains the type of the payment method and its specific information if available
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "The collection that contains the type of the payment method and its specific information if available")
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getPaymentMethod() {
    return paymentMethod;
  }


 /**
  * The collection that contains the type of the payment method and its specific information if available
  *
  * @param paymentMethod
  */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethod(Map<String, String> paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public StoredValueIssueResponse pspReference(String pspReference) {
    this.pspReference = pspReference;
    return this;
  }

   /**
   * Adyen&#39;s 16-character string reference associated with the transaction/request. This value is globally unique; quote it when communicating with us about this request.
   * @return pspReference
  **/
  @ApiModelProperty(value = "Adyen's 16-character string reference associated with the transaction/request. This value is globally unique; quote it when communicating with us about this request.")
  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPspReference() {
    return pspReference;
  }


 /**
  * Adyen&#39;s 16-character string reference associated with the transaction/request. This value is globally unique; quote it when communicating with us about this request.
  *
  * @param pspReference
  */ 
  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }


  public StoredValueIssueResponse refusalReason(String refusalReason) {
    this.refusalReason = refusalReason;
    return this;
  }

   /**
   * If the transaction is refused or an error occurs, this field holds Adyen&#39;s mapped reason for the refusal or a description of the error.  When a transaction fails, the authorisation response includes &#x60;resultCode&#x60; and &#x60;refusalReason&#x60; values.
   * @return refusalReason
  **/
  @ApiModelProperty(value = "If the transaction is refused or an error occurs, this field holds Adyen's mapped reason for the refusal or a description of the error.  When a transaction fails, the authorisation response includes `resultCode` and `refusalReason` values.")
  @JsonProperty(JSON_PROPERTY_REFUSAL_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRefusalReason() {
    return refusalReason;
  }


 /**
  * If the transaction is refused or an error occurs, this field holds Adyen&#39;s mapped reason for the refusal or a description of the error.  When a transaction fails, the authorisation response includes &#x60;resultCode&#x60; and &#x60;refusalReason&#x60; values.
  *
  * @param refusalReason
  */ 
  @JsonProperty(JSON_PROPERTY_REFUSAL_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefusalReason(String refusalReason) {
    this.refusalReason = refusalReason;
  }


  public StoredValueIssueResponse resultCode(ResultCodeEnum resultCode) {
    this.resultCode = resultCode;
    return this;
  }

   /**
   * The result of the payment. Possible values:  * **Success** – The operation has been completed successfully.  * **Refused** – The operation was refused. The reason is given in the &#x60;refusalReason&#x60; field.  * **Error** – There was an error when the operation was processed. The reason is given in the &#x60;refusalReason&#x60; field.  * **NotEnoughBalance** – The amount on the payment method is lower than the amount given in the request. Only applicable to balance checks.  
   * @return resultCode
  **/
  @ApiModelProperty(value = "The result of the payment. Possible values:  * **Success** – The operation has been completed successfully.  * **Refused** – The operation was refused. The reason is given in the `refusalReason` field.  * **Error** – There was an error when the operation was processed. The reason is given in the `refusalReason` field.  * **NotEnoughBalance** – The amount on the payment method is lower than the amount given in the request. Only applicable to balance checks.  ")
  @JsonProperty(JSON_PROPERTY_RESULT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResultCodeEnum getResultCode() {
    return resultCode;
  }


 /**
  * The result of the payment. Possible values:  * **Success** – The operation has been completed successfully.  * **Refused** – The operation was refused. The reason is given in the &#x60;refusalReason&#x60; field.  * **Error** – There was an error when the operation was processed. The reason is given in the &#x60;refusalReason&#x60; field.  * **NotEnoughBalance** – The amount on the payment method is lower than the amount given in the request. Only applicable to balance checks.  
  *
  * @param resultCode
  */ 
  @JsonProperty(JSON_PROPERTY_RESULT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultCode(ResultCodeEnum resultCode) {
    this.resultCode = resultCode;
  }


  public StoredValueIssueResponse thirdPartyRefusalReason(String thirdPartyRefusalReason) {
    this.thirdPartyRefusalReason = thirdPartyRefusalReason;
    return this;
  }

   /**
   * Raw refusal reason received from the third party, where available
   * @return thirdPartyRefusalReason
  **/
  @ApiModelProperty(value = "Raw refusal reason received from the third party, where available")
  @JsonProperty(JSON_PROPERTY_THIRD_PARTY_REFUSAL_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThirdPartyRefusalReason() {
    return thirdPartyRefusalReason;
  }


 /**
  * Raw refusal reason received from the third party, where available
  *
  * @param thirdPartyRefusalReason
  */ 
  @JsonProperty(JSON_PROPERTY_THIRD_PARTY_REFUSAL_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThirdPartyRefusalReason(String thirdPartyRefusalReason) {
    this.thirdPartyRefusalReason = thirdPartyRefusalReason;
  }


  /**
   * Return true if this StoredValueIssueResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoredValueIssueResponse storedValueIssueResponse = (StoredValueIssueResponse) o;
    return Objects.equals(this.authCode, storedValueIssueResponse.authCode) &&
        Objects.equals(this.currentBalance, storedValueIssueResponse.currentBalance) &&
        Objects.equals(this.paymentMethod, storedValueIssueResponse.paymentMethod) &&
        Objects.equals(this.pspReference, storedValueIssueResponse.pspReference) &&
        Objects.equals(this.refusalReason, storedValueIssueResponse.refusalReason) &&
        Objects.equals(this.resultCode, storedValueIssueResponse.resultCode) &&
        Objects.equals(this.thirdPartyRefusalReason, storedValueIssueResponse.thirdPartyRefusalReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authCode, currentBalance, paymentMethod, pspReference, refusalReason, resultCode, thirdPartyRefusalReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoredValueIssueResponse {\n");
    sb.append("    authCode: ").append(toIndentedString(authCode)).append("\n");
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
    sb.append("    refusalReason: ").append(toIndentedString(refusalReason)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    thirdPartyRefusalReason: ").append(toIndentedString(thirdPartyRefusalReason)).append("\n");
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
   * Create an instance of StoredValueIssueResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StoredValueIssueResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to StoredValueIssueResponse
   */
  public static StoredValueIssueResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, StoredValueIssueResponse.class);
  }
/**
  * Convert an instance of StoredValueIssueResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

