// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.models.AmlFilesystemCheckSubnetErrorFilesystemSubnet;
import com.azure.resourcemanager.storagecache.models.FilesystemSubnetStatusType;
import org.junit.jupiter.api.Assertions;

public final class AmlFilesystemCheckSubnetErrorFilesystemSubnetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AmlFilesystemCheckSubnetErrorFilesystemSubnet model =
            BinaryData
                .fromString("{\"status\":\"Invalid\",\"message\":\"jqg\"}")
                .toObject(AmlFilesystemCheckSubnetErrorFilesystemSubnet.class);
        Assertions.assertEquals(FilesystemSubnetStatusType.INVALID, model.status());
        Assertions.assertEquals("jqg", model.message());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AmlFilesystemCheckSubnetErrorFilesystemSubnet model =
            new AmlFilesystemCheckSubnetErrorFilesystemSubnet()
                .withStatus(FilesystemSubnetStatusType.INVALID)
                .withMessage("jqg");
        model = BinaryData.fromObject(model).toObject(AmlFilesystemCheckSubnetErrorFilesystemSubnet.class);
        Assertions.assertEquals(FilesystemSubnetStatusType.INVALID, model.status());
        Assertions.assertEquals("jqg", model.message());
    }
}