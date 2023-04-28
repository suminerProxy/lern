package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SessionDescription {
    public static final String ATTR_CONTROL = "control";
    public static final String ATTR_FMTP = "fmtp";
    public static final String ATTR_LENGTH = "length";
    public static final String ATTR_RANGE = "range";
    public static final String ATTR_RTPMAP = "rtpmap";
    public static final String ATTR_TOOL = "tool";
    public static final String ATTR_TYPE = "type";
    public static final String SUPPORTED_SDP_VERSION = "0";
    public final ImmutableMap<String, String> attributes;
    public final int bitrate;
    @Nullable
    public final String connection;
    @Nullable
    public final String emailAddress;
    @Nullable
    public final String key;
    public final ImmutableList<MediaDescription> mediaDescriptionList;
    public final String origin;
    @Nullable
    public final String phoneNumber;
    @Nullable
    public final String sessionInfo;
    public final String sessionName;
    public final String timing;
    @Nullable
    public final Uri uri;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder {
        private final HashMap<String, String> attributes;
        private int bitrate;
        @Nullable
        private String connection;
        @Nullable
        private String emailAddress;
        @Nullable
        private String key;
        private final ImmutableList.Builder<MediaDescription> mediaDescriptionListBuilder;
        @Nullable
        private String origin;
        @Nullable
        private String phoneNumber;
        @Nullable
        private String sessionInfo;
        @Nullable
        private String sessionName;
        @Nullable
        private String timing;
        @Nullable
        private Uri uri;

        public static /* synthetic */ HashMap access$100(Builder builder) {
        }

        public static /* synthetic */ String access$1000(Builder builder) {
        }

        public static /* synthetic */ String access$1100(Builder builder) {
        }

        public static /* synthetic */ String access$1200(Builder builder) {
        }

        public static /* synthetic */ ImmutableList.Builder access$200(Builder builder) {
        }

        public static /* synthetic */ String access$300(Builder builder) {
        }

        public static /* synthetic */ String access$400(Builder builder) {
        }

        public static /* synthetic */ String access$500(Builder builder) {
        }

        public static /* synthetic */ Uri access$600(Builder builder) {
        }

        public static /* synthetic */ String access$700(Builder builder) {
        }

        public static /* synthetic */ int access$800(Builder builder) {
        }

        public static /* synthetic */ String access$900(Builder builder) {
        }

        public Builder addAttribute(String attributeName, String attributeValue) {
        }

        public Builder addMediaDescription(MediaDescription mediaDescription) {
        }

        public SessionDescription build() {
        }

        public Builder setBitrate(int bitrate) {
        }

        public Builder setConnection(String connection) {
        }

        public Builder setEmailAddress(String emailAddress) {
        }

        public Builder setKey(String key) {
        }

        public Builder setOrigin(String origin) {
        }

        public Builder setPhoneNumber(String phoneNumber) {
        }

        public Builder setSessionInfo(String sessionInfo) {
        }

        public Builder setSessionName(String sessionName) {
        }

        public Builder setTiming(String timing) {
        }

        public Builder setUri(Uri uri) {
        }
    }

    public /* synthetic */ SessionDescription(Builder builder, AnonymousClass1 anonymousClass1) {
    }

    public boolean equals(@Nullable Object o2) {
    }

    public int hashCode() {
    }

    private SessionDescription(Builder builder) {
    }
}
