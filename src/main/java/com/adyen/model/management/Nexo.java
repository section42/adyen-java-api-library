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
import com.adyen.model.management.EventUrl;
import com.adyen.model.management.Key;
import com.adyen.model.management.Notification;
import com.adyen.model.management.NotificationUrl;
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
 * Nexo
 */
@JsonPropertyOrder({
  Nexo.JSON_PROPERTY_DISPLAY_URLS,
  Nexo.JSON_PROPERTY_ENCRYPTION_KEY,
  Nexo.JSON_PROPERTY_EVENT_URLS,
  Nexo.JSON_PROPERTY_NEXO_EVENT_URLS,
  Nexo.JSON_PROPERTY_NOTIFICATION
})

public class Nexo {
  public static final String JSON_PROPERTY_DISPLAY_URLS = "displayUrls";
  private NotificationUrl displayUrls;

  public static final String JSON_PROPERTY_ENCRYPTION_KEY = "encryptionKey";
  private Key encryptionKey;

  public static final String JSON_PROPERTY_EVENT_URLS = "eventUrls";
  private EventUrl eventUrls;

  public static final String JSON_PROPERTY_NEXO_EVENT_URLS = "nexoEventUrls";
  private List<String> nexoEventUrls = null;

  public static final String JSON_PROPERTY_NOTIFICATION = "notification";
  private Notification notification;

  public Nexo() { 
  }

  public Nexo displayUrls(NotificationUrl displayUrls) {
    this.displayUrls = displayUrls;
    return this;
  }

   /**
   * Get displayUrls
   * @return displayUrls
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISPLAY_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NotificationUrl getDisplayUrls() {
    return displayUrls;
  }


 /**
  * displayUrls
  *
  * @param displayUrls
  */ 
  @JsonProperty(JSON_PROPERTY_DISPLAY_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayUrls(NotificationUrl displayUrls) {
    this.displayUrls = displayUrls;
  }


  public Nexo encryptionKey(Key encryptionKey) {
    this.encryptionKey = encryptionKey;
    return this;
  }

   /**
   * Get encryptionKey
   * @return encryptionKey
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENCRYPTION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Key getEncryptionKey() {
    return encryptionKey;
  }


 /**
  * encryptionKey
  *
  * @param encryptionKey
  */ 
  @JsonProperty(JSON_PROPERTY_ENCRYPTION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncryptionKey(Key encryptionKey) {
    this.encryptionKey = encryptionKey;
  }


  public Nexo eventUrls(EventUrl eventUrls) {
    this.eventUrls = eventUrls;
    return this;
  }

   /**
   * Get eventUrls
   * @return eventUrls
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EVENT_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EventUrl getEventUrls() {
    return eventUrls;
  }


 /**
  * eventUrls
  *
  * @param eventUrls
  */ 
  @JsonProperty(JSON_PROPERTY_EVENT_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventUrls(EventUrl eventUrls) {
    this.eventUrls = eventUrls;
  }


  public Nexo nexoEventUrls(List<String> nexoEventUrls) {
    this.nexoEventUrls = nexoEventUrls;
    return this;
  }

  public Nexo addNexoEventUrlsItem(String nexoEventUrlsItem) {
    if (this.nexoEventUrls == null) {
      this.nexoEventUrls = new ArrayList<>();
    }
    this.nexoEventUrls.add(nexoEventUrlsItem);
    return this;
  }

   /**
   * One or more URLs to send event messages to when using Terminal API.
   * @return nexoEventUrls
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "One or more URLs to send event messages to when using Terminal API.")
  @JsonProperty(JSON_PROPERTY_NEXO_EVENT_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getNexoEventUrls() {
    return nexoEventUrls;
  }


 /**
  * One or more URLs to send event messages to when using Terminal API.
  *
  * @param nexoEventUrls
  */ 
  @Deprecated
  @JsonProperty(JSON_PROPERTY_NEXO_EVENT_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNexoEventUrls(List<String> nexoEventUrls) {
    this.nexoEventUrls = nexoEventUrls;
  }


  public Nexo notification(Notification notification) {
    this.notification = notification;
    return this;
  }

   /**
   * Get notification
   * @return notification
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NOTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Notification getNotification() {
    return notification;
  }


 /**
  * notification
  *
  * @param notification
  */ 
  @JsonProperty(JSON_PROPERTY_NOTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotification(Notification notification) {
    this.notification = notification;
  }


  /**
   * Return true if this Nexo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Nexo nexo = (Nexo) o;
    return Objects.equals(this.displayUrls, nexo.displayUrls) &&
        Objects.equals(this.encryptionKey, nexo.encryptionKey) &&
        Objects.equals(this.eventUrls, nexo.eventUrls) &&
        Objects.equals(this.nexoEventUrls, nexo.nexoEventUrls) &&
        Objects.equals(this.notification, nexo.notification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayUrls, encryptionKey, eventUrls, nexoEventUrls, notification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Nexo {\n");
    sb.append("    displayUrls: ").append(toIndentedString(displayUrls)).append("\n");
    sb.append("    encryptionKey: ").append(toIndentedString(encryptionKey)).append("\n");
    sb.append("    eventUrls: ").append(toIndentedString(eventUrls)).append("\n");
    sb.append("    nexoEventUrls: ").append(toIndentedString(nexoEventUrls)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
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
   * Create an instance of Nexo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Nexo
   * @throws JsonProcessingException if the JSON string is invalid with respect to Nexo
   */
  public static Nexo fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Nexo.class);
  }
/**
  * Convert an instance of Nexo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

