package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Ac4Util {
    public static final int AC40_SYNCWORD = 44096;
    public static final int AC41_SYNCWORD = 44097;
    private static final int CHANNEL_COUNT_2 = 2;
    public static final int HEADER_SIZE_FOR_PARSER = 16;
    public static final int MAX_RATE_BYTES_PER_SECOND = 336000;
    private static final int[] SAMPLE_COUNT = null;
    public static final int SAMPLE_HEADER_SIZE = 7;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SyncFrameInfo {
        public final int bitstreamVersion;
        public final int channelCount;
        public final int frameSize;
        public final int sampleCount;
        public final int sampleRate;

        public /* synthetic */ SyncFrameInfo(int i2, int i3, int i4, int i5, int i6, AnonymousClass1 anonymousClass1) {
        }

        private SyncFrameInfo(int bitstreamVersion, int channelCount, int sampleRate, int frameSize, int sampleCount) {
        }
    }

    private Ac4Util() {
    }

    public static void getAc4SampleHeader(int size, ParsableByteArray buffer) {
    }

    public static Format parseAc4AnnexEFormat(ParsableByteArray data, String trackId, String language, @Nullable DrmInitData drmInitData) {
    }

    public static int parseAc4SyncframeAudioSampleCount(ByteBuffer buffer) {
    }

    public static SyncFrameInfo parseAc4SyncframeInfo(ParsableBitArray data) {
    }

    public static int parseAc4SyncframeSize(byte[] data, int syncword) {
    }

    private static int readVariableBits(ParsableBitArray data, int bitsPerRead) {
    }
}
