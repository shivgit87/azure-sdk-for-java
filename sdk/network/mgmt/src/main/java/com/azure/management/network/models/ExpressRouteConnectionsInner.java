// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.AsyncPollResponse;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ExpressRouteConnections. */
public final class ExpressRouteConnectionsInner {
    /** The proxy service used to perform REST calls. */
    private final ExpressRouteConnectionsService service;

    /** The service client containing this operation class. */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of ExpressRouteConnectionsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ExpressRouteConnectionsInner(NetworkManagementClientImpl client) {
        this.service =
            RestProxy
                .create(ExpressRouteConnectionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientExpressRouteConnections to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    private interface ExpressRouteConnectionsService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/expressRouteGateways/{expressRouteGatewayName}/expressRouteConnections/{connectionName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("expressRouteGatewayName") String expressRouteGatewayName,
            @PathParam("connectionName") String connectionName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") ExpressRouteConnectionInner putExpressRouteConnectionParameters,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/expressRouteGateways/{expressRouteGatewayName}/expressRouteConnections/{connectionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExpressRouteConnectionInner>> get(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("expressRouteGatewayName") String expressRouteGatewayName,
            @PathParam("connectionName") String connectionName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/expressRouteGateways/{expressRouteGatewayName}/expressRouteConnections/{connectionName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("expressRouteGatewayName") String expressRouteGatewayName,
            @PathParam("connectionName") String connectionName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/expressRouteGateways/{expressRouteGatewayName}/expressRouteConnections")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExpressRouteConnectionListInner>> list(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("expressRouteGatewayName") String expressRouteGatewayName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/expressRouteGateways/{expressRouteGatewayName}/expressRouteConnections/{connectionName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ExpressRouteConnectionInner>> beginCreateOrUpdate(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("expressRouteGatewayName") String expressRouteGatewayName,
            @PathParam("connectionName") String connectionName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") ExpressRouteConnectionInner putExpressRouteConnectionParameters,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/expressRouteGateways/{expressRouteGatewayName}/expressRouteConnections/{connectionName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("expressRouteGatewayName") String expressRouteGatewayName,
            @PathParam("connectionName") String connectionName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);
    }

    /**
     * Creates a connection between an ExpressRoute gateway and an ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @param putExpressRouteConnectionParameters ExpressRouteConnection resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteConnection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String expressRouteGatewayName,
        String connectionName,
        ExpressRouteConnectionInner putExpressRouteConnectionParameters) {
        final String apiVersion = "2019-06-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getHost(),
                            resourceGroupName,
                            expressRouteGatewayName,
                            connectionName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            putExpressRouteConnectionParameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Creates a connection between an ExpressRoute gateway and an ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @param putExpressRouteConnectionParameters ExpressRouteConnection resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteConnection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExpressRouteConnectionInner> createOrUpdateAsync(
        String resourceGroupName,
        String expressRouteGatewayName,
        String connectionName,
        ExpressRouteConnectionInner putExpressRouteConnectionParameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> mono =
            createOrUpdateWithResponseAsync(
                resourceGroupName, expressRouteGatewayName, connectionName, putExpressRouteConnectionParameters);
        return this
            .client
            .<ExpressRouteConnectionInner, ExpressRouteConnectionInner>getLroResultAsync(
                mono,
                this.client.getHttpPipeline(),
                ExpressRouteConnectionInner.class,
                ExpressRouteConnectionInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates a connection between an ExpressRoute gateway and an ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @param putExpressRouteConnectionParameters ExpressRouteConnection resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteConnection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteConnectionInner createOrUpdate(
        String resourceGroupName,
        String expressRouteGatewayName,
        String connectionName,
        ExpressRouteConnectionInner putExpressRouteConnectionParameters) {
        return createOrUpdateAsync(
                resourceGroupName, expressRouteGatewayName, connectionName, putExpressRouteConnectionParameters)
            .block();
    }

    /**
     * Gets the specified ExpressRouteConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the ExpressRoute connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified ExpressRouteConnection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ExpressRouteConnectionInner>> getWithResponseAsync(
        String resourceGroupName, String expressRouteGatewayName, String connectionName) {
        final String apiVersion = "2019-06-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getHost(),
                            resourceGroupName,
                            expressRouteGatewayName,
                            connectionName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the specified ExpressRouteConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the ExpressRoute connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified ExpressRouteConnection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExpressRouteConnectionInner> getAsync(
        String resourceGroupName, String expressRouteGatewayName, String connectionName) {
        return getWithResponseAsync(resourceGroupName, expressRouteGatewayName, connectionName)
            .flatMap(
                (SimpleResponse<ExpressRouteConnectionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the specified ExpressRouteConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the ExpressRoute connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified ExpressRouteConnection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteConnectionInner get(
        String resourceGroupName, String expressRouteGatewayName, String connectionName) {
        return getAsync(resourceGroupName, expressRouteGatewayName, connectionName).block();
    }

    /**
     * Deletes a connection to a ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String expressRouteGatewayName, String connectionName) {
        final String apiVersion = "2019-06-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .delete(
                            this.client.getHost(),
                            resourceGroupName,
                            expressRouteGatewayName,
                            connectionName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Deletes a connection to a ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String expressRouteGatewayName, String connectionName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> mono =
            deleteWithResponseAsync(resourceGroupName, expressRouteGatewayName, connectionName);
        return this
            .client
            .<Void, Void>getLroResultAsync(mono, this.client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes a connection to a ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String expressRouteGatewayName, String connectionName) {
        deleteAsync(resourceGroupName, expressRouteGatewayName, connectionName).block();
    }

    /**
     * Lists ExpressRouteConnections.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteConnection list.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ExpressRouteConnectionListInner>> listWithResponseAsync(
        String resourceGroupName, String expressRouteGatewayName) {
        final String apiVersion = "2019-06-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getHost(),
                            resourceGroupName,
                            expressRouteGatewayName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Lists ExpressRouteConnections.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteConnection list.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExpressRouteConnectionListInner> listAsync(String resourceGroupName, String expressRouteGatewayName) {
        return listWithResponseAsync(resourceGroupName, expressRouteGatewayName)
            .flatMap(
                (SimpleResponse<ExpressRouteConnectionListInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Lists ExpressRouteConnections.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteConnection list.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteConnectionListInner list(String resourceGroupName, String expressRouteGatewayName) {
        return listAsync(resourceGroupName, expressRouteGatewayName).block();
    }

    /**
     * Creates a connection between an ExpressRoute gateway and an ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @param putExpressRouteConnectionParameters ExpressRouteConnection resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteConnection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ExpressRouteConnectionInner>> beginCreateOrUpdateWithResponseAsync(
        String resourceGroupName,
        String expressRouteGatewayName,
        String connectionName,
        ExpressRouteConnectionInner putExpressRouteConnectionParameters) {
        final String apiVersion = "2019-06-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .beginCreateOrUpdate(
                            this.client.getHost(),
                            resourceGroupName,
                            expressRouteGatewayName,
                            connectionName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            putExpressRouteConnectionParameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Creates a connection between an ExpressRoute gateway and an ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @param putExpressRouteConnectionParameters ExpressRouteConnection resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteConnection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExpressRouteConnectionInner> beginCreateOrUpdateAsync(
        String resourceGroupName,
        String expressRouteGatewayName,
        String connectionName,
        ExpressRouteConnectionInner putExpressRouteConnectionParameters) {
        return beginCreateOrUpdateWithResponseAsync(
                resourceGroupName, expressRouteGatewayName, connectionName, putExpressRouteConnectionParameters)
            .flatMap(
                (SimpleResponse<ExpressRouteConnectionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Creates a connection between an ExpressRoute gateway and an ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @param putExpressRouteConnectionParameters ExpressRouteConnection resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteConnection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRouteConnectionInner beginCreateOrUpdate(
        String resourceGroupName,
        String expressRouteGatewayName,
        String connectionName,
        ExpressRouteConnectionInner putExpressRouteConnectionParameters) {
        return beginCreateOrUpdateAsync(
                resourceGroupName, expressRouteGatewayName, connectionName, putExpressRouteConnectionParameters)
            .block();
    }

    /**
     * Deletes a connection to a ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(
        String resourceGroupName, String expressRouteGatewayName, String connectionName) {
        final String apiVersion = "2019-06-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .beginDelete(
                            this.client.getHost(),
                            resourceGroupName,
                            expressRouteGatewayName,
                            connectionName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Deletes a connection to a ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(
        String resourceGroupName, String expressRouteGatewayName, String connectionName) {
        return beginDeleteWithResponseAsync(resourceGroupName, expressRouteGatewayName, connectionName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes a connection to a ExpressRoute circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param expressRouteGatewayName The name of the ExpressRoute gateway.
     * @param connectionName The name of the connection subresource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String expressRouteGatewayName, String connectionName) {
        beginDeleteAsync(resourceGroupName, expressRouteGatewayName, connectionName).block();
    }
}