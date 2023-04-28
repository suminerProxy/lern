package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class Ac3Util {
    public static final int AC3_MAX_RATE_BYTES_PER_SECOND = 80000;
    private static final int AC3_SYNCFRAME_AUDIO_SAMPLE_COUNT = 1536;
    private static final int AUDIO_SAMPLES_PER_AUDIO_BLOCK = 256;
    private static final int[] BITRATE_BY_HALF_FRMSIZECOD = null;
    private static final int[] BLOCKS_PER_SYNCFRAME_BY_NUMBLKSCOD = null;
    private static final int[] CHANNEL_COUNT_BY_ACMOD = null;
    public static final String E_AC3_JOC_CODEC_STRING = "ec+3";
    public static final int E_AC3_MAX_RATE_BYTES_PER_SECOND = 768000;
    private static final int[] SAMPLE_RATE_BY_FSCOD = null;
    private static final int[] SAMPLE_RATE_BY_FSCOD2 = null;
    private static final int[] SYNCFRAME_SIZE_WORDS_BY_HALF_FRMSIZECOD_44_1 = null;
    public static final int TRUEHD_MAX_RATE_BYTES_PER_SECOND = 3062500;
    public static final int TRUEHD_RECHUNK_SAMPLE_COUNT = 16;
    public static final int TRUEHD_SYNCFRAME_PREFIX_LENGTH = 10;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class SyncFrameInfo {
        public static final int STREAM_TYPE_TYPE0 = 0;
        public static final int STREAM_TYPE_TYPE1 = 1;
        public static final int STREAM_TYPE_TYPE2 = 2;
        public static final int STREAM_TYPE_UNDEFINED = -1;
        public final int channelCount;
        public final int frameSize;
        @Nullable
        public final String mimeType;
        public final int sampleCount;
        public final int sampleRate;
        public final int streamType;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public @interface StreamType {
        }

        public /* synthetic */ SyncFrameInfo(String str, int i2, int i3, int i4, int i5, int i6, AnonymousClass1 anonymousClass1) {
        }

        private SyncFrameInfo(@Nullable String mimeType, int streamType, int channelCount, int sampleRate, int frameSize, int sampleCount) {
        }
    }

    private Ac3Util() {
    }

    public static int findTrueHdSyncframeOffset(ByteBuffer buffer) {
    }

    private static int getAc3SyncframeSize(int fscod, int frmsizecod) {
    }

    public static Format parseAc3AnnexFFormat(ParsableByteArray data, String trackId, String language, @Nullable DrmInitData drmInitData) {
    }

    public static int parseAc3SyncframeAudioSampleCount(ByteBuffer buffer) {
    }

    public static SyncFrameInfo parseAc3SyncframeInfo(ParsableBitArray data) {
    }

    public static int parseAc3SyncframeSize(byte[] data) {
    }

    public static Format parseEAc3AnnexFFormat(ParsableByteArray data, String trackId, String language, @Nullable DrmInitData drmInitData) {
    }

    public static int parseTrueHdSyncframeAudioSampleCount(byte[] syncframe) {
    }

    public static int parseTrueHdSyncframeAudioSampleCount(ByteBuffer buffer, int offset) {
    }
}
