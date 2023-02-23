// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Language extension image name. */
public final class LanguageExtensionImageName extends ExpandableStringEnum<LanguageExtensionImageName> {
    /** Static value R for LanguageExtensionImageName. */
    public static final LanguageExtensionImageName R = fromString("R");

    /** Static value Python3_6_5 for LanguageExtensionImageName. */
    public static final LanguageExtensionImageName PYTHON3_6_5 = fromString("Python3_6_5");

    /** Static value Python3_9_12 for LanguageExtensionImageName. */
    public static final LanguageExtensionImageName PYTHON3_9_12 = fromString("Python3_9_12");

    /** Static value Python3_9_12IncludeDeepLearning for LanguageExtensionImageName. */
    public static final LanguageExtensionImageName PYTHON3_9_12INCLUDE_DEEP_LEARNING =
        fromString("Python3_9_12IncludeDeepLearning");

    /** Static value Python3_10_8 for LanguageExtensionImageName. */
    public static final LanguageExtensionImageName PYTHON3_10_8 = fromString("Python3_10_8");

    /**
     * Creates a new instance of LanguageExtensionImageName value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LanguageExtensionImageName() {
    }

    /**
     * Creates or finds a LanguageExtensionImageName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LanguageExtensionImageName.
     */
    @JsonCreator
    public static LanguageExtensionImageName fromString(String name) {
        return fromString(name, LanguageExtensionImageName.class);
    }

    /**
     * Gets known LanguageExtensionImageName values.
     *
     * @return known LanguageExtensionImageName values.
     */
    public static Collection<LanguageExtensionImageName> values() {
        return values(LanguageExtensionImageName.class);
    }
}