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
 * CreateMerchantResponse
 */
@JsonPropertyOrder({
  CreateMerchantResponse.JSON_PROPERTY_BUSINESS_LINE_ID,
  CreateMerchantResponse.JSON_PROPERTY_COMPANY_ID,
  CreateMerchantResponse.JSON_PROPERTY_DESCRIPTION,
  CreateMerchantResponse.JSON_PROPERTY_ID,
  CreateMerchantResponse.JSON_PROPERTY_LEGAL_ENTITY_ID,
  CreateMerchantResponse.JSON_PROPERTY_PRICING_PLAN,
  CreateMerchantResponse.JSON_PROPERTY_REFERENCE
})

public class CreateMerchantResponse {
  public static final String JSON_PROPERTY_BUSINESS_LINE_ID = "businessLineId";
  private String businessLineId;

  public static final String JSON_PROPERTY_COMPANY_ID = "companyId";
  private String companyId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LEGAL_ENTITY_ID = "legalEntityId";
  private String legalEntityId;

  public static final String JSON_PROPERTY_PRICING_PLAN = "pricingPlan";
  private String pricingPlan;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public CreateMerchantResponse() { 
  }

  public CreateMerchantResponse businessLineId(String businessLineId) {
    this.businessLineId = businessLineId;
    return this;
  }

   /**
   * The unique identifier of the [business line](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/businessLines).
   * @return businessLineId
  **/
  @ApiModelProperty(value = "The unique identifier of the [business line](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/businessLines).")
  @JsonProperty(JSON_PROPERTY_BUSINESS_LINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessLineId() {
    return businessLineId;
  }


 /**
  * The unique identifier of the [business line](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/businessLines).
  *
  * @param businessLineId
  */ 
  @JsonProperty(JSON_PROPERTY_BUSINESS_LINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessLineId(String businessLineId) {
    this.businessLineId = businessLineId;
  }


  public CreateMerchantResponse companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

   /**
   * The unique identifier of the company account.
   * @return companyId
  **/
  @ApiModelProperty(value = "The unique identifier of the company account.")
  @JsonProperty(JSON_PROPERTY_COMPANY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyId() {
    return companyId;
  }


 /**
  * The unique identifier of the company account.
  *
  * @param companyId
  */ 
  @JsonProperty(JSON_PROPERTY_COMPANY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }


  public CreateMerchantResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Your description for the merchant account, maximum 300 characters.
   * @return description
  **/
  @ApiModelProperty(value = "Your description for the merchant account, maximum 300 characters.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


 /**
  * Your description for the merchant account, maximum 300 characters.
  *
  * @param description
  */ 
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public CreateMerchantResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the merchant account. If Adyen set up a template for the &#x60;reference&#x60;, then the &#x60;id&#x60; will have the same value as the &#x60;reference&#x60; that you sent in the request. Otherwise, the value is generated by Adyen.
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier of the merchant account. If Adyen set up a template for the `reference`, then the `id` will have the same value as the `reference` that you sent in the request. Otherwise, the value is generated by Adyen.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


 /**
  * The unique identifier of the merchant account. If Adyen set up a template for the &#x60;reference&#x60;, then the &#x60;id&#x60; will have the same value as the &#x60;reference&#x60; that you sent in the request. Otherwise, the value is generated by Adyen.
  *
  * @param id
  */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public CreateMerchantResponse legalEntityId(String legalEntityId) {
    this.legalEntityId = legalEntityId;
    return this;
  }

   /**
   * The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities).
   * @return legalEntityId
  **/
  @ApiModelProperty(value = "The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities).")
  @JsonProperty(JSON_PROPERTY_LEGAL_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLegalEntityId() {
    return legalEntityId;
  }


 /**
  * The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities).
  *
  * @param legalEntityId
  */ 
  @JsonProperty(JSON_PROPERTY_LEGAL_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegalEntityId(String legalEntityId) {
    this.legalEntityId = legalEntityId;
  }


  public CreateMerchantResponse pricingPlan(String pricingPlan) {
    this.pricingPlan = pricingPlan;
    return this;
  }

   /**
   * Partner pricing plan for the merchant, applicable for merchants under AfP managed company accounts.
   * @return pricingPlan
  **/
  @ApiModelProperty(value = "Partner pricing plan for the merchant, applicable for merchants under AfP managed company accounts.")
  @JsonProperty(JSON_PROPERTY_PRICING_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPricingPlan() {
    return pricingPlan;
  }


 /**
  * Partner pricing plan for the merchant, applicable for merchants under AfP managed company accounts.
  *
  * @param pricingPlan
  */ 
  @JsonProperty(JSON_PROPERTY_PRICING_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPricingPlan(String pricingPlan) {
    this.pricingPlan = pricingPlan;
  }


  public CreateMerchantResponse reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the merchant account.
   * @return reference
  **/
  @ApiModelProperty(value = "Your reference for the merchant account.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


 /**
  * Your reference for the merchant account.
  *
  * @param reference
  */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  /**
   * Return true if this CreateMerchantResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMerchantResponse createMerchantResponse = (CreateMerchantResponse) o;
    return Objects.equals(this.businessLineId, createMerchantResponse.businessLineId) &&
        Objects.equals(this.companyId, createMerchantResponse.companyId) &&
        Objects.equals(this.description, createMerchantResponse.description) &&
        Objects.equals(this.id, createMerchantResponse.id) &&
        Objects.equals(this.legalEntityId, createMerchantResponse.legalEntityId) &&
        Objects.equals(this.pricingPlan, createMerchantResponse.pricingPlan) &&
        Objects.equals(this.reference, createMerchantResponse.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessLineId, companyId, description, id, legalEntityId, pricingPlan, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMerchantResponse {\n");
    sb.append("    businessLineId: ").append(toIndentedString(businessLineId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    legalEntityId: ").append(toIndentedString(legalEntityId)).append("\n");
    sb.append("    pricingPlan: ").append(toIndentedString(pricingPlan)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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
   * Create an instance of CreateMerchantResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateMerchantResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to CreateMerchantResponse
   */
  public static CreateMerchantResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CreateMerchantResponse.class);
  }
/**
  * Convert an instance of CreateMerchantResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

