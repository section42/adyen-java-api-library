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
import com.adyen.model.management.AdditionalCommission;
import com.adyen.model.management.Commission;
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
 * UpdateSplitConfigurationLogicRequest
 */
@JsonPropertyOrder({
  UpdateSplitConfigurationLogicRequest.JSON_PROPERTY_ACQUIRING_FEES,
  UpdateSplitConfigurationLogicRequest.JSON_PROPERTY_ADDITIONAL_COMMISSION,
  UpdateSplitConfigurationLogicRequest.JSON_PROPERTY_ADYEN_COMMISSION,
  UpdateSplitConfigurationLogicRequest.JSON_PROPERTY_ADYEN_FEES,
  UpdateSplitConfigurationLogicRequest.JSON_PROPERTY_ADYEN_MARKUP,
  UpdateSplitConfigurationLogicRequest.JSON_PROPERTY_CHARGEBACK,
  UpdateSplitConfigurationLogicRequest.JSON_PROPERTY_CHARGEBACK_COST_ALLOCATION,
  UpdateSplitConfigurationLogicRequest.JSON_PROPERTY_COMMISSION,
  UpdateSplitConfigurationLogicRequest.JSON_PROPERTY_INTERCHANGE,
  UpdateSplitConfigurationLogicRequest.JSON_PROPERTY_PAYMENT_FEE,
  UpdateSplitConfigurationLogicRequest.JSON_PROPERTY_REMAINDER,
  UpdateSplitConfigurationLogicRequest.JSON_PROPERTY_SCHEME_FEE,
  UpdateSplitConfigurationLogicRequest.JSON_PROPERTY_SPLIT_LOGIC_ID,
  UpdateSplitConfigurationLogicRequest.JSON_PROPERTY_SURCHARGE,
  UpdateSplitConfigurationLogicRequest.JSON_PROPERTY_TIP
})

public class UpdateSplitConfigurationLogicRequest {
  /**
   * Specifies the logic to apply when booking the transaction fees. Should be combined with adyenFees.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
   */
  public enum AcquiringFeesEnum {
    DEDUCTFROMLIABLEACCOUNT("deductFromLiableAccount"),
    
    DEDUCTFROMONEBALANCEACCOUNT("deductFromOneBalanceAccount");

    private String value;

    AcquiringFeesEnum(String value) {
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
    public static AcquiringFeesEnum fromValue(String value) {
      for (AcquiringFeesEnum b : AcquiringFeesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACQUIRING_FEES = "acquiringFees";
  private AcquiringFeesEnum acquiringFees;

  public static final String JSON_PROPERTY_ADDITIONAL_COMMISSION = "additionalCommission";
  private AdditionalCommission additionalCommission;

  /**
   * Specifies the logic to apply when booking the transaction fees. Should be combined with schemeFee, interchange &amp; adyenMarkup.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
   */
  public enum AdyenCommissionEnum {
    DEDUCTFROMLIABLEACCOUNT("deductFromLiableAccount"),
    
    DEDUCTFROMONEBALANCEACCOUNT("deductFromOneBalanceAccount");

    private String value;

    AdyenCommissionEnum(String value) {
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
    public static AdyenCommissionEnum fromValue(String value) {
      for (AdyenCommissionEnum b : AdyenCommissionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ADYEN_COMMISSION = "adyenCommission";
  private AdyenCommissionEnum adyenCommission;

  /**
   * Specifies the logic to apply when booking the transaction fees. Should be combined with acquiringFees.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
   */
  public enum AdyenFeesEnum {
    DEDUCTFROMLIABLEACCOUNT("deductFromLiableAccount"),
    
    DEDUCTFROMONEBALANCEACCOUNT("deductFromOneBalanceAccount");

    private String value;

    AdyenFeesEnum(String value) {
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
    public static AdyenFeesEnum fromValue(String value) {
      for (AdyenFeesEnum b : AdyenFeesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ADYEN_FEES = "adyenFees";
  private AdyenFeesEnum adyenFees;

  /**
   * Specifies the logic to apply when booking the transaction fees. Should be combined with schemeFee, adyenCommission &amp; interchange.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
   */
  public enum AdyenMarkupEnum {
    DEDUCTFROMLIABLEACCOUNT("deductFromLiableAccount"),
    
    DEDUCTFROMONEBALANCEACCOUNT("deductFromOneBalanceAccount");

    private String value;

    AdyenMarkupEnum(String value) {
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
    public static AdyenMarkupEnum fromValue(String value) {
      for (AdyenMarkupEnum b : AdyenMarkupEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ADYEN_MARKUP = "adyenMarkup";
  private AdyenMarkupEnum adyenMarkup;

  /**
   * Specifies the logic to apply when booking the chargeback amount.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**, **deductAccordingToSplitRatio**.
   */
  public enum ChargebackEnum {
    DEDUCTFROMLIABLEACCOUNT("deductFromLiableAccount"),
    
    DEDUCTFROMONEBALANCEACCOUNT("deductFromOneBalanceAccount"),
    
    DEDUCTACCORDINGTOSPLITRATIO("deductAccordingToSplitRatio");

    private String value;

    ChargebackEnum(String value) {
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
    public static ChargebackEnum fromValue(String value) {
      for (ChargebackEnum b : ChargebackEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CHARGEBACK = "chargeback";
  private ChargebackEnum chargeback;

  /**
   * Specifies the logic to apply when allocating the chargeback costs.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**
   */
  public enum ChargebackCostAllocationEnum {
    DEDUCTFROMLIABLEACCOUNT("deductFromLiableAccount"),
    
    DEDUCTFROMONEBALANCEACCOUNT("deductFromOneBalanceAccount");

    private String value;

    ChargebackCostAllocationEnum(String value) {
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
    public static ChargebackCostAllocationEnum fromValue(String value) {
      for (ChargebackCostAllocationEnum b : ChargebackCostAllocationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CHARGEBACK_COST_ALLOCATION = "chargebackCostAllocation";
  private ChargebackCostAllocationEnum chargebackCostAllocation;

  public static final String JSON_PROPERTY_COMMISSION = "commission";
  private Commission commission;

  /**
   * Specifies the logic to apply when booking the transaction fees. Should be combined with schemeFee, adyenCommission &amp; adyenMarkup.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
   */
  public enum InterchangeEnum {
    DEDUCTFROMLIABLEACCOUNT("deductFromLiableAccount"),
    
    DEDUCTFROMONEBALANCEACCOUNT("deductFromOneBalanceAccount");

    private String value;

    InterchangeEnum(String value) {
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
    public static InterchangeEnum fromValue(String value) {
      for (InterchangeEnum b : InterchangeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INTERCHANGE = "interchange";
  private InterchangeEnum interchange;

  /**
   * Specifies the logic to apply when booking the transaction fees. Cannot be combined with other fees.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
   */
  public enum PaymentFeeEnum {
    DEDUCTFROMLIABLEACCOUNT("deductFromLiableAccount"),
    
    DEDUCTFROMONEBALANCEACCOUNT("deductFromOneBalanceAccount");

    private String value;

    PaymentFeeEnum(String value) {
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
    public static PaymentFeeEnum fromValue(String value) {
      for (PaymentFeeEnum b : PaymentFeeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PAYMENT_FEE = "paymentFee";
  private PaymentFeeEnum paymentFee;

  /**
   * Specifies the logic to apply when booking the amount left over after currency conversion.  Possible values: **addToLiableAccount**, **addToOneBalanceAccount**.
   */
  public enum RemainderEnum {
    ADDTOLIABLEACCOUNT("addToLiableAccount"),
    
    ADDTOONEBALANCEACCOUNT("addToOneBalanceAccount");

    private String value;

    RemainderEnum(String value) {
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
    public static RemainderEnum fromValue(String value) {
      for (RemainderEnum b : RemainderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REMAINDER = "remainder";
  private RemainderEnum remainder;

  /**
   * Specifies the logic to apply when booking the transaction fees. Should be combined with interchange, adyenCommission &amp; adyenMarkup.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
   */
  public enum SchemeFeeEnum {
    DEDUCTFROMLIABLEACCOUNT("deductFromLiableAccount"),
    
    DEDUCTFROMONEBALANCEACCOUNT("deductFromOneBalanceAccount");

    private String value;

    SchemeFeeEnum(String value) {
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
    public static SchemeFeeEnum fromValue(String value) {
      for (SchemeFeeEnum b : SchemeFeeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SCHEME_FEE = "schemeFee";
  private SchemeFeeEnum schemeFee;

  public static final String JSON_PROPERTY_SPLIT_LOGIC_ID = "splitLogicId";
  private String splitLogicId;

  /**
   * Specifies the logic to apply when booking the surcharge amount.  Possible values: **addToLiableAccount**, **addToOneBalanceAccount**
   */
  public enum SurchargeEnum {
    ADDTOLIABLEACCOUNT("addToLiableAccount"),
    
    ADDTOONEBALANCEACCOUNT("addToOneBalanceAccount");

    private String value;

    SurchargeEnum(String value) {
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
    public static SurchargeEnum fromValue(String value) {
      for (SurchargeEnum b : SurchargeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SURCHARGE = "surcharge";
  private SurchargeEnum surcharge;

  /**
   * Specifies the logic to apply when booking tips (gratuity).  Possible values: **addToLiableAccount**, **addToOneBalanceAccount**.
   */
  public enum TipEnum {
    ADDTOLIABLEACCOUNT("addToLiableAccount"),
    
    ADDTOONEBALANCEACCOUNT("addToOneBalanceAccount");

    private String value;

    TipEnum(String value) {
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
    public static TipEnum fromValue(String value) {
      for (TipEnum b : TipEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TIP = "tip";
  private TipEnum tip;

  public UpdateSplitConfigurationLogicRequest() { 
  }

  public UpdateSplitConfigurationLogicRequest acquiringFees(AcquiringFeesEnum acquiringFees) {
    this.acquiringFees = acquiringFees;
    return this;
  }

   /**
   * Specifies the logic to apply when booking the transaction fees. Should be combined with adyenFees.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
   * @return acquiringFees
  **/
  @ApiModelProperty(value = "Specifies the logic to apply when booking the transaction fees. Should be combined with adyenFees.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.")
  @JsonProperty(JSON_PROPERTY_ACQUIRING_FEES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AcquiringFeesEnum getAcquiringFees() {
    return acquiringFees;
  }


 /**
  * Specifies the logic to apply when booking the transaction fees. Should be combined with adyenFees.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
  *
  * @param acquiringFees
  */ 
  @JsonProperty(JSON_PROPERTY_ACQUIRING_FEES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcquiringFees(AcquiringFeesEnum acquiringFees) {
    this.acquiringFees = acquiringFees;
  }


  public UpdateSplitConfigurationLogicRequest additionalCommission(AdditionalCommission additionalCommission) {
    this.additionalCommission = additionalCommission;
    return this;
  }

   /**
   * Get additionalCommission
   * @return additionalCommission
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_COMMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdditionalCommission getAdditionalCommission() {
    return additionalCommission;
  }


 /**
  * additionalCommission
  *
  * @param additionalCommission
  */ 
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_COMMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalCommission(AdditionalCommission additionalCommission) {
    this.additionalCommission = additionalCommission;
  }


  public UpdateSplitConfigurationLogicRequest adyenCommission(AdyenCommissionEnum adyenCommission) {
    this.adyenCommission = adyenCommission;
    return this;
  }

   /**
   * Specifies the logic to apply when booking the transaction fees. Should be combined with schemeFee, interchange &amp; adyenMarkup.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
   * @return adyenCommission
  **/
  @ApiModelProperty(value = "Specifies the logic to apply when booking the transaction fees. Should be combined with schemeFee, interchange & adyenMarkup.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.")
  @JsonProperty(JSON_PROPERTY_ADYEN_COMMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdyenCommissionEnum getAdyenCommission() {
    return adyenCommission;
  }


 /**
  * Specifies the logic to apply when booking the transaction fees. Should be combined with schemeFee, interchange &amp; adyenMarkup.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
  *
  * @param adyenCommission
  */ 
  @JsonProperty(JSON_PROPERTY_ADYEN_COMMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdyenCommission(AdyenCommissionEnum adyenCommission) {
    this.adyenCommission = adyenCommission;
  }


  public UpdateSplitConfigurationLogicRequest adyenFees(AdyenFeesEnum adyenFees) {
    this.adyenFees = adyenFees;
    return this;
  }

   /**
   * Specifies the logic to apply when booking the transaction fees. Should be combined with acquiringFees.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
   * @return adyenFees
  **/
  @ApiModelProperty(value = "Specifies the logic to apply when booking the transaction fees. Should be combined with acquiringFees.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.")
  @JsonProperty(JSON_PROPERTY_ADYEN_FEES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdyenFeesEnum getAdyenFees() {
    return adyenFees;
  }


 /**
  * Specifies the logic to apply when booking the transaction fees. Should be combined with acquiringFees.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
  *
  * @param adyenFees
  */ 
  @JsonProperty(JSON_PROPERTY_ADYEN_FEES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdyenFees(AdyenFeesEnum adyenFees) {
    this.adyenFees = adyenFees;
  }


  public UpdateSplitConfigurationLogicRequest adyenMarkup(AdyenMarkupEnum adyenMarkup) {
    this.adyenMarkup = adyenMarkup;
    return this;
  }

   /**
   * Specifies the logic to apply when booking the transaction fees. Should be combined with schemeFee, adyenCommission &amp; interchange.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
   * @return adyenMarkup
  **/
  @ApiModelProperty(value = "Specifies the logic to apply when booking the transaction fees. Should be combined with schemeFee, adyenCommission & interchange.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.")
  @JsonProperty(JSON_PROPERTY_ADYEN_MARKUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdyenMarkupEnum getAdyenMarkup() {
    return adyenMarkup;
  }


 /**
  * Specifies the logic to apply when booking the transaction fees. Should be combined with schemeFee, adyenCommission &amp; interchange.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
  *
  * @param adyenMarkup
  */ 
  @JsonProperty(JSON_PROPERTY_ADYEN_MARKUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdyenMarkup(AdyenMarkupEnum adyenMarkup) {
    this.adyenMarkup = adyenMarkup;
  }


  public UpdateSplitConfigurationLogicRequest chargeback(ChargebackEnum chargeback) {
    this.chargeback = chargeback;
    return this;
  }

   /**
   * Specifies the logic to apply when booking the chargeback amount.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**, **deductAccordingToSplitRatio**.
   * @return chargeback
  **/
  @ApiModelProperty(value = "Specifies the logic to apply when booking the chargeback amount.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**, **deductAccordingToSplitRatio**.")
  @JsonProperty(JSON_PROPERTY_CHARGEBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargebackEnum getChargeback() {
    return chargeback;
  }


 /**
  * Specifies the logic to apply when booking the chargeback amount.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**, **deductAccordingToSplitRatio**.
  *
  * @param chargeback
  */ 
  @JsonProperty(JSON_PROPERTY_CHARGEBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChargeback(ChargebackEnum chargeback) {
    this.chargeback = chargeback;
  }


  public UpdateSplitConfigurationLogicRequest chargebackCostAllocation(ChargebackCostAllocationEnum chargebackCostAllocation) {
    this.chargebackCostAllocation = chargebackCostAllocation;
    return this;
  }

   /**
   * Specifies the logic to apply when allocating the chargeback costs.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**
   * @return chargebackCostAllocation
  **/
  @ApiModelProperty(value = "Specifies the logic to apply when allocating the chargeback costs.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**")
  @JsonProperty(JSON_PROPERTY_CHARGEBACK_COST_ALLOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargebackCostAllocationEnum getChargebackCostAllocation() {
    return chargebackCostAllocation;
  }


 /**
  * Specifies the logic to apply when allocating the chargeback costs.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**
  *
  * @param chargebackCostAllocation
  */ 
  @JsonProperty(JSON_PROPERTY_CHARGEBACK_COST_ALLOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChargebackCostAllocation(ChargebackCostAllocationEnum chargebackCostAllocation) {
    this.chargebackCostAllocation = chargebackCostAllocation;
  }


  public UpdateSplitConfigurationLogicRequest commission(Commission commission) {
    this.commission = commission;
    return this;
  }

   /**
   * Get commission
   * @return commission
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COMMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Commission getCommission() {
    return commission;
  }


 /**
  * commission
  *
  * @param commission
  */ 
  @JsonProperty(JSON_PROPERTY_COMMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommission(Commission commission) {
    this.commission = commission;
  }


  public UpdateSplitConfigurationLogicRequest interchange(InterchangeEnum interchange) {
    this.interchange = interchange;
    return this;
  }

   /**
   * Specifies the logic to apply when booking the transaction fees. Should be combined with schemeFee, adyenCommission &amp; adyenMarkup.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
   * @return interchange
  **/
  @ApiModelProperty(value = "Specifies the logic to apply when booking the transaction fees. Should be combined with schemeFee, adyenCommission & adyenMarkup.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.")
  @JsonProperty(JSON_PROPERTY_INTERCHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InterchangeEnum getInterchange() {
    return interchange;
  }


 /**
  * Specifies the logic to apply when booking the transaction fees. Should be combined with schemeFee, adyenCommission &amp; adyenMarkup.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
  *
  * @param interchange
  */ 
  @JsonProperty(JSON_PROPERTY_INTERCHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterchange(InterchangeEnum interchange) {
    this.interchange = interchange;
  }


  public UpdateSplitConfigurationLogicRequest paymentFee(PaymentFeeEnum paymentFee) {
    this.paymentFee = paymentFee;
    return this;
  }

   /**
   * Specifies the logic to apply when booking the transaction fees. Cannot be combined with other fees.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
   * @return paymentFee
  **/
  @ApiModelProperty(value = "Specifies the logic to apply when booking the transaction fees. Cannot be combined with other fees.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentFeeEnum getPaymentFee() {
    return paymentFee;
  }


 /**
  * Specifies the logic to apply when booking the transaction fees. Cannot be combined with other fees.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
  *
  * @param paymentFee
  */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentFee(PaymentFeeEnum paymentFee) {
    this.paymentFee = paymentFee;
  }


  public UpdateSplitConfigurationLogicRequest remainder(RemainderEnum remainder) {
    this.remainder = remainder;
    return this;
  }

   /**
   * Specifies the logic to apply when booking the amount left over after currency conversion.  Possible values: **addToLiableAccount**, **addToOneBalanceAccount**.
   * @return remainder
  **/
  @ApiModelProperty(value = "Specifies the logic to apply when booking the amount left over after currency conversion.  Possible values: **addToLiableAccount**, **addToOneBalanceAccount**.")
  @JsonProperty(JSON_PROPERTY_REMAINDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RemainderEnum getRemainder() {
    return remainder;
  }


 /**
  * Specifies the logic to apply when booking the amount left over after currency conversion.  Possible values: **addToLiableAccount**, **addToOneBalanceAccount**.
  *
  * @param remainder
  */ 
  @JsonProperty(JSON_PROPERTY_REMAINDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemainder(RemainderEnum remainder) {
    this.remainder = remainder;
  }


  public UpdateSplitConfigurationLogicRequest schemeFee(SchemeFeeEnum schemeFee) {
    this.schemeFee = schemeFee;
    return this;
  }

   /**
   * Specifies the logic to apply when booking the transaction fees. Should be combined with interchange, adyenCommission &amp; adyenMarkup.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
   * @return schemeFee
  **/
  @ApiModelProperty(value = "Specifies the logic to apply when booking the transaction fees. Should be combined with interchange, adyenCommission & adyenMarkup.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.")
  @JsonProperty(JSON_PROPERTY_SCHEME_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SchemeFeeEnum getSchemeFee() {
    return schemeFee;
  }


 /**
  * Specifies the logic to apply when booking the transaction fees. Should be combined with interchange, adyenCommission &amp; adyenMarkup.  Possible values: **deductFromLiableAccount**, **deductFromOneBalanceAccount**.
  *
  * @param schemeFee
  */ 
  @JsonProperty(JSON_PROPERTY_SCHEME_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchemeFee(SchemeFeeEnum schemeFee) {
    this.schemeFee = schemeFee;
  }


  public UpdateSplitConfigurationLogicRequest splitLogicId(String splitLogicId) {
    this.splitLogicId = splitLogicId;
    return this;
  }

   /**
   * Unique identifier of the split logic that is applied when the split configuration conditions are met.
   * @return splitLogicId
  **/
  @ApiModelProperty(value = "Unique identifier of the split logic that is applied when the split configuration conditions are met.")
  @JsonProperty(JSON_PROPERTY_SPLIT_LOGIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSplitLogicId() {
    return splitLogicId;
  }


 /**
  * Unique identifier of the split logic that is applied when the split configuration conditions are met.
  *
  * @param splitLogicId
  */ 
  @JsonProperty(JSON_PROPERTY_SPLIT_LOGIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSplitLogicId(String splitLogicId) {
    this.splitLogicId = splitLogicId;
  }


  public UpdateSplitConfigurationLogicRequest surcharge(SurchargeEnum surcharge) {
    this.surcharge = surcharge;
    return this;
  }

   /**
   * Specifies the logic to apply when booking the surcharge amount.  Possible values: **addToLiableAccount**, **addToOneBalanceAccount**
   * @return surcharge
  **/
  @ApiModelProperty(value = "Specifies the logic to apply when booking the surcharge amount.  Possible values: **addToLiableAccount**, **addToOneBalanceAccount**")
  @JsonProperty(JSON_PROPERTY_SURCHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SurchargeEnum getSurcharge() {
    return surcharge;
  }


 /**
  * Specifies the logic to apply when booking the surcharge amount.  Possible values: **addToLiableAccount**, **addToOneBalanceAccount**
  *
  * @param surcharge
  */ 
  @JsonProperty(JSON_PROPERTY_SURCHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSurcharge(SurchargeEnum surcharge) {
    this.surcharge = surcharge;
  }


  public UpdateSplitConfigurationLogicRequest tip(TipEnum tip) {
    this.tip = tip;
    return this;
  }

   /**
   * Specifies the logic to apply when booking tips (gratuity).  Possible values: **addToLiableAccount**, **addToOneBalanceAccount**.
   * @return tip
  **/
  @ApiModelProperty(value = "Specifies the logic to apply when booking tips (gratuity).  Possible values: **addToLiableAccount**, **addToOneBalanceAccount**.")
  @JsonProperty(JSON_PROPERTY_TIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TipEnum getTip() {
    return tip;
  }


 /**
  * Specifies the logic to apply when booking tips (gratuity).  Possible values: **addToLiableAccount**, **addToOneBalanceAccount**.
  *
  * @param tip
  */ 
  @JsonProperty(JSON_PROPERTY_TIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTip(TipEnum tip) {
    this.tip = tip;
  }


  /**
   * Return true if this UpdateSplitConfigurationLogicRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSplitConfigurationLogicRequest updateSplitConfigurationLogicRequest = (UpdateSplitConfigurationLogicRequest) o;
    return Objects.equals(this.acquiringFees, updateSplitConfigurationLogicRequest.acquiringFees) &&
        Objects.equals(this.additionalCommission, updateSplitConfigurationLogicRequest.additionalCommission) &&
        Objects.equals(this.adyenCommission, updateSplitConfigurationLogicRequest.adyenCommission) &&
        Objects.equals(this.adyenFees, updateSplitConfigurationLogicRequest.adyenFees) &&
        Objects.equals(this.adyenMarkup, updateSplitConfigurationLogicRequest.adyenMarkup) &&
        Objects.equals(this.chargeback, updateSplitConfigurationLogicRequest.chargeback) &&
        Objects.equals(this.chargebackCostAllocation, updateSplitConfigurationLogicRequest.chargebackCostAllocation) &&
        Objects.equals(this.commission, updateSplitConfigurationLogicRequest.commission) &&
        Objects.equals(this.interchange, updateSplitConfigurationLogicRequest.interchange) &&
        Objects.equals(this.paymentFee, updateSplitConfigurationLogicRequest.paymentFee) &&
        Objects.equals(this.remainder, updateSplitConfigurationLogicRequest.remainder) &&
        Objects.equals(this.schemeFee, updateSplitConfigurationLogicRequest.schemeFee) &&
        Objects.equals(this.splitLogicId, updateSplitConfigurationLogicRequest.splitLogicId) &&
        Objects.equals(this.surcharge, updateSplitConfigurationLogicRequest.surcharge) &&
        Objects.equals(this.tip, updateSplitConfigurationLogicRequest.tip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquiringFees, additionalCommission, adyenCommission, adyenFees, adyenMarkup, chargeback, chargebackCostAllocation, commission, interchange, paymentFee, remainder, schemeFee, splitLogicId, surcharge, tip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSplitConfigurationLogicRequest {\n");
    sb.append("    acquiringFees: ").append(toIndentedString(acquiringFees)).append("\n");
    sb.append("    additionalCommission: ").append(toIndentedString(additionalCommission)).append("\n");
    sb.append("    adyenCommission: ").append(toIndentedString(adyenCommission)).append("\n");
    sb.append("    adyenFees: ").append(toIndentedString(adyenFees)).append("\n");
    sb.append("    adyenMarkup: ").append(toIndentedString(adyenMarkup)).append("\n");
    sb.append("    chargeback: ").append(toIndentedString(chargeback)).append("\n");
    sb.append("    chargebackCostAllocation: ").append(toIndentedString(chargebackCostAllocation)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    interchange: ").append(toIndentedString(interchange)).append("\n");
    sb.append("    paymentFee: ").append(toIndentedString(paymentFee)).append("\n");
    sb.append("    remainder: ").append(toIndentedString(remainder)).append("\n");
    sb.append("    schemeFee: ").append(toIndentedString(schemeFee)).append("\n");
    sb.append("    splitLogicId: ").append(toIndentedString(splitLogicId)).append("\n");
    sb.append("    surcharge: ").append(toIndentedString(surcharge)).append("\n");
    sb.append("    tip: ").append(toIndentedString(tip)).append("\n");
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
   * Create an instance of UpdateSplitConfigurationLogicRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateSplitConfigurationLogicRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to UpdateSplitConfigurationLogicRequest
   */
  public static UpdateSplitConfigurationLogicRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, UpdateSplitConfigurationLogicRequest.class);
  }
/**
  * Convert an instance of UpdateSplitConfigurationLogicRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

