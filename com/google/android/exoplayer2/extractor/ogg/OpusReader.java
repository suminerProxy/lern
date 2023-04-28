package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.ogg.StreamReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class OpusReader extends StreamReader {
    private static final int OPUS_CODE = 1332770163;
    private static final byte[] OPUS_SIGNATURE = null;
    private boolean headerRead;

    private long getPacketDurationUs(byte[] packet) {
    }

    public static boolean verifyBitstreamType(ParsableByteArray data) {
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public long preparePayload(ParsableByteArray packet) {
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean readHeaders(ParsableByteArray packet, long position, StreamReader.SetupData setupData) {
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public void reset(boolean headerData) {
    }
}
