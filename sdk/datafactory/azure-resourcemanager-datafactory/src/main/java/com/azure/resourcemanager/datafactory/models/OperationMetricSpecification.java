// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Details about an operation related to metrics.
 */
@Fluent
public final class OperationMetricSpecification implements JsonSerializable<OperationMetricSpecification> {
    /*
     * The name of the metric.
     */
    private String name;

    /*
     * Localized display name of the metric.
     */
    private String displayName;

    /*
     * The description of the metric.
     */
    private String displayDescription;

    /*
     * The unit that the metric is measured in.
     */
    private String unit;

    /*
     * The type of metric aggregation.
     */
    private String aggregationType;

    /*
     * Whether or not the service is using regional MDM accounts.
     */
    private String enableRegionalMdmAccount;

    /*
     * The name of the MDM account.
     */
    private String sourceMdmAccount;

    /*
     * The name of the MDM namespace.
     */
    private String sourceMdmNamespace;

    /*
     * Defines how often data for metrics becomes available.
     */
    private List<OperationMetricAvailability> availabilities;

    /*
     * Defines the metric dimension.
     */
    private List<OperationMetricDimension> dimensions;

    /**
     * Creates an instance of OperationMetricSpecification class.
     */
    public OperationMetricSpecification() {
    }

    /**
     * Get the name property: The name of the metric.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the metric.
     * 
     * @param name the name value to set.
     * @return the OperationMetricSpecification object itself.
     */
    public OperationMetricSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Localized display name of the metric.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Localized display name of the metric.
     * 
     * @param displayName the displayName value to set.
     * @return the OperationMetricSpecification object itself.
     */
    public OperationMetricSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the displayDescription property: The description of the metric.
     * 
     * @return the displayDescription value.
     */
    public String displayDescription() {
        return this.displayDescription;
    }

    /**
     * Set the displayDescription property: The description of the metric.
     * 
     * @param displayDescription the displayDescription value to set.
     * @return the OperationMetricSpecification object itself.
     */
    public OperationMetricSpecification withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Get the unit property: The unit that the metric is measured in.
     * 
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: The unit that the metric is measured in.
     * 
     * @param unit the unit value to set.
     * @return the OperationMetricSpecification object itself.
     */
    public OperationMetricSpecification withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the aggregationType property: The type of metric aggregation.
     * 
     * @return the aggregationType value.
     */
    public String aggregationType() {
        return this.aggregationType;
    }

    /**
     * Set the aggregationType property: The type of metric aggregation.
     * 
     * @param aggregationType the aggregationType value to set.
     * @return the OperationMetricSpecification object itself.
     */
    public OperationMetricSpecification withAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Get the enableRegionalMdmAccount property: Whether or not the service is using regional MDM accounts.
     * 
     * @return the enableRegionalMdmAccount value.
     */
    public String enableRegionalMdmAccount() {
        return this.enableRegionalMdmAccount;
    }

    /**
     * Set the enableRegionalMdmAccount property: Whether or not the service is using regional MDM accounts.
     * 
     * @param enableRegionalMdmAccount the enableRegionalMdmAccount value to set.
     * @return the OperationMetricSpecification object itself.
     */
    public OperationMetricSpecification withEnableRegionalMdmAccount(String enableRegionalMdmAccount) {
        this.enableRegionalMdmAccount = enableRegionalMdmAccount;
        return this;
    }

    /**
     * Get the sourceMdmAccount property: The name of the MDM account.
     * 
     * @return the sourceMdmAccount value.
     */
    public String sourceMdmAccount() {
        return this.sourceMdmAccount;
    }

    /**
     * Set the sourceMdmAccount property: The name of the MDM account.
     * 
     * @param sourceMdmAccount the sourceMdmAccount value to set.
     * @return the OperationMetricSpecification object itself.
     */
    public OperationMetricSpecification withSourceMdmAccount(String sourceMdmAccount) {
        this.sourceMdmAccount = sourceMdmAccount;
        return this;
    }

    /**
     * Get the sourceMdmNamespace property: The name of the MDM namespace.
     * 
     * @return the sourceMdmNamespace value.
     */
    public String sourceMdmNamespace() {
        return this.sourceMdmNamespace;
    }

    /**
     * Set the sourceMdmNamespace property: The name of the MDM namespace.
     * 
     * @param sourceMdmNamespace the sourceMdmNamespace value to set.
     * @return the OperationMetricSpecification object itself.
     */
    public OperationMetricSpecification withSourceMdmNamespace(String sourceMdmNamespace) {
        this.sourceMdmNamespace = sourceMdmNamespace;
        return this;
    }

    /**
     * Get the availabilities property: Defines how often data for metrics becomes available.
     * 
     * @return the availabilities value.
     */
    public List<OperationMetricAvailability> availabilities() {
        return this.availabilities;
    }

    /**
     * Set the availabilities property: Defines how often data for metrics becomes available.
     * 
     * @param availabilities the availabilities value to set.
     * @return the OperationMetricSpecification object itself.
     */
    public OperationMetricSpecification withAvailabilities(List<OperationMetricAvailability> availabilities) {
        this.availabilities = availabilities;
        return this;
    }

    /**
     * Get the dimensions property: Defines the metric dimension.
     * 
     * @return the dimensions value.
     */
    public List<OperationMetricDimension> dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions property: Defines the metric dimension.
     * 
     * @param dimensions the dimensions value to set.
     * @return the OperationMetricSpecification object itself.
     */
    public OperationMetricSpecification withDimensions(List<OperationMetricDimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (availabilities() != null) {
            availabilities().forEach(e -> e.validate());
        }
        if (dimensions() != null) {
            dimensions().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("displayDescription", this.displayDescription);
        jsonWriter.writeStringField("unit", this.unit);
        jsonWriter.writeStringField("aggregationType", this.aggregationType);
        jsonWriter.writeStringField("enableRegionalMdmAccount", this.enableRegionalMdmAccount);
        jsonWriter.writeStringField("sourceMdmAccount", this.sourceMdmAccount);
        jsonWriter.writeStringField("sourceMdmNamespace", this.sourceMdmNamespace);
        jsonWriter.writeArrayField("availabilities", this.availabilities,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("dimensions", this.dimensions, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OperationMetricSpecification from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OperationMetricSpecification if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OperationMetricSpecification.
     */
    public static OperationMetricSpecification fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OperationMetricSpecification deserializedOperationMetricSpecification = new OperationMetricSpecification();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedOperationMetricSpecification.name = reader.getString();
                } else if ("displayName".equals(fieldName)) {
                    deserializedOperationMetricSpecification.displayName = reader.getString();
                } else if ("displayDescription".equals(fieldName)) {
                    deserializedOperationMetricSpecification.displayDescription = reader.getString();
                } else if ("unit".equals(fieldName)) {
                    deserializedOperationMetricSpecification.unit = reader.getString();
                } else if ("aggregationType".equals(fieldName)) {
                    deserializedOperationMetricSpecification.aggregationType = reader.getString();
                } else if ("enableRegionalMdmAccount".equals(fieldName)) {
                    deserializedOperationMetricSpecification.enableRegionalMdmAccount = reader.getString();
                } else if ("sourceMdmAccount".equals(fieldName)) {
                    deserializedOperationMetricSpecification.sourceMdmAccount = reader.getString();
                } else if ("sourceMdmNamespace".equals(fieldName)) {
                    deserializedOperationMetricSpecification.sourceMdmNamespace = reader.getString();
                } else if ("availabilities".equals(fieldName)) {
                    List<OperationMetricAvailability> availabilities
                        = reader.readArray(reader1 -> OperationMetricAvailability.fromJson(reader1));
                    deserializedOperationMetricSpecification.availabilities = availabilities;
                } else if ("dimensions".equals(fieldName)) {
                    List<OperationMetricDimension> dimensions
                        = reader.readArray(reader1 -> OperationMetricDimension.fromJson(reader1));
                    deserializedOperationMetricSpecification.dimensions = dimensions;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOperationMetricSpecification;
        });
    }
}
