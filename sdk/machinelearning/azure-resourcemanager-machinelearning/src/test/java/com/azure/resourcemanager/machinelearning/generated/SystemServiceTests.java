// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.SystemService;

public final class SystemServiceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SystemService model = BinaryData
            .fromString(
                "{\"systemServiceType\":\"lpzbtzuykykipf\",\"publicIpAddress\":\"yepfn\",\"version\":\"mbezacfpztg\"}")
            .toObject(SystemService.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SystemService model = new SystemService();
        model = BinaryData.fromObject(model).toObject(SystemService.class);
    }
}
