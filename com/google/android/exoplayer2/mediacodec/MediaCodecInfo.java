package com.google.android.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public final class MediaCodecInfo {
    public static final int MAX_SUPPORTED_INSTANCES_UNKNOWN = -1;
    public static final String TAG = "MediaCodecInfo";
    public final boolean adaptive;
    @Nullable
    public final MediaCodecInfo.CodecCapabilities capabilities;
    public final String codecMimeType;
    public final boolean hardwareAccelerated;
    private final boolean isVideo;
    public final String mimeType;
    public final String name;
    public final boolean secure;
    public final boolean softwareOnly;
    public final boolean tunneling;
    public final boolean vendor;

    @VisibleForTesting
    public MediaCodecInfo(String name, String mimeType, String codecMimeType, @Nullable MediaCodecInfo.CodecCapabilities capabilities, boolean hardwareAccelerated, boolean softwareOnly, boolean vendor, boolean adaptive, boolean tunneling, boolean secure) {
    }

    private static int adjustMaxInputChannelCount(String name, String mimeType, int maxChannelCount) {
    }

    @RequiresApi(21)
    private static boolean areSizeAndRateSupportedV21(MediaCodecInfo.VideoCapabilities capabilities, int width, int height, double frameRate) {
    }

    private static MediaCodecInfo.CodecProfileLevel[] estimateLegacyVp9ProfileLevels(@Nullable MediaCodecInfo.CodecCapabilities capabilities) {
    }

    @RequiresApi(23)
    private static int getMaxSupportedInstancesV23(MediaCodecInfo.CodecCapabilities capabilities) {
    }

    private static boolean isAdaptive(MediaCodecInfo.CodecCapabilities capabilities) {
    }

    @RequiresApi(19)
    private static boolean isAdaptiveV19(MediaCodecInfo.CodecCapabilities capabilities) {
    }

    private static boolean isSecure(MediaCodecInfo.CodecCapabilities capabilities) {
    }

    @RequiresApi(21)
    private static boolean isSecureV21(MediaCodecInfo.CodecCapabilities capabilities) {
    }

    private static boolean isTunneling(MediaCodecInfo.CodecCapabilities capabilities) {
    }

    @RequiresApi(21)
    private static boolean isTunnelingV21(MediaCodecInfo.CodecCapabilities capabilities) {
    }

    private void logAssumedSupport(String message) {
    }

    private void logNoSupport(String message) {
    }

    private static boolean needsAdaptationFlushWorkaround(String mimeType) {
    }

    private static boolean needsAdaptationReconfigureWorkaround(String name) {
    }

    private static boolean needsDisableAdaptationWorkaround(String name) {
    }

    private static final boolean needsRotatedVerticalResolutionWorkaround(String name) {
    }

    public static MediaCodecInfo newInstance(String name, String mimeType, String codecMimeType, @Nullable MediaCodecInfo.CodecCapabilities capabilities, boolean hardwareAccelerated, boolean softwareOnly, boolean vendor, boolean forceDisableAdaptive, boolean forceSecure) {
    }

    @Nullable
    @RequiresApi(21)
    public Point alignVideoSizeV21(int width, int height) {
    }

    public DecoderReuseEvaluation canReuseCodec(Format oldFormat, Format newFormat) {
    }

    public int getMaxSupportedInstances() {
    }

    public MediaCodecInfo.CodecProfileLevel[] getProfileLevels() {
    }

    @RequiresApi(21)
    public boolean isAudioChannelCountSupportedV21(int channelCount) {
    }

    @RequiresApi(21)
    public boolean isAudioSampleRateSupportedV21(int sampleRate) {
    }

    public boolean isCodecSupported(Format format) {
    }

    public boolean isFormatSupported(Format format) throws MediaCodecUtil.DecoderQueryException {
    }

    public boolean isHdr10PlusOutOfBandMetadataSupported() {
    }

    public boolean isSeamlessAdaptationSupported(Format format) {
    }

    @RequiresApi(21)
    public boolean isVideoSizeAndRateSupportedV21(int width, int height, double frameRate) {
    }

    public String toString() {
    }

    @RequiresApi(21)
    private static Point alignVideoSizeV21(MediaCodecInfo.VideoCapabilities capabilities, int width, int height) {
    }

    @Deprecated
    public boolean isSeamlessAdaptationSupported(Format oldFormat, Format newFormat, boolean isNewFormatComplete) {
    }
}
