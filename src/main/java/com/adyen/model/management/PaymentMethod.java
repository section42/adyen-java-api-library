/*
 * Management API
 *
 * The version of the OpenAPI document: 1
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
import com.adyen.model.management.AfterpayTouchInfo;
import com.adyen.model.management.ApplePayInfo;
import com.adyen.model.management.BcmcInfo;
import com.adyen.model.management.CartesBancairesInfo;
import com.adyen.model.management.ClearpayInfo;
import com.adyen.model.management.GiroPayInfo;
import com.adyen.model.management.GooglePayInfo;
import com.adyen.model.management.KlarnaInfo;
import com.adyen.model.management.MealVoucherFRInfo;
import com.adyen.model.management.PayPalInfo;
import com.adyen.model.management.SofortInfo;
import com.adyen.model.management.SwishInfo;
import com.adyen.model.management.TwintInfo;
import com.adyen.model.management.VippsInfo;
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
 * PaymentMethod
 */
@JsonPropertyOrder({
  PaymentMethod.JSON_PROPERTY_AFTERPAY_TOUCH,
  PaymentMethod.JSON_PROPERTY_ALLOWED,
  PaymentMethod.JSON_PROPERTY_APPLE_PAY,
  PaymentMethod.JSON_PROPERTY_BCMC,
  PaymentMethod.JSON_PROPERTY_BUSINESS_LINE_ID,
  PaymentMethod.JSON_PROPERTY_CARTES_BANCAIRES,
  PaymentMethod.JSON_PROPERTY_CLEARPAY,
  PaymentMethod.JSON_PROPERTY_COUNTRIES,
  PaymentMethod.JSON_PROPERTY_CURRENCIES,
  PaymentMethod.JSON_PROPERTY_CUSTOM_ROUTING_FLAGS,
  PaymentMethod.JSON_PROPERTY_ENABLED,
  PaymentMethod.JSON_PROPERTY_GIRO_PAY,
  PaymentMethod.JSON_PROPERTY_GOOGLE_PAY,
  PaymentMethod.JSON_PROPERTY_ID,
  PaymentMethod.JSON_PROPERTY_KLARNA,
  PaymentMethod.JSON_PROPERTY_MEAL_VOUCHER_F_R,
  PaymentMethod.JSON_PROPERTY_PAYPAL,
  PaymentMethod.JSON_PROPERTY_REFERENCE,
  PaymentMethod.JSON_PROPERTY_SHOPPER_INTERACTION,
  PaymentMethod.JSON_PROPERTY_SOFORT,
  PaymentMethod.JSON_PROPERTY_STORE_ID,
  PaymentMethod.JSON_PROPERTY_SWISH,
  PaymentMethod.JSON_PROPERTY_TWINT,
  PaymentMethod.JSON_PROPERTY_TYPE,
  PaymentMethod.JSON_PROPERTY_VERIFICATION_STATUS,
  PaymentMethod.JSON_PROPERTY_VIPPS
})

public class PaymentMethod {
  public static final String JSON_PROPERTY_AFTERPAY_TOUCH = "afterpayTouch";
  private AfterpayTouchInfo afterpayTouch;

  public static final String JSON_PROPERTY_ALLOWED = "allowed";
  private Boolean allowed;

  public static final String JSON_PROPERTY_APPLE_PAY = "applePay";
  private ApplePayInfo applePay;

  public static final String JSON_PROPERTY_BCMC = "bcmc";
  private BcmcInfo bcmc;

  public static final String JSON_PROPERTY_BUSINESS_LINE_ID = "businessLineId";
  private String businessLineId;

  public static final String JSON_PROPERTY_CARTES_BANCAIRES = "cartesBancaires";
  private CartesBancairesInfo cartesBancaires;

  public static final String JSON_PROPERTY_CLEARPAY = "clearpay";
  private ClearpayInfo clearpay;

  public static final String JSON_PROPERTY_COUNTRIES = "countries";
  private List<String> countries = null;

  public static final String JSON_PROPERTY_CURRENCIES = "currencies";
  private List<String> currencies = null;

  public static final String JSON_PROPERTY_CUSTOM_ROUTING_FLAGS = "customRoutingFlags";
  private List<String> customRoutingFlags = null;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_GIRO_PAY = "giroPay";
  private GiroPayInfo giroPay;

  public static final String JSON_PROPERTY_GOOGLE_PAY = "googlePay";
  private GooglePayInfo googlePay;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_KLARNA = "klarna";
  private KlarnaInfo klarna;

  public static final String JSON_PROPERTY_MEAL_VOUCHER_F_R = "mealVoucher_FR";
  private MealVoucherFRInfo mealVoucherFR;

  public static final String JSON_PROPERTY_PAYPAL = "paypal";
  private PayPalInfo paypal;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_SHOPPER_INTERACTION = "shopperInteraction";
  private String shopperInteraction;

  public static final String JSON_PROPERTY_SOFORT = "sofort";
  private SofortInfo sofort;

  public static final String JSON_PROPERTY_STORE_ID = "storeId";
  private String storeId;

  public static final String JSON_PROPERTY_SWISH = "swish";
  private SwishInfo swish;

  public static final String JSON_PROPERTY_TWINT = "twint";
  private TwintInfo twint;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  /**
   * Payment method status. Possible values: * **valid** * **pending** * **invalid** * **rejected**
   */
  public enum VerificationStatusEnum {
    VALID("valid"),
    
    PENDING("pending"),
    
    INVALID("invalid"),
    
    REJECTED("rejected");

    private String value;

    VerificationStatusEnum(String value) {
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
    public static VerificationStatusEnum fromValue(String value) {
      for (VerificationStatusEnum b : VerificationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VERIFICATION_STATUS = "verificationStatus";
  private VerificationStatusEnum verificationStatus;

  public static final String JSON_PROPERTY_VIPPS = "vipps";
  private VippsInfo vipps;

  public PaymentMethod() { 
  }

  public PaymentMethod afterpayTouch(AfterpayTouchInfo afterpayTouch) {
    this.afterpayTouch = afterpayTouch;
    return this;
  }

   /**
   * Get afterpayTouch
   * @return afterpayTouch
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AFTERPAY_TOUCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AfterpayTouchInfo getAfterpayTouch() {
    return afterpayTouch;
  }


  @JsonProperty(JSON_PROPERTY_AFTERPAY_TOUCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAfterpayTouch(AfterpayTouchInfo afterpayTouch) {
    this.afterpayTouch = afterpayTouch;
  }


  public PaymentMethod allowed(Boolean allowed) {
    this.allowed = allowed;
    return this;
  }

   /**
   * Indicates whether receiving payments is allowed. This value is set to **true** by Adyen after screening your merchant account.
   * @return allowed
  **/
  @ApiModelProperty(value = "Indicates whether receiving payments is allowed. This value is set to **true** by Adyen after screening your merchant account.")
  @JsonProperty(JSON_PROPERTY_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowed() {
    return allowed;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }


  public PaymentMethod applePay(ApplePayInfo applePay) {
    this.applePay = applePay;
    return this;
  }

   /**
   * Get applePay
   * @return applePay
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APPLE_PAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApplePayInfo getApplePay() {
    return applePay;
  }


  @JsonProperty(JSON_PROPERTY_APPLE_PAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplePay(ApplePayInfo applePay) {
    this.applePay = applePay;
  }


  public PaymentMethod bcmc(BcmcInfo bcmc) {
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


  public PaymentMethod businessLineId(String businessLineId) {
    this.businessLineId = businessLineId;
    return this;
  }

   /**
   * The unique identifier of the business line.
   * @return businessLineId
  **/
  @ApiModelProperty(value = "The unique identifier of the business line.")
  @JsonProperty(JSON_PROPERTY_BUSINESS_LINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessLineId() {
    return businessLineId;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_LINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessLineId(String businessLineId) {
    this.businessLineId = businessLineId;
  }


  public PaymentMethod cartesBancaires(CartesBancairesInfo cartesBancaires) {
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


  public PaymentMethod clearpay(ClearpayInfo clearpay) {
    this.clearpay = clearpay;
    return this;
  }

   /**
   * Get clearpay
   * @return clearpay
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLEARPAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ClearpayInfo getClearpay() {
    return clearpay;
  }


  @JsonProperty(JSON_PROPERTY_CLEARPAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClearpay(ClearpayInfo clearpay) {
    this.clearpay = clearpay;
  }


  public PaymentMethod countries(List<String> countries) {
    this.countries = countries;
    return this;
  }

  public PaymentMethod addCountriesItem(String countriesItem) {
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


  public PaymentMethod currencies(List<String> currencies) {
    this.currencies = currencies;
    return this;
  }

  public PaymentMethod addCurrenciesItem(String currenciesItem) {
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


  public PaymentMethod customRoutingFlags(List<String> customRoutingFlags) {
    this.customRoutingFlags = customRoutingFlags;
    return this;
  }

  public PaymentMethod addCustomRoutingFlagsItem(String customRoutingFlagsItem) {
    if (this.customRoutingFlags == null) {
      this.customRoutingFlags = new ArrayList<>();
    }
    this.customRoutingFlags.add(customRoutingFlagsItem);
    return this;
  }

   /**
   * The list of custom routing flags to route payment to the intended acquirer.
   * @return customRoutingFlags
  **/
  @ApiModelProperty(value = "The list of custom routing flags to route payment to the intended acquirer.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_ROUTING_FLAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCustomRoutingFlags() {
    return customRoutingFlags;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_ROUTING_FLAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomRoutingFlags(List<String> customRoutingFlags) {
    this.customRoutingFlags = customRoutingFlags;
  }


  public PaymentMethod enabled(Boolean enabled) {
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


  public PaymentMethod giroPay(GiroPayInfo giroPay) {
    this.giroPay = giroPay;
    return this;
  }

   /**
   * Get giroPay
   * @return giroPay
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GIRO_PAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GiroPayInfo getGiroPay() {
    return giroPay;
  }


  @JsonProperty(JSON_PROPERTY_GIRO_PAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGiroPay(GiroPayInfo giroPay) {
    this.giroPay = giroPay;
  }


  public PaymentMethod googlePay(GooglePayInfo googlePay) {
    this.googlePay = googlePay;
    return this;
  }

   /**
   * Get googlePay
   * @return googlePay
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GOOGLE_PAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GooglePayInfo getGooglePay() {
    return googlePay;
  }


  @JsonProperty(JSON_PROPERTY_GOOGLE_PAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGooglePay(GooglePayInfo googlePay) {
    this.googlePay = googlePay;
  }


  public PaymentMethod id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier of the resource.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The identifier of the resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public PaymentMethod klarna(KlarnaInfo klarna) {
    this.klarna = klarna;
    return this;
  }

   /**
   * Get klarna
   * @return klarna
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KLARNA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KlarnaInfo getKlarna() {
    return klarna;
  }


  @JsonProperty(JSON_PROPERTY_KLARNA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKlarna(KlarnaInfo klarna) {
    this.klarna = klarna;
  }


  public PaymentMethod mealVoucherFR(MealVoucherFRInfo mealVoucherFR) {
    this.mealVoucherFR = mealVoucherFR;
    return this;
  }

   /**
   * Get mealVoucherFR
   * @return mealVoucherFR
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEAL_VOUCHER_F_R)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MealVoucherFRInfo getMealVoucherFR() {
    return mealVoucherFR;
  }


  @JsonProperty(JSON_PROPERTY_MEAL_VOUCHER_F_R)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMealVoucherFR(MealVoucherFRInfo mealVoucherFR) {
    this.mealVoucherFR = mealVoucherFR;
  }


  public PaymentMethod paypal(PayPalInfo paypal) {
    this.paypal = paypal;
    return this;
  }

   /**
   * Get paypal
   * @return paypal
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYPAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PayPalInfo getPaypal() {
    return paypal;
  }


  @JsonProperty(JSON_PROPERTY_PAYPAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaypal(PayPalInfo paypal) {
    this.paypal = paypal;
  }


  public PaymentMethod reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the payment method. Supported characters a-z, A-Z, 0-9.
   * @return reference
  **/
  @ApiModelProperty(value = "Your reference for the payment method. Supported characters a-z, A-Z, 0-9.")
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


  public PaymentMethod shopperInteraction(String shopperInteraction) {
    this.shopperInteraction = shopperInteraction;
    return this;
  }

   /**
   * The sales channel.
   * @return shopperInteraction
  **/
  @ApiModelProperty(value = "The sales channel.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_INTERACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShopperInteraction() {
    return shopperInteraction;
  }


  @JsonProperty(JSON_PROPERTY_SHOPPER_INTERACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperInteraction(String shopperInteraction) {
    this.shopperInteraction = shopperInteraction;
  }


  public PaymentMethod sofort(SofortInfo sofort) {
    this.sofort = sofort;
    return this;
  }

   /**
   * Get sofort
   * @return sofort
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOFORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SofortInfo getSofort() {
    return sofort;
  }


  @JsonProperty(JSON_PROPERTY_SOFORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSofort(SofortInfo sofort) {
    this.sofort = sofort;
  }


  public PaymentMethod storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * The ID of the [store](https://docs.adyen.com/api-explorer/#/ManagementService/latest/post/stores__resParam_id), if any.
   * @return storeId
  **/
  @ApiModelProperty(value = "The ID of the [store](https://docs.adyen.com/api-explorer/#/ManagementService/latest/post/stores__resParam_id), if any.")
  @JsonProperty(JSON_PROPERTY_STORE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStoreId() {
    return storeId;
  }


  @JsonProperty(JSON_PROPERTY_STORE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public PaymentMethod swish(SwishInfo swish) {
    this.swish = swish;
    return this;
  }

   /**
   * Get swish
   * @return swish
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SWISH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SwishInfo getSwish() {
    return swish;
  }


  @JsonProperty(JSON_PROPERTY_SWISH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSwish(SwishInfo swish) {
    this.swish = swish;
  }


  public PaymentMethod twint(TwintInfo twint) {
    this.twint = twint;
    return this;
  }

   /**
   * Get twint
   * @return twint
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TWINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TwintInfo getTwint() {
    return twint;
  }


  @JsonProperty(JSON_PROPERTY_TWINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTwint(TwintInfo twint) {
    this.twint = twint;
  }


  public PaymentMethod type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Payment method [variant](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api).
   * @return type
  **/
  @ApiModelProperty(value = "Payment method [variant](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api).")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public PaymentMethod verificationStatus(VerificationStatusEnum verificationStatus) {
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * Payment method status. Possible values: * **valid** * **pending** * **invalid** * **rejected**
   * @return verificationStatus
  **/
  @ApiModelProperty(value = "Payment method status. Possible values: * **valid** * **pending** * **invalid** * **rejected**")
  @JsonProperty(JSON_PROPERTY_VERIFICATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VerificationStatusEnum getVerificationStatus() {
    return verificationStatus;
  }


  @JsonProperty(JSON_PROPERTY_VERIFICATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerificationStatus(VerificationStatusEnum verificationStatus) {
    this.verificationStatus = verificationStatus;
  }


  public PaymentMethod vipps(VippsInfo vipps) {
    this.vipps = vipps;
    return this;
  }

   /**
   * Get vipps
   * @return vipps
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIPPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VippsInfo getVipps() {
    return vipps;
  }


  @JsonProperty(JSON_PROPERTY_VIPPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVipps(VippsInfo vipps) {
    this.vipps = vipps;
  }


  /**
   * Return true if this PaymentMethod object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethod paymentMethod = (PaymentMethod) o;
    return Objects.equals(this.afterpayTouch, paymentMethod.afterpayTouch) &&
        Objects.equals(this.allowed, paymentMethod.allowed) &&
        Objects.equals(this.applePay, paymentMethod.applePay) &&
        Objects.equals(this.bcmc, paymentMethod.bcmc) &&
        Objects.equals(this.businessLineId, paymentMethod.businessLineId) &&
        Objects.equals(this.cartesBancaires, paymentMethod.cartesBancaires) &&
        Objects.equals(this.clearpay, paymentMethod.clearpay) &&
        Objects.equals(this.countries, paymentMethod.countries) &&
        Objects.equals(this.currencies, paymentMethod.currencies) &&
        Objects.equals(this.customRoutingFlags, paymentMethod.customRoutingFlags) &&
        Objects.equals(this.enabled, paymentMethod.enabled) &&
        Objects.equals(this.giroPay, paymentMethod.giroPay) &&
        Objects.equals(this.googlePay, paymentMethod.googlePay) &&
        Objects.equals(this.id, paymentMethod.id) &&
        Objects.equals(this.klarna, paymentMethod.klarna) &&
        Objects.equals(this.mealVoucherFR, paymentMethod.mealVoucherFR) &&
        Objects.equals(this.paypal, paymentMethod.paypal) &&
        Objects.equals(this.reference, paymentMethod.reference) &&
        Objects.equals(this.shopperInteraction, paymentMethod.shopperInteraction) &&
        Objects.equals(this.sofort, paymentMethod.sofort) &&
        Objects.equals(this.storeId, paymentMethod.storeId) &&
        Objects.equals(this.swish, paymentMethod.swish) &&
        Objects.equals(this.twint, paymentMethod.twint) &&
        Objects.equals(this.type, paymentMethod.type) &&
        Objects.equals(this.verificationStatus, paymentMethod.verificationStatus) &&
        Objects.equals(this.vipps, paymentMethod.vipps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afterpayTouch, allowed, applePay, bcmc, businessLineId, cartesBancaires, clearpay, countries, currencies, customRoutingFlags, enabled, giroPay, googlePay, id, klarna, mealVoucherFR, paypal, reference, shopperInteraction, sofort, storeId, swish, twint, type, verificationStatus, vipps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethod {\n");
    sb.append("    afterpayTouch: ").append(toIndentedString(afterpayTouch)).append("\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    applePay: ").append(toIndentedString(applePay)).append("\n");
    sb.append("    bcmc: ").append(toIndentedString(bcmc)).append("\n");
    sb.append("    businessLineId: ").append(toIndentedString(businessLineId)).append("\n");
    sb.append("    cartesBancaires: ").append(toIndentedString(cartesBancaires)).append("\n");
    sb.append("    clearpay: ").append(toIndentedString(clearpay)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
    sb.append("    customRoutingFlags: ").append(toIndentedString(customRoutingFlags)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    giroPay: ").append(toIndentedString(giroPay)).append("\n");
    sb.append("    googlePay: ").append(toIndentedString(googlePay)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    klarna: ").append(toIndentedString(klarna)).append("\n");
    sb.append("    mealVoucherFR: ").append(toIndentedString(mealVoucherFR)).append("\n");
    sb.append("    paypal: ").append(toIndentedString(paypal)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    shopperInteraction: ").append(toIndentedString(shopperInteraction)).append("\n");
    sb.append("    sofort: ").append(toIndentedString(sofort)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    swish: ").append(toIndentedString(swish)).append("\n");
    sb.append("    twint: ").append(toIndentedString(twint)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
    sb.append("    vipps: ").append(toIndentedString(vipps)).append("\n");
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
   * Create an instance of PaymentMethod given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentMethod
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaymentMethod
   */
  public static PaymentMethod fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaymentMethod.class);
  }
/**
  * Convert an instance of PaymentMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

