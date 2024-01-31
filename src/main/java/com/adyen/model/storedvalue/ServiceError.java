/*
 * Adyen Stored Value API
 *
 * The version of the OpenAPI document: 46
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.storedvalue;

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * ServiceError
 */
@JsonPropertyOrder({
  ServiceError.JSON_PROPERTY_ADDITIONAL_DATA,
  ServiceError.JSON_PROPERTY_ERROR_CODE,
  ServiceError.JSON_PROPERTY_ERROR_TYPE,
  ServiceError.JSON_PROPERTY_MESSAGE,
  ServiceError.JSON_PROPERTY_PSP_REFERENCE,
  ServiceError.JSON_PROPERTY_STATUS
})

public class ServiceError {
  public static final String JSON_PROPERTY_ADDITIONAL_DATA = "additionalData";
  private Map<String, String> additionalData = null;

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

  public ServiceError additionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
    return this;
  }

  public ServiceError putAdditionalDataItem(String key, String additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new HashMap<>();
    }
    this.additionalData.put(key, additionalDataItem);
    return this;
  }

   /**
   * Contains additional information about the payment. Some data fields are included only if you select them first. Go to **Customer Area** &gt; **Developers** &gt; **Additional data**.
   * @return additionalData
  **/
  @ApiModelProperty(value = "Contains additional information about the payment. Some data fields are included only if you select them first. Go to **Customer Area** > **Developers** > **Additional data**.")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getAdditionalData() {
    return additionalData;
  }


 /**
  * Contains additional information about the payment. Some data fields are included only if you select them first. Go to **Customer Area** &gt; **Developers** &gt; **Additional data**.
  *
  * @param additionalData
  */ 
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
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
    return Objects.equals(this.additionalData, serviceError.additionalData) &&
        Objects.equals(this.errorCode, serviceError.errorCode) &&
        Objects.equals(this.errorType, serviceError.errorType) &&
        Objects.equals(this.message, serviceError.message) &&
        Objects.equals(this.pspReference, serviceError.pspReference) &&
        Objects.equals(this.status, serviceError.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, errorCode, errorType, message, pspReference, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceError {\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
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

