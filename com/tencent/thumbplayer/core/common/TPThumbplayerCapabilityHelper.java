package com.tencent.thumbplayer.core.common;

import android.content.Context;
import androidx.annotation.NonNull;
import com.tencent.thumbplayer.core.common.TPCodecCapability;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPThumbplayerCapabilityHelper {
    public static boolean addACodecBlacklist(int i2, int i3, TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange) {
    }

    public static boolean addACodecWhitelist(int i2, int i3, TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange) {
    }

    public static boolean addDRMLevel1Blacklist(int i2) {
    }

    public static boolean addHDRBlackList(int i2, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
    }

    public static boolean addHDRVideoDecoderTypeWhiteList(int i2, int i3, @NonNull TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
    }

    public static boolean addHDRWhiteList(int i2, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
    }

    public static boolean addVCodecBlacklist(int i2, int i3, TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange) {
    }

    public static boolean addVCodecWhitelist(int i2, int i3, TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange) {
    }

    public static int[] getDRMCapabilities() {
    }

    public static HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> getVCodecDecoderMaxCapabilityMap(int i2) {
    }

    public static TPCodecCapability.TPCodecMaxCapability getVCodecMaxCapability(int i2) {
    }

    public static synchronized void init(Context context, boolean z) {
    }

    public static boolean isACodecCapabilityCanSupport(int i2, int i3, int i4, int i5, int i6, int i7) {
    }

    public static boolean isACodecCapabilitySupport(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
    }

    public static boolean isDDPlusSupported() {
    }

    public static boolean isDDSupported() {
    }

    public static boolean isDRMsupport(int i2) {
    }

    public static boolean isDolbyDSSupported() {
    }

    public static boolean isFeatureSupport(int i2) {
    }

    public static boolean isHDRsupport(int i2, int i3, int i4) {
    }

    public static boolean isSupportMediaCodecRotateInternal() {
    }

    public static boolean isSupportNativeMediaCodec() {
    }

    public static boolean isSupportSetOutputSurfaceApi() {
    }

    @Deprecated
    public static boolean isVCodecCapabilityCanSupport(int i2, int i3, int i4, int i5, int i6) {
    }

    public static boolean isVCodecCapabilityCanSupport(int i2, int i3, int i4, int i5, int i6, int i7) {
    }

    @Deprecated
    public static boolean isVCodecCapabilitySupport(int i2, int i3, int i4, int i5, int i6, int i7) {
    }

    public static boolean isVCodecCapabilitySupport(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
    }
}
