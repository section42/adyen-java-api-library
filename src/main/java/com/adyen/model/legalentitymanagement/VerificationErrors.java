/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.legalentitymanagement.CapabilityProblem;
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
 * VerificationErrors
 */
@JsonPropertyOrder({
  VerificationErrors.JSON_PROPERTY_PROBLEMS
})

public class VerificationErrors {
  public static final String JSON_PROPERTY_PROBLEMS = "problems";
  private List<CapabilityProblem> problems = null;

  public VerificationErrors() { 
  }

  public VerificationErrors problems(List<CapabilityProblem> problems) {
    this.problems = problems;
    return this;
  }

  public VerificationErrors addProblemsItem(CapabilityProblem problemsItem) {
    if (this.problems == null) {
      this.problems = new ArrayList<>();
    }
    this.problems.add(problemsItem);
    return this;
  }

   /**
   * List of the verification errors.
   * @return problems
  **/
  @ApiModelProperty(value = "List of the verification errors.")
  @JsonProperty(JSON_PROPERTY_PROBLEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CapabilityProblem> getProblems() {
    return problems;
  }


 /**
  * List of the verification errors.
  *
  * @param problems
  */ 
  @JsonProperty(JSON_PROPERTY_PROBLEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProblems(List<CapabilityProblem> problems) {
    this.problems = problems;
  }


  /**
   * Return true if this VerificationErrors object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationErrors verificationErrors = (VerificationErrors) o;
    return Objects.equals(this.problems, verificationErrors.problems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(problems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationErrors {\n");
    sb.append("    problems: ").append(toIndentedString(problems)).append("\n");
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
   * Create an instance of VerificationErrors given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VerificationErrors
   * @throws JsonProcessingException if the JSON string is invalid with respect to VerificationErrors
   */
  public static VerificationErrors fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, VerificationErrors.class);
  }
/**
  * Convert an instance of VerificationErrors to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

