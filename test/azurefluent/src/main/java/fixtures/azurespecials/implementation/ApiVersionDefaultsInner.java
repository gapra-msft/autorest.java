/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials.implementation;

import com.microsoft.rest.v2.RestProxy;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.QueryParam;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import fixtures.azurespecials.ErrorException;
import java.io.IOException;
import rx.functions.Func1;
import rx.Observable;
import rx.Single;

/**
 * An instance of this class provides access to all the operations defined
 * in ApiVersionDefaults.
 */
public class ApiVersionDefaultsInner {
    /** The RestProxy service to perform REST calls. */
    private ApiVersionDefaultsService service;
    /** The service client containing this operation class. */
    private AutoRestAzureSpecialParametersTestClientImpl client;

    /**
     * Initializes an instance of ApiVersionDefaultsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public ApiVersionDefaultsInner(AutoRestAzureSpecialParametersTestClientImpl client) {
        this.service = RestProxy.create(ApiVersionDefaultsService.class, client.restClient().baseURL(), client.httpClient(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ApiVersionDefaults to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ApiVersionDefaultsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azurespecials.ApiVersionDefaults getMethodGlobalValid" })
        @GET("azurespecials/apiVersion/method/string/none/query/global/2015-07-01-preview")
        Single<Void> getMethodGlobalValid(@QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azurespecials.ApiVersionDefaults getMethodGlobalNotProvidedValid" })
        @GET("azurespecials/apiVersion/method/string/none/query/globalNotProvided/2015-07-01-preview")
        Single<Void> getMethodGlobalNotProvidedValid(@QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azurespecials.ApiVersionDefaults getPathGlobalValid" })
        @GET("azurespecials/apiVersion/path/string/none/query/global/2015-07-01-preview")
        Single<Void> getPathGlobalValid(@QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azurespecials.ApiVersionDefaults getSwaggerGlobalValid" })
        @GET("azurespecials/apiVersion/swagger/string/none/query/global/2015-07-01-preview")
        Single<Void> getSwaggerGlobalValid(@QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void getMethodGlobalValid() {
        getMethodGlobalValidAsync().toBlocking().value();
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getMethodGlobalValidAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getMethodGlobalValidAsync(), serviceCallback);
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> getMethodGlobalValidAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getMethodGlobalValid(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
    }


    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void getMethodGlobalNotProvidedValid() {
        getMethodGlobalNotProvidedValidAsync().toBlocking().value();
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getMethodGlobalNotProvidedValidAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getMethodGlobalNotProvidedValidAsync(), serviceCallback);
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> getMethodGlobalNotProvidedValidAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getMethodGlobalNotProvidedValid(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
    }


    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void getPathGlobalValid() {
        getPathGlobalValidAsync().toBlocking().value();
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getPathGlobalValidAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getPathGlobalValidAsync(), serviceCallback);
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> getPathGlobalValidAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getPathGlobalValid(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
    }


    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void getSwaggerGlobalValid() {
        getSwaggerGlobalValidAsync().toBlocking().value();
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getSwaggerGlobalValidAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getSwaggerGlobalValidAsync(), serviceCallback);
    }

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> getSwaggerGlobalValidAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getSwaggerGlobalValid(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
    }


}
