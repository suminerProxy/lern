package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.SinglePeriodTimeline;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class HlsMediaSource extends BaseMediaSource implements HlsPlaylistTracker.PrimaryPlaylistListener {
    public static final int METADATA_TYPE_EMSG = 3;
    public static final int METADATA_TYPE_ID3 = 1;
    private final boolean allowChunklessPreparation;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final HlsDataSourceFactory dataSourceFactory;
    private final DrmSessionManager drmSessionManager;
    private final long elapsedRealTimeOffsetMs;
    private final HlsExtractorFactory extractorFactory;
    private MediaItem.LiveConfiguration liveConfiguration;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final MediaItem mediaItem;
    @Nullable
    private TransferListener mediaTransferListener;
    private final int metadataType;
    private final MediaItem.PlaybackProperties playbackProperties;
    private final HlsPlaylistTracker playlistTracker;
    private final boolean useSessionKeys;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Factory implements MediaSourceFactory {
        private boolean allowChunklessPreparation;
        private CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
        private DrmSessionManagerProvider drmSessionManagerProvider;
        private long elapsedRealTimeOffsetMs;
        private HlsExtractorFactory extractorFactory;
        private final HlsDataSourceFactory hlsDataSourceFactory;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private int metadataType;
        private HlsPlaylistParserFactory playlistParserFactory;
        private HlsPlaylistTracker.Factory playlistTrackerFactory;
        private List<StreamKey> streamKeys;
        @Nullable
        private Object tag;
        private boolean useSessionKeys;
        private boolean usingCustomDrmSessionManagerProvider;

        public Factory(DataSource.Factory dataSourceFactory) {
        }

        public static /* synthetic */ DrmSessionManager a(DrmSessionManager drmSessionManager, MediaItem mediaItem) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        public /* bridge */ /* synthetic */ MediaSource createMediaSource(Uri uri) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public int[] getSupportedTypes() {
        }

        public Factory setAllowChunklessPreparation(boolean allowChunklessPreparation) {
        }

        public Factory setCompositeSequenceableLoaderFactory(@Nullable CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public /* bridge */ /* synthetic */ MediaSourceFactory setDrmHttpDataSourceFactory(@Nullable HttpDataSource.Factory drmHttpDataSourceFactory) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public /* bridge */ /* synthetic */ MediaSourceFactory setDrmSessionManager(@Nullable DrmSessionManager drmSessionManager) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public /* bridge */ /* synthetic */ MediaSourceFactory setDrmSessionManagerProvider(@Nullable DrmSessionManagerProvider drmSessionManagerProvider) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public /* bridge */ /* synthetic */ MediaSourceFactory setDrmUserAgent(@Nullable String userAgent) {
        }

        @VisibleForTesting
        public Factory setElapsedRealTimeOffsetMs(long elapsedRealTimeOffsetMs) {
        }

        public Factory setExtractorFactory(@Nullable HlsExtractorFactory extractorFactory) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public /* bridge */ /* synthetic */ MediaSourceFactory setLoadErrorHandlingPolicy(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        }

        public Factory setMetadataType(int metadataType) {
        }

        public Factory setPlaylistParserFactory(@Nullable HlsPlaylistParserFactory playlistParserFactory) {
        }

        public Factory setPlaylistTrackerFactory(@Nullable HlsPlaylistTracker.Factory playlistTrackerFactory) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        public /* bridge */ /* synthetic */ MediaSourceFactory setStreamKeys(@Nullable List streamKeys) {
        }

        @Deprecated
        public Factory setTag(@Nullable Object tag) {
        }

        public Factory setUseSessionKeys(boolean useSessionKeys) {
        }

        public Factory(HlsDataSourceFactory hlsDataSourceFactory) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public /* bridge */ /* synthetic */ MediaSource createMediaSource(MediaItem mediaItem) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setDrmHttpDataSourceFactory(@Nullable HttpDataSource.Factory drmHttpDataSourceFactory) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setDrmSessionManager(@Nullable DrmSessionManager drmSessionManager) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setDrmSessionManagerProvider(@Nullable DrmSessionManagerProvider drmSessionManagerProvider) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setDrmUserAgent(@Nullable String userAgent) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setLoadErrorHandlingPolicy(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        public Factory setStreamKeys(@Nullable List<StreamKey> streamKeys) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        public HlsMediaSource createMediaSource(Uri uri) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public HlsMediaSource createMediaSource(MediaItem mediaItem) {
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public @interface MetadataType {
    }

    public /* synthetic */ HlsMediaSource(MediaItem mediaItem, HlsDataSourceFactory hlsDataSourceFactory, HlsExtractorFactory hlsExtractorFactory, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistTracker hlsPlaylistTracker, long j2, boolean z, int i2, boolean z2, AnonymousClass1 anonymousClass1) {
    }

    private SinglePeriodTimeline createTimelineForLive(HlsMediaPlaylist playlist, long presentationStartTimeMs, long windowStartTimeMs, HlsManifest manifest) {
    }

    private SinglePeriodTimeline createTimelineForOnDemand(HlsMediaPlaylist playlist, long presentationStartTimeMs, long windowStartTimeMs, HlsManifest manifest) {
    }

    @Nullable
    private static HlsMediaPlaylist.Part findClosestPrecedingIndependentPart(List<HlsMediaPlaylist.Part> parts, long positionUs) {
    }

    private static HlsMediaPlaylist.Segment findClosestPrecedingSegment(List<HlsMediaPlaylist.Segment> segments, long positionUs) {
    }

    private long getLiveEdgeOffsetUs(HlsMediaPlaylist playlist) {
    }

    private long getLiveWindowDefaultStartPositionUs(HlsMediaPlaylist playlist, long liveEdgeOffsetUs) {
    }

    private static long getTargetLiveOffsetUs(HlsMediaPlaylist playlist, long liveEdgeOffsetUs) {
    }

    private void maybeUpdateLiveConfiguration(long targetLiveOffsetUs) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PrimaryPlaylistListener
    public void onPrimaryPlaylistRefreshed(HlsMediaPlaylist mediaPlaylist) {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener mediaTransferListener) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
    }

    private HlsMediaSource(MediaItem mediaItem, HlsDataSourceFactory dataSourceFactory, HlsExtractorFactory extractorFactory, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistTracker playlistTracker, long elapsedRealTimeOffsetMs, boolean allowChunklessPreparation, int metadataType, boolean useSessionKeys) {
    }
}
