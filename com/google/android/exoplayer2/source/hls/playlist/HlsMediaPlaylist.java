package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class HlsMediaPlaylist extends HlsPlaylist {
    public static final int PLAYLIST_TYPE_EVENT = 2;
    public static final int PLAYLIST_TYPE_UNKNOWN = 0;
    public static final int PLAYLIST_TYPE_VOD = 1;
    public final int discontinuitySequence;
    public final long durationUs;
    public final boolean hasDiscontinuitySequence;
    public final boolean hasEndTag;
    public final boolean hasPositiveStartOffset;
    public final boolean hasProgramDateTime;
    public final long mediaSequence;
    public final long partTargetDurationUs;
    public final int playlistType;
    public final boolean preciseStart;
    @Nullable
    public final DrmInitData protectionSchemes;
    public final Map<Uri, RenditionReport> renditionReports;
    public final List<Segment> segments;
    public final ServerControl serverControl;
    public final long startOffsetUs;
    public final long startTimeUs;
    public final long targetDurationUs;
    public final List<Part> trailingParts;
    public final int version;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Part extends SegmentBase {
        public final boolean isIndependent;
        public final boolean isPreload;

        public Part(String url, @Nullable Segment initializationSegment, long durationUs, int relativeDiscontinuitySequence, long relativeStartTimeUs, @Nullable DrmInitData drmInitData, @Nullable String fullSegmentEncryptionKeyUri, @Nullable String encryptionIV, long byteRangeOffset, long byteRangeLength, boolean hasGapTag, boolean isIndependent, boolean isPreload) {
        }

        public Part copyWith(long relativeStartTimeUs, int relativeDiscontinuitySequence) {
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface PlaylistType {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class RenditionReport {
        public final long lastMediaSequence;
        public final int lastPartIndex;
        public final Uri playlistUri;

        public RenditionReport(Uri playlistUri, long lastMediaSequence, int lastPartIndex) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class SegmentBase implements Comparable<Long> {
        public final long byteRangeLength;
        public final long byteRangeOffset;
        @Nullable
        public final DrmInitData drmInitData;
        public final long durationUs;
        @Nullable
        public final String encryptionIV;
        @Nullable
        public final String fullSegmentEncryptionKeyUri;
        public final boolean hasGapTag;
        @Nullable
        public final Segment initializationSegment;
        public final int relativeDiscontinuitySequence;
        public final long relativeStartTimeUs;
        public final String url;

        public /* synthetic */ SegmentBase(String str, Segment segment, long j2, int i2, long j3, DrmInitData drmInitData, String str2, String str3, long j4, long j5, boolean z, AnonymousClass1 anonymousClass1) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Long relativeStartTimeUs) {
        }

        private SegmentBase(String url, @Nullable Segment initializationSegment, long durationUs, int relativeDiscontinuitySequence, long relativeStartTimeUs, @Nullable DrmInitData drmInitData, @Nullable String fullSegmentEncryptionKeyUri, @Nullable String encryptionIV, long byteRangeOffset, long byteRangeLength, boolean hasGapTag) {
        }

        /* renamed from: compareTo  reason: avoid collision after fix types in other method */
        public int compareTo2(Long relativeStartTimeUs) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class ServerControl {
        public final boolean canBlockReload;
        public final boolean canSkipDateRanges;
        public final long holdBackUs;
        public final long partHoldBackUs;
        public final long skipUntilUs;

        public ServerControl(long skipUntilUs, boolean canSkipDateRanges, long holdBackUs, long partHoldBackUs, boolean canBlockReload) {
        }
    }

    public HlsMediaPlaylist(int playlistType, String baseUri, List<String> tags, long startOffsetUs, boolean preciseStart, long startTimeUs, boolean hasDiscontinuitySequence, int discontinuitySequence, long mediaSequence, int version, long targetDurationUs, long partTargetDurationUs, boolean hasIndependentSegments, boolean hasEndTag, boolean hasProgramDateTime, @Nullable DrmInitData protectionSchemes, List<Segment> segments, List<Part> trailingParts, ServerControl serverControl, Map<Uri, RenditionReport> renditionReports) {
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    public HlsPlaylist copy(List<StreamKey> streamKeys) {
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    /* renamed from: copy  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ HlsPlaylist copy2(List streamKeys) {
    }

    public HlsMediaPlaylist copyWith(long startTimeUs, int discontinuitySequence) {
    }

    public HlsMediaPlaylist copyWithEndTag() {
    }

    public long getEndTimeUs() {
    }

    public boolean isNewerThan(@Nullable HlsMediaPlaylist other) {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Segment extends SegmentBase {
        public final List<Part> parts;
        public final String title;

        public Segment(String uri, long byteRangeOffset, long byteRangeLength, @Nullable String fullSegmentEncryptionKeyUri, @Nullable String encryptionIV) {
        }

        public Segment copyWith(long relativeStartTimeUs, int relativeDiscontinuitySequence) {
        }

        public Segment(String url, @Nullable Segment initializationSegment, String title, long durationUs, int relativeDiscontinuitySequence, long relativeStartTimeUs, @Nullable DrmInitData drmInitData, @Nullable String fullSegmentEncryptionKeyUri, @Nullable String encryptionIV, long byteRangeOffset, long byteRangeLength, boolean hasGapTag, List<Part> parts) {
        }
    }
}
