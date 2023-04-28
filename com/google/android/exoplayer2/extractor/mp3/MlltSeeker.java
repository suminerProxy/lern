package com.google.android.exoplayer2.extractor.mp3;

import android.util.Pair;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MlltSeeker implements Seeker {
    private final long durationUs;
    private final long[] referencePositions;
    private final long[] referenceTimesMs;

    private MlltSeeker(long[] referencePositions, long[] referenceTimesMs, long durationUs) {
    }

    public static MlltSeeker create(long firstFramePosition, MlltFrame mlltFrame, long durationUs) {
    }

    private static Pair<Long, Long> linearlyInterpolate(long x, long[] xReferences, long[] yReferences) {
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
}
