package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MpegAudioUtil {
    private static final int[] BITRATE_V1_L1 = null;
    private static final int[] BITRATE_V1_L2 = null;
    private static final int[] BITRATE_V1_L3 = null;
    private static final int[] BITRATE_V2 = null;
    private static final int[] BITRATE_V2_L1 = null;
    public static final int MAX_FRAME_SIZE_BYTES = 4096;
    public static final int MAX_RATE_BYTES_PER_SECOND = 40000;
    private static final String[] MIME_TYPE_BY_LAYER = null;
    private static final int SAMPLES_PER_FRAME_L1 = 384;
    private static final int SAMPLES_PER_FRAME_L2 = 1152;
    private static final int SAMPLES_PER_FRAME_L3_V1 = 1152;
    private static final int SAMPLES_PER_FRAME_L3_V2 = 576;
    private static final int[] SAMPLING_RATE_V1 = null;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public static final class Header {
        public int bitrate;
        public int channels;
        public int frameSize;
        @Nullable
        public String mimeType;
        public int sampleRate;
        public int samplesPerFrame;
        public int version;

        public boolean setForHeaderData(int headerData) {
        }
    }

    private MpegAudioUtil() {
    }

    public static /* synthetic */ boolean access$000(int i2) {
    }

    public static /* synthetic */ String[] access$100() {
    }

    public static /* synthetic */ int[] access$200() {
    }

    public static /* synthetic */ int access$300(int i2, int i3) {
    }

    public static /* synthetic */ int[] access$400() {
    }

    public static /* synthetic */ int[] access$500() {
    }

    public static /* synthetic */ int[] access$600() {
    }

    public static /* synthetic */ int[] access$700() {
    }

    public static /* synthetic */ int[] access$800() {
    }

    public static int getFrameSize(int headerData) {
    }

    private static int getFrameSizeInSamples(int version, int layer) {
    }

    private static boolean isMagicPresent(int headerData) {
    }

    public static int parseMpegAudioFrameSampleCount(int headerData) {
    }
}
