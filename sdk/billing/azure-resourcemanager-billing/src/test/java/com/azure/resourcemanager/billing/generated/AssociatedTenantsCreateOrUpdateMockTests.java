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
import com.azure.resourcemanager.billing.fluent.models.AssociatedTenantInner;
import com.azure.resourcemanager.billing.models.AssociatedTenant;
import com.azure.resourcemanager.billing.models.AssociatedTenantProperties;
import com.azure.resourcemanager.billing.models.BillingManagementTenantState;
import com.azure.resourcemanager.billing.models.ProvisioningTenantState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class AssociatedTenantsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Succeeded\",\"displayName\":\"oyvhtuqbpeln\",\"tenantId\":\"bncgagdvcdqhftzb\",\"billingManagementState\":\"NotAllowed\",\"provisioningManagementState\":\"Revoked\",\"provisioningBillingRequestId\":\"df\"},\"tags\":{\"rf\":\"ncwmhjob\",\"dc\":\"ri\",\"f\":\"h\",\"oorssatfy\":\"cvbzwgwhgkgsoa\"},\"id\":\"pufdmxuqbdqn\",\"name\":\"sttuxv\",\"type\":\"fqayopbtsix\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        BillingManager manager = BillingManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        AssociatedTenant response = manager.associatedTenants()
            .createOrUpdate("cqzoofjnqjsve", "fbhtleberp",
                new AssociatedTenantInner()
                    .withTags(mapOf("uqlhfwaf", "wonoehr", "guyfazbkocbygvt", "jzmpy", "aw", "rmxkbcjwwdxom",
                        "gaedaoiq", "pkeboozflyac"))
                    .withProperties(new AssociatedTenantProperties().withDisplayName("nfqnwj")
                        .withTenantId("xowkdnj")
                        .withBillingManagementState(BillingManagementTenantState.OTHER)
                        .withProvisioningManagementState(ProvisioningTenantState.REVOKED)),
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ncwmhjob", response.tags().get("rf"));
        Assertions.assertEquals("oyvhtuqbpeln", response.properties().displayName());
        Assertions.assertEquals("bncgagdvcdqhftzb", response.properties().tenantId());
        Assertions.assertEquals(BillingManagementTenantState.NOT_ALLOWED,
            response.properties().billingManagementState());
        Assertions.assertEquals(ProvisioningTenantState.REVOKED, response.properties().provisioningManagementState());
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
