package com.tencent.thumbplayer.core.common;

import android.content.Context;
import androidx.annotation.NonNull;
import com.tencent.thumbplayer.core.common.TPCodecCapability;
import com.tencent.thumbplayer.core.thirdparties.LocalCache;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TPCodecUtils {
    public static final int CAP_AUDIO_AAC = 8;
    public static final int CAP_AUDIO_DD = 16;
    public static final int CAP_AUDIO_DDP = 32;
    public static final int CAP_AUDIO_DTS = 128;
    public static final int CAP_AUDIO_FLAC = 64;
    public static final int CAP_VIDEO_AVC = 1;
    public static final int CAP_VIDEO_HEVC = 2;
    public static final int CAP_VIDEO_VP9 = 4;
    public static final int PLAYER_LEVEL_1 = 1;
    public static final int PLAYER_LEVEL_11 = 11;
    public static final int PLAYER_LEVEL_16 = 16;
    public static final int PLAYER_LEVEL_21 = 21;
    public static final int PLAYER_LEVEL_26 = 26;
    public static final int PLAYER_LEVEL_28 = 28;
    public static final int PLAYER_LEVEL_33 = 33;
    public static final int PLAYER_LEVEL_6 = 6;
    private static final String TAG = "TPCodecUtils";
    private static int mAACMaxSupportedBitrate = 510000;
    private static int mAACMaxSupportedChannels = 8;
    private static int mAACMaxSupportedSamplerate = 96000;
    private static ArrayList<String> mAMediaCodecBlackListInstance = null;
    private static ArrayList<String> mAMediaCodecBlackListModel = null;
    public static ArrayList<String> mAMediaCodecCapList = null;
    private static TPCodecCapability.TPCodecMaxCapability mAV1SWMaxCapability = null;
    private static TPCodecCapability.TPCodecMaxCapability mAVCSWMaxCapability = null;
    private static TPCodecCapability.TPCodecMaxCapability mAVS3WMaxCapability = null;
    private static HashMap<String, String> mAudioMaxCapCodecInstance = null;
    private static int mAvs3DeviceLevel = -1;
    private static HashMap<String, Integer> mCodecCapBlackList = null;
    private static HashMap<String, Integer> mCodecCapWhiteList = null;
    private static Context mContext = null;
    private static int mDDPMaxSupportedBitrate = 6144000;
    private static int mDDPMaxSupportedChannels = 8;
    private static int mDDPMaxSupportedSamplerate = 48000;
    private static HashMap<Integer, ArrayList<String>> mDrmL1BlackList = null;
    private static int mFLACMaxSupportedBitrate = 21000000;
    private static int mFLACMaxSupportedChannels = 8;
    private static int mFLACMaxSupportedSamplerate = 192000;
    private static int mFhdAvs3HisiIndex = 0;
    private static int mFhdAvs3QualcommIndex = 0;
    private static HashMap<Integer, ArrayList<TPCodecCapability.TPHdrSupportVersionRange>> mHDRTypeToHDRHardwareCodecWhiteListMap = null;
    private static HashMap<Integer, ArrayList<TPCodecCapability.TPHdrSupportVersionRange>> mHDRTypeToHDRSoftwareCodecWhiteListMap = null;
    private static HashMap<String, TPCodecCapability.TPHdrSupportVersionRange> mHDRVividSupportVersionMap = null;
    private static TPCodecCapability.TPCodecMaxCapability mHEVCSWMaxCapability = null;
    private static int mHdHevcHisiIndex = 0;
    private static int mHdHevcMtkIndex = 0;
    private static int mHdHevcQualcommIndex = 0;
    private static int mHdHevcSumsingIndex = 0;
    private static HashMap<Integer, HashMap<String, TPCodecCapability.TPHdrSupportVersionRange>> mHdrBlackMap = null;
    private static HashMap<Integer, HashMap<String, TPCodecCapability.TPHdrSupportVersionRange>> mHdrWhiteMap = null;
    private static int mHevcDeviceLevel = -1;
    private static boolean mIsFFmpegCapGot;
    private static boolean mIsInitDone;
    private static LocalCache mLocalCache;
    private static HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> mMaxACodecHwCapabilityMap;
    private static HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> mMaxACodecSwCapabilityMap;
    private static HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> mMaxVCodecHwCapabilityMap;
    private static HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> mMaxVCodecSwCapabilityMap;
    private static int mShdAvs3QualcommIndex;
    private static int mShdHevcHisiIndex;
    private static int mShdHevcMtkIndex;
    private static int mShdHevcQualcommIndex;
    private static int mShdHevcSumsingIndex;
    private static ArrayList<String> mSupportedMediaCodec;
    private static ArrayList<String> mVMediaCodecBlackListModel;
    public static ArrayList<String> mVMediaCodecCapList;
    private static TPCodecCapability.TPCodecMaxCapability mVP9SWMaxCapability;
    private static ArrayList<String> mWideVineBlackListModel;

    /* renamed from: com.tencent.thumbplayer.core.common.TPCodecUtils$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    public static /* synthetic */ boolean access$002(boolean z) {
    }

    public static boolean addDRMLevel1Blacklist(int i2) {
    }

    public static boolean addHDRBlackList(int i2, String str, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
    }

    private static void addHDRVersionRangeToWhiteList(int i2, @NonNull TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange, @NonNull HashMap<Integer, ArrayList<TPCodecCapability.TPHdrSupportVersionRange>> hashMap) {
    }

    public static boolean addHDRVideoDecoderTypeWhiteList(int i2, int i3, @NonNull TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
    }

    public static boolean addHDRWhiteList(int i2, String str, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
    }

    public static boolean checkHDRVividSupportByVersion(String str, String str2, String str3) {
    }

    public static int convertDolbyVisionToOmxLevel(int i2) {
    }

    public static int convertDolbyVisionToOmxProfile(int i2) {
    }

    public static synchronized HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> getACodecSWMaxCapabilityMap() {
    }

    public static synchronized HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> getAMediaCodecMaxCapabilityMap() {
    }

    public static int getAV1SWDecodeLevel() {
    }

    public static boolean getAudioMediaCodecPassThroughCap(int i2, int i3, int i4) {
    }

    public static int getAvs3SWDecodeLevel() {
    }

    private static int getDecodeLevelByCoresAndFreq() {
    }

    public static synchronized void getDecoderMaxCapabilityMapAsync() {
    }

    public static String getDecoderName(String str, boolean z) {
    }

    public static String getDisplayVersion() {
    }

    public static String getDolbyVisionDecoderName(String str, int i2, int i3, boolean z) {
    }

    public static int getHevcSWDecodeLevel() {
    }

    public static int getMaxLumaSample(String str, int i2) {
    }

    public static synchronized int getMaxSupportedFrameRatesFor(int i2, int i3, int i4, int i5) {
    }

    private static int getSoftMaxSamples(int i2) {
    }

    private static int getSupportedCodecId(String str) {
    }

    private static String getSupportedHWMimeType(int i2) {
    }

    public static String getSystemPatchVersion() {
    }

    public static synchronized HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> getVCodecSWMaxCapabilityMap() {
    }

    public static synchronized HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> getVMediaCodecMaxCapabilityMap() {
    }

    private static int getValueFromSubstring(String str, int i2, int i3) {
    }

    public static synchronized void init(Context context, boolean z) {
    }

    public static boolean isAMediaCodecBlackListInstance(String str) {
    }

    public static boolean isAMediaCodecBlackListModel() {
    }

    public static boolean isBlackListType(String str) {
    }

    private static synchronized boolean isHDR10Support(int i2) {
    }

    private static synchronized boolean isHDRDVSupport(int i2, int i3) {
    }

    @TPMethodCalledByNative
    public static boolean isHDRDecoderTypeSupport(int i2, int i3) {
    }

    @TPMethodCalledByNative
    public static boolean isHDRsupport(int i2, int i3, int i4) {
    }

    public static boolean isInDRMLevel1Blacklist(int i2) {
    }

    private static boolean isInHDRVersionRangeWhiteList(ArrayList<TPCodecCapability.TPHdrSupportVersionRange> arrayList) {
    }

    public static boolean isInHDRVividBlackList(String str, int i2, int i3) {
    }

    public static boolean isInHDRVividWhiteList(String str, int i2, int i3) {
    }

    public static boolean isInMediaCodecBlackList(String str) {
    }

    public static boolean isInMediaCodecWhiteList(String str) {
    }

    public static synchronized boolean isMediaCodecDDPlusSupported() {
    }

    public static synchronized boolean isMediaCodecDolbyDSSupported() {
    }

    private static boolean isSupportedMediaCodec(String str) {
    }

    private static boolean isTheSameVersionRange(TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange2) {
    }

    public static boolean isVMediaCodecBlackListModel() {
    }

    private static <K, T> void replace(K k2, T t, HashMap<K, T> hashMap) {
    }
}
