package com.google.android.exoplayer2.mediacodec;

import androidx.annotation.IntRange;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class BatchBuffer extends DecoderInputBuffer {
    public static final int DEFAULT_MAX_SAMPLE_COUNT = 32;
    @VisibleForTesting
    public static final int MAX_SIZE_BYTES = 3072000;
    private long lastSampleTimeUs;
    private int maxSampleCount;
    private int sampleCount;

    private boolean canAppendSampleBuffer(DecoderInputBuffer buffer) {
    }

    public boolean append(DecoderInputBuffer buffer) {
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer, com.google.android.exoplayer2.decoder.Buffer
    public void clear() {
    }

    public long getFirstSampleTimeUs() {
    }

    public long getLastSampleTimeUs() {
    }

    public int getSampleCount() {
    }

    public boolean hasSamples() {
    }

    public void setMaxSampleCount(@IntRange(from = 1) int maxSampleCount) {
    }
}
