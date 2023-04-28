package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Timeline;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public abstract class ForwardingTimeline extends Timeline {
    public final Timeline timeline;

    public ForwardingTimeline(Timeline timeline) {
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getFirstWindowIndex(boolean shuffleModeEnabled) {
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getIndexOfPeriod(Object uid) {
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getLastWindowIndex(boolean shuffleModeEnabled) {
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getNextWindowIndex(int windowIndex, int repeatMode, boolean shuffleModeEnabled) {
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Timeline.Period getPeriod(int periodIndex, Timeline.Period period, boolean setIds) {
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPeriodCount() {
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPreviousWindowIndex(int windowIndex, int repeatMode, boolean shuffleModeEnabled) {
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
