package com.google.android.exoplayer2;

import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class SeekParameters {
    public static final SeekParameters CLOSEST_SYNC = null;
    public static final SeekParameters DEFAULT = null;
    public static final SeekParameters EXACT = null;
    public static final SeekParameters NEXT_SYNC = null;
    public static final SeekParameters PREVIOUS_SYNC = null;
    public final long toleranceAfterUs;
    public final long toleranceBeforeUs;

    public SeekParameters(long toleranceBeforeUs, long toleranceAfterUs) {
    }

    public boolean equals(@Nullable Object obj) {
    }

    public int hashCode() {
    }

    public long resolveSeekPositionUs(long positionUs, long firstSyncUs, long secondSyncUs) {
    }
}
