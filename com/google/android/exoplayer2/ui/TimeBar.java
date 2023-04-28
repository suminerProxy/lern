package com.google.android.exoplayer2.ui;

import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface TimeBar {

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public interface OnScrubListener {
        void onScrubMove(TimeBar timeBar, long position);

        void onScrubStart(TimeBar timeBar, long position);

        void onScrubStop(TimeBar timeBar, long position, boolean canceled);
    }

    void addListener(OnScrubListener listener);

    long getPreferredUpdateDelay();

    void removeListener(OnScrubListener listener);

    void setAdGroupTimesMs(@Nullable long[] adGroupTimesMs, @Nullable boolean[] playedAdGroups, int adGroupCount);

    void setBufferedPosition(long bufferedPosition);

    void setDuration(long duration);

    void setEnabled(boolean enabled);

    void setKeyCountIncrement(int count);

    void setKeyTimeIncrement(long time);

    void setPosition(long position);
}
