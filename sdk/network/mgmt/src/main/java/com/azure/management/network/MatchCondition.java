// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The MatchCondition model. */
@Fluent
public final class MatchCondition {
    /*
     * List of match variables.
     */
    @JsonProperty(value = "matchVariables", required = true)
    private List<MatchVariable> matchVariables;

    /*
     * Describes operator to be matched.
     */
    @JsonProperty(value = "operator", required = true)
    private WebApplicationFirewallOperator operator;

    /*
     * Describes if this is negate condition or not.
     */
    @JsonProperty(value = "negationConditon")
    private Boolean negationConditon;

    /*
     * Match value.
     */
    @JsonProperty(value = "matchValues", required = true)
    private List<String> matchValues;

    /*
     * List of transforms.
     */
    @JsonProperty(value = "transforms")
    private List<WebApplicationFirewallTransform> transforms;

    /**
     * Get the matchVariables property: List of match variables.
     *
     * @return the matchVariables value.
     */
    public List<MatchVariable> matchVariables() {
        return this.matchVariables;
    }

    /**
     * Set the matchVariables property: List of match variables.
     *
     * @param matchVariables the matchVariables value to set.
     * @return the MatchCondition object itself.
     */
    public MatchCondition withMatchVariables(List<MatchVariable> matchVariables) {
        this.matchVariables = matchVariables;
        return this;
    }

    /**
     * Get the operator property: Describes operator to be matched.
     *
     * @return the operator value.
     */
    public WebApplicationFirewallOperator operator() {
        return this.operator;
    }

    /**
     * Set the operator property: Describes operator to be matched.
     *
     * @param operator the operator value to set.
     * @return the MatchCondition object itself.
     */
    public MatchCondition withOperator(WebApplicationFirewallOperator operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the negationConditon property: Describes if this is negate condition or not.
     *
     * @return the negationConditon value.
     */
    public Boolean negationConditon() {
        return this.negationConditon;
    }

    /**
     * Set the negationConditon property: Describes if this is negate condition or not.
     *
     * @param negationConditon the negationConditon value to set.
     * @return the MatchCondition object itself.
     */
    public MatchCondition withNegationConditon(Boolean negationConditon) {
        this.negationConditon = negationConditon;
        return this;
    }

    /**
     * Get the matchValues property: Match value.
     *
     * @return the matchValues value.
     */
    public List<String> matchValues() {
        return this.matchValues;
    }

    /**
     * Set the matchValues property: Match value.
     *
     * @param matchValues the matchValues value to set.
     * @return the MatchCondition object itself.
     */
    public MatchCondition withMatchValues(List<String> matchValues) {
        this.matchValues = matchValues;
        return this;
    }

    /**
     * Get the transforms property: List of transforms.
     *
     * @return the transforms value.
     */
    public List<WebApplicationFirewallTransform> transforms() {
        return this.transforms;
    }

    /**
     * Set the transforms property: List of transforms.
     *
     * @param transforms the transforms value to set.
     * @return the MatchCondition object itself.
     */
    public MatchCondition withTransforms(List<WebApplicationFirewallTransform> transforms) {
        this.transforms = transforms;
        return this;
    }
}