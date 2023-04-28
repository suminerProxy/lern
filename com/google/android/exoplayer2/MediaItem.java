package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MediaItem implements Bundleable {
    public static final Bundleable.Creator<MediaItem> CREATOR = null;
    public static final String DEFAULT_MEDIA_ID = "";
    public static final MediaItem EMPTY = null;
    private static final int FIELD_CLIPPING_PROPERTIES = 3;
    private static final int FIELD_LIVE_CONFIGURATION = 1;
    private static final int FIELD_MEDIA_ID = 0;
    private static final int FIELD_MEDIA_METADATA = 2;
    public final ClippingProperties clippingProperties;
    public final LiveConfiguration liveConfiguration;
    public final String mediaId;
    public final MediaMetadata mediaMetadata;
    @Nullable
    public final PlaybackProperties playbackProperties;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class AdsConfiguration {
        public final Uri adTagUri;
        @Nullable
        public final Object adsId;

        public /* synthetic */ AdsConfiguration(Uri uri, Object obj, AnonymousClass1 anonymousClass1) {
        }

        public boolean equals(@Nullable Object obj) {
        }

        public int hashCode() {
        }

        private AdsConfiguration(Uri adTagUri, @Nullable Object adsId) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Builder {
        @Nullable
        private Uri adTagUri;
        @Nullable
        private Object adsId;
        private long clipEndPositionMs;
        private boolean clipRelativeToDefaultPosition;
        private boolean clipRelativeToLiveWindow;
        private long clipStartPositionMs;
        private boolean clipStartsAtKeyFrame;
        @Nullable
        private String customCacheKey;
        private boolean drmForceDefaultLicenseUri;
        @Nullable
        private byte[] drmKeySetId;
        private Map<String, String> drmLicenseRequestHeaders;
        @Nullable
        private Uri drmLicenseUri;
        private boolean drmMultiSession;
        private boolean drmPlayClearContentWithoutKey;
        private List<Integer> drmSessionForClearTypes;
        @Nullable
        private UUID drmUuid;
        private long liveMaxOffsetMs;
        private float liveMaxPlaybackSpeed;
        private long liveMinOffsetMs;
        private float liveMinPlaybackSpeed;
        private long liveTargetOffsetMs;
        @Nullable
        private String mediaId;
        @Nullable
        private MediaMetadata mediaMetadata;
        @Nullable
        private String mimeType;
        private List<StreamKey> streamKeys;
        private List<Subtitle> subtitles;
        @Nullable
        private Object tag;
        @Nullable
        private Uri uri;

        public /* synthetic */ Builder(MediaItem mediaItem, AnonymousClass1 anonymousClass1) {
        }

        public MediaItem build() {
        }

        public Builder setAdTagUri(@Nullable String adTagUri) {
        }

        public Builder setClipEndPositionMs(long endPositionMs) {
        }

        public Builder setClipRelativeToDefaultPosition(boolean relativeToDefaultPosition) {
        }

        public Builder setClipRelativeToLiveWindow(boolean relativeToLiveWindow) {
        }

        public Builder setClipStartPositionMs(long startPositionMs) {
        }

        public Builder setClipStartsAtKeyFrame(boolean startsAtKeyFrame) {
        }

        public Builder setCustomCacheKey(@Nullable String customCacheKey) {
        }

        public Builder setDrmForceDefaultLicenseUri(boolean forceDefaultLicenseUri) {
        }

        public Builder setDrmKeySetId(@Nullable byte[] keySetId) {
        }

        public Builder setDrmLicenseRequestHeaders(@Nullable Map<String, String> licenseRequestHeaders) {
        }

        public Builder setDrmLicenseUri(@Nullable Uri licenseUri) {
        }

        public Builder setDrmMultiSession(boolean multiSession) {
        }

        public Builder setDrmPlayClearContentWithoutKey(boolean playClearContentWithoutKey) {
        }

        public Builder setDrmSessionForClearPeriods(boolean sessionForClearPeriods) {
        }

        public Builder setDrmSessionForClearTypes(@Nullable List<Integer> sessionForClearTypes) {
        }

        public Builder setDrmUuid(@Nullable UUID uuid) {
        }

        public Builder setLiveMaxOffsetMs(long liveMaxOffsetMs) {
        }

        public Builder setLiveMaxPlaybackSpeed(float maxPlaybackSpeed) {
        }

        public Builder setLiveMinOffsetMs(long liveMinOffsetMs) {
        }

        public Builder setLiveMinPlaybackSpeed(float minPlaybackSpeed) {
        }

        public Builder setLiveTargetOffsetMs(long liveTargetOffsetMs) {
        }

        public Builder setMediaId(String mediaId) {
        }

        public Builder setMediaMetadata(MediaMetadata mediaMetadata) {
        }

        public Builder setMimeType(@Nullable String mimeType) {
        }

        public Builder setStreamKeys(@Nullable List<StreamKey> streamKeys) {
        }

        public Builder setSubtitles(@Nullable List<Subtitle> subtitles) {
        }

        public Builder setTag(@Nullable Object tag) {
        }

        public Builder setUri(@Nullable String uri) {
        }

        public Builder() {
        }

        public Builder setAdTagUri(@Nullable Uri adTagUri) {
        }

        public Builder setDrmLicenseUri(@Nullable String licenseUri) {
        }

        public Builder setUri(@Nullable Uri uri) {
        }

        public Builder setAdTagUri(@Nullable Uri adTagUri, @Nullable Object adsId) {
        }

        private Builder(MediaItem mediaItem) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ClippingProperties implements Bundleable {
        public static final Bundleable.Creator<ClippingProperties> CREATOR = null;
        private static final int FIELD_END_POSITION_MS = 1;
        private static final int FIELD_RELATIVE_TO_DEFAULT_POSITION = 3;
        private static final int FIELD_RELATIVE_TO_LIVE_WINDOW = 2;
        private static final int FIELD_STARTS_AT_KEY_FRAME = 4;
        private static final int FIELD_START_POSITION_MS = 0;
        public final long endPositionMs;
        public final boolean relativeToDefaultPosition;
        public final boolean relativeToLiveWindow;
        public final long startPositionMs;
        public final boolean startsAtKeyFrame;

        public /* synthetic */ ClippingProperties(long j2, long j3, boolean z, boolean z2, boolean z3, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ ClippingProperties a(Bundle bundle) {
        }

        private static String keyForField(int field) {
        }

        public boolean equals(@Nullable Object obj) {
        }

        public int hashCode() {
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
        }

        private ClippingProperties(long startPositionMs, long endPositionMs, boolean relativeToLiveWindow, boolean relativeToDefaultPosition, boolean startsAtKeyFrame) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class DrmConfiguration {
        public final boolean forceDefaultLicenseUri;
        @Nullable
        private final byte[] keySetId;
        @Nullable
        public final Uri licenseUri;
        public final boolean multiSession;
        public final boolean playClearContentWithoutKey;
        public final Map<String, String> requestHeaders;
        public final List<Integer> sessionForClearTypes;
        public final UUID uuid;

        public /* synthetic */ DrmConfiguration(UUID uuid, Uri uri, Map map, boolean z, boolean z2, boolean z3, List list, byte[] bArr, AnonymousClass1 anonymousClass1) {
        }

        public boolean equals(@Nullable Object obj) {
        }

        @Nullable
        public byte[] getKeySetId() {
        }

        public int hashCode() {
        }

        private DrmConfiguration(UUID uuid, @Nullable Uri licenseUri, Map<String, String> requestHeaders, boolean multiSession, boolean forceDefaultLicenseUri, boolean playClearContentWithoutKey, List<Integer> drmSessionForClearTypes, @Nullable byte[] keySetId) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class LiveConfiguration implements Bundleable {
        public static final Bundleable.Creator<LiveConfiguration> CREATOR = null;
        private static final int FIELD_MAX_OFFSET_MS = 2;
        private static final int FIELD_MAX_PLAYBACK_SPEED = 4;
        private static final int FIELD_MIN_OFFSET_MS = 1;
        private static final int FIELD_MIN_PLAYBACK_SPEED = 3;
        private static final int FIELD_TARGET_OFFSET_MS = 0;
        public static final LiveConfiguration UNSET = null;
        public final long maxOffsetMs;
        public final float maxPlaybackSpeed;
        public final long minOffsetMs;
        public final float minPlaybackSpeed;
        public final long targetOffsetMs;

        public LiveConfiguration(long targetOffsetMs, long minOffsetMs, long maxOffsetMs, float minPlaybackSpeed, float maxPlaybackSpeed) {
        }

        public static /* synthetic */ LiveConfiguration a(Bundle bundle) {
        }

        private static String keyForField(int field) {
        }

        public boolean equals(@Nullable Object obj) {
        }

        public int hashCode() {
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class PlaybackProperties {
        @Nullable
        public final AdsConfiguration adsConfiguration;
        @Nullable
        public final String customCacheKey;
        @Nullable
        public final DrmConfiguration drmConfiguration;
        @Nullable
        public final String mimeType;
        public final List<StreamKey> streamKeys;
        public final List<Subtitle> subtitles;
        @Nullable
        public final Object tag;
        public final Uri uri;

        public /* synthetic */ PlaybackProperties(Uri uri, String str, DrmConfiguration drmConfiguration, AdsConfiguration adsConfiguration, List list, String str2, List list2, Object obj, AnonymousClass1 anonymousClass1) {
        }

        public boolean equals(@Nullable Object obj) {
        }

        public int hashCode() {
        }

        private PlaybackProperties(Uri uri, @Nullable String mimeType, @Nullable DrmConfiguration drmConfiguration, @Nullable AdsConfiguration adsConfiguration, List<StreamKey> streamKeys, @Nullable String customCacheKey, List<Subtitle> subtitles, @Nullable Object tag) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Subtitle {
        @Nullable
        public final String label;
        @Nullable
        public final String language;
        public final String mimeType;
        public final int roleFlags;
        public final int selectionFlags;
        public final Uri uri;

        public Subtitle(Uri uri, String mimeType, @Nullable String language) {
        }

        public boolean equals(@Nullable Object obj) {
        }

        public int hashCode() {
        }

        public Subtitle(Uri uri, String mimeType, @Nullable String language, int selectionFlags) {
        }

        public Subtitle(Uri uri, String mimeType, @Nullable String language, int selectionFlags, int roleFlags, @Nullable String label) {
        }
    }

    public /* synthetic */ MediaItem(String str, ClippingProperties clippingProperties, PlaybackProperties playbackProperties, LiveConfiguration liveConfiguration, MediaMetadata mediaMetadata, AnonymousClass1 anonymousClass1) {
    }

    public static /* synthetic */ MediaItem a(Bundle bundle) {
    }

    private static MediaItem fromBundle(Bundle bundle) {
    }

    public static MediaItem fromUri(String uri) {
    }

    private static String keyForField(int field) {
    }

    public Builder buildUpon() {
    }

    public boolean equals(@Nullable Object obj) {
    }

    public int hashCode() {
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
    }

    private MediaItem(String mediaId, ClippingProperties clippingProperties, @Nullable PlaybackProperties playbackProperties, LiveConfiguration liveConfiguration, MediaMetadata mediaMetadata) {
    }

    public static MediaItem fromUri(Uri uri) {
    }
}
