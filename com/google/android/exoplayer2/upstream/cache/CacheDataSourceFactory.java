package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;

@Deprecated
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class CacheDataSourceFactory implements DataSource.Factory {
    private final Cache cache;
    @Nullable
    private final CacheKeyFactory cacheKeyFactory;
    private final DataSource.Factory cacheReadDataSourceFactory;
    @Nullable
    private final DataSink.Factory cacheWriteDataSinkFactory;
    @Nullable
    private final CacheDataSource.EventListener eventListener;
    private final int flags;
    private final DataSource.Factory upstreamFactory;

    public CacheDataSourceFactory(Cache cache, DataSource.Factory upstreamFactory) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public /* bridge */ /* synthetic */ DataSource createDataSource() {
    }

    public CacheDataSourceFactory(Cache cache, DataSource.Factory upstreamFactory, int flags) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public CacheDataSource createDataSource() {
    }

    public CacheDataSourceFactory(Cache cache, DataSource.Factory upstreamFactory, DataSource.Factory cacheReadDataSourceFactory, @Nullable DataSink.Factory cacheWriteDataSinkFactory, int flags, @Nullable CacheDataSource.EventListener eventListener) {
    }

    public CacheDataSourceFactory(Cache cache, DataSource.Factory upstreamFactory, DataSource.Factory cacheReadDataSourceFactory, @Nullable DataSink.Factory cacheWriteDataSinkFactory, int flags, @Nullable CacheDataSource.EventListener eventListener, @Nullable CacheKeyFactory cacheKeyFactory) {
    }
}
