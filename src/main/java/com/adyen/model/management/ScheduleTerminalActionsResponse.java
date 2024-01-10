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
import com.adyen.model.management.ScheduleTerminalActionsRequestActionDetails;
import com.adyen.model.management.TerminalActionScheduleDetail;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * ScheduleTerminalActionsResponse
 */
@JsonPropertyOrder({
  ScheduleTerminalActionsResponse.JSON_PROPERTY_ACTION_DETAILS,
  ScheduleTerminalActionsResponse.JSON_PROPERTY_ITEMS,
  ScheduleTerminalActionsResponse.JSON_PROPERTY_SCHEDULED_AT,
  ScheduleTerminalActionsResponse.JSON_PROPERTY_STORE_ID,
  ScheduleTerminalActionsResponse.JSON_PROPERTY_TERMINALS_WITH_ERRORS,
  ScheduleTerminalActionsResponse.JSON_PROPERTY_TOTAL_ERRORS,
  ScheduleTerminalActionsResponse.JSON_PROPERTY_TOTAL_SCHEDULED
})

public class ScheduleTerminalActionsResponse {
  public static final String JSON_PROPERTY_ACTION_DETAILS = "actionDetails";
  private ScheduleTerminalActionsRequestActionDetails actionDetails;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<TerminalActionScheduleDetail> items = null;

  public static final String JSON_PROPERTY_SCHEDULED_AT = "scheduledAt";
  private String scheduledAt;

  public static final String JSON_PROPERTY_STORE_ID = "storeId";
  private String storeId;

  public static final String JSON_PROPERTY_TERMINALS_WITH_ERRORS = "terminalsWithErrors";
  private Map<String, List<String>> terminalsWithErrors = null;

  public static final String JSON_PROPERTY_TOTAL_ERRORS = "totalErrors";
  private Integer totalErrors;

  public static final String JSON_PROPERTY_TOTAL_SCHEDULED = "totalScheduled";
  private Integer totalScheduled;

  public ScheduleTerminalActionsResponse() { 
  }

  public ScheduleTerminalActionsResponse actionDetails(ScheduleTerminalActionsRequestActionDetails actionDetails) {
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


 /**
  * actionDetails
  *
  * @param actionDetails
  */ 
  @JsonProperty(JSON_PROPERTY_ACTION_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActionDetails(ScheduleTerminalActionsRequestActionDetails actionDetails) {
    this.actionDetails = actionDetails;
  }


  public ScheduleTerminalActionsResponse items(List<TerminalActionScheduleDetail> items) {
    this.items = items;
    return this;
  }

  public ScheduleTerminalActionsResponse addItemsItem(TerminalActionScheduleDetail itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list containing a terminal ID and an action ID for each terminal that the action was scheduled for.
   * @return items
  **/
  @ApiModelProperty(value = "A list containing a terminal ID and an action ID for each terminal that the action was scheduled for.")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TerminalActionScheduleDetail> getItems() {
    return items;
  }


 /**
  * A list containing a terminal ID and an action ID for each terminal that the action was scheduled for.
  *
  * @param items
  */ 
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<TerminalActionScheduleDetail> items) {
    this.items = items;
  }


  public ScheduleTerminalActionsResponse scheduledAt(String scheduledAt) {
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


 /**
  * The date and time when the action should happen.  Format: [RFC 3339](https://www.rfc-editor.org/rfc/rfc3339), but without the **Z** before the time offset. For example, **2021-11-15T12:16:21+01:00**  The action is sent with the first [maintenance call](https://docs.adyen.com/point-of-sale/automating-terminal-management/terminal-actions-api#when-actions-take-effect) after the specified date and time in the time zone of the terminal.  An empty value causes the action to be sent as soon as possible: at the next maintenance call.
  *
  * @param scheduledAt
  */ 
  @JsonProperty(JSON_PROPERTY_SCHEDULED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
  }


  public ScheduleTerminalActionsResponse storeId(String storeId) {
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


 /**
  * The unique ID of the [store](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/stores). If present, all terminals in the &#x60;terminalIds&#x60; list must be assigned to this store.
  *
  * @param storeId
  */ 
  @JsonProperty(JSON_PROPERTY_STORE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public ScheduleTerminalActionsResponse terminalsWithErrors(Map<String, List<String>> terminalsWithErrors) {
    this.terminalsWithErrors = terminalsWithErrors;
    return this;
  }

  public ScheduleTerminalActionsResponse putTerminalsWithErrorsItem(String key, List<String> terminalsWithErrorsItem) {
    if (this.terminalsWithErrors == null) {
      this.terminalsWithErrors = new HashMap<>();
    }
    this.terminalsWithErrors.put(key, terminalsWithErrorsItem);
    return this;
  }

   /**
   * The validation errors that occurred in the list of terminals, and for each error the IDs of the terminals that the error applies to.
   * @return terminalsWithErrors
  **/
  @ApiModelProperty(value = "The validation errors that occurred in the list of terminals, and for each error the IDs of the terminals that the error applies to.")
  @JsonProperty(JSON_PROPERTY_TERMINALS_WITH_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, List<String>> getTerminalsWithErrors() {
    return terminalsWithErrors;
  }


 /**
  * The validation errors that occurred in the list of terminals, and for each error the IDs of the terminals that the error applies to.
  *
  * @param terminalsWithErrors
  */ 
  @JsonProperty(JSON_PROPERTY_TERMINALS_WITH_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTerminalsWithErrors(Map<String, List<String>> terminalsWithErrors) {
    this.terminalsWithErrors = terminalsWithErrors;
  }


  public ScheduleTerminalActionsResponse totalErrors(Integer totalErrors) {
    this.totalErrors = totalErrors;
    return this;
  }

   /**
   * The number of terminals for which scheduling the action failed.
   * @return totalErrors
  **/
  @ApiModelProperty(value = "The number of terminals for which scheduling the action failed.")
  @JsonProperty(JSON_PROPERTY_TOTAL_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalErrors() {
    return totalErrors;
  }


 /**
  * The number of terminals for which scheduling the action failed.
  *
  * @param totalErrors
  */ 
  @JsonProperty(JSON_PROPERTY_TOTAL_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalErrors(Integer totalErrors) {
    this.totalErrors = totalErrors;
  }


  public ScheduleTerminalActionsResponse totalScheduled(Integer totalScheduled) {
    this.totalScheduled = totalScheduled;
    return this;
  }

   /**
   * The number of terminals for which the action was successfully scheduled. This doesn&#39;t mean the action has happened yet.
   * @return totalScheduled
  **/
  @ApiModelProperty(value = "The number of terminals for which the action was successfully scheduled. This doesn't mean the action has happened yet.")
  @JsonProperty(JSON_PROPERTY_TOTAL_SCHEDULED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalScheduled() {
    return totalScheduled;
  }


 /**
  * The number of terminals for which the action was successfully scheduled. This doesn&#39;t mean the action has happened yet.
  *
  * @param totalScheduled
  */ 
  @JsonProperty(JSON_PROPERTY_TOTAL_SCHEDULED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalScheduled(Integer totalScheduled) {
    this.totalScheduled = totalScheduled;
  }


  /**
   * Return true if this ScheduleTerminalActionsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleTerminalActionsResponse scheduleTerminalActionsResponse = (ScheduleTerminalActionsResponse) o;
    return Objects.equals(this.actionDetails, scheduleTerminalActionsResponse.actionDetails) &&
        Objects.equals(this.items, scheduleTerminalActionsResponse.items) &&
        Objects.equals(this.scheduledAt, scheduleTerminalActionsResponse.scheduledAt) &&
        Objects.equals(this.storeId, scheduleTerminalActionsResponse.storeId) &&
        Objects.equals(this.terminalsWithErrors, scheduleTerminalActionsResponse.terminalsWithErrors) &&
        Objects.equals(this.totalErrors, scheduleTerminalActionsResponse.totalErrors) &&
        Objects.equals(this.totalScheduled, scheduleTerminalActionsResponse.totalScheduled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionDetails, items, scheduledAt, storeId, terminalsWithErrors, totalErrors, totalScheduled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleTerminalActionsResponse {\n");
    sb.append("    actionDetails: ").append(toIndentedString(actionDetails)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    terminalsWithErrors: ").append(toIndentedString(terminalsWithErrors)).append("\n");
    sb.append("    totalErrors: ").append(toIndentedString(totalErrors)).append("\n");
    sb.append("    totalScheduled: ").append(toIndentedString(totalScheduled)).append("\n");
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
   * Create an instance of ScheduleTerminalActionsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ScheduleTerminalActionsResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to ScheduleTerminalActionsResponse
   */
  public static ScheduleTerminalActionsResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ScheduleTerminalActionsResponse.class);
  }
/**
  * Convert an instance of ScheduleTerminalActionsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

