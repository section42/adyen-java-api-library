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
import com.adyen.model.management.CompanyUser;
import com.adyen.model.management.PaginationLinks;
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
 * ListCompanyUsersResponse
 */
@JsonPropertyOrder({
  ListCompanyUsersResponse.JSON_PROPERTY_LINKS,
  ListCompanyUsersResponse.JSON_PROPERTY_DATA,
  ListCompanyUsersResponse.JSON_PROPERTY_ITEMS_TOTAL,
  ListCompanyUsersResponse.JSON_PROPERTY_PAGES_TOTAL
})

public class ListCompanyUsersResponse {
  public static final String JSON_PROPERTY_LINKS = "_links";
  private PaginationLinks links;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<CompanyUser> data = null;

  public static final String JSON_PROPERTY_ITEMS_TOTAL = "itemsTotal";
  private Integer itemsTotal;

  public static final String JSON_PROPERTY_PAGES_TOTAL = "pagesTotal";
  private Integer pagesTotal;

  public ListCompanyUsersResponse() { 
  }

  public ListCompanyUsersResponse links(PaginationLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaginationLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(PaginationLinks links) {
    this.links = links;
  }


  public ListCompanyUsersResponse data(List<CompanyUser> data) {
    this.data = data;
    return this;
  }

  public ListCompanyUsersResponse addDataItem(CompanyUser dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * The list of users.
   * @return data
  **/
  @ApiModelProperty(value = "The list of users.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CompanyUser> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<CompanyUser> data) {
    this.data = data;
  }


  public ListCompanyUsersResponse itemsTotal(Integer itemsTotal) {
    this.itemsTotal = itemsTotal;
    return this;
  }

   /**
   * Total number of items.
   * @return itemsTotal
  **/
  @ApiModelProperty(required = true, value = "Total number of items.")
  @JsonProperty(JSON_PROPERTY_ITEMS_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getItemsTotal() {
    return itemsTotal;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItemsTotal(Integer itemsTotal) {
    this.itemsTotal = itemsTotal;
  }


  public ListCompanyUsersResponse pagesTotal(Integer pagesTotal) {
    this.pagesTotal = pagesTotal;
    return this;
  }

   /**
   * Total number of pages.
   * @return pagesTotal
  **/
  @ApiModelProperty(required = true, value = "Total number of pages.")
  @JsonProperty(JSON_PROPERTY_PAGES_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPagesTotal() {
    return pagesTotal;
  }


  @JsonProperty(JSON_PROPERTY_PAGES_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPagesTotal(Integer pagesTotal) {
    this.pagesTotal = pagesTotal;
  }


  /**
   * Return true if this ListCompanyUsersResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCompanyUsersResponse listCompanyUsersResponse = (ListCompanyUsersResponse) o;
    return Objects.equals(this.links, listCompanyUsersResponse.links) &&
        Objects.equals(this.data, listCompanyUsersResponse.data) &&
        Objects.equals(this.itemsTotal, listCompanyUsersResponse.itemsTotal) &&
        Objects.equals(this.pagesTotal, listCompanyUsersResponse.pagesTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, data, itemsTotal, pagesTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCompanyUsersResponse {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    itemsTotal: ").append(toIndentedString(itemsTotal)).append("\n");
    sb.append("    pagesTotal: ").append(toIndentedString(pagesTotal)).append("\n");
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
   * Create an instance of ListCompanyUsersResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListCompanyUsersResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to ListCompanyUsersResponse
   */
  public static ListCompanyUsersResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ListCompanyUsersResponse.class);
  }
/**
  * Convert an instance of ListCompanyUsersResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

