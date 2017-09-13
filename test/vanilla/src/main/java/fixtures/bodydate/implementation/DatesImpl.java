/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydate.implementation;

import com.microsoft.rest.v2.RestProxy;
import fixtures.bodydate.Dates;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import fixtures.bodydate.models.ErrorException;
import java.io.IOException;
import org.joda.time.LocalDate;
import rx.functions.Func1;
import rx.Observable;
import rx.Single;

/**
 * An instance of this class provides access to all the operations defined
 * in Dates.
 */
public class DatesImpl implements Dates {
    /** The RestProxy service to perform REST calls. */
    private DatesService service;
    /** The service client containing this operation class. */
    private AutoRestDateTestServiceImpl client;

    /**
     * Initializes an instance of Dates.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public DatesImpl(AutoRestDateTestServiceImpl client) {
        this.service = RestProxy.create(DatesService.class, client.restClient().baseURL(), client.httpClient(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for Dates to be
     * used by RestProxy to perform REST calls.
    */
    @Host("https://localhost")
    interface DatesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodydate.Dates getNull" })
        @GET("date/null")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<LocalDate> getNull();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodydate.Dates getInvalidDate" })
        @GET("date/invaliddate")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<LocalDate> getInvalidDate();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodydate.Dates getOverflowDate" })
        @GET("date/overflowdate")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<LocalDate> getOverflowDate();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodydate.Dates getUnderflowDate" })
        @GET("date/underflowdate")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<LocalDate> getUnderflowDate();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodydate.Dates putMaxDate" })
        @PUT("date/max")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Void> putMaxDate(@BodyParam LocalDate dateBody);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodydate.Dates getMaxDate" })
        @GET("date/max")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<LocalDate> getMaxDate();

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodydate.Dates putMinDate" })
        @PUT("date/min")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<Void> putMinDate(@BodyParam LocalDate dateBody);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.bodydate.Dates getMinDate" })
        @GET("date/min")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<LocalDate> getMinDate();

    }

    /**
     * Get null date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LocalDate object if successful.
     */
    public LocalDate getNull() {
        return getNullAsync().toBlocking().value();
    }

    /**
     * Get null date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LocalDate> getNullAsync(final ServiceCallback<LocalDate> serviceCallback) {
        return ServiceFuture.fromBody(getNullAsync(), serviceCallback);
    }

    /**
     * Get null date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LocalDate object
     */
    public Single<LocalDate> getNullAsync() {
        return service.getNull();
    }


    /**
     * Get invalid date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LocalDate object if successful.
     */
    public LocalDate getInvalidDate() {
        return getInvalidDateAsync().toBlocking().value();
    }

    /**
     * Get invalid date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LocalDate> getInvalidDateAsync(final ServiceCallback<LocalDate> serviceCallback) {
        return ServiceFuture.fromBody(getInvalidDateAsync(), serviceCallback);
    }

    /**
     * Get invalid date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LocalDate object
     */
    public Single<LocalDate> getInvalidDateAsync() {
        return service.getInvalidDate();
    }


    /**
     * Get overflow date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LocalDate object if successful.
     */
    public LocalDate getOverflowDate() {
        return getOverflowDateAsync().toBlocking().value();
    }

    /**
     * Get overflow date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LocalDate> getOverflowDateAsync(final ServiceCallback<LocalDate> serviceCallback) {
        return ServiceFuture.fromBody(getOverflowDateAsync(), serviceCallback);
    }

    /**
     * Get overflow date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LocalDate object
     */
    public Single<LocalDate> getOverflowDateAsync() {
        return service.getOverflowDate();
    }


    /**
     * Get underflow date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LocalDate object if successful.
     */
    public LocalDate getUnderflowDate() {
        return getUnderflowDateAsync().toBlocking().value();
    }

    /**
     * Get underflow date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LocalDate> getUnderflowDateAsync(final ServiceCallback<LocalDate> serviceCallback) {
        return ServiceFuture.fromBody(getUnderflowDateAsync(), serviceCallback);
    }

    /**
     * Get underflow date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LocalDate object
     */
    public Single<LocalDate> getUnderflowDateAsync() {
        return service.getUnderflowDate();
    }


    /**
     * Put max date value 9999-12-31.
     *
     * @param dateBody the LocalDate value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void putMaxDate(LocalDate dateBody) {
        putMaxDateAsync(dateBody).toBlocking().value();
    }

    /**
     * Put max date value 9999-12-31.
     *
     * @param dateBody the LocalDate value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putMaxDateAsync(LocalDate dateBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putMaxDateAsync(dateBody), serviceCallback);
    }

    /**
     * Put max date value 9999-12-31.
     *
     * @param dateBody the LocalDate value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> putMaxDateAsync(LocalDate dateBody) {
        if (dateBody == null) {
            throw new IllegalArgumentException("Parameter dateBody is required and cannot be null.");
        }
        return service.putMaxDate(dateBody);
    }


    /**
     * Get max date value 9999-12-31.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LocalDate object if successful.
     */
    public LocalDate getMaxDate() {
        return getMaxDateAsync().toBlocking().value();
    }

    /**
     * Get max date value 9999-12-31.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LocalDate> getMaxDateAsync(final ServiceCallback<LocalDate> serviceCallback) {
        return ServiceFuture.fromBody(getMaxDateAsync(), serviceCallback);
    }

    /**
     * Get max date value 9999-12-31.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LocalDate object
     */
    public Single<LocalDate> getMaxDateAsync() {
        return service.getMaxDate();
    }


    /**
     * Put min date value 0000-01-01.
     *
     * @param dateBody the LocalDate value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void putMinDate(LocalDate dateBody) {
        putMinDateAsync(dateBody).toBlocking().value();
    }

    /**
     * Put min date value 0000-01-01.
     *
     * @param dateBody the LocalDate value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putMinDateAsync(LocalDate dateBody, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putMinDateAsync(dateBody), serviceCallback);
    }

    /**
     * Put min date value 0000-01-01.
     *
     * @param dateBody the LocalDate value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Single<Void> putMinDateAsync(LocalDate dateBody) {
        if (dateBody == null) {
            throw new IllegalArgumentException("Parameter dateBody is required and cannot be null.");
        }
        return service.putMinDate(dateBody);
    }


    /**
     * Get min date value 0000-01-01.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LocalDate object if successful.
     */
    public LocalDate getMinDate() {
        return getMinDateAsync().toBlocking().value();
    }

    /**
     * Get min date value 0000-01-01.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LocalDate> getMinDateAsync(final ServiceCallback<LocalDate> serviceCallback) {
        return ServiceFuture.fromBody(getMinDateAsync(), serviceCallback);
    }

    /**
     * Get min date value 0000-01-01.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LocalDate object
     */
    public Single<LocalDate> getMinDateAsync() {
        return service.getMinDate();
    }


}
