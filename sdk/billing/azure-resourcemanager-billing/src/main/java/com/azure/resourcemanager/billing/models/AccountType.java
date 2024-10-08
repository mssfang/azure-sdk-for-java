// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The type of customer.
 */
public final class AccountType extends ExpandableStringEnum<AccountType> {
    /**
     * Static value Other for AccountType.
     */
    public static final AccountType OTHER = fromString("Other");

    /**
     * Static value Enterprise for AccountType.
     */
    public static final AccountType ENTERPRISE = fromString("Enterprise");

    /**
     * Static value Individual for AccountType.
     */
    public static final AccountType INDIVIDUAL = fromString("Individual");

    /**
     * Static value Partner for AccountType.
     */
    public static final AccountType PARTNER = fromString("Partner");

    /**
     * Static value Reseller for AccountType.
     */
    public static final AccountType RESELLER = fromString("Reseller");

    /**
     * Static value ClassicPartner for AccountType.
     */
    public static final AccountType CLASSIC_PARTNER = fromString("ClassicPartner");

    /**
     * Static value Internal for AccountType.
     */
    public static final AccountType INTERNAL = fromString("Internal");

    /**
     * Static value Tenant for AccountType.
     */
    public static final AccountType TENANT = fromString("Tenant");

    /**
     * Static value Business for AccountType.
     */
    public static final AccountType BUSINESS = fromString("Business");

    /**
     * Creates a new instance of AccountType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AccountType() {
    }

    /**
     * Creates or finds a AccountType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AccountType.
     */
    public static AccountType fromString(String name) {
        return fromString(name, AccountType.class);
    }

    /**
     * Gets known AccountType values.
     * 
     * @return known AccountType values.
     */
    public static Collection<AccountType> values() {
        return values(AccountType.class);
    }
}
