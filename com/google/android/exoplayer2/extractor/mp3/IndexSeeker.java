package com.google.android.exoplayer2.extractor.mp3;

import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.LongArray;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class IndexSeeker implements Seeker {
    @VisibleForTesting
    public static final long MIN_TIME_BETWEEN_POINTS_US = 100000;
    private final long dataEndPosition;
    private long durationUs;
    private final LongArray positions;
    private final LongArray timesUs;

    public IndexSeeker(long durationUs, long dataStartPosition, long dataEndPosition) {
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long timeUs) {
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long position) {
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
    }

    public boolean isTimeUsInIndex(long timeUs) {
    }

    public void maybeAddSeekPoint(long timeUs, long position) {
    }

    public void setDurationUs(long durationUs) {
    }
}
