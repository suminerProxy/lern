package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.HttpDataSource;

@Deprecated
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DefaultHttpDataSourceFactory extends HttpDataSource.BaseFactory {
    private final boolean allowCrossProtocolRedirects;
    private final int connectTimeoutMillis;
    @Nullable
    private final TransferListener listener;
    private final int readTimeoutMillis;
    @Nullable
    private final String userAgent;

    public DefaultHttpDataSourceFactory() {
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource.BaseFactory
    public /* bridge */ /* synthetic */ HttpDataSource createDataSourceInternal(HttpDataSource.RequestProperties defaultRequestProperties) {
    }

    public DefaultHttpDataSourceFactory(@Nullable String userAgent) {
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource.BaseFactory
    public DefaultHttpDataSource createDataSourceInternal(HttpDataSource.RequestProperties defaultRequestProperties) {
    }

    public DefaultHttpDataSourceFactory(@Nullable String userAgent, @Nullable TransferListener listener) {
    }

    public DefaultHttpDataSourceFactory(@Nullable String userAgent, int connectTimeoutMillis, int readTimeoutMillis, boolean allowCrossProtocolRedirects) {
    }

    public DefaultHttpDataSourceFactory(@Nullable String userAgent, @Nullable TransferListener listener, int connectTimeoutMillis, int readTimeoutMillis, boolean allowCrossProtocolRedirects) {
    }
}
