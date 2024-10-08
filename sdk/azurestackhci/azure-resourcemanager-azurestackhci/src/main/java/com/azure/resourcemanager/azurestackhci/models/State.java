// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * State of the update as it relates to this stamp.
 */
public final class State extends ExpandableStringEnum<State> {
    /**
     * Static value HasPrerequisite for State.
     */
    public static final State HAS_PREREQUISITE = fromString("HasPrerequisite");

    /**
     * Static value Obsolete for State.
     */
    public static final State OBSOLETE = fromString("Obsolete");

    /**
     * Static value Ready for State.
     */
    public static final State READY = fromString("Ready");

    /**
     * Static value NotApplicableBecauseAnotherUpdateIsInProgress for State.
     */
    public static final State NOT_APPLICABLE_BECAUSE_ANOTHER_UPDATE_IS_IN_PROGRESS
        = fromString("NotApplicableBecauseAnotherUpdateIsInProgress");

    /**
     * Static value Preparing for State.
     */
    public static final State PREPARING = fromString("Preparing");

    /**
     * Static value Installing for State.
     */
    public static final State INSTALLING = fromString("Installing");

    /**
     * Static value Installed for State.
     */
    public static final State INSTALLED = fromString("Installed");

    /**
     * Static value PreparationFailed for State.
     */
    public static final State PREPARATION_FAILED = fromString("PreparationFailed");

    /**
     * Static value InstallationFailed for State.
     */
    public static final State INSTALLATION_FAILED = fromString("InstallationFailed");

    /**
     * Static value Invalid for State.
     */
    public static final State INVALID = fromString("Invalid");

    /**
     * Static value Recalled for State.
     */
    public static final State RECALLED = fromString("Recalled");

    /**
     * Static value Downloading for State.
     */
    public static final State DOWNLOADING = fromString("Downloading");

    /**
     * Static value DownloadFailed for State.
     */
    public static final State DOWNLOAD_FAILED = fromString("DownloadFailed");

    /**
     * Static value HealthChecking for State.
     */
    public static final State HEALTH_CHECKING = fromString("HealthChecking");

    /**
     * Static value HealthCheckFailed for State.
     */
    public static final State HEALTH_CHECK_FAILED = fromString("HealthCheckFailed");

    /**
     * Static value ReadyToInstall for State.
     */
    public static final State READY_TO_INSTALL = fromString("ReadyToInstall");

    /**
     * Static value ScanInProgress for State.
     */
    public static final State SCAN_IN_PROGRESS = fromString("ScanInProgress");

    /**
     * Static value ScanFailed for State.
     */
    public static final State SCAN_FAILED = fromString("ScanFailed");

    /**
     * Static value AdditionalContentRequired for State.
     */
    public static final State ADDITIONAL_CONTENT_REQUIRED = fromString("AdditionalContentRequired");

    /**
     * Creates a new instance of State value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public State() {
    }

    /**
     * Creates or finds a State from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding State.
     */
    public static State fromString(String name) {
        return fromString(name, State.class);
    }

    /**
     * Gets known State values.
     * 
     * @return known State values.
     */
    public static Collection<State> values() {
        return values(State.class);
    }
}
