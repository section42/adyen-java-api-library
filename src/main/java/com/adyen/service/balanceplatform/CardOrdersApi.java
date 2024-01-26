/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.adyen.service.balanceplatform;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import java.time.OffsetDateTime;
import com.adyen.model.balanceplatform.PaginatedGetCardOrderItemResponse;
import com.adyen.model.balanceplatform.PaginatedGetCardOrderResponse;
import com.adyen.model.balanceplatform.RestServiceError;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CardOrdersApi extends Service {

    public static final String API_VERSION = "2";

    protected String baseURL;

    /**
    * Card orders constructor in {@link com.adyen.service.balanceplatform package}.
    * @param client {@link Client } (required)
    */
    public CardOrdersApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://balanceplatform-api-test.adyen.com/bcl/v2");
    }

    /**
    * Card orders constructor in {@link com.adyen.service.balanceplatform package}.
    * Please use this constructor only if you would like to pass along your own url for routing or testing purposes. The latest API version is defined in this class as a constant.
    * @param client {@link Client } (required)
    * @param baseURL {@link String } (required)
    */
    public CardOrdersApi(Client client, String baseURL) {
        super(client);
        this.baseURL = baseURL;
    }

    /**
    * Get a list of card orders
    *
    * @return {@link PaginatedGetCardOrderResponse }
    * @throws ApiException if fails to make API call
    */
    public PaginatedGetCardOrderResponse listCardOrders() throws ApiException, IOException {
        return listCardOrders(null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null);
    }

    /**
    * Get a list of card orders
    *
    * @param id {@link String } Query: The unique identifier of the card order.  (optional)
    * @param cardManufacturingProfileId {@link String } Query: The unique identifier of the card manufacturer profile. (optional)
    * @param status {@link String } Query: The status of the card order. (optional)
    * @param txVariantCode {@link String } Query: The unique code of the card manufacturer profile.  Possible values: **mcmaestro**, **mc**, **visa**, **mcdebit**.  (optional)
    * @param createdSince {@link OffsetDateTime } Query: Only include card orders that have been created on or after this point in time. The value must be in ISO 8601 format. For example, **2021-05-30T15:07:40Z**. (optional)
    * @param createdUntil {@link OffsetDateTime } Query: Only include card orders that have been created on or before this point in time. The value must be in ISO 8601 format. For example, **2021-05-30T15:07:40Z**. (optional)
    * @param lockedSince {@link OffsetDateTime } Query: Only include card orders that have been locked on or after this point in time. The value must be in ISO 8601 format. For example, **2021-05-30T15:07:40Z**. (optional)
    * @param lockedUntil {@link OffsetDateTime } Query: Only include card orders that have been locked on or before this point in time. The value must be in ISO 8601 format. For example, **2021-05-30T15:07:40Z**. (optional)
    * @param serviceCenter {@link String } Query: The service center at which the card is issued. The value is case-sensitive.  (optional)
    * @param offset {@link Integer } Query: Specifies the position of an element in a list of card orders. The response includes a list of card orders that starts at the specified offset.  **Default:** 0, which means that the response contains all the elements in the list of card orders. (optional)
    * @param limit {@link Integer } Query: The number of card orders returned per page. **Default:** 10. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link PaginatedGetCardOrderResponse }
    * @throws ApiException if fails to make API call
    */
    public PaginatedGetCardOrderResponse listCardOrders(String id, String cardManufacturingProfileId, String status, String txVariantCode, OffsetDateTime createdSince, OffsetDateTime createdUntil, OffsetDateTime lockedSince, OffsetDateTime lockedUntil, String serviceCenter, Integer offset, Integer limit, RequestOptions requestOptions) throws ApiException, IOException {
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (id != null) {
        queryParams.put("id", id);
        }
        if (cardManufacturingProfileId != null) {
        queryParams.put("cardManufacturingProfileId", cardManufacturingProfileId);
        }
        if (status != null) {
        queryParams.put("status", status);
        }
        if (txVariantCode != null) {
        queryParams.put("txVariantCode", txVariantCode);
        }
        if (createdSince != null) {
        queryParams.put("createdSince", createdSince.toString());
        }
        if (createdUntil != null) {
        queryParams.put("createdUntil", createdUntil.toString());
        }
        if (lockedSince != null) {
        queryParams.put("lockedSince", lockedSince.toString());
        }
        if (lockedUntil != null) {
        queryParams.put("lockedUntil", lockedUntil.toString());
        }
        if (serviceCenter != null) {
        queryParams.put("serviceCenter", serviceCenter);
        }
        if (offset != null) {
        queryParams.put("offset", offset.toString());
        }
        if (limit != null) {
        queryParams.put("limit", limit.toString());
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/cardorders", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, null, queryParams);
        return PaginatedGetCardOrderResponse.fromJson(jsonResult);
    }

    /**
    * Get card order items
    *
    * @param id {@link String } The unique identifier of the card order. (required)
    * @return {@link PaginatedGetCardOrderItemResponse }
    * @throws ApiException if fails to make API call
    */
    public PaginatedGetCardOrderItemResponse getCardOrderItems(String id) throws ApiException, IOException {
        return getCardOrderItems(id, null,  null,  null);
    }

    /**
    * Get card order items
    *
    * @param id {@link String } The unique identifier of the card order. (required)
    * @param offset {@link Integer } Query: Specifies the position of an element in a list of card orders. The response includes a list of card order items that starts at the specified offset.  **Default:** 0, which means that the response contains all the elements in the list of card order items. (optional)
    * @param limit {@link Integer } Query: The number of card order items returned per page. **Default:** 10. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link PaginatedGetCardOrderItemResponse }
    * @throws ApiException if fails to make API call
    */
    public PaginatedGetCardOrderItemResponse getCardOrderItems(String id, Integer offset, Integer limit, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (offset != null) {
        queryParams.put("offset", offset.toString());
        }
        if (limit != null) {
        queryParams.put("limit", limit.toString());
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/cardorders/{id}/items", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return PaginatedGetCardOrderItemResponse.fromJson(jsonResult);
    }
}
