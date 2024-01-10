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
import com.adyen.model.management.DataCenter;
import com.adyen.model.management.MerchantLinks;
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
 * Merchant
 */
@JsonPropertyOrder({
  Merchant.JSON_PROPERTY_LINKS,
  Merchant.JSON_PROPERTY_CAPTURE_DELAY,
  Merchant.JSON_PROPERTY_COMPANY_ID,
  Merchant.JSON_PROPERTY_DATA_CENTERS,
  Merchant.JSON_PROPERTY_DEFAULT_SHOPPER_INTERACTION,
  Merchant.JSON_PROPERTY_DESCRIPTION,
  Merchant.JSON_PROPERTY_ID,
  Merchant.JSON_PROPERTY_MERCHANT_CITY,
  Merchant.JSON_PROPERTY_NAME,
  Merchant.JSON_PROPERTY_PRICING_PLAN,
  Merchant.JSON_PROPERTY_PRIMARY_SETTLEMENT_CURRENCY,
  Merchant.JSON_PROPERTY_REFERENCE,
  Merchant.JSON_PROPERTY_SHOP_WEB_ADDRESS,
  Merchant.JSON_PROPERTY_STATUS
})

public class Merchant {
  public static final String JSON_PROPERTY_LINKS = "_links";
  private MerchantLinks links;

  public static final String JSON_PROPERTY_CAPTURE_DELAY = "captureDelay";
  private String captureDelay;

  public static final String JSON_PROPERTY_COMPANY_ID = "companyId";
  private String companyId;

  public static final String JSON_PROPERTY_DATA_CENTERS = "dataCenters";
  private List<DataCenter> dataCenters = null;

  public static final String JSON_PROPERTY_DEFAULT_SHOPPER_INTERACTION = "defaultShopperInteraction";
  private String defaultShopperInteraction;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MERCHANT_CITY = "merchantCity";
  private String merchantCity;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PRICING_PLAN = "pricingPlan";
  private String pricingPlan;

  public static final String JSON_PROPERTY_PRIMARY_SETTLEMENT_CURRENCY = "primarySettlementCurrency";
  private String primarySettlementCurrency;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_SHOP_WEB_ADDRESS = "shopWebAddress";
  private String shopWebAddress;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public Merchant() { 
  }

  public Merchant links(MerchantLinks links) {
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

  public MerchantLinks getLinks() {
    return links;
  }


 /**
  * links
  *
  * @param links
  */ 
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(MerchantLinks links) {
    this.links = links;
  }


  public Merchant captureDelay(String captureDelay) {
    this.captureDelay = captureDelay;
    return this;
  }

   /**
   * The [capture delay](https://docs.adyen.com/online-payments/capture#capture-delay) set for the merchant account.  Possible values: * **Immediate** * **Manual** * Number of days from **1** to **29**
   * @return captureDelay
  **/
  @ApiModelProperty(value = "The [capture delay](https://docs.adyen.com/online-payments/capture#capture-delay) set for the merchant account.  Possible values: * **Immediate** * **Manual** * Number of days from **1** to **29**")
  @JsonProperty(JSON_PROPERTY_CAPTURE_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCaptureDelay() {
    return captureDelay;
  }


 /**
  * The [capture delay](https://docs.adyen.com/online-payments/capture#capture-delay) set for the merchant account.  Possible values: * **Immediate** * **Manual** * Number of days from **1** to **29**
  *
  * @param captureDelay
  */ 
  @JsonProperty(JSON_PROPERTY_CAPTURE_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCaptureDelay(String captureDelay) {
    this.captureDelay = captureDelay;
  }


  public Merchant companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

   /**
   * The unique identifier of the company account this merchant belongs to
   * @return companyId
  **/
  @ApiModelProperty(value = "The unique identifier of the company account this merchant belongs to")
  @JsonProperty(JSON_PROPERTY_COMPANY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyId() {
    return companyId;
  }


 /**
  * The unique identifier of the company account this merchant belongs to
  *
  * @param companyId
  */ 
  @JsonProperty(JSON_PROPERTY_COMPANY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }


  public Merchant dataCenters(List<DataCenter> dataCenters) {
    this.dataCenters = dataCenters;
    return this;
  }

  public Merchant addDataCentersItem(DataCenter dataCentersItem) {
    if (this.dataCenters == null) {
      this.dataCenters = new ArrayList<>();
    }
    this.dataCenters.add(dataCentersItem);
    return this;
  }

   /**
   * List of available data centers.  Adyen has several data centers around the world.In the URL that you use for making API requests, we recommend you use the live URL prefix from the data center closest to your shoppers.
   * @return dataCenters
  **/
  @ApiModelProperty(value = "List of available data centers.  Adyen has several data centers around the world.In the URL that you use for making API requests, we recommend you use the live URL prefix from the data center closest to your shoppers.")
  @JsonProperty(JSON_PROPERTY_DATA_CENTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DataCenter> getDataCenters() {
    return dataCenters;
  }


 /**
  * List of available data centers.  Adyen has several data centers around the world.In the URL that you use for making API requests, we recommend you use the live URL prefix from the data center closest to your shoppers.
  *
  * @param dataCenters
  */ 
  @JsonProperty(JSON_PROPERTY_DATA_CENTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataCenters(List<DataCenter> dataCenters) {
    this.dataCenters = dataCenters;
  }


  public Merchant defaultShopperInteraction(String defaultShopperInteraction) {
    this.defaultShopperInteraction = defaultShopperInteraction;
    return this;
  }

   /**
   * The default [&#x60;shopperInteraction&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/v68/post/payments__reqParam_shopperInteraction) value used when processing payments through this merchant account.
   * @return defaultShopperInteraction
  **/
  @ApiModelProperty(value = "The default [`shopperInteraction`](https://docs.adyen.com/api-explorer/#/CheckoutService/v68/post/payments__reqParam_shopperInteraction) value used when processing payments through this merchant account.")
  @JsonProperty(JSON_PROPERTY_DEFAULT_SHOPPER_INTERACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultShopperInteraction() {
    return defaultShopperInteraction;
  }


 /**
  * The default [&#x60;shopperInteraction&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/v68/post/payments__reqParam_shopperInteraction) value used when processing payments through this merchant account.
  *
  * @param defaultShopperInteraction
  */ 
  @JsonProperty(JSON_PROPERTY_DEFAULT_SHOPPER_INTERACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultShopperInteraction(String defaultShopperInteraction) {
    this.defaultShopperInteraction = defaultShopperInteraction;
  }


  public Merchant description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Your description for the merchant account, maximum 300 characters
   * @return description
  **/
  @ApiModelProperty(value = "Your description for the merchant account, maximum 300 characters")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


 /**
  * Your description for the merchant account, maximum 300 characters
  *
  * @param description
  */ 
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public Merchant id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the merchant account.
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier of the merchant account.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


 /**
  * The unique identifier of the merchant account.
  *
  * @param id
  */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public Merchant merchantCity(String merchantCity) {
    this.merchantCity = merchantCity;
    return this;
  }

   /**
   * The city where the legal entity of this merchant account is registered.
   * @return merchantCity
  **/
  @ApiModelProperty(value = "The city where the legal entity of this merchant account is registered.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantCity() {
    return merchantCity;
  }


 /**
  * The city where the legal entity of this merchant account is registered.
  *
  * @param merchantCity
  */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantCity(String merchantCity) {
    this.merchantCity = merchantCity;
  }


  public Merchant name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the legal entity associated with the merchant account.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the legal entity associated with the merchant account.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


 /**
  * The name of the legal entity associated with the merchant account.
  *
  * @param name
  */ 
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public Merchant pricingPlan(String pricingPlan) {
    this.pricingPlan = pricingPlan;
    return this;
  }

   /**
   * Only applies to merchant accounts managed by Adyen&#39;s partners. The name of the pricing plan assigned to the merchant account.
   * @return pricingPlan
  **/
  @ApiModelProperty(value = "Only applies to merchant accounts managed by Adyen's partners. The name of the pricing plan assigned to the merchant account.")
  @JsonProperty(JSON_PROPERTY_PRICING_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPricingPlan() {
    return pricingPlan;
  }


 /**
  * Only applies to merchant accounts managed by Adyen&#39;s partners. The name of the pricing plan assigned to the merchant account.
  *
  * @param pricingPlan
  */ 
  @JsonProperty(JSON_PROPERTY_PRICING_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPricingPlan(String pricingPlan) {
    this.pricingPlan = pricingPlan;
  }


  public Merchant primarySettlementCurrency(String primarySettlementCurrency) {
    this.primarySettlementCurrency = primarySettlementCurrency;
    return this;
  }

   /**
   * The currency of the country where the legal entity of this merchant account is registered. Format: [ISO currency code](https://docs.adyen.com/development-resources/currency-codes). For example, a legal entity based in the United States has USD as the primary settlement currency.
   * @return primarySettlementCurrency
  **/
  @ApiModelProperty(value = "The currency of the country where the legal entity of this merchant account is registered. Format: [ISO currency code](https://docs.adyen.com/development-resources/currency-codes). For example, a legal entity based in the United States has USD as the primary settlement currency.")
  @JsonProperty(JSON_PROPERTY_PRIMARY_SETTLEMENT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrimarySettlementCurrency() {
    return primarySettlementCurrency;
  }


 /**
  * The currency of the country where the legal entity of this merchant account is registered. Format: [ISO currency code](https://docs.adyen.com/development-resources/currency-codes). For example, a legal entity based in the United States has USD as the primary settlement currency.
  *
  * @param primarySettlementCurrency
  */ 
  @JsonProperty(JSON_PROPERTY_PRIMARY_SETTLEMENT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimarySettlementCurrency(String primarySettlementCurrency) {
    this.primarySettlementCurrency = primarySettlementCurrency;
  }


  public Merchant reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Reference of the merchant account.
   * @return reference
  **/
  @ApiModelProperty(value = "Reference of the merchant account.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


 /**
  * Reference of the merchant account.
  *
  * @param reference
  */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  public Merchant shopWebAddress(String shopWebAddress) {
    this.shopWebAddress = shopWebAddress;
    return this;
  }

   /**
   * The URL for the ecommerce website used with this merchant account.
   * @return shopWebAddress
  **/
  @ApiModelProperty(value = "The URL for the ecommerce website used with this merchant account.")
  @JsonProperty(JSON_PROPERTY_SHOP_WEB_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShopWebAddress() {
    return shopWebAddress;
  }


 /**
  * The URL for the ecommerce website used with this merchant account.
  *
  * @param shopWebAddress
  */ 
  @JsonProperty(JSON_PROPERTY_SHOP_WEB_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopWebAddress(String shopWebAddress) {
    this.shopWebAddress = shopWebAddress;
  }


  public Merchant status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the merchant account.  Possible values:  * **PreActive**: The merchant account has been created. Users cannot access the merchant account in the Customer Area. The account cannot process payments. * **Active**: Users can access the merchant account in the Customer Area. If the company account is also **Active**, then payment processing and payouts are enabled. * **InactiveWithModifications**: Users can access the merchant account in the Customer Area. You cannot process new payments but you can still modify payments, for example issue refunds. You can still receive payouts. * **Inactive**: Users can access the merchant account in the Customer Area. Payment processing and payouts are disabled. * **Closed**: The account is closed and this cannot be reversed. Users cannot log in. Payment processing and payouts are disabled.
   * @return status
  **/
  @ApiModelProperty(value = "The status of the merchant account.  Possible values:  * **PreActive**: The merchant account has been created. Users cannot access the merchant account in the Customer Area. The account cannot process payments. * **Active**: Users can access the merchant account in the Customer Area. If the company account is also **Active**, then payment processing and payouts are enabled. * **InactiveWithModifications**: Users can access the merchant account in the Customer Area. You cannot process new payments but you can still modify payments, for example issue refunds. You can still receive payouts. * **Inactive**: Users can access the merchant account in the Customer Area. Payment processing and payouts are disabled. * **Closed**: The account is closed and this cannot be reversed. Users cannot log in. Payment processing and payouts are disabled.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


 /**
  * The status of the merchant account.  Possible values:  * **PreActive**: The merchant account has been created. Users cannot access the merchant account in the Customer Area. The account cannot process payments. * **Active**: Users can access the merchant account in the Customer Area. If the company account is also **Active**, then payment processing and payouts are enabled. * **InactiveWithModifications**: Users can access the merchant account in the Customer Area. You cannot process new payments but you can still modify payments, for example issue refunds. You can still receive payouts. * **Inactive**: Users can access the merchant account in the Customer Area. Payment processing and payouts are disabled. * **Closed**: The account is closed and this cannot be reversed. Users cannot log in. Payment processing and payouts are disabled.
  *
  * @param status
  */ 
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * Return true if this Merchant object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Merchant merchant = (Merchant) o;
    return Objects.equals(this.links, merchant.links) &&
        Objects.equals(this.captureDelay, merchant.captureDelay) &&
        Objects.equals(this.companyId, merchant.companyId) &&
        Objects.equals(this.dataCenters, merchant.dataCenters) &&
        Objects.equals(this.defaultShopperInteraction, merchant.defaultShopperInteraction) &&
        Objects.equals(this.description, merchant.description) &&
        Objects.equals(this.id, merchant.id) &&
        Objects.equals(this.merchantCity, merchant.merchantCity) &&
        Objects.equals(this.name, merchant.name) &&
        Objects.equals(this.pricingPlan, merchant.pricingPlan) &&
        Objects.equals(this.primarySettlementCurrency, merchant.primarySettlementCurrency) &&
        Objects.equals(this.reference, merchant.reference) &&
        Objects.equals(this.shopWebAddress, merchant.shopWebAddress) &&
        Objects.equals(this.status, merchant.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, captureDelay, companyId, dataCenters, defaultShopperInteraction, description, id, merchantCity, name, pricingPlan, primarySettlementCurrency, reference, shopWebAddress, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Merchant {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    captureDelay: ").append(toIndentedString(captureDelay)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    dataCenters: ").append(toIndentedString(dataCenters)).append("\n");
    sb.append("    defaultShopperInteraction: ").append(toIndentedString(defaultShopperInteraction)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    merchantCity: ").append(toIndentedString(merchantCity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pricingPlan: ").append(toIndentedString(pricingPlan)).append("\n");
    sb.append("    primarySettlementCurrency: ").append(toIndentedString(primarySettlementCurrency)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    shopWebAddress: ").append(toIndentedString(shopWebAddress)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
   * Create an instance of Merchant given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Merchant
   * @throws JsonProcessingException if the JSON string is invalid with respect to Merchant
   */
  public static Merchant fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Merchant.class);
  }
/**
  * Convert an instance of Merchant to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

