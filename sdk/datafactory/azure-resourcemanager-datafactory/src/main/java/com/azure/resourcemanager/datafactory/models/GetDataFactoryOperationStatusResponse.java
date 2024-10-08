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
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Response body structure for get data factory operation status.
 */
@Fluent
public final class GetDataFactoryOperationStatusResponse
    implements JsonSerializable<GetDataFactoryOperationStatusResponse> {
    /*
     * Status of the operation.
     */
    private String status;

    /*
     * Response body structure for get data factory operation status.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of GetDataFactoryOperationStatusResponse class.
     */
    public GetDataFactoryOperationStatusResponse() {
    }

    /**
     * Get the status property: Status of the operation.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Status of the operation.
     * 
     * @param status the status value to set.
     * @return the GetDataFactoryOperationStatusResponse object itself.
     */
    public GetDataFactoryOperationStatusResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the additionalProperties property: Response body structure for get data factory operation status.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Response body structure for get data factory operation status.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the GetDataFactoryOperationStatusResponse object itself.
     */
    public GetDataFactoryOperationStatusResponse withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
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
        jsonWriter.writeStringField("status", this.status);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GetDataFactoryOperationStatusResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GetDataFactoryOperationStatusResponse if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GetDataFactoryOperationStatusResponse.
     */
    public static GetDataFactoryOperationStatusResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GetDataFactoryOperationStatusResponse deserializedGetDataFactoryOperationStatusResponse
                = new GetDataFactoryOperationStatusResponse();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("status".equals(fieldName)) {
                    deserializedGetDataFactoryOperationStatusResponse.status = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedGetDataFactoryOperationStatusResponse.additionalProperties = additionalProperties;

            return deserializedGetDataFactoryOperationStatusResponse;
        });
    }
}
