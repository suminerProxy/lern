package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.ParsableBitArray;
import java.nio.ByteBuffer;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class DtsUtil {
    private static final int[] CHANNELS_BY_AMODE = null;
    public static final int DTS_HD_MAX_RATE_BYTES_PER_SECOND = 2250000;
    public static final int DTS_MAX_RATE_BYTES_PER_SECOND = 192000;
    private static final byte FIRST_BYTE_14B_BE = 31;
    private static final byte FIRST_BYTE_14B_LE = -1;
    private static final byte FIRST_BYTE_BE = Byte.MAX_VALUE;
    private static final byte FIRST_BYTE_LE = -2;
    private static final int[] SAMPLE_RATE_BY_SFREQ = null;
    private static final int SYNC_VALUE_14B_BE = 536864768;
    private static final int SYNC_VALUE_14B_LE = -14745368;
    private static final int SYNC_VALUE_BE = 2147385345;
    private static final int SYNC_VALUE_LE = -25230976;
    private static final int[] TWICE_BITRATE_KBPS_BY_RATE = null;

    private DtsUtil() {
    }

    public static int getDtsFrameSize(byte[] data) {
    }

    private static ParsableBitArray getNormalizedFrameHeader(byte[] frameHeader) {
    }

    private static boolean isLittleEndianFrameHeader(byte[] frameHeader) {
    }

    public static boolean isSyncWord(int word) {
    }

    public static int parseDtsAudioSampleCount(byte[] data) {
    }

    public static Format parseDtsFormat(byte[] frame, @Nullable String trackId, @Nullable String language, @Nullable DrmInitData drmInitData) {
    }

    public static int parseDtsAudioSampleCount(ByteBuffer buffer) {
    }
}
