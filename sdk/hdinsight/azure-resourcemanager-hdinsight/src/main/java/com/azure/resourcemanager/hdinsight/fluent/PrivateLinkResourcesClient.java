// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hdinsight.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.hdinsight.fluent.models.PrivateLinkResourceListResultInner;

/**
 * An instance of this class provides access to all the operations defined in PrivateLinkResourcesClient.
 */
public interface PrivateLinkResourcesClient {
    /**
     * Lists the private link resources in a HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private link resources along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateLinkResourceListResultInner> listByClusterWithResponse(String resourceGroupName, String clusterName,
        Context context);

    /**
     * Lists the private link resources in a HDInsight cluster.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private link resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateLinkResourceListResultInner listByCluster(String resourceGroupName, String clusterName);

    /**
     * Gets the specific private link resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param privateLinkResourceName The name of the private link resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specific private link resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateLinkResourceInner> getWithResponse(String resourceGroupName, String clusterName,
        String privateLinkResourceName, Context context);

    /**
     * Gets the specific private link resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param privateLinkResourceName The name of the private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specific private link resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateLinkResourceInner get(String resourceGroupName, String clusterName, String privateLinkResourceName);
}
