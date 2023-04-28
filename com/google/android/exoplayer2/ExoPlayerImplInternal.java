package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.DefaultMediaClock;
import com.google.android.exoplayer2.MediaSourceList;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class ExoPlayerImplInternal implements Handler.Callback, MediaPeriod.Callback, TrackSelector.InvalidationListener, MediaSourceList.MediaSourceListInfoRefreshListener, DefaultMediaClock.PlaybackParametersListener, PlayerMessage.Sender {
    private static final int ACTIVE_INTERVAL_MS = 10;
    private static final int IDLE_INTERVAL_MS = 1000;
    private static final long MIN_RENDERER_SLEEP_DURATION_MS = 2000;
    private static final int MSG_ADD_MEDIA_SOURCES = 18;
    private static final int MSG_ATTEMPT_RENDERER_ERROR_RECOVERY = 25;
    private static final int MSG_DO_SOME_WORK = 2;
    private static final int MSG_MOVE_MEDIA_SOURCES = 19;
    private static final int MSG_PERIOD_PREPARED = 8;
    private static final int MSG_PLAYBACK_PARAMETERS_CHANGED_INTERNAL = 16;
    private static final int MSG_PLAYLIST_UPDATE_REQUESTED = 22;
    private static final int MSG_PREPARE = 0;
    private static final int MSG_RELEASE = 7;
    private static final int MSG_REMOVE_MEDIA_SOURCES = 20;
    private static final int MSG_SEEK_TO = 3;
    private static final int MSG_SEND_MESSAGE = 14;
    private static final int MSG_SEND_MESSAGE_TO_TARGET_THREAD = 15;
    private static final int MSG_SET_FOREGROUND_MODE = 13;
    private static final int MSG_SET_MEDIA_SOURCES = 17;
    private static final int MSG_SET_OFFLOAD_SCHEDULING_ENABLED = 24;
    private static final int MSG_SET_PAUSE_AT_END_OF_WINDOW = 23;
    private static final int MSG_SET_PLAYBACK_PARAMETERS = 4;
    private static final int MSG_SET_PLAY_WHEN_READY = 1;
    private static final int MSG_SET_REPEAT_MODE = 11;
    private static final int MSG_SET_SEEK_PARAMETERS = 5;
    private static final int MSG_SET_SHUFFLE_ENABLED = 12;
    private static final int MSG_SET_SHUFFLE_ORDER = 21;
    private static final int MSG_SOURCE_CONTINUE_LOADING_REQUESTED = 9;
    private static final int MSG_STOP = 6;
    private static final int MSG_TRACK_SELECTION_INVALIDATED = 10;
    private static final String TAG = "ExoPlayerImplInternal";
    private final long backBufferDurationUs;
    private final BandwidthMeter bandwidthMeter;
    private final Clock clock;
    private boolean deliverPendingMessageAtStartPositionRequired;
    private final TrackSelectorResult emptyTrackSelectorResult;
    private int enabledRendererCount;
    private boolean foregroundMode;
    private final HandlerWrapper handler;
    private final HandlerThread internalPlaybackThread;
    private boolean isRebuffering;
    private final LivePlaybackSpeedControl livePlaybackSpeedControl;
    private final LoadControl loadControl;
    private final DefaultMediaClock mediaClock;
    private final MediaSourceList mediaSourceList;
    private int nextPendingMessageIndexHint;
    private boolean offloadSchedulingEnabled;
    private boolean pauseAtEndOfWindow;
    @Nullable
    private SeekPosition pendingInitialSeekPosition;
    private final ArrayList<PendingMessageInfo> pendingMessages;
    private boolean pendingPauseAtEndOfPeriod;
    @Nullable
    private ExoPlaybackException pendingRecoverableRendererError;
    private final Timeline.Period period;
    private PlaybackInfo playbackInfo;
    private PlaybackInfoUpdate playbackInfoUpdate;
    private final PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private final Looper playbackLooper;
    private final MediaPeriodQueue queue;
    private final long releaseTimeoutMs;
    private boolean released;
    private final RendererCapabilities[] rendererCapabilities;
    private long rendererPositionUs;
    private final Renderer[] renderers;
    private int repeatMode;
    private boolean requestForRendererSleep;
    private final boolean retainBackBufferFromKeyframe;
    private SeekParameters seekParameters;
    private long setForegroundModeTimeoutMs;
    private boolean shouldContinueLoading;
    private boolean shuffleModeEnabled;
    private final TrackSelector trackSelector;
    private final Timeline.Window window;

    /* renamed from: com.google.android.exoplayer2.ExoPlayerImplInternal$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class AnonymousClass1 implements Renderer.WakeupListener {
        public final /* synthetic */ ExoPlayerImplInternal this$0;

        public AnonymousClass1(final ExoPlayerImplInternal this$0) {
        }

        @Override // com.google.android.exoplayer2.Renderer.WakeupListener
        public void onSleep(long wakeupDeadlineMs) {
        }

        @Override // com.google.android.exoplayer2.Renderer.WakeupListener
        public void onWakeup() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MediaSourceListUpdateMessage {
        private final List<MediaSourceList.MediaSourceHolder> mediaSourceHolders;
        private final long positionUs;
        private final ShuffleOrder shuffleOrder;
        private final int windowIndex;

        public /* synthetic */ MediaSourceListUpdateMessage(List list, ShuffleOrder shuffleOrder, int i2, long j2, AnonymousClass1 anonymousClass1) {
        }

        public static /* synthetic */ int access$200(MediaSourceListUpdateMessage mediaSourceListUpdateMessage) {
        }

        public static /* synthetic */ List access$300(MediaSourceListUpdateMessage mediaSourceListUpdateMessage) {
        }

        public static /* synthetic */ ShuffleOrder access$400(MediaSourceListUpdateMessage mediaSourceListUpdateMessage) {
        }

        public static /* synthetic */ long access$500(MediaSourceListUpdateMessage mediaSourceListUpdateMessage) {
        }

        private MediaSourceListUpdateMessage(List<MediaSourceList.MediaSourceHolder> mediaSourceHolders, ShuffleOrder shuffleOrder, int windowIndex, long positionUs) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static class MoveMediaItemsMessage {
        public final int fromIndex;
        public final int newFromIndex;
        public final ShuffleOrder shuffleOrder;
        public final int toIndex;

        public MoveMediaItemsMessage(int fromIndex, int toIndex, int newFromIndex, ShuffleOrder shuffleOrder) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class PendingMessageInfo implements Comparable<PendingMessageInfo> {
        public final PlayerMessage message;
        public int resolvedPeriodIndex;
        public long resolvedPeriodTimeUs;
        @Nullable
        public Object resolvedPeriodUid;

        public PendingMessageInfo(PlayerMessage message) {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(PendingMessageInfo other) {
        }

        public void setResolvedPosition(int periodIndex, long periodTimeUs, Object periodUid) {
        }

        /* renamed from: compareTo  reason: avoid collision after fix types in other method */
        public int compareTo2(PendingMessageInfo other) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class PlaybackInfoUpdate {
        public int discontinuityReason;
        private boolean hasPendingChange;
        public boolean hasPlayWhenReadyChangeReason;
        public int operationAcks;
        public int playWhenReadyChangeReason;
        public PlaybackInfo playbackInfo;
        public boolean positionDiscontinuity;

        public PlaybackInfoUpdate(PlaybackInfo playbackInfo) {
        }

        public static /* synthetic */ boolean access$100(PlaybackInfoUpdate playbackInfoUpdate) {
        }

        public void incrementPendingOperationAcks(int operationAcks) {
        }

        public void setPlayWhenReadyChangeReason(int playWhenReadyChangeReason) {
        }

        public void setPlaybackInfo(PlaybackInfo playbackInfo) {
        }

        public void setPositionDiscontinuity(int discontinuityReason) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface PlaybackInfoUpdateListener {
        void onPlaybackInfoUpdate(PlaybackInfoUpdate playbackInfo);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class PositionUpdateForPlaylistChange {
        public final boolean endPlayback;
        public final boolean forceBufferingState;
        public final MediaSource.MediaPeriodId periodId;
        public final long periodPositionUs;
        public final long requestedContentPositionUs;
        public final boolean setTargetLiveOffset;

        public PositionUpdateForPlaylistChange(MediaSource.MediaPeriodId periodId, long periodPositionUs, long requestedContentPositionUs, boolean forceBufferingState, boolean endPlayback, boolean setTargetLiveOffset) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SeekPosition {
        public final Timeline timeline;
        public final int windowIndex;
        public final long windowPositionUs;

        public SeekPosition(Timeline timeline, int windowIndex, long windowPositionUs) {
        }
    }

    public ExoPlayerImplInternal(Renderer[] renderers, TrackSelector trackSelector, TrackSelectorResult emptyTrackSelectorResult, LoadControl loadControl, BandwidthMeter bandwidthMeter, int repeatMode, boolean shuffleModeEnabled, @Nullable AnalyticsCollector analyticsCollector, SeekParameters seekParameters, LivePlaybackSpeedControl livePlaybackSpeedControl, long releaseTimeoutMs, boolean pauseAtEndOfWindow, Looper applicationLooper, Clock clock, PlaybackInfoUpdateListener playbackInfoUpdateListener) {
    }

    private /* synthetic */ Boolean a() {
    }

    public static /* synthetic */ boolean access$602(ExoPlayerImplInternal exoPlayerImplInternal, boolean z) {
    }

    public static /* synthetic */ HandlerWrapper access$700(ExoPlayerImplInternal exoPlayerImplInternal) {
    }

    private void addMediaItemsInternal(MediaSourceListUpdateMessage addMessage, int insertionIndex) throws ExoPlaybackException {
    }

    private void attemptRendererErrorRecovery() throws ExoPlaybackException {
    }

    private /* synthetic */ void c(PlayerMessage playerMessage) {
    }

    private void deliverMessage(PlayerMessage message) throws ExoPlaybackException {
    }

    private void disableRenderer(Renderer renderer) throws ExoPlaybackException {
    }

    private void doSomeWork() throws ExoPlaybackException, IOException {
    }

    private void enableRenderer(int rendererIndex, boolean wasRendererEnabled) throws ExoPlaybackException {
    }

    private void enableRenderers() throws ExoPlaybackException {
    }

    private void ensureStopped(Renderer renderer) throws ExoPlaybackException {
    }

    private ImmutableList<Metadata> extractMetadataFromTrackSelectionArray(ExoTrackSelection[] trackSelections) {
    }

    private long getCurrentLiveOffsetUs() {
    }

    private static Format[] getFormats(ExoTrackSelection newSelection) {
    }

    private long getLiveOffsetUs(Timeline timeline, Object periodUid, long periodPositionUs) {
    }

    private long getMaxRendererReadPositionUs() {
    }

    private Pair<MediaSource.MediaPeriodId, Long> getPlaceholderFirstMediaPeriodPosition(Timeline timeline) {
    }

    private long getTotalBufferedDurationUs() {
    }

    private void handleContinueLoadingRequested(MediaPeriod mediaPeriod) {
    }

    private void handleIoException(IOException e2, int errorCode) {
    }

    private void handleLoadingMediaPeriodChanged(boolean loadingTrackSelectionChanged) {
    }

    private void handleMediaSourceListInfoRefreshed(Timeline timeline, boolean isSourceRefresh) throws ExoPlaybackException {
    }

    private void handlePeriodPrepared(MediaPeriod mediaPeriod) throws ExoPlaybackException {
    }

    private void handlePlaybackParameters(PlaybackParameters playbackParameters, boolean acknowledgeCommand) throws ExoPlaybackException {
    }

    @CheckResult
    private PlaybackInfo handlePositionDiscontinuity(MediaSource.MediaPeriodId mediaPeriodId, long positionUs, long contentPositionUs, long discontinuityStartPositionUs, boolean reportDiscontinuity, int discontinuityReason) {
    }

    private boolean hasReachedServerSideInsertedAdsTransition(Renderer renderer, MediaPeriodHolder reading) {
    }

    private boolean hasReadingPeriodFinishedReading() {
    }

    private boolean isLoadingPossible() {
    }

    private static boolean isRendererEnabled(Renderer renderer) {
    }

    private boolean isTimelineReady() {
    }

    private static boolean isUsingPlaceholderPeriod(PlaybackInfo playbackInfo, Timeline.Period period) {
    }

    private void maybeContinueLoading() {
    }

    private void maybeNotifyPlaybackInfoChanged() {
    }

    private boolean maybeScheduleWakeup(long operationStartTimeMs, long intervalMs) {
    }

    private void maybeTriggerPendingMessages(long oldPeriodPositionUs, long newPeriodPositionUs) throws ExoPlaybackException {
    }

    private void maybeUpdateLoadingPeriod() throws ExoPlaybackException {
    }

    private void maybeUpdatePlayingPeriod() throws ExoPlaybackException {
    }

    private void maybeUpdateReadingPeriod() {
    }

    private void maybeUpdateReadingRenderers() throws ExoPlaybackException {
    }

    private void mediaSourceListUpdateRequestedInternal() throws ExoPlaybackException {
    }

    private void moveMediaItemsInternal(MoveMediaItemsMessage moveMediaItemsMessage) throws ExoPlaybackException {
    }

    private void notifyTrackSelectionDiscontinuity() {
    }

    private void notifyTrackSelectionPlayWhenReadyChanged(boolean playWhenReady) {
    }

    private void notifyTrackSelectionRebuffer() {
    }

    private void prepareInternal() {
    }

    private void releaseInternal() {
    }

    private void removeMediaItemsInternal(int fromIndex, int toIndex, ShuffleOrder shuffleOrder) throws ExoPlaybackException {
    }

    private boolean replaceStreamsOrDisableRendererForTransition() throws ExoPlaybackException {
    }

    private void reselectTracksInternal() throws ExoPlaybackException {
    }

    private void resetInternal(boolean resetRenderers, boolean resetPosition, boolean releaseMediaSourceList, boolean resetError) {
    }

    private void resetPendingPauseAtEndOfPeriod() {
    }

    private void resetRendererPosition(long periodPositionUs) throws ExoPlaybackException {
    }

    private static void resolvePendingMessageEndOfStreamPosition(Timeline timeline, PendingMessageInfo messageInfo, Timeline.Window window, Timeline.Period period) {
    }

    private static boolean resolvePendingMessagePosition(PendingMessageInfo pendingMessageInfo, Timeline newTimeline, Timeline previousTimeline, int repeatMode, boolean shuffleModeEnabled, Timeline.Window window, Timeline.Period period) {
    }

    private void resolvePendingMessagePositions(Timeline newTimeline, Timeline previousTimeline) {
    }

    private static PositionUpdateForPlaylistChange resolvePositionForPlaylistChange(Timeline timeline, PlaybackInfo playbackInfo, @Nullable SeekPosition pendingInitialSeekPosition, MediaPeriodQueue queue, int repeatMode, boolean shuffleModeEnabled, Timeline.Window window, Timeline.Period period) {
    }

    @Nullable
    private static Pair<Object, Long> resolveSeekPosition(Timeline timeline, SeekPosition seekPosition, boolean trySubsequentPeriods, int repeatMode, boolean shuffleModeEnabled, Timeline.Window window, Timeline.Period period) {
    }

    @Nullable
    public static Object resolveSubsequentPeriod(Timeline.Window window, Timeline.Period period, int repeatMode, boolean shuffleModeEnabled, Object oldPeriodUid, Timeline oldTimeline, Timeline newTimeline) {
    }

    private void scheduleNextWork(long thisOperationStartTimeMs, long intervalMs) {
    }

    private void seekToCurrentPosition(boolean sendDiscontinuity) throws ExoPlaybackException {
    }

    private void seekToInternal(SeekPosition seekPosition) throws ExoPlaybackException {
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId periodId, long periodPositionUs, boolean forceBufferingState) throws ExoPlaybackException {
    }

    private void sendMessageInternal(PlayerMessage message) throws ExoPlaybackException {
    }

    private void sendMessageToTarget(PlayerMessage message) throws ExoPlaybackException {
    }

    private void sendMessageToTargetThread(final PlayerMessage message) {
    }

    private void setAllRendererStreamsFinal(long streamEndPositionUs) {
    }

    private void setCurrentStreamFinal(Renderer renderer, long streamEndPositionUs) {
    }

    private void setForegroundModeInternal(boolean foregroundMode, @Nullable AtomicBoolean processedFlag) {
    }

    private void setMediaItemsInternal(MediaSourceListUpdateMessage mediaSourceListUpdateMessage) throws ExoPlaybackException {
    }

    private void setOffloadSchedulingEnabledInternal(boolean offloadSchedulingEnabled) {
    }

    private void setPauseAtEndOfWindowInternal(boolean pauseAtEndOfWindow) throws ExoPlaybackException {
    }

    private void setPlayWhenReadyInternal(boolean playWhenReady, int playbackSuppressionReason, boolean operationAck, int reason) throws ExoPlaybackException {
    }

    private void setPlaybackParametersInternal(PlaybackParameters playbackParameters) throws ExoPlaybackException {
    }

    private void setRepeatModeInternal(int repeatMode) throws ExoPlaybackException {
    }

    private void setSeekParametersInternal(SeekParameters seekParameters) {
    }

    private void setShuffleModeEnabledInternal(boolean shuffleModeEnabled) throws ExoPlaybackException {
    }

    private void setShuffleOrderInternal(ShuffleOrder shuffleOrder) throws ExoPlaybackException {
    }

    private void setState(int state) {
    }

    private boolean shouldAdvancePlayingPeriod() {
    }

    private boolean shouldContinueLoading() {
    }

    private boolean shouldPlayWhenReady() {
    }

    private boolean shouldTransitionToReadyState(boolean renderersReadyOrEnded) {
    }

    private boolean shouldUseLivePlaybackSpeedControl(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    private void startRenderers() throws ExoPlaybackException {
    }

    private void stopInternal(boolean forceResetRenderers, boolean acknowledgeStop) {
    }

    private void stopRenderers() throws ExoPlaybackException {
    }

    private void updateIsLoading() {
    }

    private void updateLivePlaybackSpeedControl(Timeline newTimeline, MediaSource.MediaPeriodId newPeriodId, Timeline oldTimeline, MediaSource.MediaPeriodId oldPeriodId, long positionForTargetOffsetOverrideUs) {
    }

    private void updateLoadControlTrackSelection(TrackGroupArray trackGroups, TrackSelectorResult trackSelectorResult) {
    }

    private void updatePeriods() throws ExoPlaybackException, IOException {
    }

    private void updatePlaybackPositions() throws ExoPlaybackException {
    }

    private void updateTrackSelectionPlaybackSpeed(float playbackSpeed) {
    }

    private synchronized void waitUninterruptibly(Supplier<Boolean> condition, long timeoutMs) {
    }

    public void addMediaSources(int index, List<MediaSourceList.MediaSourceHolder> mediaSources, ShuffleOrder shuffleOrder) {
    }

    public /* synthetic */ Boolean b() {
    }

    public /* synthetic */ void d(PlayerMessage playerMessage) {
    }

    public void experimentalSetForegroundModeTimeoutMs(long setForegroundModeTimeoutMs) {
    }

    public void experimentalSetOffloadSchedulingEnabled(boolean offloadSchedulingEnabled) {
    }

    public Looper getPlaybackLooper() {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message msg) {
    }

    public void moveMediaSources(int fromIndex, int toIndex, int newFromIndex, ShuffleOrder shuffleOrder) {
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public /* bridge */ /* synthetic */ void onContinueLoadingRequested(MediaPeriod source) {
    }

    @Override // com.google.android.exoplayer2.DefaultMediaClock.PlaybackParametersListener
    public void onPlaybackParametersChanged(PlaybackParameters newPlaybackParameters) {
    }

    @Override // com.google.android.exoplayer2.MediaSourceList.MediaSourceListInfoRefreshListener
    public void onPlaylistUpdateRequested() {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod source) {
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
    }

    public void prepare() {
    }

    public synchronized boolean release() {
    }

    public void removeMediaSources(int fromIndex, int toIndex, ShuffleOrder shuffleOrder) {
    }

    public void seekTo(Timeline timeline, int windowIndex, long positionUs) {
    }

    @Override // com.google.android.exoplayer2.PlayerMessage.Sender
    public synchronized void sendMessage(PlayerMessage message) {
    }

    public synchronized boolean setForegroundMode(boolean foregroundMode) {
    }

    public void setMediaSources(List<MediaSourceList.MediaSourceHolder> mediaSources, int windowIndex, long positionUs, ShuffleOrder shuffleOrder) {
    }

    public void setPauseAtEndOfWindow(boolean pauseAtEndOfWindow) {
    }

    public void setPlayWhenReady(boolean playWhenReady, int playbackSuppressionReason) {
    }

    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
    }

    public void setRepeatMode(int repeatMode) {
    }

    public void setSeekParameters(SeekParameters seekParameters) {
    }

    public void setShuffleModeEnabled(boolean shuffleModeEnabled) {
    }

    public void setShuffleOrder(ShuffleOrder shuffleOrder) {
    }

    public void stop() {
    }

    private void enableRenderers(boolean[] rendererWasEnabledFlags) throws ExoPlaybackException {
    }

    private long getTotalBufferedDurationUs(long bufferedPositionInLoadingPeriodUs) {
    }

    private void handlePlaybackParameters(PlaybackParameters playbackParameters, float currentPlaybackSpeed, boolean updatePlaybackInfo, boolean acknowledgeCommand) throws ExoPlaybackException {
    }

    /* renamed from: onContinueLoadingRequested  reason: avoid collision after fix types in other method */
    public void onContinueLoadingRequested2(MediaPeriod source) {
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId periodId, long periodPositionUs, boolean forceDisableRenderers, boolean forceBufferingState) throws ExoPlaybackException {
    }
}
