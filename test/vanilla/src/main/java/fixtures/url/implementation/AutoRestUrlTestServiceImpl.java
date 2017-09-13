/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.url.implementation;

import fixtures.url.AutoRestUrlTestService;
import fixtures.url.Paths;
import fixtures.url.Queries;
import fixtures.url.PathItems;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;
import rx.Single;

/**
 * Initializes a new instance of the AutoRestUrlTestService class.
 */
public class AutoRestUrlTestServiceImpl extends ServiceClient implements AutoRestUrlTestService {

    /** A string value 'globalItemStringPath' that appears in the path. */
    private String globalStringPath;

    /**
     * Gets A string value 'globalItemStringPath' that appears in the path.
     *
     * @return the globalStringPath value.
     */
    public String globalStringPath() {
        return this.globalStringPath;
    }

    /**
     * Sets A string value 'globalItemStringPath' that appears in the path.
     *
     * @param globalStringPath the globalStringPath value.
     * @return the service client itself
     */
    public AutoRestUrlTestServiceImpl withGlobalStringPath(String globalStringPath) {
        this.globalStringPath = globalStringPath;
        return this;
    }

    /** should contain value null. */
    private String globalStringQuery;

    /**
     * Gets should contain value null.
     *
     * @return the globalStringQuery value.
     */
    public String globalStringQuery() {
        return this.globalStringQuery;
    }

    /**
     * Sets should contain value null.
     *
     * @param globalStringQuery the globalStringQuery value.
     * @return the service client itself
     */
    public AutoRestUrlTestServiceImpl withGlobalStringQuery(String globalStringQuery) {
        this.globalStringQuery = globalStringQuery;
        return this;
    }

    /**
     * The Paths object to access its operations.
     */
    private Paths paths;

    /**
     * Gets the Paths object to access its operations.
     * @return the Paths object.
     */
    public Paths paths() {
        return this.paths;
    }

    /**
     * The Queries object to access its operations.
     */
    private Queries queries;

    /**
     * Gets the Queries object to access its operations.
     * @return the Queries object.
     */
    public Queries queries() {
        return this.queries;
    }

    /**
     * The PathItems object to access its operations.
     */
    private PathItems pathItems;

    /**
     * Gets the PathItems object to access its operations.
     * @return the PathItems object.
     */
    public PathItems pathItems() {
        return this.pathItems;
    }

    /**
     * Initializes an instance of AutoRestUrlTestService client.
     *
     * @param baseUrl the base URL of the host
     */
    public AutoRestUrlTestServiceImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestUrlTestService client.
     *
     */
    public AutoRestUrlTestServiceImpl() {
        this("http://localhost");
        initialize();
    }

    /**
     * Initializes an instance of AutoRestUrlTestService client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public AutoRestUrlTestServiceImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.paths = new PathsImpl(this);
        this.queries = new QueriesImpl(this);
        this.pathItems = new PathItemsImpl(this);
    }
}
