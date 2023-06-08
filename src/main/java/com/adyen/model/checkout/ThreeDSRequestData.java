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
 * ThreeDSRequestData
 */
@JsonPropertyOrder({
  ThreeDSRequestData.JSON_PROPERTY_CHALLENGE_WINDOW_SIZE,
  ThreeDSRequestData.JSON_PROPERTY_DATA_ONLY,
  ThreeDSRequestData.JSON_PROPERTY_NATIVE_THREE_D_S,
  ThreeDSRequestData.JSON_PROPERTY_THREE_D_S_VERSION
})

public class ThreeDSRequestData {
  /**
   * Dimensions of the 3DS2 challenge window to be displayed to the cardholder.  Possible values:  * **01** - size of 250x400  * **02** - size of 390x400 * **03** - size of 500x600 * **04** - size of 600x400 * **05** - Fullscreen
   */
  public enum ChallengeWindowSizeEnum {
    _01("01"),
    
    _02("02"),
    
    _03("03"),
    
    _04("04"),
    
    _05("05");

    private String value;

    ChallengeWindowSizeEnum(String value) {
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
    public static ChallengeWindowSizeEnum fromValue(String value) {
      for (ChallengeWindowSizeEnum b : ChallengeWindowSizeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CHALLENGE_WINDOW_SIZE = "challengeWindowSize";
  private ChallengeWindowSizeEnum challengeWindowSize;

  /**
   * Flag for data only flow.
   */
  public enum DataOnlyEnum {
    FALSE("false"),
    
    TRUE("true");

    private String value;

    DataOnlyEnum(String value) {
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
    public static DataOnlyEnum fromValue(String value) {
      for (DataOnlyEnum b : DataOnlyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DATA_ONLY = "dataOnly";
  private DataOnlyEnum dataOnly;

  /**
   * Indicates if [native 3D Secure authentication](https://docs.adyen.com/online-payments/3d-secure/native-3ds2) should be used when available.  Possible values: * **preferred**: Use native 3D Secure authentication when available.
   */
  public enum NativeThreeDSEnum {
    PREFERRED("preferred");

    private String value;

    NativeThreeDSEnum(String value) {
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
    public static NativeThreeDSEnum fromValue(String value) {
      for (NativeThreeDSEnum b : NativeThreeDSEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_NATIVE_THREE_D_S = "nativeThreeDS";
  private NativeThreeDSEnum nativeThreeDS;

  /**
   * The version of 3D Secure to use.  Possible values:  * **2.1.0** * **2.2.0**
   */
  public enum ThreeDSVersionEnum {
    _1_0("2.1.0"),
    
    _2_0("2.2.0");

    private String value;

    ThreeDSVersionEnum(String value) {
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
    public static ThreeDSVersionEnum fromValue(String value) {
      for (ThreeDSVersionEnum b : ThreeDSVersionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_THREE_D_S_VERSION = "threeDSVersion";
  private ThreeDSVersionEnum threeDSVersion;

  public ThreeDSRequestData() { 
  }

  public ThreeDSRequestData challengeWindowSize(ChallengeWindowSizeEnum challengeWindowSize) {
    this.challengeWindowSize = challengeWindowSize;
    return this;
  }

   /**
   * Dimensions of the 3DS2 challenge window to be displayed to the cardholder.  Possible values:  * **01** - size of 250x400  * **02** - size of 390x400 * **03** - size of 500x600 * **04** - size of 600x400 * **05** - Fullscreen
   * @return challengeWindowSize
  **/
  @ApiModelProperty(value = "Dimensions of the 3DS2 challenge window to be displayed to the cardholder.  Possible values:  * **01** - size of 250x400  * **02** - size of 390x400 * **03** - size of 500x600 * **04** - size of 600x400 * **05** - Fullscreen")
  @JsonProperty(JSON_PROPERTY_CHALLENGE_WINDOW_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChallengeWindowSizeEnum getChallengeWindowSize() {
    return challengeWindowSize;
  }


  @JsonProperty(JSON_PROPERTY_CHALLENGE_WINDOW_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChallengeWindowSize(ChallengeWindowSizeEnum challengeWindowSize) {
    this.challengeWindowSize = challengeWindowSize;
  }


  public ThreeDSRequestData dataOnly(DataOnlyEnum dataOnly) {
    this.dataOnly = dataOnly;
    return this;
  }

   /**
   * Flag for data only flow.
   * @return dataOnly
  **/
  @ApiModelProperty(value = "Flag for data only flow.")
  @JsonProperty(JSON_PROPERTY_DATA_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DataOnlyEnum getDataOnly() {
    return dataOnly;
  }


  @JsonProperty(JSON_PROPERTY_DATA_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataOnly(DataOnlyEnum dataOnly) {
    this.dataOnly = dataOnly;
  }


  public ThreeDSRequestData nativeThreeDS(NativeThreeDSEnum nativeThreeDS) {
    this.nativeThreeDS = nativeThreeDS;
    return this;
  }

   /**
   * Indicates if [native 3D Secure authentication](https://docs.adyen.com/online-payments/3d-secure/native-3ds2) should be used when available.  Possible values: * **preferred**: Use native 3D Secure authentication when available.
   * @return nativeThreeDS
  **/
  @ApiModelProperty(value = "Indicates if [native 3D Secure authentication](https://docs.adyen.com/online-payments/3d-secure/native-3ds2) should be used when available.  Possible values: * **preferred**: Use native 3D Secure authentication when available.")
  @JsonProperty(JSON_PROPERTY_NATIVE_THREE_D_S)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NativeThreeDSEnum getNativeThreeDS() {
    return nativeThreeDS;
  }


  @JsonProperty(JSON_PROPERTY_NATIVE_THREE_D_S)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNativeThreeDS(NativeThreeDSEnum nativeThreeDS) {
    this.nativeThreeDS = nativeThreeDS;
  }


  public ThreeDSRequestData threeDSVersion(ThreeDSVersionEnum threeDSVersion) {
    this.threeDSVersion = threeDSVersion;
    return this;
  }

   /**
   * The version of 3D Secure to use.  Possible values:  * **2.1.0** * **2.2.0**
   * @return threeDSVersion
  **/
  @ApiModelProperty(value = "The version of 3D Secure to use.  Possible values:  * **2.1.0** * **2.2.0**")
  @JsonProperty(JSON_PROPERTY_THREE_D_S_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ThreeDSVersionEnum getThreeDSVersion() {
    return threeDSVersion;
  }


  @JsonProperty(JSON_PROPERTY_THREE_D_S_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDSVersion(ThreeDSVersionEnum threeDSVersion) {
    this.threeDSVersion = threeDSVersion;
  }


  /**
   * Return true if this ThreeDSRequestData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDSRequestData threeDSRequestData = (ThreeDSRequestData) o;
    return Objects.equals(this.challengeWindowSize, threeDSRequestData.challengeWindowSize) &&
        Objects.equals(this.dataOnly, threeDSRequestData.dataOnly) &&
        Objects.equals(this.nativeThreeDS, threeDSRequestData.nativeThreeDS) &&
        Objects.equals(this.threeDSVersion, threeDSRequestData.threeDSVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challengeWindowSize, dataOnly, nativeThreeDS, threeDSVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDSRequestData {\n");
    sb.append("    challengeWindowSize: ").append(toIndentedString(challengeWindowSize)).append("\n");
    sb.append("    dataOnly: ").append(toIndentedString(dataOnly)).append("\n");
    sb.append("    nativeThreeDS: ").append(toIndentedString(nativeThreeDS)).append("\n");
    sb.append("    threeDSVersion: ").append(toIndentedString(threeDSVersion)).append("\n");
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
   * Create an instance of ThreeDSRequestData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ThreeDSRequestData
   * @throws JsonProcessingException if the JSON string is invalid with respect to ThreeDSRequestData
   */
  public static ThreeDSRequestData fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ThreeDSRequestData.class);
  }
/**
  * Convert an instance of ThreeDSRequestData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

