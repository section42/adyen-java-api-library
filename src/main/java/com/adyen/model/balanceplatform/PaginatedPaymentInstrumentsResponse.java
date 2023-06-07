/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.balanceplatform.PaymentInstrument;
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
 * PaginatedPaymentInstrumentsResponse
 */
@JsonPropertyOrder({
  PaginatedPaymentInstrumentsResponse.JSON_PROPERTY_HAS_NEXT,
  PaginatedPaymentInstrumentsResponse.JSON_PROPERTY_HAS_PREVIOUS,
  PaginatedPaymentInstrumentsResponse.JSON_PROPERTY_PAYMENT_INSTRUMENTS
})

public class PaginatedPaymentInstrumentsResponse {
  public static final String JSON_PROPERTY_HAS_NEXT = "hasNext";
  private Boolean hasNext;

  public static final String JSON_PROPERTY_HAS_PREVIOUS = "hasPrevious";
  private Boolean hasPrevious;

  public static final String JSON_PROPERTY_PAYMENT_INSTRUMENTS = "paymentInstruments";
  private List<PaymentInstrument> paymentInstruments = new ArrayList<>();

  public PaginatedPaymentInstrumentsResponse() { 
  }

  public PaginatedPaymentInstrumentsResponse hasNext(Boolean hasNext) {
    this.hasNext = hasNext;
    return this;
  }

   /**
   * Indicates whether there are more items on the next page.
   * @return hasNext
  **/
  @ApiModelProperty(required = true, value = "Indicates whether there are more items on the next page.")
  @JsonProperty(JSON_PROPERTY_HAS_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasNext() {
    return hasNext;
  }


  @JsonProperty(JSON_PROPERTY_HAS_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasNext(Boolean hasNext) {
    this.hasNext = hasNext;
  }


  public PaginatedPaymentInstrumentsResponse hasPrevious(Boolean hasPrevious) {
    this.hasPrevious = hasPrevious;
    return this;
  }

   /**
   * Indicates whether there are more items on the previous page.
   * @return hasPrevious
  **/
  @ApiModelProperty(required = true, value = "Indicates whether there are more items on the previous page.")
  @JsonProperty(JSON_PROPERTY_HAS_PREVIOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasPrevious() {
    return hasPrevious;
  }


  @JsonProperty(JSON_PROPERTY_HAS_PREVIOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasPrevious(Boolean hasPrevious) {
    this.hasPrevious = hasPrevious;
  }


  public PaginatedPaymentInstrumentsResponse paymentInstruments(List<PaymentInstrument> paymentInstruments) {
    this.paymentInstruments = paymentInstruments;
    return this;
  }

  public PaginatedPaymentInstrumentsResponse addPaymentInstrumentsItem(PaymentInstrument paymentInstrumentsItem) {
    this.paymentInstruments.add(paymentInstrumentsItem);
    return this;
  }

   /**
   * List of payment instruments associated with the balance account.
   * @return paymentInstruments
  **/
  @ApiModelProperty(required = true, value = "List of payment instruments associated with the balance account.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PaymentInstrument> getPaymentInstruments() {
    return paymentInstruments;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentInstruments(List<PaymentInstrument> paymentInstruments) {
    this.paymentInstruments = paymentInstruments;
  }


  /**
   * Return true if this PaginatedPaymentInstrumentsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedPaymentInstrumentsResponse paginatedPaymentInstrumentsResponse = (PaginatedPaymentInstrumentsResponse) o;
    return Objects.equals(this.hasNext, paginatedPaymentInstrumentsResponse.hasNext) &&
        Objects.equals(this.hasPrevious, paginatedPaymentInstrumentsResponse.hasPrevious) &&
        Objects.equals(this.paymentInstruments, paginatedPaymentInstrumentsResponse.paymentInstruments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasNext, hasPrevious, paymentInstruments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedPaymentInstrumentsResponse {\n");
    sb.append("    hasNext: ").append(toIndentedString(hasNext)).append("\n");
    sb.append("    hasPrevious: ").append(toIndentedString(hasPrevious)).append("\n");
    sb.append("    paymentInstruments: ").append(toIndentedString(paymentInstruments)).append("\n");
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
   * Create an instance of PaginatedPaymentInstrumentsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaginatedPaymentInstrumentsResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaginatedPaymentInstrumentsResponse
   */
  public static PaginatedPaymentInstrumentsResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaginatedPaymentInstrumentsResponse.class);
  }
/**
  * Convert an instance of PaginatedPaymentInstrumentsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

