// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Managed compute identity definition.
 */
@Fluent
public final class ManagedComputeIdentity extends MonitorComputeIdentityBase {
    /*
     * [Required] Specifies the type of identity to use within the monitoring jobs.
     */
    private MonitorComputeIdentityType computeIdentityType = MonitorComputeIdentityType.MANAGED_IDENTITY;

    /*
     * The identity which will be leveraged by the monitoring jobs.
     */
    private ManagedServiceIdentity identity;

    /**
     * Creates an instance of ManagedComputeIdentity class.
     */
    public ManagedComputeIdentity() {
    }

    /**
     * Get the computeIdentityType property: [Required] Specifies the type of identity to use within the monitoring
     * jobs.
     * 
     * @return the computeIdentityType value.
     */
    @Override
    public MonitorComputeIdentityType computeIdentityType() {
        return this.computeIdentityType;
    }

    /**
     * Get the identity property: The identity which will be leveraged by the monitoring jobs.
     * 
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity which will be leveraged by the monitoring jobs.
     * 
     * @param identity the identity value to set.
     * @return the ManagedComputeIdentity object itself.
     */
    public ManagedComputeIdentity withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (identity() != null) {
            identity().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("computeIdentityType",
            this.computeIdentityType == null ? null : this.computeIdentityType.toString());
        jsonWriter.writeJsonField("identity", this.identity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedComputeIdentity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedComputeIdentity if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagedComputeIdentity.
     */
    public static ManagedComputeIdentity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedComputeIdentity deserializedManagedComputeIdentity = new ManagedComputeIdentity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("computeIdentityType".equals(fieldName)) {
                    deserializedManagedComputeIdentity.computeIdentityType
                        = MonitorComputeIdentityType.fromString(reader.getString());
                } else if ("identity".equals(fieldName)) {
                    deserializedManagedComputeIdentity.identity = ManagedServiceIdentity.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedComputeIdentity;
        });
    }
}
