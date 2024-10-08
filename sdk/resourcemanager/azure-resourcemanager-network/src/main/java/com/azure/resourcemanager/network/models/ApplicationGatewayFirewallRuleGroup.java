// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A web application firewall rule group.
 */
@Fluent
public final class ApplicationGatewayFirewallRuleGroup
    implements JsonSerializable<ApplicationGatewayFirewallRuleGroup> {
    /*
     * The name of the web application firewall rule group.
     */
    private String ruleGroupName;

    /*
     * The description of the web application firewall rule group.
     */
    private String description;

    /*
     * The rules of the web application firewall rule group.
     */
    private List<ApplicationGatewayFirewallRule> rules;

    /**
     * Creates an instance of ApplicationGatewayFirewallRuleGroup class.
     */
    public ApplicationGatewayFirewallRuleGroup() {
    }

    /**
     * Get the ruleGroupName property: The name of the web application firewall rule group.
     * 
     * @return the ruleGroupName value.
     */
    public String ruleGroupName() {
        return this.ruleGroupName;
    }

    /**
     * Set the ruleGroupName property: The name of the web application firewall rule group.
     * 
     * @param ruleGroupName the ruleGroupName value to set.
     * @return the ApplicationGatewayFirewallRuleGroup object itself.
     */
    public ApplicationGatewayFirewallRuleGroup withRuleGroupName(String ruleGroupName) {
        this.ruleGroupName = ruleGroupName;
        return this;
    }

    /**
     * Get the description property: The description of the web application firewall rule group.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the web application firewall rule group.
     * 
     * @param description the description value to set.
     * @return the ApplicationGatewayFirewallRuleGroup object itself.
     */
    public ApplicationGatewayFirewallRuleGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the rules property: The rules of the web application firewall rule group.
     * 
     * @return the rules value.
     */
    public List<ApplicationGatewayFirewallRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: The rules of the web application firewall rule group.
     * 
     * @param rules the rules value to set.
     * @return the ApplicationGatewayFirewallRuleGroup object itself.
     */
    public ApplicationGatewayFirewallRuleGroup withRules(List<ApplicationGatewayFirewallRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ruleGroupName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property ruleGroupName in model ApplicationGatewayFirewallRuleGroup"));
        }
        if (rules() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property rules in model ApplicationGatewayFirewallRuleGroup"));
        } else {
            rules().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ApplicationGatewayFirewallRuleGroup.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("ruleGroupName", this.ruleGroupName);
        jsonWriter.writeArrayField("rules", this.rules, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("description", this.description);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationGatewayFirewallRuleGroup from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationGatewayFirewallRuleGroup if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ApplicationGatewayFirewallRuleGroup.
     */
    public static ApplicationGatewayFirewallRuleGroup fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationGatewayFirewallRuleGroup deserializedApplicationGatewayFirewallRuleGroup
                = new ApplicationGatewayFirewallRuleGroup();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ruleGroupName".equals(fieldName)) {
                    deserializedApplicationGatewayFirewallRuleGroup.ruleGroupName = reader.getString();
                } else if ("rules".equals(fieldName)) {
                    List<ApplicationGatewayFirewallRule> rules
                        = reader.readArray(reader1 -> ApplicationGatewayFirewallRule.fromJson(reader1));
                    deserializedApplicationGatewayFirewallRuleGroup.rules = rules;
                } else if ("description".equals(fieldName)) {
                    deserializedApplicationGatewayFirewallRuleGroup.description = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationGatewayFirewallRuleGroup;
        });
    }
}
