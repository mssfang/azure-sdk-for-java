// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import java.util.Arrays;

/**
 * Samples for ManagedDatabaseColumns ListByDatabase.
 */
public final class ManagedDatabaseColumnsListByDatabaseSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ManagedColumnsListByDatabaseMin.json
     */
    /**
     * Sample code: List managed database columns.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listManagedDatabaseColumns(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getManagedDatabaseColumns()
            .listByDatabase("myRG", "serverName", "myDatabase", null, null, null, null, null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/ManagedColumnsListByDatabaseMax.json
     */
    /**
     * Sample code: Filter managed database columns.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void filterManagedDatabaseColumns(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getManagedDatabaseColumns()
            .listByDatabase("myRG", "serverName", "myDatabase", Arrays.asList("dbo"),
                Arrays.asList("customer", "address"), Arrays.asList("username"),
                Arrays.asList("schema asc", "table", "column desc"), null, com.azure.core.util.Context.NONE);
    }
}
