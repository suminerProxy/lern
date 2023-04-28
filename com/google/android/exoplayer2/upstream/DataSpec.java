package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DataSpec {
    public static final int FLAG_ALLOW_CACHE_FRAGMENTATION = 4;
    public static final int FLAG_ALLOW_GZIP = 1;
    public static final int FLAG_DONT_CACHE_IF_LENGTH_UNKNOWN = 2;
    public static final int FLAG_MIGHT_NOT_USE_FULL_NETWORK_SPEED = 8;
    public static final int HTTP_METHOD_GET = 1;
    public static final int HTTP_METHOD_HEAD = 3;
    public static final int HTTP_METHOD_POST = 2;
    @Deprecated
    public final long absoluteStreamPosition;
    @Nullable
    public final Object customData;
    public final int flags;
    @Nullable
    public final byte[] httpBody;
    public final int httpMethod;
    public final Map<String, String> httpRequestHeaders;
    @Nullable
    public final String key;
    public final long length;
    public final long position;
    public final Uri uri;
    public final long uriPositionOffset;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder {
        @Nullable
        private Object customData;
        private int flags;
        @Nullable
        private byte[] httpBody;
        private int httpMethod;
        private Map<String, String> httpRequestHeaders;
        @Nullable
        private String key;
        private long length;
        private long position;
        @Nullable
        private Uri uri;
        private long uriPositionOffset;

        public /* synthetic */ Builder(DataSpec dataSpec, AnonymousClass1 anonymousClass1) {
        }

        public DataSpec build() {
        }

        public Builder setCustomData(@Nullable Object customData) {
        }

        public Builder setFlags(int flags) {
        }

        public Builder setHttpBody(@Nullable byte[] httpBody) {
        }

        public Builder setHttpMethod(int httpMethod) {
        }

        public Builder setHttpRequestHeaders(Map<String, String> httpRequestHeaders) {
        }

        public Builder setKey(@Nullable String key) {
        }

        public Builder setLength(long length) {
        }

        public Builder setPosition(long position) {
        }

        public Builder setUri(String uriString) {
        }

        public Builder setUriPositionOffset(long uriPositionOffset) {
        }

        public Builder() {
        }

        public Builder setUri(Uri uri) {
        }

        private Builder(DataSpec dataSpec) {
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface Flags {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface HttpMethod {
    }

    public /* synthetic */ DataSpec(Uri uri, long j2, int i2, byte[] bArr, Map map, long j3, long j4, String str, int i3, Object obj, AnonymousClass1 anonymousClass1) {
    }

    public static String getStringForHttpMethod(int httpMethod) {
    }

    public Builder buildUpon() {
    }

    public final String getHttpMethodString() {
    }

    public boolean isFlagSet(int flag) {
    }

    public DataSpec subrange(long offset) {
    }

    public String toString() {
    }

    public DataSpec withAdditionalHeaders(Map<String, String> additionalHttpRequestHeaders) {
    }

    public DataSpec withRequestHeaders(Map<String, String> httpRequestHeaders) {
    }

    public DataSpec withUri(Uri uri) {
    }

    public DataSpec(Uri uri) {
    }

    public DataSpec subrange(long offset, long length) {
    }

    public DataSpec(Uri uri, long position, long length) {
    }

    @Deprecated
    public DataSpec(Uri uri, int flags) {
    }

    @Deprecated
    public DataSpec(Uri uri, long position, long length, @Nullable String key) {
    }

    @Deprecated
    public DataSpec(Uri uri, long position, long length, @Nullable String key, int flags) {
    }

    @Deprecated
    public DataSpec(Uri uri, long position, long length, @Nullable String key, int flags, Map<String, String> httpRequestHeaders) {
    }

    @Deprecated
    public DataSpec(Uri uri, long absoluteStreamPosition, long position, long length, @Nullable String key, int flags) {
    }

    @Deprecated
    public DataSpec(Uri uri, @Nullable byte[] postBody, long absoluteStreamPosition, long position, long length, @Nullable String key, int flags) {
    }

    @Deprecated
    public DataSpec(Uri uri, int httpMethod, @Nullable byte[] httpBody, long absoluteStreamPosition, long position, long length, @Nullable String key, int flags) {
    }

    @Deprecated
    public DataSpec(Uri uri, int httpMethod, @Nullable byte[] httpBody, long absoluteStreamPosition, long position, long length, @Nullable String key, int flags, Map<String, String> httpRequestHeaders) {
    }

    private DataSpec(Uri uri, long uriPositionOffset, int httpMethod, @Nullable byte[] httpBody, Map<String, String> httpRequestHeaders, long position, long length, @Nullable String key, int flags, @Nullable Object customData) {
    }
}
