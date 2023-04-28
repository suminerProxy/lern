package com.google.android.exoplayer2.extractor.mp3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class XingSeeker implements Seeker {
    private static final String TAG = "XingSeeker";
    private final long dataEndPosition;
    private final long dataSize;
    private final long dataStartPosition;
    private final long durationUs;
    @Nullable
    private final long[] tableOfContents;
    private final int xingFrameSize;

    private XingSeeker(long dataStartPosition, int xingFrameSize, long durationUs) {
    }

    @Nullable
    public static XingSeeker create(long inputLength, long position, MpegAudioUtil.Header mpegAudioHeader, ParsableByteArray frame) {
    }

    private long getTimeUsForTableIndex(int tableIndex) {
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

    private XingSeeker(long dataStartPosition, int xingFrameSize, long durationUs, long dataSize, @Nullable long[] tableOfContents) {
    }
}
