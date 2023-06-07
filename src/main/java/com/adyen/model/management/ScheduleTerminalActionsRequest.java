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
import com.adyen.model.management.ScheduleTerminalActionsRequestActionDetails;
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
 * ScheduleTerminalActionsRequest
 */
@JsonPropertyOrder({
  ScheduleTerminalActionsRequest.JSON_PROPERTY_ACTION_DETAILS,
  ScheduleTerminalActionsRequest.JSON_PROPERTY_SCHEDULED_AT,
  ScheduleTerminalActionsRequest.JSON_PROPERTY_STORE_ID,
  ScheduleTerminalActionsRequest.JSON_PROPERTY_TERMINAL_IDS
})

public class ScheduleTerminalActionsRequest {
  public static final String JSON_PROPERTY_ACTION_DETAILS = "actionDetails";
  private ScheduleTerminalActionsRequestActionDetails actionDetails;

  public static final String JSON_PROPERTY_SCHEDULED_AT = "scheduledAt";
  private String scheduledAt;

  public static final String JSON_PROPERTY_STORE_ID = "storeId";
  private String storeId;

  public static final String JSON_PROPERTY_TERMINAL_IDS = "terminalIds";
  private List<String> terminalIds = null;

  public ScheduleTerminalActionsRequest() { 
  }

  public ScheduleTerminalActionsRequest actionDetails(ScheduleTerminalActionsRequestActionDetails actionDetails) {
    this.actionDetails = actionDetails;
    return this;
  }

   /**
   * Get actionDetails
   * @return actionDetails
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTION_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScheduleTerminalActionsRequestActionDetails getActionDetails() {
    return actionDetails;
  }


  @JsonProperty(JSON_PROPERTY_ACTION_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActionDetails(ScheduleTerminalActionsRequestActionDetails actionDetails) {
    this.actionDetails = actionDetails;
  }


  public ScheduleTerminalActionsRequest scheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

   /**
   * The date and time when the action should happen.  Format: [RFC 3339](https://www.rfc-editor.org/rfc/rfc3339), but without the **Z** before the time offset. For example, **2021-11-15T12:16:21+01:00**  The action is sent with the first [maintenance call](https://docs.adyen.com/point-of-sale/automating-terminal-management/terminal-actions-api#when-actions-take-effect) after the specified date and time in the time zone of the terminal.  An empty value causes the action to be sent as soon as possible: at the next maintenance call.
   * @return scheduledAt
  **/
  @ApiModelProperty(value = "The date and time when the action should happen.  Format: [RFC 3339](https://www.rfc-editor.org/rfc/rfc3339), but without the **Z** before the time offset. For example, **2021-11-15T12:16:21+01:00**  The action is sent with the first [maintenance call](https://docs.adyen.com/point-of-sale/automating-terminal-management/terminal-actions-api#when-actions-take-effect) after the specified date and time in the time zone of the terminal.  An empty value causes the action to be sent as soon as possible: at the next maintenance call.")
  @JsonProperty(JSON_PROPERTY_SCHEDULED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScheduledAt() {
    return scheduledAt;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
  }


  public ScheduleTerminalActionsRequest storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * The unique ID of the [store](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/stores). If present, all terminals in the &#x60;terminalIds&#x60; list must be assigned to this store.
   * @return storeId
  **/
  @ApiModelProperty(value = "The unique ID of the [store](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/stores). If present, all terminals in the `terminalIds` list must be assigned to this store.")
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


  public ScheduleTerminalActionsRequest terminalIds(List<String> terminalIds) {
    this.terminalIds = terminalIds;
    return this;
  }

  public ScheduleTerminalActionsRequest addTerminalIdsItem(String terminalIdsItem) {
    if (this.terminalIds == null) {
      this.terminalIds = new ArrayList<>();
    }
    this.terminalIds.add(terminalIdsItem);
    return this;
  }

   /**
   * A list of unique IDs of the terminals to apply the action to. You can extract the IDs from the [GET &#x60;/terminals&#x60;](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/terminals) response. Maximum length: 100 IDs.
   * @return terminalIds
  **/
  @ApiModelProperty(value = "A list of unique IDs of the terminals to apply the action to. You can extract the IDs from the [GET `/terminals`](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/terminals) response. Maximum length: 100 IDs.")
  @JsonProperty(JSON_PROPERTY_TERMINAL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTerminalIds() {
    return terminalIds;
  }


  @JsonProperty(JSON_PROPERTY_TERMINAL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTerminalIds(List<String> terminalIds) {
    this.terminalIds = terminalIds;
  }


  /**
   * Return true if this ScheduleTerminalActionsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleTerminalActionsRequest scheduleTerminalActionsRequest = (ScheduleTerminalActionsRequest) o;
    return Objects.equals(this.actionDetails, scheduleTerminalActionsRequest.actionDetails) &&
        Objects.equals(this.scheduledAt, scheduleTerminalActionsRequest.scheduledAt) &&
        Objects.equals(this.storeId, scheduleTerminalActionsRequest.storeId) &&
        Objects.equals(this.terminalIds, scheduleTerminalActionsRequest.terminalIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionDetails, scheduledAt, storeId, terminalIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleTerminalActionsRequest {\n");
    sb.append("    actionDetails: ").append(toIndentedString(actionDetails)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    terminalIds: ").append(toIndentedString(terminalIds)).append("\n");
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
   * Create an instance of ScheduleTerminalActionsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ScheduleTerminalActionsRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to ScheduleTerminalActionsRequest
   */
  public static ScheduleTerminalActionsRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ScheduleTerminalActionsRequest.class);
  }
/**
  * Convert an instance of ScheduleTerminalActionsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

