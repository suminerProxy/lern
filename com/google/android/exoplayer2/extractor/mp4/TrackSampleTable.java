package com.google.android.exoplayer2.extractor.mp4;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class TrackSampleTable {
    public final long durationUs;
    public final int[] flags;
    public final int maximumSize;
    public final long[] offsets;
    public final int sampleCount;
    public final int[] sizes;
    public final long[] timestampsUs;
    public final Track track;

    public TrackSampleTable(Track track, long[] offsets, int[] sizes, int maximumSize, long[] timestampsUs, int[] flags, long durationUs) {
    }

    public int getIndexOfEarlierOrEqualSynchronizationSample(long timeUs) {
    }

    public int getIndexOfLaterOrEqualSynchronizationSample(long timeUs) {
    }
}
