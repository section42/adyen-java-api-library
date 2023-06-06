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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * MbwayDetails
 */
@JsonPropertyOrder({
  MbwayDetails.JSON_PROPERTY_CHECKOUT_ATTEMPT_ID,
  MbwayDetails.JSON_PROPERTY_SHOPPER_EMAIL,
  MbwayDetails.JSON_PROPERTY_TELEPHONE_NUMBER,
  MbwayDetails.JSON_PROPERTY_TYPE
})

public class MbwayDetails {
  public static final String JSON_PROPERTY_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  private String checkoutAttemptId;

  public static final String JSON_PROPERTY_SHOPPER_EMAIL = "shopperEmail";
  private String shopperEmail;

  public static final String JSON_PROPERTY_TELEPHONE_NUMBER = "telephoneNumber";
  private String telephoneNumber;

  /**
   * **mbway**
   */
  public enum TypeEnum {
    MBWAY("mbway");

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
  private TypeEnum type = TypeEnum.MBWAY;

  public MbwayDetails() { 
  }

  public MbwayDetails checkoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
    return this;
  }

   /**
   * The checkout attempt identifier.
   * @return checkoutAttemptId
  **/
  @ApiModelProperty(value = "The checkout attempt identifier.")
  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCheckoutAttemptId() {
    return checkoutAttemptId;
  }


  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
  }


  public MbwayDetails shopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
    return this;
  }

   /**
   * 
   * @return shopperEmail
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SHOPPER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getShopperEmail() {
    return shopperEmail;
  }


  @JsonProperty(JSON_PROPERTY_SHOPPER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
  }


  public MbwayDetails telephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
    return this;
  }

   /**
   * 
   * @return telephoneNumber
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TELEPHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTelephoneNumber() {
    return telephoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_TELEPHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }


  public MbwayDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **mbway**
   * @return type
  **/
  @ApiModelProperty(value = "**mbway**")
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
   * Return true if this MbwayDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MbwayDetails mbwayDetails = (MbwayDetails) o;
    return Objects.equals(this.checkoutAttemptId, mbwayDetails.checkoutAttemptId) &&
        Objects.equals(this.shopperEmail, mbwayDetails.shopperEmail) &&
        Objects.equals(this.telephoneNumber, mbwayDetails.telephoneNumber) &&
        Objects.equals(this.type, mbwayDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutAttemptId, shopperEmail, telephoneNumber, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MbwayDetails {\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
    sb.append("    shopperEmail: ").append(toIndentedString(shopperEmail)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
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
   * Create an instance of MbwayDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MbwayDetails
   * @throws JsonProcessingException if the JSON string is invalid with respect to MbwayDetails
   */
  public static MbwayDetails fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, MbwayDetails.class);
  }
/**
  * Convert an instance of MbwayDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

