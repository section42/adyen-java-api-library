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
import com.adyen.model.management.CustomNotification;
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
 * TestCompanyWebhookRequest
 */
@JsonPropertyOrder({
  TestCompanyWebhookRequest.JSON_PROPERTY_MERCHANT_IDS,
  TestCompanyWebhookRequest.JSON_PROPERTY_NOTIFICATION,
  TestCompanyWebhookRequest.JSON_PROPERTY_TYPES
})

public class TestCompanyWebhookRequest {
  public static final String JSON_PROPERTY_MERCHANT_IDS = "merchantIds";
  private List<String> merchantIds = null;

  public static final String JSON_PROPERTY_NOTIFICATION = "notification";
  private CustomNotification notification;

  public static final String JSON_PROPERTY_TYPES = "types";
  private List<String> types = null;

  public TestCompanyWebhookRequest() { 
  }

  public TestCompanyWebhookRequest merchantIds(List<String> merchantIds) {
    this.merchantIds = merchantIds;
    return this;
  }

  public TestCompanyWebhookRequest addMerchantIdsItem(String merchantIdsItem) {
    if (this.merchantIds == null) {
      this.merchantIds = new ArrayList<>();
    }
    this.merchantIds.add(merchantIdsItem);
    return this;
  }

   /**
   * List of &#x60;merchantId&#x60; values for which test webhooks will be sent. The list can have a maximum of 20 &#x60;merchantId&#x60; values.  If not specified, we send sample notifications to all the merchant accounts that the webhook is configured for. If this is more than 20 merchant accounts, use this list to specify a subset of the merchant accounts for which to send test notifications.
   * @return merchantIds
  **/
  @ApiModelProperty(value = "List of `merchantId` values for which test webhooks will be sent. The list can have a maximum of 20 `merchantId` values.  If not specified, we send sample notifications to all the merchant accounts that the webhook is configured for. If this is more than 20 merchant accounts, use this list to specify a subset of the merchant accounts for which to send test notifications.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMerchantIds() {
    return merchantIds;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantIds(List<String> merchantIds) {
    this.merchantIds = merchantIds;
  }


  public TestCompanyWebhookRequest notification(CustomNotification notification) {
    this.notification = notification;
    return this;
  }

   /**
   * Get notification
   * @return notification
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NOTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomNotification getNotification() {
    return notification;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotification(CustomNotification notification) {
    this.notification = notification;
  }


  public TestCompanyWebhookRequest types(List<String> types) {
    this.types = types;
    return this;
  }

  public TestCompanyWebhookRequest addTypesItem(String typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * List of event codes for which to send test notifications. Only the webhook types below are supported.   Possible values if webhook &#x60;type&#x60;: **standard**:  * **AUTHORISATION** * **CHARGEBACK_REVERSED** * **ORDER_CLOSED** * **ORDER_OPENED** * **PAIDOUT_REVERSED** * **PAYOUT_THIRDPARTY** * **REFUNDED_REVERSED** * **REFUND_WITH_DATA** * **REPORT_AVAILABLE** * **CUSTOM** - set your custom notification fields in the [&#x60;notification&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/companies/{companyId}/webhooks/{webhookId}/test__reqParam_notification) object.  Possible values if webhook &#x60;type&#x60;: **banktransfer-notification**:  * **PENDING**  Possible values if webhook &#x60;type&#x60;: **report-notification**:  * **REPORT_AVAILABLE**  Possible values if webhook &#x60;type&#x60;: **ideal-notification**:  * **AUTHORISATION**  Possible values if webhook &#x60;type&#x60;: **pending-notification**:  * **PENDING** 
   * @return types
  **/
  @ApiModelProperty(value = "List of event codes for which to send test notifications. Only the webhook types below are supported.   Possible values if webhook `type`: **standard**:  * **AUTHORISATION** * **CHARGEBACK_REVERSED** * **ORDER_CLOSED** * **ORDER_OPENED** * **PAIDOUT_REVERSED** * **PAYOUT_THIRDPARTY** * **REFUNDED_REVERSED** * **REFUND_WITH_DATA** * **REPORT_AVAILABLE** * **CUSTOM** - set your custom notification fields in the [`notification`](https://docs.adyen.com/api-explorer/#/ManagementService/v1/post/companies/{companyId}/webhooks/{webhookId}/test__reqParam_notification) object.  Possible values if webhook `type`: **banktransfer-notification**:  * **PENDING**  Possible values if webhook `type`: **report-notification**:  * **REPORT_AVAILABLE**  Possible values if webhook `type`: **ideal-notification**:  * **AUTHORISATION**  Possible values if webhook `type`: **pending-notification**:  * **PENDING** ")
  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTypes() {
    return types;
  }


  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypes(List<String> types) {
    this.types = types;
  }


  /**
   * Return true if this TestCompanyWebhookRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestCompanyWebhookRequest testCompanyWebhookRequest = (TestCompanyWebhookRequest) o;
    return Objects.equals(this.merchantIds, testCompanyWebhookRequest.merchantIds) &&
        Objects.equals(this.notification, testCompanyWebhookRequest.notification) &&
        Objects.equals(this.types, testCompanyWebhookRequest.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantIds, notification, types);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestCompanyWebhookRequest {\n");
    sb.append("    merchantIds: ").append(toIndentedString(merchantIds)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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
   * Create an instance of TestCompanyWebhookRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TestCompanyWebhookRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to TestCompanyWebhookRequest
   */
  public static TestCompanyWebhookRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TestCompanyWebhookRequest.class);
  }
/**
  * Convert an instance of TestCompanyWebhookRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

