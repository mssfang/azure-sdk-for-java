// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.FqdnEndpoint;
import com.azure.resourcemanager.machinelearning.models.FqdnEndpointDetail;
import com.azure.resourcemanager.machinelearning.models.FqdnEndpoints;
import com.azure.resourcemanager.machinelearning.models.FqdnEndpointsProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class FqdnEndpointsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FqdnEndpoints model = BinaryData.fromString(
            "{\"properties\":{\"category\":\"stkwqqtch\",\"endpoints\":[{\"domainName\":\"fmtdaaygdvwvgp\",\"endpointDetails\":[{\"port\":976430532},{\"port\":434631779},{\"port\":1822865162}]},{\"domainName\":\"dxepxgyq\",\"endpointDetails\":[{\"port\":1825902686},{\"port\":1104557585},{\"port\":128514806},{\"port\":1947559864}]},{\"domainName\":\"himdbl\",\"endpointDetails\":[{\"port\":1230098756}]}]}}")
            .toObject(FqdnEndpoints.class);
        Assertions.assertEquals("stkwqqtch", model.properties().category());
        Assertions.assertEquals("fmtdaaygdvwvgp", model.properties().endpoints().get(0).domainName());
        Assertions.assertEquals(976430532, model.properties().endpoints().get(0).endpointDetails().get(0).port());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FqdnEndpoints model = new FqdnEndpoints().withProperties(new FqdnEndpointsProperties().withCategory("stkwqqtch")
            .withEndpoints(Arrays.asList(
                new FqdnEndpoint().withDomainName("fmtdaaygdvwvgp")
                    .withEndpointDetails(Arrays.asList(new FqdnEndpointDetail().withPort(976430532),
                        new FqdnEndpointDetail().withPort(434631779), new FqdnEndpointDetail().withPort(1822865162))),
                new FqdnEndpoint().withDomainName("dxepxgyq")
                    .withEndpointDetails(Arrays.asList(new FqdnEndpointDetail().withPort(1825902686),
                        new FqdnEndpointDetail().withPort(1104557585), new FqdnEndpointDetail().withPort(128514806),
                        new FqdnEndpointDetail().withPort(1947559864))),
                new FqdnEndpoint().withDomainName("himdbl")
                    .withEndpointDetails(Arrays.asList(new FqdnEndpointDetail().withPort(1230098756))))));
        model = BinaryData.fromObject(model).toObject(FqdnEndpoints.class);
        Assertions.assertEquals("stkwqqtch", model.properties().category());
        Assertions.assertEquals("fmtdaaygdvwvgp", model.properties().endpoints().get(0).domainName());
        Assertions.assertEquals(976430532, model.properties().endpoints().get(0).endpointDetails().get(0).port());
    }
}
