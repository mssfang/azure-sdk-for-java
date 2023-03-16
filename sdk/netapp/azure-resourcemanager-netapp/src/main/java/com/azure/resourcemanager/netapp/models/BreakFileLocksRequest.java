// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Break file locks request. */
@Fluent
public final class BreakFileLocksRequest {
    /*
     * To clear file locks on a volume for a particular client
     */
    @JsonProperty(value = "clientIp")
    private String clientIp;

    /*
     * Break File locks could be a disruptive operation for application as locks on the volume will be broken, if want
     * to process, set to true.
     */
    @JsonProperty(value = "confirmRunningDisruptiveOperation")
    private Boolean confirmRunningDisruptiveOperation;

    /** Creates an instance of BreakFileLocksRequest class. */
    public BreakFileLocksRequest() {
    }

    /**
     * Get the clientIp property: To clear file locks on a volume for a particular client.
     *
     * @return the clientIp value.
     */
    public String clientIp() {
        return this.clientIp;
    }

    /**
     * Set the clientIp property: To clear file locks on a volume for a particular client.
     *
     * @param clientIp the clientIp value to set.
     * @return the BreakFileLocksRequest object itself.
     */
    public BreakFileLocksRequest withClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    /**
     * Get the confirmRunningDisruptiveOperation property: Break File locks could be a disruptive operation for
     * application as locks on the volume will be broken, if want to process, set to true.
     *
     * @return the confirmRunningDisruptiveOperation value.
     */
    public Boolean confirmRunningDisruptiveOperation() {
        return this.confirmRunningDisruptiveOperation;
    }

    /**
     * Set the confirmRunningDisruptiveOperation property: Break File locks could be a disruptive operation for
     * application as locks on the volume will be broken, if want to process, set to true.
     *
     * @param confirmRunningDisruptiveOperation the confirmRunningDisruptiveOperation value to set.
     * @return the BreakFileLocksRequest object itself.
     */
    public BreakFileLocksRequest withConfirmRunningDisruptiveOperation(Boolean confirmRunningDisruptiveOperation) {
        this.confirmRunningDisruptiveOperation = confirmRunningDisruptiveOperation;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}