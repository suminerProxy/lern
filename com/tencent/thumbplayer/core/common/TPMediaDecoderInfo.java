package com.tencent.thumbplayer.core.common;

import android.media.MediaCodecInfo;
import java.io.Serializable;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class TPMediaDecoderInfo implements Serializable {
    private static final int DEFAULT_MAX_BITRATE = 960000;
    private static final int DEFAULT_MAX_CHANNELNUM = 2;
    private static final int DEFAULT_MAX_HEIGHT = 720;
    private static final int DEFAULT_MAX_SAMPLERATE = 48000;
    private static final int DEFAULT_MAX_WIDTH = 1280;
    private static final int DEFAULT_MIN_BITRATE = 8000;
    private static final String TAG = "TPCodecUtils";
    private boolean adaptiveDec;
    private int[] colorFormats;
    private String decMimeType;
    private String decName;
    private int maxBitRate;
    private int maxChannels;
    private int maxFrameRate;
    private int maxHeight;
    private int maxLumaFrameRate;
    private int maxLumaHeight;
    private int maxLumaWidth;
    private int maxSampleRate;
    private int maxSupportedInstances;
    private int maxWidth;
    private DecoderProfileLevel[] profileLevels;
    private boolean secureDec;
    private boolean softwareAudioDec;
    private boolean softwareVideoDec;
    private boolean tunnelingDec;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class DecoderProfileLevel implements Serializable {
        public int level;
        public int profile;
        public final /* synthetic */ TPMediaDecoderInfo this$0;

        public DecoderProfileLevel(TPMediaDecoderInfo tPMediaDecoderInfo, int i2, int i3) {
        }
    }

    public TPMediaDecoderInfo(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
    }

    private int getMaxBitRate(MediaCodecInfo.AudioCapabilities audioCapabilities) {
    }

    private int getMaxChannels(MediaCodecInfo.AudioCapabilities audioCapabilities) {
    }

    private int getMaxHeight(MediaCodecInfo.VideoCapabilities videoCapabilities) {
    }

    private int getMaxSampleRate(MediaCodecInfo.AudioCapabilities audioCapabilities) {
    }

    private final int getMaxSupportedFrameRate(MediaCodecInfo.VideoCapabilities videoCapabilities) {
    }

    private int getMaxSupportedInstances(MediaCodecInfo.CodecCapabilities codecCapabilities) {
    }

    private int getMaxWidth(MediaCodecInfo.VideoCapabilities videoCapabilities) {
    }

    private boolean isAdaptive(MediaCodecInfo.CodecCapabilities codecCapabilities) {
    }

    private boolean isAudioSoftwareOnly(String str) {
    }

    private boolean isSecure(MediaCodecInfo.CodecCapabilities codecCapabilities) {
    }

    private boolean isTunneling(MediaCodecInfo.CodecCapabilities codecCapabilities) {
    }

    private boolean isVideoSoftwareOnly(String str) {
    }

    private void reset() {
    }

    public final int[] getColorFormats() {
    }

    public final int getDecoderLumaHeight() {
    }

    public final int getDecoderLumaWidth() {
    }

    public final int getDecoderMaxFrameRate() {
    }

    public final int getDecoderMaxFrameRateForMaxLuma() {
    }

    public final int getDecoderMaxHeight() {
    }

    public final int getDecoderMaxWidth() {
    }

    public final String getDecoderMimeType() {
    }

    public final String getDecoderName() {
    }

    public final int getMaxAudioBitRate() {
    }

    public final int getMaxAudioChannels() {
    }

    public final int getMaxAudioSampleRate() {
    }

    public final DecoderProfileLevel getMaxProfileLevel() {
    }

    public final int getMaxSupportedInstances() {
    }

    public final DecoderProfileLevel[] getProfileLevels() {
    }

    public final boolean isAudio() {
    }

    public final boolean isAudioSofwareDecoder() {
    }

    public final boolean isSecureDecoder() {
    }

    public final boolean isVideo() {
    }

    public final boolean isVideoSofwareDecoder() {
    }
}
