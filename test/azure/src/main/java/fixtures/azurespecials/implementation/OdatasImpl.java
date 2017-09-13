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
import fixtures.azurespecials.Odatas;
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
import fixtures.azurespecials.models.ErrorException;
import java.io.IOException;
import rx.functions.Func1;
import rx.Observable;
import rx.Single;

/**
 * An instance of this class provides access to all the operations defined
 * in Odatas.
 */
public class OdatasImpl implements Odatas {
    /** The RestProxy service to perform REST calls. */
    private OdatasService service;
    /** The service client containing this operation class. */
    private AutoRestAzureSpecialParametersTestClientImpl client;

    /**
     * Initializes an instance of OdatasImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public OdatasImpl(AutoRestAzureSpecialParametersTestClientImpl client) {
        this.service = RestProxy.create(OdatasService.class, client.restClient().baseURL(), client.httpClient(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for Odatas to be
     * used by Retrofit to perform actually REST calls.
     */
    interface OdatasService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azurespecials.Odatas getWithFilter" })
        @GET("azurespecials/odata/filter")
        Single<Void> getWithFilter(@QueryParam("$filter") String filter, @QueryParam("$top") Integer top, @QueryParam("$orderby") String orderby, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

    }

    /**
     * Specify filter parameter with value '$filter=id gt 5 and name eq 'foo'&amp;$orderby=id&amp;$top=10'.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void getWithFilter() {
        getWithFilterAsync().toBlocking().value();
    }

    /**
     * Specify filter parameter with value '$filter=id gt 5 and name eq 'foo'&amp;$orderby=id&amp;$top=10'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getWithFilterAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getWithFilterAsync(), serviceCallback);
    }

    /**
     * Specify filter parameter with value '$filter=id gt 5 and name eq 'foo'&amp;$orderby=id&amp;$top=10'.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Void} object if successful.
     */
    public Single<Void> getWithFilterAsync() {
        final String filter = null;
        final Integer top = null;
        final String orderby = null;
        return service.getWithFilter(filter, top, orderby, this.client.acceptLanguage(), this.client.userAgent());
    }

    /**
     * Specify filter parameter with value '$filter=id gt 5 and name eq 'foo'&amp;$orderby=id&amp;$top=10'.
     *
     * @param filter The filter parameter with value '$filter=id gt 5 and name eq 'foo''.
     * @param top The top parameter with value 10.
     * @param orderby The orderby parameter with value id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void getWithFilter(String filter, Integer top, String orderby) {
        getWithFilterAsync(filter, top, orderby).toBlocking().value();
    }

    /**
     * Specify filter parameter with value '$filter=id gt 5 and name eq 'foo'&amp;$orderby=id&amp;$top=10'.
     *
     * @param filter The filter parameter with value '$filter=id gt 5 and name eq 'foo''.
     * @param top The top parameter with value 10.
     * @param orderby The orderby parameter with value id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> getWithFilterAsync(String filter, Integer top, String orderby, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getWithFilterAsync(filter, top, orderby), serviceCallback);
    }

    /**
     * Specify filter parameter with value '$filter=id gt 5 and name eq 'foo'&amp;$orderby=id&amp;$top=10'.
     *
     * @param filter The filter parameter with value '$filter=id gt 5 and name eq 'foo''.
     * @param top The top parameter with value 10.
     * @param orderby The orderby parameter with value id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> getWithFilterAsync(String filter, Integer top, String orderby) {
        return service.getWithFilter(filter, top, orderby, this.client.acceptLanguage(), this.client.userAgent());
    }


}
