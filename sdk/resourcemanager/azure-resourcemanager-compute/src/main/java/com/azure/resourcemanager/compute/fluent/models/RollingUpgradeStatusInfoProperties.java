// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.models.ApiError;
import com.azure.resourcemanager.compute.models.RollingUpgradePolicy;
import com.azure.resourcemanager.compute.models.RollingUpgradeProgressInfo;
import com.azure.resourcemanager.compute.models.RollingUpgradeRunningStatus;
import java.io.IOException;

/**
 * The status of the latest virtual machine scale set rolling upgrade.
 */
@Immutable
public final class RollingUpgradeStatusInfoProperties implements JsonSerializable<RollingUpgradeStatusInfoProperties> {
    /*
     * The rolling upgrade policies applied for this upgrade.
     */
    private RollingUpgradePolicy policy;

    /*
     * Information about the current running state of the overall upgrade.
     */
    private RollingUpgradeRunningStatus runningStatus;

    /*
     * Information about the number of virtual machine instances in each upgrade state.
     */
    private RollingUpgradeProgressInfo progress;

    /*
     * Error details for this upgrade, if there are any.
     */
    private ApiError error;

    /**
     * Creates an instance of RollingUpgradeStatusInfoProperties class.
     */
    public RollingUpgradeStatusInfoProperties() {
    }

    /**
     * Get the policy property: The rolling upgrade policies applied for this upgrade.
     * 
     * @return the policy value.
     */
    public RollingUpgradePolicy policy() {
        return this.policy;
    }

    /**
     * Get the runningStatus property: Information about the current running state of the overall upgrade.
     * 
     * @return the runningStatus value.
     */
    public RollingUpgradeRunningStatus runningStatus() {
        return this.runningStatus;
    }

    /**
     * Get the progress property: Information about the number of virtual machine instances in each upgrade state.
     * 
     * @return the progress value.
     */
    public RollingUpgradeProgressInfo progress() {
        return this.progress;
    }

    /**
     * Get the error property: Error details for this upgrade, if there are any.
     * 
     * @return the error value.
     */
    public ApiError error() {
        return this.error;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (policy() != null) {
            policy().validate();
        }
        if (runningStatus() != null) {
            runningStatus().validate();
        }
        if (progress() != null) {
            progress().validate();
        }
        if (error() != null) {
            error().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RollingUpgradeStatusInfoProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RollingUpgradeStatusInfoProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RollingUpgradeStatusInfoProperties.
     */
    public static RollingUpgradeStatusInfoProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RollingUpgradeStatusInfoProperties deserializedRollingUpgradeStatusInfoProperties
                = new RollingUpgradeStatusInfoProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("policy".equals(fieldName)) {
                    deserializedRollingUpgradeStatusInfoProperties.policy = RollingUpgradePolicy.fromJson(reader);
                } else if ("runningStatus".equals(fieldName)) {
                    deserializedRollingUpgradeStatusInfoProperties.runningStatus
                        = RollingUpgradeRunningStatus.fromJson(reader);
                } else if ("progress".equals(fieldName)) {
                    deserializedRollingUpgradeStatusInfoProperties.progress
                        = RollingUpgradeProgressInfo.fromJson(reader);
                } else if ("error".equals(fieldName)) {
                    deserializedRollingUpgradeStatusInfoProperties.error = ApiError.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRollingUpgradeStatusInfoProperties;
        });
    }
}
