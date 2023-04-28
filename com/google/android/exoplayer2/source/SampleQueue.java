package com.google.android.exoplayer2.source;

import android.os.Looper;
import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class SampleQueue implements TrackOutput {
    @VisibleForTesting
    public static final int SAMPLE_CAPACITY_INCREMENT = 1000;
    private static final String TAG = "SampleQueue";
    private int absoluteFirstIndex;
    private int capacity;
    private TrackOutput.CryptoData[] cryptoDatas;
    @Nullable
    private DrmSession currentDrmSession;
    @Nullable
    private Format downstreamFormat;
    @Nullable
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    @Nullable
    private final DrmSessionManager drmSessionManager;
    private final SampleExtrasHolder extrasHolder;
    private int[] flags;
    private boolean isLastSampleQueued;
    private long largestDiscardedTimestampUs;
    private long largestQueuedTimestampUs;
    private int length;
    private boolean loggedUnexpectedNonSyncSample;
    private long[] offsets;
    private boolean pendingSplice;
    @Nullable
    private final Looper playbackLooper;
    private int readPosition;
    private int relativeFirstIndex;
    private final SampleDataQueue sampleDataQueue;
    private long sampleOffsetUs;
    private final SpannedData<SharedSampleMetadata> sharedSampleMetadata;
    private int[] sizes;
    private int[] sourceIds;
    private long startTimeUs;
    private long[] timesUs;
    @Nullable
    private Format unadjustedUpstreamFormat;
    private boolean upstreamAllSamplesAreSyncSamples;
    @Nullable
    private Format upstreamFormat;
    private boolean upstreamFormatAdjustmentRequired;
    @Nullable
    private UpstreamFormatChangedListener upstreamFormatChangeListener;
    private boolean upstreamFormatRequired;
    private boolean upstreamKeyframeRequired;
    private int upstreamSourceId;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SampleExtrasHolder {
        @Nullable
        public TrackOutput.CryptoData cryptoData;
        public long offset;
        public int size;
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SharedSampleMetadata {
        public final DrmSessionManager.DrmSessionReference drmSessionReference;
        public final Format format;

        public /* synthetic */ SharedSampleMetadata(Format format, DrmSessionManager.DrmSessionReference drmSessionReference, AnonymousClass1 anonymousClass1) {
        }

        private SharedSampleMetadata(Format format, DrmSessionManager.DrmSessionReference drmSessionReference) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface UpstreamFormatChangedListener {
        void onUpstreamFormatChanged(Format format);
    }

    public SampleQueue(Allocator allocator, @Nullable Looper playbackLooper, @Nullable DrmSessionManager drmSessionManager, @Nullable DrmSessionEventListener.EventDispatcher drmEventDispatcher) {
    }

    public static /* synthetic */ void a(SharedSampleMetadata sharedSampleMetadata) {
    }

    private synchronized boolean attemptSplice(long timeUs) {
    }

    private synchronized void commitSample(long timeUs, int sampleFlags, long offset, int size, @Nullable TrackOutput.CryptoData cryptoData) {
    }

    private int countUnreadSamplesBefore(long timeUs) {
    }

    public static SampleQueue createWithDrm(Allocator allocator, Looper playbackLooper, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher drmEventDispatcher) {
    }

    public static SampleQueue createWithoutDrm(Allocator allocator) {
    }

    private synchronized long discardSampleMetadataTo(long timeUs, boolean toKeyframe, boolean stopAtReadPosition) {
    }

    private synchronized long discardSampleMetadataToEnd() {
    }

    @GuardedBy("this")
    private long discardSamples(int discardCount) {
    }

    private long discardUpstreamSampleMetadata(int discardFromIndex) {
    }

    private int findSampleBefore(int relativeStartIndex, int length, long timeUs, boolean keyframe) {
    }

    private long getLargestTimestamp(int length) {
    }

    private int getRelativeIndex(int offset) {
    }

    private boolean hasNextSample() {
    }

    private boolean mayReadSample(int relativeReadIndex) {
    }

    private void onFormatResult(Format newFormat, FormatHolder outputFormatHolder) {
    }

    private synchronized int peekSampleMetadata(FormatHolder formatHolder, DecoderInputBuffer buffer, boolean formatRequired, boolean loadingFinished, SampleExtrasHolder extrasHolder) {
    }

    private void releaseDrmSessionReferences() {
    }

    private synchronized void rewind() {
    }

    private synchronized boolean setUpstreamFormat(Format format) {
    }

    public synchronized long discardSampleMetadataToRead() {
    }

    public final void discardTo(long timeUs, boolean toKeyframe, boolean stopAtReadPosition) {
    }

    public final void discardToEnd() {
    }

    public final void discardToRead() {
    }

    public final void discardUpstreamFrom(long timeUs) {
    }

    public final void discardUpstreamSamples(int discardFromIndex) {
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void format(Format unadjustedUpstreamFormat) {
    }

    @CallSuper
    public Format getAdjustedUpstreamFormat(Format format) {
    }

    public final int getFirstIndex() {
    }

    public final synchronized long getFirstTimestampUs() {
    }

    public final synchronized long getLargestQueuedTimestampUs() {
    }

    public final synchronized long getLargestReadTimestampUs() {
    }

    public final int getReadIndex() {
    }

    public final synchronized int getSkipCount(long timeUs, boolean allowEndOfQueue) {
    }

    @Nullable
    public final synchronized Format getUpstreamFormat() {
    }

    public final int getWriteIndex() {
    }

    public final void invalidateUpstreamFormatAdjustment() {
    }

    public final synchronized boolean isLastSampleQueued() {
    }

    @CallSuper
    public synchronized boolean isReady(boolean loadingFinished) {
    }

    @CallSuper
    public void maybeThrowError() throws IOException {
    }

    public final synchronized int peekSourceId() {
    }

    @CallSuper
    public void preRelease() {
    }

    @CallSuper
    public int read(FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags, boolean loadingFinished) {
    }

    @CallSuper
    public void release() {
    }

    public final void reset() {
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public /* synthetic */ int sampleData(DataReader dataReader, int i2, boolean z) {
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final int sampleData(DataReader input, int length, boolean allowEndOfInput, int sampleDataPart) throws IOException {
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public /* synthetic */ void sampleData(ParsableByteArray parsableByteArray, int i2) {
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public void sampleMetadata(long timeUs, int flags, int size, int offset, @Nullable TrackOutput.CryptoData cryptoData) {
    }

    public final synchronized boolean seekTo(int sampleIndex) {
    }

    public final void setSampleOffsetUs(long sampleOffsetUs) {
    }

    public final void setStartTimeUs(long startTimeUs) {
    }

    public final void setUpstreamFormatChangeListener(@Nullable UpstreamFormatChangedListener listener) {
    }

    public final synchronized void skip(int count) {
    }

    public final void sourceId(int sourceId) {
    }

    public final void splice() {
    }

    @CallSuper
    public void reset(boolean resetUpstreamFormat) {
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void sampleData(ParsableByteArray data, int length, int sampleDataPart) {
    }

    public final synchronized boolean seekTo(long timeUs, boolean allowTimeBeyondBuffer) {
    }
}
