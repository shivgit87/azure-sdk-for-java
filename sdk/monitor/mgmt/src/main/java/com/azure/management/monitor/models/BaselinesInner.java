// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.management.monitor.ErrorResponseException;
import com.azure.management.monitor.ResultType;
import java.time.Duration;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Baselines.
 */
public final class BaselinesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private BaselinesService service;

    /**
     * The service client containing this operation class.
     */
    private MonitorClientImpl client;

    /**
     * Initializes an instance of BaselinesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    BaselinesInner(MonitorClientImpl client) {
        this.service = RestProxy.create(BaselinesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorClientBaselines to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorClientBaselines")
    private interface BaselinesService {
        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/{resourceUri}/providers/microsoft.insights/metricBaselines")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<MetricBaselinesResponseInner>> list(@HostParam("$host") String host, @PathParam(value = "resourceUri", encoded = true) String resourceUri, @QueryParam("metricnames") String metricnames, @QueryParam("metricnamespace") String metricnamespace, @QueryParam("timespan") String timespan, @QueryParam("interval") Duration interval, @QueryParam("aggregation") String aggregation, @QueryParam("sensitivities") String sensitivities, @QueryParam("$filter") String filter, @QueryParam("resultType") ResultType resultType, @QueryParam("api-version") String apiVersion);
    }

    /**
     * **Lists the metric baseline values for a resource**.
     * 
     * @param resourceUri 
     * @param metricnames 
     * @param metricnamespace 
     * @param timespan 
     * @param interval 
     * @param aggregation 
     * @param sensitivities 
     * @param filter 
     * @param resultType 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<SingleMetricBaselineInner>> listSinglePageAsync(String resourceUri, String metricnames, String metricnamespace, String timespan, Duration interval, String aggregation, String sensitivities, String filter, ResultType resultType) {
        final String apiVersion = "2019-03-01";
        return service.list(this.client.getHost(), resourceUri, metricnames, metricnamespace, timespan, interval, aggregation, sensitivities, filter, resultType, apiVersion)
            .map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                null,
                null));
    }

    /**
     * **Lists the metric baseline values for a resource**.
     * 
     * @param resourceUri 
     * @param metricnames 
     * @param metricnamespace 
     * @param timespan 
     * @param interval 
     * @param aggregation 
     * @param sensitivities 
     * @param filter 
     * @param resultType 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SingleMetricBaselineInner> listAsync(String resourceUri, String metricnames, String metricnamespace, String timespan, Duration interval, String aggregation, String sensitivities, String filter, ResultType resultType) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceUri, metricnames, metricnamespace, timespan, interval, aggregation, sensitivities, filter, resultType));
    }

    /**
     * **Lists the metric baseline values for a resource**.
     * 
     * @param resourceUri 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SingleMetricBaselineInner> listAsync(String resourceUri) {
        final String metricnames = null;
        final String metricnamespace = null;
        final String timespan = null;
        final Duration interval = null;
        final String aggregation = null;
        final String sensitivities = null;
        final String filter = null;
        final ResultType resultType = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceUri, metricnames, metricnamespace, timespan, interval, aggregation, sensitivities, filter, resultType));
    }

    /**
     * **Lists the metric baseline values for a resource**.
     * 
     * @param resourceUri 
     * @param metricnames 
     * @param metricnamespace 
     * @param timespan 
     * @param interval 
     * @param aggregation 
     * @param sensitivities 
     * @param filter 
     * @param resultType 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SingleMetricBaselineInner> list(String resourceUri, String metricnames, String metricnamespace, String timespan, Duration interval, String aggregation, String sensitivities, String filter, ResultType resultType) {
        return new PagedIterable<>(listAsync(resourceUri, metricnames, metricnamespace, timespan, interval, aggregation, sensitivities, filter, resultType));
    }

    /**
     * **Lists the metric baseline values for a resource**.
     * 
     * @param resourceUri 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SingleMetricBaselineInner> list(String resourceUri) {
        final String metricnames = null;
        final String metricnamespace = null;
        final String timespan = null;
        final Duration interval = null;
        final String aggregation = null;
        final String sensitivities = null;
        final String filter = null;
        final ResultType resultType = null;
        return new PagedIterable<>(listAsync(resourceUri, metricnames, metricnamespace, timespan, interval, aggregation, sensitivities, filter, resultType));
    }
}