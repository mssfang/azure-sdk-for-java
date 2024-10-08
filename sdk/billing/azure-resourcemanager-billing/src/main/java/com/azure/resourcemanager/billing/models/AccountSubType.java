// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The tier of the account.
 */
public final class AccountSubType extends ExpandableStringEnum<AccountSubType> {
    /**
     * Static value Other for AccountSubType.
     */
    public static final AccountSubType OTHER = fromString("Other");

    /**
     * Static value None for AccountSubType.
     */
    public static final AccountSubType NONE = fromString("None");

    /**
     * Static value Individual for AccountSubType.
     */
    public static final AccountSubType INDIVIDUAL = fromString("Individual");

    /**
     * Static value Professional for AccountSubType.
     */
    public static final AccountSubType PROFESSIONAL = fromString("Professional");

    /**
     * Static value Enterprise for AccountSubType.
     */
    public static final AccountSubType ENTERPRISE = fromString("Enterprise");

    /**
     * Creates a new instance of AccountSubType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AccountSubType() {
    }

    /**
     * Creates or finds a AccountSubType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AccountSubType.
     */
    public static AccountSubType fromString(String name) {
        return fromString(name, AccountSubType.class);
    }

    /**
     * Gets known AccountSubType values.
     * 
     * @return known AccountSubType values.
     */
    public static Collection<AccountSubType> values() {
        return values(AccountSubType.class);
    }
}
