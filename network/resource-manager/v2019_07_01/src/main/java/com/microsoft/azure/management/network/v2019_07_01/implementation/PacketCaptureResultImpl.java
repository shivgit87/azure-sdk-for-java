/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_07_01.implementation;

import com.microsoft.azure.management.network.v2019_07_01.PacketCaptureResult;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.network.v2019_07_01.PacketCaptureStorageLocation;
import java.util.List;
import com.microsoft.azure.management.network.v2019_07_01.PacketCaptureFilter;
import com.microsoft.azure.management.network.v2019_07_01.ProvisioningState;
import rx.functions.Func1;

class PacketCaptureResultImpl extends CreatableUpdatableImpl<PacketCaptureResult, PacketCaptureResultInner, PacketCaptureResultImpl> implements PacketCaptureResult, PacketCaptureResult.Definition, PacketCaptureResult.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String networkWatcherName;
    private String packetCaptureName;
    private PacketCaptureInner createOrUpdateParameter;

    PacketCaptureResultImpl(String name, NetworkManager manager) {
        super(name, new PacketCaptureResultInner());
        this.manager = manager;
        // Set resource name
        this.packetCaptureName = name;
        //
        this.createOrUpdateParameter = new PacketCaptureInner();
    }

    PacketCaptureResultImpl(PacketCaptureResultInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.packetCaptureName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.networkWatcherName = IdParsingUtils.getValueFromIdByName(inner.id(), "networkWatchers");
        this.packetCaptureName = IdParsingUtils.getValueFromIdByName(inner.id(), "packetCaptures");
        //
        this.createOrUpdateParameter = new PacketCaptureInner();
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PacketCaptureResult> createResourceAsync() {
        PacketCapturesInner client = this.manager().inner().packetCaptures();
        return client.createAsync(this.resourceGroupName, this.networkWatcherName, this.packetCaptureName, this.createOrUpdateParameter)
            .map(new Func1<PacketCaptureResultInner, PacketCaptureResultInner>() {
               @Override
               public PacketCaptureResultInner call(PacketCaptureResultInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<PacketCaptureResult> updateResourceAsync() {
        PacketCapturesInner client = this.manager().inner().packetCaptures();
        return client.createAsync(this.resourceGroupName, this.networkWatcherName, this.packetCaptureName, this.createOrUpdateParameter)
            .map(new Func1<PacketCaptureResultInner, PacketCaptureResultInner>() {
               @Override
               public PacketCaptureResultInner call(PacketCaptureResultInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PacketCaptureResultInner> getInnerAsync() {
        PacketCapturesInner client = this.manager().inner().packetCaptures();
        return client.getAsync(this.resourceGroupName, this.networkWatcherName, this.packetCaptureName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new PacketCaptureInner();
    }

    @Override
    public Integer bytesToCapturePerPacket() {
        return this.inner().bytesToCapturePerPacket();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public List<PacketCaptureFilter> filters() {
        return this.inner().filters();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public PacketCaptureStorageLocation storageLocation() {
        return this.inner().storageLocation();
    }

    @Override
    public String target() {
        return this.inner().target();
    }

    @Override
    public Integer timeLimitInSeconds() {
        return this.inner().timeLimitInSeconds();
    }

    @Override
    public Integer totalBytesPerSession() {
        return this.inner().totalBytesPerSession();
    }

    @Override
    public PacketCaptureResultImpl withExistingNetworkWatcher(String resourceGroupName, String networkWatcherName) {
        this.resourceGroupName = resourceGroupName;
        this.networkWatcherName = networkWatcherName;
        return this;
    }

    @Override
    public PacketCaptureResultImpl withStorageLocation(PacketCaptureStorageLocation storageLocation) {
        this.createOrUpdateParameter.withStorageLocation(storageLocation);
        return this;
    }

    @Override
    public PacketCaptureResultImpl withTarget(String target) {
        this.createOrUpdateParameter.withTarget(target);
        return this;
    }

    @Override
    public PacketCaptureResultImpl withBytesToCapturePerPacket(Integer bytesToCapturePerPacket) {
        this.createOrUpdateParameter.withBytesToCapturePerPacket(bytesToCapturePerPacket);
        return this;
    }

    @Override
    public PacketCaptureResultImpl withFilters(List<PacketCaptureFilter> filters) {
        this.createOrUpdateParameter.withFilters(filters);
        return this;
    }

    @Override
    public PacketCaptureResultImpl withTimeLimitInSeconds(Integer timeLimitInSeconds) {
        this.createOrUpdateParameter.withTimeLimitInSeconds(timeLimitInSeconds);
        return this;
    }

    @Override
    public PacketCaptureResultImpl withTotalBytesPerSession(Integer totalBytesPerSession) {
        this.createOrUpdateParameter.withTotalBytesPerSession(totalBytesPerSession);
        return this;
    }

}
