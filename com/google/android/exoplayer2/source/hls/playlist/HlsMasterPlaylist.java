package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class HlsMasterPlaylist extends HlsPlaylist {
    public static final HlsMasterPlaylist EMPTY = null;
    public static final int GROUP_INDEX_AUDIO = 1;
    public static final int GROUP_INDEX_SUBTITLE = 2;
    public static final int GROUP_INDEX_VARIANT = 0;
    public final List<Rendition> audios;
    public final List<Rendition> closedCaptions;
    public final List<Uri> mediaPlaylistUrls;
    @Nullable
    public final Format muxedAudioFormat;
    @Nullable
    public final List<Format> muxedCaptionFormats;
    public final List<DrmInitData> sessionKeyDrmInitData;
    public final List<Rendition> subtitles;
    public final Map<String, String> variableDefinitions;
    public final List<Variant> variants;
    public final List<Rendition> videos;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Rendition {
        public final Format format;
        public final String groupId;
        public final String name;
        @Nullable
        public final Uri url;

        public Rendition(@Nullable Uri url, Format format, String groupId, String name) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Variant {
        @Nullable
        public final String audioGroupId;
        @Nullable
        public final String captionGroupId;
        public final Format format;
        @Nullable
        public final String subtitleGroupId;
        public final Uri url;
        @Nullable
        public final String videoGroupId;

        public Variant(Uri url, Format format, @Nullable String videoGroupId, @Nullable String audioGroupId, @Nullable String subtitleGroupId, @Nullable String captionGroupId) {
        }

        public static Variant createMediaPlaylistVariantUrl(Uri url) {
        }

        public Variant copyWithFormat(Format format) {
        }
    }

    public HlsMasterPlaylist(String baseUri, List<String> tags, List<Variant> variants, List<Rendition> videos, List<Rendition> audios, List<Rendition> subtitles, List<Rendition> closedCaptions, @Nullable Format muxedAudioFormat, @Nullable List<Format> muxedCaptionFormats, boolean hasIndependentSegments, Map<String, String> variableDefinitions, List<DrmInitData> sessionKeyDrmInitData) {
    }

    private static void addMediaPlaylistUrls(List<Rendition> renditions, List<Uri> out) {
    }

    private static <T> List<T> copyStreams(List<T> streams, int groupIndex, List<StreamKey> streamKeys) {
    }

    public static HlsMasterPlaylist createSingleVariantMasterPlaylist(String variantUrl) {
    }

    private static List<Uri> getMediaPlaylistUrls(List<Variant> variants, List<Rendition> videos, List<Rendition> audios, List<Rendition> subtitles, List<Rendition> closedCaptions) {
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    /* renamed from: copy  reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ HlsPlaylist copy2(List streamKeys) {
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    public HlsPlaylist copy(List<StreamKey> streamKeys) {
    }
}
