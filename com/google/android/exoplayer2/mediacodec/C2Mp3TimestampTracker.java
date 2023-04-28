package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class C2Mp3TimestampTracker {
    private static final long DECODER_DELAY_SAMPLES = 529;
    private static final String TAG = "C2Mp3TimestampTracker";
    private long anchorTimestampUs;
    private long processedSamples;
    private boolean seenInvalidMpegAudioHeader;

    private long getProcessedDurationUs(Format format) {
    }

    public void reset() {
    }

    public long updateAndGetPresentationTimeUs(Format format, DecoderInputBuffer buffer) {
    }
}
