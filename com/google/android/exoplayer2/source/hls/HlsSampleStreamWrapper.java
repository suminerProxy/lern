package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.hls.HlsChunkSource;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class HlsSampleStreamWrapper implements Loader.Callback<Chunk>, Loader.ReleaseCallback, SequenceableLoader, ExtractorOutput, SampleQueue.UpstreamFormatChangedListener {
    private static final Set<Integer> MAPPABLE_TYPES = null;
    public static final int SAMPLE_QUEUE_INDEX_NO_MAPPING_FATAL = -2;
    public static final int SAMPLE_QUEUE_INDEX_NO_MAPPING_NON_FATAL = -3;
    public static final int SAMPLE_QUEUE_INDEX_PENDING = -1;
    private static final String TAG = "HlsSampleStreamWrapper";
    private final Allocator allocator;
    private final Callback callback;
    private final HlsChunkSource chunkSource;
    @Nullable
    private Format downstreamTrackFormat;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    @Nullable
    private DrmInitData drmInitData;
    private final DrmSessionManager drmSessionManager;
    private TrackOutput emsgUnwrappingTrackOutput;
    private int enabledTrackGroupCount;
    private final Handler handler;
    private boolean haveAudioVideoSampleQueues;
    private final ArrayList<HlsSampleStream> hlsSampleStreams;
    private long lastSeekPositionUs;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final Loader loader;
    @Nullable
    private Chunk loadingChunk;
    private boolean loadingFinished;
    private final Runnable maybeFinishPrepareRunnable;
    private final ArrayList<HlsMediaChunk> mediaChunks;
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private final int metadataType;
    @Nullable
    private final Format muxedAudioFormat;
    private final HlsChunkSource.HlsChunkHolder nextChunkHolder;
    private final Runnable onTracksEndedRunnable;
    private Set<TrackGroup> optionalTrackGroups;
    private final Map<String, DrmInitData> overridingDrmInitData;
    private long pendingResetPositionUs;
    private boolean pendingResetUpstreamFormats;
    private boolean prepared;
    private int primarySampleQueueIndex;
    private int primarySampleQueueType;
    private int primaryTrackGroupIndex;
    private final List<HlsMediaChunk> readOnlyMediaChunks;
    private boolean released;
    private long sampleOffsetUs;
    private SparseIntArray sampleQueueIndicesByType;
    private boolean[] sampleQueueIsAudioVideoFlags;
    private Set<Integer> sampleQueueMappingDoneByType;
    private int[] sampleQueueTrackIds;
    private HlsSampleQueue[] sampleQueues;
    private boolean sampleQueuesBuilt;
    private boolean[] sampleQueuesEnabledStates;
    private boolean seenFirstTrackSelection;
    @Nullable
    private HlsMediaChunk sourceChunk;
    private int[] trackGroupToSampleQueueIndex;
    private TrackGroupArray trackGroups;
    private final int trackType;
    private boolean tracksEnded;
    private Format upstreamTrackFormat;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Callback extends SequenceableLoader.Callback<HlsSampleStreamWrapper> {
        void onPlaylistRefreshRequired(Uri playlistUrl);

        void onPrepared();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class HlsSampleQueue extends SampleQueue {
        @Nullable
        private DrmInitData drmInitData;
        private final Map<String, DrmInitData> overridingDrmInitData;

        public /* synthetic */ HlsSampleQueue(Allocator allocator, Looper looper, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, Map map, AnonymousClass1 anonymousClass1) {
        }

        @Nullable
        private Metadata getAdjustedMetadata(@Nullable Metadata metadata) {
        }

        @Override // com.google.android.exoplayer2.source.SampleQueue
        public Format getAdjustedUpstreamFormat(Format format) {
        }

        @Override // com.google.android.exoplayer2.source.SampleQueue, com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleMetadata(long timeUs, int flags, int size, int offset, @Nullable TrackOutput.CryptoData cryptoData) {
        }

        public void setDrmInitData(@Nullable DrmInitData drmInitData) {
        }

        public void setSourceChunk(HlsMediaChunk chunk) {
        }

        private HlsSampleQueue(Allocator allocator, Looper playbackLooper, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, Map<String, DrmInitData> overridingDrmInitData) {
        }
    }

    public HlsSampleStreamWrapper(int trackType, Callback callback, HlsChunkSource chunkSource, Map<String, DrmInitData> overridingDrmInitData, Allocator allocator, long positionUs, @Nullable Format muxedAudioFormat, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher drmEventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher, int metadataType) {
    }

    public static /* synthetic */ void a(HlsSampleStreamWrapper hlsSampleStreamWrapper) {
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    private void assertIsPrepared() {
    }

    public static /* synthetic */ void b(HlsSampleStreamWrapper hlsSampleStreamWrapper) {
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups", "trackGroupToSampleQueueIndex"})
    private void buildTracksFromSampleStreams() {
    }

    private boolean canDiscardUpstreamMediaChunksFromIndex(int mediaChunkIndex) {
    }

    private static DummyTrackOutput createFakeTrackOutput(int id, int type) {
    }

    private SampleQueue createSampleQueue(int id, int type) {
    }

    private TrackGroupArray createTrackGroupArrayWithDrmInfo(TrackGroup[] trackGroups) {
    }

    private static Format deriveFormat(@Nullable Format playlistFormat, Format sampleFormat, boolean propagateBitrates) {
    }

    private void discardUpstream(int preferredQueueSize) {
    }

    private HlsMediaChunk discardUpstreamMediaChunksFromIndex(int chunkIndex) {
    }

    private boolean finishedReadingChunk(HlsMediaChunk chunk) {
    }

    private static boolean formatsMatch(Format manifestFormat, Format sampleFormat) {
    }

    private HlsMediaChunk getLastMediaChunk() {
    }

    @Nullable
    private TrackOutput getMappedTrackOutput(int id, int type) {
    }

    private static int getTrackTypeScore(int trackType) {
    }

    private void initMediaChunkLoad(HlsMediaChunk chunk) {
    }

    private static boolean isMediaChunk(Chunk chunk) {
    }

    private boolean isPendingReset() {
    }

    @EnsuresNonNull({"trackGroupToSampleQueueIndex"})
    @RequiresNonNull({"trackGroups"})
    private void mapSampleQueuesToMatchTrackGroups() {
    }

    private void maybeFinishPrepare() {
    }

    private void onTracksEnded() {
    }

    private void resetSampleQueues() {
    }

    private boolean seekInsideBufferUs(long positionUs) {
    }

    @RequiresNonNull({"trackGroups", "optionalTrackGroups"})
    private void setIsPrepared() {
    }

    private void updateSampleStreams(SampleStream[] streams) {
    }

    public int bindSampleQueueToSampleStream(int trackGroupIndex) {
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long positionUs) {
    }

    public void continuePreparing() {
    }

    public void discardBuffer(long positionUs, boolean toKeyframe) {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void endTracks() {
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
    }

    public int getPrimaryTrackGroupIndex() {
    }

    public TrackGroupArray getTrackGroups() {
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
    }

    public boolean isReady(int sampleQueueIndex) {
    }

    public void maybeThrowError(int sampleQueueIndex) throws IOException {
    }

    public void maybeThrowPrepareError() throws IOException {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ void onLoadCanceled(Chunk loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ void onLoadCompleted(Chunk loadable, long elapsedRealtimeMs, long loadDurationMs) {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ Loader.LoadErrorAction onLoadError(Chunk loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
    }

    public void onNewExtractor() {
    }

    public boolean onPlaylistError(Uri playlistUrl, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean forceRetry) {
    }

    public void onPlaylistUpdated() {
    }

    @Override // com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener
    public void onUpstreamFormatChanged(Format format) {
    }

    public void prepareWithMasterPlaylistInfo(TrackGroup[] trackGroups, int primaryTrackGroupIndex, int... optionalTrackGroupsIndices) {
    }

    public int readData(int sampleQueueIndex, FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags) {
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long positionUs) {
    }

    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
    }

    public boolean seekToUs(long positionUs, boolean forceReset) {
    }

    public boolean selectTracks(ExoTrackSelection[] selections, boolean[] mayRetainStreamFlags, SampleStream[] streams, boolean[] streamResetFlags, long positionUs, boolean forceReset) {
    }

    public void setDrmInitData(@Nullable DrmInitData drmInitData) {
    }

    public void setIsTimestampMaster(boolean isTimestampMaster) {
    }

    public void setSampleOffsetUs(long sampleOffsetUs) {
    }

    public int skipData(int sampleQueueIndex, long positionUs) {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public TrackOutput track(int id, int type) {
    }

    public void unbindSampleQueue(int trackGroupIndex) {
    }

    /* renamed from: onLoadCanceled  reason: avoid collision after fix types in other method */
    public void onLoadCanceled2(Chunk loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
    }

    /* renamed from: onLoadCompleted  reason: avoid collision after fix types in other method */
    public void onLoadCompleted2(Chunk loadable, long elapsedRealtimeMs, long loadDurationMs) {
    }

    /* renamed from: onLoadError  reason: avoid collision after fix types in other method */
    public Loader.LoadErrorAction onLoadError2(Chunk loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
    }

    public void maybeThrowError() throws IOException {
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class EmsgUnwrappingTrackOutput implements TrackOutput {
        private static final Format EMSG_FORMAT = null;
        private static final Format ID3_FORMAT = null;
        private static final String TAG = "EmsgUnwrappingTrackOutput";
        private byte[] buffer;
        private int bufferPosition;
        private final TrackOutput delegate;
        private final Format delegateFormat;
        private final EventMessageDecoder emsgDecoder;
        private Format format;

        public EmsgUnwrappingTrackOutput(TrackOutput delegate, int metadataType) {
        }

        private boolean emsgContainsExpectedWrappedFormat(EventMessage emsg) {
        }

        private void ensureBufferCapacity(int requiredLength) {
        }

        private ParsableByteArray getSampleAndTrimBuffer(int size, int offset) {
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void format(Format format) {
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public /* synthetic */ int sampleData(DataReader dataReader, int i2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public int sampleData(DataReader input, int length, boolean allowEndOfInput, int sampleDataPart) throws IOException {
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public /* synthetic */ void sampleData(ParsableByteArray parsableByteArray, int i2) {
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleMetadata(long timeUs, int flags, int size, int offset, @Nullable TrackOutput.CryptoData cryptoData) {
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleData(ParsableByteArray data, int length, int sampleDataPart) {
        }
    }
}
