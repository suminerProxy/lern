package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DefaultDataSource implements DataSource {
    private static final String SCHEME_ANDROID_RESOURCE = "android.resource";
    private static final String SCHEME_ASSET = "asset";
    private static final String SCHEME_CONTENT = "content";
    private static final String SCHEME_DATA = "data";
    private static final String SCHEME_RAW = "rawresource";
    private static final String SCHEME_RTMP = "rtmp";
    private static final String SCHEME_UDP = "udp";
    private static final String TAG = "DefaultDataSource";
    @Nullable
    private DataSource assetDataSource;
    private final DataSource baseDataSource;
    @Nullable
    private DataSource contentDataSource;
    private final Context context;
    @Nullable
    private DataSource dataSchemeDataSource;
    @Nullable
    private DataSource dataSource;
    @Nullable
    private DataSource fileDataSource;
    @Nullable
    private DataSource rawResourceDataSource;
    @Nullable
    private DataSource rtmpDataSource;
    private final List<TransferListener> transferListeners;
    @Nullable
    private DataSource udpDataSource;

    public DefaultDataSource(Context context, boolean allowCrossProtocolRedirects) {
    }

    private void addListenersToDataSource(DataSource dataSource) {
    }

    private DataSource getAssetDataSource() {
    }

    private DataSource getContentDataSource() {
    }

    private DataSource getDataSchemeDataSource() {
    }

    private DataSource getFileDataSource() {
    }

    private DataSource getRawResourceDataSource() {
    }

    private DataSource getRtmpDataSource() {
    }

    private DataSource getUdpDataSource() {
    }

    private void maybeAddListenerToDataSource(@Nullable DataSource dataSource, TransferListener listener) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] buffer, int offset, int length) throws IOException {
    }

    public DefaultDataSource(Context context, @Nullable String userAgent, boolean allowCrossProtocolRedirects) {
    }

    public DefaultDataSource(Context context, @Nullable String userAgent, int connectTimeoutMillis, int readTimeoutMillis, boolean allowCrossProtocolRedirects) {
    }

    public DefaultDataSource(Context context, DataSource baseDataSource) {
    }
}
