// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

/**
 * Samples for Storages Get.
 */
public final class StoragesGetSamples {
    /*
     * x-ms-original-file:
     * specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2023-12-01/examples/Storages_Get.json
     */
    /**
     * Sample code: Storages_Get.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void storagesGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.springServices()
            .manager()
            .serviceClient()
            .getStorages()
            .getWithResponse("myResourceGroup", "myservice", "mystorage", com.azure.core.util.Context.NONE);
    }
}
