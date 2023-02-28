// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DailySchedule;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DailyScheduleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DailySchedule model =
            BinaryData
                .fromString(
                    "{\"scheduleRunTimes\":[\"2021-11-12T18:26:07Z\",\"2021-01-20T21:27:07Z\",\"2020-12-30T18:21:45Z\",\"2021-04-06T21:21:13Z\"]}")
                .toObject(DailySchedule.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-12T18:26:07Z"), model.scheduleRunTimes().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DailySchedule model =
            new DailySchedule()
                .withScheduleRunTimes(
                    Arrays
                        .asList(
                            OffsetDateTime.parse("2021-11-12T18:26:07Z"),
                            OffsetDateTime.parse("2021-01-20T21:27:07Z"),
                            OffsetDateTime.parse("2020-12-30T18:21:45Z"),
                            OffsetDateTime.parse("2021-04-06T21:21:13Z")));
        model = BinaryData.fromObject(model).toObject(DailySchedule.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-12T18:26:07Z"), model.scheduleRunTimes().get(0));
    }
}