// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SsisVariable;
import org.junit.jupiter.api.Assertions;

public final class SsisVariableTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SsisVariable model = BinaryData.fromString(
            "{\"id\":1492874499782202267,\"name\":\"y\",\"description\":\"rignqlwogqn\",\"dataType\":\"uaiuvemqcb\",\"sensitive\":true,\"value\":\"exiathmaryywyf\",\"sensitiveValue\":\"nkbfxq\"}")
            .toObject(SsisVariable.class);
        Assertions.assertEquals(1492874499782202267L, model.id());
        Assertions.assertEquals("y", model.name());
        Assertions.assertEquals("rignqlwogqn", model.description());
        Assertions.assertEquals("uaiuvemqcb", model.dataType());
        Assertions.assertEquals(true, model.sensitive());
        Assertions.assertEquals("exiathmaryywyf", model.value());
        Assertions.assertEquals("nkbfxq", model.sensitiveValue());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SsisVariable model = new SsisVariable().withId(1492874499782202267L)
            .withName("y")
            .withDescription("rignqlwogqn")
            .withDataType("uaiuvemqcb")
            .withSensitive(true)
            .withValue("exiathmaryywyf")
            .withSensitiveValue("nkbfxq");
        model = BinaryData.fromObject(model).toObject(SsisVariable.class);
        Assertions.assertEquals(1492874499782202267L, model.id());
        Assertions.assertEquals("y", model.name());
        Assertions.assertEquals("rignqlwogqn", model.description());
        Assertions.assertEquals("uaiuvemqcb", model.dataType());
        Assertions.assertEquals(true, model.sensitive());
        Assertions.assertEquals("exiathmaryywyf", model.value());
        Assertions.assertEquals("nkbfxq", model.sensitiveValue());
    }
}
