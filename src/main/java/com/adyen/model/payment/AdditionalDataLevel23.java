/*
 * Adyen Payment API
 * A set of API endpoints that allow you to initiate, settle, and modify payments on the Adyen payments platform. You can use the API to accept card payments (including One-Click and 3D Secure), bank transfers, ewallets, and many other payment methods.  To learn more about the API, visit [Classic integration](https://docs.adyen.com/classic-integration).  ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning Payments API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/Payment/v68/authorise ```  ## Going live  To authenticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/Payment/v68/authorise ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 68
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payment;

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
 * AdditionalDataLevel23
 */
@JsonPropertyOrder({
  AdditionalDataLevel23.JSON_PROPERTY_ENHANCED_SCHEME_DATA_CUSTOMER_REFERENCE,
  AdditionalDataLevel23.JSON_PROPERTY_ENHANCED_SCHEME_DATA_DESTINATION_COUNTRY_CODE,
  AdditionalDataLevel23.JSON_PROPERTY_ENHANCED_SCHEME_DATA_DESTINATION_POSTAL_CODE,
  AdditionalDataLevel23.JSON_PROPERTY_ENHANCED_SCHEME_DATA_DESTINATION_STATE_PROVINCE_CODE,
  AdditionalDataLevel23.JSON_PROPERTY_ENHANCED_SCHEME_DATA_DUTY_AMOUNT,
  AdditionalDataLevel23.JSON_PROPERTY_ENHANCED_SCHEME_DATA_FREIGHT_AMOUNT,
  AdditionalDataLevel23.JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_COMMODITY_CODE,
  AdditionalDataLevel23.JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_DESCRIPTION,
  AdditionalDataLevel23.JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_DISCOUNT_AMOUNT,
  AdditionalDataLevel23.JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_PRODUCT_CODE,
  AdditionalDataLevel23.JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_QUANTITY,
  AdditionalDataLevel23.JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_TOTAL_AMOUNT,
  AdditionalDataLevel23.JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_UNIT_OF_MEASURE,
  AdditionalDataLevel23.JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_UNIT_PRICE,
  AdditionalDataLevel23.JSON_PROPERTY_ENHANCED_SCHEME_DATA_ORDER_DATE,
  AdditionalDataLevel23.JSON_PROPERTY_ENHANCED_SCHEME_DATA_SHIP_FROM_POSTAL_CODE,
  AdditionalDataLevel23.JSON_PROPERTY_ENHANCED_SCHEME_DATA_TOTAL_TAX_AMOUNT
})

public class AdditionalDataLevel23 {
  public static final String JSON_PROPERTY_ENHANCED_SCHEME_DATA_CUSTOMER_REFERENCE = "enhancedSchemeData.customerReference";
  private String enhancedSchemeDataCustomerReference;

  public static final String JSON_PROPERTY_ENHANCED_SCHEME_DATA_DESTINATION_COUNTRY_CODE = "enhancedSchemeData.destinationCountryCode";
  private String enhancedSchemeDataDestinationCountryCode;

  public static final String JSON_PROPERTY_ENHANCED_SCHEME_DATA_DESTINATION_POSTAL_CODE = "enhancedSchemeData.destinationPostalCode";
  private String enhancedSchemeDataDestinationPostalCode;

  public static final String JSON_PROPERTY_ENHANCED_SCHEME_DATA_DESTINATION_STATE_PROVINCE_CODE = "enhancedSchemeData.destinationStateProvinceCode";
  private String enhancedSchemeDataDestinationStateProvinceCode;

  public static final String JSON_PROPERTY_ENHANCED_SCHEME_DATA_DUTY_AMOUNT = "enhancedSchemeData.dutyAmount";
  private String enhancedSchemeDataDutyAmount;

  public static final String JSON_PROPERTY_ENHANCED_SCHEME_DATA_FREIGHT_AMOUNT = "enhancedSchemeData.freightAmount";
  private String enhancedSchemeDataFreightAmount;

  public static final String JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_COMMODITY_CODE = "enhancedSchemeData.itemDetailLine[itemNr].commodityCode";
  private String enhancedSchemeDataItemDetailLineItemNrCommodityCode;

  public static final String JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_DESCRIPTION = "enhancedSchemeData.itemDetailLine[itemNr].description";
  private String enhancedSchemeDataItemDetailLineItemNrDescription;

  public static final String JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_DISCOUNT_AMOUNT = "enhancedSchemeData.itemDetailLine[itemNr].discountAmount";
  private String enhancedSchemeDataItemDetailLineItemNrDiscountAmount;

  public static final String JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_PRODUCT_CODE = "enhancedSchemeData.itemDetailLine[itemNr].productCode";
  private String enhancedSchemeDataItemDetailLineItemNrProductCode;

  public static final String JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_QUANTITY = "enhancedSchemeData.itemDetailLine[itemNr].quantity";
  private String enhancedSchemeDataItemDetailLineItemNrQuantity;

  public static final String JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_TOTAL_AMOUNT = "enhancedSchemeData.itemDetailLine[itemNr].totalAmount";
  private String enhancedSchemeDataItemDetailLineItemNrTotalAmount;

  public static final String JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_UNIT_OF_MEASURE = "enhancedSchemeData.itemDetailLine[itemNr].unitOfMeasure";
  private String enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure;

  public static final String JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_UNIT_PRICE = "enhancedSchemeData.itemDetailLine[itemNr].unitPrice";
  private String enhancedSchemeDataItemDetailLineItemNrUnitPrice;

  public static final String JSON_PROPERTY_ENHANCED_SCHEME_DATA_ORDER_DATE = "enhancedSchemeData.orderDate";
  private String enhancedSchemeDataOrderDate;

  public static final String JSON_PROPERTY_ENHANCED_SCHEME_DATA_SHIP_FROM_POSTAL_CODE = "enhancedSchemeData.shipFromPostalCode";
  private String enhancedSchemeDataShipFromPostalCode;

  public static final String JSON_PROPERTY_ENHANCED_SCHEME_DATA_TOTAL_TAX_AMOUNT = "enhancedSchemeData.totalTaxAmount";
  private String enhancedSchemeDataTotalTaxAmount;

  public AdditionalDataLevel23() { 
  }

  public AdditionalDataLevel23 enhancedSchemeDataCustomerReference(String enhancedSchemeDataCustomerReference) {
    this.enhancedSchemeDataCustomerReference = enhancedSchemeDataCustomerReference;
    return this;
  }

   /**
   * The customer code, if supplied by a customer.  Encoding: ASCII  Max length: 25 characters  Must not start with a space or be all spaces  Must not be all zeros
   * @return enhancedSchemeDataCustomerReference
  **/
  @ApiModelProperty(value = "The customer code, if supplied by a customer.  Encoding: ASCII  Max length: 25 characters  Must not start with a space or be all spaces  Must not be all zeros")
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_CUSTOMER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnhancedSchemeDataCustomerReference() {
    return enhancedSchemeDataCustomerReference;
  }


  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_CUSTOMER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedSchemeDataCustomerReference(String enhancedSchemeDataCustomerReference) {
    this.enhancedSchemeDataCustomerReference = enhancedSchemeDataCustomerReference;
  }


  public AdditionalDataLevel23 enhancedSchemeDataDestinationCountryCode(String enhancedSchemeDataDestinationCountryCode) {
    this.enhancedSchemeDataDestinationCountryCode = enhancedSchemeDataDestinationCountryCode;
    return this;
  }

   /**
   * The three-letter [ISO 3166-1 alpha-3 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) for the destination address.  Encoding: ASCII  Fixed length: 3 characters
   * @return enhancedSchemeDataDestinationCountryCode
  **/
  @ApiModelProperty(value = "The three-letter [ISO 3166-1 alpha-3 country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) for the destination address.  Encoding: ASCII  Fixed length: 3 characters")
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_DESTINATION_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnhancedSchemeDataDestinationCountryCode() {
    return enhancedSchemeDataDestinationCountryCode;
  }


  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_DESTINATION_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedSchemeDataDestinationCountryCode(String enhancedSchemeDataDestinationCountryCode) {
    this.enhancedSchemeDataDestinationCountryCode = enhancedSchemeDataDestinationCountryCode;
  }


  public AdditionalDataLevel23 enhancedSchemeDataDestinationPostalCode(String enhancedSchemeDataDestinationPostalCode) {
    this.enhancedSchemeDataDestinationPostalCode = enhancedSchemeDataDestinationPostalCode;
    return this;
  }

   /**
   * The postal code of the destination address.  Encoding: ASCII  Max length: 10 characters  Must not start with a space
   * @return enhancedSchemeDataDestinationPostalCode
  **/
  @ApiModelProperty(value = "The postal code of the destination address.  Encoding: ASCII  Max length: 10 characters  Must not start with a space")
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_DESTINATION_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnhancedSchemeDataDestinationPostalCode() {
    return enhancedSchemeDataDestinationPostalCode;
  }


  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_DESTINATION_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedSchemeDataDestinationPostalCode(String enhancedSchemeDataDestinationPostalCode) {
    this.enhancedSchemeDataDestinationPostalCode = enhancedSchemeDataDestinationPostalCode;
  }


  public AdditionalDataLevel23 enhancedSchemeDataDestinationStateProvinceCode(String enhancedSchemeDataDestinationStateProvinceCode) {
    this.enhancedSchemeDataDestinationStateProvinceCode = enhancedSchemeDataDestinationStateProvinceCode;
    return this;
  }

   /**
   * Destination state or province code.  Encoding: ASCII  Max length: 3 characters  Must not start with a space
   * @return enhancedSchemeDataDestinationStateProvinceCode
  **/
  @ApiModelProperty(value = "Destination state or province code.  Encoding: ASCII  Max length: 3 characters  Must not start with a space")
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_DESTINATION_STATE_PROVINCE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnhancedSchemeDataDestinationStateProvinceCode() {
    return enhancedSchemeDataDestinationStateProvinceCode;
  }


  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_DESTINATION_STATE_PROVINCE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedSchemeDataDestinationStateProvinceCode(String enhancedSchemeDataDestinationStateProvinceCode) {
    this.enhancedSchemeDataDestinationStateProvinceCode = enhancedSchemeDataDestinationStateProvinceCode;
  }


  public AdditionalDataLevel23 enhancedSchemeDataDutyAmount(String enhancedSchemeDataDutyAmount) {
    this.enhancedSchemeDataDutyAmount = enhancedSchemeDataDutyAmount;
    return this;
  }

   /**
   * The duty amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes).  For example, 2000 means USD 20.00.  Encoding: Numeric  Max length: 12 characters
   * @return enhancedSchemeDataDutyAmount
  **/
  @ApiModelProperty(value = "The duty amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes).  For example, 2000 means USD 20.00.  Encoding: Numeric  Max length: 12 characters")
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_DUTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnhancedSchemeDataDutyAmount() {
    return enhancedSchemeDataDutyAmount;
  }


  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_DUTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedSchemeDataDutyAmount(String enhancedSchemeDataDutyAmount) {
    this.enhancedSchemeDataDutyAmount = enhancedSchemeDataDutyAmount;
  }


  public AdditionalDataLevel23 enhancedSchemeDataFreightAmount(String enhancedSchemeDataFreightAmount) {
    this.enhancedSchemeDataFreightAmount = enhancedSchemeDataFreightAmount;
    return this;
  }

   /**
   * The shipping amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes).  For example, 2000 means USD 20.00.  Encoding: Numeric  Max length: 12 characters
   * @return enhancedSchemeDataFreightAmount
  **/
  @ApiModelProperty(value = "The shipping amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes).  For example, 2000 means USD 20.00.  Encoding: Numeric  Max length: 12 characters")
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_FREIGHT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnhancedSchemeDataFreightAmount() {
    return enhancedSchemeDataFreightAmount;
  }


  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_FREIGHT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedSchemeDataFreightAmount(String enhancedSchemeDataFreightAmount) {
    this.enhancedSchemeDataFreightAmount = enhancedSchemeDataFreightAmount;
  }


  public AdditionalDataLevel23 enhancedSchemeDataItemDetailLineItemNrCommodityCode(String enhancedSchemeDataItemDetailLineItemNrCommodityCode) {
    this.enhancedSchemeDataItemDetailLineItemNrCommodityCode = enhancedSchemeDataItemDetailLineItemNrCommodityCode;
    return this;
  }

   /**
   * The [UNSPC commodity code](https://www.unspsc.org/) of the item.  Encoding: ASCII  Max length: 12 characters  Must not start with a space or be all spaces  Must not be all zeros
   * @return enhancedSchemeDataItemDetailLineItemNrCommodityCode
  **/
  @ApiModelProperty(value = "The [UNSPC commodity code](https://www.unspsc.org/) of the item.  Encoding: ASCII  Max length: 12 characters  Must not start with a space or be all spaces  Must not be all zeros")
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_COMMODITY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnhancedSchemeDataItemDetailLineItemNrCommodityCode() {
    return enhancedSchemeDataItemDetailLineItemNrCommodityCode;
  }


  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_COMMODITY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedSchemeDataItemDetailLineItemNrCommodityCode(String enhancedSchemeDataItemDetailLineItemNrCommodityCode) {
    this.enhancedSchemeDataItemDetailLineItemNrCommodityCode = enhancedSchemeDataItemDetailLineItemNrCommodityCode;
  }


  public AdditionalDataLevel23 enhancedSchemeDataItemDetailLineItemNrDescription(String enhancedSchemeDataItemDetailLineItemNrDescription) {
    this.enhancedSchemeDataItemDetailLineItemNrDescription = enhancedSchemeDataItemDetailLineItemNrDescription;
    return this;
  }

   /**
   * A description of the item.  Encoding: ASCII  Max length: 26 characters  Must not start with a space or be all spaces  Must not be all zeros
   * @return enhancedSchemeDataItemDetailLineItemNrDescription
  **/
  @ApiModelProperty(value = "A description of the item.  Encoding: ASCII  Max length: 26 characters  Must not start with a space or be all spaces  Must not be all zeros")
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnhancedSchemeDataItemDetailLineItemNrDescription() {
    return enhancedSchemeDataItemDetailLineItemNrDescription;
  }


  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedSchemeDataItemDetailLineItemNrDescription(String enhancedSchemeDataItemDetailLineItemNrDescription) {
    this.enhancedSchemeDataItemDetailLineItemNrDescription = enhancedSchemeDataItemDetailLineItemNrDescription;
  }


  public AdditionalDataLevel23 enhancedSchemeDataItemDetailLineItemNrDiscountAmount(String enhancedSchemeDataItemDetailLineItemNrDiscountAmount) {
    this.enhancedSchemeDataItemDetailLineItemNrDiscountAmount = enhancedSchemeDataItemDetailLineItemNrDiscountAmount;
    return this;
  }

   /**
   * The discount amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes).  For example, 2000 means USD 20.00.  Encoding: Numeric  Max length: 12 characters
   * @return enhancedSchemeDataItemDetailLineItemNrDiscountAmount
  **/
  @ApiModelProperty(value = "The discount amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes).  For example, 2000 means USD 20.00.  Encoding: Numeric  Max length: 12 characters")
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_DISCOUNT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnhancedSchemeDataItemDetailLineItemNrDiscountAmount() {
    return enhancedSchemeDataItemDetailLineItemNrDiscountAmount;
  }


  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_DISCOUNT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedSchemeDataItemDetailLineItemNrDiscountAmount(String enhancedSchemeDataItemDetailLineItemNrDiscountAmount) {
    this.enhancedSchemeDataItemDetailLineItemNrDiscountAmount = enhancedSchemeDataItemDetailLineItemNrDiscountAmount;
  }


  public AdditionalDataLevel23 enhancedSchemeDataItemDetailLineItemNrProductCode(String enhancedSchemeDataItemDetailLineItemNrProductCode) {
    this.enhancedSchemeDataItemDetailLineItemNrProductCode = enhancedSchemeDataItemDetailLineItemNrProductCode;
    return this;
  }

   /**
   * The product code.  Encoding: ASCII.  Max length: 12 characters  Must not start with a space or be all spaces  Must not be all zeros
   * @return enhancedSchemeDataItemDetailLineItemNrProductCode
  **/
  @ApiModelProperty(value = "The product code.  Encoding: ASCII.  Max length: 12 characters  Must not start with a space or be all spaces  Must not be all zeros")
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_PRODUCT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnhancedSchemeDataItemDetailLineItemNrProductCode() {
    return enhancedSchemeDataItemDetailLineItemNrProductCode;
  }


  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_PRODUCT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedSchemeDataItemDetailLineItemNrProductCode(String enhancedSchemeDataItemDetailLineItemNrProductCode) {
    this.enhancedSchemeDataItemDetailLineItemNrProductCode = enhancedSchemeDataItemDetailLineItemNrProductCode;
  }


  public AdditionalDataLevel23 enhancedSchemeDataItemDetailLineItemNrQuantity(String enhancedSchemeDataItemDetailLineItemNrQuantity) {
    this.enhancedSchemeDataItemDetailLineItemNrQuantity = enhancedSchemeDataItemDetailLineItemNrQuantity;
    return this;
  }

   /**
   * The number of items. Must be an integer greater than zero.  Encoding: Numeric  Max length: 12 characters  Must not start with a space or be all spaces  
   * @return enhancedSchemeDataItemDetailLineItemNrQuantity
  **/
  @ApiModelProperty(value = "The number of items. Must be an integer greater than zero.  Encoding: Numeric  Max length: 12 characters  Must not start with a space or be all spaces  ")
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnhancedSchemeDataItemDetailLineItemNrQuantity() {
    return enhancedSchemeDataItemDetailLineItemNrQuantity;
  }


  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedSchemeDataItemDetailLineItemNrQuantity(String enhancedSchemeDataItemDetailLineItemNrQuantity) {
    this.enhancedSchemeDataItemDetailLineItemNrQuantity = enhancedSchemeDataItemDetailLineItemNrQuantity;
  }


  public AdditionalDataLevel23 enhancedSchemeDataItemDetailLineItemNrTotalAmount(String enhancedSchemeDataItemDetailLineItemNrTotalAmount) {
    this.enhancedSchemeDataItemDetailLineItemNrTotalAmount = enhancedSchemeDataItemDetailLineItemNrTotalAmount;
    return this;
  }

   /**
   * The total amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes).  For example, 2000 means USD 20.00.  Max length: 12 characters  Must not start with a space or be all spaces  Must not be all zeros
   * @return enhancedSchemeDataItemDetailLineItemNrTotalAmount
  **/
  @ApiModelProperty(value = "The total amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes).  For example, 2000 means USD 20.00.  Max length: 12 characters  Must not start with a space or be all spaces  Must not be all zeros")
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnhancedSchemeDataItemDetailLineItemNrTotalAmount() {
    return enhancedSchemeDataItemDetailLineItemNrTotalAmount;
  }


  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedSchemeDataItemDetailLineItemNrTotalAmount(String enhancedSchemeDataItemDetailLineItemNrTotalAmount) {
    this.enhancedSchemeDataItemDetailLineItemNrTotalAmount = enhancedSchemeDataItemDetailLineItemNrTotalAmount;
  }


  public AdditionalDataLevel23 enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure(String enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure) {
    this.enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure = enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure;
    return this;
  }

   /**
   * The unit of measurement for an item.  Encoding: ASCII  Max length: 3 characters  Must not start with a space or be all spaces  Must not be all zeros
   * @return enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure
  **/
  @ApiModelProperty(value = "The unit of measurement for an item.  Encoding: ASCII  Max length: 3 characters  Must not start with a space or be all spaces  Must not be all zeros")
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_UNIT_OF_MEASURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnhancedSchemeDataItemDetailLineItemNrUnitOfMeasure() {
    return enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure;
  }


  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_UNIT_OF_MEASURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedSchemeDataItemDetailLineItemNrUnitOfMeasure(String enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure) {
    this.enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure = enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure;
  }


  public AdditionalDataLevel23 enhancedSchemeDataItemDetailLineItemNrUnitPrice(String enhancedSchemeDataItemDetailLineItemNrUnitPrice) {
    this.enhancedSchemeDataItemDetailLineItemNrUnitPrice = enhancedSchemeDataItemDetailLineItemNrUnitPrice;
    return this;
  }

   /**
   * The unit price in [minor units](https://docs.adyen.com/development-resources/currency-codes).  For example, 2000 means USD 20.00.  Encoding: Numeric  Max length: 12 characters
   * @return enhancedSchemeDataItemDetailLineItemNrUnitPrice
  **/
  @ApiModelProperty(value = "The unit price in [minor units](https://docs.adyen.com/development-resources/currency-codes).  For example, 2000 means USD 20.00.  Encoding: Numeric  Max length: 12 characters")
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_UNIT_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnhancedSchemeDataItemDetailLineItemNrUnitPrice() {
    return enhancedSchemeDataItemDetailLineItemNrUnitPrice;
  }


  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_UNIT_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedSchemeDataItemDetailLineItemNrUnitPrice(String enhancedSchemeDataItemDetailLineItemNrUnitPrice) {
    this.enhancedSchemeDataItemDetailLineItemNrUnitPrice = enhancedSchemeDataItemDetailLineItemNrUnitPrice;
  }


  public AdditionalDataLevel23 enhancedSchemeDataOrderDate(String enhancedSchemeDataOrderDate) {
    this.enhancedSchemeDataOrderDate = enhancedSchemeDataOrderDate;
    return this;
  }

   /**
   * The order date. * Format: &#x60;ddMMyy&#x60;  Encoding: ASCII  Max length: 6 characters
   * @return enhancedSchemeDataOrderDate
  **/
  @ApiModelProperty(value = "The order date. * Format: `ddMMyy`  Encoding: ASCII  Max length: 6 characters")
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_ORDER_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnhancedSchemeDataOrderDate() {
    return enhancedSchemeDataOrderDate;
  }


  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_ORDER_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedSchemeDataOrderDate(String enhancedSchemeDataOrderDate) {
    this.enhancedSchemeDataOrderDate = enhancedSchemeDataOrderDate;
  }


  public AdditionalDataLevel23 enhancedSchemeDataShipFromPostalCode(String enhancedSchemeDataShipFromPostalCode) {
    this.enhancedSchemeDataShipFromPostalCode = enhancedSchemeDataShipFromPostalCode;
    return this;
  }

   /**
   * The postal code of the address the item is shipped from.  Encoding: ASCII  Max length: 10 characters  Must not start with a space or be all spaces  Must not be all zeros
   * @return enhancedSchemeDataShipFromPostalCode
  **/
  @ApiModelProperty(value = "The postal code of the address the item is shipped from.  Encoding: ASCII  Max length: 10 characters  Must not start with a space or be all spaces  Must not be all zeros")
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_SHIP_FROM_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnhancedSchemeDataShipFromPostalCode() {
    return enhancedSchemeDataShipFromPostalCode;
  }


  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_SHIP_FROM_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedSchemeDataShipFromPostalCode(String enhancedSchemeDataShipFromPostalCode) {
    this.enhancedSchemeDataShipFromPostalCode = enhancedSchemeDataShipFromPostalCode;
  }


  public AdditionalDataLevel23 enhancedSchemeDataTotalTaxAmount(String enhancedSchemeDataTotalTaxAmount) {
    this.enhancedSchemeDataTotalTaxAmount = enhancedSchemeDataTotalTaxAmount;
    return this;
  }

   /**
   * The total tax amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes).  For example, 2000 means USD 20.00.  Encoding: Numeric  Max length: 12 characters  
   * @return enhancedSchemeDataTotalTaxAmount
  **/
  @ApiModelProperty(value = "The total tax amount, in [minor units](https://docs.adyen.com/development-resources/currency-codes).  For example, 2000 means USD 20.00.  Encoding: Numeric  Max length: 12 characters  ")
  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_TOTAL_TAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnhancedSchemeDataTotalTaxAmount() {
    return enhancedSchemeDataTotalTaxAmount;
  }


  @JsonProperty(JSON_PROPERTY_ENHANCED_SCHEME_DATA_TOTAL_TAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhancedSchemeDataTotalTaxAmount(String enhancedSchemeDataTotalTaxAmount) {
    this.enhancedSchemeDataTotalTaxAmount = enhancedSchemeDataTotalTaxAmount;
  }


  /**
   * Return true if this AdditionalDataLevel23 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalDataLevel23 additionalDataLevel23 = (AdditionalDataLevel23) o;
    return Objects.equals(this.enhancedSchemeDataCustomerReference, additionalDataLevel23.enhancedSchemeDataCustomerReference) &&
        Objects.equals(this.enhancedSchemeDataDestinationCountryCode, additionalDataLevel23.enhancedSchemeDataDestinationCountryCode) &&
        Objects.equals(this.enhancedSchemeDataDestinationPostalCode, additionalDataLevel23.enhancedSchemeDataDestinationPostalCode) &&
        Objects.equals(this.enhancedSchemeDataDestinationStateProvinceCode, additionalDataLevel23.enhancedSchemeDataDestinationStateProvinceCode) &&
        Objects.equals(this.enhancedSchemeDataDutyAmount, additionalDataLevel23.enhancedSchemeDataDutyAmount) &&
        Objects.equals(this.enhancedSchemeDataFreightAmount, additionalDataLevel23.enhancedSchemeDataFreightAmount) &&
        Objects.equals(this.enhancedSchemeDataItemDetailLineItemNrCommodityCode, additionalDataLevel23.enhancedSchemeDataItemDetailLineItemNrCommodityCode) &&
        Objects.equals(this.enhancedSchemeDataItemDetailLineItemNrDescription, additionalDataLevel23.enhancedSchemeDataItemDetailLineItemNrDescription) &&
        Objects.equals(this.enhancedSchemeDataItemDetailLineItemNrDiscountAmount, additionalDataLevel23.enhancedSchemeDataItemDetailLineItemNrDiscountAmount) &&
        Objects.equals(this.enhancedSchemeDataItemDetailLineItemNrProductCode, additionalDataLevel23.enhancedSchemeDataItemDetailLineItemNrProductCode) &&
        Objects.equals(this.enhancedSchemeDataItemDetailLineItemNrQuantity, additionalDataLevel23.enhancedSchemeDataItemDetailLineItemNrQuantity) &&
        Objects.equals(this.enhancedSchemeDataItemDetailLineItemNrTotalAmount, additionalDataLevel23.enhancedSchemeDataItemDetailLineItemNrTotalAmount) &&
        Objects.equals(this.enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure, additionalDataLevel23.enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure) &&
        Objects.equals(this.enhancedSchemeDataItemDetailLineItemNrUnitPrice, additionalDataLevel23.enhancedSchemeDataItemDetailLineItemNrUnitPrice) &&
        Objects.equals(this.enhancedSchemeDataOrderDate, additionalDataLevel23.enhancedSchemeDataOrderDate) &&
        Objects.equals(this.enhancedSchemeDataShipFromPostalCode, additionalDataLevel23.enhancedSchemeDataShipFromPostalCode) &&
        Objects.equals(this.enhancedSchemeDataTotalTaxAmount, additionalDataLevel23.enhancedSchemeDataTotalTaxAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enhancedSchemeDataCustomerReference, enhancedSchemeDataDestinationCountryCode, enhancedSchemeDataDestinationPostalCode, enhancedSchemeDataDestinationStateProvinceCode, enhancedSchemeDataDutyAmount, enhancedSchemeDataFreightAmount, enhancedSchemeDataItemDetailLineItemNrCommodityCode, enhancedSchemeDataItemDetailLineItemNrDescription, enhancedSchemeDataItemDetailLineItemNrDiscountAmount, enhancedSchemeDataItemDetailLineItemNrProductCode, enhancedSchemeDataItemDetailLineItemNrQuantity, enhancedSchemeDataItemDetailLineItemNrTotalAmount, enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure, enhancedSchemeDataItemDetailLineItemNrUnitPrice, enhancedSchemeDataOrderDate, enhancedSchemeDataShipFromPostalCode, enhancedSchemeDataTotalTaxAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalDataLevel23 {\n");
    sb.append("    enhancedSchemeDataCustomerReference: ").append(toIndentedString(enhancedSchemeDataCustomerReference)).append("\n");
    sb.append("    enhancedSchemeDataDestinationCountryCode: ").append(toIndentedString(enhancedSchemeDataDestinationCountryCode)).append("\n");
    sb.append("    enhancedSchemeDataDestinationPostalCode: ").append(toIndentedString(enhancedSchemeDataDestinationPostalCode)).append("\n");
    sb.append("    enhancedSchemeDataDestinationStateProvinceCode: ").append(toIndentedString(enhancedSchemeDataDestinationStateProvinceCode)).append("\n");
    sb.append("    enhancedSchemeDataDutyAmount: ").append(toIndentedString(enhancedSchemeDataDutyAmount)).append("\n");
    sb.append("    enhancedSchemeDataFreightAmount: ").append(toIndentedString(enhancedSchemeDataFreightAmount)).append("\n");
    sb.append("    enhancedSchemeDataItemDetailLineItemNrCommodityCode: ").append(toIndentedString(enhancedSchemeDataItemDetailLineItemNrCommodityCode)).append("\n");
    sb.append("    enhancedSchemeDataItemDetailLineItemNrDescription: ").append(toIndentedString(enhancedSchemeDataItemDetailLineItemNrDescription)).append("\n");
    sb.append("    enhancedSchemeDataItemDetailLineItemNrDiscountAmount: ").append(toIndentedString(enhancedSchemeDataItemDetailLineItemNrDiscountAmount)).append("\n");
    sb.append("    enhancedSchemeDataItemDetailLineItemNrProductCode: ").append(toIndentedString(enhancedSchemeDataItemDetailLineItemNrProductCode)).append("\n");
    sb.append("    enhancedSchemeDataItemDetailLineItemNrQuantity: ").append(toIndentedString(enhancedSchemeDataItemDetailLineItemNrQuantity)).append("\n");
    sb.append("    enhancedSchemeDataItemDetailLineItemNrTotalAmount: ").append(toIndentedString(enhancedSchemeDataItemDetailLineItemNrTotalAmount)).append("\n");
    sb.append("    enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure: ").append(toIndentedString(enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure)).append("\n");
    sb.append("    enhancedSchemeDataItemDetailLineItemNrUnitPrice: ").append(toIndentedString(enhancedSchemeDataItemDetailLineItemNrUnitPrice)).append("\n");
    sb.append("    enhancedSchemeDataOrderDate: ").append(toIndentedString(enhancedSchemeDataOrderDate)).append("\n");
    sb.append("    enhancedSchemeDataShipFromPostalCode: ").append(toIndentedString(enhancedSchemeDataShipFromPostalCode)).append("\n");
    sb.append("    enhancedSchemeDataTotalTaxAmount: ").append(toIndentedString(enhancedSchemeDataTotalTaxAmount)).append("\n");
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
   * Create an instance of AdditionalDataLevel23 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdditionalDataLevel23
   * @throws JsonProcessingException if the JSON string is invalid with respect to AdditionalDataLevel23
   */
  public static AdditionalDataLevel23 fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AdditionalDataLevel23.class);
  }
/**
  * Convert an instance of AdditionalDataLevel23 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

