package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ShuffleOrder;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class AbstractConcatenatedTimeline extends Timeline {
    private final int childCount;
    private final boolean isAtomic;
    private final ShuffleOrder shuffleOrder;

    public AbstractConcatenatedTimeline(boolean isAtomic, ShuffleOrder shuffleOrder) {
    }

    public static Object getChildPeriodUidFromConcatenatedUid(Object concatenatedUid) {
    }

    public static Object getChildTimelineUidFromConcatenatedUid(Object concatenatedUid) {
    }

    public static Object getConcatenatedUid(Object childTimelineUid, Object childPeriodOrWindowUid) {
    }

    private int getNextChildIndex(int childIndex, boolean shuffleModeEnabled) {
    }

    private int getPreviousChildIndex(int childIndex, boolean shuffleModeEnabled) {
    }

    public abstract int getChildIndexByChildUid(Object childUid);

    public abstract int getChildIndexByPeriodIndex(int periodIndex);

    public abstract int getChildIndexByWindowIndex(int windowIndex);

    public abstract Object getChildUidByChildIndex(int childIndex);

    public abstract int getFirstPeriodIndexByChildIndex(int childIndex);

    @Override // com.google.android.exoplayer2.Timeline
    public int getFirstWindowIndex(boolean shuffleModeEnabled) {
    }

    public abstract int getFirstWindowIndexByChildIndex(int childIndex);

    @Override // com.google.android.exoplayer2.Timeline
    public final int getIndexOfPeriod(Object uid) {
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getLastWindowIndex(boolean shuffleModeEnabled) {
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getNextWindowIndex(int windowIndex, int repeatMode, boolean shuffleModeEnabled) {
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Timeline.Period getPeriod(int periodIndex, Timeline.Period period, boolean setIds) {
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Timeline.Period getPeriodByUid(Object periodUid, Timeline.Period period) {
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPreviousWindowIndex(int windowIndex, int repeatMode, boolean shuffleModeEnabled) {
    }

    public abstract Timeline getTimelineByChildIndex(int childIndex);

    @Override // com.google.android.exoplayer2.Timeline
    public final Object getUidOfPeriod(int periodIndex) {
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Timeline.Window getWindow(int windowIndex, Timeline.Window window, long defaultPositionProjectionUs) {
    }
}
