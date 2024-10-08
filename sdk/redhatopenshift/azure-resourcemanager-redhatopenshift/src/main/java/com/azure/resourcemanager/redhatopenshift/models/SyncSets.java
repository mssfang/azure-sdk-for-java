// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redhatopenshift.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of SyncSets.
 */
public interface SyncSets {
    /**
     * Lists SyncSets that belong to that Azure Red Hat OpenShift Cluster.
     * 
     * The operation returns properties of each SyncSet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the OpenShift cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return syncSetList represents a list of SyncSets as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SyncSet> list(String resourceGroupName, String resourceName);

    /**
     * Lists SyncSets that belong to that Azure Red Hat OpenShift Cluster.
     * 
     * The operation returns properties of each SyncSet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the OpenShift cluster resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return syncSetList represents a list of SyncSets as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SyncSet> list(String resourceGroupName, String resourceName, Context context);

    /**
     * Gets a SyncSet with the specified subscription, resource group and resource name.
     * 
     * The operation returns properties of a SyncSet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the OpenShift cluster resource.
     * @param childResourceName The name of the SyncSet resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return syncSet represents a SyncSet for an Azure Red Hat OpenShift Cluster along with {@link Response}.
     */
    Response<SyncSet> getWithResponse(String resourceGroupName, String resourceName, String childResourceName,
        Context context);

    /**
     * Gets a SyncSet with the specified subscription, resource group and resource name.
     * 
     * The operation returns properties of a SyncSet.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the OpenShift cluster resource.
     * @param childResourceName The name of the SyncSet resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return syncSet represents a SyncSet for an Azure Red Hat OpenShift Cluster.
     */
    SyncSet get(String resourceGroupName, String resourceName, String childResourceName);

    /**
     * Deletes a SyncSet with the specified subscription, resource group and resource name.
     * 
     * The operation returns nothing.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the OpenShift cluster resource.
     * @param childResourceName The name of the SyncSet resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String resourceName, String childResourceName,
        Context context);

    /**
     * Deletes a SyncSet with the specified subscription, resource group and resource name.
     * 
     * The operation returns nothing.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the OpenShift cluster resource.
     * @param childResourceName The name of the SyncSet resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String resourceName, String childResourceName);

    /**
     * Gets a SyncSet with the specified subscription, resource group and resource name.
     * 
     * The operation returns properties of a SyncSet.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return syncSet represents a SyncSet for an Azure Red Hat OpenShift Cluster along with {@link Response}.
     */
    SyncSet getById(String id);

    /**
     * Gets a SyncSet with the specified subscription, resource group and resource name.
     * 
     * The operation returns properties of a SyncSet.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return syncSet represents a SyncSet for an Azure Red Hat OpenShift Cluster along with {@link Response}.
     */
    Response<SyncSet> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a SyncSet with the specified subscription, resource group and resource name.
     * 
     * The operation returns nothing.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a SyncSet with the specified subscription, resource group and resource name.
     * 
     * The operation returns nothing.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new SyncSet resource.
     * 
     * @param name resource name.
     * @return the first stage of the new SyncSet definition.
     */
    SyncSet.DefinitionStages.Blank define(String name);
}
