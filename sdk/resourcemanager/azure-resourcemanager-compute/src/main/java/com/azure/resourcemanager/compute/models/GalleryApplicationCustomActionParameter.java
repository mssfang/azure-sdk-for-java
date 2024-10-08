// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The definition of a parameter that can be passed to a custom action of a Gallery Application Version.
 */
@Fluent
public final class GalleryApplicationCustomActionParameter
    implements JsonSerializable<GalleryApplicationCustomActionParameter> {
    /*
     * The name of the custom action. Must be unique within the Gallery Application Version.
     */
    private String name;

    /*
     * Indicates whether this parameter must be passed when running the custom action.
     */
    private Boolean required;

    /*
     * Specifies the type of the custom action parameter. Possible values are: String, ConfigurationDataBlob or
     * LogOutputBlob
     */
    private GalleryApplicationCustomActionParameterType type;

    /*
     * The default value of the parameter. Only applies to string types
     */
    private String defaultValue;

    /*
     * A description to help users understand what this parameter means
     */
    private String description;

    /**
     * Creates an instance of GalleryApplicationCustomActionParameter class.
     */
    public GalleryApplicationCustomActionParameter() {
    }

    /**
     * Get the name property: The name of the custom action. Must be unique within the Gallery Application Version.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the custom action. Must be unique within the Gallery Application Version.
     * 
     * @param name the name value to set.
     * @return the GalleryApplicationCustomActionParameter object itself.
     */
    public GalleryApplicationCustomActionParameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the required property: Indicates whether this parameter must be passed when running the custom action.
     * 
     * @return the required value.
     */
    public Boolean required() {
        return this.required;
    }

    /**
     * Set the required property: Indicates whether this parameter must be passed when running the custom action.
     * 
     * @param required the required value to set.
     * @return the GalleryApplicationCustomActionParameter object itself.
     */
    public GalleryApplicationCustomActionParameter withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * Get the type property: Specifies the type of the custom action parameter. Possible values are: String,
     * ConfigurationDataBlob or LogOutputBlob.
     * 
     * @return the type value.
     */
    public GalleryApplicationCustomActionParameterType type() {
        return this.type;
    }

    /**
     * Set the type property: Specifies the type of the custom action parameter. Possible values are: String,
     * ConfigurationDataBlob or LogOutputBlob.
     * 
     * @param type the type value to set.
     * @return the GalleryApplicationCustomActionParameter object itself.
     */
    public GalleryApplicationCustomActionParameter withType(GalleryApplicationCustomActionParameterType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the defaultValue property: The default value of the parameter. Only applies to string types.
     * 
     * @return the defaultValue value.
     */
    public String defaultValue() {
        return this.defaultValue;
    }

    /**
     * Set the defaultValue property: The default value of the parameter. Only applies to string types.
     * 
     * @param defaultValue the defaultValue value to set.
     * @return the GalleryApplicationCustomActionParameter object itself.
     */
    public GalleryApplicationCustomActionParameter withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * Get the description property: A description to help users understand what this parameter means.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: A description to help users understand what this parameter means.
     * 
     * @param description the description value to set.
     * @return the GalleryApplicationCustomActionParameter object itself.
     */
    public GalleryApplicationCustomActionParameter withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property name in model GalleryApplicationCustomActionParameter"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GalleryApplicationCustomActionParameter.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeBooleanField("required", this.required);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("defaultValue", this.defaultValue);
        jsonWriter.writeStringField("description", this.description);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GalleryApplicationCustomActionParameter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GalleryApplicationCustomActionParameter if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GalleryApplicationCustomActionParameter.
     */
    public static GalleryApplicationCustomActionParameter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GalleryApplicationCustomActionParameter deserializedGalleryApplicationCustomActionParameter
                = new GalleryApplicationCustomActionParameter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedGalleryApplicationCustomActionParameter.name = reader.getString();
                } else if ("required".equals(fieldName)) {
                    deserializedGalleryApplicationCustomActionParameter.required
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("type".equals(fieldName)) {
                    deserializedGalleryApplicationCustomActionParameter.type
                        = GalleryApplicationCustomActionParameterType.fromString(reader.getString());
                } else if ("defaultValue".equals(fieldName)) {
                    deserializedGalleryApplicationCustomActionParameter.defaultValue = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedGalleryApplicationCustomActionParameter.description = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGalleryApplicationCustomActionParameter;
        });
    }
}
