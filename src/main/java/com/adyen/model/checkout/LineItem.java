/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.adyen.model.checkout.JSON;

/**
 * LineItem
 */

public class LineItem {
  public static final String SERIALIZED_NAME_AMOUNT_EXCLUDING_TAX = "amountExcludingTax";
  @SerializedName(SERIALIZED_NAME_AMOUNT_EXCLUDING_TAX)
  private Long amountExcludingTax;

  public static final String SERIALIZED_NAME_AMOUNT_INCLUDING_TAX = "amountIncludingTax";
  @SerializedName(SERIALIZED_NAME_AMOUNT_INCLUDING_TAX)
  private Long amountIncludingTax;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_ITEM_CATEGORY = "itemCategory";
  @SerializedName(SERIALIZED_NAME_ITEM_CATEGORY)
  private String itemCategory;

  public static final String SERIALIZED_NAME_MANUFACTURER = "manufacturer";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER)
  private String manufacturer;

  public static final String SERIALIZED_NAME_PRODUCT_URL = "productUrl";
  @SerializedName(SERIALIZED_NAME_PRODUCT_URL)
  private String productUrl;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Long quantity;

  public static final String SERIALIZED_NAME_RECEIVER_EMAIL = "receiverEmail";
  @SerializedName(SERIALIZED_NAME_RECEIVER_EMAIL)
  private String receiverEmail;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private String size;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_TAX_AMOUNT = "taxAmount";
  @SerializedName(SERIALIZED_NAME_TAX_AMOUNT)
  private Long taxAmount;

  public static final String SERIALIZED_NAME_TAX_PERCENTAGE = "taxPercentage";
  @SerializedName(SERIALIZED_NAME_TAX_PERCENTAGE)
  private Long taxPercentage;

  public static final String SERIALIZED_NAME_UPC = "upc";
  @SerializedName(SERIALIZED_NAME_UPC)
  private String upc;

  public LineItem() { 
  }

  public LineItem amountExcludingTax(Long amountExcludingTax) {
    
    this.amountExcludingTax = amountExcludingTax;
    return this;
  }

   /**
   * Item amount excluding the tax, in minor units.
   * @return amountExcludingTax
  **/
  @ApiModelProperty(value = "Item amount excluding the tax, in minor units.")

  public Long getAmountExcludingTax() {
    return amountExcludingTax;
  }


  public void setAmountExcludingTax(Long amountExcludingTax) {
    this.amountExcludingTax = amountExcludingTax;
  }


  public LineItem amountIncludingTax(Long amountIncludingTax) {
    
    this.amountIncludingTax = amountIncludingTax;
    return this;
  }

   /**
   * Item amount including the tax, in minor units.
   * @return amountIncludingTax
  **/
  @ApiModelProperty(value = "Item amount including the tax, in minor units.")

  public Long getAmountIncludingTax() {
    return amountIncludingTax;
  }


  public void setAmountIncludingTax(Long amountIncludingTax) {
    this.amountIncludingTax = amountIncludingTax;
  }


  public LineItem brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * Brand of the item.
   * @return brand
  **/
  @ApiModelProperty(value = "Brand of the item.")

  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {
    this.brand = brand;
  }


  public LineItem color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * Color of the item.
   * @return color
  **/
  @ApiModelProperty(value = "Color of the item.")

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    this.color = color;
  }


  public LineItem description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the line item.
   * @return description
  **/
  @ApiModelProperty(value = "Description of the line item.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public LineItem id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the line item.
   * @return id
  **/
  @ApiModelProperty(value = "ID of the line item.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public LineItem imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Link to the picture of the purchased item.
   * @return imageUrl
  **/
  @ApiModelProperty(value = "Link to the picture of the purchased item.")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public LineItem itemCategory(String itemCategory) {
    
    this.itemCategory = itemCategory;
    return this;
  }

   /**
   * Item category, used by the payment methods PayPal and Ratepay.
   * @return itemCategory
  **/
  @ApiModelProperty(value = "Item category, used by the payment methods PayPal and Ratepay.")

  public String getItemCategory() {
    return itemCategory;
  }


  public void setItemCategory(String itemCategory) {
    this.itemCategory = itemCategory;
  }


  public LineItem manufacturer(String manufacturer) {
    
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * Manufacturer of the item.
   * @return manufacturer
  **/
  @ApiModelProperty(value = "Manufacturer of the item.")

  public String getManufacturer() {
    return manufacturer;
  }


  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }


  public LineItem productUrl(String productUrl) {
    
    this.productUrl = productUrl;
    return this;
  }

   /**
   * Link to the purchased item.
   * @return productUrl
  **/
  @ApiModelProperty(value = "Link to the purchased item.")

  public String getProductUrl() {
    return productUrl;
  }


  public void setProductUrl(String productUrl) {
    this.productUrl = productUrl;
  }


  public LineItem quantity(Long quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Number of items.
   * @return quantity
  **/
  @ApiModelProperty(value = "Number of items.")

  public Long getQuantity() {
    return quantity;
  }


  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }


  public LineItem receiverEmail(String receiverEmail) {
    
    this.receiverEmail = receiverEmail;
    return this;
  }

   /**
   * Email associated with the given product in the basket (usually in electronic gift cards).
   * @return receiverEmail
  **/
  @ApiModelProperty(value = "Email associated with the given product in the basket (usually in electronic gift cards).")

  public String getReceiverEmail() {
    return receiverEmail;
  }


  public void setReceiverEmail(String receiverEmail) {
    this.receiverEmail = receiverEmail;
  }


  public LineItem size(String size) {
    
    this.size = size;
    return this;
  }

   /**
   * Size of the item.
   * @return size
  **/
  @ApiModelProperty(value = "Size of the item.")

  public String getSize() {
    return size;
  }


  public void setSize(String size) {
    this.size = size;
  }


  public LineItem sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * Stock keeping unit.
   * @return sku
  **/
  @ApiModelProperty(value = "Stock keeping unit.")

  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    this.sku = sku;
  }


  public LineItem taxAmount(Long taxAmount) {
    
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Tax amount, in minor units.
   * @return taxAmount
  **/
  @ApiModelProperty(value = "Tax amount, in minor units.")

  public Long getTaxAmount() {
    return taxAmount;
  }


  public void setTaxAmount(Long taxAmount) {
    this.taxAmount = taxAmount;
  }


  public LineItem taxPercentage(Long taxPercentage) {
    
    this.taxPercentage = taxPercentage;
    return this;
  }

   /**
   * Tax percentage, in minor units.
   * @return taxPercentage
  **/
  @ApiModelProperty(value = "Tax percentage, in minor units.")

  public Long getTaxPercentage() {
    return taxPercentage;
  }


  public void setTaxPercentage(Long taxPercentage) {
    this.taxPercentage = taxPercentage;
  }


  public LineItem upc(String upc) {
    
    this.upc = upc;
    return this;
  }

   /**
   * Universal Product Code.
   * @return upc
  **/
  @ApiModelProperty(value = "Universal Product Code.")

  public String getUpc() {
    return upc;
  }


  public void setUpc(String upc) {
    this.upc = upc;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineItem lineItem = (LineItem) o;
    return Objects.equals(this.amountExcludingTax, lineItem.amountExcludingTax) &&
        Objects.equals(this.amountIncludingTax, lineItem.amountIncludingTax) &&
        Objects.equals(this.brand, lineItem.brand) &&
        Objects.equals(this.color, lineItem.color) &&
        Objects.equals(this.description, lineItem.description) &&
        Objects.equals(this.id, lineItem.id) &&
        Objects.equals(this.imageUrl, lineItem.imageUrl) &&
        Objects.equals(this.itemCategory, lineItem.itemCategory) &&
        Objects.equals(this.manufacturer, lineItem.manufacturer) &&
        Objects.equals(this.productUrl, lineItem.productUrl) &&
        Objects.equals(this.quantity, lineItem.quantity) &&
        Objects.equals(this.receiverEmail, lineItem.receiverEmail) &&
        Objects.equals(this.size, lineItem.size) &&
        Objects.equals(this.sku, lineItem.sku) &&
        Objects.equals(this.taxAmount, lineItem.taxAmount) &&
        Objects.equals(this.taxPercentage, lineItem.taxPercentage) &&
        Objects.equals(this.upc, lineItem.upc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountExcludingTax, amountIncludingTax, brand, color, description, id, imageUrl, itemCategory, manufacturer, productUrl, quantity, receiverEmail, size, sku, taxAmount, taxPercentage, upc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItem {\n");
    sb.append("    amountExcludingTax: ").append(toIndentedString(amountExcludingTax)).append("\n");
    sb.append("    amountIncludingTax: ").append(toIndentedString(amountIncludingTax)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    itemCategory: ").append(toIndentedString(itemCategory)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    productUrl: ").append(toIndentedString(productUrl)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    receiverEmail: ").append(toIndentedString(receiverEmail)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    taxPercentage: ").append(toIndentedString(taxPercentage)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("amountExcludingTax");
    openapiFields.add("amountIncludingTax");
    openapiFields.add("brand");
    openapiFields.add("color");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("imageUrl");
    openapiFields.add("itemCategory");
    openapiFields.add("manufacturer");
    openapiFields.add("productUrl");
    openapiFields.add("quantity");
    openapiFields.add("receiverEmail");
    openapiFields.add("size");
    openapiFields.add("sku");
    openapiFields.add("taxAmount");
    openapiFields.add("taxPercentage");
    openapiFields.add("upc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    validateJsonObject(jsonObj, false);
  }
 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @param strictValidation reject (new) fields missing from the specifications
  * @throws IOException if the JSON Object is invalid with respect to LineItem
  */
  public static void validateJsonObject(JsonObject jsonObj, boolean strictValidation) throws IOException {
      if (jsonObj == null) {
        if (LineItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in LineItem is not found in the empty JSON string", LineItem.openapiRequiredFields.toString()));
        }
      }
      if (strictValidation) {
          Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
          // check to see if the JSON string contains additional fields
          for (Entry<String, JsonElement> entry : entries) {
            if (!LineItem.openapiFields.contains(entry.getKey())) {
              throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LineItem` properties.", entry.getKey()));
            }
          }
      }
      // validate the optional field brand
      if (jsonObj.get("brand") != null && !jsonObj.get("brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand").toString()));
      }
      // validate the optional field color
      if (jsonObj.get("color") != null && !jsonObj.get("color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color").toString()));
      }
      // validate the optional field description
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field imageUrl
      if (jsonObj.get("imageUrl") != null && !jsonObj.get("imageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageUrl").toString()));
      }
      // validate the optional field itemCategory
      if (jsonObj.get("itemCategory") != null && !jsonObj.get("itemCategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `itemCategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("itemCategory").toString()));
      }
      // validate the optional field manufacturer
      if (jsonObj.get("manufacturer") != null && !jsonObj.get("manufacturer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `manufacturer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("manufacturer").toString()));
      }
      // validate the optional field productUrl
      if (jsonObj.get("productUrl") != null && !jsonObj.get("productUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productUrl").toString()));
      }
      // validate the optional field receiverEmail
      if (jsonObj.get("receiverEmail") != null && !jsonObj.get("receiverEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `receiverEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("receiverEmail").toString()));
      }
      // validate the optional field size
      if (jsonObj.get("size") != null && !jsonObj.get("size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("size").toString()));
      }
      // validate the optional field sku
      if (jsonObj.get("sku") != null && !jsonObj.get("sku").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sku` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sku").toString()));
      }
      // validate the optional field upc
      if (jsonObj.get("upc") != null && !jsonObj.get("upc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LineItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LineItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LineItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LineItem.class));

       return (TypeAdapter<T>) new TypeAdapter<LineItem>() {
           @Override
           public void write(JsonWriter out, LineItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LineItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LineItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LineItem
  * @throws IOException if the JSON string is invalid with respect to LineItem
  */
  public static LineItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LineItem.class);
  }

 /**
  * Convert an instance of LineItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

