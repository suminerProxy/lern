package com.google.android.exoplayer2;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class PlaybackInfo {
    private static final MediaSource.MediaPeriodId PLACEHOLDER_MEDIA_PERIOD_ID = null;
    public volatile long bufferedPositionUs;
    public final long discontinuityStartPositionUs;
    public final boolean isLoading;
    public final MediaSource.MediaPeriodId loadingMediaPeriodId;
    public final boolean offloadSchedulingEnabled;
    public final MediaSource.MediaPeriodId periodId;
    public final boolean playWhenReady;
    @Nullable
    public final ExoPlaybackException playbackError;
    public final PlaybackParameters playbackParameters;
    public final int playbackState;
    public final int playbackSuppressionReason;
    public volatile long positionUs;
    public final long requestedContentPositionUs;
    public final boolean sleepingForOffload;
    public final List<Metadata> staticMetadata;
    public final Timeline timeline;
    public volatile long totalBufferedDurationUs;
    public final TrackGroupArray trackGroups;
    public final TrackSelectorResult trackSelectorResult;

    public PlaybackInfo(Timeline timeline, MediaSource.MediaPeriodId periodId, long requestedContentPositionUs, long discontinuityStartPositionUs, int playbackState, @Nullable ExoPlaybackException playbackError, boolean isLoading, TrackGroupArray trackGroups, TrackSelectorResult trackSelectorResult, List<Metadata> staticMetadata, MediaSource.MediaPeriodId loadingMediaPeriodId, boolean playWhenReady, int playbackSuppressionReason, PlaybackParameters playbackParameters, long bufferedPositionUs, long totalBufferedDurationUs, long positionUs, boolean offloadSchedulingEnabled, boolean sleepingForOffload) {
    }

    public static PlaybackInfo createDummy(TrackSelectorResult emptyTrackSelectorResult) {
    }

    public static MediaSource.MediaPeriodId getDummyPeriodForEmptyTimeline() {
    }

    @CheckResult
    public PlaybackInfo copyWithIsLoading(boolean isLoading) {
    }

    @CheckResult
    public PlaybackInfo copyWithLoadingMediaPeriodId(MediaSource.MediaPeriodId loadingMediaPeriodId) {
    }

    @CheckResult
    public PlaybackInfo copyWithNewPosition(MediaSource.MediaPeriodId periodId, long positionUs, long requestedContentPositionUs, long discontinuityStartPositionUs, long totalBufferedDurationUs, TrackGroupArray trackGroups, TrackSelectorResult trackSelectorResult, List<Metadata> staticMetadata) {
    }

    @CheckResult
    public PlaybackInfo copyWithOffloadSchedulingEnabled(boolean offloadSchedulingEnabled) {
    }

    @CheckResult
    public PlaybackInfo copyWithPlayWhenReady(boolean playWhenReady, int playbackSuppressionReason) {
    }

    @CheckResult
    public PlaybackInfo copyWithPlaybackError(@Nullable ExoPlaybackException playbackError) {
    }

    @CheckResult
    public PlaybackInfo copyWithPlaybackParameters(PlaybackParameters playbackParameters) {
    }

    @CheckResult
    public PlaybackInfo copyWithPlaybackState(int playbackState) {
    }

    @CheckResult
    public PlaybackInfo copyWithSleepingForOffload(boolean sleepingForOffload) {
    }

    @CheckResult
    public PlaybackInfo copyWithTimeline(Timeline timeline) {
    }
}
