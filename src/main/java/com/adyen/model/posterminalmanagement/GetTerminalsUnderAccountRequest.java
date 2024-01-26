/*
 * POS Terminal Management API
 * This API provides endpoints for managing your point-of-sale (POS) payment terminals. You can use the API to obtain information about a specific terminal, retrieve overviews of your terminals and stores, and assign terminals to a merchant account or store.  For more information, refer to [Assign terminals](https://docs.adyen.com/point-of-sale/automating-terminal-management/assign-terminals-api).  ## Authentication Each request to the Terminal Management API must be signed with an API key. For this, obtain an API Key from your Customer Area, as described in [How to get the API key](https://docs.adyen.com/development-resources/api-credentials#generate-api-key). Then set this key to the `X-API-Key` header value, for example:  ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: Your_API_key\" \\ ... ``` Note that when going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning Terminal Management API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://postfmapi-test.adyen.com/postfmapi/terminal/v1/getTerminalsUnderAccount ``` When using versioned endpoints, Boolean response values are returned in string format: `\"true\"` or `\"false\"`. If you omit the version from the endpoint URL, Boolean response values are returned like this: `true` or `false`.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.posterminalmanagement;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
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
 * GetTerminalsUnderAccountRequest
 */
@JsonPropertyOrder({
  GetTerminalsUnderAccountRequest.JSON_PROPERTY_COMPANY_ACCOUNT,
  GetTerminalsUnderAccountRequest.JSON_PROPERTY_MERCHANT_ACCOUNT,
  GetTerminalsUnderAccountRequest.JSON_PROPERTY_STORE
})

public class GetTerminalsUnderAccountRequest {
  public static final String JSON_PROPERTY_COMPANY_ACCOUNT = "companyAccount";
  private String companyAccount;

  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  private String merchantAccount;

  public static final String JSON_PROPERTY_STORE = "store";
  private String store;

  public GetTerminalsUnderAccountRequest() { 
  }

  public GetTerminalsUnderAccountRequest companyAccount(String companyAccount) {
    this.companyAccount = companyAccount;
    return this;
  }

   /**
   * Your company account. If you only specify this parameter, the response includes all terminals at all account levels.
   * @return companyAccount
  **/
  @ApiModelProperty(required = true, value = "Your company account. If you only specify this parameter, the response includes all terminals at all account levels.")
  @JsonProperty(JSON_PROPERTY_COMPANY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyAccount() {
    return companyAccount;
  }


 /**
  * Your company account. If you only specify this parameter, the response includes all terminals at all account levels.
  *
  * @param companyAccount
  */ 
  @JsonProperty(JSON_PROPERTY_COMPANY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyAccount(String companyAccount) {
    this.companyAccount = companyAccount;
  }


  public GetTerminalsUnderAccountRequest merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account. This is required if you are retrieving the terminals assigned to a store.If you don&#39;t specify a &#x60;store&#x60; the response includes the terminals assigned to the specified merchant account and the terminals assigned to the stores under this merchant account.
   * @return merchantAccount
  **/
  @ApiModelProperty(value = "The merchant account. This is required if you are retrieving the terminals assigned to a store.If you don't specify a `store` the response includes the terminals assigned to the specified merchant account and the terminals assigned to the stores under this merchant account.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantAccount() {
    return merchantAccount;
  }


 /**
  * The merchant account. This is required if you are retrieving the terminals assigned to a store.If you don&#39;t specify a &#x60;store&#x60; the response includes the terminals assigned to the specified merchant account and the terminals assigned to the stores under this merchant account.
  *
  * @param merchantAccount
  */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public GetTerminalsUnderAccountRequest store(String store) {
    this.store = store;
    return this;
  }

   /**
   * The store code of the store. With this parameter, the response only includes the terminals assigned to the specified store.
   * @return store
  **/
  @ApiModelProperty(value = "The store code of the store. With this parameter, the response only includes the terminals assigned to the specified store.")
  @JsonProperty(JSON_PROPERTY_STORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStore() {
    return store;
  }


 /**
  * The store code of the store. With this parameter, the response only includes the terminals assigned to the specified store.
  *
  * @param store
  */ 
  @JsonProperty(JSON_PROPERTY_STORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStore(String store) {
    this.store = store;
  }


  /**
   * Return true if this GetTerminalsUnderAccountRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTerminalsUnderAccountRequest getTerminalsUnderAccountRequest = (GetTerminalsUnderAccountRequest) o;
    return Objects.equals(this.companyAccount, getTerminalsUnderAccountRequest.companyAccount) &&
        Objects.equals(this.merchantAccount, getTerminalsUnderAccountRequest.merchantAccount) &&
        Objects.equals(this.store, getTerminalsUnderAccountRequest.store);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyAccount, merchantAccount, store);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTerminalsUnderAccountRequest {\n");
    sb.append("    companyAccount: ").append(toIndentedString(companyAccount)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
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
   * Create an instance of GetTerminalsUnderAccountRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetTerminalsUnderAccountRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to GetTerminalsUnderAccountRequest
   */
  public static GetTerminalsUnderAccountRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, GetTerminalsUnderAccountRequest.class);
  }
/**
  * Convert an instance of GetTerminalsUnderAccountRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

