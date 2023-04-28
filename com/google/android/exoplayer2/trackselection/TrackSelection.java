package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public interface TrackSelection {
    public static final int TYPE_CUSTOM_BASE = 10000;
    public static final int TYPE_UNSET = 0;

    Format getFormat(int index);

    int getIndexInTrackGroup(int index);

    TrackGroup getTrackGroup();

    int getType();

    int indexOf(int indexInTrackGroup);

    int indexOf(Format format);

    int length();
}
