package com.google.android.exoplayer2;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.common.collect.ImmutableList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MediaPeriodQueue {
    private static final int MAXIMUM_BUFFER_AHEAD_PERIODS = 100;
    @Nullable
    private final AnalyticsCollector analyticsCollector;
    private final Handler analyticsCollectorHandler;
    private int length;
    @Nullable
    private MediaPeriodHolder loading;
    private long nextWindowSequenceNumber;
    @Nullable
    private Object oldFrontPeriodUid;
    private long oldFrontPeriodWindowSequenceNumber;
    private final Timeline.Period period;
    @Nullable
    private MediaPeriodHolder playing;
    @Nullable
    private MediaPeriodHolder reading;
    private int repeatMode;
    private boolean shuffleModeEnabled;
    private final Timeline.Window window;

    public MediaPeriodQueue(@Nullable AnalyticsCollector analyticsCollector, Handler analyticsCollectorHandler) {
    }

    private /* synthetic */ void a(ImmutableList.Builder builder, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    private boolean areDurationsCompatible(long previousDurationUs, long newDurationUs) {
    }

    private boolean canKeepMediaPeriodHolder(MediaPeriodInfo oldInfo, MediaPeriodInfo newInfo) {
    }

    @Nullable
    private MediaPeriodInfo getFirstMediaPeriodInfo(PlaybackInfo playbackInfo) {
    }

    @Nullable
    private MediaPeriodInfo getFollowingMediaPeriodInfo(Timeline timeline, MediaPeriodHolder mediaPeriodHolder, long rendererPositionUs) {
    }

    @Nullable
    private MediaPeriodInfo getMediaPeriodInfo(Timeline timeline, MediaSource.MediaPeriodId id, long requestedContentPositionUs, long startPositionUs) {
    }

    private MediaPeriodInfo getMediaPeriodInfoForAd(Timeline timeline, Object periodUid, int adGroupIndex, int adIndexInAdGroup, long contentPositionUs, long windowSequenceNumber) {
    }

    private MediaPeriodInfo getMediaPeriodInfoForContent(Timeline timeline, Object periodUid, long startPositionUs, long requestedContentPositionUs, long windowSequenceNumber) {
    }

    private long getMinStartPositionAfterAdGroupUs(Timeline timeline, Object periodUid, int adGroupIndex) {
    }

    private boolean isLastInPeriod(MediaSource.MediaPeriodId id) {
    }

    private boolean isLastInTimeline(Timeline timeline, MediaSource.MediaPeriodId id, boolean isLastMediaPeriodInPeriod) {
    }

    private boolean isLastInWindow(Timeline timeline, MediaSource.MediaPeriodId id) {
    }

    private void notifyQueueUpdate() {
    }

    private long resolvePeriodIndexToWindowSequenceNumber(Timeline timeline, Object periodUid) {
    }

    private boolean updateForPlaybackModeChange(Timeline timeline) {
    }

    @Nullable
    public MediaPeriodHolder advancePlayingPeriod() {
    }

    public MediaPeriodHolder advanceReadingPeriod() {
    }

    public /* synthetic */ void b(ImmutableList.Builder builder, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    public void clear() {
    }

    public MediaPeriodHolder enqueueNextMediaPeriodHolder(RendererCapabilities[] rendererCapabilities, TrackSelector trackSelector, Allocator allocator, MediaSourceList mediaSourceList, MediaPeriodInfo info, TrackSelectorResult emptyTrackSelectorResult) {
    }

    @Nullable
    public MediaPeriodHolder getLoadingPeriod() {
    }

    @Nullable
    public MediaPeriodInfo getNextMediaPeriodInfo(long rendererPositionUs, PlaybackInfo playbackInfo) {
    }

    @Nullable
    public MediaPeriodHolder getPlayingPeriod() {
    }

    @Nullable
    public MediaPeriodHolder getReadingPeriod() {
    }

    public MediaPeriodInfo getUpdatedMediaPeriodInfo(Timeline timeline, MediaPeriodInfo info) {
    }

    public boolean isLoading(MediaPeriod mediaPeriod) {
    }

    public void reevaluateBuffer(long rendererPositionUs) {
    }

    public boolean removeAfter(MediaPeriodHolder mediaPeriodHolder) {
    }

    public MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(Timeline timeline, Object periodUid, long positionUs) {
    }

    public boolean shouldLoadNextMediaPeriod() {
    }

    public boolean updateQueuedPeriods(Timeline timeline, long rendererPositionUs, long maxRendererReadPositionUs) {
    }

    public boolean updateRepeatMode(Timeline timeline, int repeatMode) {
    }

    public boolean updateShuffleModeEnabled(Timeline timeline, boolean shuffleModeEnabled) {
    }

    private static MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(Timeline timeline, Object periodUid, long positionUs, long windowSequenceNumber, Timeline.Period period) {
    }
}
