// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.AutomationActionEventHub;
import org.junit.jupiter.api.Assertions;

public final class AutomationActionEventHubTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AutomationActionEventHub model = BinaryData.fromString(
            "{\"actionType\":\"EventHub\",\"eventHubResourceId\":\"slz\",\"sasPolicyName\":\"cdsvmwbitek\",\"connectionString\":\"fobvfiybxqich\",\"isTrustedServiceEnabled\":true}")
            .toObject(AutomationActionEventHub.class);
        Assertions.assertEquals("slz", model.eventHubResourceId());
        Assertions.assertEquals("fobvfiybxqich", model.connectionString());
        Assertions.assertEquals(true, model.isTrustedServiceEnabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AutomationActionEventHub model = new AutomationActionEventHub().withEventHubResourceId("slz")
            .withConnectionString("fobvfiybxqich").withIsTrustedServiceEnabled(true);
        model = BinaryData.fromObject(model).toObject(AutomationActionEventHub.class);
        Assertions.assertEquals("slz", model.eventHubResourceId());
        Assertions.assertEquals("fobvfiybxqich", model.connectionString());
        Assertions.assertEquals(true, model.isTrustedServiceEnabled());
    }
}
