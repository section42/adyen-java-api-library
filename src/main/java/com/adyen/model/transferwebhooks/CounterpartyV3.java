/*
 * Transfer webhooks
 *
 * The version of the OpenAPI document: 4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transferwebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.transferwebhooks.BankAccountV3;
import com.adyen.model.transferwebhooks.MerchantData;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * CounterpartyV3
 */
@JsonPropertyOrder({
  CounterpartyV3.JSON_PROPERTY_BALANCE_ACCOUNT_ID,
  CounterpartyV3.JSON_PROPERTY_BANK_ACCOUNT,
  CounterpartyV3.JSON_PROPERTY_MERCHANT,
  CounterpartyV3.JSON_PROPERTY_TRANSFER_INSTRUMENT_ID
})

public class CounterpartyV3 {
  public static final String JSON_PROPERTY_BALANCE_ACCOUNT_ID = "balanceAccountId";
  private String balanceAccountId;

  public static final String JSON_PROPERTY_BANK_ACCOUNT = "bankAccount";
  private BankAccountV3 bankAccount;

  public static final String JSON_PROPERTY_MERCHANT = "merchant";
  private MerchantData merchant;

  public static final String JSON_PROPERTY_TRANSFER_INSTRUMENT_ID = "transferInstrumentId";
  private String transferInstrumentId;

  public CounterpartyV3() { 
  }

  public CounterpartyV3 balanceAccountId(String balanceAccountId) {
    this.balanceAccountId = balanceAccountId;
    return this;
  }

   /**
   * Unique identifier of the [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).
   * @return balanceAccountId
  **/
  @ApiModelProperty(value = "Unique identifier of the [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).")
  @JsonProperty(JSON_PROPERTY_BALANCE_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalanceAccountId() {
    return balanceAccountId;
  }


 /**
  * Unique identifier of the [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).
  *
  * @param balanceAccountId
  */ 
  @JsonProperty(JSON_PROPERTY_BALANCE_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceAccountId(String balanceAccountId) {
    this.balanceAccountId = balanceAccountId;
  }


  public CounterpartyV3 bankAccount(BankAccountV3 bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BankAccountV3 getBankAccount() {
    return bankAccount;
  }


 /**
  * bankAccount
  *
  * @param bankAccount
  */ 
  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankAccount(BankAccountV3 bankAccount) {
    this.bankAccount = bankAccount;
  }


  public CounterpartyV3 merchant(MerchantData merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MERCHANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MerchantData getMerchant() {
    return merchant;
  }


 /**
  * merchant
  *
  * @param merchant
  */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchant(MerchantData merchant) {
    this.merchant = merchant;
  }


  public CounterpartyV3 transferInstrumentId(String transferInstrumentId) {
    this.transferInstrumentId = transferInstrumentId;
    return this;
  }

   /**
   * Unique identifier of the [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).
   * @return transferInstrumentId
  **/
  @ApiModelProperty(value = "Unique identifier of the [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).")
  @JsonProperty(JSON_PROPERTY_TRANSFER_INSTRUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTransferInstrumentId() {
    return transferInstrumentId;
  }


 /**
  * Unique identifier of the [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).
  *
  * @param transferInstrumentId
  */ 
  @JsonProperty(JSON_PROPERTY_TRANSFER_INSTRUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransferInstrumentId(String transferInstrumentId) {
    this.transferInstrumentId = transferInstrumentId;
  }


  /**
   * Return true if this CounterpartyV3 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CounterpartyV3 counterpartyV3 = (CounterpartyV3) o;
    return Objects.equals(this.balanceAccountId, counterpartyV3.balanceAccountId) &&
        Objects.equals(this.bankAccount, counterpartyV3.bankAccount) &&
        Objects.equals(this.merchant, counterpartyV3.merchant) &&
        Objects.equals(this.transferInstrumentId, counterpartyV3.transferInstrumentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceAccountId, bankAccount, merchant, transferInstrumentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CounterpartyV3 {\n");
    sb.append("    balanceAccountId: ").append(toIndentedString(balanceAccountId)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    transferInstrumentId: ").append(toIndentedString(transferInstrumentId)).append("\n");
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
   * Create an instance of CounterpartyV3 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CounterpartyV3
   * @throws JsonProcessingException if the JSON string is invalid with respect to CounterpartyV3
   */
  public static CounterpartyV3 fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CounterpartyV3.class);
  }
/**
  * Convert an instance of CounterpartyV3 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

