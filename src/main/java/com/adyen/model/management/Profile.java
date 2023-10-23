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
import com.adyen.model.management.ModelFile;
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
 * Profile
 */
@JsonPropertyOrder({
  Profile.JSON_PROPERTY_AUTH_TYPE,
  Profile.JSON_PROPERTY_AUTO_WIFI,
  Profile.JSON_PROPERTY_BSS_TYPE,
  Profile.JSON_PROPERTY_CHANNEL,
  Profile.JSON_PROPERTY_DEFAULT_PROFILE,
  Profile.JSON_PROPERTY_EAP,
  Profile.JSON_PROPERTY_EAP_CA_CERT,
  Profile.JSON_PROPERTY_EAP_CLIENT_CERT,
  Profile.JSON_PROPERTY_EAP_CLIENT_KEY,
  Profile.JSON_PROPERTY_EAP_CLIENT_PWD,
  Profile.JSON_PROPERTY_EAP_IDENTITY,
  Profile.JSON_PROPERTY_EAP_INTERMEDIATE_CERT,
  Profile.JSON_PROPERTY_EAP_PWD,
  Profile.JSON_PROPERTY_HIDDEN_SSID,
  Profile.JSON_PROPERTY_NAME,
  Profile.JSON_PROPERTY_PSK,
  Profile.JSON_PROPERTY_SSID,
  Profile.JSON_PROPERTY_WSEC
})

public class Profile {
  public static final String JSON_PROPERTY_AUTH_TYPE = "authType";
  private String authType;

  public static final String JSON_PROPERTY_AUTO_WIFI = "autoWifi";
  private Boolean autoWifi;

  public static final String JSON_PROPERTY_BSS_TYPE = "bssType";
  private String bssType;

  public static final String JSON_PROPERTY_CHANNEL = "channel";
  private Integer channel;

  public static final String JSON_PROPERTY_DEFAULT_PROFILE = "defaultProfile";
  private Boolean defaultProfile;

  public static final String JSON_PROPERTY_EAP = "eap";
  private String eap;

  public static final String JSON_PROPERTY_EAP_CA_CERT = "eapCaCert";
  private ModelFile eapCaCert;

  public static final String JSON_PROPERTY_EAP_CLIENT_CERT = "eapClientCert";
  private ModelFile eapClientCert;

  public static final String JSON_PROPERTY_EAP_CLIENT_KEY = "eapClientKey";
  private ModelFile eapClientKey;

  public static final String JSON_PROPERTY_EAP_CLIENT_PWD = "eapClientPwd";
  private String eapClientPwd;

  public static final String JSON_PROPERTY_EAP_IDENTITY = "eapIdentity";
  private String eapIdentity;

  public static final String JSON_PROPERTY_EAP_INTERMEDIATE_CERT = "eapIntermediateCert";
  private ModelFile eapIntermediateCert;

  public static final String JSON_PROPERTY_EAP_PWD = "eapPwd";
  private String eapPwd;

  public static final String JSON_PROPERTY_HIDDEN_SSID = "hiddenSsid";
  private Boolean hiddenSsid;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PSK = "psk";
  private String psk;

  public static final String JSON_PROPERTY_SSID = "ssid";
  private String ssid;

  public static final String JSON_PROPERTY_WSEC = "wsec";
  private String wsec;

  public Profile() { 
  }

  public Profile authType(String authType) {
    this.authType = authType;
    return this;
  }

   /**
   * The type of Wi-Fi network. Possible values: **wpa-psk**, **wpa2-psk**, **wpa-eap**, **wpa2-eap**.
   * @return authType
  **/
  @ApiModelProperty(required = true, value = "The type of Wi-Fi network. Possible values: **wpa-psk**, **wpa2-psk**, **wpa-eap**, **wpa2-eap**.")
  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthType() {
    return authType;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthType(String authType) {
    this.authType = authType;
  }


  public Profile autoWifi(Boolean autoWifi) {
    this.autoWifi = autoWifi;
    return this;
  }

   /**
   * Indicates whether to automatically select the best authentication method available. Does not work on older terminal models.
   * @return autoWifi
  **/
  @ApiModelProperty(value = "Indicates whether to automatically select the best authentication method available. Does not work on older terminal models.")
  @JsonProperty(JSON_PROPERTY_AUTO_WIFI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoWifi() {
    return autoWifi;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_WIFI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoWifi(Boolean autoWifi) {
    this.autoWifi = autoWifi;
  }


  public Profile bssType(String bssType) {
    this.bssType = bssType;
    return this;
  }

   /**
   * Use **infra** for infrastructure-based networks. This applies to most networks. Use **adhoc** only if the communication is p2p-based between base stations.
   * @return bssType
  **/
  @ApiModelProperty(required = true, value = "Use **infra** for infrastructure-based networks. This applies to most networks. Use **adhoc** only if the communication is p2p-based between base stations.")
  @JsonProperty(JSON_PROPERTY_BSS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBssType() {
    return bssType;
  }


  @JsonProperty(JSON_PROPERTY_BSS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBssType(String bssType) {
    this.bssType = bssType;
  }


  public Profile channel(Integer channel) {
    this.channel = channel;
    return this;
  }

   /**
   * The channel number of the Wi-Fi network. The recommended setting is **0** for automatic channel selection.
   * @return channel
  **/
  @ApiModelProperty(value = "The channel number of the Wi-Fi network. The recommended setting is **0** for automatic channel selection.")
  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getChannel() {
    return channel;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannel(Integer channel) {
    this.channel = channel;
  }


  public Profile defaultProfile(Boolean defaultProfile) {
    this.defaultProfile = defaultProfile;
    return this;
  }

   /**
   * Indicates whether this is your preferred wireless network. If **true**, the terminal will try connecting to this network first.
   * @return defaultProfile
  **/
  @ApiModelProperty(value = "Indicates whether this is your preferred wireless network. If **true**, the terminal will try connecting to this network first.")
  @JsonProperty(JSON_PROPERTY_DEFAULT_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDefaultProfile() {
    return defaultProfile;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultProfile(Boolean defaultProfile) {
    this.defaultProfile = defaultProfile;
  }


  public Profile eap(String eap) {
    this.eap = eap;
    return this;
  }

   /**
   * For &#x60;authType&#x60; **wpa-eap** or **wpa2-eap**. Possible values: **tls**, **peap**, **leap**, **fast**
   * @return eap
  **/
  @ApiModelProperty(value = "For `authType` **wpa-eap** or **wpa2-eap**. Possible values: **tls**, **peap**, **leap**, **fast**")
  @JsonProperty(JSON_PROPERTY_EAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEap() {
    return eap;
  }


  @JsonProperty(JSON_PROPERTY_EAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEap(String eap) {
    this.eap = eap;
  }


  public Profile eapCaCert(ModelFile eapCaCert) {
    this.eapCaCert = eapCaCert;
    return this;
  }

   /**
   * Get eapCaCert
   * @return eapCaCert
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EAP_CA_CERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ModelFile getEapCaCert() {
    return eapCaCert;
  }


  @JsonProperty(JSON_PROPERTY_EAP_CA_CERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEapCaCert(ModelFile eapCaCert) {
    this.eapCaCert = eapCaCert;
  }


  public Profile eapClientCert(ModelFile eapClientCert) {
    this.eapClientCert = eapClientCert;
    return this;
  }

   /**
   * Get eapClientCert
   * @return eapClientCert
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EAP_CLIENT_CERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ModelFile getEapClientCert() {
    return eapClientCert;
  }


  @JsonProperty(JSON_PROPERTY_EAP_CLIENT_CERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEapClientCert(ModelFile eapClientCert) {
    this.eapClientCert = eapClientCert;
  }


  public Profile eapClientKey(ModelFile eapClientKey) {
    this.eapClientKey = eapClientKey;
    return this;
  }

   /**
   * Get eapClientKey
   * @return eapClientKey
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EAP_CLIENT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ModelFile getEapClientKey() {
    return eapClientKey;
  }


  @JsonProperty(JSON_PROPERTY_EAP_CLIENT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEapClientKey(ModelFile eapClientKey) {
    this.eapClientKey = eapClientKey;
  }


  public Profile eapClientPwd(String eapClientPwd) {
    this.eapClientPwd = eapClientPwd;
    return this;
  }

   /**
   * For &#x60;eap&#x60; **tls**. The password of the RSA key file, if that file is password-protected.
   * @return eapClientPwd
  **/
  @ApiModelProperty(value = "For `eap` **tls**. The password of the RSA key file, if that file is password-protected.")
  @JsonProperty(JSON_PROPERTY_EAP_CLIENT_PWD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEapClientPwd() {
    return eapClientPwd;
  }


  @JsonProperty(JSON_PROPERTY_EAP_CLIENT_PWD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEapClientPwd(String eapClientPwd) {
    this.eapClientPwd = eapClientPwd;
  }


  public Profile eapIdentity(String eapIdentity) {
    this.eapIdentity = eapIdentity;
    return this;
  }

   /**
   * For &#x60;authType&#x60; **wpa-eap** or **wpa2-eap**. The EAP-PEAP username from your MS-CHAP account. Must match the configuration of your RADIUS server.
   * @return eapIdentity
  **/
  @ApiModelProperty(value = "For `authType` **wpa-eap** or **wpa2-eap**. The EAP-PEAP username from your MS-CHAP account. Must match the configuration of your RADIUS server.")
  @JsonProperty(JSON_PROPERTY_EAP_IDENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEapIdentity() {
    return eapIdentity;
  }


  @JsonProperty(JSON_PROPERTY_EAP_IDENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEapIdentity(String eapIdentity) {
    this.eapIdentity = eapIdentity;
  }


  public Profile eapIntermediateCert(ModelFile eapIntermediateCert) {
    this.eapIntermediateCert = eapIntermediateCert;
    return this;
  }

   /**
   * Get eapIntermediateCert
   * @return eapIntermediateCert
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EAP_INTERMEDIATE_CERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ModelFile getEapIntermediateCert() {
    return eapIntermediateCert;
  }


  @JsonProperty(JSON_PROPERTY_EAP_INTERMEDIATE_CERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEapIntermediateCert(ModelFile eapIntermediateCert) {
    this.eapIntermediateCert = eapIntermediateCert;
  }


  public Profile eapPwd(String eapPwd) {
    this.eapPwd = eapPwd;
    return this;
  }

   /**
   * For &#x60;eap&#x60; **peap**. The EAP-PEAP password from your MS-CHAP account. Must match the configuration of your RADIUS server.
   * @return eapPwd
  **/
  @ApiModelProperty(value = "For `eap` **peap**. The EAP-PEAP password from your MS-CHAP account. Must match the configuration of your RADIUS server.")
  @JsonProperty(JSON_PROPERTY_EAP_PWD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEapPwd() {
    return eapPwd;
  }


  @JsonProperty(JSON_PROPERTY_EAP_PWD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEapPwd(String eapPwd) {
    this.eapPwd = eapPwd;
  }


  public Profile hiddenSsid(Boolean hiddenSsid) {
    this.hiddenSsid = hiddenSsid;
    return this;
  }

   /**
   * Indicates if the network doesn&#39;t broadcast its SSID. Mandatory for Android terminals, because these terminals rely on this setting to be able to connect to any network.
   * @return hiddenSsid
  **/
  @ApiModelProperty(value = "Indicates if the network doesn't broadcast its SSID. Mandatory for Android terminals, because these terminals rely on this setting to be able to connect to any network.")
  @JsonProperty(JSON_PROPERTY_HIDDEN_SSID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHiddenSsid() {
    return hiddenSsid;
  }


  @JsonProperty(JSON_PROPERTY_HIDDEN_SSID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHiddenSsid(Boolean hiddenSsid) {
    this.hiddenSsid = hiddenSsid;
  }


  public Profile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Your name for the Wi-Fi profile.
   * @return name
  **/
  @ApiModelProperty(value = "Your name for the Wi-Fi profile.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public Profile psk(String psk) {
    this.psk = psk;
    return this;
  }

   /**
   * For &#x60;authType&#x60; **wpa-psk or **wpa2-psk**. The password to the wireless network.
   * @return psk
  **/
  @ApiModelProperty(value = "For `authType` **wpa-psk or **wpa2-psk**. The password to the wireless network.")
  @JsonProperty(JSON_PROPERTY_PSK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPsk() {
    return psk;
  }


  @JsonProperty(JSON_PROPERTY_PSK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPsk(String psk) {
    this.psk = psk;
  }


  public Profile ssid(String ssid) {
    this.ssid = ssid;
    return this;
  }

   /**
   * The name of the wireless network.
   * @return ssid
  **/
  @ApiModelProperty(required = true, value = "The name of the wireless network.")
  @JsonProperty(JSON_PROPERTY_SSID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSsid() {
    return ssid;
  }


  @JsonProperty(JSON_PROPERTY_SSID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSsid(String ssid) {
    this.ssid = ssid;
  }


  public Profile wsec(String wsec) {
    this.wsec = wsec;
    return this;
  }

   /**
   * The type of encryption. Possible values: **auto**, **ccmp** (recommended), **tkip**
   * @return wsec
  **/
  @ApiModelProperty(required = true, value = "The type of encryption. Possible values: **auto**, **ccmp** (recommended), **tkip**")
  @JsonProperty(JSON_PROPERTY_WSEC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWsec() {
    return wsec;
  }


  @JsonProperty(JSON_PROPERTY_WSEC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWsec(String wsec) {
    this.wsec = wsec;
  }


  /**
   * Return true if this Profile object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Profile profile = (Profile) o;
    return Objects.equals(this.authType, profile.authType) &&
        Objects.equals(this.autoWifi, profile.autoWifi) &&
        Objects.equals(this.bssType, profile.bssType) &&
        Objects.equals(this.channel, profile.channel) &&
        Objects.equals(this.defaultProfile, profile.defaultProfile) &&
        Objects.equals(this.eap, profile.eap) &&
        Objects.equals(this.eapCaCert, profile.eapCaCert) &&
        Objects.equals(this.eapClientCert, profile.eapClientCert) &&
        Objects.equals(this.eapClientKey, profile.eapClientKey) &&
        Objects.equals(this.eapClientPwd, profile.eapClientPwd) &&
        Objects.equals(this.eapIdentity, profile.eapIdentity) &&
        Objects.equals(this.eapIntermediateCert, profile.eapIntermediateCert) &&
        Objects.equals(this.eapPwd, profile.eapPwd) &&
        Objects.equals(this.hiddenSsid, profile.hiddenSsid) &&
        Objects.equals(this.name, profile.name) &&
        Objects.equals(this.psk, profile.psk) &&
        Objects.equals(this.ssid, profile.ssid) &&
        Objects.equals(this.wsec, profile.wsec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, autoWifi, bssType, channel, defaultProfile, eap, eapCaCert, eapClientCert, eapClientKey, eapClientPwd, eapIdentity, eapIntermediateCert, eapPwd, hiddenSsid, name, psk, ssid, wsec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Profile {\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    autoWifi: ").append(toIndentedString(autoWifi)).append("\n");
    sb.append("    bssType: ").append(toIndentedString(bssType)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    defaultProfile: ").append(toIndentedString(defaultProfile)).append("\n");
    sb.append("    eap: ").append(toIndentedString(eap)).append("\n");
    sb.append("    eapCaCert: ").append(toIndentedString(eapCaCert)).append("\n");
    sb.append("    eapClientCert: ").append(toIndentedString(eapClientCert)).append("\n");
    sb.append("    eapClientKey: ").append(toIndentedString(eapClientKey)).append("\n");
    sb.append("    eapClientPwd: ").append(toIndentedString(eapClientPwd)).append("\n");
    sb.append("    eapIdentity: ").append(toIndentedString(eapIdentity)).append("\n");
    sb.append("    eapIntermediateCert: ").append(toIndentedString(eapIntermediateCert)).append("\n");
    sb.append("    eapPwd: ").append(toIndentedString(eapPwd)).append("\n");
    sb.append("    hiddenSsid: ").append(toIndentedString(hiddenSsid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    psk: ").append(toIndentedString(psk)).append("\n");
    sb.append("    ssid: ").append(toIndentedString(ssid)).append("\n");
    sb.append("    wsec: ").append(toIndentedString(wsec)).append("\n");
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
   * Create an instance of Profile given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Profile
   * @throws JsonProcessingException if the JSON string is invalid with respect to Profile
   */
  public static Profile fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Profile.class);
  }
/**
  * Convert an instance of Profile to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

