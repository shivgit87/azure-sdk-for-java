// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RoleAssignmentListResult model. */
@Fluent
public final class RoleAssignmentListResultInner {
    /*
     * Role assignment list.
     */
    @JsonProperty(value = "value")
    private List<RoleAssignmentInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Role assignment list.
     *
     * @return the value value.
     */
    public List<RoleAssignmentInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Role assignment list.
     *
     * @param value the value value to set.
     * @return the RoleAssignmentListResultInner object itself.
     */
    public RoleAssignmentListResultInner withValue(List<RoleAssignmentInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to use for getting the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the RoleAssignmentListResultInner object itself.
     */
    public RoleAssignmentListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}