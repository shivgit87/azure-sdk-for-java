// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The MatchVariable model.
 */
@Fluent
public final class MatchVariable {
    /*
     * Match Variable.
     */
    @JsonProperty(value = "variableName", required = true)
    private WebApplicationFirewallMatchVariable variableName;

    /*
     * Describes field of the matchVariable collection.
     */
    @JsonProperty(value = "selector")
    private String selector;

    /**
     * Get the variableName property: Match Variable.
     * 
     * @return the variableName value.
     */
    public WebApplicationFirewallMatchVariable variableName() {
        return this.variableName;
    }

    /**
     * Set the variableName property: Match Variable.
     * 
     * @param variableName the variableName value to set.
     * @return the MatchVariable object itself.
     */
    public MatchVariable withVariableName(WebApplicationFirewallMatchVariable variableName) {
        this.variableName = variableName;
        return this;
    }

    /**
     * Get the selector property: Describes field of the matchVariable
     * collection.
     * 
     * @return the selector value.
     */
    public String selector() {
        return this.selector;
    }

    /**
     * Set the selector property: Describes field of the matchVariable
     * collection.
     * 
     * @param selector the selector value to set.
     * @return the MatchVariable object itself.
     */
    public MatchVariable withSelector(String selector) {
        this.selector = selector;
        return this;
    }
}