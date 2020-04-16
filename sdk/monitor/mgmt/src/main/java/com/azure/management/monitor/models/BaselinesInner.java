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
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.management.monitor.ErrorResponseException;
import com.azure.management.monitor.ResultType;
import java.time.Duration;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Baselines. */
public final class BaselinesInner {
    /** The proxy service used to perform REST calls. */
    private final BaselinesService service;

    /** The service client containing this operation class. */
    private final MonitorClientImpl client;

    /**
     * Initializes an instance of BaselinesInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    BaselinesInner(MonitorClientImpl client) {
        this.service =
            RestProxy.create(BaselinesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorClientBaselines to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorClientBaselin")
    private interface BaselinesService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/{resourceUri}/providers/microsoft.insights/metricBaselines")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<MetricBaselinesResponseInner>> list(
            @HostParam("$host") String host,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri,
            @QueryParam("metricnames") String metricnames,
            @QueryParam("metricnamespace") String metricnamespace,
            @QueryParam("timespan") String timespan,
            @QueryParam("interval") Duration interval,
            @QueryParam("aggregation") String aggregation,
            @QueryParam("sensitivities") String sensitivities,
            @QueryParam("$filter") String filter,
            @QueryParam("resultType") ResultType resultType,
            @QueryParam("api-version") String apiVersion,
            Context context);
    }

    /**
     * **Lists the metric baseline values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param metricnames The names of the metrics (comma separated) to retrieve.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param sensitivities The list of sensitivities (comma separated) to retrieve.
     * @param filter The **$filter** is used to reduce the set of metric data
     *     returned.&lt;br&gt;Example:&lt;br&gt;Metric contains metadata A, B and C.&lt;br&gt;- Return all time series
     *     of C where A = a1 and B = b1 or b2&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ or B eq ‘b2’ and C eq
     *     ‘*’**&lt;br&gt;- Invalid variant:&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ and C eq ‘*’ or B =
     *     ‘b2’**&lt;br&gt;This is invalid because the logical or operator cannot separate two different metadata
     *     names.&lt;br&gt;- Return all time series where A = a1, B = b1 and C = c1:&lt;br&gt;**$filter=A eq ‘a1’ and B
     *     eq ‘b1’ and C eq ‘c1’**&lt;br&gt;- Return all time series where A = a1&lt;br&gt;**$filter=A eq ‘a1’ and B eq
     *     ‘*’ and C eq ‘*’**.
     * @param resultType Allows retrieving only metadata of the baseline. On data request all information is retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of metric baselines.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<SingleMetricBaselineInner>> listSinglePageAsync(
        String resourceUri,
        String metricnames,
        String metricnamespace,
        String timespan,
        Duration interval,
        String aggregation,
        String sensitivities,
        String filter,
        ResultType resultType) {
        final String apiVersion = "2019-03-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getHost(),
                            resourceUri,
                            metricnames,
                            metricnamespace,
                            timespan,
                            interval,
                            aggregation,
                            sensitivities,
                            filter,
                            resultType,
                            apiVersion,
                            context))
            .<PagedResponse<SingleMetricBaselineInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * **Lists the metric baseline values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param metricnames The names of the metrics (comma separated) to retrieve.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param sensitivities The list of sensitivities (comma separated) to retrieve.
     * @param filter The **$filter** is used to reduce the set of metric data
     *     returned.&lt;br&gt;Example:&lt;br&gt;Metric contains metadata A, B and C.&lt;br&gt;- Return all time series
     *     of C where A = a1 and B = b1 or b2&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ or B eq ‘b2’ and C eq
     *     ‘*’**&lt;br&gt;- Invalid variant:&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ and C eq ‘*’ or B =
     *     ‘b2’**&lt;br&gt;This is invalid because the logical or operator cannot separate two different metadata
     *     names.&lt;br&gt;- Return all time series where A = a1, B = b1 and C = c1:&lt;br&gt;**$filter=A eq ‘a1’ and B
     *     eq ‘b1’ and C eq ‘c1’**&lt;br&gt;- Return all time series where A = a1&lt;br&gt;**$filter=A eq ‘a1’ and B eq
     *     ‘*’ and C eq ‘*’**.
     * @param resultType Allows retrieving only metadata of the baseline. On data request all information is retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of metric baselines.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<SingleMetricBaselineInner> listAsync(
        String resourceUri,
        String metricnames,
        String metricnamespace,
        String timespan,
        Duration interval,
        String aggregation,
        String sensitivities,
        String filter,
        ResultType resultType) {
        return new PagedFlux<>(
            () ->
                listSinglePageAsync(
                    resourceUri,
                    metricnames,
                    metricnamespace,
                    timespan,
                    interval,
                    aggregation,
                    sensitivities,
                    filter,
                    resultType));
    }

    /**
     * **Lists the metric baseline values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of metric baselines.
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
        final Context context = null;
        return new PagedFlux<>(
            () ->
                listSinglePageAsync(
                    resourceUri,
                    metricnames,
                    metricnamespace,
                    timespan,
                    interval,
                    aggregation,
                    sensitivities,
                    filter,
                    resultType));
    }

    /**
     * **Lists the metric baseline values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @param metricnames The names of the metrics (comma separated) to retrieve.
     * @param metricnamespace Metric namespace to query metric definitions for.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param aggregation The list of aggregation types (comma separated) to retrieve.
     * @param sensitivities The list of sensitivities (comma separated) to retrieve.
     * @param filter The **$filter** is used to reduce the set of metric data
     *     returned.&lt;br&gt;Example:&lt;br&gt;Metric contains metadata A, B and C.&lt;br&gt;- Return all time series
     *     of C where A = a1 and B = b1 or b2&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ or B eq ‘b2’ and C eq
     *     ‘*’**&lt;br&gt;- Invalid variant:&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ and C eq ‘*’ or B =
     *     ‘b2’**&lt;br&gt;This is invalid because the logical or operator cannot separate two different metadata
     *     names.&lt;br&gt;- Return all time series where A = a1, B = b1 and C = c1:&lt;br&gt;**$filter=A eq ‘a1’ and B
     *     eq ‘b1’ and C eq ‘c1’**&lt;br&gt;- Return all time series where A = a1&lt;br&gt;**$filter=A eq ‘a1’ and B eq
     *     ‘*’ and C eq ‘*’**.
     * @param resultType Allows retrieving only metadata of the baseline. On data request all information is retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of metric baselines.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SingleMetricBaselineInner> list(
        String resourceUri,
        String metricnames,
        String metricnamespace,
        String timespan,
        Duration interval,
        String aggregation,
        String sensitivities,
        String filter,
        ResultType resultType) {
        return new PagedIterable<>(
            listAsync(
                resourceUri,
                metricnames,
                metricnamespace,
                timespan,
                interval,
                aggregation,
                sensitivities,
                filter,
                resultType));
    }

    /**
     * **Lists the metric baseline values for a resource**.
     *
     * @param resourceUri The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of metric baselines.
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
        final Context context = null;
        return new PagedIterable<>(
            listAsync(
                resourceUri,
                metricnames,
                metricnamespace,
                timespan,
                interval,
                aggregation,
                sensitivities,
                filter,
                resultType));
    }
}