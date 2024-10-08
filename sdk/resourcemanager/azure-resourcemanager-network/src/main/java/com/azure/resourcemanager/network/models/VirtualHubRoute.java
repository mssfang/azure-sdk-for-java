// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * VirtualHub route.
 */
@Fluent
public final class VirtualHubRoute implements JsonSerializable<VirtualHubRoute> {
    /*
     * List of all addressPrefixes.
     */
    private List<String> addressPrefixes;

    /*
     * NextHop ip address.
     */
    private String nextHopIpAddress;

    /**
     * Creates an instance of VirtualHubRoute class.
     */
    public VirtualHubRoute() {
    }

    /**
     * Get the addressPrefixes property: List of all addressPrefixes.
     * 
     * @return the addressPrefixes value.
     */
    public List<String> addressPrefixes() {
        return this.addressPrefixes;
    }

    /**
     * Set the addressPrefixes property: List of all addressPrefixes.
     * 
     * @param addressPrefixes the addressPrefixes value to set.
     * @return the VirtualHubRoute object itself.
     */
    public VirtualHubRoute withAddressPrefixes(List<String> addressPrefixes) {
        this.addressPrefixes = addressPrefixes;
        return this;
    }

    /**
     * Get the nextHopIpAddress property: NextHop ip address.
     * 
     * @return the nextHopIpAddress value.
     */
    public String nextHopIpAddress() {
        return this.nextHopIpAddress;
    }

    /**
     * Set the nextHopIpAddress property: NextHop ip address.
     * 
     * @param nextHopIpAddress the nextHopIpAddress value to set.
     * @return the VirtualHubRoute object itself.
     */
    public VirtualHubRoute withNextHopIpAddress(String nextHopIpAddress) {
        this.nextHopIpAddress = nextHopIpAddress;
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
        jsonWriter.writeArrayField("addressPrefixes", this.addressPrefixes,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("nextHopIpAddress", this.nextHopIpAddress);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualHubRoute from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualHubRoute if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualHubRoute.
     */
    public static VirtualHubRoute fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualHubRoute deserializedVirtualHubRoute = new VirtualHubRoute();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("addressPrefixes".equals(fieldName)) {
                    List<String> addressPrefixes = reader.readArray(reader1 -> reader1.getString());
                    deserializedVirtualHubRoute.addressPrefixes = addressPrefixes;
                } else if ("nextHopIpAddress".equals(fieldName)) {
                    deserializedVirtualHubRoute.nextHopIpAddress = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualHubRoute;
        });
    }
}
