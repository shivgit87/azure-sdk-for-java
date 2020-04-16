// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ImageListResult model. */
@Fluent
public final class ImageListResultInner {
    /*
     * The list of Images.
     */
    @JsonProperty(value = "value", required = true)
    private List<ImageInner> value;

    /*
     * The uri to fetch the next page of Images. Call ListNext() with this to
     * fetch the next page of Images.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of Images.
     *
     * @return the value value.
     */
    public List<ImageInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of Images.
     *
     * @param value the value value to set.
     * @return the ImageListResultInner object itself.
     */
    public ImageListResultInner withValue(List<ImageInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of Images. Call ListNext() with this to fetch the next
     * page of Images.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of Images. Call ListNext() with this to fetch the next
     * page of Images.
     *
     * @param nextLink the nextLink value to set.
     * @return the ImageListResultInner object itself.
     */
    public ImageListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}