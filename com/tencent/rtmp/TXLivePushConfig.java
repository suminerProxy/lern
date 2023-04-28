package com.tencent.rtmp;

import android.graphics.Bitmap;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXLivePushConfig implements Serializable {
    public static final int DEFAULT_MAX_VIDEO_BITRATE = 1200;
    public static final int DEFAULT_MIN_VIDEO_BITRATE = 800;
    public int mAudioBitrate;
    public int mAudioChannels;
    public String mAudioPreProcessFuncName;
    public String mAudioPreProcessLibrary;
    public int mAudioSample;
    public boolean mAutoAdjustBitrate;
    public int mAutoAdjustStrategy;
    public int mBeautyLevel;
    public int mConnectRetryCount;
    public int mConnectRetryInterval;
    public int mCustomModeType;
    public boolean mEnableAec;
    public boolean mEnableAgc;
    public boolean mEnableAns;
    public boolean mEnableAudioPreview;
    public boolean mEnableHighResolutionCapture;
    public boolean mEnableNearestIP;
    public boolean mEnablePureAudioPush;
    public boolean mEnableScreenCaptureAutoRotate;
    public boolean mEnableVideoHardEncoderMainProfile;
    public boolean mEnableZoom;
    public int mEyeScaleLevel;
    public int mFaceSlimLevel;
    public boolean mFrontCamera;
    public int mHardwareAccel;
    public int mHomeOrientation;
    public int mLocalVideoMirrorType;
    public int mMaxVideoBitrate;
    public HashMap<String, String> mMetaData;
    public int mMinVideoBitrate;
    public int mPauseFlag;
    public int mPauseFps;
    public Bitmap mPauseImg;
    public int mPauseTime;
    public int mRtmpChannelType;
    public int mRuddyLevel;
    public boolean mTouchFocus;
    public int mVideoBitrate;
    public int mVideoEncodeGop;
    public boolean mVideoEncoderXMirror;
    public int mVideoFPS;
    public String mVideoPreProcessFuncName;
    public String mVideoPreProcessLibrary;
    public TXVideoResolution mVideoResolution;
    public int mVolumeType;
    public Bitmap mWatermark;
    public float mWatermarkWidth;
    public int mWatermarkX;
    public float mWatermarkXF;
    public int mWatermarkY;
    public float mWatermarkYF;
    public int mWhiteningLevel;

    public void enableAEC(boolean z) {
    }

    public void enableAGC(boolean z) {
    }

    public void enableANS(boolean z) {
    }

    public void enableAudioEarMonitoring(boolean z) {
    }

    public void enableHighResolutionCaptureMode(boolean z) {
    }

    @Deprecated
    public void enableNearestIP(boolean z) {
    }

    public void enablePureAudioPush(boolean z) {
    }

    public void enableScreenCaptureAutoRotate(boolean z) {
    }

    public void enableVideoHardEncoderMainProfile(boolean z) {
    }

    public void setAudioChannels(int i2) {
    }

    public void setAudioSampleRate(int i2) {
    }

    public void setAutoAdjustBitrate(boolean z) {
    }

    public void setAutoAdjustStrategy(int i2) {
    }

    @Deprecated
    public void setBeautyFilter(int i2, int i3, int i4) {
    }

    public void setConnectRetryCount(int i2) {
    }

    public void setConnectRetryInterval(int i2) {
    }

    public void setCustomAudioPreProcessLibrary(String str, String str2) {
    }

    public void setCustomModeType(int i2) {
    }

    public void setCustomVideoPreProcessLibrary(String str, String str2) {
    }

    public void setEnableZoom(boolean z) {
    }

    @Deprecated
    public void setEyeScaleLevel(int i2) {
    }

    @Deprecated
    public void setFaceSlimLevel(int i2) {
    }

    @Deprecated
    public void setFrontCamera(boolean z) {
    }

    public void setHardwareAcceleration(int i2) {
    }

    public void setHomeOrientation(int i2) {
    }

    public void setLocalVideoMirrorType(int i2) {
    }

    public void setMaxVideoBitrate(int i2) {
    }

    public void setMetaData(HashMap<String, String> hashMap) {
    }

    public void setMinVideoBitrate(int i2) {
    }

    public void setPauseFlag(int i2) {
    }

    public void setPauseImg(Bitmap bitmap) {
    }

    @Deprecated
    public void setRtmpChannelType(int i2) {
    }

    public void setTouchFocus(boolean z) {
    }

    public void setVideoBitrate(int i2) {
    }

    public void setVideoEncodeGop(int i2) {
    }

    public void setVideoEncoderXMirror(boolean z) {
    }

    public void setVideoFPS(int i2) {
    }

    public void setVideoResolution(int i2) {
    }

    public void setVolumeType(int i2) {
    }

    public void setWatermark(Bitmap bitmap, int i2, int i3) {
    }

    public String toString() {
    }

    public void setPauseImg(int i2, int i3) {
    }

    public void setWatermark(Bitmap bitmap, float f2, float f3, float f4) {
    }
}
