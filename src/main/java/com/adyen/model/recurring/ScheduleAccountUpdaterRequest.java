/*
 * Adyen Recurring API
 * The Recurring APIs allow you to manage and remove your tokens or saved payment details. Tokens should be created with validation during a payment request.  For more information, refer to our [Tokenization documentation](https://docs.adyen.com/online-payments/tokenization). ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning Recurring API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/Recurring/v68/disable ```  ## Going live  To authenticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/Recurring/v68/disable ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.recurring;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.recurring.Card;
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
 * ScheduleAccountUpdaterRequest
 */
@JsonPropertyOrder({
  ScheduleAccountUpdaterRequest.JSON_PROPERTY_ADDITIONAL_DATA,
  ScheduleAccountUpdaterRequest.JSON_PROPERTY_CARD,
  ScheduleAccountUpdaterRequest.JSON_PROPERTY_MERCHANT_ACCOUNT,
  ScheduleAccountUpdaterRequest.JSON_PROPERTY_REFERENCE,
  ScheduleAccountUpdaterRequest.JSON_PROPERTY_SELECTED_RECURRING_DETAIL_REFERENCE,
  ScheduleAccountUpdaterRequest.JSON_PROPERTY_SHOPPER_REFERENCE
})

public class ScheduleAccountUpdaterRequest {
  public static final String JSON_PROPERTY_ADDITIONAL_DATA = "additionalData";
  private Map<String, String> additionalData = null;

  public static final String JSON_PROPERTY_CARD = "card";
  private Card card;

  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  private String merchantAccount;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_SELECTED_RECURRING_DETAIL_REFERENCE = "selectedRecurringDetailReference";
  private String selectedRecurringDetailReference;

  public static final String JSON_PROPERTY_SHOPPER_REFERENCE = "shopperReference";
  private String shopperReference;

  public ScheduleAccountUpdaterRequest() { 
  }

  public ScheduleAccountUpdaterRequest additionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
    return this;
  }

  public ScheduleAccountUpdaterRequest putAdditionalDataItem(String key, String additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new HashMap<>();
    }
    this.additionalData.put(key, additionalDataItem);
    return this;
  }

   /**
   * This field contains additional data, which may be required for a particular request.
   * @return additionalData
  **/
  @ApiModelProperty(value = "This field contains additional data, which may be required for a particular request.")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getAdditionalData() {
    return additionalData;
  }


 /**
  * This field contains additional data, which may be required for a particular request.
  *
  * @param additionalData
  */ 
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
  }


  public ScheduleAccountUpdaterRequest card(Card card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Card getCard() {
    return card;
  }


 /**
  * card
  *
  * @param card
  */ 
  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCard(Card card) {
    this.card = card;
  }


  public ScheduleAccountUpdaterRequest merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * Account of the merchant.
   * @return merchantAccount
  **/
  @ApiModelProperty(required = true, value = "Account of the merchant.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantAccount() {
    return merchantAccount;
  }


 /**
  * Account of the merchant.
  *
  * @param merchantAccount
  */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public ScheduleAccountUpdaterRequest reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * A reference that merchants can apply for the call.
   * @return reference
  **/
  @ApiModelProperty(required = true, value = "A reference that merchants can apply for the call.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


 /**
  * A reference that merchants can apply for the call.
  *
  * @param reference
  */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  public ScheduleAccountUpdaterRequest selectedRecurringDetailReference(String selectedRecurringDetailReference) {
    this.selectedRecurringDetailReference = selectedRecurringDetailReference;
    return this;
  }

   /**
   * The selected detail recurring reference.  Optional if &#x60;card&#x60; is provided.
   * @return selectedRecurringDetailReference
  **/
  @ApiModelProperty(value = "The selected detail recurring reference.  Optional if `card` is provided.")
  @JsonProperty(JSON_PROPERTY_SELECTED_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSelectedRecurringDetailReference() {
    return selectedRecurringDetailReference;
  }


 /**
  * The selected detail recurring reference.  Optional if &#x60;card&#x60; is provided.
  *
  * @param selectedRecurringDetailReference
  */ 
  @JsonProperty(JSON_PROPERTY_SELECTED_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelectedRecurringDetailReference(String selectedRecurringDetailReference) {
    this.selectedRecurringDetailReference = selectedRecurringDetailReference;
  }


  public ScheduleAccountUpdaterRequest shopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
    return this;
  }

   /**
   * The reference of the shopper that owns the recurring contract.  Optional if &#x60;card&#x60; is provided.
   * @return shopperReference
  **/
  @ApiModelProperty(value = "The reference of the shopper that owns the recurring contract.  Optional if `card` is provided.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShopperReference() {
    return shopperReference;
  }


 /**
  * The reference of the shopper that owns the recurring contract.  Optional if &#x60;card&#x60; is provided.
  *
  * @param shopperReference
  */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
  }


  /**
   * Return true if this ScheduleAccountUpdaterRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleAccountUpdaterRequest scheduleAccountUpdaterRequest = (ScheduleAccountUpdaterRequest) o;
    return Objects.equals(this.additionalData, scheduleAccountUpdaterRequest.additionalData) &&
        Objects.equals(this.card, scheduleAccountUpdaterRequest.card) &&
        Objects.equals(this.merchantAccount, scheduleAccountUpdaterRequest.merchantAccount) &&
        Objects.equals(this.reference, scheduleAccountUpdaterRequest.reference) &&
        Objects.equals(this.selectedRecurringDetailReference, scheduleAccountUpdaterRequest.selectedRecurringDetailReference) &&
        Objects.equals(this.shopperReference, scheduleAccountUpdaterRequest.shopperReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, card, merchantAccount, reference, selectedRecurringDetailReference, shopperReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleAccountUpdaterRequest {\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    selectedRecurringDetailReference: ").append(toIndentedString(selectedRecurringDetailReference)).append("\n");
    sb.append("    shopperReference: ").append(toIndentedString(shopperReference)).append("\n");
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
   * Create an instance of ScheduleAccountUpdaterRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ScheduleAccountUpdaterRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to ScheduleAccountUpdaterRequest
   */
  public static ScheduleAccountUpdaterRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ScheduleAccountUpdaterRequest.class);
  }
/**
  * Convert an instance of ScheduleAccountUpdaterRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

