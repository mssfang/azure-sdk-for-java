// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.models.JobAgentState;
import java.io.IOException;

/**
 * Properties of a job agent.
 */
@Fluent
public final class JobAgentProperties implements JsonSerializable<JobAgentProperties> {
    /*
     * Resource ID of the database to store job metadata in.
     */
    private String databaseId;

    /*
     * The state of the job agent.
     */
    private JobAgentState state;

    /**
     * Creates an instance of JobAgentProperties class.
     */
    public JobAgentProperties() {
    }

    /**
     * Get the databaseId property: Resource ID of the database to store job metadata in.
     * 
     * @return the databaseId value.
     */
    public String databaseId() {
        return this.databaseId;
    }

    /**
     * Set the databaseId property: Resource ID of the database to store job metadata in.
     * 
     * @param databaseId the databaseId value to set.
     * @return the JobAgentProperties object itself.
     */
    public JobAgentProperties withDatabaseId(String databaseId) {
        this.databaseId = databaseId;
        return this;
    }

    /**
     * Get the state property: The state of the job agent.
     * 
     * @return the state value.
     */
    public JobAgentState state() {
        return this.state;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (databaseId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property databaseId in model JobAgentProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(JobAgentProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("databaseId", this.databaseId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of JobAgentProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of JobAgentProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the JobAgentProperties.
     */
    public static JobAgentProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            JobAgentProperties deserializedJobAgentProperties = new JobAgentProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("databaseId".equals(fieldName)) {
                    deserializedJobAgentProperties.databaseId = reader.getString();
                } else if ("state".equals(fieldName)) {
                    deserializedJobAgentProperties.state = JobAgentState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedJobAgentProperties;
        });
    }
}
