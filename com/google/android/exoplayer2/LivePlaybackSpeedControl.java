package com.google.android.exoplayer2;

import com.google.android.exoplayer2.MediaItem;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface LivePlaybackSpeedControl {
    float getAdjustedPlaybackSpeed(long liveOffsetUs, long bufferedDurationUs);

    long getTargetLiveOffsetUs();

    void notifyRebuffer();

    void setLiveConfiguration(MediaItem.LiveConfiguration liveConfiguration);

    void setTargetLiveOffsetOverrideUs(long liveOffsetUs);
}
