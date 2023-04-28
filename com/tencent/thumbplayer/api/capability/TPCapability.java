package com.tencent.thumbplayer.api.capability;

import androidx.annotation.NonNull;
import com.tencent.thumbplayer.api.TPCommonEnum;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPCapability {
    public static boolean addACodecBlacklist(@TPCommonEnum.TP_AUDIO_DECODER_TYPE int i2, @TPCommonEnum.TP_AUDIO_CODEC_TYPE int i3, TPACodecCapabilityForSet tPACodecCapabilityForSet) {
    }

    public static boolean addACodecWhitelist(@TPCommonEnum.TP_AUDIO_DECODER_TYPE int i2, @TPCommonEnum.TP_AUDIO_CODEC_TYPE int i3, TPACodecCapabilityForSet tPACodecCapabilityForSet) {
    }

    public static boolean addDRMLevel1Blacklist(@TPCommonEnum.TP_DRM_TYPE int i2) {
    }

    public static boolean addHDRBlackList(@TPCommonEnum.TP_HDR_TYPE int i2, TPHDRVersionRange tPHDRVersionRange) {
    }

    public static boolean addHDRVideoDecoderTypeWhiteList(@TPCommonEnum.TP_HDR_TYPE int i2, @TPCommonEnum.TP_VIDEO_DECODER_TYPE int i3, @NonNull TPHDRVersionRange tPHDRVersionRange) {
    }

    public static boolean addHDRWhiteList(@TPCommonEnum.TP_HDR_TYPE int i2, TPHDRVersionRange tPHDRVersionRange) {
    }

    public static boolean addVCodecBlacklist(@TPCommonEnum.TP_VIDEO_DECODER_TYPE int i2, @TPCommonEnum.TP_VIDEO_CODEC_TYPE int i3, TPVCodecCapabilityForSet tPVCodecCapabilityForSet) {
    }

    public static boolean addVCodecWhitelist(@TPCommonEnum.TP_VIDEO_DECODER_TYPE int i2, @TPCommonEnum.TP_VIDEO_CODEC_TYPE int i3, TPVCodecCapabilityForSet tPVCodecCapabilityForSet) {
    }

    public static int[] getDRMCapabilities() {
    }

    public static TPVCodecCapabilityForGet getThumbPlayerVCodecMaxCapability(@TPCommonEnum.TP_VIDEO_CODEC_TYPE int i2) {
    }

    public static TPVCodecCapabilityForGet getThumbPlayerVCodecTypeMaxCapability(@TPCommonEnum.TP_VIDEO_CODEC_TYPE int i2, @TPCommonEnum.TP_VIDEO_DECODER_TYPE int i3) {
    }

    public static boolean isACodecCapabilityCanSupport(@TPCommonEnum.TP_AUDIO_CODEC_TYPE int i2, int i3, int i4, int i5, int i6, int i7) {
    }

    public static boolean isDDPlusSupported() {
    }

    public static boolean isDDSupported() {
    }

    public static boolean isDRMsupport(@TPCommonEnum.TP_DRM_TYPE int i2) {
    }

    public static boolean isDolbyDSSupported() {
    }

    public static boolean isDolbyVisionSupported() {
    }

    public static boolean isFeatureSupport(@TPCommonEnum.InnerFeatureType int i2) {
    }

    public static boolean isHDRsupport(@TPCommonEnum.TP_HDR_TYPE int i2, int i3, int i4) {
    }

    public static boolean isVCodecCapabilityCanSupport(@TPCommonEnum.TP_VIDEO_CODEC_TYPE int i2, int i3, int i4, int i5, int i6, int i7) {
    }

    public static boolean isVCodecCapabilityCanSupport(@TPCommonEnum.TP_VIDEO_CODEC_TYPE int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
    }
}
