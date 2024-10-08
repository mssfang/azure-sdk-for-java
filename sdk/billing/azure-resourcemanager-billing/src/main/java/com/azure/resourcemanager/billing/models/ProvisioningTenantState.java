// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The state determines whether subscriptions and licenses can be provisioned in the associated tenant. It can be set to
 * 'Pending' to initiate a billing request.
 */
public final class ProvisioningTenantState extends ExpandableStringEnum<ProvisioningTenantState> {
    /**
     * Static value Other for ProvisioningTenantState.
     */
    public static final ProvisioningTenantState OTHER = fromString("Other");

    /**
     * Static value NotRequested for ProvisioningTenantState.
     */
    public static final ProvisioningTenantState NOT_REQUESTED = fromString("NotRequested");

    /**
     * Static value Active for ProvisioningTenantState.
     */
    public static final ProvisioningTenantState ACTIVE = fromString("Active");

    /**
     * Static value Pending for ProvisioningTenantState.
     */
    public static final ProvisioningTenantState PENDING = fromString("Pending");

    /**
     * Static value BillingRequestExpired for ProvisioningTenantState.
     */
    public static final ProvisioningTenantState BILLING_REQUEST_EXPIRED = fromString("BillingRequestExpired");

    /**
     * Static value BillingRequestDeclined for ProvisioningTenantState.
     */
    public static final ProvisioningTenantState BILLING_REQUEST_DECLINED = fromString("BillingRequestDeclined");

    /**
     * Static value Revoked for ProvisioningTenantState.
     */
    public static final ProvisioningTenantState REVOKED = fromString("Revoked");

    /**
     * Creates a new instance of ProvisioningTenantState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ProvisioningTenantState() {
    }

    /**
     * Creates or finds a ProvisioningTenantState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ProvisioningTenantState.
     */
    public static ProvisioningTenantState fromString(String name) {
        return fromString(name, ProvisioningTenantState.class);
    }

    /**
     * Gets known ProvisioningTenantState values.
     * 
     * @return known ProvisioningTenantState values.
     */
    public static Collection<ProvisioningTenantState> values() {
        return values(ProvisioningTenantState.class);
    }
}
