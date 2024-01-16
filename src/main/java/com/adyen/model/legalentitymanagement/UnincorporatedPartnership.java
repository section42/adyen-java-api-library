/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.legalentitymanagement.Address;
import com.adyen.model.legalentitymanagement.TaxInformation;
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
 * UnincorporatedPartnership
 */
@JsonPropertyOrder({
  UnincorporatedPartnership.JSON_PROPERTY_COUNTRY_OF_GOVERNING_LAW,
  UnincorporatedPartnership.JSON_PROPERTY_DATE_OF_INCORPORATION,
  UnincorporatedPartnership.JSON_PROPERTY_DESCRIPTION,
  UnincorporatedPartnership.JSON_PROPERTY_DOING_BUSINESS_AS,
  UnincorporatedPartnership.JSON_PROPERTY_NAME,
  UnincorporatedPartnership.JSON_PROPERTY_PRINCIPAL_PLACE_OF_BUSINESS,
  UnincorporatedPartnership.JSON_PROPERTY_REGISTERED_ADDRESS,
  UnincorporatedPartnership.JSON_PROPERTY_REGISTRATION_NUMBER,
  UnincorporatedPartnership.JSON_PROPERTY_TAX_INFORMATION,
  UnincorporatedPartnership.JSON_PROPERTY_TYPE,
  UnincorporatedPartnership.JSON_PROPERTY_VAT_ABSENCE_REASON,
  UnincorporatedPartnership.JSON_PROPERTY_VAT_NUMBER
})

public class UnincorporatedPartnership {
  public static final String JSON_PROPERTY_COUNTRY_OF_GOVERNING_LAW = "countryOfGoverningLaw";
  private String countryOfGoverningLaw;

  public static final String JSON_PROPERTY_DATE_OF_INCORPORATION = "dateOfIncorporation";
  private String dateOfIncorporation;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DOING_BUSINESS_AS = "doingBusinessAs";
  private String doingBusinessAs;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PRINCIPAL_PLACE_OF_BUSINESS = "principalPlaceOfBusiness";
  private Address principalPlaceOfBusiness;

  public static final String JSON_PROPERTY_REGISTERED_ADDRESS = "registeredAddress";
  private Address registeredAddress;

  public static final String JSON_PROPERTY_REGISTRATION_NUMBER = "registrationNumber";
  private String registrationNumber;

  public static final String JSON_PROPERTY_TAX_INFORMATION = "taxInformation";
  private List<TaxInformation> taxInformation = null;

  /**
   * Type of Partnership.  Possible values: *  **limitedPartnership** *  **generalPartnership** *  **familyPartnership** *  **commercialPartnership** *  **publicPartnership** *  **otherPartnership** *  **gbr** *  **gmbh** *  **kgaa** *  **cv** *  **vof** *  **maatschap** *  **privateFundLimitedPartnership** *  **businessTrustEntity** *  **businessPartnership**  
   */
  public enum TypeEnum {
    LIMITEDPARTNERSHIP("limitedPartnership"),
    
    GENERALPARTNERSHIP("generalPartnership"),
    
    FAMILYPARTNERSHIP("familyPartnership"),
    
    COMMERCIALPARTNERSHIP("commercialPartnership"),
    
    PUBLICPARTNERSHIP("publicPartnership"),
    
    OTHERPARTNERSHIP("otherPartnership"),
    
    GBR("gbr"),
    
    GMBH("gmbh"),
    
    KGAA("kgaa"),
    
    CV("cv"),
    
    VOF("vof"),
    
    MAATSCHAP("maatschap"),
    
    PRIVATEFUNDLIMITEDPARTNERSHIP("privateFundLimitedPartnership"),
    
    BUSINESSTRUSTENTITY("businessTrustEntity"),
    
    BUSINESSPARTNERSHIP("businessPartnership");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  /**
   * The reason for not providing a VAT number.  Possible values: **industryExemption**, **belowTaxThreshold**.
   */
  public enum VatAbsenceReasonEnum {
    INDUSTRYEXEMPTION("industryExemption"),
    
    BELOWTAXTHRESHOLD("belowTaxThreshold");

    private String value;

    VatAbsenceReasonEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VatAbsenceReasonEnum fromValue(String value) {
      for (VatAbsenceReasonEnum b : VatAbsenceReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VAT_ABSENCE_REASON = "vatAbsenceReason";
  private VatAbsenceReasonEnum vatAbsenceReason;

  public static final String JSON_PROPERTY_VAT_NUMBER = "vatNumber";
  private String vatNumber;

  public UnincorporatedPartnership() { 
  }

  public UnincorporatedPartnership countryOfGoverningLaw(String countryOfGoverningLaw) {
    this.countryOfGoverningLaw = countryOfGoverningLaw;
    return this;
  }

   /**
   * The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code of the governing country.
   * @return countryOfGoverningLaw
  **/
  @ApiModelProperty(required = true, value = "The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code of the governing country.")
  @JsonProperty(JSON_PROPERTY_COUNTRY_OF_GOVERNING_LAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryOfGoverningLaw() {
    return countryOfGoverningLaw;
  }


 /**
  * The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code of the governing country.
  *
  * @param countryOfGoverningLaw
  */ 
  @JsonProperty(JSON_PROPERTY_COUNTRY_OF_GOVERNING_LAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryOfGoverningLaw(String countryOfGoverningLaw) {
    this.countryOfGoverningLaw = countryOfGoverningLaw;
  }


  public UnincorporatedPartnership dateOfIncorporation(String dateOfIncorporation) {
    this.dateOfIncorporation = dateOfIncorporation;
    return this;
  }

   /**
   * The date when the legal arrangement was incorporated in YYYY-MM-DD format.
   * @return dateOfIncorporation
  **/
  @ApiModelProperty(value = "The date when the legal arrangement was incorporated in YYYY-MM-DD format.")
  @JsonProperty(JSON_PROPERTY_DATE_OF_INCORPORATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDateOfIncorporation() {
    return dateOfIncorporation;
  }


 /**
  * The date when the legal arrangement was incorporated in YYYY-MM-DD format.
  *
  * @param dateOfIncorporation
  */ 
  @JsonProperty(JSON_PROPERTY_DATE_OF_INCORPORATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateOfIncorporation(String dateOfIncorporation) {
    this.dateOfIncorporation = dateOfIncorporation;
  }


  public UnincorporatedPartnership description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Short description about the Legal Arrangement.
   * @return description
  **/
  @ApiModelProperty(value = "Short description about the Legal Arrangement.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


 /**
  * Short description about the Legal Arrangement.
  *
  * @param description
  */ 
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public UnincorporatedPartnership doingBusinessAs(String doingBusinessAs) {
    this.doingBusinessAs = doingBusinessAs;
    return this;
  }

   /**
   * The registered name, if different from the &#x60;name&#x60;.
   * @return doingBusinessAs
  **/
  @ApiModelProperty(value = "The registered name, if different from the `name`.")
  @JsonProperty(JSON_PROPERTY_DOING_BUSINESS_AS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDoingBusinessAs() {
    return doingBusinessAs;
  }


 /**
  * The registered name, if different from the &#x60;name&#x60;.
  *
  * @param doingBusinessAs
  */ 
  @JsonProperty(JSON_PROPERTY_DOING_BUSINESS_AS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDoingBusinessAs(String doingBusinessAs) {
    this.doingBusinessAs = doingBusinessAs;
  }


  public UnincorporatedPartnership name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The legal name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The legal name.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


 /**
  * The legal name.
  *
  * @param name
  */ 
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public UnincorporatedPartnership principalPlaceOfBusiness(Address principalPlaceOfBusiness) {
    this.principalPlaceOfBusiness = principalPlaceOfBusiness;
    return this;
  }

   /**
   * Get principalPlaceOfBusiness
   * @return principalPlaceOfBusiness
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRINCIPAL_PLACE_OF_BUSINESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Address getPrincipalPlaceOfBusiness() {
    return principalPlaceOfBusiness;
  }


 /**
  * principalPlaceOfBusiness
  *
  * @param principalPlaceOfBusiness
  */ 
  @JsonProperty(JSON_PROPERTY_PRINCIPAL_PLACE_OF_BUSINESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrincipalPlaceOfBusiness(Address principalPlaceOfBusiness) {
    this.principalPlaceOfBusiness = principalPlaceOfBusiness;
  }


  public UnincorporatedPartnership registeredAddress(Address registeredAddress) {
    this.registeredAddress = registeredAddress;
    return this;
  }

   /**
   * Get registeredAddress
   * @return registeredAddress
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REGISTERED_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Address getRegisteredAddress() {
    return registeredAddress;
  }


 /**
  * registeredAddress
  *
  * @param registeredAddress
  */ 
  @JsonProperty(JSON_PROPERTY_REGISTERED_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegisteredAddress(Address registeredAddress) {
    this.registeredAddress = registeredAddress;
  }


  public UnincorporatedPartnership registrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
    return this;
  }

   /**
   * The registration number.
   * @return registrationNumber
  **/
  @ApiModelProperty(value = "The registration number.")
  @JsonProperty(JSON_PROPERTY_REGISTRATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegistrationNumber() {
    return registrationNumber;
  }


 /**
  * The registration number.
  *
  * @param registrationNumber
  */ 
  @JsonProperty(JSON_PROPERTY_REGISTRATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }


  public UnincorporatedPartnership taxInformation(List<TaxInformation> taxInformation) {
    this.taxInformation = taxInformation;
    return this;
  }

  public UnincorporatedPartnership addTaxInformationItem(TaxInformation taxInformationItem) {
    if (this.taxInformation == null) {
      this.taxInformation = new ArrayList<>();
    }
    this.taxInformation.add(taxInformationItem);
    return this;
  }

   /**
   * The tax information of the entity.
   * @return taxInformation
  **/
  @ApiModelProperty(value = "The tax information of the entity.")
  @JsonProperty(JSON_PROPERTY_TAX_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TaxInformation> getTaxInformation() {
    return taxInformation;
  }


 /**
  * The tax information of the entity.
  *
  * @param taxInformation
  */ 
  @JsonProperty(JSON_PROPERTY_TAX_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxInformation(List<TaxInformation> taxInformation) {
    this.taxInformation = taxInformation;
  }


  public UnincorporatedPartnership type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of Partnership.  Possible values: *  **limitedPartnership** *  **generalPartnership** *  **familyPartnership** *  **commercialPartnership** *  **publicPartnership** *  **otherPartnership** *  **gbr** *  **gmbh** *  **kgaa** *  **cv** *  **vof** *  **maatschap** *  **privateFundLimitedPartnership** *  **businessTrustEntity** *  **businessPartnership**  
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of Partnership.  Possible values: *  **limitedPartnership** *  **generalPartnership** *  **familyPartnership** *  **commercialPartnership** *  **publicPartnership** *  **otherPartnership** *  **gbr** *  **gmbh** *  **kgaa** *  **cv** *  **vof** *  **maatschap** *  **privateFundLimitedPartnership** *  **businessTrustEntity** *  **businessPartnership**  ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


 /**
  * Type of Partnership.  Possible values: *  **limitedPartnership** *  **generalPartnership** *  **familyPartnership** *  **commercialPartnership** *  **publicPartnership** *  **otherPartnership** *  **gbr** *  **gmbh** *  **kgaa** *  **cv** *  **vof** *  **maatschap** *  **privateFundLimitedPartnership** *  **businessTrustEntity** *  **businessPartnership**  
  *
  * @param type
  */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public UnincorporatedPartnership vatAbsenceReason(VatAbsenceReasonEnum vatAbsenceReason) {
    this.vatAbsenceReason = vatAbsenceReason;
    return this;
  }

   /**
   * The reason for not providing a VAT number.  Possible values: **industryExemption**, **belowTaxThreshold**.
   * @return vatAbsenceReason
  **/
  @ApiModelProperty(value = "The reason for not providing a VAT number.  Possible values: **industryExemption**, **belowTaxThreshold**.")
  @JsonProperty(JSON_PROPERTY_VAT_ABSENCE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VatAbsenceReasonEnum getVatAbsenceReason() {
    return vatAbsenceReason;
  }


 /**
  * The reason for not providing a VAT number.  Possible values: **industryExemption**, **belowTaxThreshold**.
  *
  * @param vatAbsenceReason
  */ 
  @JsonProperty(JSON_PROPERTY_VAT_ABSENCE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVatAbsenceReason(VatAbsenceReasonEnum vatAbsenceReason) {
    this.vatAbsenceReason = vatAbsenceReason;
  }


  public UnincorporatedPartnership vatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
    return this;
  }

   /**
   * The VAT number.
   * @return vatNumber
  **/
  @ApiModelProperty(value = "The VAT number.")
  @JsonProperty(JSON_PROPERTY_VAT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVatNumber() {
    return vatNumber;
  }


 /**
  * The VAT number.
  *
  * @param vatNumber
  */ 
  @JsonProperty(JSON_PROPERTY_VAT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }


  /**
   * Return true if this UnincorporatedPartnership object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnincorporatedPartnership unincorporatedPartnership = (UnincorporatedPartnership) o;
    return Objects.equals(this.countryOfGoverningLaw, unincorporatedPartnership.countryOfGoverningLaw) &&
        Objects.equals(this.dateOfIncorporation, unincorporatedPartnership.dateOfIncorporation) &&
        Objects.equals(this.description, unincorporatedPartnership.description) &&
        Objects.equals(this.doingBusinessAs, unincorporatedPartnership.doingBusinessAs) &&
        Objects.equals(this.name, unincorporatedPartnership.name) &&
        Objects.equals(this.principalPlaceOfBusiness, unincorporatedPartnership.principalPlaceOfBusiness) &&
        Objects.equals(this.registeredAddress, unincorporatedPartnership.registeredAddress) &&
        Objects.equals(this.registrationNumber, unincorporatedPartnership.registrationNumber) &&
        Objects.equals(this.taxInformation, unincorporatedPartnership.taxInformation) &&
        Objects.equals(this.type, unincorporatedPartnership.type) &&
        Objects.equals(this.vatAbsenceReason, unincorporatedPartnership.vatAbsenceReason) &&
        Objects.equals(this.vatNumber, unincorporatedPartnership.vatNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryOfGoverningLaw, dateOfIncorporation, description, doingBusinessAs, name, principalPlaceOfBusiness, registeredAddress, registrationNumber, taxInformation, type, vatAbsenceReason, vatNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnincorporatedPartnership {\n");
    sb.append("    countryOfGoverningLaw: ").append(toIndentedString(countryOfGoverningLaw)).append("\n");
    sb.append("    dateOfIncorporation: ").append(toIndentedString(dateOfIncorporation)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    doingBusinessAs: ").append(toIndentedString(doingBusinessAs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    principalPlaceOfBusiness: ").append(toIndentedString(principalPlaceOfBusiness)).append("\n");
    sb.append("    registeredAddress: ").append(toIndentedString(registeredAddress)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    taxInformation: ").append(toIndentedString(taxInformation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vatAbsenceReason: ").append(toIndentedString(vatAbsenceReason)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
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
   * Create an instance of UnincorporatedPartnership given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UnincorporatedPartnership
   * @throws JsonProcessingException if the JSON string is invalid with respect to UnincorporatedPartnership
   */
  public static UnincorporatedPartnership fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, UnincorporatedPartnership.class);
  }
/**
  * Convert an instance of UnincorporatedPartnership to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

