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
import com.adyen.model.management.SplitConfigurationRule;
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
 * SplitConfiguration
 */
@JsonPropertyOrder({
  SplitConfiguration.JSON_PROPERTY_DESCRIPTION,
  SplitConfiguration.JSON_PROPERTY_RULES,
  SplitConfiguration.JSON_PROPERTY_SPLIT_CONFIGURATION_ID,
  SplitConfiguration.JSON_PROPERTY_STORES
})

public class SplitConfiguration {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_RULES = "rules";
  private List<SplitConfigurationRule> rules = new ArrayList<>();

  public static final String JSON_PROPERTY_SPLIT_CONFIGURATION_ID = "splitConfigurationId";
  private String splitConfigurationId;

  public static final String JSON_PROPERTY_STORES = "stores";
  private List<String> stores = null;

  public SplitConfiguration() { 
  }

  public SplitConfiguration description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Your description for the split configuration.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Your description for the split configuration.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public SplitConfiguration rules(List<SplitConfigurationRule> rules) {
    this.rules = rules;
    return this;
  }

  public SplitConfiguration addRulesItem(SplitConfigurationRule rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Array of rules that define the split configuration behavior.
   * @return rules
  **/
  @ApiModelProperty(required = true, value = "Array of rules that define the split configuration behavior.")
  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SplitConfigurationRule> getRules() {
    return rules;
  }


  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRules(List<SplitConfigurationRule> rules) {
    this.rules = rules;
  }


  public SplitConfiguration splitConfigurationId(String splitConfigurationId) {
    this.splitConfigurationId = splitConfigurationId;
    return this;
  }

   /**
   * Unique identifier of the split configuration.
   * @return splitConfigurationId
  **/
  @ApiModelProperty(value = "Unique identifier of the split configuration.")
  @JsonProperty(JSON_PROPERTY_SPLIT_CONFIGURATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSplitConfigurationId() {
    return splitConfigurationId;
  }


  @JsonProperty(JSON_PROPERTY_SPLIT_CONFIGURATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSplitConfigurationId(String splitConfigurationId) {
    this.splitConfigurationId = splitConfigurationId;
  }


  public SplitConfiguration stores(List<String> stores) {
    this.stores = stores;
    return this;
  }

  public SplitConfiguration addStoresItem(String storesItem) {
    if (this.stores == null) {
      this.stores = new ArrayList<>();
    }
    this.stores.add(storesItem);
    return this;
  }

   /**
   * List of stores to which the split configuration applies.
   * @return stores
  **/
  @ApiModelProperty(value = "List of stores to which the split configuration applies.")
  @JsonProperty(JSON_PROPERTY_STORES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getStores() {
    return stores;
  }


  @JsonProperty(JSON_PROPERTY_STORES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStores(List<String> stores) {
    this.stores = stores;
  }


  /**
   * Return true if this SplitConfiguration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitConfiguration splitConfiguration = (SplitConfiguration) o;
    return Objects.equals(this.description, splitConfiguration.description) &&
        Objects.equals(this.rules, splitConfiguration.rules) &&
        Objects.equals(this.splitConfigurationId, splitConfiguration.splitConfigurationId) &&
        Objects.equals(this.stores, splitConfiguration.stores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, rules, splitConfigurationId, stores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitConfiguration {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    splitConfigurationId: ").append(toIndentedString(splitConfigurationId)).append("\n");
    sb.append("    stores: ").append(toIndentedString(stores)).append("\n");
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
   * Create an instance of SplitConfiguration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SplitConfiguration
   * @throws JsonProcessingException if the JSON string is invalid with respect to SplitConfiguration
   */
  public static SplitConfiguration fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, SplitConfiguration.class);
  }
/**
  * Convert an instance of SplitConfiguration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

