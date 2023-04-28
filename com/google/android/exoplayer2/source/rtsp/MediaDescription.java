package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.ImmutableMap;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MediaDescription {
    public static final String MEDIA_TYPE_AUDIO = "audio";
    public static final String MEDIA_TYPE_VIDEO = "video";
    public static final String RTP_AVP_PROFILE = "RTP/AVP";
    public final ImmutableMap<String, String> attributes;
    public final int bitrate;
    @Nullable
    public final String connection;
    @Nullable
    public final String key;
    @Nullable
    public final String mediaTitle;
    public final String mediaType;
    public final int payloadType;
    public final int port;
    public final RtpMapAttribute rtpMapAttribute;
    public final String transportProtocol;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder {
        private final HashMap<String, String> attributes;
        private int bitrate;
        @Nullable
        private String connection;
        @Nullable
        private String key;
        @Nullable
        private String mediaTitle;
        private final String mediaType;
        private final int payloadType;
        private final int port;
        private final String transportProtocol;

        public Builder(String mediaType, int port, String transportProtocol, int payloadType) {
        }

        public static /* synthetic */ String access$100(Builder builder) {
        }

        public static /* synthetic */ int access$200(Builder builder) {
        }

        public static /* synthetic */ String access$300(Builder builder) {
        }

        public static /* synthetic */ int access$400(Builder builder) {
        }

        public static /* synthetic */ String access$500(Builder builder) {
        }

        public static /* synthetic */ String access$600(Builder builder) {
        }

        public static /* synthetic */ int access$700(Builder builder) {
        }

        public static /* synthetic */ String access$800(Builder builder) {
        }

        public Builder addAttribute(String attributeName, String attributeValue) {
        }

        public MediaDescription build() {
        }

        public Builder setBitrate(int bitrate) {
        }

        public Builder setConnection(String connection) {
        }

        public Builder setKey(String key) {
        }

        public Builder setMediaTitle(String mediaTitle) {
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface MediaType {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class RtpMapAttribute {
        public final int clockRate;
        public final int encodingParameters;
        public final String mediaEncoding;
        public final int payloadType;

        private RtpMapAttribute(int payloadType, String mediaEncoding, int clockRate, int encodingParameters) {
        }

        public static RtpMapAttribute parse(String rtpmapString) throws ParserException {
        }

        public boolean equals(@Nullable Object o2) {
        }

        public int hashCode() {
        }
    }

    public /* synthetic */ MediaDescription(Builder builder, ImmutableMap immutableMap, RtpMapAttribute rtpMapAttribute, AnonymousClass1 anonymousClass1) {
    }

    public boolean equals(@Nullable Object o2) {
    }

    public ImmutableMap<String, String> getFmtpParametersAsMap() {
    }

    public int hashCode() {
    }

    private MediaDescription(Builder builder, ImmutableMap<String, String> attributes, RtpMapAttribute rtpMapAttribute) {
    }
}
