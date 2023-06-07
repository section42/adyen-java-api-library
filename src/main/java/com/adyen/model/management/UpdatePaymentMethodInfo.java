/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
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
import com.adyen.model.management.BcmcInfo;
import com.adyen.model.management.CartesBancairesInfo;
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
 * UpdatePaymentMethodInfo
 */
@JsonPropertyOrder({
  UpdatePaymentMethodInfo.JSON_PROPERTY_BCMC,
  UpdatePaymentMethodInfo.JSON_PROPERTY_CARTES_BANCAIRES,
  UpdatePaymentMethodInfo.JSON_PROPERTY_COUNTRIES,
  UpdatePaymentMethodInfo.JSON_PROPERTY_CURRENCIES,
  UpdatePaymentMethodInfo.JSON_PROPERTY_ENABLED,
  UpdatePaymentMethodInfo.JSON_PROPERTY_STORE_IDS
})

public class UpdatePaymentMethodInfo {
  public static final String JSON_PROPERTY_BCMC = "bcmc";
  private BcmcInfo bcmc;

  public static final String JSON_PROPERTY_CARTES_BANCAIRES = "cartesBancaires";
  private CartesBancairesInfo cartesBancaires;

  public static final String JSON_PROPERTY_COUNTRIES = "countries";
  private List<String> countries = null;

  public static final String JSON_PROPERTY_CURRENCIES = "currencies";
  private List<String> currencies = null;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_STORE_IDS = "storeIds";
  private List<String> storeIds = null;

  public UpdatePaymentMethodInfo() { 
  }

  public UpdatePaymentMethodInfo bcmc(BcmcInfo bcmc) {
    this.bcmc = bcmc;
    return this;
  }

   /**
   * Get bcmc
   * @return bcmc
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BCMC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BcmcInfo getBcmc() {
    return bcmc;
  }


  @JsonProperty(JSON_PROPERTY_BCMC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBcmc(BcmcInfo bcmc) {
    this.bcmc = bcmc;
  }


  public UpdatePaymentMethodInfo cartesBancaires(CartesBancairesInfo cartesBancaires) {
    this.cartesBancaires = cartesBancaires;
    return this;
  }

   /**
   * Get cartesBancaires
   * @return cartesBancaires
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CARTES_BANCAIRES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CartesBancairesInfo getCartesBancaires() {
    return cartesBancaires;
  }


  @JsonProperty(JSON_PROPERTY_CARTES_BANCAIRES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCartesBancaires(CartesBancairesInfo cartesBancaires) {
    this.cartesBancaires = cartesBancaires;
  }


  public UpdatePaymentMethodInfo countries(List<String> countries) {
    this.countries = countries;
    return this;
  }

  public UpdatePaymentMethodInfo addCountriesItem(String countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<>();
    }
    this.countries.add(countriesItem);
    return this;
  }

   /**
   * The list of countries where a payment method is available. By default, all countries supported by the payment method.
   * @return countries
  **/
  @ApiModelProperty(value = "The list of countries where a payment method is available. By default, all countries supported by the payment method.")
  @JsonProperty(JSON_PROPERTY_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCountries() {
    return countries;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountries(List<String> countries) {
    this.countries = countries;
  }


  public UpdatePaymentMethodInfo currencies(List<String> currencies) {
    this.currencies = currencies;
    return this;
  }

  public UpdatePaymentMethodInfo addCurrenciesItem(String currenciesItem) {
    if (this.currencies == null) {
      this.currencies = new ArrayList<>();
    }
    this.currencies.add(currenciesItem);
    return this;
  }

   /**
   * The list of currencies that a payment method supports. By default, all currencies supported by the payment method.
   * @return currencies
  **/
  @ApiModelProperty(value = "The list of currencies that a payment method supports. By default, all currencies supported by the payment method.")
  @JsonProperty(JSON_PROPERTY_CURRENCIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCurrencies() {
    return currencies;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencies(List<String> currencies) {
    this.currencies = currencies;
  }


  public UpdatePaymentMethodInfo enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the payment method is enabled (**true**) or disabled (**false**).
   * @return enabled
  **/
  @ApiModelProperty(value = "Indicates whether the payment method is enabled (**true**) or disabled (**false**).")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public UpdatePaymentMethodInfo storeIds(List<String> storeIds) {
    this.storeIds = storeIds;
    return this;
  }

  public UpdatePaymentMethodInfo addStoreIdsItem(String storeIdsItem) {
    if (this.storeIds == null) {
      this.storeIds = new ArrayList<>();
    }
    this.storeIds.add(storeIdsItem);
    return this;
  }

   /**
   * The list of stores for this payment method
   * @return storeIds
  **/
  @ApiModelProperty(value = "The list of stores for this payment method")
  @JsonProperty(JSON_PROPERTY_STORE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getStoreIds() {
    return storeIds;
  }


  @JsonProperty(JSON_PROPERTY_STORE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoreIds(List<String> storeIds) {
    this.storeIds = storeIds;
  }


  /**
   * Return true if this UpdatePaymentMethodInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePaymentMethodInfo updatePaymentMethodInfo = (UpdatePaymentMethodInfo) o;
    return Objects.equals(this.bcmc, updatePaymentMethodInfo.bcmc) &&
        Objects.equals(this.cartesBancaires, updatePaymentMethodInfo.cartesBancaires) &&
        Objects.equals(this.countries, updatePaymentMethodInfo.countries) &&
        Objects.equals(this.currencies, updatePaymentMethodInfo.currencies) &&
        Objects.equals(this.enabled, updatePaymentMethodInfo.enabled) &&
        Objects.equals(this.storeIds, updatePaymentMethodInfo.storeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bcmc, cartesBancaires, countries, currencies, enabled, storeIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePaymentMethodInfo {\n");
    sb.append("    bcmc: ").append(toIndentedString(bcmc)).append("\n");
    sb.append("    cartesBancaires: ").append(toIndentedString(cartesBancaires)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    storeIds: ").append(toIndentedString(storeIds)).append("\n");
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
   * Create an instance of UpdatePaymentMethodInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdatePaymentMethodInfo
   * @throws JsonProcessingException if the JSON string is invalid with respect to UpdatePaymentMethodInfo
   */
  public static UpdatePaymentMethodInfo fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, UpdatePaymentMethodInfo.class);
  }
/**
  * Convert an instance of UpdatePaymentMethodInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

