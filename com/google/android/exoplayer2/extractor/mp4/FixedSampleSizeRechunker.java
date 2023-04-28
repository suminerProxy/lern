package com.google.android.exoplayer2.extractor.mp4;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class FixedSampleSizeRechunker {
    private static final int MAX_SAMPLE_SIZE = 8192;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Results {
        public final long duration;
        public final int[] flags;
        public final int maximumSize;
        public final long[] offsets;
        public final int[] sizes;
        public final long[] timestamps;

        public /* synthetic */ Results(long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, long j2, AnonymousClass1 anonymousClass1) {
        }

        private Results(long[] offsets, int[] sizes, int maximumSize, long[] timestamps, int[] flags, long duration) {
        }
    }

    private FixedSampleSizeRechunker() {
    }

    public static Results rechunk(int fixedSampleSize, long[] chunkOffsets, int[] chunkSampleCounts, long timestampDeltaInTimeUnits) {
    }
}
