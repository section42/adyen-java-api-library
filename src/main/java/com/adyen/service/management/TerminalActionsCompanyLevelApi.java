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

package com.adyen.service.management;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.management.ExternalTerminalAction;
import com.adyen.model.management.ListExternalTerminalActionsResponse;
import com.adyen.model.management.RestServiceError;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TerminalActionsCompanyLevelApi extends Service {

    public static final String API_VERSION = "3";

    protected String baseURL;

    /**
    * Terminal actions - company level constructor in {@link com.adyen.service.management package}.
    * @param client {@link Client } (required)
    */
    public TerminalActionsCompanyLevelApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://management-test.adyen.com/v3");
    }

    /**
    * Terminal actions - company level constructor in {@link com.adyen.service.management package}.
    * Please use this constructor only if you would like to pass along your own url for routing or testing purposes. The latest API version is defined in this class as a constant.
    * @param client {@link Client } (required)
    * @param baseURL {@link String } (required)
    */
    public TerminalActionsCompanyLevelApi(Client client, String baseURL) {
        super(client);
        this.baseURL = baseURL;
    }

    /**
    * Get a list of terminal actions
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @return {@link ListExternalTerminalActionsResponse }
    * @throws ApiException if fails to make API call
    */
    public ListExternalTerminalActionsResponse listTerminalActions(String companyId) throws ApiException, IOException {
        return listTerminalActions(companyId, null,  null,  null,  null,  null);
    }

    /**
    * Get a list of terminal actions
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param pageNumber {@link Integer } Query: The number of the page to fetch. (optional)
    * @param pageSize {@link Integer } Query: The number of items to have on a page, maximum 100. The default is 20 items on a page. (optional)
    * @param status {@link String } Query: Returns terminal actions with the specified status.  Allowed values: **pending**, **successful**, **failed**, **cancelled**, **tryLater**. (optional)
    * @param type {@link String } Query: Returns terminal actions of the specified type.  Allowed values: **InstallAndroidApp**, **UninstallAndroidApp**, **InstallAndroidCertificate**, **UninstallAndroidCertificate**. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link ListExternalTerminalActionsResponse }
    * @throws ApiException if fails to make API call
    */
    public ListExternalTerminalActionsResponse listTerminalActions(String companyId, Integer pageNumber, Integer pageSize, String status, String type, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (pageNumber != null) {
        queryParams.put("pageNumber", pageNumber.toString());
        }
        if (pageSize != null) {
        queryParams.put("pageSize", pageSize.toString());
        }
        if (status != null) {
        queryParams.put("status", status);
        }
        if (type != null) {
        queryParams.put("type", type);
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/terminalActions", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return ListExternalTerminalActionsResponse.fromJson(jsonResult);
    }

    /**
    * Get terminal action
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param actionId {@link String } The unique identifier of the terminal action. (required)
    * @return {@link ExternalTerminalAction }
    * @throws ApiException if fails to make API call
    */
    public ExternalTerminalAction getTerminalAction(String companyId, String actionId) throws ApiException, IOException {
        return getTerminalAction(companyId, actionId, null);
    }

    /**
    * Get terminal action
    *
    * @param companyId {@link String } The unique identifier of the company account. (required)
    * @param actionId {@link String } The unique identifier of the terminal action. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link ExternalTerminalAction }
    * @throws ApiException if fails to make API call
    */
    public ExternalTerminalAction getTerminalAction(String companyId, String actionId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (companyId == null) {
            throw new IllegalArgumentException("Please provide the companyId path parameter");
        }
        pathParams.put("companyId", companyId);
        if (actionId == null) {
            throw new IllegalArgumentException("Please provide the actionId path parameter");
        }
        pathParams.put("actionId", actionId);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/companies/{companyId}/terminalActions/{actionId}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return ExternalTerminalAction.fromJson(jsonResult);
    }
}
