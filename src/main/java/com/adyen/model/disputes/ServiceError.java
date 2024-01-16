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
 * ServiceError
 */
@JsonPropertyOrder({
  ServiceError.JSON_PROPERTY_ERROR_CODE,
  ServiceError.JSON_PROPERTY_ERROR_TYPE,
  ServiceError.JSON_PROPERTY_MESSAGE,
  ServiceError.JSON_PROPERTY_PSP_REFERENCE,
  ServiceError.JSON_PROPERTY_STATUS
})

public class ServiceError {
  public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
  private String errorCode;

  public static final String JSON_PROPERTY_ERROR_TYPE = "errorType";
  private String errorType;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_PSP_REFERENCE = "pspReference";
  private String pspReference;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public ServiceError() { 
  }

  public ServiceError errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * The error code mapped to the error message.
   * @return errorCode
  **/
  @ApiModelProperty(value = "The error code mapped to the error message.")
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorCode() {
    return errorCode;
  }


 /**
  * The error code mapped to the error message.
  *
  * @param errorCode
  */ 
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public ServiceError errorType(String errorType) {
    this.errorType = errorType;
    return this;
  }

   /**
   * The category of the error.
   * @return errorType
  **/
  @ApiModelProperty(value = "The category of the error.")
  @JsonProperty(JSON_PROPERTY_ERROR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorType() {
    return errorType;
  }


 /**
  * The category of the error.
  *
  * @param errorType
  */ 
  @JsonProperty(JSON_PROPERTY_ERROR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }


  public ServiceError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A short explanation of the issue.
   * @return message
  **/
  @ApiModelProperty(value = "A short explanation of the issue.")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


 /**
  * A short explanation of the issue.
  *
  * @param message
  */ 
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public ServiceError pspReference(String pspReference) {
    this.pspReference = pspReference;
    return this;
  }

   /**
   * The PSP reference of the payment.
   * @return pspReference
  **/
  @ApiModelProperty(value = "The PSP reference of the payment.")
  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPspReference() {
    return pspReference;
  }


 /**
  * The PSP reference of the payment.
  *
  * @param pspReference
  */ 
  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }


  public ServiceError status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * The HTTP response status.
   * @return status
  **/
  @ApiModelProperty(value = "The HTTP response status.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatus() {
    return status;
  }


 /**
  * The HTTP response status.
  *
  * @param status
  */ 
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Integer status) {
    this.status = status;
  }


  /**
   * Return true if this ServiceError object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceError serviceError = (ServiceError) o;
    return Objects.equals(this.errorCode, serviceError.errorCode) &&
        Objects.equals(this.errorType, serviceError.errorType) &&
        Objects.equals(this.message, serviceError.message) &&
        Objects.equals(this.pspReference, serviceError.pspReference) &&
        Objects.equals(this.status, serviceError.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorType, message, pspReference, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceError {\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
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
   * Create an instance of ServiceError given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ServiceError
   * @throws JsonProcessingException if the JSON string is invalid with respect to ServiceError
   */
  public static ServiceError fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ServiceError.class);
  }
/**
  * Convert an instance of ServiceError to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

