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
import com.adyen.model.legalentitymanagement.OnboardingLink;
import com.adyen.model.legalentitymanagement.OnboardingLinkInfo;
import com.adyen.model.legalentitymanagement.OnboardingTheme;
import com.adyen.model.legalentitymanagement.OnboardingThemes;
import com.adyen.model.legalentitymanagement.ServiceError;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HostedOnboardingApi extends Service {
    public String baseURL;

    public HostedOnboardingApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://kyc-test.adyen.com/lem/v3");
    }

    /**
    * Get a list of hosted onboarding page themes
    *
    * @return {@link OnboardingThemes }
    * @throws ApiException if fails to make API call
    */
    public OnboardingThemes listHostedOnboardingPageThemes() throws ApiException, IOException {
        return listHostedOnboardingPageThemes(null);
    }

    /**
    * Get a list of hosted onboarding page themes
    *
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link OnboardingThemes }
    * @throws ApiException if fails to make API call
    */
    public OnboardingThemes listHostedOnboardingPageThemes(RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/themes", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, null);
        return OnboardingThemes.fromJson(jsonResult);
    }

    /**
    * Get an onboarding link theme
    *
    * @param id {@link String } The unique identifier of the theme (required)
    * @return {@link OnboardingTheme }
    * @throws ApiException if fails to make API call
    */
    public OnboardingTheme getOnboardingLinkTheme(String id) throws ApiException, IOException {
        return getOnboardingLinkTheme(id, null);
    }

    /**
    * Get an onboarding link theme
    *
    * @param id {@link String } The unique identifier of the theme (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link OnboardingTheme }
    * @throws ApiException if fails to make API call
    */
    public OnboardingTheme getOnboardingLinkTheme(String id, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/themes/{id}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return OnboardingTheme.fromJson(jsonResult);
    }

    /**
    * Get a link to an Adyen-hosted onboarding page
    *
    * @param id {@link String } The unique identifier of the legal entity (required)
    * @param onboardingLinkInfo {@link OnboardingLinkInfo }  (required)
    * @return {@link OnboardingLink }
    * @throws ApiException if fails to make API call
    */
    public OnboardingLink getLinkToAdyenhostedOnboardingPage(String id, OnboardingLinkInfo onboardingLinkInfo) throws ApiException, IOException {
        return getLinkToAdyenhostedOnboardingPage(id, onboardingLinkInfo, null);
    }

    /**
    * Get a link to an Adyen-hosted onboarding page
    *
    * @param id {@link String } The unique identifier of the legal entity (required)
    * @param onboardingLinkInfo {@link OnboardingLinkInfo }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link OnboardingLink }
    * @throws ApiException if fails to make API call
    */
    public OnboardingLink getLinkToAdyenhostedOnboardingPage(String id, OnboardingLinkInfo onboardingLinkInfo, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);

        String requestBody = onboardingLinkInfo.toJson();
        Resource resource = new Resource(this, this.baseURL + "/legalEntities/{id}/onboardingLinks", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return OnboardingLink.fromJson(jsonResult);
    }
}
