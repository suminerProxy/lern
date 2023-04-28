package com.google.android.exoplayer2.text;

import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface Subtitle {
    List<Cue> getCues(long timeUs);

    long getEventTime(int index);

    int getEventTimeCount();

    int getNextEventTimeIndex(long timeUs);
}