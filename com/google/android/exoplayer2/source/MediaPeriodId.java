package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class MediaPeriodId {
    public final int adGroupIndex;
    public final int adIndexInAdGroup;
    public final int nextAdGroupIndex;
    public final Object periodUid;
    public final long windowSequenceNumber;

    public MediaPeriodId(Object periodUid) {
    }

    public MediaPeriodId copyWithPeriodUid(Object newPeriodUid) {
    }

    public MediaPeriodId copyWithWindowSequenceNumber(long windowSequenceNumber) {
    }

    public boolean equals(@Nullable Object obj) {
    }

    public int hashCode() {
    }

    public boolean isAd() {
    }

    public MediaPeriodId(Object periodUid, long windowSequenceNumber) {
    }

    public MediaPeriodId(Object periodUid, long windowSequenceNumber, int nextAdGroupIndex) {
    }

    public MediaPeriodId(Object periodUid, int adGroupIndex, int adIndexInAdGroup, long windowSequenceNumber) {
    }

    public MediaPeriodId(MediaPeriodId mediaPeriodId) {
    }

    private MediaPeriodId(Object periodUid, int adGroupIndex, int adIndexInAdGroup, long windowSequenceNumber, int nextAdGroupIndex) {
    }
}
