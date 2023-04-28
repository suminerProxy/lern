package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractConcatenatedTimeline;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.util.Map;

@Deprecated
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class LoopingMediaSource extends CompositeMediaSource<Void> {
    private final Map<MediaSource.MediaPeriodId, MediaSource.MediaPeriodId> childMediaPeriodIdToMediaPeriodId;
    private final int loopCount;
    private final MaskingMediaSource maskingMediaSource;
    private final Map<MediaPeriod, MediaSource.MediaPeriodId> mediaPeriodToChildMediaPeriodId;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class InfinitelyLoopingTimeline extends ForwardingTimeline {
        public InfinitelyLoopingTimeline(Timeline timeline) {
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public int getNextWindowIndex(int windowIndex, int repeatMode, boolean shuffleModeEnabled) {
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public int getPreviousWindowIndex(int windowIndex, int repeatMode, boolean shuffleModeEnabled) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class LoopingTimeline extends AbstractConcatenatedTimeline {
        private final int childPeriodCount;
        private final Timeline childTimeline;
        private final int childWindowCount;
        private final int loopCount;

        public LoopingTimeline(Timeline childTimeline, int loopCount) {
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public int getChildIndexByChildUid(Object childUid) {
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public int getChildIndexByPeriodIndex(int periodIndex) {
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public int getChildIndexByWindowIndex(int windowIndex) {
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public Object getChildUidByChildIndex(int childIndex) {
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public int getFirstPeriodIndexByChildIndex(int childIndex) {
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public int getFirstWindowIndexByChildIndex(int childIndex) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public Timeline getTimelineByChildIndex(int childIndex) {
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
        }
    }

    public LoopingMediaSource(MediaSource childSource) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    @Nullable
    public Timeline getInitialTimeline() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    @Nullable
    public /* bridge */ /* synthetic */ MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Void id, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    public boolean isSingleWindow() {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public /* bridge */ /* synthetic */ void onChildSourceInfoRefreshed(Void id, MediaSource mediaSource, Timeline timeline) {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener mediaTransferListener) {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
    }

    public LoopingMediaSource(MediaSource childSource, int loopCount) {
    }

    @Nullable
    /* renamed from: getMediaPeriodIdForChildMediaPeriodId  reason: avoid collision after fix types in other method */
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId2(Void id, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    /* renamed from: onChildSourceInfoRefreshed  reason: avoid collision after fix types in other method */
    public void onChildSourceInfoRefreshed2(Void id, MediaSource mediaSource, Timeline timeline) {
    }
}
