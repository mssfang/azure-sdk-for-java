// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.DatasetLocation;
import com.azure.resourcemanager.datafactory.models.JsonDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class JsonDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JsonDataset model = BinaryData.fromString(
            "{\"type\":\"Json\",\"typeProperties\":{\"location\":{\"type\":\"DatasetLocation\",\"folderPath\":\"dataviscot\",\"fileName\":\"databri\",\"\":{\"dslvrqo\":\"dataf\",\"deotmfx\":\"datamwsieeailwdqmqf\",\"g\":\"datakd\",\"uafixlxicwgp\":\"datagnamkuuyiu\"}},\"encodingName\":\"datadc\",\"compression\":{\"type\":\"datafzcfasf\",\"level\":\"dataropalvngtwyuskwg\",\"\":{\"cjlvkrkegtyc\":\"datataumd\",\"yddeeqz\":\"datauppiyxlzm\"}}},\"description\":\"abm\",\"structure\":\"datas\",\"schema\":\"dataduetbapf\",\"linkedServiceName\":{\"referenceName\":\"zewxtrlqbpxy\",\"parameters\":{\"zxvbczwhyegbthms\":\"datajpir\",\"jbuiggru\":\"datai\",\"oivsdwsngkrf\":\"dataozfvualjt\",\"akmhz\":\"datahscj\"}},\"parameters\":{\"nnx\":{\"type\":\"SecureString\",\"defaultValue\":\"datafbwih\"},\"pfzsclefyrl\":{\"type\":\"SecureString\",\"defaultValue\":\"dataynuqqkotauratnic\"},\"pwovvvsfleevn\":{\"type\":\"Float\",\"defaultValue\":\"datadqlmfdggnbbu\"}},\"annotations\":[\"datayrehjuqwv\",\"datapxrl\"],\"folder\":{\"name\":\"zihacen\"},\"\":{\"wmjcwtewfhxw\":\"datalxnqzubfonfdbgmk\",\"rehzlrynjpcha\":\"datark\",\"wevtjrieikmwla\":\"datakaeplrajubowu\"}}")
            .toObject(JsonDataset.class);
        Assertions.assertEquals("abm", model.description());
        Assertions.assertEquals("zewxtrlqbpxy", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("nnx").type());
        Assertions.assertEquals("zihacen", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JsonDataset model = new JsonDataset().withDescription("abm")
            .withStructure("datas")
            .withSchema("dataduetbapf")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("zewxtrlqbpxy")
                .withParameters(mapOf("zxvbczwhyegbthms", "datajpir", "jbuiggru", "datai", "oivsdwsngkrf",
                    "dataozfvualjt", "akmhz", "datahscj")))
            .withParameters(mapOf("nnx",
                new ParameterSpecification().withType(ParameterType.SECURE_STRING).withDefaultValue("datafbwih"),
                "pfzsclefyrl",
                new ParameterSpecification().withType(ParameterType.SECURE_STRING)
                    .withDefaultValue("dataynuqqkotauratnic"),
                "pwovvvsfleevn",
                new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datadqlmfdggnbbu")))
            .withAnnotations(Arrays.asList("datayrehjuqwv", "datapxrl"))
            .withFolder(new DatasetFolder().withName("zihacen"))
            .withLocation(new DatasetLocation().withFolderPath("dataviscot")
                .withFileName("databri")
                .withAdditionalProperties(mapOf("type", "DatasetLocation")))
            .withEncodingName("datadc")
            .withCompression(new DatasetCompression().withType("datafzcfasf")
                .withLevel("dataropalvngtwyuskwg")
                .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(JsonDataset.class);
        Assertions.assertEquals("abm", model.description());
        Assertions.assertEquals("zewxtrlqbpxy", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("nnx").type());
        Assertions.assertEquals("zihacen", model.folder().name());
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
