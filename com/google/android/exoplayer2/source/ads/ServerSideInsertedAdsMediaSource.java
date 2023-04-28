package com.google.android.exoplayer2.source.ads;

import android.os.Handler;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.ForwardingTimeline;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.common.collect.ListMultimap;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ServerSideInsertedAdsMediaSource extends BaseMediaSource implements MediaSource.MediaSourceCaller, MediaSourceEventListener, DrmSessionEventListener {
    private AdPlaybackState adPlaybackState;
    @Nullable
    private Timeline contentTimeline;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcherWithoutId;
    @Nullable
    private SharedMediaPeriod lastUsedMediaPeriod;
    private final ListMultimap<Long, SharedMediaPeriod> mediaPeriods;
    private final MediaSource mediaSource;
    private final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcherWithoutId;
    @Nullable
    @GuardedBy("this")
    private Handler playbackHandler;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MediaPeriodImpl implements MediaPeriod {
        public MediaPeriod.Callback callback;
        public final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
        public boolean[] hasNotifiedDownstreamFormatChange;
        public long lastStartPositionUs;
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
        public final SharedMediaPeriod sharedPeriod;

        public MediaPeriodImpl(SharedMediaPeriod sharedPeriod, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher, DrmSessionEventListener.EventDispatcher drmEventDispatcher) {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean continueLoading(long positionUs) {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void discardBuffer(long positionUs, boolean toKeyframe) {
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
        public List<StreamKey> getStreamKeys(List<ExoTrackSelection> trackSelections) {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public TrackGroupArray getTrackGroups() {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean isLoading() {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void maybeThrowPrepareError() throws IOException {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void prepare(MediaPeriod.Callback callback, long positionUs) {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long readDiscontinuity() {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public void reevaluateBuffer(long positionUs) {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long seekToUs(long positionUs) {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long selectTracks(ExoTrackSelection[] selections, boolean[] mayRetainStreamFlags, SampleStream[] streams, boolean[] streamResetFlags, long positionUs) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SampleStreamImpl implements SampleStream {
        private final MediaPeriodImpl mediaPeriod;
        private final int streamIndex;

        public SampleStreamImpl(MediaPeriodImpl mediaPeriod, int streamIndex) {
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
    public static final class ServerSideInsertedAdsTimeline extends ForwardingTimeline {
        private final AdPlaybackState adPlaybackState;

        public ServerSideInsertedAdsTimeline(Timeline contentTimeline, AdPlaybackState adPlaybackState) {
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int periodIndex, Timeline.Period period, boolean setIds) {
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int windowIndex, Timeline.Window window, long defaultPositionProjectionUs) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SharedMediaPeriod implements MediaPeriod.Callback {
        private final Map<Long, Pair<LoadEventInfo, MediaLoadData>> activeLoads;
        private final MediaPeriod actualMediaPeriod;
        private AdPlaybackState adPlaybackState;
        private boolean hasStartedPreparing;
        private boolean isPrepared;
        public MediaLoadData[] lastDownstreamFormatChangeData;
        @Nullable
        private MediaPeriodImpl loadingPeriod;
        private final List<MediaPeriodImpl> mediaPeriods;
        public SampleStream[] sampleStreams;
        public ExoTrackSelection[] trackSelections;

        public SharedMediaPeriod(MediaPeriod actualMediaPeriod, AdPlaybackState adPlaybackState) {
        }

        public static /* synthetic */ MediaPeriodImpl access$000(SharedMediaPeriod sharedMediaPeriod) {
        }

        public static /* synthetic */ List access$100(SharedMediaPeriod sharedMediaPeriod) {
        }

        private int findMatchingStreamIndex(MediaLoadData mediaLoadData) {
        }

        private long getMediaPeriodPositionUsWithEndOfSourceHandling(MediaPeriodImpl mediaPeriod, long positionUs) {
        }

        private long getStreamPositionUsWithNotYetStartedHandling(MediaPeriodImpl mediaPeriod, long positionUs) {
        }

        private void maybeNotifyDownstreamFormatChanged(MediaPeriodImpl mediaPeriod, int streamIndex) {
        }

        public void add(MediaPeriodImpl mediaPeriod) {
        }

        public boolean canReuseMediaPeriod(MediaSource.MediaPeriodId id, long positionUs) {
        }

        public boolean continueLoading(MediaPeriodImpl mediaPeriod, long positionUs) {
        }

        public void discardBuffer(MediaPeriodImpl mediaPeriod, long positionUs, boolean toKeyframe) {
        }

        public long getAdjustedSeekPositionUs(MediaPeriodImpl mediaPeriod, long positionUs, SeekParameters seekParameters) {
        }

        public long getBufferedPositionUs(MediaPeriodImpl mediaPeriod) {
        }

        @Nullable
        public MediaPeriodImpl getMediaPeriodForEvent(@Nullable MediaLoadData mediaLoadData) {
        }

        public long getNextLoadPositionUs(MediaPeriodImpl mediaPeriod) {
        }

        public List<StreamKey> getStreamKeys(List<ExoTrackSelection> trackSelections) {
        }

        public TrackGroupArray getTrackGroups() {
        }

        public boolean isLoading(MediaPeriodImpl mediaPeriod) {
        }

        public boolean isReady(int streamIndex) {
        }

        public boolean isUnused() {
        }

        public void maybeThrowError(int streamIndex) throws IOException {
        }

        public void maybeThrowPrepareError() throws IOException {
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
        public /* bridge */ /* synthetic */ void onContinueLoadingRequested(MediaPeriod source) {
        }

        public void onDownstreamFormatChanged(MediaPeriodImpl mediaPeriod, MediaLoadData mediaLoadData) {
        }

        public void onLoadFinished(LoadEventInfo loadEventInfo) {
        }

        public void onLoadStarted(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
        public void onPrepared(MediaPeriod actualMediaPeriod) {
        }

        public void prepare(MediaPeriodImpl mediaPeriod, long positionUs) {
        }

        public int readData(MediaPeriodImpl mediaPeriod, int streamIndex, FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags) {
        }

        public long readDiscontinuity(MediaPeriodImpl mediaPeriod) {
        }

        public void reevaluateBuffer(MediaPeriodImpl mediaPeriod, long positionUs) {
        }

        public void release(MediaSource mediaSource) {
        }

        public void remove(MediaPeriodImpl mediaPeriod) {
        }

        public long seekToUs(MediaPeriodImpl mediaPeriod, long positionUs) {
        }

        public long selectTracks(MediaPeriodImpl mediaPeriod, ExoTrackSelection[] selections, boolean[] mayRetainStreamFlags, SampleStream[] streams, boolean[] streamResetFlags, long positionUs) {
        }

        public int skipData(MediaPeriodImpl mediaPeriod, int streamIndex, long positionUs) {
        }

        public void updateAdPlaybackState(AdPlaybackState adPlaybackState) {
        }

        /* renamed from: onContinueLoadingRequested  reason: avoid collision after fix types in other method */
        public void onContinueLoadingRequested2(MediaPeriod source) {
        }
    }

    public ServerSideInsertedAdsMediaSource(MediaSource mediaSource) {
    }

    private /* synthetic */ void a(AdPlaybackState adPlaybackState) {
    }

    public static /* synthetic */ long access$200(MediaPeriodImpl mediaPeriodImpl, AdPlaybackState adPlaybackState) {
    }

    public static /* synthetic */ MediaLoadData access$300(MediaPeriodImpl mediaPeriodImpl, MediaLoadData mediaLoadData, AdPlaybackState adPlaybackState) {
    }

    private static MediaLoadData correctMediaLoadData(MediaPeriodImpl mediaPeriod, MediaLoadData mediaLoadData, AdPlaybackState adPlaybackState) {
    }

    private static long correctMediaLoadDataPositionMs(long mediaPositionMs, MediaPeriodImpl mediaPeriod, AdPlaybackState adPlaybackState) {
    }

    private static long getMediaPeriodEndPositionUs(MediaPeriodImpl mediaPeriod, AdPlaybackState adPlaybackState) {
    }

    @Nullable
    private MediaPeriodImpl getMediaPeriodForEvent(@Nullable MediaSource.MediaPeriodId mediaPeriodId, @Nullable MediaLoadData mediaLoadData, boolean useLoadingPeriod) {
    }

    private void releaseLastUsedMediaPeriod() {
    }

    public /* synthetic */ void b(AdPlaybackState adPlaybackState) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void disableInternal() {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void enableInternal() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onDownstreamFormatChanged(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmKeysLoaded(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmKeysRemoved(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmKeysRestored(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public /* synthetic */ void onDrmSessionAcquired(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmSessionAcquired(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, int state) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmSessionManagerError(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception error) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmSessionReleased(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onLoadCanceled(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onLoadCompleted(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onLoadError(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException error, boolean wasCanceled) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onLoadStarted(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
    public void onSourceInfoRefreshed(MediaSource source, Timeline timeline) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onUpstreamDiscarded(int windowIndex, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
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

    public void setAdPlaybackState(AdPlaybackState adPlaybackState) {
    }
}
