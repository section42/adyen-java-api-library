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
import com.adyen.service.JSON;


/**
 * ThreeDS2ResponseData
 */
@JsonPropertyOrder({
  ThreeDS2ResponseData.JSON_PROPERTY_ACS_CHALLENGE_MANDATED,
  ThreeDS2ResponseData.JSON_PROPERTY_ACS_OPERATOR_I_D,
  ThreeDS2ResponseData.JSON_PROPERTY_ACS_REFERENCE_NUMBER,
  ThreeDS2ResponseData.JSON_PROPERTY_ACS_SIGNED_CONTENT,
  ThreeDS2ResponseData.JSON_PROPERTY_ACS_TRANS_I_D,
  ThreeDS2ResponseData.JSON_PROPERTY_ACS_U_R_L,
  ThreeDS2ResponseData.JSON_PROPERTY_AUTHENTICATION_TYPE,
  ThreeDS2ResponseData.JSON_PROPERTY_CARD_HOLDER_INFO,
  ThreeDS2ResponseData.JSON_PROPERTY_CAVV_ALGORITHM,
  ThreeDS2ResponseData.JSON_PROPERTY_CHALLENGE_INDICATOR,
  ThreeDS2ResponseData.JSON_PROPERTY_DS_REFERENCE_NUMBER,
  ThreeDS2ResponseData.JSON_PROPERTY_DS_TRANS_I_D,
  ThreeDS2ResponseData.JSON_PROPERTY_EXEMPTION_INDICATOR,
  ThreeDS2ResponseData.JSON_PROPERTY_MESSAGE_VERSION,
  ThreeDS2ResponseData.JSON_PROPERTY_RISK_SCORE,
  ThreeDS2ResponseData.JSON_PROPERTY_SDK_EPHEM_PUB_KEY,
  ThreeDS2ResponseData.JSON_PROPERTY_THREE_D_S_SERVER_TRANS_I_D,
  ThreeDS2ResponseData.JSON_PROPERTY_TRANS_STATUS,
  ThreeDS2ResponseData.JSON_PROPERTY_TRANS_STATUS_REASON
})

public class ThreeDS2ResponseData {
  public static final String JSON_PROPERTY_ACS_CHALLENGE_MANDATED = "acsChallengeMandated";
  private String acsChallengeMandated;

  public static final String JSON_PROPERTY_ACS_OPERATOR_I_D = "acsOperatorID";
  private String acsOperatorID;

  public static final String JSON_PROPERTY_ACS_REFERENCE_NUMBER = "acsReferenceNumber";
  private String acsReferenceNumber;

  public static final String JSON_PROPERTY_ACS_SIGNED_CONTENT = "acsSignedContent";
  private String acsSignedContent;

  public static final String JSON_PROPERTY_ACS_TRANS_I_D = "acsTransID";
  private String acsTransID;

  public static final String JSON_PROPERTY_ACS_U_R_L = "acsURL";
  private String acsURL;

  public static final String JSON_PROPERTY_AUTHENTICATION_TYPE = "authenticationType";
  private String authenticationType;

  public static final String JSON_PROPERTY_CARD_HOLDER_INFO = "cardHolderInfo";
  private String cardHolderInfo;

  public static final String JSON_PROPERTY_CAVV_ALGORITHM = "cavvAlgorithm";
  private String cavvAlgorithm;

  public static final String JSON_PROPERTY_CHALLENGE_INDICATOR = "challengeIndicator";
  private String challengeIndicator;

  public static final String JSON_PROPERTY_DS_REFERENCE_NUMBER = "dsReferenceNumber";
  private String dsReferenceNumber;

  public static final String JSON_PROPERTY_DS_TRANS_I_D = "dsTransID";
  private String dsTransID;

  public static final String JSON_PROPERTY_EXEMPTION_INDICATOR = "exemptionIndicator";
  private String exemptionIndicator;

  public static final String JSON_PROPERTY_MESSAGE_VERSION = "messageVersion";
  private String messageVersion;

  public static final String JSON_PROPERTY_RISK_SCORE = "riskScore";
  private String riskScore;

  public static final String JSON_PROPERTY_SDK_EPHEM_PUB_KEY = "sdkEphemPubKey";
  private String sdkEphemPubKey;

  public static final String JSON_PROPERTY_THREE_D_S_SERVER_TRANS_I_D = "threeDSServerTransID";
  private String threeDSServerTransID;

  public static final String JSON_PROPERTY_TRANS_STATUS = "transStatus";
  private String transStatus;

  public static final String JSON_PROPERTY_TRANS_STATUS_REASON = "transStatusReason";
  private String transStatusReason;

  public ThreeDS2ResponseData() { 
  }

  public ThreeDS2ResponseData acsChallengeMandated(String acsChallengeMandated) {
    this.acsChallengeMandated = acsChallengeMandated;
    return this;
  }

   /**
   * Get acsChallengeMandated
   * @return acsChallengeMandated
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACS_CHALLENGE_MANDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAcsChallengeMandated() {
    return acsChallengeMandated;
  }


  @JsonProperty(JSON_PROPERTY_ACS_CHALLENGE_MANDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcsChallengeMandated(String acsChallengeMandated) {
    this.acsChallengeMandated = acsChallengeMandated;
  }


  public ThreeDS2ResponseData acsOperatorID(String acsOperatorID) {
    this.acsOperatorID = acsOperatorID;
    return this;
  }

   /**
   * Get acsOperatorID
   * @return acsOperatorID
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACS_OPERATOR_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAcsOperatorID() {
    return acsOperatorID;
  }


  @JsonProperty(JSON_PROPERTY_ACS_OPERATOR_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcsOperatorID(String acsOperatorID) {
    this.acsOperatorID = acsOperatorID;
  }


  public ThreeDS2ResponseData acsReferenceNumber(String acsReferenceNumber) {
    this.acsReferenceNumber = acsReferenceNumber;
    return this;
  }

   /**
   * Get acsReferenceNumber
   * @return acsReferenceNumber
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACS_REFERENCE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAcsReferenceNumber() {
    return acsReferenceNumber;
  }


  @JsonProperty(JSON_PROPERTY_ACS_REFERENCE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcsReferenceNumber(String acsReferenceNumber) {
    this.acsReferenceNumber = acsReferenceNumber;
  }


  public ThreeDS2ResponseData acsSignedContent(String acsSignedContent) {
    this.acsSignedContent = acsSignedContent;
    return this;
  }

   /**
   * Get acsSignedContent
   * @return acsSignedContent
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACS_SIGNED_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAcsSignedContent() {
    return acsSignedContent;
  }


  @JsonProperty(JSON_PROPERTY_ACS_SIGNED_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcsSignedContent(String acsSignedContent) {
    this.acsSignedContent = acsSignedContent;
  }


  public ThreeDS2ResponseData acsTransID(String acsTransID) {
    this.acsTransID = acsTransID;
    return this;
  }

   /**
   * Get acsTransID
   * @return acsTransID
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACS_TRANS_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAcsTransID() {
    return acsTransID;
  }


  @JsonProperty(JSON_PROPERTY_ACS_TRANS_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcsTransID(String acsTransID) {
    this.acsTransID = acsTransID;
  }


  public ThreeDS2ResponseData acsURL(String acsURL) {
    this.acsURL = acsURL;
    return this;
  }

   /**
   * Get acsURL
   * @return acsURL
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACS_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAcsURL() {
    return acsURL;
  }


  @JsonProperty(JSON_PROPERTY_ACS_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcsURL(String acsURL) {
    this.acsURL = acsURL;
  }


  public ThreeDS2ResponseData authenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

   /**
   * Get authenticationType
   * @return authenticationType
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthenticationType() {
    return authenticationType;
  }


  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
  }


  public ThreeDS2ResponseData cardHolderInfo(String cardHolderInfo) {
    this.cardHolderInfo = cardHolderInfo;
    return this;
  }

   /**
   * Get cardHolderInfo
   * @return cardHolderInfo
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CARD_HOLDER_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardHolderInfo() {
    return cardHolderInfo;
  }


  @JsonProperty(JSON_PROPERTY_CARD_HOLDER_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardHolderInfo(String cardHolderInfo) {
    this.cardHolderInfo = cardHolderInfo;
  }


  public ThreeDS2ResponseData cavvAlgorithm(String cavvAlgorithm) {
    this.cavvAlgorithm = cavvAlgorithm;
    return this;
  }

   /**
   * Get cavvAlgorithm
   * @return cavvAlgorithm
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAVV_ALGORITHM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCavvAlgorithm() {
    return cavvAlgorithm;
  }


  @JsonProperty(JSON_PROPERTY_CAVV_ALGORITHM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCavvAlgorithm(String cavvAlgorithm) {
    this.cavvAlgorithm = cavvAlgorithm;
  }


  public ThreeDS2ResponseData challengeIndicator(String challengeIndicator) {
    this.challengeIndicator = challengeIndicator;
    return this;
  }

   /**
   * Get challengeIndicator
   * @return challengeIndicator
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHALLENGE_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChallengeIndicator() {
    return challengeIndicator;
  }


  @JsonProperty(JSON_PROPERTY_CHALLENGE_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChallengeIndicator(String challengeIndicator) {
    this.challengeIndicator = challengeIndicator;
  }


  public ThreeDS2ResponseData dsReferenceNumber(String dsReferenceNumber) {
    this.dsReferenceNumber = dsReferenceNumber;
    return this;
  }

   /**
   * Get dsReferenceNumber
   * @return dsReferenceNumber
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DS_REFERENCE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDsReferenceNumber() {
    return dsReferenceNumber;
  }


  @JsonProperty(JSON_PROPERTY_DS_REFERENCE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDsReferenceNumber(String dsReferenceNumber) {
    this.dsReferenceNumber = dsReferenceNumber;
  }


  public ThreeDS2ResponseData dsTransID(String dsTransID) {
    this.dsTransID = dsTransID;
    return this;
  }

   /**
   * Get dsTransID
   * @return dsTransID
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DS_TRANS_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDsTransID() {
    return dsTransID;
  }


  @JsonProperty(JSON_PROPERTY_DS_TRANS_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDsTransID(String dsTransID) {
    this.dsTransID = dsTransID;
  }


  public ThreeDS2ResponseData exemptionIndicator(String exemptionIndicator) {
    this.exemptionIndicator = exemptionIndicator;
    return this;
  }

   /**
   * Get exemptionIndicator
   * @return exemptionIndicator
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXEMPTION_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExemptionIndicator() {
    return exemptionIndicator;
  }


  @JsonProperty(JSON_PROPERTY_EXEMPTION_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExemptionIndicator(String exemptionIndicator) {
    this.exemptionIndicator = exemptionIndicator;
  }


  public ThreeDS2ResponseData messageVersion(String messageVersion) {
    this.messageVersion = messageVersion;
    return this;
  }

   /**
   * Get messageVersion
   * @return messageVersion
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessageVersion() {
    return messageVersion;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageVersion(String messageVersion) {
    this.messageVersion = messageVersion;
  }


  public ThreeDS2ResponseData riskScore(String riskScore) {
    this.riskScore = riskScore;
    return this;
  }

   /**
   * Get riskScore
   * @return riskScore
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RISK_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskScore() {
    return riskScore;
  }


  @JsonProperty(JSON_PROPERTY_RISK_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskScore(String riskScore) {
    this.riskScore = riskScore;
  }


  public ThreeDS2ResponseData sdkEphemPubKey(String sdkEphemPubKey) {
    this.sdkEphemPubKey = sdkEphemPubKey;
    return this;
  }

   /**
   * Get sdkEphemPubKey
   * @return sdkEphemPubKey
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SDK_EPHEM_PUB_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSdkEphemPubKey() {
    return sdkEphemPubKey;
  }


  @JsonProperty(JSON_PROPERTY_SDK_EPHEM_PUB_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSdkEphemPubKey(String sdkEphemPubKey) {
    this.sdkEphemPubKey = sdkEphemPubKey;
  }


  public ThreeDS2ResponseData threeDSServerTransID(String threeDSServerTransID) {
    this.threeDSServerTransID = threeDSServerTransID;
    return this;
  }

   /**
   * Get threeDSServerTransID
   * @return threeDSServerTransID
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THREE_D_S_SERVER_TRANS_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThreeDSServerTransID() {
    return threeDSServerTransID;
  }


  @JsonProperty(JSON_PROPERTY_THREE_D_S_SERVER_TRANS_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDSServerTransID(String threeDSServerTransID) {
    this.threeDSServerTransID = threeDSServerTransID;
  }


  public ThreeDS2ResponseData transStatus(String transStatus) {
    this.transStatus = transStatus;
    return this;
  }

   /**
   * Get transStatus
   * @return transStatus
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANS_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTransStatus() {
    return transStatus;
  }


  @JsonProperty(JSON_PROPERTY_TRANS_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransStatus(String transStatus) {
    this.transStatus = transStatus;
  }


  public ThreeDS2ResponseData transStatusReason(String transStatusReason) {
    this.transStatusReason = transStatusReason;
    return this;
  }

   /**
   * Get transStatusReason
   * @return transStatusReason
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANS_STATUS_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTransStatusReason() {
    return transStatusReason;
  }


  @JsonProperty(JSON_PROPERTY_TRANS_STATUS_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransStatusReason(String transStatusReason) {
    this.transStatusReason = transStatusReason;
  }


  /**
   * Return true if this ThreeDS2ResponseData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDS2ResponseData threeDS2ResponseData = (ThreeDS2ResponseData) o;
    return Objects.equals(this.acsChallengeMandated, threeDS2ResponseData.acsChallengeMandated) &&
        Objects.equals(this.acsOperatorID, threeDS2ResponseData.acsOperatorID) &&
        Objects.equals(this.acsReferenceNumber, threeDS2ResponseData.acsReferenceNumber) &&
        Objects.equals(this.acsSignedContent, threeDS2ResponseData.acsSignedContent) &&
        Objects.equals(this.acsTransID, threeDS2ResponseData.acsTransID) &&
        Objects.equals(this.acsURL, threeDS2ResponseData.acsURL) &&
        Objects.equals(this.authenticationType, threeDS2ResponseData.authenticationType) &&
        Objects.equals(this.cardHolderInfo, threeDS2ResponseData.cardHolderInfo) &&
        Objects.equals(this.cavvAlgorithm, threeDS2ResponseData.cavvAlgorithm) &&
        Objects.equals(this.challengeIndicator, threeDS2ResponseData.challengeIndicator) &&
        Objects.equals(this.dsReferenceNumber, threeDS2ResponseData.dsReferenceNumber) &&
        Objects.equals(this.dsTransID, threeDS2ResponseData.dsTransID) &&
        Objects.equals(this.exemptionIndicator, threeDS2ResponseData.exemptionIndicator) &&
        Objects.equals(this.messageVersion, threeDS2ResponseData.messageVersion) &&
        Objects.equals(this.riskScore, threeDS2ResponseData.riskScore) &&
        Objects.equals(this.sdkEphemPubKey, threeDS2ResponseData.sdkEphemPubKey) &&
        Objects.equals(this.threeDSServerTransID, threeDS2ResponseData.threeDSServerTransID) &&
        Objects.equals(this.transStatus, threeDS2ResponseData.transStatus) &&
        Objects.equals(this.transStatusReason, threeDS2ResponseData.transStatusReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acsChallengeMandated, acsOperatorID, acsReferenceNumber, acsSignedContent, acsTransID, acsURL, authenticationType, cardHolderInfo, cavvAlgorithm, challengeIndicator, dsReferenceNumber, dsTransID, exemptionIndicator, messageVersion, riskScore, sdkEphemPubKey, threeDSServerTransID, transStatus, transStatusReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDS2ResponseData {\n");
    sb.append("    acsChallengeMandated: ").append(toIndentedString(acsChallengeMandated)).append("\n");
    sb.append("    acsOperatorID: ").append(toIndentedString(acsOperatorID)).append("\n");
    sb.append("    acsReferenceNumber: ").append(toIndentedString(acsReferenceNumber)).append("\n");
    sb.append("    acsSignedContent: ").append(toIndentedString(acsSignedContent)).append("\n");
    sb.append("    acsTransID: ").append(toIndentedString(acsTransID)).append("\n");
    sb.append("    acsURL: ").append(toIndentedString(acsURL)).append("\n");
    sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
    sb.append("    cardHolderInfo: ").append(toIndentedString(cardHolderInfo)).append("\n");
    sb.append("    cavvAlgorithm: ").append(toIndentedString(cavvAlgorithm)).append("\n");
    sb.append("    challengeIndicator: ").append(toIndentedString(challengeIndicator)).append("\n");
    sb.append("    dsReferenceNumber: ").append(toIndentedString(dsReferenceNumber)).append("\n");
    sb.append("    dsTransID: ").append(toIndentedString(dsTransID)).append("\n");
    sb.append("    exemptionIndicator: ").append(toIndentedString(exemptionIndicator)).append("\n");
    sb.append("    messageVersion: ").append(toIndentedString(messageVersion)).append("\n");
    sb.append("    riskScore: ").append(toIndentedString(riskScore)).append("\n");
    sb.append("    sdkEphemPubKey: ").append(toIndentedString(sdkEphemPubKey)).append("\n");
    sb.append("    threeDSServerTransID: ").append(toIndentedString(threeDSServerTransID)).append("\n");
    sb.append("    transStatus: ").append(toIndentedString(transStatus)).append("\n");
    sb.append("    transStatusReason: ").append(toIndentedString(transStatusReason)).append("\n");
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
   * Create an instance of ThreeDS2ResponseData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ThreeDS2ResponseData
   * @throws JsonProcessingException if the JSON string is invalid with respect to ThreeDS2ResponseData
   */
  public static ThreeDS2ResponseData fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ThreeDS2ResponseData.class);
  }
/**
  * Convert an instance of ThreeDS2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

