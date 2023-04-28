package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class RtspHeaders {
    public static final String ACCEPT = "Accept";
    public static final String ALLOW = "Allow";
    public static final String AUTHORIZATION = "Authorization";
    public static final String BANDWIDTH = "Bandwidth";
    public static final String BLOCKSIZE = "Blocksize";
    public static final String CACHE_CONTROL = "Cache-Control";
    public static final String CONNECTION = "Connection";
    public static final String CONTENT_BASE = "Content-Base";
    public static final String CONTENT_ENCODING = "Content-Encoding";
    public static final String CONTENT_LANGUAGE = "Content-Language";
    public static final String CONTENT_LENGTH = "Content-Length";
    public static final String CONTENT_LOCATION = "Content-Location";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String CSEQ = "CSeq";
    public static final String DATE = "Date";
    public static final RtspHeaders EMPTY = null;
    public static final String EXPIRES = "Expires";
    public static final String PROXY_AUTHENTICATE = "Proxy-Authenticate";
    public static final String PROXY_REQUIRE = "Proxy-Require";
    public static final String PUBLIC = "Public";
    public static final String RANGE = "Range";
    public static final String RTCP_INTERVAL = "RTCP-Interval";
    public static final String RTP_INFO = "RTP-Info";
    public static final String SCALE = "Scale";
    public static final String SESSION = "Session";
    public static final String SPEED = "Speed";
    public static final String SUPPORTED = "Supported";
    public static final String TIMESTAMP = "Timestamp";
    public static final String TRANSPORT = "Transport";
    public static final String USER_AGENT = "User-Agent";
    public static final String VIA = "Via";
    public static final String WWW_AUTHENTICATE = "WWW-Authenticate";
    private final ImmutableListMultimap<String, String> namesAndValues;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder {
        private final ImmutableListMultimap.Builder<String, String> namesAndValuesBuilder;

        public /* synthetic */ Builder(ImmutableListMultimap.Builder builder, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ ImmutableListMultimap.Builder access$300(Builder builder) {
        }

        public Builder add(String headerName, String headerValue) {
        }

        public Builder addAll(List<String> headers) {
        }

        public RtspHeaders build() {
        }

        public Builder() {
        }

        private Builder(ImmutableListMultimap.Builder<String, String> namesAndValuesBuilder) {
        }

        public Builder addAll(Map<String, String> headers) {
        }
    }

    public /* synthetic */ RtspHeaders(Builder builder, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ String access$000(String str) {
    }

    private static String convertToStandardHeaderName(String messageHeaderName) {
    }

    public ImmutableListMultimap<String, String> asMultiMap() {
    }

    public Builder buildUpon() {
    }

    public boolean equals(@Nullable Object obj) {
    }

    @Nullable
    public String get(String headerName) {
    }

    public int hashCode() {
    }

    public ImmutableList<String> values(String headerName) {
    }

    private RtspHeaders(Builder builder) {
    }
}
