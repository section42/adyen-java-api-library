/*
 * Adyen Payment API
 * A set of API endpoints that allow you to initiate, settle, and modify payments on the Adyen payments platform. You can use the API to accept card payments (including One-Click and 3D Secure), bank transfers, ewallets, and many other payment methods.  To learn more about the API, visit [Classic integration](https://docs.adyen.com/classic-integration).  ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning Payments API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/Payment/v68/authorise ```  ## Going live  To authenticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/Payment/v68/authorise ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 68
 * 
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
 * AdditionalDataModifications
 */
@JsonPropertyOrder({
  AdditionalDataModifications.JSON_PROPERTY_INSTALLMENT_PAYMENT_DATA_SELECTED_INSTALLMENT_OPTION
})

public class AdditionalDataModifications {
  public static final String JSON_PROPERTY_INSTALLMENT_PAYMENT_DATA_SELECTED_INSTALLMENT_OPTION = "installmentPaymentData.selectedInstallmentOption";
  private String installmentPaymentDataSelectedInstallmentOption;

  public AdditionalDataModifications() { 
  }

  public AdditionalDataModifications installmentPaymentDataSelectedInstallmentOption(String installmentPaymentDataSelectedInstallmentOption) {
    this.installmentPaymentDataSelectedInstallmentOption = installmentPaymentDataSelectedInstallmentOption;
    return this;
  }

   /**
   * This is the installment option selected by the shopper. It is required only if specified by the user.
   * @return installmentPaymentDataSelectedInstallmentOption
  **/
  @ApiModelProperty(value = "This is the installment option selected by the shopper. It is required only if specified by the user.")
  @JsonProperty(JSON_PROPERTY_INSTALLMENT_PAYMENT_DATA_SELECTED_INSTALLMENT_OPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInstallmentPaymentDataSelectedInstallmentOption() {
    return installmentPaymentDataSelectedInstallmentOption;
  }


  @JsonProperty(JSON_PROPERTY_INSTALLMENT_PAYMENT_DATA_SELECTED_INSTALLMENT_OPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstallmentPaymentDataSelectedInstallmentOption(String installmentPaymentDataSelectedInstallmentOption) {
    this.installmentPaymentDataSelectedInstallmentOption = installmentPaymentDataSelectedInstallmentOption;
  }


  /**
   * Return true if this AdditionalDataModifications object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalDataModifications additionalDataModifications = (AdditionalDataModifications) o;
    return Objects.equals(this.installmentPaymentDataSelectedInstallmentOption, additionalDataModifications.installmentPaymentDataSelectedInstallmentOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installmentPaymentDataSelectedInstallmentOption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalDataModifications {\n");
    sb.append("    installmentPaymentDataSelectedInstallmentOption: ").append(toIndentedString(installmentPaymentDataSelectedInstallmentOption)).append("\n");
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
   * Create an instance of AdditionalDataModifications given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdditionalDataModifications
   * @throws JsonProcessingException if the JSON string is invalid with respect to AdditionalDataModifications
   */
  public static AdditionalDataModifications fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AdditionalDataModifications.class);
  }
/**
  * Convert an instance of AdditionalDataModifications to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

