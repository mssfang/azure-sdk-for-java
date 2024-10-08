// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.resourcemanager.hdinsight.containers.models.ClusterPool;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ClusterPools UpdateTags.
 */
public final class ClusterPoolsUpdateTagsSamples {
    /*
     * x-ms-original-file:
     * specification/hdinsight/resource-manager/Microsoft.HDInsight/HDInsightOnAks/preview/2024-05-01-preview/examples/
     * PatchClusterPool.json
     */
    /**
     * Sample code: ClusterPoolsPatchTags.
     * 
     * @param manager Entry point to HDInsightContainersManager.
     */
    public static void
        clusterPoolsPatchTags(com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager manager) {
        ClusterPool resource = manager.clusterPools()
            .getByResourceGroupWithResponse("hiloResourcegroup", "clusterpool1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
