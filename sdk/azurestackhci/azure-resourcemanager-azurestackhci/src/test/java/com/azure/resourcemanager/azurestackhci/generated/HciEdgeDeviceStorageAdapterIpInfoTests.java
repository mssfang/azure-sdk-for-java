// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.HciEdgeDeviceStorageAdapterIpInfo;

public final class HciEdgeDeviceStorageAdapterIpInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HciEdgeDeviceStorageAdapterIpInfo model = BinaryData
            .fromString(
                "{\"physicalNode\":\"fratqxmbjroumzz\",\"ipv4Address\":\"al\",\"subnetMask\":\"rhuzgfxonjtpu\"}")
            .toObject(HciEdgeDeviceStorageAdapterIpInfo.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HciEdgeDeviceStorageAdapterIpInfo model = new HciEdgeDeviceStorageAdapterIpInfo();
        model = BinaryData.fromObject(model).toObject(HciEdgeDeviceStorageAdapterIpInfo.class);
    }
}
