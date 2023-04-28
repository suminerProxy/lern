package com.tencent.ugc;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import com.tencent.ugc.TXUGCRecord;
import com.tencent.ugc.TXVideoEditConstants;

@JNINamespace("liteav::ugc")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UGCRecorderJni {
    private static final String OUTPUT_DIR_NAME = "TXUGC";
    private static final String OUTPUT_TEMP_DIR_NAME = "TXUGCParts";
    private static final String OUTPUT_VIDEO_COVER_NAME = "TXUGCCover.jpg";
    private static final String OUTPUT_VIDEO_NAME = "TXUGCRecord.mp4";
    private static final String TAG = "UGCRecorderJni";
    private TXRecordCommon.ITXBGMNotify mBGMListener;
    private TXBeautyManager mBeautyManager;
    private Context mContext;
    private String mCoverPath;
    private TXUGCRecord.VideoCustomProcessListener mCustomProcessListener;
    private long mNativeUGCRecorderJni;
    private TXCloudVideoView mPreviewView;
    private RecordParams mRecorderParams;
    private TXRecordCommon.ITXSnapshotListener mSnapshotListener;
    private TXUGCPartsManager mTXUGCPartsManager;
    private String mVideoFilePath;
    private String mVideoPartFolder;
    private TXRecordCommon.ITXVideoRecordListener mVideoRecordListener;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class RecordParams {

        /* renamed from: a  reason: collision with root package name */
        public int f14255a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f14256d;

        /* renamed from: e  reason: collision with root package name */
        public int f14257e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f14258f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f14259g;

        /* renamed from: h  reason: collision with root package name */
        public int f14260h;

        /* renamed from: i  reason: collision with root package name */
        public int f14261i;

        /* renamed from: j  reason: collision with root package name */
        public int f14262j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f14263k;

        /* renamed from: l  reason: collision with root package name */
        public int f14264l;

        @CalledByNative("RecordParams")
        public int getAudioSampleRate() {
        }

        @CalledByNative("RecordParams")
        public int getMaxDuration() {
        }

        @CalledByNative("RecordParams")
        public int getMinDuration() {
        }

        @CalledByNative("RecordParams")
        public int getVideoBitrate() {
        }

        @CalledByNative("RecordParams")
        public int getVideoFps() {
        }

        @CalledByNative("RecordParams")
        public int getVideoGop() {
        }

        @CalledByNative("RecordParams")
        public int getVideoHeight() {
        }

        @CalledByNative("RecordParams")
        public int getVideoProfile() {
        }

        @CalledByNative("RecordParams")
        public int getVideoWidth() {
        }

        @CalledByNative("RecordParams")
        public boolean isFullIFrame() {
        }
    }

    public UGCRecorderJni(Context context) {
    }

    private void createThumbFile(String str, String str2) {
    }

    private String getDefaultDir() {
    }

    private int getEditBitrateWithSize(int i2, int i3) {
    }

    private com.tencent.liteav.base.util.p getVideoSize(int i2) {
    }

    private void initFileAndFolder() {
    }

    private void initRecorderParams(TXRecordCommon.TXUGCSimpleConfig tXUGCSimpleConfig) {
    }

    public static /* synthetic */ void lambda$onRecordComplete$1(int i2, String str, String str2, String str3, TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
    }

    public static /* synthetic */ void lambda$setFocusPosition$0(UGCRecorderJni uGCRecorderJni, float f2, float f3) {
    }

    private static native long nativeCreate(UGCRecorderJni uGCRecorderJni);

    private static native long nativeCreateBeautyManager(long j2);

    private static native long nativeCreatePartsManager(long j2);

    private static native void nativeDestroy(long j2);

    private static native void nativeEnableBGMNotify(long j2, boolean z);

    private static native void nativeEnableCameraAutoFocus(long j2, boolean z);

    private static native void nativeEnableVideoCustomPreprocess(long j2, boolean z);

    private static native int nativeGetMusicDuration(long j2, String str);

    private static native int nativeGetZoomLevel(long j2);

    private static native boolean nativePauseBGM(long j2);

    private static native int nativePauseRecord(long j2);

    private static native boolean nativePlayBGM(long j2, int i2, int i3);

    private static native boolean nativeResumeBGM(long j2);

    private static native int nativeResumeRecord(long j2);

    private static native void nativeSetAspectRatio(long j2, int i2);

    private static native int nativeSetBGMPath(long j2, String str);

    private static native boolean nativeSetBGMVolume(long j2, int i2);

    private static native void nativeSetFilter(long j2, Bitmap bitmap, float f2, Bitmap bitmap2, float f3, float f4);

    private static native void nativeSetFocusPosition(long j2, float f2, float f3);

    private static native void nativeSetHomeOrientation(long j2, int i2);

    private static native void nativeSetMicVolume(long j2, int i2);

    public static native void nativeSetMute(long j2, boolean z);

    private static native void nativeSetRecordParams(long j2, RecordParams recordParams);

    private static native void nativeSetRecordSpeed(long j2, int i2);

    private static native void nativeSetRenderMode(long j2, int i2);

    private static native void nativeSetRenderRotation(long j2, int i2);

    private static native void nativeSetReverbType(long j2, int i2);

    private static native void nativeSetView(long j2, DisplayTarget displayTarget);

    private static native void nativeSetVoiceChangerType(long j2, int i2);

    private static native void nativeSetWatermark(long j2, Bitmap bitmap, float f2, float f3, float f4);

    private static native boolean nativeSetZoomLevel(long j2, int i2);

    private static native void nativeSnapshot(long j2);

    private static native void nativeStartCamera(long j2, boolean z);

    private static native int nativeStartRecord(long j2, String str, String str2, String str3);

    private static native boolean nativeStopBGM(long j2);

    private static native void nativeStopCamera(long j2);

    private static native int nativeStopRecord(long j2);

    private static native boolean nativeSwitchCamera(long j2, boolean z);

    private static native boolean nativeTurnOnTorch(long j2, boolean z);

    public void finalize() throws Throwable {
    }

    public TXBeautyManager getBeautyManager() {
    }

    public int getMaxZoom() {
    }

    public int getMusicDuration(String str) {
    }

    public TXUGCPartsManager getPartsManager() {
    }

    @CalledByNative
    public void onBGMComplete(int i2) {
    }

    @CalledByNative
    public void onBGMProgress(long j2, long j3) {
    }

    @CalledByNative
    public void onBGMStart() {
    }

    @CalledByNative
    public void onDetectFacePoints(float[] fArr) {
    }

    @CalledByNative
    public void onGLContextDestroy() {
    }

    @CalledByNative
    public boolean onPreprocessVideoFrame(PixelFrame pixelFrame, PixelFrame pixelFrame2) {
    }

    @CalledByNative
    public void onRecordComplete(int i2, String str, String str2, String str3) {
    }

    @CalledByNative
    public void onRecordEvent(int i2) {
    }

    @CalledByNative
    public void onRecordProgress(long j2) {
    }

    @CalledByNative
    public void onSnapshot(Bitmap bitmap) {
    }

    public boolean pauseBGM() {
    }

    public int pauseRecord() {
    }

    public boolean playBGMFromTime(int i2, int i3) {
    }

    public void release() {
    }

    public boolean resumeBGM() {
    }

    public int resumeRecord() {
    }

    public boolean seekBGM(int i2, int i3) {
    }

    public void setAspectRatio(int i2) {
    }

    public int setBGM(String str) {
    }

    public void setBGMNotify(TXRecordCommon.ITXBGMNotify iTXBGMNotify) {
    }

    public boolean setBGMVolume(float f2) {
    }

    public void setBeautyDepth(int i2, int i3, int i4, int i5) {
    }

    public void setBeautyStyle(int i2) {
    }

    public void setChinLevel(int i2) {
    }

    public void setEyeScaleLevel(float f2) {
    }

    public void setFaceScaleLevel(float f2) {
    }

    public void setFaceShortLevel(int i2) {
    }

    public void setFaceVLevel(int i2) {
    }

    public void setFilter(Bitmap bitmap) {
    }

    public void setFocusPosition(float f2, float f3) {
    }

    public void setGreenScreenFile(String str, boolean z) {
    }

    public void setHomeOrientation(int i2) {
    }

    public boolean setMicVolume(float f2) {
    }

    public void setMotionMute(boolean z) {
    }

    public void setMotionTmpl(String str) {
    }

    public void setMute(boolean z) {
    }

    public void setNoseSlimLevel(int i2) {
    }

    public void setRecordSpeed(int i2) {
    }

    public void setRenderRotation(int i2) {
    }

    public void setReverb(int i2) {
    }

    public void setSpecialRatio(float f2) {
    }

    public void setVideoBitrate(int i2) {
    }

    public void setVideoProcessListener(TXUGCRecord.VideoCustomProcessListener videoCustomProcessListener) {
    }

    public void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
    }

    public void setVideoRenderMode(int i2) {
    }

    public void setVideoResolution(int i2) {
    }

    public void setVoiceChangerType(int i2) {
    }

    public void setWatermark(Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
    }

    public boolean setZoom(int i2) {
    }

    public void snapshot(TXRecordCommon.ITXSnapshotListener iTXSnapshotListener) {
    }

    public int startCameraCustomPreview(TXRecordCommon.TXUGCCustomConfig tXUGCCustomConfig, TXCloudVideoView tXCloudVideoView) {
    }

    public int startCameraSimplePreview(TXRecordCommon.TXUGCSimpleConfig tXUGCSimpleConfig, TXCloudVideoView tXCloudVideoView) {
    }

    public int startRecord() {
    }

    public boolean stopBGM() {
    }

    public void stopCameraPreview() {
    }

    public int stopRecord() {
    }

    public boolean switchCamera(boolean z) {
    }

    public boolean toggleTorch(boolean z) {
    }

    public void setFilter(Bitmap bitmap, float f2, Bitmap bitmap2, float f3, float f4) {
    }

    public int startRecord(String str, String str2) {
    }

    public int startRecord(String str, String str2, String str3) {
    }

    private void initRecorderParams(TXRecordCommon.TXUGCCustomConfig tXUGCCustomConfig) {
    }
}
