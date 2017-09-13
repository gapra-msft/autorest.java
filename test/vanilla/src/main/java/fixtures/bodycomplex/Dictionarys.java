/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import fixtures.bodycomplex.models.DictionaryWrapper;
import fixtures.bodycomplex.models.ErrorException;
import java.io.IOException;
import rx.Observable;
import rx.Single;

/**
 * An instance of this class provides access to all the operations defined
 * in Dictionarys.
 */
public interface Dictionarys {
    /**
     * Get complex types with dictionary property.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DictionaryWrapper object if successful.
     */
    DictionaryWrapper getValid();

    /**
     * Get complex types with dictionary property.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DictionaryWrapper> getValidAsync(final ServiceCallback<DictionaryWrapper> serviceCallback);

    /**
     * Get complex types with dictionary property.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DictionaryWrapper object
     */
    Single<DictionaryWrapper> getValidAsync();


    /**
     * Put complex types with dictionary property.
     *
     * @param complexBody Please put a dictionary with 5 key-value pairs: "txt":"notepad", "bmp":"mspaint", "xls":"excel", "exe":"", "":null
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putValid(DictionaryWrapper complexBody);

    /**
     * Put complex types with dictionary property.
     *
     * @param complexBody Please put a dictionary with 5 key-value pairs: "txt":"notepad", "bmp":"mspaint", "xls":"excel", "exe":"", "":null
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> putValidAsync(DictionaryWrapper complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with dictionary property.
     *
     * @param complexBody Please put a dictionary with 5 key-value pairs: "txt":"notepad", "bmp":"mspaint", "xls":"excel", "exe":"", "":null
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Single<Void> putValidAsync(DictionaryWrapper complexBody);


    /**
     * Get complex types with dictionary property which is empty.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DictionaryWrapper object if successful.
     */
    DictionaryWrapper getEmpty();

    /**
     * Get complex types with dictionary property which is empty.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DictionaryWrapper> getEmptyAsync(final ServiceCallback<DictionaryWrapper> serviceCallback);

    /**
     * Get complex types with dictionary property which is empty.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DictionaryWrapper object
     */
    Single<DictionaryWrapper> getEmptyAsync();


    /**
     * Put complex types with dictionary property which is empty.
     *
     * @param complexBody Please put an empty dictionary
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putEmpty(DictionaryWrapper complexBody);

    /**
     * Put complex types with dictionary property which is empty.
     *
     * @param complexBody Please put an empty dictionary
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> putEmptyAsync(DictionaryWrapper complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with dictionary property which is empty.
     *
     * @param complexBody Please put an empty dictionary
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Single<Void> putEmptyAsync(DictionaryWrapper complexBody);


    /**
     * Get complex types with dictionary property which is null.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DictionaryWrapper object if successful.
     */
    DictionaryWrapper getNull();

    /**
     * Get complex types with dictionary property which is null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DictionaryWrapper> getNullAsync(final ServiceCallback<DictionaryWrapper> serviceCallback);

    /**
     * Get complex types with dictionary property which is null.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DictionaryWrapper object
     */
    Single<DictionaryWrapper> getNullAsync();


    /**
     * Get complex types with dictionary property while server doesn't provide a response payload.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DictionaryWrapper object if successful.
     */
    DictionaryWrapper getNotProvided();

    /**
     * Get complex types with dictionary property while server doesn't provide a response payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<DictionaryWrapper> getNotProvidedAsync(final ServiceCallback<DictionaryWrapper> serviceCallback);

    /**
     * Get complex types with dictionary property while server doesn't provide a response payload.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DictionaryWrapper object
     */
    Single<DictionaryWrapper> getNotProvidedAsync();


}
