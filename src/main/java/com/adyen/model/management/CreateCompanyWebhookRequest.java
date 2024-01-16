/*
 * Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.management.AdditionalSettings;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * CreateCompanyWebhookRequest
 */
@JsonPropertyOrder({
  CreateCompanyWebhookRequest.JSON_PROPERTY_ACCEPTS_EXPIRED_CERTIFICATE,
  CreateCompanyWebhookRequest.JSON_PROPERTY_ACCEPTS_SELF_SIGNED_CERTIFICATE,
  CreateCompanyWebhookRequest.JSON_PROPERTY_ACCEPTS_UNTRUSTED_ROOT_CERTIFICATE,
  CreateCompanyWebhookRequest.JSON_PROPERTY_ACTIVE,
  CreateCompanyWebhookRequest.JSON_PROPERTY_ADDITIONAL_SETTINGS,
  CreateCompanyWebhookRequest.JSON_PROPERTY_COMMUNICATION_FORMAT,
  CreateCompanyWebhookRequest.JSON_PROPERTY_DESCRIPTION,
  CreateCompanyWebhookRequest.JSON_PROPERTY_ENCRYPTION_PROTOCOL,
  CreateCompanyWebhookRequest.JSON_PROPERTY_FILTER_MERCHANT_ACCOUNT_TYPE,
  CreateCompanyWebhookRequest.JSON_PROPERTY_FILTER_MERCHANT_ACCOUNTS,
  CreateCompanyWebhookRequest.JSON_PROPERTY_NETWORK_TYPE,
  CreateCompanyWebhookRequest.JSON_PROPERTY_PASSWORD,
  CreateCompanyWebhookRequest.JSON_PROPERTY_POPULATE_SOAP_ACTION_HEADER,
  CreateCompanyWebhookRequest.JSON_PROPERTY_TYPE,
  CreateCompanyWebhookRequest.JSON_PROPERTY_URL,
  CreateCompanyWebhookRequest.JSON_PROPERTY_USERNAME
})

public class CreateCompanyWebhookRequest {
  public static final String JSON_PROPERTY_ACCEPTS_EXPIRED_CERTIFICATE = "acceptsExpiredCertificate";
  private Boolean acceptsExpiredCertificate;

  public static final String JSON_PROPERTY_ACCEPTS_SELF_SIGNED_CERTIFICATE = "acceptsSelfSignedCertificate";
  private Boolean acceptsSelfSignedCertificate;

  public static final String JSON_PROPERTY_ACCEPTS_UNTRUSTED_ROOT_CERTIFICATE = "acceptsUntrustedRootCertificate";
  private Boolean acceptsUntrustedRootCertificate;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_ADDITIONAL_SETTINGS = "additionalSettings";
  private AdditionalSettings additionalSettings;

  /**
   * Format or protocol for receiving webhooks. Possible values: * **soap** * **http** * **json** 
   */
  public enum CommunicationFormatEnum {
    HTTP("http"),
    
    JSON("json"),
    
    SOAP("soap");

    private String value;

    CommunicationFormatEnum(String value) {
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
    public static CommunicationFormatEnum fromValue(String value) {
      for (CommunicationFormatEnum b : CommunicationFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_COMMUNICATION_FORMAT = "communicationFormat";
  private CommunicationFormatEnum communicationFormat;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  /**
   * SSL version to access the public webhook URL specified in the &#x60;url&#x60; field. Possible values: * **TLSv1.3** * **TLSv1.2** * **HTTP** - Only allowed on Test environment.  If not specified, the webhook will use &#x60;sslVersion&#x60;: **TLSv1.2**.
   */
  public enum EncryptionProtocolEnum {
    HTTP("HTTP"),
    
    TLSV1_2("TLSv1.2"),
    
    TLSV1_3("TLSv1.3");

    private String value;

    EncryptionProtocolEnum(String value) {
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
    public static EncryptionProtocolEnum fromValue(String value) {
      for (EncryptionProtocolEnum b : EncryptionProtocolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ENCRYPTION_PROTOCOL = "encryptionProtocol";
  private EncryptionProtocolEnum encryptionProtocol;

  /**
   * Shows how merchant accounts are filtered when configuring the webhook.   Possible values: *  **allAccounts** : Includes all merchant accounts, and does not require specifying &#x60;filterMerchantAccounts&#x60;. *  **includeAccounts** : The webhook is configured for the merchant accounts listed in &#x60;filterMerchantAccounts&#x60;. *  **excludeAccounts** : The webhook is not configured for the merchant accounts listed in &#x60;filterMerchantAccounts&#x60;.  
   */
  public enum FilterMerchantAccountTypeEnum {
    ALLACCOUNTS("allAccounts"),
    
    EXCLUDEACCOUNTS("excludeAccounts"),
    
    INCLUDEACCOUNTS("includeAccounts");

    private String value;

    FilterMerchantAccountTypeEnum(String value) {
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
    public static FilterMerchantAccountTypeEnum fromValue(String value) {
      for (FilterMerchantAccountTypeEnum b : FilterMerchantAccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FILTER_MERCHANT_ACCOUNT_TYPE = "filterMerchantAccountType";
  private FilterMerchantAccountTypeEnum filterMerchantAccountType;

  public static final String JSON_PROPERTY_FILTER_MERCHANT_ACCOUNTS = "filterMerchantAccounts";
  private List<String> filterMerchantAccounts = new ArrayList<>();

  /**
   * Network type for Terminal API notification webhooks. Possible values: * **public** * **local**  Default Value: **public**.
   */
  public enum NetworkTypeEnum {
    LOCAL("local"),
    
    PUBLIC("public");

    private String value;

    NetworkTypeEnum(String value) {
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
    public static NetworkTypeEnum fromValue(String value) {
      for (NetworkTypeEnum b : NetworkTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_NETWORK_TYPE = "networkType";
  private NetworkTypeEnum networkType;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_POPULATE_SOAP_ACTION_HEADER = "populateSoapActionHeader";
  private Boolean populateSoapActionHeader;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public CreateCompanyWebhookRequest() { 
  }

  public CreateCompanyWebhookRequest acceptsExpiredCertificate(Boolean acceptsExpiredCertificate) {
    this.acceptsExpiredCertificate = acceptsExpiredCertificate;
    return this;
  }

   /**
   * Indicates if expired SSL certificates are accepted. Default value: **false**.
   * @return acceptsExpiredCertificate
  **/
  @ApiModelProperty(value = "Indicates if expired SSL certificates are accepted. Default value: **false**.")
  @JsonProperty(JSON_PROPERTY_ACCEPTS_EXPIRED_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAcceptsExpiredCertificate() {
    return acceptsExpiredCertificate;
  }


 /**
  * Indicates if expired SSL certificates are accepted. Default value: **false**.
  *
  * @param acceptsExpiredCertificate
  */ 
  @JsonProperty(JSON_PROPERTY_ACCEPTS_EXPIRED_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcceptsExpiredCertificate(Boolean acceptsExpiredCertificate) {
    this.acceptsExpiredCertificate = acceptsExpiredCertificate;
  }


  public CreateCompanyWebhookRequest acceptsSelfSignedCertificate(Boolean acceptsSelfSignedCertificate) {
    this.acceptsSelfSignedCertificate = acceptsSelfSignedCertificate;
    return this;
  }

   /**
   * Indicates if self-signed SSL certificates are accepted. Default value: **false**.
   * @return acceptsSelfSignedCertificate
  **/
  @ApiModelProperty(value = "Indicates if self-signed SSL certificates are accepted. Default value: **false**.")
  @JsonProperty(JSON_PROPERTY_ACCEPTS_SELF_SIGNED_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAcceptsSelfSignedCertificate() {
    return acceptsSelfSignedCertificate;
  }


 /**
  * Indicates if self-signed SSL certificates are accepted. Default value: **false**.
  *
  * @param acceptsSelfSignedCertificate
  */ 
  @JsonProperty(JSON_PROPERTY_ACCEPTS_SELF_SIGNED_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcceptsSelfSignedCertificate(Boolean acceptsSelfSignedCertificate) {
    this.acceptsSelfSignedCertificate = acceptsSelfSignedCertificate;
  }


  public CreateCompanyWebhookRequest acceptsUntrustedRootCertificate(Boolean acceptsUntrustedRootCertificate) {
    this.acceptsUntrustedRootCertificate = acceptsUntrustedRootCertificate;
    return this;
  }

   /**
   * Indicates if untrusted SSL certificates are accepted. Default value: **false**.
   * @return acceptsUntrustedRootCertificate
  **/
  @ApiModelProperty(value = "Indicates if untrusted SSL certificates are accepted. Default value: **false**.")
  @JsonProperty(JSON_PROPERTY_ACCEPTS_UNTRUSTED_ROOT_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAcceptsUntrustedRootCertificate() {
    return acceptsUntrustedRootCertificate;
  }


 /**
  * Indicates if untrusted SSL certificates are accepted. Default value: **false**.
  *
  * @param acceptsUntrustedRootCertificate
  */ 
  @JsonProperty(JSON_PROPERTY_ACCEPTS_UNTRUSTED_ROOT_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcceptsUntrustedRootCertificate(Boolean acceptsUntrustedRootCertificate) {
    this.acceptsUntrustedRootCertificate = acceptsUntrustedRootCertificate;
  }


  public CreateCompanyWebhookRequest active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Indicates if the webhook configuration is active. The field must be **true** for us to send webhooks about events related an account.
   * @return active
  **/
  @ApiModelProperty(required = true, value = "Indicates if the webhook configuration is active. The field must be **true** for us to send webhooks about events related an account.")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


 /**
  * Indicates if the webhook configuration is active. The field must be **true** for us to send webhooks about events related an account.
  *
  * @param active
  */ 
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public CreateCompanyWebhookRequest additionalSettings(AdditionalSettings additionalSettings) {
    this.additionalSettings = additionalSettings;
    return this;
  }

   /**
   * Get additionalSettings
   * @return additionalSettings
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdditionalSettings getAdditionalSettings() {
    return additionalSettings;
  }


 /**
  * additionalSettings
  *
  * @param additionalSettings
  */ 
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalSettings(AdditionalSettings additionalSettings) {
    this.additionalSettings = additionalSettings;
  }


  public CreateCompanyWebhookRequest communicationFormat(CommunicationFormatEnum communicationFormat) {
    this.communicationFormat = communicationFormat;
    return this;
  }

   /**
   * Format or protocol for receiving webhooks. Possible values: * **soap** * **http** * **json** 
   * @return communicationFormat
  **/
  @ApiModelProperty(example = "soap", required = true, value = "Format or protocol for receiving webhooks. Possible values: * **soap** * **http** * **json** ")
  @JsonProperty(JSON_PROPERTY_COMMUNICATION_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CommunicationFormatEnum getCommunicationFormat() {
    return communicationFormat;
  }


 /**
  * Format or protocol for receiving webhooks. Possible values: * **soap** * **http** * **json** 
  *
  * @param communicationFormat
  */ 
  @JsonProperty(JSON_PROPERTY_COMMUNICATION_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommunicationFormat(CommunicationFormatEnum communicationFormat) {
    this.communicationFormat = communicationFormat;
  }


  public CreateCompanyWebhookRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Your description for this webhook configuration.
   * @return description
  **/
  @ApiModelProperty(value = "Your description for this webhook configuration.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


 /**
  * Your description for this webhook configuration.
  *
  * @param description
  */ 
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public CreateCompanyWebhookRequest encryptionProtocol(EncryptionProtocolEnum encryptionProtocol) {
    this.encryptionProtocol = encryptionProtocol;
    return this;
  }

   /**
   * SSL version to access the public webhook URL specified in the &#x60;url&#x60; field. Possible values: * **TLSv1.3** * **TLSv1.2** * **HTTP** - Only allowed on Test environment.  If not specified, the webhook will use &#x60;sslVersion&#x60;: **TLSv1.2**.
   * @return encryptionProtocol
  **/
  @ApiModelProperty(example = "TLSv1.2", value = "SSL version to access the public webhook URL specified in the `url` field. Possible values: * **TLSv1.3** * **TLSv1.2** * **HTTP** - Only allowed on Test environment.  If not specified, the webhook will use `sslVersion`: **TLSv1.2**.")
  @JsonProperty(JSON_PROPERTY_ENCRYPTION_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EncryptionProtocolEnum getEncryptionProtocol() {
    return encryptionProtocol;
  }


 /**
  * SSL version to access the public webhook URL specified in the &#x60;url&#x60; field. Possible values: * **TLSv1.3** * **TLSv1.2** * **HTTP** - Only allowed on Test environment.  If not specified, the webhook will use &#x60;sslVersion&#x60;: **TLSv1.2**.
  *
  * @param encryptionProtocol
  */ 
  @JsonProperty(JSON_PROPERTY_ENCRYPTION_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncryptionProtocol(EncryptionProtocolEnum encryptionProtocol) {
    this.encryptionProtocol = encryptionProtocol;
  }


  public CreateCompanyWebhookRequest filterMerchantAccountType(FilterMerchantAccountTypeEnum filterMerchantAccountType) {
    this.filterMerchantAccountType = filterMerchantAccountType;
    return this;
  }

   /**
   * Shows how merchant accounts are filtered when configuring the webhook.   Possible values: *  **allAccounts** : Includes all merchant accounts, and does not require specifying &#x60;filterMerchantAccounts&#x60;. *  **includeAccounts** : The webhook is configured for the merchant accounts listed in &#x60;filterMerchantAccounts&#x60;. *  **excludeAccounts** : The webhook is not configured for the merchant accounts listed in &#x60;filterMerchantAccounts&#x60;.  
   * @return filterMerchantAccountType
  **/
  @ApiModelProperty(required = true, value = "Shows how merchant accounts are filtered when configuring the webhook.   Possible values: *  **allAccounts** : Includes all merchant accounts, and does not require specifying `filterMerchantAccounts`. *  **includeAccounts** : The webhook is configured for the merchant accounts listed in `filterMerchantAccounts`. *  **excludeAccounts** : The webhook is not configured for the merchant accounts listed in `filterMerchantAccounts`.  ")
  @JsonProperty(JSON_PROPERTY_FILTER_MERCHANT_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FilterMerchantAccountTypeEnum getFilterMerchantAccountType() {
    return filterMerchantAccountType;
  }


 /**
  * Shows how merchant accounts are filtered when configuring the webhook.   Possible values: *  **allAccounts** : Includes all merchant accounts, and does not require specifying &#x60;filterMerchantAccounts&#x60;. *  **includeAccounts** : The webhook is configured for the merchant accounts listed in &#x60;filterMerchantAccounts&#x60;. *  **excludeAccounts** : The webhook is not configured for the merchant accounts listed in &#x60;filterMerchantAccounts&#x60;.  
  *
  * @param filterMerchantAccountType
  */ 
  @JsonProperty(JSON_PROPERTY_FILTER_MERCHANT_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilterMerchantAccountType(FilterMerchantAccountTypeEnum filterMerchantAccountType) {
    this.filterMerchantAccountType = filterMerchantAccountType;
  }


  public CreateCompanyWebhookRequest filterMerchantAccounts(List<String> filterMerchantAccounts) {
    this.filterMerchantAccounts = filterMerchantAccounts;
    return this;
  }

  public CreateCompanyWebhookRequest addFilterMerchantAccountsItem(String filterMerchantAccountsItem) {
    this.filterMerchantAccounts.add(filterMerchantAccountsItem);
    return this;
  }

   /**
   * A list of merchant account names that are included or excluded from receiving the webhook. Inclusion or exclusion is based on the value defined for &#x60;filterMerchantAccountType&#x60;.  Required if &#x60;filterMerchantAccountType&#x60; is either: * **includeAccounts** * **excludeAccounts**  Not needed for &#x60;filterMerchantAccountType&#x60;: **allAccounts**.
   * @return filterMerchantAccounts
  **/
  @ApiModelProperty(required = true, value = "A list of merchant account names that are included or excluded from receiving the webhook. Inclusion or exclusion is based on the value defined for `filterMerchantAccountType`.  Required if `filterMerchantAccountType` is either: * **includeAccounts** * **excludeAccounts**  Not needed for `filterMerchantAccountType`: **allAccounts**.")
  @JsonProperty(JSON_PROPERTY_FILTER_MERCHANT_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getFilterMerchantAccounts() {
    return filterMerchantAccounts;
  }


 /**
  * A list of merchant account names that are included or excluded from receiving the webhook. Inclusion or exclusion is based on the value defined for &#x60;filterMerchantAccountType&#x60;.  Required if &#x60;filterMerchantAccountType&#x60; is either: * **includeAccounts** * **excludeAccounts**  Not needed for &#x60;filterMerchantAccountType&#x60;: **allAccounts**.
  *
  * @param filterMerchantAccounts
  */ 
  @JsonProperty(JSON_PROPERTY_FILTER_MERCHANT_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilterMerchantAccounts(List<String> filterMerchantAccounts) {
    this.filterMerchantAccounts = filterMerchantAccounts;
  }


  public CreateCompanyWebhookRequest networkType(NetworkTypeEnum networkType) {
    this.networkType = networkType;
    return this;
  }

   /**
   * Network type for Terminal API notification webhooks. Possible values: * **public** * **local**  Default Value: **public**.
   * @return networkType
  **/
  @ApiModelProperty(value = "Network type for Terminal API notification webhooks. Possible values: * **public** * **local**  Default Value: **public**.")
  @JsonProperty(JSON_PROPERTY_NETWORK_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkTypeEnum getNetworkType() {
    return networkType;
  }


 /**
  * Network type for Terminal API notification webhooks. Possible values: * **public** * **local**  Default Value: **public**.
  *
  * @param networkType
  */ 
  @JsonProperty(JSON_PROPERTY_NETWORK_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkType(NetworkTypeEnum networkType) {
    this.networkType = networkType;
  }


  public CreateCompanyWebhookRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password to access the webhook URL.
   * @return password
  **/
  @ApiModelProperty(value = "Password to access the webhook URL.")
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


 /**
  * Password to access the webhook URL.
  *
  * @param password
  */ 
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(String password) {
    this.password = password;
  }


  public CreateCompanyWebhookRequest populateSoapActionHeader(Boolean populateSoapActionHeader) {
    this.populateSoapActionHeader = populateSoapActionHeader;
    return this;
  }

   /**
   * Indicates if the SOAP action header needs to be populated. Default value: **false**.  Only applies if &#x60;communicationFormat&#x60;: **soap**.
   * @return populateSoapActionHeader
  **/
  @ApiModelProperty(value = "Indicates if the SOAP action header needs to be populated. Default value: **false**.  Only applies if `communicationFormat`: **soap**.")
  @JsonProperty(JSON_PROPERTY_POPULATE_SOAP_ACTION_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPopulateSoapActionHeader() {
    return populateSoapActionHeader;
  }


 /**
  * Indicates if the SOAP action header needs to be populated. Default value: **false**.  Only applies if &#x60;communicationFormat&#x60;: **soap**.
  *
  * @param populateSoapActionHeader
  */ 
  @JsonProperty(JSON_PROPERTY_POPULATE_SOAP_ACTION_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPopulateSoapActionHeader(Boolean populateSoapActionHeader) {
    this.populateSoapActionHeader = populateSoapActionHeader;
  }


  public CreateCompanyWebhookRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of webhook that is being created. Possible values are:  - **standard** - **account-settings-notification** - **banktransfer-notification** - **boletobancario-notification** - **directdebit-notification** - **ach-notification-of-change-notification** - **pending-notification** - **ideal-notification** - **ideal-pending-notification** - **report-notification** - **rreq-notification**  Find out more about [standard notification webhooks](https://docs.adyen.com/development-resources/webhooks/understand-notifications#event-codes) and [other types of notifications](https://docs.adyen.com/development-resources/webhooks/understand-notifications#other-notifications).
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of webhook that is being created. Possible values are:  - **standard** - **account-settings-notification** - **banktransfer-notification** - **boletobancario-notification** - **directdebit-notification** - **ach-notification-of-change-notification** - **pending-notification** - **ideal-notification** - **ideal-pending-notification** - **report-notification** - **rreq-notification**  Find out more about [standard notification webhooks](https://docs.adyen.com/development-resources/webhooks/understand-notifications#event-codes) and [other types of notifications](https://docs.adyen.com/development-resources/webhooks/understand-notifications#other-notifications).")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


 /**
  * The type of webhook that is being created. Possible values are:  - **standard** - **account-settings-notification** - **banktransfer-notification** - **boletobancario-notification** - **directdebit-notification** - **ach-notification-of-change-notification** - **pending-notification** - **ideal-notification** - **ideal-pending-notification** - **report-notification** - **rreq-notification**  Find out more about [standard notification webhooks](https://docs.adyen.com/development-resources/webhooks/understand-notifications#event-codes) and [other types of notifications](https://docs.adyen.com/development-resources/webhooks/understand-notifications#other-notifications).
  *
  * @param type
  */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public CreateCompanyWebhookRequest url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Public URL where webhooks will be sent, for example **https://www.domain.com/webhook-endpoint**.
   * @return url
  **/
  @ApiModelProperty(example = "http://www.adyen.com", required = true, value = "Public URL where webhooks will be sent, for example **https://www.domain.com/webhook-endpoint**.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


 /**
  * Public URL where webhooks will be sent, for example **https://www.domain.com/webhook-endpoint**.
  *
  * @param url
  */ 
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public CreateCompanyWebhookRequest username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username to access the webhook URL.
   * @return username
  **/
  @ApiModelProperty(value = "Username to access the webhook URL.")
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


 /**
  * Username to access the webhook URL.
  *
  * @param username
  */ 
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(String username) {
    this.username = username;
  }


  /**
   * Return true if this CreateCompanyWebhookRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCompanyWebhookRequest createCompanyWebhookRequest = (CreateCompanyWebhookRequest) o;
    return Objects.equals(this.acceptsExpiredCertificate, createCompanyWebhookRequest.acceptsExpiredCertificate) &&
        Objects.equals(this.acceptsSelfSignedCertificate, createCompanyWebhookRequest.acceptsSelfSignedCertificate) &&
        Objects.equals(this.acceptsUntrustedRootCertificate, createCompanyWebhookRequest.acceptsUntrustedRootCertificate) &&
        Objects.equals(this.active, createCompanyWebhookRequest.active) &&
        Objects.equals(this.additionalSettings, createCompanyWebhookRequest.additionalSettings) &&
        Objects.equals(this.communicationFormat, createCompanyWebhookRequest.communicationFormat) &&
        Objects.equals(this.description, createCompanyWebhookRequest.description) &&
        Objects.equals(this.encryptionProtocol, createCompanyWebhookRequest.encryptionProtocol) &&
        Objects.equals(this.filterMerchantAccountType, createCompanyWebhookRequest.filterMerchantAccountType) &&
        Objects.equals(this.filterMerchantAccounts, createCompanyWebhookRequest.filterMerchantAccounts) &&
        Objects.equals(this.networkType, createCompanyWebhookRequest.networkType) &&
        Objects.equals(this.password, createCompanyWebhookRequest.password) &&
        Objects.equals(this.populateSoapActionHeader, createCompanyWebhookRequest.populateSoapActionHeader) &&
        Objects.equals(this.type, createCompanyWebhookRequest.type) &&
        Objects.equals(this.url, createCompanyWebhookRequest.url) &&
        Objects.equals(this.username, createCompanyWebhookRequest.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptsExpiredCertificate, acceptsSelfSignedCertificate, acceptsUntrustedRootCertificate, active, additionalSettings, communicationFormat, description, encryptionProtocol, filterMerchantAccountType, filterMerchantAccounts, networkType, password, populateSoapActionHeader, type, url, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompanyWebhookRequest {\n");
    sb.append("    acceptsExpiredCertificate: ").append(toIndentedString(acceptsExpiredCertificate)).append("\n");
    sb.append("    acceptsSelfSignedCertificate: ").append(toIndentedString(acceptsSelfSignedCertificate)).append("\n");
    sb.append("    acceptsUntrustedRootCertificate: ").append(toIndentedString(acceptsUntrustedRootCertificate)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    additionalSettings: ").append(toIndentedString(additionalSettings)).append("\n");
    sb.append("    communicationFormat: ").append(toIndentedString(communicationFormat)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    encryptionProtocol: ").append(toIndentedString(encryptionProtocol)).append("\n");
    sb.append("    filterMerchantAccountType: ").append(toIndentedString(filterMerchantAccountType)).append("\n");
    sb.append("    filterMerchantAccounts: ").append(toIndentedString(filterMerchantAccounts)).append("\n");
    sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    populateSoapActionHeader: ").append(toIndentedString(populateSoapActionHeader)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
   * Create an instance of CreateCompanyWebhookRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateCompanyWebhookRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to CreateCompanyWebhookRequest
   */
  public static CreateCompanyWebhookRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CreateCompanyWebhookRequest.class);
  }
/**
  * Convert an instance of CreateCompanyWebhookRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

