package com.azure.ai.formrecognizer.training.models;

import java.time.Duration;

public class CreateCompositeModelOptions {
    private String displayName;

    private static final Duration DEFAULT_POLL_INTERVAL = Duration.ofSeconds(5);
    private Duration pollInterval = DEFAULT_POLL_INTERVAL;

    public String getDisplayName() {
        return displayName;
    }

    public CreateCompositeModelOptions setDisplayName(final String displayName) {
        this.displayName = displayName;
        return this;
    }

    public Duration getPollInterval() {
        return pollInterval;
    }

    public CreateCompositeModelOptions setPollInterval(final Duration pollInterval) {
        this.pollInterval = pollInterval;
        return this;
    }
}
