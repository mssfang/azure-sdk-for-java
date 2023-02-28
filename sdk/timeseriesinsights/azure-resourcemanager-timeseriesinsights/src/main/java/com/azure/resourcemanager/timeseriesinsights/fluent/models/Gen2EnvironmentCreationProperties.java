// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.timeseriesinsights.models.Gen2StorageConfigurationInput;
import com.azure.resourcemanager.timeseriesinsights.models.TimeSeriesIdProperty;
import com.azure.resourcemanager.timeseriesinsights.models.WarmStoreConfigurationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties used to create a Gen2 environment. */
@Fluent
public final class Gen2EnvironmentCreationProperties {
    /*
     * The list of event properties which will be used to define the environment's time series id.
     */
    @JsonProperty(value = "timeSeriesIdProperties", required = true)
    private List<TimeSeriesIdProperty> timeSeriesIdProperties;

    /*
     * The storage configuration provides the connection details that allows the Time Series Insights service to
     * connect to the customer storage account that is used to store the environment's data.
     */
    @JsonProperty(value = "storageConfiguration", required = true)
    private Gen2StorageConfigurationInput storageConfiguration;

    /*
     * The warm store configuration provides the details to create a warm store cache that will retain a copy of the
     * environment's data available for faster query.
     */
    @JsonProperty(value = "warmStoreConfiguration")
    private WarmStoreConfigurationProperties warmStoreConfiguration;

    /** Creates an instance of Gen2EnvironmentCreationProperties class. */
    public Gen2EnvironmentCreationProperties() {
    }

    /**
     * Get the timeSeriesIdProperties property: The list of event properties which will be used to define the
     * environment's time series id.
     *
     * @return the timeSeriesIdProperties value.
     */
    public List<TimeSeriesIdProperty> timeSeriesIdProperties() {
        return this.timeSeriesIdProperties;
    }

    /**
     * Set the timeSeriesIdProperties property: The list of event properties which will be used to define the
     * environment's time series id.
     *
     * @param timeSeriesIdProperties the timeSeriesIdProperties value to set.
     * @return the Gen2EnvironmentCreationProperties object itself.
     */
    public Gen2EnvironmentCreationProperties withTimeSeriesIdProperties(
        List<TimeSeriesIdProperty> timeSeriesIdProperties) {
        this.timeSeriesIdProperties = timeSeriesIdProperties;
        return this;
    }

    /**
     * Get the storageConfiguration property: The storage configuration provides the connection details that allows the
     * Time Series Insights service to connect to the customer storage account that is used to store the environment's
     * data.
     *
     * @return the storageConfiguration value.
     */
    public Gen2StorageConfigurationInput storageConfiguration() {
        return this.storageConfiguration;
    }

    /**
     * Set the storageConfiguration property: The storage configuration provides the connection details that allows the
     * Time Series Insights service to connect to the customer storage account that is used to store the environment's
     * data.
     *
     * @param storageConfiguration the storageConfiguration value to set.
     * @return the Gen2EnvironmentCreationProperties object itself.
     */
    public Gen2EnvironmentCreationProperties withStorageConfiguration(
        Gen2StorageConfigurationInput storageConfiguration) {
        this.storageConfiguration = storageConfiguration;
        return this;
    }

    /**
     * Get the warmStoreConfiguration property: The warm store configuration provides the details to create a warm store
     * cache that will retain a copy of the environment's data available for faster query.
     *
     * @return the warmStoreConfiguration value.
     */
    public WarmStoreConfigurationProperties warmStoreConfiguration() {
        return this.warmStoreConfiguration;
    }

    /**
     * Set the warmStoreConfiguration property: The warm store configuration provides the details to create a warm store
     * cache that will retain a copy of the environment's data available for faster query.
     *
     * @param warmStoreConfiguration the warmStoreConfiguration value to set.
     * @return the Gen2EnvironmentCreationProperties object itself.
     */
    public Gen2EnvironmentCreationProperties withWarmStoreConfiguration(
        WarmStoreConfigurationProperties warmStoreConfiguration) {
        this.warmStoreConfiguration = warmStoreConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (timeSeriesIdProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property timeSeriesIdProperties in model Gen2EnvironmentCreationProperties"));
        } else {
            timeSeriesIdProperties().forEach(e -> e.validate());
        }
        if (storageConfiguration() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property storageConfiguration in model Gen2EnvironmentCreationProperties"));
        } else {
            storageConfiguration().validate();
        }
        if (warmStoreConfiguration() != null) {
            warmStoreConfiguration().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Gen2EnvironmentCreationProperties.class);
}