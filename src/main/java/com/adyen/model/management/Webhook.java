/*
 * Management API
 *
 * The version of the OpenAPI document: 1
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
import com.adyen.model.management.AdditionalSettingsResponse;
import com.adyen.model.management.WebhookLinks;
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
 * Webhook
 */
@JsonPropertyOrder({
  Webhook.JSON_PROPERTY_LINKS,
  Webhook.JSON_PROPERTY_ACCEPTS_EXPIRED_CERTIFICATE,
  Webhook.JSON_PROPERTY_ACCEPTS_SELF_SIGNED_CERTIFICATE,
  Webhook.JSON_PROPERTY_ACCEPTS_UNTRUSTED_ROOT_CERTIFICATE,
  Webhook.JSON_PROPERTY_ACCOUNT_REFERENCE,
  Webhook.JSON_PROPERTY_ACTIVE,
  Webhook.JSON_PROPERTY_ADDITIONAL_SETTINGS,
  Webhook.JSON_PROPERTY_CERTIFICATE_ALIAS,
  Webhook.JSON_PROPERTY_COMMUNICATION_FORMAT,
  Webhook.JSON_PROPERTY_DESCRIPTION,
  Webhook.JSON_PROPERTY_FILTER_MERCHANT_ACCOUNT_TYPE,
  Webhook.JSON_PROPERTY_FILTER_MERCHANT_ACCOUNTS,
  Webhook.JSON_PROPERTY_HAS_ERROR,
  Webhook.JSON_PROPERTY_HAS_PASSWORD,
  Webhook.JSON_PROPERTY_HMAC_KEY_CHECK_VALUE,
  Webhook.JSON_PROPERTY_ID,
  Webhook.JSON_PROPERTY_NETWORK_TYPE,
  Webhook.JSON_PROPERTY_POPULATE_SOAP_ACTION_HEADER,
  Webhook.JSON_PROPERTY_SSL_VERSION,
  Webhook.JSON_PROPERTY_TYPE,
  Webhook.JSON_PROPERTY_URL,
  Webhook.JSON_PROPERTY_USERNAME
})

public class Webhook {
  public static final String JSON_PROPERTY_LINKS = "_links";
  private WebhookLinks links;

  public static final String JSON_PROPERTY_ACCEPTS_EXPIRED_CERTIFICATE = "acceptsExpiredCertificate";
  private Boolean acceptsExpiredCertificate;

  public static final String JSON_PROPERTY_ACCEPTS_SELF_SIGNED_CERTIFICATE = "acceptsSelfSignedCertificate";
  private Boolean acceptsSelfSignedCertificate;

  public static final String JSON_PROPERTY_ACCEPTS_UNTRUSTED_ROOT_CERTIFICATE = "acceptsUntrustedRootCertificate";
  private Boolean acceptsUntrustedRootCertificate;

  public static final String JSON_PROPERTY_ACCOUNT_REFERENCE = "accountReference";
  private String accountReference;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_ADDITIONAL_SETTINGS = "additionalSettings";
  private AdditionalSettingsResponse additionalSettings;

  public static final String JSON_PROPERTY_CERTIFICATE_ALIAS = "certificateAlias";
  private String certificateAlias;

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
   * Shows how merchant accounts are included in company-level webhooks. Possible values: * **includeAccounts** * **excludeAccounts** * **allAccounts**: Includes all merchant accounts, and does not require specifying &#x60;filterMerchantAccounts&#x60;.
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
  private List<String> filterMerchantAccounts = null;

  public static final String JSON_PROPERTY_HAS_ERROR = "hasError";
  private Boolean hasError;

  public static final String JSON_PROPERTY_HAS_PASSWORD = "hasPassword";
  private Boolean hasPassword;

  public static final String JSON_PROPERTY_HMAC_KEY_CHECK_VALUE = "hmacKeyCheckValue";
  private String hmacKeyCheckValue;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  /**
   * Network type for Terminal API details webhooks.
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

  public static final String JSON_PROPERTY_POPULATE_SOAP_ACTION_HEADER = "populateSoapActionHeader";
  private Boolean populateSoapActionHeader;

  /**
   * SSL version to access the public webhook URL specified in the &#x60;url&#x60; field. Possible values: * **TLSv1.3** * **TLSv1.2** * **HTTP** - Only allowed on Test environment.  If not specified, the webhook will use &#x60;sslVersion&#x60;: **TLSv1.2**.
   */
  public enum SslVersionEnum {
    HTTP("HTTP"),
    
    SSL("SSL"),
    
    SSLV3("SSLv3"),
    
    TLS("TLS"),
    
    TLSV1("TLSv1"),
    
    TLSV1_1("TLSv1.1"),
    
    TLSV1_2("TLSv1.2"),
    
    TLSV1_3("TLSv1.3");

    private String value;

    SslVersionEnum(String value) {
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
    public static SslVersionEnum fromValue(String value) {
      for (SslVersionEnum b : SslVersionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SSL_VERSION = "sslVersion";
  private SslVersionEnum sslVersion;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public Webhook() { 
  }

  public Webhook links(WebhookLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WebhookLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(WebhookLinks links) {
    this.links = links;
  }


  public Webhook acceptsExpiredCertificate(Boolean acceptsExpiredCertificate) {
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


  @JsonProperty(JSON_PROPERTY_ACCEPTS_EXPIRED_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcceptsExpiredCertificate(Boolean acceptsExpiredCertificate) {
    this.acceptsExpiredCertificate = acceptsExpiredCertificate;
  }


  public Webhook acceptsSelfSignedCertificate(Boolean acceptsSelfSignedCertificate) {
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


  @JsonProperty(JSON_PROPERTY_ACCEPTS_SELF_SIGNED_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcceptsSelfSignedCertificate(Boolean acceptsSelfSignedCertificate) {
    this.acceptsSelfSignedCertificate = acceptsSelfSignedCertificate;
  }


  public Webhook acceptsUntrustedRootCertificate(Boolean acceptsUntrustedRootCertificate) {
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


  @JsonProperty(JSON_PROPERTY_ACCEPTS_UNTRUSTED_ROOT_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcceptsUntrustedRootCertificate(Boolean acceptsUntrustedRootCertificate) {
    this.acceptsUntrustedRootCertificate = acceptsUntrustedRootCertificate;
  }


  public Webhook accountReference(String accountReference) {
    this.accountReference = accountReference;
    return this;
  }

   /**
   * Reference to the account the webook is set on.
   * @return accountReference
  **/
  @ApiModelProperty(value = "Reference to the account the webook is set on.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountReference() {
    return accountReference;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountReference(String accountReference) {
    this.accountReference = accountReference;
  }


  public Webhook active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Indicates if the webhook configuration is active. The field must be **true** for you to receive webhooks about events related an account.
   * @return active
  **/
  @ApiModelProperty(required = true, value = "Indicates if the webhook configuration is active. The field must be **true** for you to receive webhooks about events related an account.")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public Webhook additionalSettings(AdditionalSettingsResponse additionalSettings) {
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

  public AdditionalSettingsResponse getAdditionalSettings() {
    return additionalSettings;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalSettings(AdditionalSettingsResponse additionalSettings) {
    this.additionalSettings = additionalSettings;
  }


  public Webhook certificateAlias(String certificateAlias) {
    this.certificateAlias = certificateAlias;
    return this;
  }

   /**
   * The alias of our SSL certificate. When you receive a notification from us, the alias from the HMAC signature will match this alias.
   * @return certificateAlias
  **/
  @ApiModelProperty(value = "The alias of our SSL certificate. When you receive a notification from us, the alias from the HMAC signature will match this alias.")
  @JsonProperty(JSON_PROPERTY_CERTIFICATE_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCertificateAlias() {
    return certificateAlias;
  }


  @JsonProperty(JSON_PROPERTY_CERTIFICATE_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCertificateAlias(String certificateAlias) {
    this.certificateAlias = certificateAlias;
  }


  public Webhook communicationFormat(CommunicationFormatEnum communicationFormat) {
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


  @JsonProperty(JSON_PROPERTY_COMMUNICATION_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommunicationFormat(CommunicationFormatEnum communicationFormat) {
    this.communicationFormat = communicationFormat;
  }


  public Webhook description(String description) {
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


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public Webhook filterMerchantAccountType(FilterMerchantAccountTypeEnum filterMerchantAccountType) {
    this.filterMerchantAccountType = filterMerchantAccountType;
    return this;
  }

   /**
   * Shows how merchant accounts are included in company-level webhooks. Possible values: * **includeAccounts** * **excludeAccounts** * **allAccounts**: Includes all merchant accounts, and does not require specifying &#x60;filterMerchantAccounts&#x60;.
   * @return filterMerchantAccountType
  **/
  @ApiModelProperty(value = "Shows how merchant accounts are included in company-level webhooks. Possible values: * **includeAccounts** * **excludeAccounts** * **allAccounts**: Includes all merchant accounts, and does not require specifying `filterMerchantAccounts`.")
  @JsonProperty(JSON_PROPERTY_FILTER_MERCHANT_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FilterMerchantAccountTypeEnum getFilterMerchantAccountType() {
    return filterMerchantAccountType;
  }


  @JsonProperty(JSON_PROPERTY_FILTER_MERCHANT_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilterMerchantAccountType(FilterMerchantAccountTypeEnum filterMerchantAccountType) {
    this.filterMerchantAccountType = filterMerchantAccountType;
  }


  public Webhook filterMerchantAccounts(List<String> filterMerchantAccounts) {
    this.filterMerchantAccounts = filterMerchantAccounts;
    return this;
  }

  public Webhook addFilterMerchantAccountsItem(String filterMerchantAccountsItem) {
    if (this.filterMerchantAccounts == null) {
      this.filterMerchantAccounts = new ArrayList<>();
    }
    this.filterMerchantAccounts.add(filterMerchantAccountsItem);
    return this;
  }

   /**
   * A list of merchant account names that are included or excluded from receiving the webhook. Inclusion or exclusion is based on the value defined for &#x60;filterMerchantAccountType&#x60;.  Required if &#x60;filterMerchantAccountType&#x60; is either: * **includeAccounts** * **excludeAccounts**  Not needed for &#x60;filterMerchantAccountType&#x60;: **allAccounts**.
   * @return filterMerchantAccounts
  **/
  @ApiModelProperty(value = "A list of merchant account names that are included or excluded from receiving the webhook. Inclusion or exclusion is based on the value defined for `filterMerchantAccountType`.  Required if `filterMerchantAccountType` is either: * **includeAccounts** * **excludeAccounts**  Not needed for `filterMerchantAccountType`: **allAccounts**.")
  @JsonProperty(JSON_PROPERTY_FILTER_MERCHANT_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getFilterMerchantAccounts() {
    return filterMerchantAccounts;
  }


  @JsonProperty(JSON_PROPERTY_FILTER_MERCHANT_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilterMerchantAccounts(List<String> filterMerchantAccounts) {
    this.filterMerchantAccounts = filterMerchantAccounts;
  }


  public Webhook hasError(Boolean hasError) {
    this.hasError = hasError;
    return this;
  }

   /**
   * Indicates if the webhook configuration has errors that need troubleshooting. If the value is **true**, troubleshoot the configuration using the [testing endpoint](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/companies/{companyId}/webhooks/{webhookid}/test).
   * @return hasError
  **/
  @ApiModelProperty(value = "Indicates if the webhook configuration has errors that need troubleshooting. If the value is **true**, troubleshoot the configuration using the [testing endpoint](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/companies/{companyId}/webhooks/{webhookid}/test).")
  @JsonProperty(JSON_PROPERTY_HAS_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasError() {
    return hasError;
  }


  @JsonProperty(JSON_PROPERTY_HAS_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasError(Boolean hasError) {
    this.hasError = hasError;
  }


  public Webhook hasPassword(Boolean hasPassword) {
    this.hasPassword = hasPassword;
    return this;
  }

   /**
   * Indicates if the webhook is password protected.
   * @return hasPassword
  **/
  @ApiModelProperty(value = "Indicates if the webhook is password protected.")
  @JsonProperty(JSON_PROPERTY_HAS_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasPassword() {
    return hasPassword;
  }


  @JsonProperty(JSON_PROPERTY_HAS_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasPassword(Boolean hasPassword) {
    this.hasPassword = hasPassword;
  }


  public Webhook hmacKeyCheckValue(String hmacKeyCheckValue) {
    this.hmacKeyCheckValue = hmacKeyCheckValue;
    return this;
  }

   /**
   * The [checksum](https://en.wikipedia.org/wiki/Key_checksum_value) of the HMAC key generated for this webhook. You can use this value to uniquely identify the HMAC key configured for this webhook.
   * @return hmacKeyCheckValue
  **/
  @ApiModelProperty(value = "The [checksum](https://en.wikipedia.org/wiki/Key_checksum_value) of the HMAC key generated for this webhook. You can use this value to uniquely identify the HMAC key configured for this webhook.")
  @JsonProperty(JSON_PROPERTY_HMAC_KEY_CHECK_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHmacKeyCheckValue() {
    return hmacKeyCheckValue;
  }


  @JsonProperty(JSON_PROPERTY_HMAC_KEY_CHECK_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHmacKeyCheckValue(String hmacKeyCheckValue) {
    this.hmacKeyCheckValue = hmacKeyCheckValue;
  }


  public Webhook id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for this webhook.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier for this webhook.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public Webhook networkType(NetworkTypeEnum networkType) {
    this.networkType = networkType;
    return this;
  }

   /**
   * Network type for Terminal API details webhooks.
   * @return networkType
  **/
  @ApiModelProperty(value = "Network type for Terminal API details webhooks.")
  @JsonProperty(JSON_PROPERTY_NETWORK_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkTypeEnum getNetworkType() {
    return networkType;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkType(NetworkTypeEnum networkType) {
    this.networkType = networkType;
  }


  public Webhook populateSoapActionHeader(Boolean populateSoapActionHeader) {
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


  @JsonProperty(JSON_PROPERTY_POPULATE_SOAP_ACTION_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPopulateSoapActionHeader(Boolean populateSoapActionHeader) {
    this.populateSoapActionHeader = populateSoapActionHeader;
  }


  public Webhook sslVersion(SslVersionEnum sslVersion) {
    this.sslVersion = sslVersion;
    return this;
  }

   /**
   * SSL version to access the public webhook URL specified in the &#x60;url&#x60; field. Possible values: * **TLSv1.3** * **TLSv1.2** * **HTTP** - Only allowed on Test environment.  If not specified, the webhook will use &#x60;sslVersion&#x60;: **TLSv1.2**.
   * @return sslVersion
  **/
  @ApiModelProperty(example = "TLSv1.2", value = "SSL version to access the public webhook URL specified in the `url` field. Possible values: * **TLSv1.3** * **TLSv1.2** * **HTTP** - Only allowed on Test environment.  If not specified, the webhook will use `sslVersion`: **TLSv1.2**.")
  @JsonProperty(JSON_PROPERTY_SSL_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SslVersionEnum getSslVersion() {
    return sslVersion;
  }


  @JsonProperty(JSON_PROPERTY_SSL_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSslVersion(SslVersionEnum sslVersion) {
    this.sslVersion = sslVersion;
  }


  public Webhook type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of webhook. Possible values are:  - **standard** - **account-settings-notification** - **banktransfer-notification** - **boletobancario-notification** - **directdebit-notification** - **pending-notification** - **ideal-notification** - **ideal-pending-notification** - **report-notification** - **terminal-api-notification**  Find out more about [standard notification webhooks](https://docs.adyen.com/development-resources/webhooks/understand-notifications#event-codes) and [other types of notifications](https://docs.adyen.com/development-resources/webhooks/understand-notifications#other-notifications).
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of webhook. Possible values are:  - **standard** - **account-settings-notification** - **banktransfer-notification** - **boletobancario-notification** - **directdebit-notification** - **pending-notification** - **ideal-notification** - **ideal-pending-notification** - **report-notification** - **terminal-api-notification**  Find out more about [standard notification webhooks](https://docs.adyen.com/development-resources/webhooks/understand-notifications#event-codes) and [other types of notifications](https://docs.adyen.com/development-resources/webhooks/understand-notifications#other-notifications).")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public Webhook url(String url) {
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


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public Webhook username(String username) {
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


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(String username) {
    this.username = username;
  }


  /**
   * Return true if this Webhook object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.links, webhook.links) &&
        Objects.equals(this.acceptsExpiredCertificate, webhook.acceptsExpiredCertificate) &&
        Objects.equals(this.acceptsSelfSignedCertificate, webhook.acceptsSelfSignedCertificate) &&
        Objects.equals(this.acceptsUntrustedRootCertificate, webhook.acceptsUntrustedRootCertificate) &&
        Objects.equals(this.accountReference, webhook.accountReference) &&
        Objects.equals(this.active, webhook.active) &&
        Objects.equals(this.additionalSettings, webhook.additionalSettings) &&
        Objects.equals(this.certificateAlias, webhook.certificateAlias) &&
        Objects.equals(this.communicationFormat, webhook.communicationFormat) &&
        Objects.equals(this.description, webhook.description) &&
        Objects.equals(this.filterMerchantAccountType, webhook.filterMerchantAccountType) &&
        Objects.equals(this.filterMerchantAccounts, webhook.filterMerchantAccounts) &&
        Objects.equals(this.hasError, webhook.hasError) &&
        Objects.equals(this.hasPassword, webhook.hasPassword) &&
        Objects.equals(this.hmacKeyCheckValue, webhook.hmacKeyCheckValue) &&
        Objects.equals(this.id, webhook.id) &&
        Objects.equals(this.networkType, webhook.networkType) &&
        Objects.equals(this.populateSoapActionHeader, webhook.populateSoapActionHeader) &&
        Objects.equals(this.sslVersion, webhook.sslVersion) &&
        Objects.equals(this.type, webhook.type) &&
        Objects.equals(this.url, webhook.url) &&
        Objects.equals(this.username, webhook.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, acceptsExpiredCertificate, acceptsSelfSignedCertificate, acceptsUntrustedRootCertificate, accountReference, active, additionalSettings, certificateAlias, communicationFormat, description, filterMerchantAccountType, filterMerchantAccounts, hasError, hasPassword, hmacKeyCheckValue, id, networkType, populateSoapActionHeader, sslVersion, type, url, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    acceptsExpiredCertificate: ").append(toIndentedString(acceptsExpiredCertificate)).append("\n");
    sb.append("    acceptsSelfSignedCertificate: ").append(toIndentedString(acceptsSelfSignedCertificate)).append("\n");
    sb.append("    acceptsUntrustedRootCertificate: ").append(toIndentedString(acceptsUntrustedRootCertificate)).append("\n");
    sb.append("    accountReference: ").append(toIndentedString(accountReference)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    additionalSettings: ").append(toIndentedString(additionalSettings)).append("\n");
    sb.append("    certificateAlias: ").append(toIndentedString(certificateAlias)).append("\n");
    sb.append("    communicationFormat: ").append(toIndentedString(communicationFormat)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filterMerchantAccountType: ").append(toIndentedString(filterMerchantAccountType)).append("\n");
    sb.append("    filterMerchantAccounts: ").append(toIndentedString(filterMerchantAccounts)).append("\n");
    sb.append("    hasError: ").append(toIndentedString(hasError)).append("\n");
    sb.append("    hasPassword: ").append(toIndentedString(hasPassword)).append("\n");
    sb.append("    hmacKeyCheckValue: ").append(toIndentedString(hmacKeyCheckValue)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
    sb.append("    populateSoapActionHeader: ").append(toIndentedString(populateSoapActionHeader)).append("\n");
    sb.append("    sslVersion: ").append(toIndentedString(sslVersion)).append("\n");
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
   * Create an instance of Webhook given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Webhook
   * @throws JsonProcessingException if the JSON string is invalid with respect to Webhook
   */
  public static Webhook fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Webhook.class);
  }
/**
  * Convert an instance of Webhook to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

