package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.SeekMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class ConstantBitrateSeekMap implements SeekMap {
    private final int bitrate;
    private final long dataSize;
    private final long durationUs;
    private final long firstFrameBytePosition;
    private final int frameSize;
    private final long inputLength;

    public ConstantBitrateSeekMap(long inputLength, long firstFrameBytePosition, int bitrate, int frameSize) {
    }

    private long getFramePositionForTimeUs(long timeUs) {
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long timeUs) {
    }

    public long getTimeUsAtPosition(long position) {
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
    }

    private static long getTimeUsAtPosition(long position, long firstFrameBytePosition, int bitrate) {
    }
}
