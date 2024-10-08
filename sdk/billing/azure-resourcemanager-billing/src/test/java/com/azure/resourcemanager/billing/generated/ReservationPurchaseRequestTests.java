// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.AppliedScopeType;
import com.azure.resourcemanager.billing.models.InstanceFlexibility;
import com.azure.resourcemanager.billing.models.ReservationAppliedScopeProperties;
import com.azure.resourcemanager.billing.models.ReservationBillingPlan;
import com.azure.resourcemanager.billing.models.ReservationPurchaseRequest;
import com.azure.resourcemanager.billing.models.SkuName;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ReservationPurchaseRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReservationPurchaseRequest model = BinaryData.fromString(
            "{\"sku\":{\"name\":\"sxstcyilbvzmm\"},\"location\":\"jzlquz\",\"properties\":{\"reservedResourceType\":\"kjxebj\",\"billingScopeId\":\"zinzabwmvogljsvl\",\"term\":\"idnwceha\",\"billingPlan\":\"Upfront\",\"quantity\":279830620,\"displayName\":\"l\",\"appliedScopeType\":\"Shared\",\"appliedScopes\":[\"qoqpepiaeap\",\"sergdtpe\",\"nacyheqwb\",\"qq\"],\"appliedScopeProperties\":{\"tenantId\":\"u\",\"managementGroupId\":\"hjozf\",\"subscriptionId\":\"cwmbupyvqyvli\",\"resourceGroupId\":\"ipsejbsvsia\",\"displayName\":\"swhddzydisnuep\"},\"renew\":false,\"reservedResourceProperties\":{\"instanceFlexibility\":\"Off\"},\"instanceFlexibility\":\"On\",\"reviewDateTime\":\"2021-09-29T18:06:51Z\"}}")
            .toObject(ReservationPurchaseRequest.class);
        Assertions.assertEquals("sxstcyilbvzmm", model.sku().name());
        Assertions.assertEquals("jzlquz", model.location());
        Assertions.assertEquals(ReservationBillingPlan.UPFRONT, model.billingPlan());
        Assertions.assertEquals(279830620, model.quantity());
        Assertions.assertEquals("l", model.displayName());
        Assertions.assertEquals(AppliedScopeType.SHARED, model.appliedScopeType());
        Assertions.assertEquals("qoqpepiaeap", model.appliedScopes().get(0));
        Assertions.assertEquals("u", model.appliedScopeProperties().tenantId());
        Assertions.assertEquals("hjozf", model.appliedScopeProperties().managementGroupId());
        Assertions.assertEquals("cwmbupyvqyvli", model.appliedScopeProperties().subscriptionId());
        Assertions.assertEquals("ipsejbsvsia", model.appliedScopeProperties().resourceGroupId());
        Assertions.assertEquals("swhddzydisnuep", model.appliedScopeProperties().displayName());
        Assertions.assertEquals(false, model.renew());
        Assertions.assertEquals(InstanceFlexibility.ON, model.instanceFlexibility());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-29T18:06:51Z"), model.reviewDateTime());
        Assertions.assertEquals(InstanceFlexibility.OFF,
            model.instanceFlexibilityReservedResourcePropertiesInstanceFlexibility());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReservationPurchaseRequest model
            = new ReservationPurchaseRequest().withSku(new SkuName().withName("sxstcyilbvzmm"))
                .withLocation("jzlquz")
                .withBillingPlan(ReservationBillingPlan.UPFRONT)
                .withQuantity(279830620)
                .withDisplayName("l")
                .withAppliedScopeType(AppliedScopeType.SHARED)
                .withAppliedScopes(Arrays.asList("qoqpepiaeap", "sergdtpe", "nacyheqwb", "qq"))
                .withAppliedScopeProperties(new ReservationAppliedScopeProperties().withTenantId("u")
                    .withManagementGroupId("hjozf")
                    .withSubscriptionId("cwmbupyvqyvli")
                    .withResourceGroupId("ipsejbsvsia")
                    .withDisplayName("swhddzydisnuep"))
                .withRenew(false)
                .withInstanceFlexibility(InstanceFlexibility.ON)
                .withReviewDateTime(OffsetDateTime.parse("2021-09-29T18:06:51Z"))
                .withInstanceFlexibilityReservedResourcePropertiesInstanceFlexibility(InstanceFlexibility.OFF);
        model = BinaryData.fromObject(model).toObject(ReservationPurchaseRequest.class);
        Assertions.assertEquals("sxstcyilbvzmm", model.sku().name());
        Assertions.assertEquals("jzlquz", model.location());
        Assertions.assertEquals(ReservationBillingPlan.UPFRONT, model.billingPlan());
        Assertions.assertEquals(279830620, model.quantity());
        Assertions.assertEquals("l", model.displayName());
        Assertions.assertEquals(AppliedScopeType.SHARED, model.appliedScopeType());
        Assertions.assertEquals("qoqpepiaeap", model.appliedScopes().get(0));
        Assertions.assertEquals("u", model.appliedScopeProperties().tenantId());
        Assertions.assertEquals("hjozf", model.appliedScopeProperties().managementGroupId());
        Assertions.assertEquals("cwmbupyvqyvli", model.appliedScopeProperties().subscriptionId());
        Assertions.assertEquals("ipsejbsvsia", model.appliedScopeProperties().resourceGroupId());
        Assertions.assertEquals("swhddzydisnuep", model.appliedScopeProperties().displayName());
        Assertions.assertEquals(false, model.renew());
        Assertions.assertEquals(InstanceFlexibility.ON, model.instanceFlexibility());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-29T18:06:51Z"), model.reviewDateTime());
        Assertions.assertEquals(InstanceFlexibility.OFF,
            model.instanceFlexibilityReservedResourcePropertiesInstanceFlexibility());
    }
}
