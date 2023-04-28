package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.common.base.Predicate;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface HttpDataSource extends DataSource {
    public static final Predicate<String> REJECT_PAYWALL_TYPES = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static abstract class BaseFactory implements Factory {
        private final RequestProperties defaultRequestProperties;

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory, com.google.android.exoplayer2.upstream.DataSource.Factory
        public /* bridge */ /* synthetic */ DataSource createDataSource() {
        }

        public abstract HttpDataSource createDataSourceInternal(RequestProperties defaultRequestProperties);

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory
        @Deprecated
        public final RequestProperties getDefaultRequestProperties() {
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory
        public final Factory setDefaultRequestProperties(Map<String, String> defaultRequestProperties) {
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory, com.google.android.exoplayer2.upstream.DataSource.Factory
        public final HttpDataSource createDataSource() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class CleartextNotPermittedException extends HttpDataSourceException {
        public CleartextNotPermittedException(IOException cause, DataSpec dataSpec) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Factory extends DataSource.Factory {
        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        /* bridge */ /* synthetic */ DataSource createDataSource();

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        HttpDataSource createDataSource();

        @Deprecated
        RequestProperties getDefaultRequestProperties();

        Factory setDefaultRequestProperties(Map<String, String> defaultRequestProperties);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class HttpDataSourceException extends DataSourceException {
        public static final int TYPE_CLOSE = 3;
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_READ = 2;
        public final DataSpec dataSpec;
        public final int type;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public @interface Type {
        }

        @Deprecated
        public HttpDataSourceException(DataSpec dataSpec, int type) {
        }

        private static int assignErrorCode(int errorCode, int type) {
        }

        public static HttpDataSourceException createForIOException(IOException cause, DataSpec dataSpec, int type) {
        }

        public HttpDataSourceException(DataSpec dataSpec, int errorCode, int type) {
        }

        @Deprecated
        public HttpDataSourceException(String message, DataSpec dataSpec, int type) {
        }

        public HttpDataSourceException(String message, DataSpec dataSpec, int errorCode, int type) {
        }

        @Deprecated
        public HttpDataSourceException(IOException cause, DataSpec dataSpec, int type) {
        }

        public HttpDataSourceException(IOException cause, DataSpec dataSpec, int errorCode, int type) {
        }

        @Deprecated
        public HttpDataSourceException(String message, IOException cause, DataSpec dataSpec, int type) {
        }

        public HttpDataSourceException(String message, @Nullable IOException cause, DataSpec dataSpec, int errorCode, int type) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class InvalidContentTypeException extends HttpDataSourceException {
        public final String contentType;

        public InvalidContentTypeException(String contentType, DataSpec dataSpec) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class InvalidResponseCodeException extends HttpDataSourceException {
        public final Map<String, List<String>> headerFields;
        public final byte[] responseBody;
        public final int responseCode;
        @Nullable
        public final String responseMessage;

        @Deprecated
        public InvalidResponseCodeException(int responseCode, Map<String, List<String>> headerFields, DataSpec dataSpec) {
        }

        @Deprecated
        public InvalidResponseCodeException(int responseCode, @Nullable String responseMessage, Map<String, List<String>> headerFields, DataSpec dataSpec) {
        }

        public InvalidResponseCodeException(int responseCode, @Nullable String responseMessage, @Nullable IOException cause, Map<String, List<String>> headerFields, DataSpec dataSpec, byte[] responseBody) {
        }
    }

    void clearAllRequestProperties();

    void clearRequestProperty(String name);

    @Override // com.google.android.exoplayer2.upstream.DataSource
    void close() throws HttpDataSourceException;

    int getResponseCode();

    @Override // com.google.android.exoplayer2.upstream.DataSource
    Map<String, List<String>> getResponseHeaders();

    @Override // com.google.android.exoplayer2.upstream.DataSource
    long open(DataSpec dataSpec) throws HttpDataSourceException;

    @Override // com.google.android.exoplayer2.upstream.DataReader
    int read(byte[] buffer, int offset, int length) throws HttpDataSourceException;

    void setRequestProperty(String name, String value);

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class RequestProperties {
        private final Map<String, String> requestProperties;
        @Nullable
        private Map<String, String> requestPropertiesSnapshot;

        public synchronized void clear() {
        }

        public synchronized void clearAndSet(Map<String, String> properties) {
        }

        public synchronized Map<String, String> getSnapshot() {
        }

        public synchronized void remove(String name) {
        }

        public synchronized void set(String name, String value) {
        }

        public synchronized void set(Map<String, String> properties) {
        }
    }
}
