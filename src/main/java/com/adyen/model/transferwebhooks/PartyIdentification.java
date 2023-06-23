/*
 * Transfer webhooks
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transferwebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.transferwebhooks.Address;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * PartyIdentification
 */
@JsonPropertyOrder({
  PartyIdentification.JSON_PROPERTY_ADDRESS,
  PartyIdentification.JSON_PROPERTY_DATE_OF_BIRTH,
  PartyIdentification.JSON_PROPERTY_FIRST_NAME,
  PartyIdentification.JSON_PROPERTY_FULL_NAME,
  PartyIdentification.JSON_PROPERTY_LAST_NAME,
  PartyIdentification.JSON_PROPERTY_REFERENCE,
  PartyIdentification.JSON_PROPERTY_TYPE
})

public class PartyIdentification {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private Address address;

  public static final String JSON_PROPERTY_DATE_OF_BIRTH = "dateOfBirth";
  private LocalDate dateOfBirth;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private String fullName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  /**
   * The type of entity that owns the bank account.   Possible values: **individual**, **organization**, or **unknown**.
   */
  public enum TypeEnum {
    INDIVIDUAL("individual"),
    
    ORGANIZATION("organization"),
    
    UNKNOWN("unknown");

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
  private TypeEnum type = TypeEnum.UNKNOWN;

  public PartyIdentification() { 
  }

  public PartyIdentification address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Address getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(Address address) {
    this.address = address;
  }


  public PartyIdentification dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * The date of birth of the individual in [ISO-8601](https://www.w3.org/TR/NOTE-datetime) format. For example, **YYYY-MM-DD**. Should not be before 1st January 1900.  Allowed only when &#x60;type&#x60; is **individual**.
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "The date of birth of the individual in [ISO-8601](https://www.w3.org/TR/NOTE-datetime) format. For example, **YYYY-MM-DD**. Should not be before 1st January 1900.  Allowed only when `type` is **individual**.")
  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }


  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public PartyIdentification firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the individual.  Allowed only when &#x60;type&#x60; is **individual**.
   * @return firstName
  **/
  @ApiModelProperty(value = "First name of the individual.  Allowed only when `type` is **individual**.")
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public PartyIdentification fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * The name of the entity.
   * @return fullName
  **/
  @ApiModelProperty(required = true, value = "The name of the entity.")
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFullName() {
    return fullName;
  }


  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public PartyIdentification lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the individual.  Allowed only when &#x60;type&#x60; is **individual**.
   * @return lastName
  **/
  @ApiModelProperty(value = "Last name of the individual.  Allowed only when `type` is **individual**.")
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public PartyIdentification reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Your unique reference of the party. This should be consistent for all transfers initiated to/from the same party/counterparty. e.g Your client&#39;s unique wallet or payee ID
   * @return reference
  **/
  @ApiModelProperty(value = "Your unique reference of the party. This should be consistent for all transfers initiated to/from the same party/counterparty. e.g Your client's unique wallet or payee ID")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  public PartyIdentification type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of entity that owns the bank account.   Possible values: **individual**, **organization**, or **unknown**.
   * @return type
  **/
  @ApiModelProperty(value = "The type of entity that owns the bank account.   Possible values: **individual**, **organization**, or **unknown**.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this PartyIdentification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyIdentification partyIdentification = (PartyIdentification) o;
    return Objects.equals(this.address, partyIdentification.address) &&
        Objects.equals(this.dateOfBirth, partyIdentification.dateOfBirth) &&
        Objects.equals(this.firstName, partyIdentification.firstName) &&
        Objects.equals(this.fullName, partyIdentification.fullName) &&
        Objects.equals(this.lastName, partyIdentification.lastName) &&
        Objects.equals(this.reference, partyIdentification.reference) &&
        Objects.equals(this.type, partyIdentification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, dateOfBirth, firstName, fullName, lastName, reference, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyIdentification {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
   * Create an instance of PartyIdentification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PartyIdentification
   * @throws JsonProcessingException if the JSON string is invalid with respect to PartyIdentification
   */
  public static PartyIdentification fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PartyIdentification.class);
  }
/**
  * Convert an instance of PartyIdentification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

