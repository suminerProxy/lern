package com.google.android.exoplayer2.util;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class CodecSpecificDataUtil {
    private static final String[] HEVC_GENERAL_PROFILE_SPACE_STRINGS = null;
    private static final byte[] NAL_START_CODE = null;

    private CodecSpecificDataUtil() {
    }

    public static String buildAvcCodecString(int profileIdc, int constraintsFlagsAndReservedZero2Bits, int levelIdc) {
    }

    public static List<byte[]> buildCea708InitializationData(boolean isWideAspectRatio) {
    }

    public static String buildHevcCodecStringFromSps(ParsableNalUnitBitArray bitArray) {
    }

    public static byte[] buildNalUnit(byte[] data, int offset, int length) {
    }

    private static int findNalStartCode(byte[] data, int index) {
    }

    private static boolean isNalStartCode(byte[] data, int index) {
    }

    public static Pair<Integer, Integer> parseAlacAudioSpecificConfig(byte[] audioSpecificConfig) {
    }

    public static boolean parseCea708InitializationData(List<byte[]> initializationData) {
    }

    @Nullable
    public static byte[][] splitNalUnits(byte[] data) {
    }
}
