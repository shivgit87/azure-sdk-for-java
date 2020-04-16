// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DataTableResponseObject model. */
@Fluent
public final class DataTableResponseObject {
    /*
     * Name of the table
     */
    @JsonProperty(value = "tableName")
    private String tableName;

    /*
     * List of columns with data types
     */
    @JsonProperty(value = "columns")
    private List<DataTableResponseColumn> columns;

    /*
     * Raw row values
     */
    @JsonProperty(value = "rows")
    private List<List<String>> rows;

    /**
     * Get the tableName property: Name of the table.
     *
     * @return the tableName value.
     */
    public String tableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: Name of the table.
     *
     * @param tableName the tableName value to set.
     * @return the DataTableResponseObject object itself.
     */
    public DataTableResponseObject withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the columns property: List of columns with data types.
     *
     * @return the columns value.
     */
    public List<DataTableResponseColumn> columns() {
        return this.columns;
    }

    /**
     * Set the columns property: List of columns with data types.
     *
     * @param columns the columns value to set.
     * @return the DataTableResponseObject object itself.
     */
    public DataTableResponseObject withColumns(List<DataTableResponseColumn> columns) {
        this.columns = columns;
        return this;
    }

    /**
     * Get the rows property: Raw row values.
     *
     * @return the rows value.
     */
    public List<List<String>> rows() {
        return this.rows;
    }

    /**
     * Set the rows property: Raw row values.
     *
     * @param rows the rows value to set.
     * @return the DataTableResponseObject object itself.
     */
    public DataTableResponseObject withRows(List<List<String>> rows) {
        this.rows = rows;
        return this;
    }
}