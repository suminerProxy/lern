package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.ShuffleOrder;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class PlaylistTimeline extends AbstractConcatenatedTimeline {
    private final HashMap<Object, Integer> childIndexByUid;
    private final int[] firstPeriodInChildIndices;
    private final int[] firstWindowInChildIndices;
    private final int periodCount;
    private final Timeline[] timelines;
    private final Object[] uids;
    private final int windowCount;

    public PlaylistTimeline(Collection<? extends MediaSourceInfoHolder> mediaSourceInfoHolders, ShuffleOrder shuffleOrder) {
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

    public List<Timeline> getChildTimelines() {
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
