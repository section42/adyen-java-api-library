/*
 * Disputes API
 * You can use the [Disputes API](https://docs.adyen.com/risk-management/disputes-api) to automate the dispute handling process so that you can respond to disputes and chargebacks as soon as they are initiated. The Disputes API lets you retrieve defense reasons, supply and delete defense documents, and accept or defend disputes.  ## Authentication Each request to the Disputes API must be signed with an API key. For this, obtain an API Key from your Customer Area, as described in [How to get the API key](https://docs.adyen.com/development-resources/api-credentials#generate-api-key). Then set this key to the `X-API-Key` header value, for example:  ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: Your_API_key\" \\ ... ``` Note that when going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning Disputes API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://ca-test.adyen.com/ca/services/DisputeService/v30/defendDispute ```
 *
 * The version of the OpenAPI document: 30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.disputes;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.disputes.DisputeServiceResult;
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
 * SupplyDefenseDocumentResponse
 */
@JsonPropertyOrder({
  SupplyDefenseDocumentResponse.JSON_PROPERTY_DISPUTE_SERVICE_RESULT
})

public class SupplyDefenseDocumentResponse {
  public static final String JSON_PROPERTY_DISPUTE_SERVICE_RESULT = "disputeServiceResult";
  private DisputeServiceResult disputeServiceResult;

  public SupplyDefenseDocumentResponse() { 
  }

  public SupplyDefenseDocumentResponse disputeServiceResult(DisputeServiceResult disputeServiceResult) {
    this.disputeServiceResult = disputeServiceResult;
    return this;
  }

   /**
   * Get disputeServiceResult
   * @return disputeServiceResult
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DISPUTE_SERVICE_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DisputeServiceResult getDisputeServiceResult() {
    return disputeServiceResult;
  }


 /**
  * disputeServiceResult
  *
  * @param disputeServiceResult
  */ 
  @JsonProperty(JSON_PROPERTY_DISPUTE_SERVICE_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisputeServiceResult(DisputeServiceResult disputeServiceResult) {
    this.disputeServiceResult = disputeServiceResult;
  }


  /**
   * Return true if this SupplyDefenseDocumentResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupplyDefenseDocumentResponse supplyDefenseDocumentResponse = (SupplyDefenseDocumentResponse) o;
    return Objects.equals(this.disputeServiceResult, supplyDefenseDocumentResponse.disputeServiceResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disputeServiceResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplyDefenseDocumentResponse {\n");
    sb.append("    disputeServiceResult: ").append(toIndentedString(disputeServiceResult)).append("\n");
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
   * Create an instance of SupplyDefenseDocumentResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SupplyDefenseDocumentResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to SupplyDefenseDocumentResponse
   */
  public static SupplyDefenseDocumentResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, SupplyDefenseDocumentResponse.class);
  }
/**
  * Convert an instance of SupplyDefenseDocumentResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

