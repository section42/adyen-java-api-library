/*
 * Adyen Payment API
 * A set of API endpoints that allow you to initiate, settle, and modify payments on the Adyen payments platform. You can use the API to accept card payments (including One-Click and 3D Secure), bank transfers, ewallets, and many other payment methods.  To learn more about the API, visit [Classic integration](https://docs.adyen.com/classic-integration).  ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning Payments API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/Payment/v68/authorise ```  ## Going live  To authenticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/Payment/v68/authorise ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 68
 * Contact: developer-experience@adyen.com
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
 * PlatformChargebackLogic
 */
@JsonPropertyOrder({
  PlatformChargebackLogic.JSON_PROPERTY_BEHAVIOR,
  PlatformChargebackLogic.JSON_PROPERTY_COST_ALLOCATION_ACCOUNT,
  PlatformChargebackLogic.JSON_PROPERTY_TARGET_ACCOUNT
})

public class PlatformChargebackLogic {
  /**
   * Gets or Sets behavior
   */
  public enum BehaviorEnum {
    DEDUCTACCORDINGTOSPLITRATIO("deductAccordingToSplitRatio"),
    
    DEDUCTFROMLIABLEACCOUNT("deductFromLiableAccount"),
    
    DEDUCTFROMONEBALANCEACCOUNT("deductFromOneBalanceAccount");

    private String value;

    BehaviorEnum(String value) {
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
    public static BehaviorEnum fromValue(String value) {
      for (BehaviorEnum b : BehaviorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_BEHAVIOR = "behavior";
  private BehaviorEnum behavior;

  public static final String JSON_PROPERTY_COST_ALLOCATION_ACCOUNT = "costAllocationAccount";
  private String costAllocationAccount;

  public static final String JSON_PROPERTY_TARGET_ACCOUNT = "targetAccount";
  private String targetAccount;

  public PlatformChargebackLogic() { 
  }

  public PlatformChargebackLogic behavior(BehaviorEnum behavior) {
    this.behavior = behavior;
    return this;
  }

   /**
   * Get behavior
   * @return behavior
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BEHAVIOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BehaviorEnum getBehavior() {
    return behavior;
  }


  @JsonProperty(JSON_PROPERTY_BEHAVIOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBehavior(BehaviorEnum behavior) {
    this.behavior = behavior;
  }


  public PlatformChargebackLogic costAllocationAccount(String costAllocationAccount) {
    this.costAllocationAccount = costAllocationAccount;
    return this;
  }

   /**
   * Get costAllocationAccount
   * @return costAllocationAccount
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COST_ALLOCATION_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCostAllocationAccount() {
    return costAllocationAccount;
  }


  @JsonProperty(JSON_PROPERTY_COST_ALLOCATION_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCostAllocationAccount(String costAllocationAccount) {
    this.costAllocationAccount = costAllocationAccount;
  }


  public PlatformChargebackLogic targetAccount(String targetAccount) {
    this.targetAccount = targetAccount;
    return this;
  }

   /**
   * Get targetAccount
   * @return targetAccount
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetAccount() {
    return targetAccount;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetAccount(String targetAccount) {
    this.targetAccount = targetAccount;
  }


  /**
   * Return true if this PlatformChargebackLogic object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatformChargebackLogic platformChargebackLogic = (PlatformChargebackLogic) o;
    return Objects.equals(this.behavior, platformChargebackLogic.behavior) &&
        Objects.equals(this.costAllocationAccount, platformChargebackLogic.costAllocationAccount) &&
        Objects.equals(this.targetAccount, platformChargebackLogic.targetAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(behavior, costAllocationAccount, targetAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatformChargebackLogic {\n");
    sb.append("    behavior: ").append(toIndentedString(behavior)).append("\n");
    sb.append("    costAllocationAccount: ").append(toIndentedString(costAllocationAccount)).append("\n");
    sb.append("    targetAccount: ").append(toIndentedString(targetAccount)).append("\n");
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
   * Create an instance of PlatformChargebackLogic given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PlatformChargebackLogic
   * @throws JsonProcessingException if the JSON string is invalid with respect to PlatformChargebackLogic
   */
  public static PlatformChargebackLogic fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PlatformChargebackLogic.class);
  }
/**
  * Convert an instance of PlatformChargebackLogic to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

