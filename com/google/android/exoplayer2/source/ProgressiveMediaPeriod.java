package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.IcyDataSource;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ProgressiveMediaPeriod implements MediaPeriod, ExtractorOutput, Loader.Callback<ExtractingLoadable>, Loader.ReleaseCallback, SampleQueue.UpstreamFormatChangedListener {
    private static final long DEFAULT_LAST_SAMPLE_DURATION_US = 10000;
    private static final Format ICY_FORMAT = null;
    private static final Map<String, String> ICY_METADATA_HEADERS = null;
    private final Allocator allocator;
    @Nullable
    private MediaPeriod.Callback callback;
    private final long continueLoadingCheckIntervalBytes;
    @Nullable
    private final String customCacheKey;
    private final DataSource dataSource;
    private int dataType;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private long durationUs;
    private int enabledTrackCount;
    private int extractedSamplesCountAtStartOfLoad;
    private final Handler handler;
    private boolean haveAudioVideoTracks;
    @Nullable
    private IcyHeaders icyHeaders;
    private boolean isLive;
    private long lastSeekPositionUs;
    private long length;
    private final Listener listener;
    private final ConditionVariable loadCondition;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final Loader loader;
    private boolean loadingFinished;
    private final Runnable maybeFinishPrepareRunnable;
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
    private boolean notifyDiscontinuity;
    private final Runnable onContinueLoadingRequestedRunnable;
    private boolean pendingDeferredRetry;
    private long pendingResetPositionUs;
    private boolean prepared;
    private final ProgressiveMediaExtractor progressiveMediaExtractor;
    private boolean released;
    private TrackId[] sampleQueueTrackIds;
    private SampleQueue[] sampleQueues;
    private boolean sampleQueuesBuilt;
    private SeekMap seekMap;
    private boolean seenFirstTrackSelection;
    private TrackState trackState;
    private final Uri uri;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class ExtractingLoadable implements Loader.Loadable, IcyDataSource.Listener {
        private final StatsDataSource dataSource;
        private DataSpec dataSpec;
        private final ExtractorOutput extractorOutput;
        @Nullable
        private TrackOutput icyTrackOutput;
        private long length;
        private volatile boolean loadCanceled;
        private final ConditionVariable loadCondition;
        private final long loadTaskId;
        private boolean pendingExtractorSeek;
        private final PositionHolder positionHolder;
        private final ProgressiveMediaExtractor progressiveMediaExtractor;
        private long seekTimeUs;
        private boolean seenIcyMetadata;
        public final /* synthetic */ ProgressiveMediaPeriod this$0;
        private final Uri uri;

        public ExtractingLoadable(final ProgressiveMediaPeriod this$0, Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, ExtractorOutput extractorOutput, ConditionVariable loadCondition) {
        }

        public static /* synthetic */ StatsDataSource access$100(ExtractingLoadable extractingLoadable) {
        }

        public static /* synthetic */ long access$200(ExtractingLoadable extractingLoadable) {
        }

        public static /* synthetic */ DataSpec access$300(ExtractingLoadable extractingLoadable) {
        }

        public static /* synthetic */ long access$400(ExtractingLoadable extractingLoadable) {
        }

        public static /* synthetic */ long access$500(ExtractingLoadable extractingLoadable) {
        }

        public static /* synthetic */ void access$600(ExtractingLoadable extractingLoadable, long j2, long j3) {
        }

        private DataSpec buildDataSpec(long position) {
        }

        private void setLoadPosition(long position, long timeUs) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void cancelLoad() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void load() throws IOException {
        }

        @Override // com.google.android.exoplayer2.source.IcyDataSource.Listener
        public void onIcyMetadata(ParsableByteArray metadata) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface Listener {
        void onSourceInfoRefreshed(long durationUs, boolean isSeekable, boolean isLive);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public final class SampleStreamImpl implements SampleStream {
        public final /* synthetic */ ProgressiveMediaPeriod this$0;
        private final int track;

        public SampleStreamImpl(final ProgressiveMediaPeriod this$0, int track) {
        }

        public static /* synthetic */ int access$000(SampleStreamImpl sampleStreamImpl) {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws IOException {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags) {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long positionUs) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class TrackId {
        public final int id;
        public final boolean isIcyTrack;

        public TrackId(int id, boolean isIcyTrack) {
        }

        public boolean equals(@Nullable Object obj) {
        }

        public int hashCode() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class TrackState {
        public final boolean[] trackEnabledStates;
        public final boolean[] trackIsAudioVideoFlags;
        public final boolean[] trackNotifiedDownstreamFormats;
        public final TrackGroupArray tracks;

        public TrackState(TrackGroupArray tracks, boolean[] trackIsAudioVideoFlags) {
        }
    }

    public ProgressiveMediaPeriod(Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher drmEventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher, Listener listener, Allocator allocator, @Nullable String customCacheKey, int continueLoadingCheckIntervalBytes) {
    }

    public static /* synthetic */ void a(ProgressiveMediaPeriod progressiveMediaPeriod) {
    }

    public static /* synthetic */ Runnable access$1000(ProgressiveMediaPeriod progressiveMediaPeriod) {
    }

    public static /* synthetic */ Handler access$1100(ProgressiveMediaPeriod progressiveMediaPeriod) {
    }

    public static /* synthetic */ long access$1200(ProgressiveMediaPeriod progressiveMediaPeriod) {
    }

    public static /* synthetic */ Map access$1300() {
    }

    public static /* synthetic */ String access$1400(ProgressiveMediaPeriod progressiveMediaPeriod) {
    }

    public static /* synthetic */ IcyHeaders access$700(ProgressiveMediaPeriod progressiveMediaPeriod) {
    }

    public static /* synthetic */ IcyHeaders access$702(ProgressiveMediaPeriod progressiveMediaPeriod, IcyHeaders icyHeaders) {
    }

    public static /* synthetic */ Format access$800() {
    }

    public static /* synthetic */ long access$900(ProgressiveMediaPeriod progressiveMediaPeriod) {
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private void assertPrepared() {
    }

    private /* synthetic */ void b() {
    }

    private boolean configureRetry(ExtractingLoadable loadable, int currentExtractedSampleCount) {
    }

    private void copyLengthFromLoader(ExtractingLoadable loadable) {
    }

    private static Map<String, String> createIcyMetadataHeaders() {
    }

    private /* synthetic */ void d(SeekMap seekMap) {
    }

    private int getExtractedSamplesCount() {
    }

    private long getLargestQueuedTimestampUs() {
    }

    private boolean isPendingReset() {
    }

    private void maybeFinishPrepare() {
    }

    private void maybeNotifyDownstreamFormat(int track) {
    }

    private void maybeStartDeferredRetry(int track) {
    }

    private TrackOutput prepareTrackOutput(TrackId id) {
    }

    private boolean seekInsideBufferUs(boolean[] trackIsAudioVideoFlags, long positionUs) {
    }

    private void setSeekMap(SeekMap seekMap) {
    }

    private void startLoading() {
    }

    private boolean suppressRead() {
    }

    public /* synthetic */ void c() {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long playbackPositionUs) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long positionUs, boolean toKeyframe) {
    }

    public /* synthetic */ void e(SeekMap seekMap) {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void endTracks() {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long positionUs, SeekParameters seekParameters) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public /* synthetic */ List getStreamKeys(List list) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
    }

    public TrackOutput icyTrack() {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
    }

    public boolean isReady(int track) {
    }

    public void maybeThrowError(int sampleQueueIndex) throws IOException {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ void onLoadCanceled(ExtractingLoadable loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ void onLoadCompleted(ExtractingLoadable loadable, long elapsedRealtimeMs, long loadDurationMs) {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public /* bridge */ /* synthetic */ Loader.LoadErrorAction onLoadError(ExtractingLoadable loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
    }

    @Override // com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener
    public void onUpstreamFormatChanged(Format format) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long positionUs) {
    }

    public int readData(int sampleQueueIndex, FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long positionUs) {
    }

    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long positionUs) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] selections, boolean[] mayRetainStreamFlags, SampleStream[] streams, boolean[] streamResetFlags, long positionUs) {
    }

    public int skipData(int track, long positionUs) {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public TrackOutput track(int id, int type) {
    }

    /* renamed from: onLoadCanceled  reason: avoid collision after fix types in other method */
    public void onLoadCanceled2(ExtractingLoadable loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
    }

    /* renamed from: onLoadCompleted  reason: avoid collision after fix types in other method */
    public void onLoadCompleted2(ExtractingLoadable loadable, long elapsedRealtimeMs, long loadDurationMs) {
    }

    /* renamed from: onLoadError  reason: avoid collision after fix types in other method */
    public Loader.LoadErrorAction onLoadError2(ExtractingLoadable loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
    }

    public void maybeThrowError() throws IOException {
    }
}
