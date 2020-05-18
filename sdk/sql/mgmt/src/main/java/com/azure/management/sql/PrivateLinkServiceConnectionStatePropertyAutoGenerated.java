// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PrivateLinkServiceConnectionStatePropertyAutoGenerated model. */
@Fluent
public final class PrivateLinkServiceConnectionStatePropertyAutoGenerated {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(PrivateLinkServiceConnectionStatePropertyAutoGenerated.class);

    /*
     * The private link service connection status.
     */
    @JsonProperty(value = "status", required = true)
    private PrivateLinkServiceConnectionStateStatus status;

    /*
     * The private link service connection description.
     */
    @JsonProperty(value = "description", required = true)
    private String description;

    /*
     * The actions required for private link service connection.
     */
    @JsonProperty(value = "actionsRequired", access = JsonProperty.Access.WRITE_ONLY)
    private PrivateLinkServiceConnectionStateActionsRequire actionsRequired;

    /**
     * Get the status property: The private link service connection status.
     *
     * @return the status value.
     */
    public PrivateLinkServiceConnectionStateStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The private link service connection status.
     *
     * @param status the status value to set.
     * @return the PrivateLinkServiceConnectionStatePropertyAutoGenerated object itself.
     */
    public PrivateLinkServiceConnectionStatePropertyAutoGenerated withStatus(
        PrivateLinkServiceConnectionStateStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the description property: The private link service connection description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The private link service connection description.
     *
     * @param description the description value to set.
     * @return the PrivateLinkServiceConnectionStatePropertyAutoGenerated object itself.
     */
    public PrivateLinkServiceConnectionStatePropertyAutoGenerated withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the actionsRequired property: The actions required for private link service connection.
     *
     * @return the actionsRequired value.
     */
    public PrivateLinkServiceConnectionStateActionsRequire actionsRequired() {
        return this.actionsRequired;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property status"
                            + " in model PrivateLinkServiceConnectionStatePropertyAutoGenerated"));
        }
        if (description() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property description"
                            + " in model PrivateLinkServiceConnectionStatePropertyAutoGenerated"));
        }
    }
}