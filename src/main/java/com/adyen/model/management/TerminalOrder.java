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
import com.adyen.model.management.BillingEntity;
import com.adyen.model.management.OrderItem;
import com.adyen.model.management.ShippingLocation;
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
 * TerminalOrder
 */
@JsonPropertyOrder({
  TerminalOrder.JSON_PROPERTY_BILLING_ENTITY,
  TerminalOrder.JSON_PROPERTY_CUSTOMER_ORDER_REFERENCE,
  TerminalOrder.JSON_PROPERTY_ID,
  TerminalOrder.JSON_PROPERTY_ITEMS,
  TerminalOrder.JSON_PROPERTY_ORDER_DATE,
  TerminalOrder.JSON_PROPERTY_SHIPPING_LOCATION,
  TerminalOrder.JSON_PROPERTY_STATUS,
  TerminalOrder.JSON_PROPERTY_TRACKING_URL
})

public class TerminalOrder {
  public static final String JSON_PROPERTY_BILLING_ENTITY = "billingEntity";
  private BillingEntity billingEntity;

  public static final String JSON_PROPERTY_CUSTOMER_ORDER_REFERENCE = "customerOrderReference";
  private String customerOrderReference;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<OrderItem> items = null;

  public static final String JSON_PROPERTY_ORDER_DATE = "orderDate";
  private String orderDate;

  public static final String JSON_PROPERTY_SHIPPING_LOCATION = "shippingLocation";
  private ShippingLocation shippingLocation;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TRACKING_URL = "trackingUrl";
  private String trackingUrl;

  public TerminalOrder() { 
  }

  public TerminalOrder billingEntity(BillingEntity billingEntity) {
    this.billingEntity = billingEntity;
    return this;
  }

   /**
   * Get billingEntity
   * @return billingEntity
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BILLING_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BillingEntity getBillingEntity() {
    return billingEntity;
  }


 /**
  * billingEntity
  *
  * @param billingEntity
  */ 
  @JsonProperty(JSON_PROPERTY_BILLING_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingEntity(BillingEntity billingEntity) {
    this.billingEntity = billingEntity;
  }


  public TerminalOrder customerOrderReference(String customerOrderReference) {
    this.customerOrderReference = customerOrderReference;
    return this;
  }

   /**
   * The merchant-defined purchase order number. This will be printed on the packing list.
   * @return customerOrderReference
  **/
  @ApiModelProperty(value = "The merchant-defined purchase order number. This will be printed on the packing list.")
  @JsonProperty(JSON_PROPERTY_CUSTOMER_ORDER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerOrderReference() {
    return customerOrderReference;
  }


 /**
  * The merchant-defined purchase order number. This will be printed on the packing list.
  *
  * @param customerOrderReference
  */ 
  @JsonProperty(JSON_PROPERTY_CUSTOMER_ORDER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerOrderReference(String customerOrderReference) {
    this.customerOrderReference = customerOrderReference;
  }


  public TerminalOrder id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the order.
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier of the order.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


 /**
  * The unique identifier of the order.
  *
  * @param id
  */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public TerminalOrder items(List<OrderItem> items) {
    this.items = items;
    return this;
  }

  public TerminalOrder addItemsItem(OrderItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * The products included in the order.
   * @return items
  **/
  @ApiModelProperty(value = "The products included in the order.")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OrderItem> getItems() {
    return items;
  }


 /**
  * The products included in the order.
  *
  * @param items
  */ 
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<OrderItem> items) {
    this.items = items;
  }


  public TerminalOrder orderDate(String orderDate) {
    this.orderDate = orderDate;
    return this;
  }

   /**
   * The date and time that the order was placed, in UTC ISO 8601 format. For example, \&quot;2011-12-03T10:15:30Z\&quot;.
   * @return orderDate
  **/
  @ApiModelProperty(value = "The date and time that the order was placed, in UTC ISO 8601 format. For example, \"2011-12-03T10:15:30Z\".")
  @JsonProperty(JSON_PROPERTY_ORDER_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrderDate() {
    return orderDate;
  }


 /**
  * The date and time that the order was placed, in UTC ISO 8601 format. For example, \&quot;2011-12-03T10:15:30Z\&quot;.
  *
  * @param orderDate
  */ 
  @JsonProperty(JSON_PROPERTY_ORDER_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderDate(String orderDate) {
    this.orderDate = orderDate;
  }


  public TerminalOrder shippingLocation(ShippingLocation shippingLocation) {
    this.shippingLocation = shippingLocation;
    return this;
  }

   /**
   * Get shippingLocation
   * @return shippingLocation
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHIPPING_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShippingLocation getShippingLocation() {
    return shippingLocation;
  }


 /**
  * shippingLocation
  *
  * @param shippingLocation
  */ 
  @JsonProperty(JSON_PROPERTY_SHIPPING_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingLocation(ShippingLocation shippingLocation) {
    this.shippingLocation = shippingLocation;
  }


  public TerminalOrder status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The processing status of the order.
   * @return status
  **/
  @ApiModelProperty(value = "The processing status of the order.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


 /**
  * The processing status of the order.
  *
  * @param status
  */ 
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public TerminalOrder trackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }

   /**
   * The URL, provided by the carrier company, where the shipment can be tracked.
   * @return trackingUrl
  **/
  @ApiModelProperty(value = "The URL, provided by the carrier company, where the shipment can be tracked.")
  @JsonProperty(JSON_PROPERTY_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTrackingUrl() {
    return trackingUrl;
  }


 /**
  * The URL, provided by the carrier company, where the shipment can be tracked.
  *
  * @param trackingUrl
  */ 
  @JsonProperty(JSON_PROPERTY_TRACKING_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }


  /**
   * Return true if this TerminalOrder object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalOrder terminalOrder = (TerminalOrder) o;
    return Objects.equals(this.billingEntity, terminalOrder.billingEntity) &&
        Objects.equals(this.customerOrderReference, terminalOrder.customerOrderReference) &&
        Objects.equals(this.id, terminalOrder.id) &&
        Objects.equals(this.items, terminalOrder.items) &&
        Objects.equals(this.orderDate, terminalOrder.orderDate) &&
        Objects.equals(this.shippingLocation, terminalOrder.shippingLocation) &&
        Objects.equals(this.status, terminalOrder.status) &&
        Objects.equals(this.trackingUrl, terminalOrder.trackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingEntity, customerOrderReference, id, items, orderDate, shippingLocation, status, trackingUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalOrder {\n");
    sb.append("    billingEntity: ").append(toIndentedString(billingEntity)).append("\n");
    sb.append("    customerOrderReference: ").append(toIndentedString(customerOrderReference)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    shippingLocation: ").append(toIndentedString(shippingLocation)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
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
   * Create an instance of TerminalOrder given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TerminalOrder
   * @throws JsonProcessingException if the JSON string is invalid with respect to TerminalOrder
   */
  public static TerminalOrder fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TerminalOrder.class);
  }
/**
  * Convert an instance of TerminalOrder to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

