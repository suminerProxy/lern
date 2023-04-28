package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.hls.HlsChunkSource;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class HlsMediaChunk extends MediaChunk {
    public static final String PRIV_TIMESTAMP_FRAME_OWNER = "com.apple.streaming.transportStreamTimestamp";
    private static final AtomicInteger uidSource = null;
    public final int discontinuitySequenceNumber;
    @Nullable
    private final DrmInitData drmInitData;
    private HlsMediaChunkExtractor extractor;
    private final HlsExtractorFactory extractorFactory;
    private boolean extractorInvalidated;
    private final boolean hasGapTag;
    private final Id3Decoder id3Decoder;
    private boolean initDataLoadRequired;
    @Nullable
    private final DataSource initDataSource;
    @Nullable
    private final DataSpec initDataSpec;
    private final boolean initSegmentEncrypted;
    private final boolean isMasterTimestampSource;
    private boolean isPublished;
    private volatile boolean loadCanceled;
    private boolean loadCompleted;
    private final boolean mediaSegmentEncrypted;
    @Nullable
    private final List<Format> muxedCaptionFormats;
    private int nextLoadPosition;
    private HlsSampleStreamWrapper output;
    public final int partIndex;
    public final Uri playlistUrl;
    @Nullable
    private final HlsMediaChunkExtractor previousExtractor;
    private ImmutableList<Integer> sampleQueueFirstSampleIndices;
    private final ParsableByteArray scratchId3Data;
    public final boolean shouldSpliceIn;
    private final TimestampAdjuster timestampAdjuster;
    public final int uid;

    private HlsMediaChunk(HlsExtractorFactory extractorFactory, DataSource mediaDataSource, DataSpec dataSpec, Format format, boolean mediaSegmentEncrypted, @Nullable DataSource initDataSource, @Nullable DataSpec initDataSpec, boolean initSegmentEncrypted, Uri playlistUrl, @Nullable List<Format> muxedCaptionFormats, int trackSelectionReason, @Nullable Object trackSelectionData, long startTimeUs, long endTimeUs, long chunkMediaSequence, int partIndex, boolean isPublished, int discontinuitySequenceNumber, boolean hasGapTag, boolean isMasterTimestampSource, TimestampAdjuster timestampAdjuster, @Nullable DrmInitData drmInitData, @Nullable HlsMediaChunkExtractor previousExtractor, Id3Decoder id3Decoder, ParsableByteArray scratchId3Data, boolean shouldSpliceIn) {
    }

    private static DataSource buildDataSource(DataSource dataSource, @Nullable byte[] fullSegmentEncryptionKey, @Nullable byte[] encryptionIv) {
    }

    public static HlsMediaChunk createInstance(HlsExtractorFactory extractorFactory, DataSource dataSource, Format format, long startOfPlaylistInPeriodUs, HlsMediaPlaylist mediaPlaylist, HlsChunkSource.SegmentBaseHolder segmentBaseHolder, Uri playlistUrl, @Nullable List<Format> muxedCaptionFormats, int trackSelectionReason, @Nullable Object trackSelectionData, boolean isMasterTimestampSource, TimestampAdjusterProvider timestampAdjusterProvider, @Nullable HlsMediaChunk previousChunk, @Nullable byte[] mediaSegmentKey, @Nullable byte[] initSegmentKey, boolean shouldSpliceIn) {
    }

    @RequiresNonNull({"output"})
    private void feedDataToExtractor(DataSource dataSource, DataSpec dataSpec, boolean dataIsEncrypted) throws IOException {
    }

    private static byte[] getEncryptionIvArray(String ivString) {
    }

    private static boolean isIndependent(HlsChunkSource.SegmentBaseHolder segmentBaseHolder, HlsMediaPlaylist mediaPlaylist) {
    }

    @RequiresNonNull({"output"})
    private void loadMedia() throws IOException {
    }

    @RequiresNonNull({"output"})
    private void maybeLoadInitData() throws IOException {
    }

    private long peekId3PrivTimestamp(ExtractorInput input) throws IOException {
    }

    @EnsuresNonNull({"extractor"})
    @RequiresNonNull({"output"})
    private DefaultExtractorInput prepareExtraction(DataSource dataSource, DataSpec dataSpec) throws IOException {
    }

    public static boolean shouldSpliceIn(@Nullable HlsMediaChunk previousChunk, Uri playlistUrl, HlsMediaPlaylist mediaPlaylist, HlsChunkSource.SegmentBaseHolder segmentBaseHolder, long startOfPlaylistInPeriodUs) {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void cancelLoad() {
    }

    public int getFirstSampleIndex(int sampleQueueIndex) {
    }

    public void init(HlsSampleStreamWrapper output, ImmutableList<Integer> sampleQueueWriteIndices) {
    }

    public void invalidateExtractor() {
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
    }

    public boolean isPublished() {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void load() throws IOException {
    }

    public void publish() {
    }
}
