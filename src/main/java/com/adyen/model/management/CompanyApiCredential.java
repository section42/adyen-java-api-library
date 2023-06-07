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
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.management.AllowedOrigin;
import com.adyen.model.management.ApiCredentialLinks;
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
 * CompanyApiCredential
 */
@JsonPropertyOrder({
  CompanyApiCredential.JSON_PROPERTY_LINKS,
  CompanyApiCredential.JSON_PROPERTY_ACTIVE,
  CompanyApiCredential.JSON_PROPERTY_ALLOWED_IP_ADDRESSES,
  CompanyApiCredential.JSON_PROPERTY_ALLOWED_ORIGINS,
  CompanyApiCredential.JSON_PROPERTY_ASSOCIATED_MERCHANT_ACCOUNTS,
  CompanyApiCredential.JSON_PROPERTY_CLIENT_KEY,
  CompanyApiCredential.JSON_PROPERTY_DESCRIPTION,
  CompanyApiCredential.JSON_PROPERTY_ID,
  CompanyApiCredential.JSON_PROPERTY_ROLES,
  CompanyApiCredential.JSON_PROPERTY_USERNAME
})

public class CompanyApiCredential {
  public static final String JSON_PROPERTY_LINKS = "_links";
  private ApiCredentialLinks links;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_ALLOWED_IP_ADDRESSES = "allowedIpAddresses";
  private List<String> allowedIpAddresses = new ArrayList<>();

  public static final String JSON_PROPERTY_ALLOWED_ORIGINS = "allowedOrigins";
  private List<AllowedOrigin> allowedOrigins = null;

  public static final String JSON_PROPERTY_ASSOCIATED_MERCHANT_ACCOUNTS = "associatedMerchantAccounts";
  private List<String> associatedMerchantAccounts = null;

  public static final String JSON_PROPERTY_CLIENT_KEY = "clientKey";
  private String clientKey;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ROLES = "roles";
  private List<String> roles = new ArrayList<>();

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public CompanyApiCredential() { 
  }

  public CompanyApiCredential links(ApiCredentialLinks links) {
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

  public ApiCredentialLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(ApiCredentialLinks links) {
    this.links = links;
  }


  public CompanyApiCredential active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Indicates if the API credential is enabled. Must be set to **true** to use the credential in your integration.
   * @return active
  **/
  @ApiModelProperty(required = true, value = "Indicates if the API credential is enabled. Must be set to **true** to use the credential in your integration.")
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


  public CompanyApiCredential allowedIpAddresses(List<String> allowedIpAddresses) {
    this.allowedIpAddresses = allowedIpAddresses;
    return this;
  }

  public CompanyApiCredential addAllowedIpAddressesItem(String allowedIpAddressesItem) {
    this.allowedIpAddresses.add(allowedIpAddressesItem);
    return this;
  }

   /**
   * List of IP addresses from which your client can make requests.  If the list is empty, we allow requests from any IP. If the list is not empty and we get a request from an IP which is not on the list, you get a security error.
   * @return allowedIpAddresses
  **/
  @ApiModelProperty(required = true, value = "List of IP addresses from which your client can make requests.  If the list is empty, we allow requests from any IP. If the list is not empty and we get a request from an IP which is not on the list, you get a security error.")
  @JsonProperty(JSON_PROPERTY_ALLOWED_IP_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAllowedIpAddresses() {
    return allowedIpAddresses;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_IP_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedIpAddresses(List<String> allowedIpAddresses) {
    this.allowedIpAddresses = allowedIpAddresses;
  }


  public CompanyApiCredential allowedOrigins(List<AllowedOrigin> allowedOrigins) {
    this.allowedOrigins = allowedOrigins;
    return this;
  }

  public CompanyApiCredential addAllowedOriginsItem(AllowedOrigin allowedOriginsItem) {
    if (this.allowedOrigins == null) {
      this.allowedOrigins = new ArrayList<>();
    }
    this.allowedOrigins.add(allowedOriginsItem);
    return this;
  }

   /**
   * List containing the [allowed origins](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) linked to the API credential.
   * @return allowedOrigins
  **/
  @ApiModelProperty(value = "List containing the [allowed origins](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) linked to the API credential.")
  @JsonProperty(JSON_PROPERTY_ALLOWED_ORIGINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AllowedOrigin> getAllowedOrigins() {
    return allowedOrigins;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_ORIGINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedOrigins(List<AllowedOrigin> allowedOrigins) {
    this.allowedOrigins = allowedOrigins;
  }


  public CompanyApiCredential associatedMerchantAccounts(List<String> associatedMerchantAccounts) {
    this.associatedMerchantAccounts = associatedMerchantAccounts;
    return this;
  }

  public CompanyApiCredential addAssociatedMerchantAccountsItem(String associatedMerchantAccountsItem) {
    if (this.associatedMerchantAccounts == null) {
      this.associatedMerchantAccounts = new ArrayList<>();
    }
    this.associatedMerchantAccounts.add(associatedMerchantAccountsItem);
    return this;
  }

   /**
   * List of merchant accounts that the API credential has explicit access to.   If the credential has access to a company, this implies access to all merchant accounts and no merchants for that company will be included.
   * @return associatedMerchantAccounts
  **/
  @ApiModelProperty(value = "List of merchant accounts that the API credential has explicit access to.   If the credential has access to a company, this implies access to all merchant accounts and no merchants for that company will be included.")
  @JsonProperty(JSON_PROPERTY_ASSOCIATED_MERCHANT_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAssociatedMerchantAccounts() {
    return associatedMerchantAccounts;
  }


  @JsonProperty(JSON_PROPERTY_ASSOCIATED_MERCHANT_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssociatedMerchantAccounts(List<String> associatedMerchantAccounts) {
    this.associatedMerchantAccounts = associatedMerchantAccounts;
  }


  public CompanyApiCredential clientKey(String clientKey) {
    this.clientKey = clientKey;
    return this;
  }

   /**
   * Public key used for [client-side authentication](https://docs.adyen.com/development-resources/client-side-authentication). The client key is required for Drop-in and Components integrations.
   * @return clientKey
  **/
  @ApiModelProperty(required = true, value = "Public key used for [client-side authentication](https://docs.adyen.com/development-resources/client-side-authentication). The client key is required for Drop-in and Components integrations.")
  @JsonProperty(JSON_PROPERTY_CLIENT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientKey() {
    return clientKey;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientKey(String clientKey) {
    this.clientKey = clientKey;
  }


  public CompanyApiCredential description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the API credential.
   * @return description
  **/
  @ApiModelProperty(value = "Description of the API credential.")
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


  public CompanyApiCredential id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the API credential.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the API credential.")
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


  public CompanyApiCredential roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public CompanyApiCredential addRolesItem(String rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * List of [roles](https://docs.adyen.com/development-resources/api-credentials#roles-1) for the API credential.
   * @return roles
  **/
  @ApiModelProperty(required = true, value = "List of [roles](https://docs.adyen.com/development-resources/api-credentials#roles-1) for the API credential.")
  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRoles() {
    return roles;
  }


  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


  public CompanyApiCredential username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The name of the [API credential](https://docs.adyen.com/development-resources/api-credentials), for example **ws@Company.TestCompany**.
   * @return username
  **/
  @ApiModelProperty(required = true, value = "The name of the [API credential](https://docs.adyen.com/development-resources/api-credentials), for example **ws@Company.TestCompany**.")
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
   * Return true if this CompanyApiCredential object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyApiCredential companyApiCredential = (CompanyApiCredential) o;
    return Objects.equals(this.links, companyApiCredential.links) &&
        Objects.equals(this.active, companyApiCredential.active) &&
        Objects.equals(this.allowedIpAddresses, companyApiCredential.allowedIpAddresses) &&
        Objects.equals(this.allowedOrigins, companyApiCredential.allowedOrigins) &&
        Objects.equals(this.associatedMerchantAccounts, companyApiCredential.associatedMerchantAccounts) &&
        Objects.equals(this.clientKey, companyApiCredential.clientKey) &&
        Objects.equals(this.description, companyApiCredential.description) &&
        Objects.equals(this.id, companyApiCredential.id) &&
        Objects.equals(this.roles, companyApiCredential.roles) &&
        Objects.equals(this.username, companyApiCredential.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, active, allowedIpAddresses, allowedOrigins, associatedMerchantAccounts, clientKey, description, id, roles, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyApiCredential {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    allowedIpAddresses: ").append(toIndentedString(allowedIpAddresses)).append("\n");
    sb.append("    allowedOrigins: ").append(toIndentedString(allowedOrigins)).append("\n");
    sb.append("    associatedMerchantAccounts: ").append(toIndentedString(associatedMerchantAccounts)).append("\n");
    sb.append("    clientKey: ").append(toIndentedString(clientKey)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
   * Create an instance of CompanyApiCredential given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CompanyApiCredential
   * @throws JsonProcessingException if the JSON string is invalid with respect to CompanyApiCredential
   */
  public static CompanyApiCredential fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CompanyApiCredential.class);
  }
/**
  * Convert an instance of CompanyApiCredential to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

