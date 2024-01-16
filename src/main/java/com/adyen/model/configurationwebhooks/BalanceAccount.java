/*
 * Configuration webhooks
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.configurationwebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.configurationwebhooks.Balance;
import com.adyen.model.configurationwebhooks.PaymentInstrumentReference;
import com.adyen.model.configurationwebhooks.PlatformPaymentConfiguration;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * BalanceAccount
 */
@JsonPropertyOrder({
  BalanceAccount.JSON_PROPERTY_ACCOUNT_HOLDER_ID,
  BalanceAccount.JSON_PROPERTY_BALANCES,
  BalanceAccount.JSON_PROPERTY_DEFAULT_CURRENCY_CODE,
  BalanceAccount.JSON_PROPERTY_DESCRIPTION,
  BalanceAccount.JSON_PROPERTY_ID,
  BalanceAccount.JSON_PROPERTY_METADATA,
  BalanceAccount.JSON_PROPERTY_MIGRATED_ACCOUNT_CODE,
  BalanceAccount.JSON_PROPERTY_PAYMENT_INSTRUMENTS,
  BalanceAccount.JSON_PROPERTY_PLATFORM_PAYMENT_CONFIGURATION,
  BalanceAccount.JSON_PROPERTY_REFERENCE,
  BalanceAccount.JSON_PROPERTY_STATUS,
  BalanceAccount.JSON_PROPERTY_TIME_ZONE
})

public class BalanceAccount {
  public static final String JSON_PROPERTY_ACCOUNT_HOLDER_ID = "accountHolderId";
  private String accountHolderId;

  public static final String JSON_PROPERTY_BALANCES = "balances";
  private List<Balance> balances = null;

  public static final String JSON_PROPERTY_DEFAULT_CURRENCY_CODE = "defaultCurrencyCode";
  private String defaultCurrencyCode;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;

  public static final String JSON_PROPERTY_MIGRATED_ACCOUNT_CODE = "migratedAccountCode";
  private String migratedAccountCode;

  public static final String JSON_PROPERTY_PAYMENT_INSTRUMENTS = "paymentInstruments";
  private List<PaymentInstrumentReference> paymentInstruments = null;

  public static final String JSON_PROPERTY_PLATFORM_PAYMENT_CONFIGURATION = "platformPaymentConfiguration";
  private PlatformPaymentConfiguration platformPaymentConfiguration;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  /**
   * The status of the balance account, set to **Active** by default.  
   */
  public enum StatusEnum {
    ACTIVE("Active"),
    
    CLOSED("Closed"),
    
    INACTIVE("Inactive"),
    
    SUSPENDED("Suspended");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  private String timeZone;

  public BalanceAccount() { 
  }

  public BalanceAccount accountHolderId(String accountHolderId) {
    this.accountHolderId = accountHolderId;
    return this;
  }

   /**
   * The unique identifier of the [account holder](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/accountHolders__resParam_id) associated with the balance account.
   * @return accountHolderId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the [account holder](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/accountHolders__resParam_id) associated with the balance account.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountHolderId() {
    return accountHolderId;
  }


 /**
  * The unique identifier of the [account holder](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/accountHolders__resParam_id) associated with the balance account.
  *
  * @param accountHolderId
  */ 
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountHolderId(String accountHolderId) {
    this.accountHolderId = accountHolderId;
  }


  public BalanceAccount balances(List<Balance> balances) {
    this.balances = balances;
    return this;
  }

  public BalanceAccount addBalancesItem(Balance balancesItem) {
    if (this.balances == null) {
      this.balances = new ArrayList<>();
    }
    this.balances.add(balancesItem);
    return this;
  }

   /**
   * List of balances with the amount and currency.
   * @return balances
  **/
  @ApiModelProperty(value = "List of balances with the amount and currency.")
  @JsonProperty(JSON_PROPERTY_BALANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Balance> getBalances() {
    return balances;
  }


 /**
  * List of balances with the amount and currency.
  *
  * @param balances
  */ 
  @JsonProperty(JSON_PROPERTY_BALANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalances(List<Balance> balances) {
    this.balances = balances;
  }


  public BalanceAccount defaultCurrencyCode(String defaultCurrencyCode) {
    this.defaultCurrencyCode = defaultCurrencyCode;
    return this;
  }

   /**
   * The default three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) of the balance account. The default value is **EUR**. &gt; After a balance account is created, you cannot change its default currency.
   * @return defaultCurrencyCode
  **/
  @ApiModelProperty(value = "The default three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) of the balance account. The default value is **EUR**. > After a balance account is created, you cannot change its default currency.")
  @JsonProperty(JSON_PROPERTY_DEFAULT_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultCurrencyCode() {
    return defaultCurrencyCode;
  }


 /**
  * The default three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) of the balance account. The default value is **EUR**. &gt; After a balance account is created, you cannot change its default currency.
  *
  * @param defaultCurrencyCode
  */ 
  @JsonProperty(JSON_PROPERTY_DEFAULT_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultCurrencyCode(String defaultCurrencyCode) {
    this.defaultCurrencyCode = defaultCurrencyCode;
  }


  public BalanceAccount description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A human-readable description of the balance account, maximum 300 characters. You can use this parameter to distinguish between multiple balance accounts under an account holder.
   * @return description
  **/
  @ApiModelProperty(value = "A human-readable description of the balance account, maximum 300 characters. You can use this parameter to distinguish between multiple balance accounts under an account holder.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


 /**
  * A human-readable description of the balance account, maximum 300 characters. You can use this parameter to distinguish between multiple balance accounts under an account holder.
  *
  * @param description
  */ 
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public BalanceAccount id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the balance account.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the balance account.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


 /**
  * The unique identifier of the balance account.
  *
  * @param id
  */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public BalanceAccount metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public BalanceAccount putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * A set of key and value pairs for general use. The keys do not have specific names and may be used for storing miscellaneous data as desired. &gt; Note that during an update of metadata, the omission of existing key-value pairs will result in the deletion of those key-value pairs.
   * @return metadata
  **/
  @ApiModelProperty(value = "A set of key and value pairs for general use. The keys do not have specific names and may be used for storing miscellaneous data as desired. > Note that during an update of metadata, the omission of existing key-value pairs will result in the deletion of those key-value pairs.")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetadata() {
    return metadata;
  }


 /**
  * A set of key and value pairs for general use. The keys do not have specific names and may be used for storing miscellaneous data as desired. &gt; Note that during an update of metadata, the omission of existing key-value pairs will result in the deletion of those key-value pairs.
  *
  * @param metadata
  */ 
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public BalanceAccount migratedAccountCode(String migratedAccountCode) {
    this.migratedAccountCode = migratedAccountCode;
    return this;
  }

   /**
   * The unique identifier of the account of the migrated account holder in the classic integration.
   * @return migratedAccountCode
  **/
  @ApiModelProperty(value = "The unique identifier of the account of the migrated account holder in the classic integration.")
  @JsonProperty(JSON_PROPERTY_MIGRATED_ACCOUNT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMigratedAccountCode() {
    return migratedAccountCode;
  }


 /**
  * The unique identifier of the account of the migrated account holder in the classic integration.
  *
  * @param migratedAccountCode
  */ 
  @JsonProperty(JSON_PROPERTY_MIGRATED_ACCOUNT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMigratedAccountCode(String migratedAccountCode) {
    this.migratedAccountCode = migratedAccountCode;
  }


  public BalanceAccount paymentInstruments(List<PaymentInstrumentReference> paymentInstruments) {
    this.paymentInstruments = paymentInstruments;
    return this;
  }

  public BalanceAccount addPaymentInstrumentsItem(PaymentInstrumentReference paymentInstrumentsItem) {
    if (this.paymentInstruments == null) {
      this.paymentInstruments = new ArrayList<>();
    }
    this.paymentInstruments.add(paymentInstrumentsItem);
    return this;
  }

   /**
   * List of [payment instruments](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/paymentInstruments) associated with the balance account.
   * @return paymentInstruments
  **/
  @ApiModelProperty(value = "List of [payment instruments](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/paymentInstruments) associated with the balance account.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PaymentInstrumentReference> getPaymentInstruments() {
    return paymentInstruments;
  }


 /**
  * List of [payment instruments](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/paymentInstruments) associated with the balance account.
  *
  * @param paymentInstruments
  */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentInstruments(List<PaymentInstrumentReference> paymentInstruments) {
    this.paymentInstruments = paymentInstruments;
  }


  public BalanceAccount platformPaymentConfiguration(PlatformPaymentConfiguration platformPaymentConfiguration) {
    this.platformPaymentConfiguration = platformPaymentConfiguration;
    return this;
  }

   /**
   * Get platformPaymentConfiguration
   * @return platformPaymentConfiguration
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLATFORM_PAYMENT_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PlatformPaymentConfiguration getPlatformPaymentConfiguration() {
    return platformPaymentConfiguration;
  }


 /**
  * platformPaymentConfiguration
  *
  * @param platformPaymentConfiguration
  */ 
  @JsonProperty(JSON_PROPERTY_PLATFORM_PAYMENT_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatformPaymentConfiguration(PlatformPaymentConfiguration platformPaymentConfiguration) {
    this.platformPaymentConfiguration = platformPaymentConfiguration;
  }


  public BalanceAccount reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the balance account, maximum 150 characters.
   * @return reference
  **/
  @ApiModelProperty(value = "Your reference for the balance account, maximum 150 characters.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


 /**
  * Your reference for the balance account, maximum 150 characters.
  *
  * @param reference
  */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  public BalanceAccount status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the balance account, set to **Active** by default.  
   * @return status
  **/
  @ApiModelProperty(value = "The status of the balance account, set to **Active** by default.  ")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


 /**
  * The status of the balance account, set to **Active** by default.  
  *
  * @param status
  */ 
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public BalanceAccount timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * The time zone of the balance account. For example, **Europe/Amsterdam**. Defaults to the time zone of the account holder if no time zone is set. For possible values, see the [list of time zone codes](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).
   * @return timeZone
  **/
  @ApiModelProperty(value = "The time zone of the balance account. For example, **Europe/Amsterdam**. Defaults to the time zone of the account holder if no time zone is set. For possible values, see the [list of time zone codes](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).")
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZone() {
    return timeZone;
  }


 /**
  * The time zone of the balance account. For example, **Europe/Amsterdam**. Defaults to the time zone of the account holder if no time zone is set. For possible values, see the [list of time zone codes](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).
  *
  * @param timeZone
  */ 
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  /**
   * Return true if this BalanceAccount object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceAccount balanceAccount = (BalanceAccount) o;
    return Objects.equals(this.accountHolderId, balanceAccount.accountHolderId) &&
        Objects.equals(this.balances, balanceAccount.balances) &&
        Objects.equals(this.defaultCurrencyCode, balanceAccount.defaultCurrencyCode) &&
        Objects.equals(this.description, balanceAccount.description) &&
        Objects.equals(this.id, balanceAccount.id) &&
        Objects.equals(this.metadata, balanceAccount.metadata) &&
        Objects.equals(this.migratedAccountCode, balanceAccount.migratedAccountCode) &&
        Objects.equals(this.paymentInstruments, balanceAccount.paymentInstruments) &&
        Objects.equals(this.platformPaymentConfiguration, balanceAccount.platformPaymentConfiguration) &&
        Objects.equals(this.reference, balanceAccount.reference) &&
        Objects.equals(this.status, balanceAccount.status) &&
        Objects.equals(this.timeZone, balanceAccount.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolderId, balances, defaultCurrencyCode, description, id, metadata, migratedAccountCode, paymentInstruments, platformPaymentConfiguration, reference, status, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceAccount {\n");
    sb.append("    accountHolderId: ").append(toIndentedString(accountHolderId)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    defaultCurrencyCode: ").append(toIndentedString(defaultCurrencyCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    migratedAccountCode: ").append(toIndentedString(migratedAccountCode)).append("\n");
    sb.append("    paymentInstruments: ").append(toIndentedString(paymentInstruments)).append("\n");
    sb.append("    platformPaymentConfiguration: ").append(toIndentedString(platformPaymentConfiguration)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
   * Create an instance of BalanceAccount given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BalanceAccount
   * @throws JsonProcessingException if the JSON string is invalid with respect to BalanceAccount
   */
  public static BalanceAccount fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, BalanceAccount.class);
  }
/**
  * Convert an instance of BalanceAccount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

