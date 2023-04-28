package com.google.android.exoplayer2.util;

import android.annotation.SuppressLint;
import android.media.MediaFormat;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MediaFormatUtil {
    public static final String KEY_EXO_PCM_ENCODING = "exo-pcm-encoding-int";
    public static final String KEY_EXO_PIXEL_WIDTH_HEIGHT_RATIO_FLOAT = "exo-pixel-width-height-ratio-float";
    private static final int MAX_POWER_OF_TWO_INT = 1073741824;

    private MediaFormatUtil() {
    }

    @SuppressLint({"InlinedApi"})
    public static MediaFormat createMediaFormatFromFormat(Format format) {
    }

    public static void maybeSetByteBuffer(MediaFormat format, String key, @Nullable byte[] value) {
    }

    public static void maybeSetColorInfo(MediaFormat format, @Nullable ColorInfo colorInfo) {
    }

    public static void maybeSetFloat(MediaFormat format, String key, float value) {
    }

    public static void maybeSetInteger(MediaFormat format, String key, int value) {
    }

    @SuppressLint({"InlinedApi"})
    private static void maybeSetPcmEncoding(MediaFormat mediaFormat, int exoPcmEncoding) {
    }

    @SuppressLint({"InlinedApi"})
    private static void maybeSetPixelAspectRatio(MediaFormat mediaFormat, float pixelWidthHeightRatio) {
    }

    public static void maybeSetString(MediaFormat format, String key, @Nullable String value) {
    }

    private static void setBooleanAsInt(MediaFormat format, String key, int value) {
    }

    public static void setCsdBuffers(MediaFormat format, List<byte[]> csdBuffers) {
    }
}
