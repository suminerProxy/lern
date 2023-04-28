package com.tencent.thumbplayer.core.common;

import android.content.Context;
import androidx.annotation.NonNull;
import com.tencent.thumbplayer.core.common.TPCodecCapability;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPPlayerDecoderCapability {
    private static String TAG = "TPPlayerDecoderCapability";
    private static boolean mIsLibLoaded;
    private long mNativeContext;

    private static native boolean _addACodecBlacklist(int i2, int i3, TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange);

    private static native boolean _addACodecWhitelist(int i2, int i3, TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange);

    private static native boolean _addVCodecBlacklist(int i2, int i3, TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange);

    private static native boolean _addVCodecWhitelist(int i2, int i3, TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange);

    private static native HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> _getDecoderMaxCapabilityMap(int i2);

    private static native boolean _isACodecCapabilitySupport(int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    private static native boolean _isVCodecCapabilitySupport(int i2, int i3, int i4, int i5, int i6, int i7, int i8);

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

    public static HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> getVCodecDecoderMaxCapabilityMap(int i2) {
    }

    public static synchronized void init(Context context, boolean z) {
    }

    public static boolean isACodecCapabilitySupport(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
    }

    public static boolean isDDPlusSupported() {
    }

    public static boolean isDolbyDSSupported() {
    }

    public static boolean isHDRsupport(int i2, int i3, int i4) {
    }

    private static boolean isLibLoaded() {
    }

    public static boolean isVCodecCapabilitySupport(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
    }
}
