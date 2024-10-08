// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.billing.BillingManager;
import com.azure.resourcemanager.billing.models.Customer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class CustomersGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"billingProfileDisplayName\":\"txrrsjsco\",\"billingProfileId\":\"njsoutrztog\",\"displayName\":\"gbncl\",\"systemId\":\"wkzfggsuzkv\",\"status\":\"Other\",\"enabledAzurePlans\":[{\"productId\":\"uiwaz\",\"skuId\":\"bthutctcabc\",\"skuDescription\":\"abzfihsz\"},{\"productId\":\"poid\",\"skuId\":\"wegvuojuwgweccvu\",\"skuDescription\":\"qvfcfsssmyaemk\"}],\"resellers\":[{\"resellerId\":\"dgktl\",\"description\":\"fiqgpqcpen\"},{\"resellerId\":\"qysbeespqbvvaers\",\"description\":\"ufzsautbric\"},{\"resellerId\":\"ofenin\",\"description\":\"unhy\"},{\"resellerId\":\"xckdlxjpisrdn\",\"description\":\"incbesfvijnubx\"}],\"tags\":{\"hkvoxdporxki\":\"ytqxewjsyutezl\",\"bvqnpwdwdmuvya\":\"bkutogecyqoytws\",\"blzrmiukothyfjbp\":\"rbqpwx\"}},\"tags\":{\"fwgnpcjniaf\":\"hfrvsi\",\"mwr\":\"wcgjjioqwuuogdkp\"},\"id\":\"qjdebyxqucnbgi\",\"name\":\"klscwdko\",\"type\":\"zyvihevb\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        BillingManager manager = BillingManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Customer response = manager.customers()
            .getWithResponse("wwdocjasu", "megjkfisz", "exumfavweslo", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("hfrvsi", response.tags().get("fwgnpcjniaf"));
        Assertions.assertEquals("uiwaz", response.properties().enabledAzurePlans().get(0).productId());
        Assertions.assertEquals("bthutctcabc", response.properties().enabledAzurePlans().get(0).skuId());
        Assertions.assertEquals("abzfihsz", response.properties().enabledAzurePlans().get(0).skuDescription());
        Assertions.assertEquals("ytqxewjsyutezl", response.properties().tags().get("hkvoxdporxki"));
    }
}
