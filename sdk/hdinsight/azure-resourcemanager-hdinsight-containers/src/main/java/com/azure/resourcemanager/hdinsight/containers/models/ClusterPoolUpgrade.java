// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Cluster Pool Upgrade.
 */
@Fluent
public final class ClusterPoolUpgrade implements JsonSerializable<ClusterPoolUpgrade> {
    /*
     * Properties of upgrading cluster pool.
     */
    private ClusterPoolUpgradeProperties properties;

    /**
     * Creates an instance of ClusterPoolUpgrade class.
     */
    public ClusterPoolUpgrade() {
    }

    /**
     * Get the properties property: Properties of upgrading cluster pool.
     * 
     * @return the properties value.
     */
    public ClusterPoolUpgradeProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of upgrading cluster pool.
     * 
     * @param properties the properties value to set.
     * @return the ClusterPoolUpgrade object itself.
     */
    public ClusterPoolUpgrade withProperties(ClusterPoolUpgradeProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property properties in model ClusterPoolUpgrade"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ClusterPoolUpgrade.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterPoolUpgrade from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterPoolUpgrade if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ClusterPoolUpgrade.
     */
    public static ClusterPoolUpgrade fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterPoolUpgrade deserializedClusterPoolUpgrade = new ClusterPoolUpgrade();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedClusterPoolUpgrade.properties = ClusterPoolUpgradeProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterPoolUpgrade;
        });
    }
}
