// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The MonitoringSignalBase model.
 */
@Fluent
public class MonitoringSignalBase implements JsonSerializable<MonitoringSignalBase> {
    /*
     * [Required] Specifies the type of signal to monitor.
     */
    private MonitoringSignalType signalType = MonitoringSignalType.fromString("MonitoringSignalBase");

    /*
     * The current notification mode for this signal.
     */
    private List<MonitoringNotificationType> notificationTypes;

    /*
     * Property dictionary. Properties can be added, but not removed or altered.
     */
    private Map<String, String> properties;

    /**
     * Creates an instance of MonitoringSignalBase class.
     */
    public MonitoringSignalBase() {
    }

    /**
     * Get the signalType property: [Required] Specifies the type of signal to monitor.
     * 
     * @return the signalType value.
     */
    public MonitoringSignalType signalType() {
        return this.signalType;
    }

    /**
     * Get the notificationTypes property: The current notification mode for this signal.
     * 
     * @return the notificationTypes value.
     */
    public List<MonitoringNotificationType> notificationTypes() {
        return this.notificationTypes;
    }

    /**
     * Set the notificationTypes property: The current notification mode for this signal.
     * 
     * @param notificationTypes the notificationTypes value to set.
     * @return the MonitoringSignalBase object itself.
     */
    public MonitoringSignalBase withNotificationTypes(List<MonitoringNotificationType> notificationTypes) {
        this.notificationTypes = notificationTypes;
        return this;
    }

    /**
     * Get the properties property: Property dictionary. Properties can be added, but not removed or altered.
     * 
     * @return the properties value.
     */
    public Map<String, String> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Property dictionary. Properties can be added, but not removed or altered.
     * 
     * @param properties the properties value to set.
     * @return the MonitoringSignalBase object itself.
     */
    public MonitoringSignalBase withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
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
        jsonWriter.writeStringField("signalType", this.signalType == null ? null : this.signalType.toString());
        jsonWriter.writeArrayField("notificationTypes", this.notificationTypes,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeMapField("properties", this.properties, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MonitoringSignalBase from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MonitoringSignalBase if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MonitoringSignalBase.
     */
    public static MonitoringSignalBase fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("signalType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("Custom".equals(discriminatorValue)) {
                    return CustomMonitoringSignal.fromJson(readerToUse.reset());
                } else if ("DataDrift".equals(discriminatorValue)) {
                    return DataDriftMonitoringSignal.fromJson(readerToUse.reset());
                } else if ("DataQuality".equals(discriminatorValue)) {
                    return DataQualityMonitoringSignal.fromJson(readerToUse.reset());
                } else if ("FeatureAttributionDrift".equals(discriminatorValue)) {
                    return FeatureAttributionDriftMonitoringSignal.fromJson(readerToUse.reset());
                } else if ("PredictionDrift".equals(discriminatorValue)) {
                    return PredictionDriftMonitoringSignal.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static MonitoringSignalBase fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MonitoringSignalBase deserializedMonitoringSignalBase = new MonitoringSignalBase();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("signalType".equals(fieldName)) {
                    deserializedMonitoringSignalBase.signalType = MonitoringSignalType.fromString(reader.getString());
                } else if ("notificationTypes".equals(fieldName)) {
                    List<MonitoringNotificationType> notificationTypes
                        = reader.readArray(reader1 -> MonitoringNotificationType.fromString(reader1.getString()));
                    deserializedMonitoringSignalBase.notificationTypes = notificationTypes;
                } else if ("properties".equals(fieldName)) {
                    Map<String, String> properties = reader.readMap(reader1 -> reader1.getString());
                    deserializedMonitoringSignalBase.properties = properties;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMonitoringSignalBase;
        });
    }
}
