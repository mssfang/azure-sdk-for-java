// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cdn.models.AfdProvisioningState;
import com.azure.resourcemanager.cdn.models.DeploymentStatus;
import com.azure.resourcemanager.cdn.models.SecurityPolicyPropertiesParameters;
import java.io.IOException;

/**
 * SecurityPolicy association for AzureFrontDoor profile.
 */
@Fluent
public final class SecurityPolicyInner extends ProxyResource {
    /*
     * The json object that contains properties required to create a security policy
     */
    private SecurityPolicyProperties innerProperties;

    /*
     * Read only system data
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of SecurityPolicyInner class.
     */
    public SecurityPolicyInner() {
    }

    /**
     * Get the innerProperties property: The json object that contains properties required to create a security policy.
     * 
     * @return the innerProperties value.
     */
    private SecurityPolicyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Read only system data.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the profileName property: The name of the profile which holds the security policy.
     * 
     * @return the profileName value.
     */
    public String profileName() {
        return this.innerProperties() == null ? null : this.innerProperties().profileName();
    }

    /**
     * Get the parameters property: object which contains security policy parameters.
     * 
     * @return the parameters value.
     */
    public SecurityPolicyPropertiesParameters parameters() {
        return this.innerProperties() == null ? null : this.innerProperties().parameters();
    }

    /**
     * Set the parameters property: object which contains security policy parameters.
     * 
     * @param parameters the parameters value to set.
     * @return the SecurityPolicyInner object itself.
     */
    public SecurityPolicyInner withParameters(SecurityPolicyPropertiesParameters parameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecurityPolicyProperties();
        }
        this.innerProperties().withParameters(parameters);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning status.
     * 
     * @return the provisioningState value.
     */
    public AfdProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the deploymentStatus property: The deploymentStatus property.
     * 
     * @return the deploymentStatus value.
     */
    public DeploymentStatus deploymentStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().deploymentStatus();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SecurityPolicyInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SecurityPolicyInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SecurityPolicyInner.
     */
    public static SecurityPolicyInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SecurityPolicyInner deserializedSecurityPolicyInner = new SecurityPolicyInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSecurityPolicyInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedSecurityPolicyInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedSecurityPolicyInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedSecurityPolicyInner.innerProperties = SecurityPolicyProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedSecurityPolicyInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSecurityPolicyInner;
        });
    }
}
