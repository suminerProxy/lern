package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MaskingMediaSource extends CompositeMediaSource<Void> {
    private boolean hasRealTimeline;
    private boolean hasStartedPreparing;
    private boolean isPrepared;
    private final MediaSource mediaSource;
    private final Timeline.Period period;
    private MaskingTimeline timeline;
    @Nullable
    private MaskingMediaPeriod unpreparedMaskingMediaPeriod;
    private final boolean useLazyPreparation;
    private final Timeline.Window window;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class MaskingTimeline extends ForwardingTimeline {
        public static final Object MASKING_EXTERNAL_PERIOD_UID = null;
        @Nullable
        private final Object replacedInternalPeriodUid;
        @Nullable
        private final Object replacedInternalWindowUid;

        private MaskingTimeline(Timeline timeline, @Nullable Object replacedInternalWindowUid, @Nullable Object replacedInternalPeriodUid) {
        }

        public static /* synthetic */ Object access$000(MaskingTimeline maskingTimeline) {
        }

        public static MaskingTimeline createWithPlaceholderTimeline(MediaItem mediaItem) {
        }

        public static MaskingTimeline createWithRealTimeline(Timeline timeline, @Nullable Object firstWindowUid, @Nullable Object firstPeriodUid) {
        }

        public MaskingTimeline cloneWithUpdatedTimeline(Timeline timeline) {
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object uid) {
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int periodIndex, Timeline.Period period, boolean setIds) {
        }

        public Timeline getTimeline() {
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int periodIndex) {
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int windowIndex, Timeline.Window window, long defaultPositionProjectionUs) {
        }
    }

    @VisibleForTesting
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class PlaceholderTimeline extends Timeline {
        private final MediaItem mediaItem;

        public PlaceholderTimeline(MediaItem mediaItem) {
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
    }

    public MaskingMediaSource(MediaSource mediaSource, boolean useLazyPreparation) {
    }

    private Object getExternalPeriodUid(Object internalPeriodUid) {
    }

    private Object getInternalPeriodUid(Object externalPeriodUid) {
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private void setPreparePositionOverrideToUnpreparedMaskingPeriod(long preparePositionOverrideUs) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public /* bridge */ /* synthetic */ MediaPeriod createPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    @Nullable
    public /* bridge */ /* synthetic */ MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Void id, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    public Timeline getTimeline() {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public /* bridge */ /* synthetic */ void onChildSourceInfoRefreshed(Void id, MediaSource mediaSource, Timeline newTimeline) {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener mediaTransferListener) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MaskingMediaPeriod createPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
    }

    @Nullable
    /* renamed from: getMediaPeriodIdForChildMediaPeriodId  reason: avoid collision after fix types in other method */
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId2(Void id, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    /* renamed from: onChildSourceInfoRefreshed  reason: avoid collision after fix types in other method */
    public void onChildSourceInfoRefreshed2(Void id, MediaSource mediaSource, Timeline newTimeline) {
    }
}
