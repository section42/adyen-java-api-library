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
import com.adyen.model.management.CardholderReceipt;
import com.adyen.model.management.Connectivity;
import com.adyen.model.management.Gratuity;
import com.adyen.model.management.Hardware;
import com.adyen.model.management.Nexo;
import com.adyen.model.management.OfflineProcessing;
import com.adyen.model.management.Opi;
import com.adyen.model.management.Passcodes;
import com.adyen.model.management.PayAtTable;
import com.adyen.model.management.Payment;
import com.adyen.model.management.ReceiptOptions;
import com.adyen.model.management.ReceiptPrinting;
import com.adyen.model.management.Signature;
import com.adyen.model.management.Standalone;
import com.adyen.model.management.Surcharge;
import com.adyen.model.management.Timeouts;
import com.adyen.model.management.WifiProfiles;
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
 * TerminalSettings
 */
@JsonPropertyOrder({
  TerminalSettings.JSON_PROPERTY_CARDHOLDER_RECEIPT,
  TerminalSettings.JSON_PROPERTY_CONNECTIVITY,
  TerminalSettings.JSON_PROPERTY_GRATUITIES,
  TerminalSettings.JSON_PROPERTY_HARDWARE,
  TerminalSettings.JSON_PROPERTY_NEXO,
  TerminalSettings.JSON_PROPERTY_OFFLINE_PROCESSING,
  TerminalSettings.JSON_PROPERTY_OPI,
  TerminalSettings.JSON_PROPERTY_PASSCODES,
  TerminalSettings.JSON_PROPERTY_PAY_AT_TABLE,
  TerminalSettings.JSON_PROPERTY_PAYMENT,
  TerminalSettings.JSON_PROPERTY_RECEIPT_OPTIONS,
  TerminalSettings.JSON_PROPERTY_RECEIPT_PRINTING,
  TerminalSettings.JSON_PROPERTY_SIGNATURE,
  TerminalSettings.JSON_PROPERTY_STANDALONE,
  TerminalSettings.JSON_PROPERTY_SURCHARGE,
  TerminalSettings.JSON_PROPERTY_TIMEOUTS,
  TerminalSettings.JSON_PROPERTY_WIFI_PROFILES
})

public class TerminalSettings {
  public static final String JSON_PROPERTY_CARDHOLDER_RECEIPT = "cardholderReceipt";
  private CardholderReceipt cardholderReceipt;

  public static final String JSON_PROPERTY_CONNECTIVITY = "connectivity";
  private Connectivity connectivity;

  public static final String JSON_PROPERTY_GRATUITIES = "gratuities";
  private List<Gratuity> gratuities = null;

  public static final String JSON_PROPERTY_HARDWARE = "hardware";
  private Hardware hardware;

  public static final String JSON_PROPERTY_NEXO = "nexo";
  private Nexo nexo;

  public static final String JSON_PROPERTY_OFFLINE_PROCESSING = "offlineProcessing";
  private OfflineProcessing offlineProcessing;

  public static final String JSON_PROPERTY_OPI = "opi";
  private Opi opi;

  public static final String JSON_PROPERTY_PASSCODES = "passcodes";
  private Passcodes passcodes;

  public static final String JSON_PROPERTY_PAY_AT_TABLE = "payAtTable";
  private PayAtTable payAtTable;

  public static final String JSON_PROPERTY_PAYMENT = "payment";
  private Payment payment;

  public static final String JSON_PROPERTY_RECEIPT_OPTIONS = "receiptOptions";
  private ReceiptOptions receiptOptions;

  public static final String JSON_PROPERTY_RECEIPT_PRINTING = "receiptPrinting";
  private ReceiptPrinting receiptPrinting;

  public static final String JSON_PROPERTY_SIGNATURE = "signature";
  private Signature signature;

  public static final String JSON_PROPERTY_STANDALONE = "standalone";
  private Standalone standalone;

  public static final String JSON_PROPERTY_SURCHARGE = "surcharge";
  private Surcharge surcharge;

  public static final String JSON_PROPERTY_TIMEOUTS = "timeouts";
  private Timeouts timeouts;

  public static final String JSON_PROPERTY_WIFI_PROFILES = "wifiProfiles";
  private WifiProfiles wifiProfiles;

  public TerminalSettings() { 
  }

  public TerminalSettings cardholderReceipt(CardholderReceipt cardholderReceipt) {
    this.cardholderReceipt = cardholderReceipt;
    return this;
  }

   /**
   * Get cardholderReceipt
   * @return cardholderReceipt
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CARDHOLDER_RECEIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CardholderReceipt getCardholderReceipt() {
    return cardholderReceipt;
  }


  @JsonProperty(JSON_PROPERTY_CARDHOLDER_RECEIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardholderReceipt(CardholderReceipt cardholderReceipt) {
    this.cardholderReceipt = cardholderReceipt;
  }


  public TerminalSettings connectivity(Connectivity connectivity) {
    this.connectivity = connectivity;
    return this;
  }

   /**
   * Get connectivity
   * @return connectivity
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONNECTIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Connectivity getConnectivity() {
    return connectivity;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectivity(Connectivity connectivity) {
    this.connectivity = connectivity;
  }


  public TerminalSettings gratuities(List<Gratuity> gratuities) {
    this.gratuities = gratuities;
    return this;
  }

  public TerminalSettings addGratuitiesItem(Gratuity gratuitiesItem) {
    if (this.gratuities == null) {
      this.gratuities = new ArrayList<>();
    }
    this.gratuities.add(gratuitiesItem);
    return this;
  }

   /**
   * Settings for tipping with or without predefined options to choose from. The maximum number of predefined options is four, or three plus the option to enter a custom tip.
   * @return gratuities
  **/
  @ApiModelProperty(value = "Settings for tipping with or without predefined options to choose from. The maximum number of predefined options is four, or three plus the option to enter a custom tip.")
  @JsonProperty(JSON_PROPERTY_GRATUITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Gratuity> getGratuities() {
    return gratuities;
  }


  @JsonProperty(JSON_PROPERTY_GRATUITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGratuities(List<Gratuity> gratuities) {
    this.gratuities = gratuities;
  }


  public TerminalSettings hardware(Hardware hardware) {
    this.hardware = hardware;
    return this;
  }

   /**
   * Get hardware
   * @return hardware
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HARDWARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Hardware getHardware() {
    return hardware;
  }


  @JsonProperty(JSON_PROPERTY_HARDWARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHardware(Hardware hardware) {
    this.hardware = hardware;
  }


  public TerminalSettings nexo(Nexo nexo) {
    this.nexo = nexo;
    return this;
  }

   /**
   * Get nexo
   * @return nexo
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEXO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Nexo getNexo() {
    return nexo;
  }


  @JsonProperty(JSON_PROPERTY_NEXO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNexo(Nexo nexo) {
    this.nexo = nexo;
  }


  public TerminalSettings offlineProcessing(OfflineProcessing offlineProcessing) {
    this.offlineProcessing = offlineProcessing;
    return this;
  }

   /**
   * Get offlineProcessing
   * @return offlineProcessing
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OFFLINE_PROCESSING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OfflineProcessing getOfflineProcessing() {
    return offlineProcessing;
  }


  @JsonProperty(JSON_PROPERTY_OFFLINE_PROCESSING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOfflineProcessing(OfflineProcessing offlineProcessing) {
    this.offlineProcessing = offlineProcessing;
  }


  public TerminalSettings opi(Opi opi) {
    this.opi = opi;
    return this;
  }

   /**
   * Get opi
   * @return opi
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Opi getOpi() {
    return opi;
  }


  @JsonProperty(JSON_PROPERTY_OPI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpi(Opi opi) {
    this.opi = opi;
  }


  public TerminalSettings passcodes(Passcodes passcodes) {
    this.passcodes = passcodes;
    return this;
  }

   /**
   * Get passcodes
   * @return passcodes
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PASSCODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Passcodes getPasscodes() {
    return passcodes;
  }


  @JsonProperty(JSON_PROPERTY_PASSCODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPasscodes(Passcodes passcodes) {
    this.passcodes = passcodes;
  }


  public TerminalSettings payAtTable(PayAtTable payAtTable) {
    this.payAtTable = payAtTable;
    return this;
  }

   /**
   * Get payAtTable
   * @return payAtTable
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAY_AT_TABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PayAtTable getPayAtTable() {
    return payAtTable;
  }


  @JsonProperty(JSON_PROPERTY_PAY_AT_TABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayAtTable(PayAtTable payAtTable) {
    this.payAtTable = payAtTable;
  }


  public TerminalSettings payment(Payment payment) {
    this.payment = payment;
    return this;
  }

   /**
   * Get payment
   * @return payment
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Payment getPayment() {
    return payment;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayment(Payment payment) {
    this.payment = payment;
  }


  public TerminalSettings receiptOptions(ReceiptOptions receiptOptions) {
    this.receiptOptions = receiptOptions;
    return this;
  }

   /**
   * Get receiptOptions
   * @return receiptOptions
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECEIPT_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReceiptOptions getReceiptOptions() {
    return receiptOptions;
  }


  @JsonProperty(JSON_PROPERTY_RECEIPT_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiptOptions(ReceiptOptions receiptOptions) {
    this.receiptOptions = receiptOptions;
  }


  public TerminalSettings receiptPrinting(ReceiptPrinting receiptPrinting) {
    this.receiptPrinting = receiptPrinting;
    return this;
  }

   /**
   * Get receiptPrinting
   * @return receiptPrinting
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECEIPT_PRINTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReceiptPrinting getReceiptPrinting() {
    return receiptPrinting;
  }


  @JsonProperty(JSON_PROPERTY_RECEIPT_PRINTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiptPrinting(ReceiptPrinting receiptPrinting) {
    this.receiptPrinting = receiptPrinting;
  }


  public TerminalSettings signature(Signature signature) {
    this.signature = signature;
    return this;
  }

   /**
   * Get signature
   * @return signature
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Signature getSignature() {
    return signature;
  }


  @JsonProperty(JSON_PROPERTY_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignature(Signature signature) {
    this.signature = signature;
  }


  public TerminalSettings standalone(Standalone standalone) {
    this.standalone = standalone;
    return this;
  }

   /**
   * Get standalone
   * @return standalone
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STANDALONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Standalone getStandalone() {
    return standalone;
  }


  @JsonProperty(JSON_PROPERTY_STANDALONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStandalone(Standalone standalone) {
    this.standalone = standalone;
  }


  public TerminalSettings surcharge(Surcharge surcharge) {
    this.surcharge = surcharge;
    return this;
  }

   /**
   * Get surcharge
   * @return surcharge
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SURCHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Surcharge getSurcharge() {
    return surcharge;
  }


  @JsonProperty(JSON_PROPERTY_SURCHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSurcharge(Surcharge surcharge) {
    this.surcharge = surcharge;
  }


  public TerminalSettings timeouts(Timeouts timeouts) {
    this.timeouts = timeouts;
    return this;
  }

   /**
   * Get timeouts
   * @return timeouts
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIMEOUTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Timeouts getTimeouts() {
    return timeouts;
  }


  @JsonProperty(JSON_PROPERTY_TIMEOUTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeouts(Timeouts timeouts) {
    this.timeouts = timeouts;
  }


  public TerminalSettings wifiProfiles(WifiProfiles wifiProfiles) {
    this.wifiProfiles = wifiProfiles;
    return this;
  }

   /**
   * Get wifiProfiles
   * @return wifiProfiles
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WIFI_PROFILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WifiProfiles getWifiProfiles() {
    return wifiProfiles;
  }


  @JsonProperty(JSON_PROPERTY_WIFI_PROFILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWifiProfiles(WifiProfiles wifiProfiles) {
    this.wifiProfiles = wifiProfiles;
  }


  /**
   * Return true if this TerminalSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalSettings terminalSettings = (TerminalSettings) o;
    return Objects.equals(this.cardholderReceipt, terminalSettings.cardholderReceipt) &&
        Objects.equals(this.connectivity, terminalSettings.connectivity) &&
        Objects.equals(this.gratuities, terminalSettings.gratuities) &&
        Objects.equals(this.hardware, terminalSettings.hardware) &&
        Objects.equals(this.nexo, terminalSettings.nexo) &&
        Objects.equals(this.offlineProcessing, terminalSettings.offlineProcessing) &&
        Objects.equals(this.opi, terminalSettings.opi) &&
        Objects.equals(this.passcodes, terminalSettings.passcodes) &&
        Objects.equals(this.payAtTable, terminalSettings.payAtTable) &&
        Objects.equals(this.payment, terminalSettings.payment) &&
        Objects.equals(this.receiptOptions, terminalSettings.receiptOptions) &&
        Objects.equals(this.receiptPrinting, terminalSettings.receiptPrinting) &&
        Objects.equals(this.signature, terminalSettings.signature) &&
        Objects.equals(this.standalone, terminalSettings.standalone) &&
        Objects.equals(this.surcharge, terminalSettings.surcharge) &&
        Objects.equals(this.timeouts, terminalSettings.timeouts) &&
        Objects.equals(this.wifiProfiles, terminalSettings.wifiProfiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardholderReceipt, connectivity, gratuities, hardware, nexo, offlineProcessing, opi, passcodes, payAtTable, payment, receiptOptions, receiptPrinting, signature, standalone, surcharge, timeouts, wifiProfiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalSettings {\n");
    sb.append("    cardholderReceipt: ").append(toIndentedString(cardholderReceipt)).append("\n");
    sb.append("    connectivity: ").append(toIndentedString(connectivity)).append("\n");
    sb.append("    gratuities: ").append(toIndentedString(gratuities)).append("\n");
    sb.append("    hardware: ").append(toIndentedString(hardware)).append("\n");
    sb.append("    nexo: ").append(toIndentedString(nexo)).append("\n");
    sb.append("    offlineProcessing: ").append(toIndentedString(offlineProcessing)).append("\n");
    sb.append("    opi: ").append(toIndentedString(opi)).append("\n");
    sb.append("    passcodes: ").append(toIndentedString(passcodes)).append("\n");
    sb.append("    payAtTable: ").append(toIndentedString(payAtTable)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    receiptOptions: ").append(toIndentedString(receiptOptions)).append("\n");
    sb.append("    receiptPrinting: ").append(toIndentedString(receiptPrinting)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    standalone: ").append(toIndentedString(standalone)).append("\n");
    sb.append("    surcharge: ").append(toIndentedString(surcharge)).append("\n");
    sb.append("    timeouts: ").append(toIndentedString(timeouts)).append("\n");
    sb.append("    wifiProfiles: ").append(toIndentedString(wifiProfiles)).append("\n");
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
   * Create an instance of TerminalSettings given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TerminalSettings
   * @throws JsonProcessingException if the JSON string is invalid with respect to TerminalSettings
   */
  public static TerminalSettings fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TerminalSettings.class);
  }
/**
  * Convert an instance of TerminalSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

