// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The CronTrigger model.
 */
@Fluent
public final class CronTrigger extends TriggerBase {
    /*
     * [Required]
     */
    private TriggerType triggerType = TriggerType.CRON;

    /*
     * [Required] Specifies cron expression of schedule.
     * The expression should follow NCronTab format.
     */
    private String expression;

    /**
     * Creates an instance of CronTrigger class.
     */
    public CronTrigger() {
    }

    /**
     * Get the triggerType property: [Required].
     * 
     * @return the triggerType value.
     */
    @Override
    public TriggerType triggerType() {
        return this.triggerType;
    }

    /**
     * Get the expression property: [Required] Specifies cron expression of schedule.
     * The expression should follow NCronTab format.
     * 
     * @return the expression value.
     */
    public String expression() {
        return this.expression;
    }

    /**
     * Set the expression property: [Required] Specifies cron expression of schedule.
     * The expression should follow NCronTab format.
     * 
     * @param expression the expression value to set.
     * @return the CronTrigger object itself.
     */
    public CronTrigger withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CronTrigger withEndTime(String endTime) {
        super.withEndTime(endTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CronTrigger withStartTime(String startTime) {
        super.withStartTime(startTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CronTrigger withTimeZone(String timeZone) {
        super.withTimeZone(timeZone);
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
        if (expression() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property expression in model CronTrigger"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CronTrigger.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("endTime", endTime());
        jsonWriter.writeStringField("startTime", startTime());
        jsonWriter.writeStringField("timeZone", timeZone());
        jsonWriter.writeStringField("expression", this.expression);
        jsonWriter.writeStringField("triggerType", this.triggerType == null ? null : this.triggerType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CronTrigger from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CronTrigger if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CronTrigger.
     */
    public static CronTrigger fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CronTrigger deserializedCronTrigger = new CronTrigger();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("endTime".equals(fieldName)) {
                    deserializedCronTrigger.withEndTime(reader.getString());
                } else if ("startTime".equals(fieldName)) {
                    deserializedCronTrigger.withStartTime(reader.getString());
                } else if ("timeZone".equals(fieldName)) {
                    deserializedCronTrigger.withTimeZone(reader.getString());
                } else if ("expression".equals(fieldName)) {
                    deserializedCronTrigger.expression = reader.getString();
                } else if ("triggerType".equals(fieldName)) {
                    deserializedCronTrigger.triggerType = TriggerType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCronTrigger;
        });
    }
}
