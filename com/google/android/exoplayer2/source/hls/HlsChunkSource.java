package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.BaseMediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.DataChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.trackselection.BaseTrackSelection;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class HlsChunkSource {
    public static final int CHUNK_PUBLICATION_STATE_PRELOAD = 0;
    public static final int CHUNK_PUBLICATION_STATE_PUBLISHED = 1;
    public static final int CHUNK_PUBLICATION_STATE_REMOVED = 2;
    private static final int KEY_CACHE_SIZE = 4;
    private final DataSource encryptionDataSource;
    @Nullable
    private Uri expectedPlaylistUrl;
    private final HlsExtractorFactory extractorFactory;
    @Nullable
    private IOException fatalError;
    private boolean independentSegments;
    private boolean isTimestampMaster;
    private final FullSegmentEncryptionKeyCache keyCache;
    private long liveEdgeInPeriodTimeUs;
    private final DataSource mediaDataSource;
    @Nullable
    private final List<Format> muxedCaptionFormats;
    private final Format[] playlistFormats;
    private final HlsPlaylistTracker playlistTracker;
    private final Uri[] playlistUrls;
    private byte[] scratchSpace;
    private boolean seenExpectedPlaylistError;
    private final TimestampAdjusterProvider timestampAdjusterProvider;
    private final TrackGroup trackGroup;
    private ExoTrackSelection trackSelection;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class EncryptionKeyChunk extends DataChunk {
        private byte[] result;

        public EncryptionKeyChunk(DataSource dataSource, DataSpec dataSpec, Format trackFormat, int trackSelectionReason, @Nullable Object trackSelectionData, byte[] scratchSpace) {
        }

        @Override // com.google.android.exoplayer2.source.chunk.DataChunk
        public void consume(byte[] data, int limit) {
        }

        @Nullable
        public byte[] getResult() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class HlsChunkHolder {
        @Nullable
        public Chunk chunk;
        public boolean endOfStream;
        @Nullable
        public Uri playlistUrl;

        public void clear() {
        }
    }

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class HlsMediaPlaylistSegmentIterator extends BaseMediaChunkIterator {
        private final String playlistBaseUri;
        private final List<HlsMediaPlaylist.SegmentBase> segmentBases;
        private final long startOfPlaylistInPeriodUs;

        public HlsMediaPlaylistSegmentIterator(String playlistBaseUri, long startOfPlaylistInPeriodUs, List<HlsMediaPlaylist.SegmentBase> segmentBases) {
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public DataSpec getDataSpec() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class InitializationTrackSelection extends BaseTrackSelection {
        private int selectedIndex;

        public InitializationTrackSelection(TrackGroup group, int[] tracks) {
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        @Nullable
        public Object getSelectionData() {
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectionReason() {
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void updateSelectedTrack(long playbackPositionUs, long bufferedDurationUs, long availableDurationUs, List<? extends MediaChunk> queue, MediaChunkIterator[] mediaChunkIterators) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SegmentBaseHolder {
        public final boolean isPreload;
        public final long mediaSequence;
        public final int partIndex;
        public final HlsMediaPlaylist.SegmentBase segmentBase;

        public SegmentBaseHolder(HlsMediaPlaylist.SegmentBase segmentBase, long mediaSequence, int partIndex) {
        }
    }

    public HlsChunkSource(HlsExtractorFactory extractorFactory, HlsPlaylistTracker playlistTracker, Uri[] playlistUrls, Format[] playlistFormats, HlsDataSourceFactory dataSourceFactory, @Nullable TransferListener mediaTransferListener, TimestampAdjusterProvider timestampAdjusterProvider, @Nullable List<Format> muxedCaptionFormats) {
    }

    @Nullable
    private static Uri getFullEncryptionKeyUri(HlsMediaPlaylist playlist, @Nullable HlsMediaPlaylist.SegmentBase segmentBase) {
    }

    private Pair<Long, Integer> getNextMediaSequenceAndPartIndex(@Nullable HlsMediaChunk previous, boolean switchingTrack, HlsMediaPlaylist mediaPlaylist, long startOfPlaylistInPeriodUs, long loadPositionUs) {
    }

    @Nullable
    private static SegmentBaseHolder getNextSegmentHolder(HlsMediaPlaylist mediaPlaylist, long nextMediaSequence, int nextPartIndex) {
    }

    @VisibleForTesting
    public static List<HlsMediaPlaylist.SegmentBase> getSegmentBaseList(HlsMediaPlaylist playlist, long mediaSequence, int partIndex) {
    }

    @Nullable
    private Chunk maybeCreateEncryptionChunkFor(@Nullable Uri keyUri, int selectedTrackIndex) {
    }

    private long resolveTimeToLiveEdgeUs(long playbackPositionUs) {
    }

    private void updateLiveEdgeTimeUs(HlsMediaPlaylist mediaPlaylist) {
    }

    public MediaChunkIterator[] createMediaChunkIterators(@Nullable HlsMediaChunk previous, long loadPositionUs) {
    }

    public int getChunkPublicationState(HlsMediaChunk mediaChunk) {
    }

    public void getNextChunk(long playbackPositionUs, long loadPositionUs, List<HlsMediaChunk> queue, boolean allowEndOfStream, HlsChunkHolder out) {
    }

    public int getPreferredQueueSize(long playbackPositionUs, List<? extends MediaChunk> queue) {
    }

    public TrackGroup getTrackGroup() {
    }

    public ExoTrackSelection getTrackSelection() {
    }

    public boolean maybeExcludeTrack(Chunk chunk, long exclusionDurationMs) {
    }

    public void maybeThrowError() throws IOException {
    }

    public boolean obtainsChunksForPlaylist(Uri playlistUrl) {
    }

    public void onChunkLoadCompleted(Chunk chunk) {
    }

    public boolean onPlaylistError(Uri playlistUrl, long exclusionDurationMs) {
    }

    public void reset() {
    }

    public void setIsTimestampMaster(boolean isTimestampMaster) {
    }

    public void setTrackSelection(ExoTrackSelection trackSelection) {
    }

    public boolean shouldCancelLoad(long playbackPositionUs, Chunk loadingChunk, List<? extends MediaChunk> queue) {
    }
}
