// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.EndpointType;
import com.azure.resourcemanager.netapp.models.ReplicationObject;
import com.azure.resourcemanager.netapp.models.ReplicationSchedule;
import org.junit.jupiter.api.Assertions;

public final class ReplicationObjectTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReplicationObject model =
            BinaryData
                .fromString(
                    "{\"replicationId\":\"mhjrunmpxttdbhr\",\"endpointType\":\"src\",\"replicationSchedule\":\"daily\",\"remoteVolumeResourceId\":\"kx\",\"remoteVolumeRegion\":\"skpbhenbtkcxywn\"}")
                .toObject(ReplicationObject.class);
        Assertions.assertEquals("mhjrunmpxttdbhr", model.replicationId());
        Assertions.assertEquals(EndpointType.SRC, model.endpointType());
        Assertions.assertEquals(ReplicationSchedule.DAILY, model.replicationSchedule());
        Assertions.assertEquals("kx", model.remoteVolumeResourceId());
        Assertions.assertEquals("skpbhenbtkcxywn", model.remoteVolumeRegion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReplicationObject model =
            new ReplicationObject()
                .withReplicationId("mhjrunmpxttdbhr")
                .withEndpointType(EndpointType.SRC)
                .withReplicationSchedule(ReplicationSchedule.DAILY)
                .withRemoteVolumeResourceId("kx")
                .withRemoteVolumeRegion("skpbhenbtkcxywn");
        model = BinaryData.fromObject(model).toObject(ReplicationObject.class);
        Assertions.assertEquals("mhjrunmpxttdbhr", model.replicationId());
        Assertions.assertEquals(EndpointType.SRC, model.endpointType());
        Assertions.assertEquals(ReplicationSchedule.DAILY, model.replicationSchedule());
        Assertions.assertEquals("kx", model.remoteVolumeResourceId());
        Assertions.assertEquals("skpbhenbtkcxywn", model.remoteVolumeRegion());
    }
}