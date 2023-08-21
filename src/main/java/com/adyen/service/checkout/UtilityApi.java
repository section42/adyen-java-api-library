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

package com.adyen.service.checkout;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.checkout.ApplePaySessionRequest;
import com.adyen.model.checkout.ApplePaySessionResponse;
import com.adyen.model.checkout.ServiceError;
import com.adyen.model.checkout.UtilityRequest;
import com.adyen.model.checkout.UtilityResponse;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UtilityApi extends Service {

    public static final String API_VERSION = "70";

    protected String baseURL;

    public UtilityApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://checkout-test.adyen.com/v70");
    }

    public UtilityApi(Client client, String baseURL) {
        super(client);
        this.baseURL = baseURL;
    }

    /**
    * Get an Apple Pay session
    *
    * @param applePaySessionRequest {@link ApplePaySessionRequest }  (required)
    * @return {@link ApplePaySessionResponse }
    * @throws ApiException if fails to make API call
    */
    public ApplePaySessionResponse getApplePaySession(ApplePaySessionRequest applePaySessionRequest) throws ApiException, IOException {
        return getApplePaySession(applePaySessionRequest, null);
    }

    /**
    * Get an Apple Pay session
    *
    * @param applePaySessionRequest {@link ApplePaySessionRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link ApplePaySessionResponse }
    * @throws ApiException if fails to make API call
    */
    public ApplePaySessionResponse getApplePaySession(ApplePaySessionRequest applePaySessionRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = applePaySessionRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/applePay/sessions", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return ApplePaySessionResponse.fromJson(jsonResult);
    }

    /**
    * Create originKey values for domains
    *
    * @param utilityRequest {@link UtilityRequest }  (required)
    * @return {@link UtilityResponse }
    * @throws ApiException if fails to make API call
    * @deprecated
    */
    @Deprecated
    public UtilityResponse originKeys(UtilityRequest utilityRequest) throws ApiException, IOException {
        return originKeys(utilityRequest, null);
    }

    /**
    * Create originKey values for domains
    *
    * @param utilityRequest {@link UtilityRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link UtilityResponse }
    * @throws ApiException if fails to make API call
    * @deprecated
    */
   @Deprecated
    public UtilityResponse originKeys(UtilityRequest utilityRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = utilityRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/originKeys", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return UtilityResponse.fromJson(jsonResult);
    }
}
