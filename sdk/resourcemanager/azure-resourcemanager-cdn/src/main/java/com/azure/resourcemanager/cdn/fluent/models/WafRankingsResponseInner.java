// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cdn.models.WafRankingsResponseDataItem;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Waf Rankings Response.
 */
@Fluent
public final class WafRankingsResponseInner implements JsonSerializable<WafRankingsResponseInner> {
    /*
     * The dateTimeBegin property.
     */
    private OffsetDateTime dateTimeBegin;

    /*
     * The dateTimeEnd property.
     */
    private OffsetDateTime dateTimeEnd;

    /*
     * The groups property.
     */
    private List<String> groups;

    /*
     * The data property.
     */
    private List<WafRankingsResponseDataItem> data;

    /**
     * Creates an instance of WafRankingsResponseInner class.
     */
    public WafRankingsResponseInner() {
    }

    /**
     * Get the dateTimeBegin property: The dateTimeBegin property.
     * 
     * @return the dateTimeBegin value.
     */
    public OffsetDateTime dateTimeBegin() {
        return this.dateTimeBegin;
    }

    /**
     * Set the dateTimeBegin property: The dateTimeBegin property.
     * 
     * @param dateTimeBegin the dateTimeBegin value to set.
     * @return the WafRankingsResponseInner object itself.
     */
    public WafRankingsResponseInner withDateTimeBegin(OffsetDateTime dateTimeBegin) {
        this.dateTimeBegin = dateTimeBegin;
        return this;
    }

    /**
     * Get the dateTimeEnd property: The dateTimeEnd property.
     * 
     * @return the dateTimeEnd value.
     */
    public OffsetDateTime dateTimeEnd() {
        return this.dateTimeEnd;
    }

    /**
     * Set the dateTimeEnd property: The dateTimeEnd property.
     * 
     * @param dateTimeEnd the dateTimeEnd value to set.
     * @return the WafRankingsResponseInner object itself.
     */
    public WafRankingsResponseInner withDateTimeEnd(OffsetDateTime dateTimeEnd) {
        this.dateTimeEnd = dateTimeEnd;
        return this;
    }

    /**
     * Get the groups property: The groups property.
     * 
     * @return the groups value.
     */
    public List<String> groups() {
        return this.groups;
    }

    /**
     * Set the groups property: The groups property.
     * 
     * @param groups the groups value to set.
     * @return the WafRankingsResponseInner object itself.
     */
    public WafRankingsResponseInner withGroups(List<String> groups) {
        this.groups = groups;
        return this;
    }

    /**
     * Get the data property: The data property.
     * 
     * @return the data value.
     */
    public List<WafRankingsResponseDataItem> data() {
        return this.data;
    }

    /**
     * Set the data property: The data property.
     * 
     * @param data the data value to set.
     * @return the WafRankingsResponseInner object itself.
     */
    public WafRankingsResponseInner withData(List<WafRankingsResponseDataItem> data) {
        this.data = data;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (data() != null) {
            data().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("dateTimeBegin",
            this.dateTimeBegin == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.dateTimeBegin));
        jsonWriter.writeStringField("dateTimeEnd",
            this.dateTimeEnd == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.dateTimeEnd));
        jsonWriter.writeArrayField("groups", this.groups, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("data", this.data, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WafRankingsResponseInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WafRankingsResponseInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the WafRankingsResponseInner.
     */
    public static WafRankingsResponseInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WafRankingsResponseInner deserializedWafRankingsResponseInner = new WafRankingsResponseInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dateTimeBegin".equals(fieldName)) {
                    deserializedWafRankingsResponseInner.dateTimeBegin = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("dateTimeEnd".equals(fieldName)) {
                    deserializedWafRankingsResponseInner.dateTimeEnd = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("groups".equals(fieldName)) {
                    List<String> groups = reader.readArray(reader1 -> reader1.getString());
                    deserializedWafRankingsResponseInner.groups = groups;
                } else if ("data".equals(fieldName)) {
                    List<WafRankingsResponseDataItem> data
                        = reader.readArray(reader1 -> WafRankingsResponseDataItem.fromJson(reader1));
                    deserializedWafRankingsResponseInner.data = data;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWafRankingsResponseInner;
        });
    }
}
