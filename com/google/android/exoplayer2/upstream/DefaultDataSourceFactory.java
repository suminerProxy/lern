package com.google.android.exoplayer2.upstream;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DefaultDataSourceFactory implements DataSource.Factory {
    private final DataSource.Factory baseDataSourceFactory;
    private final Context context;
    @Nullable
    private final TransferListener listener;

    public DefaultDataSourceFactory(Context context) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public /* bridge */ /* synthetic */ DataSource createDataSource() {
    }

    public DefaultDataSourceFactory(Context context, @Nullable String userAgent) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public DefaultDataSource createDataSource() {
    }

    public DefaultDataSourceFactory(Context context, @Nullable String userAgent, @Nullable TransferListener listener) {
    }

    public DefaultDataSourceFactory(Context context, DataSource.Factory baseDataSourceFactory) {
    }

    public DefaultDataSourceFactory(Context context, @Nullable TransferListener listener, DataSource.Factory baseDataSourceFactory) {
    }
}
