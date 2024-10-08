// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Access Decision, specifies access is allowed or not.
 */
public final class AccessDecision extends ExpandableStringEnum<AccessDecision> {
    /**
     * Static value Other for AccessDecision.
     */
    public static final AccessDecision OTHER = fromString("Other");

    /**
     * Static value Allowed for AccessDecision.
     */
    public static final AccessDecision ALLOWED = fromString("Allowed");

    /**
     * Static value NotAllowed for AccessDecision.
     */
    public static final AccessDecision NOT_ALLOWED = fromString("NotAllowed");

    /**
     * Creates a new instance of AccessDecision value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AccessDecision() {
    }

    /**
     * Creates or finds a AccessDecision from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AccessDecision.
     */
    public static AccessDecision fromString(String name) {
        return fromString(name, AccessDecision.class);
    }

    /**
     * Gets known AccessDecision values.
     * 
     * @return known AccessDecision values.
     */
    public static Collection<AccessDecision> values() {
        return values(AccessDecision.class);
    }
}
