// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.AllFeatures;

public final class AllFeaturesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AllFeatures model = BinaryData.fromString("{\"filterType\":\"AllFeatures\"}").toObject(AllFeatures.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AllFeatures model = new AllFeatures();
        model = BinaryData.fromObject(model).toObject(AllFeatures.class);
    }
}
