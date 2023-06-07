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

package com.adyen.service.legalentitymanagement;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.legalentitymanagement.AcceptTermsOfServiceRequest;
import com.adyen.model.legalentitymanagement.AcceptTermsOfServiceResponse;
import com.adyen.model.legalentitymanagement.GetTermsOfServiceAcceptanceInfosResponse;
import com.adyen.model.legalentitymanagement.GetTermsOfServiceDocumentRequest;
import com.adyen.model.legalentitymanagement.GetTermsOfServiceDocumentResponse;
import com.adyen.model.legalentitymanagement.ServiceError;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TermsOfServiceApi extends Service {
    private final String baseURL;

    public TermsOfServiceApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://kyc-test.adyen.com/lem/v3");
    }

    /**
    * Get Terms of Service information for a legal entity
    *
    * @param id {@link String } The unique identifier of the legal entity. (required)
    * @return {@link GetTermsOfServiceAcceptanceInfosResponse }
    * @throws ApiException if fails to make API call
    */
    public GetTermsOfServiceAcceptanceInfosResponse getTermsOfServiceInformationForLegalEntity(String id) throws ApiException, IOException {
        return getTermsOfServiceInformationForLegalEntity(id, null);
    }

    /**
    * Get Terms of Service information for a legal entity
    *
    * @param id {@link String } The unique identifier of the legal entity. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link GetTermsOfServiceAcceptanceInfosResponse }
    * @throws ApiException if fails to make API call
    */
    public GetTermsOfServiceAcceptanceInfosResponse getTermsOfServiceInformationForLegalEntity(String id, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/legalEntities/{id}/termsOfServiceAcceptanceInfos", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return GetTermsOfServiceAcceptanceInfosResponse.fromJson(jsonResult);
    }

    /**
    * Accept Terms of Service
    *
    * @param id {@link String } The unique identifier of the legal entity. (required)
    * @param termsofservicedocumentid {@link String } The unique identifier of the Terms of Service document. (required)
    * @param acceptTermsOfServiceRequest {@link AcceptTermsOfServiceRequest }  (required)
    * @return {@link AcceptTermsOfServiceResponse }
    * @throws ApiException if fails to make API call
    */
    public AcceptTermsOfServiceResponse acceptTermsOfService(String id, String termsofservicedocumentid, AcceptTermsOfServiceRequest acceptTermsOfServiceRequest) throws ApiException, IOException {
        return acceptTermsOfService(id, termsofservicedocumentid, acceptTermsOfServiceRequest, null);
    }

    /**
    * Accept Terms of Service
    *
    * @param id {@link String } The unique identifier of the legal entity. (required)
    * @param termsofservicedocumentid {@link String } The unique identifier of the Terms of Service document. (required)
    * @param acceptTermsOfServiceRequest {@link AcceptTermsOfServiceRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link AcceptTermsOfServiceResponse }
    * @throws ApiException if fails to make API call
    */
    public AcceptTermsOfServiceResponse acceptTermsOfService(String id, String termsofservicedocumentid, AcceptTermsOfServiceRequest acceptTermsOfServiceRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);
        if (termsofservicedocumentid == null) {
            throw new IllegalArgumentException("Please provide the termsofservicedocumentid path parameter");
        }
        pathParams.put("termsofservicedocumentid", termsofservicedocumentid);

        String requestBody = acceptTermsOfServiceRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/legalEntities/{id}/termsOfService/{termsofservicedocumentid}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.PATCH, pathParams);
        return AcceptTermsOfServiceResponse.fromJson(jsonResult);
    }

    /**
    * Get Terms of Service document
    *
    * @param id {@link String } The unique identifier of the legal entity. (required)
    * @param getTermsOfServiceDocumentRequest {@link GetTermsOfServiceDocumentRequest }  (required)
    * @return {@link GetTermsOfServiceDocumentResponse }
    * @throws ApiException if fails to make API call
    */
    public GetTermsOfServiceDocumentResponse getTermsOfServiceDocument(String id, GetTermsOfServiceDocumentRequest getTermsOfServiceDocumentRequest) throws ApiException, IOException {
        return getTermsOfServiceDocument(id, getTermsOfServiceDocumentRequest, null);
    }

    /**
    * Get Terms of Service document
    *
    * @param id {@link String } The unique identifier of the legal entity. (required)
    * @param getTermsOfServiceDocumentRequest {@link GetTermsOfServiceDocumentRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link GetTermsOfServiceDocumentResponse }
    * @throws ApiException if fails to make API call
    */
    public GetTermsOfServiceDocumentResponse getTermsOfServiceDocument(String id, GetTermsOfServiceDocumentRequest getTermsOfServiceDocumentRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);

        String requestBody = getTermsOfServiceDocumentRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/legalEntities/{id}/termsOfService", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return GetTermsOfServiceDocumentResponse.fromJson(jsonResult);
    }
}
