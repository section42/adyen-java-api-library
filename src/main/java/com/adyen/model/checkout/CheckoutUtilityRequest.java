/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.adyen.service.JSON;


/**
 * CheckoutUtilityRequest
 */
@JsonPropertyOrder({
  CheckoutUtilityRequest.JSON_PROPERTY_ORIGIN_DOMAINS
})

public class CheckoutUtilityRequest {
  public static final String JSON_PROPERTY_ORIGIN_DOMAINS = "originDomains";
  private List<String> originDomains = new ArrayList<>();

  public CheckoutUtilityRequest() { 
  }

  public CheckoutUtilityRequest originDomains(List<String> originDomains) {
    this.originDomains = originDomains;
    return this;
  }

  public CheckoutUtilityRequest addOriginDomainsItem(String originDomainsItem) {
    this.originDomains.add(originDomainsItem);
    return this;
  }

   /**
   * The list of origin domains, for which origin keys are requested.
   * @return originDomains
  **/
  @ApiModelProperty(required = true, value = "The list of origin domains, for which origin keys are requested.")
  @JsonProperty(JSON_PROPERTY_ORIGIN_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getOriginDomains() {
    return originDomains;
  }


  @JsonProperty(JSON_PROPERTY_ORIGIN_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOriginDomains(List<String> originDomains) {
    this.originDomains = originDomains;
  }


  /**
   * Return true if this CheckoutUtilityRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutUtilityRequest checkoutUtilityRequest = (CheckoutUtilityRequest) o;
    return Objects.equals(this.originDomains, checkoutUtilityRequest.originDomains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originDomains);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutUtilityRequest {\n");
    sb.append("    originDomains: ").append(toIndentedString(originDomains)).append("\n");
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
   * Create an instance of CheckoutUtilityRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CheckoutUtilityRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to CheckoutUtilityRequest
   */
  public static CheckoutUtilityRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CheckoutUtilityRequest.class);
  }
/**
  * Convert an instance of CheckoutUtilityRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

