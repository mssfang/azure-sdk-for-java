// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AmazonS3ReadSettings;

public final class AmazonS3ReadSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AmazonS3ReadSettings model = BinaryData.fromString(
            "{\"type\":\"AmazonS3ReadSettings\",\"recursive\":\"datayliagnbhzte\",\"wildcardFolderPath\":\"datanafy\",\"wildcardFileName\":\"dataaocvetzk\",\"prefix\":\"datalbclspqvxz\",\"fileListPath\":\"datau\",\"enablePartitionDiscovery\":\"datafngpbvdlkpzdki\",\"partitionRootPath\":\"datawenvxuhzixranb\",\"deleteFilesAfterCompletion\":\"dataejfqghgadrvxbcy\",\"modifiedDatetimeStart\":\"dataajbcbrtiqpjlakam\",\"modifiedDatetimeEnd\":\"dataqluicrqxqjzmosml\",\"maxConcurrentConnections\":\"datappfgtnsxdj\",\"disableMetricsCollection\":\"datatnjpkpmdlttmfhde\",\"\":{\"xpebsxcnhq\":\"dataaaiqyxlro\",\"rdamyumr\":\"datacbtyor\",\"ygj\":\"databbaxnym\",\"qznobsdgyheyayk\":\"dataqmkakgw\"}}")
            .toObject(AmazonS3ReadSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AmazonS3ReadSettings model = new AmazonS3ReadSettings().withMaxConcurrentConnections("datappfgtnsxdj")
            .withDisableMetricsCollection("datatnjpkpmdlttmfhde")
            .withRecursive("datayliagnbhzte")
            .withWildcardFolderPath("datanafy")
            .withWildcardFileName("dataaocvetzk")
            .withPrefix("datalbclspqvxz")
            .withFileListPath("datau")
            .withEnablePartitionDiscovery("datafngpbvdlkpzdki")
            .withPartitionRootPath("datawenvxuhzixranb")
            .withDeleteFilesAfterCompletion("dataejfqghgadrvxbcy")
            .withModifiedDatetimeStart("dataajbcbrtiqpjlakam")
            .withModifiedDatetimeEnd("dataqluicrqxqjzmosml");
        model = BinaryData.fromObject(model).toObject(AmazonS3ReadSettings.class);
    }
}
