// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.machinelearning.MachineLearningManager;
import com.azure.resourcemanager.machinelearning.models.ContentSafetyStatus;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.machinelearning.models.ServerlessEndpoint;
import com.azure.resourcemanager.machinelearning.models.ServerlessInferenceEndpointAuthMode;
import com.azure.resourcemanager.machinelearning.models.SkuTier;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ServerlessEndpointsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"modelSettings\":{\"modelId\":\"natl\"},\"authMode\":\"Key\",\"inferenceEndpoint\":{\"uri\":\"kqzfwl\",\"headers\":{\"yyu\":\"nmgsbubzf\"}},\"provisioningState\":\"Updating\",\"endpointState\":\"Unknown\",\"marketplaceSubscriptionId\":\"rederzsnfgmohhcg\",\"contentSafety\":{\"contentSafetyStatus\":\"Disabled\"}},\"kind\":\"vvfpkymq\",\"identity\":{\"principalId\":\"41536c01-2dc8-4767-b6c8-7798b01bd9f5\",\"tenantId\":\"7da471c5-d09c-4d7d-893e-104b6de6f901\",\"type\":\"SystemAssigned,UserAssigned\",\"userAssignedIdentities\":{\"lboawzplwghfg\":{\"principalId\":\"ea0ea3d7-586d-4a52-9903-a19b81c3099e\",\"clientId\":\"15820477-10ab-4c98-919d-a6a1dece5bb1\"},\"rmtuprqt\":{\"principalId\":\"be36aaa0-8d81-4f60-957a-e1c7a64f7bac\",\"clientId\":\"74576f39-b12a-4b7b-afcb-2a799b711002\"},\"kohupyajkdejp\":{\"principalId\":\"f45a5de5-9558-4e2a-82a5-605e036f07e2\",\"clientId\":\"cfef6c00-90d0-41f3-ba78-acb521fbfd79\"}}},\"sku\":{\"name\":\"jvsbozfjbdyyxhj\",\"tier\":\"Free\",\"size\":\"wmrdlnbklhwrikr\",\"family\":\"j\",\"capacity\":587687819},\"location\":\"ff\",\"tags\":{\"umvbhbli\":\"yoiaobbzcdlcc\",\"x\":\"bxolzin\"},\"id\":\"fixrukwxcaagzlqo\",\"name\":\"gzgsgzlbunmjha\",\"type\":\"fiyrywf\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MachineLearningManager manager = MachineLearningManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ServerlessEndpoint> response
            = manager.serverlessEndpoints().list("fpkdsldyw", "wvswlhjlbkq", "gs", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ff", response.iterator().next().location());
        Assertions.assertEquals("yoiaobbzcdlcc", response.iterator().next().tags().get("umvbhbli"));
        Assertions.assertEquals("natl", response.iterator().next().properties().modelSettings().modelId());
        Assertions.assertEquals(ServerlessInferenceEndpointAuthMode.KEY,
            response.iterator().next().properties().authMode());
        Assertions.assertEquals(ContentSafetyStatus.DISABLED,
            response.iterator().next().properties().contentSafety().contentSafetyStatus());
        Assertions.assertEquals("vvfpkymq", response.iterator().next().kind());
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED,
            response.iterator().next().identity().type());
        Assertions.assertEquals("jvsbozfjbdyyxhj", response.iterator().next().sku().name());
        Assertions.assertEquals(SkuTier.FREE, response.iterator().next().sku().tier());
        Assertions.assertEquals("wmrdlnbklhwrikr", response.iterator().next().sku().size());
        Assertions.assertEquals("j", response.iterator().next().sku().family());
        Assertions.assertEquals(587687819, response.iterator().next().sku().capacity());
    }
}
