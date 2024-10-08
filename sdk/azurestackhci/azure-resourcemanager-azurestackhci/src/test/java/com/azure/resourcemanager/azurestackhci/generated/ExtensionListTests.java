// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.ExtensionList;

public final class ExtensionListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExtensionList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"PartiallySucceeded\",\"extensionParameters\":{\"forceUpdateTag\":\"zdgiruj\",\"publisher\":\"bomvzzbtdcqv\",\"type\":\"iyujviylwdshfs\",\"typeHandlerVersion\":\"rbgyefry\",\"autoUpgradeMinorVersion\":false,\"settings\":\"dataojfmwnco\",\"protectedSettings\":\"datarfh\",\"enableAutomaticUpgrade\":true},\"aggregateState\":\"Moving\",\"perNodeExtensionDetails\":[{\"name\":\"oftpipiwycz\",\"extension\":\"xacpqjli\",\"typeHandlerVersion\":\"yuspskas\",\"state\":\"Failed\",\"instanceView\":{}},{\"name\":\"wdgzxulucv\",\"extension\":\"mrsreuzvxurisjnh\",\"typeHandlerVersion\":\"txifqj\",\"state\":\"PartiallySucceeded\",\"instanceView\":{}},{\"name\":\"hu\",\"extension\":\"wp\",\"typeHandlerVersion\":\"sutrgjup\",\"state\":\"Disconnected\",\"instanceView\":{}},{\"name\":\"woqhihe\",\"extension\":\"g\",\"typeHandlerVersion\":\"pnfqntcyp\",\"state\":\"PartiallyConnected\",\"instanceView\":{}}],\"managedBy\":\"Azure\"},\"id\":\"mwks\",\"name\":\"ircizjxvy\",\"type\":\"fceacvlhvygd\"},{\"properties\":{\"provisioningState\":\"Accepted\",\"extensionParameters\":{\"forceUpdateTag\":\"twnawjslbiwkojgc\",\"publisher\":\"tsf\",\"type\":\"nbaeqphchqn\",\"typeHandlerVersion\":\"rpxeh\",\"autoUpgradeMinorVersion\":true,\"settings\":\"datak\",\"protectedSettings\":\"dataaifmvikl\",\"enableAutomaticUpgrade\":false},\"aggregateState\":\"Deleted\",\"perNodeExtensionDetails\":[{\"name\":\"jdz\",\"extension\":\"cvdsrhnj\",\"typeHandlerVersion\":\"olvtnovqfzge\",\"state\":\"Succeeded\",\"instanceView\":{}},{\"name\":\"uljltduceamtmcz\",\"extension\":\"m\",\"typeHandlerVersion\":\"wcw\",\"state\":\"NotSpecified\",\"instanceView\":{}},{\"name\":\"nssxmojmsvpk\",\"extension\":\"rvkwc\",\"typeHandlerVersion\":\"ql\",\"state\":\"NotSpecified\",\"instanceView\":{}}],\"managedBy\":\"User\"},\"id\":\"heyd\",\"name\":\"sdshmkxmaehvb\",\"type\":\"xu\"},{\"properties\":{\"provisioningState\":\"Moving\",\"extensionParameters\":{\"forceUpdateTag\":\"n\",\"publisher\":\"baxk\",\"type\":\"ywrckp\",\"typeHandlerVersion\":\"lyhpluodpvruud\",\"autoUpgradeMinorVersion\":false,\"settings\":\"databth\",\"protectedSettings\":\"datatgk\",\"enableAutomaticUpgrade\":true},\"aggregateState\":\"Error\",\"perNodeExtensionDetails\":[{\"name\":\"lzedqbcvhzlhplo\",\"extension\":\"kdl\",\"typeHandlerVersion\":\"qfbumlkxtrqjf\",\"state\":\"Updating\",\"instanceView\":{}},{\"name\":\"txhwgfws\",\"extension\":\"a\",\"typeHandlerVersion\":\"oezbrhubsk\",\"state\":\"PartiallyConnected\",\"instanceView\":{}}],\"managedBy\":\"User\"},\"id\":\"okkqfqjbvleo\",\"name\":\"fmluiqtqzfavyvn\",\"type\":\"qybaryeua\"},{\"properties\":{\"provisioningState\":\"Provisioning\",\"extensionParameters\":{\"forceUpdateTag\":\"qgzsles\",\"publisher\":\"bhernntiew\",\"type\":\"cv\",\"typeHandlerVersion\":\"uwrbehwagoh\",\"autoUpgradeMinorVersion\":false,\"settings\":\"datakmr\",\"protectedSettings\":\"datamvvhmxtdrjfuta\",\"enableAutomaticUpgrade\":true},\"aggregateState\":\"Accepted\",\"perNodeExtensionDetails\":[{\"name\":\"zcjznmwcpmgua\",\"extension\":\"raufactkahzova\",\"typeHandlerVersion\":\"ziuxxpshnee\",\"state\":\"Updating\",\"instanceView\":{}},{\"name\":\"slqubkwdl\",\"extension\":\"rds\",\"typeHandlerVersion\":\"ujbazpjuohminyfl\",\"state\":\"Succeeded\",\"instanceView\":{}},{\"name\":\"duvwpklvxwmygd\",\"extension\":\"gpqch\",\"typeHandlerVersion\":\"zepn\",\"state\":\"NotSpecified\",\"instanceView\":{}}],\"managedBy\":\"User\"},\"id\":\"ibbdaxconfoza\",\"name\":\"orsukokwbqp\",\"type\":\"hlvnuuepzlr\"}],\"nextLink\":\"wzsoldweyuqdunv\"}")
            .toObject(ExtensionList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExtensionList model = new ExtensionList();
        model = BinaryData.fromObject(model).toObject(ExtensionList.class);
    }
}
