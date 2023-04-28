package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.common.base.Predicate;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class DefaultHttpDataSource extends BaseDataSource implements HttpDataSource {
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
    private static final int HTTP_STATUS_PERMANENT_REDIRECT = 308;
    private static final int HTTP_STATUS_TEMPORARY_REDIRECT = 307;
    private static final long MAX_BYTES_TO_DRAIN = 2048;
    private static final int MAX_REDIRECTS = 20;
    private static final String TAG = "DefaultHttpDataSource";
    private final boolean allowCrossProtocolRedirects;
    private long bytesRead;
    private long bytesToRead;
    private final int connectTimeoutMillis;
    @Nullable
    private HttpURLConnection connection;
    @Nullable
    private Predicate<String> contentTypePredicate;
    @Nullable
    private DataSpec dataSpec;
    @Nullable
    private final HttpDataSource.RequestProperties defaultRequestProperties;
    @Nullable
    private InputStream inputStream;
    private final boolean keepPostFor302Redirects;
    private boolean opened;
    private final int readTimeoutMillis;
    private final HttpDataSource.RequestProperties requestProperties;
    private int responseCode;
    @Nullable
    private final String userAgent;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Factory implements HttpDataSource.Factory {
        private boolean allowCrossProtocolRedirects;
        private int connectTimeoutMs;
        @Nullable
        private Predicate<String> contentTypePredicate;
        private final HttpDataSource.RequestProperties defaultRequestProperties;
        private boolean keepPostFor302Redirects;
        private int readTimeoutMs;
        @Nullable
        private TransferListener transferListener;
        @Nullable
        private String userAgent;

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory, com.google.android.exoplayer2.upstream.DataSource.Factory
        public /* bridge */ /* synthetic */ DataSource createDataSource() {
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory
        @Deprecated
        public final HttpDataSource.RequestProperties getDefaultRequestProperties() {
        }

        public Factory setAllowCrossProtocolRedirects(boolean allowCrossProtocolRedirects) {
        }

        public Factory setConnectTimeoutMs(int connectTimeoutMs) {
        }

        public Factory setContentTypePredicate(@Nullable Predicate<String> contentTypePredicate) {
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory
        public /* bridge */ /* synthetic */ HttpDataSource.Factory setDefaultRequestProperties(Map defaultRequestProperties) {
        }

        public Factory setKeepPostFor302Redirects(boolean keepPostFor302Redirects) {
        }

        public Factory setReadTimeoutMs(int readTimeoutMs) {
        }

        public Factory setTransferListener(@Nullable TransferListener transferListener) {
        }

        public Factory setUserAgent(@Nullable String userAgent) {
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory, com.google.android.exoplayer2.upstream.DataSource.Factory
        public /* bridge */ /* synthetic */ HttpDataSource createDataSource() {
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory
        public final Factory setDefaultRequestProperties(Map<String, String> defaultRequestProperties) {
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory, com.google.android.exoplayer2.upstream.DataSource.Factory
        public DefaultHttpDataSource createDataSource() {
        }
    }

    public /* synthetic */ DefaultHttpDataSource(String str, int i2, int i3, boolean z, HttpDataSource.RequestProperties requestProperties, Predicate predicate, boolean z2, AnonymousClass1 anonymousClass1) {
    }

    private void closeConnectionQuietly() {
    }

    private URL handleRedirect(URL originalUrl, @Nullable String location, DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
    }

    private static boolean isCompressed(HttpURLConnection connection) {
    }

    private HttpURLConnection makeConnection(DataSpec dataSpec) throws IOException {
    }

    private static void maybeTerminateInputStream(@Nullable HttpURLConnection connection, long bytesRemaining) {
    }

    private int readInternal(byte[] buffer, int offset, int readLength) throws IOException {
    }

    private void skipFully(long bytesToSkip, DataSpec dataSpec) throws IOException {
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void clearAllRequestProperties() {
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void clearRequestProperty(String name) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws HttpDataSource.HttpDataSourceException {
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public int getResponseCode() {
    }

    @Override // com.google.android.exoplayer2.upstream.BaseDataSource, com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
    }

    @VisibleForTesting
    public HttpURLConnection openConnection(URL url) throws IOException {
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] buffer, int offset, int length) throws HttpDataSource.HttpDataSourceException {
    }

    @Deprecated
    public void setContentTypePredicate(@Nullable Predicate<String> contentTypePredicate) {
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void setRequestProperty(String name, String value) {
    }

    @Deprecated
    public DefaultHttpDataSource() {
    }

    @Deprecated
    public DefaultHttpDataSource(@Nullable String userAgent) {
    }

    @Deprecated
    public DefaultHttpDataSource(@Nullable String userAgent, int connectTimeoutMillis, int readTimeoutMillis) {
    }

    @Deprecated
    public DefaultHttpDataSource(@Nullable String userAgent, int connectTimeoutMillis, int readTimeoutMillis, boolean allowCrossProtocolRedirects, @Nullable HttpDataSource.RequestProperties defaultRequestProperties) {
    }

    private DefaultHttpDataSource(@Nullable String userAgent, int connectTimeoutMillis, int readTimeoutMillis, boolean allowCrossProtocolRedirects, @Nullable HttpDataSource.RequestProperties defaultRequestProperties, @Nullable Predicate<String> contentTypePredicate, boolean keepPostFor302Redirects) {
    }

    private HttpURLConnection makeConnection(URL url, int httpMethod, @Nullable byte[] httpBody, long position, long length, boolean allowGzip, boolean followRedirects, Map<String, String> requestParameters) throws IOException {
    }
}
