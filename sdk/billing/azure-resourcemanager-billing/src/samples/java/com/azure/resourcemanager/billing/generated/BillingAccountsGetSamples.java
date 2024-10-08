// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

/**
 * Samples for BillingAccounts Get.
 */
public final class BillingAccountsGetSamples {
    /*
     * x-ms-original-file:
     * specification/billing/resource-manager/Microsoft.Billing/stable/2024-04-01/examples/billingAccountsGetWithExpand.
     * json
     */
    /**
     * Sample code: BillingAccountsGetWithExpand.
     * 
     * @param manager Entry point to BillingManager.
     */
    public static void billingAccountsGetWithExpand(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.billingAccounts()
            .getWithResponse("10000000-0000-0000-0000-000000000000:00000000-0000-0000-0000-000000000000_2019-05-31",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2024-04-01/examples/
     * billingAccountWithExpandForPONumber.json
     */
    /**
     * Sample code: BillingAccountWithExpandForPONumber.
     * 
     * @param manager Entry point to BillingManager.
     */
    public static void billingAccountWithExpandForPONumber(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.billingAccounts().getWithResponse("8608480", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/billing/resource-manager/Microsoft.Billing/stable/2024-04-01/examples/billingAccountsGetEA.json
     */
    /**
     * Sample code: BillingAccountsGetEA.
     * 
     * @param manager Entry point to BillingManager.
     */
    public static void billingAccountsGetEA(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.billingAccounts().getWithResponse("6575495", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2024-04-01/examples/
     * billingAccountWithRegistrationNumberWithType.json
     */
    /**
     * Sample code: BillingAccountWithRegistrationNumberWithType.
     * 
     * @param manager Entry point to BillingManager.
     */
    public static void
        billingAccountWithRegistrationNumberWithType(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.billingAccounts()
            .getWithResponse("10000000-0000-0000-0000-000000000000:00000000-0000-0000-0000-000000000000_2019-05-31",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/billing/resource-manager/Microsoft.Billing/stable/2024-04-01/examples/billingAccountsGet.json
     */
    /**
     * Sample code: BillingAccountsGet.
     * 
     * @param manager Entry point to BillingManager.
     */
    public static void billingAccountsGet(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.billingAccounts()
            .getWithResponse("10000000-0000-0000-0000-000000000000:00000000-0000-0000-0000-000000000000_2019-05-31",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2024-04-01/examples/
     * billingAccountWithRegistrationNumberWithDefaultType.json
     */
    /**
     * Sample code: BillingAccountWithRegistrationNumberWithDefaultType.
     * 
     * @param manager Entry point to BillingManager.
     */
    public static void
        billingAccountWithRegistrationNumberWithDefaultType(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.billingAccounts()
            .getWithResponse("10000000-0000-0000-0000-000000000000:00000000-0000-0000-0000-000000000000_2019-05-31",
                com.azure.core.util.Context.NONE);
    }
}
