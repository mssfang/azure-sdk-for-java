// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * An individual change on the target resource.
 */
@Immutable
public final class ChangeBase implements JsonSerializable<ChangeBase> {
    /*
     * The type of change that occurred
     */
    private ResourcePropertyChangeType propertyChangeType;

    /*
     * The entity that made the change
     */
    private ChangeCategory changeCategory;

    /*
     * The target resource property value before the change
     */
    private String previousValue;

    /*
     * The target resource property value after the change
     */
    private String newValue;

    /**
     * Creates an instance of ChangeBase class.
     */
    public ChangeBase() {
    }

    /**
     * Get the propertyChangeType property: The type of change that occurred.
     * 
     * @return the propertyChangeType value.
     */
    public ResourcePropertyChangeType propertyChangeType() {
        return this.propertyChangeType;
    }

    /**
     * Get the changeCategory property: The entity that made the change.
     * 
     * @return the changeCategory value.
     */
    public ChangeCategory changeCategory() {
        return this.changeCategory;
    }

    /**
     * Get the previousValue property: The target resource property value before the change.
     * 
     * @return the previousValue value.
     */
    public String previousValue() {
        return this.previousValue;
    }

    /**
     * Get the newValue property: The target resource property value after the change.
     * 
     * @return the newValue value.
     */
    public String newValue() {
        return this.newValue;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
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
     * Reads an instance of ChangeBase from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChangeBase if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the ChangeBase.
     */
    public static ChangeBase fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ChangeBase deserializedChangeBase = new ChangeBase();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("propertyChangeType".equals(fieldName)) {
                    deserializedChangeBase.propertyChangeType
                        = ResourcePropertyChangeType.fromString(reader.getString());
                } else if ("changeCategory".equals(fieldName)) {
                    deserializedChangeBase.changeCategory = ChangeCategory.fromString(reader.getString());
                } else if ("previousValue".equals(fieldName)) {
                    deserializedChangeBase.previousValue = reader.getString();
                } else if ("newValue".equals(fieldName)) {
                    deserializedChangeBase.newValue = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedChangeBase;
        });
    }
}
