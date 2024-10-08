// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.billing.BillingManager;
import com.azure.resourcemanager.billing.models.Agreement;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class AgreementsListByBillingAccountMockTests {
    @Test
    public void testListByBillingAccount() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"acceptanceMode\":\"Implicit\",\"agreementLink\":\"eopex\",\"billingProfileInfo\":[{\"billingAccountId\":\"dwrswyiljpi\",\"billingProfileDisplayName\":\"gxyxyauxredd\",\"billingProfileId\":\"mcnltmwytkujsqyc\",\"billingProfileSystemId\":\"oxfab\",\"indirectRelationshipOrganizationName\":\"gpwb\"}],\"category\":\"IndirectForGovernmentAgreement\",\"displayName\":\"ialiwry\",\"effectiveDate\":\"2021-12-08T20:40:38Z\",\"expirationDate\":\"2021-06-19T07:09:30Z\",\"participants\":[{\"email\":\"bphct\",\"status\":\"bibticuhqvum\",\"statusDate\":\"2021-01-28T06:24:15Z\"},{\"email\":\"sfeqbbe\",\"status\":\"cuq\",\"statusDate\":\"2021-09-17T00:32:07Z\"},{\"email\":\"xmzrmtmvwitu\",\"status\":\"yyjshcybwfuppo\",\"statusDate\":\"2021-01-28T05:44:39Z\"}],\"status\":\"mvouujxdii\",\"leadBillingAccountName\":\"oxrezsvavlrxik\"},\"tags\":{\"fncn\":\"ywlunpipcwybs\",\"saebwfwhxorpwal\":\"atpf\",\"ojfccylhtrht\":\"zwuge\",\"zp\":\"vazjpwexcd\"},\"id\":\"bzzxezm\",\"name\":\"rkjg\",\"type\":\"jeuxsphlo\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        BillingManager manager = BillingManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Agreement> response
            = manager.agreements().listByBillingAccount("aoijolb", "a", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ywlunpipcwybs", response.iterator().next().tags().get("fncn"));
    }
}
