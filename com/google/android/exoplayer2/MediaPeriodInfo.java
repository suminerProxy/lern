package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.MediaSource;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MediaPeriodInfo {
    public final long durationUs;
    public final long endPositionUs;
    public final MediaSource.MediaPeriodId id;
    public final boolean isFinal;
    public final boolean isFollowedByTransitionToSameStream;
    public final boolean isLastInTimelinePeriod;
    public final boolean isLastInTimelineWindow;
    public final long requestedContentPositionUs;
    public final long startPositionUs;

    public MediaPeriodInfo(MediaSource.MediaPeriodId id, long startPositionUs, long requestedContentPositionUs, long endPositionUs, long durationUs, boolean isFollowedByTransitionToSameStream, boolean isLastInTimelinePeriod, boolean isLastInTimelineWindow, boolean isFinal) {
    }

    public MediaPeriodInfo copyWithRequestedContentPositionUs(long requestedContentPositionUs) {
    }

    public MediaPeriodInfo copyWithStartPositionUs(long startPositionUs) {
    }

    public boolean equals(@Nullable Object o2) {
    }

    public int hashCode() {
    }
}
