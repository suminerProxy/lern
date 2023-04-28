package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SinglePeriodTimeline extends Timeline {
    private static final MediaItem MEDIA_ITEM = null;
    private static final Object UID = null;
    private final long elapsedRealtimeEpochOffsetMs;
    private final boolean isDynamic;
    private final boolean isSeekable;
    @Nullable
    private final MediaItem.LiveConfiguration liveConfiguration;
    @Nullable
    private final Object manifest;
    @Nullable
    private final MediaItem mediaItem;
    private final long periodDurationUs;
    private final long presentationStartTimeMs;
    private final boolean suppressPositionProjection;
    private final long windowDefaultStartPositionUs;
    private final long windowDurationUs;
    private final long windowPositionInPeriodUs;
    private final long windowStartTimeMs;

    @Deprecated
    public SinglePeriodTimeline(long durationUs, boolean isSeekable, boolean isDynamic, boolean isLive, @Nullable Object manifest, @Nullable Object tag) {
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getIndexOfPeriod(Object uid) {
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Timeline.Period getPeriod(int periodIndex, Timeline.Period period, boolean setIds) {
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPeriodCount() {
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Object getUidOfPeriod(int periodIndex) {
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Timeline.Window getWindow(int windowIndex, Timeline.Window window, long defaultPositionProjectionUs) {
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getWindowCount() {
    }

    public SinglePeriodTimeline(long durationUs, boolean isSeekable, boolean isDynamic, boolean useLiveConfiguration, @Nullable Object manifest, MediaItem mediaItem) {
    }

    @Deprecated
    public SinglePeriodTimeline(long periodDurationUs, long windowDurationUs, long windowPositionInPeriodUs, long windowDefaultStartPositionUs, boolean isSeekable, boolean isDynamic, boolean isLive, @Nullable Object manifest, @Nullable Object tag) {
    }

    public SinglePeriodTimeline(long periodDurationUs, long windowDurationUs, long windowPositionInPeriodUs, long windowDefaultStartPositionUs, boolean isSeekable, boolean isDynamic, boolean useLiveConfiguration, @Nullable Object manifest, MediaItem mediaItem) {
    }

    @Deprecated
    public SinglePeriodTimeline(long presentationStartTimeMs, long windowStartTimeMs, long elapsedRealtimeEpochOffsetMs, long periodDurationUs, long windowDurationUs, long windowPositionInPeriodUs, long windowDefaultStartPositionUs, boolean isSeekable, boolean isDynamic, boolean isLive, @Nullable Object manifest, @Nullable Object tag) {
    }

    @Deprecated
    public SinglePeriodTimeline(long presentationStartTimeMs, long windowStartTimeMs, long elapsedRealtimeEpochOffsetMs, long periodDurationUs, long windowDurationUs, long windowPositionInPeriodUs, long windowDefaultStartPositionUs, boolean isSeekable, boolean isDynamic, @Nullable Object manifest, MediaItem mediaItem, @Nullable MediaItem.LiveConfiguration liveConfiguration) {
    }

    public SinglePeriodTimeline(long presentationStartTimeMs, long windowStartTimeMs, long elapsedRealtimeEpochOffsetMs, long periodDurationUs, long windowDurationUs, long windowPositionInPeriodUs, long windowDefaultStartPositionUs, boolean isSeekable, boolean isDynamic, boolean suppressPositionProjection, @Nullable Object manifest, MediaItem mediaItem, @Nullable MediaItem.LiveConfiguration liveConfiguration) {
    }
}
