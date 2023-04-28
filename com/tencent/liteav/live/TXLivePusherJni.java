package com.tencent.liteav.live;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Surface;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.rtmp.ITXLivePushListener;
import com.tencent.rtmp.TXLivePushConfig;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.b;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import java.lang.ref.WeakReference;

@JNINamespace("liteav")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXLivePusherJni implements ITXLivePushListener, TXLivePusher.AudioCustomProcessListener, TXLivePusher.ITXAudioVolumeEvaluationListener, TXLivePusher.ITXSnapshotListener, TXLivePusher.OnBGMNotify, TXLivePusher.VideoCustomProcessListener, b, TXCloudVideoView.b {
    private TXLivePusher.AudioCustomProcessListener mAudioCustomProcessListener;
    private TXAudioEffectManager mAudioEffectManager;
    private TXBeautyManager mBeautyManager;
    private TXLivePushConfig mConfig;
    private TXLivePusher.ITXAudioVolumeEvaluationListener mITXAudioVolumeEvaluationListener;
    private ITXLivePushListener mITXLivePushListener;
    private TXLivePusher.ITXSnapshotListener mITXSnapshotListener;
    private TXRecordCommon.ITXVideoRecordListener mITXVideoRecordListener;
    private long mNativeTXLivePusherJni;
    private TXLivePusher.OnBGMNotify mOnBGMNotify;
    private Surface mSurface;
    private int mSurfaceHeight;
    private int mSurfaceWidth;
    private TXLivePusher.VideoCustomProcessListener mVideoCustomProcessListener;
    private int mVideoQuality;

    public TXLivePusherJni(Context context) {
    }

    private static native void nativeCallExperimentalAPI(long j2, String str);

    private static native long nativeCreate(WeakReference<TXLivePusherJni> weakReference);

    private static native long nativeCreateAudioEffectManager(long j2);

    private static native long nativeCreateBeautyManager(long j2);

    private static native void nativeDestroy(long j2);

    private static native void nativeEnableAudioVolumeEvaluation(long j2, int i2);

    private static native int nativeGetMaxZoom(long j2);

    private static native int nativeGetMusicDuration(long j2, String str);

    private static native boolean nativeIsPushing(long j2);

    private static native void nativeOnLogRecord(long j2, String str);

    private static native boolean nativePauseBGM(long j2);

    private static native void nativePausePusher(long j2);

    private static native boolean nativePlayBGM(long j2, String str);

    private static native boolean nativeResumeBGM(long j2);

    private static native void nativeResumePusher(long j2);

    private static native void nativeSendCustomPCMData(long j2, byte[] bArr);

    private static native void nativeSendCustomVideoFrame(long j2, PixelFrame pixelFrame);

    private static native void nativeSendMessage(long j2, byte[] bArr);

    private static native boolean nativeSendMessageEx(long j2, byte[] bArr);

    private static native void nativeSetAudioConfig(long j2, int i2, int i3, int i4, boolean z, boolean z2);

    private static native void nativeSetBGMPitch(long j2, float f2);

    private static native boolean nativeSetBGMPosition(long j2, int i2);

    private static native boolean nativeSetBGMVolume(long j2, float f2);

    private static native boolean nativeSetBeautyFilter(long j2, int i2, int i3, int i4, int i5);

    private static native void nativeSetCaptureConfig(long j2, int i2, int i3, Bitmap bitmap, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i5);

    private static native void nativeSetEncoderConfig(long j2, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, int i8, boolean z2, int i9, boolean z3);

    private static native void nativeSetExposureCompensation(long j2, float f2);

    private static native void nativeSetFilter(long j2, Bitmap bitmap);

    private static native void nativeSetFocusPosition(long j2, float f2, float f3);

    private static native boolean nativeSetMicVolume(long j2, float f2);

    private static native boolean nativeSetMirror(long j2, boolean z);

    private static native void nativeSetMute(long j2, boolean z);

    private static native void nativeSetNetworkConfig(long j2, int i2, boolean z, int i3, int i4, int i5);

    private static native void nativeSetRenderRotation(long j2, int i2);

    private static native void nativeSetReverb(long j2, int i2);

    private static native void nativeSetSpecialRatio(long j2, float f2);

    private static native void nativeSetView(long j2, DisplayTarget displayTarget);

    private static native void nativeSetVoiceChangerType(long j2, int i2);

    private static native void nativeSetWaterMark(long j2, Bitmap bitmap, float f2, float f3, float f4);

    private static native boolean nativeSetZoom(long j2, int i2);

    private static native void nativeShowDebugView(long j2, boolean z);

    private static native void nativeSnapshot(long j2);

    private static native void nativeStartCamera(long j2);

    private static native int nativeStartPusher(long j2, String str);

    private static native int nativeStartRecord(long j2, String str);

    private static native void nativeStartScreenCapture(long j2);

    private static native boolean nativeStopBGM(long j2);

    private static native void nativeStopCameraPreview(long j2, boolean z);

    private static native void nativeStopPusher(long j2);

    private static native void nativeStopRecord(long j2);

    private static native void nativeStopScreenCapture(long j2);

    private static native void nativeSwitchCamera(long j2);

    private static native boolean nativeTurnOnFlashLight(long j2, boolean z);

    @CalledByNative
    public static TXLivePusherJni weakToStrongReference(WeakReference<TXLivePusherJni> weakReference) {
    }

    @Override // com.tencent.rtmp.b
    public void callExperimentalAPI(String str) {
    }

    @Override // com.tencent.rtmp.b
    public void enableAudioVolumeEvaluation(int i2) {
    }

    public void finalize() throws Throwable {
    }

    @Override // com.tencent.rtmp.b
    public TXAudioEffectManager getAudioEffectManager() {
    }

    @Override // com.tencent.rtmp.b
    public TXBeautyManager getBeautyManager() {
    }

    @Override // com.tencent.rtmp.b
    public TXLivePushConfig getConfig() {
    }

    @Override // com.tencent.rtmp.b
    public int getMaxZoom() {
    }

    @Override // com.tencent.rtmp.b
    public int getMusicDuration(String str) {
    }

    @Override // com.tencent.rtmp.b
    public boolean isPushing() {
    }

    @Override // com.tencent.rtmp.TXLivePusher.ITXAudioVolumeEvaluationListener
    @CalledByNative
    public void onAudioVolumeEvaluationNotify(int i2) {
    }

    @Override // com.tencent.rtmp.TXLivePusher.OnBGMNotify
    @CalledByNative
    public void onBGMComplete(int i2) {
    }

    @Override // com.tencent.rtmp.TXLivePusher.OnBGMNotify
    @CalledByNative
    public void onBGMProgress(long j2, long j3) {
    }

    @Override // com.tencent.rtmp.TXLivePusher.OnBGMNotify
    @CalledByNative
    public void onBGMStart() {
    }

    @CalledByNative
    public boolean onCustomPreprocessFrame(PixelFrame pixelFrame, PixelFrame pixelFrame2) {
    }

    @Override // com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener
    public void onDetectFacePoints(float[] fArr) {
    }

    @Override // com.tencent.rtmp.b
    public void onLogRecord(String str) {
    }

    @CalledByNative
    public byte[] onNativeRecordPcmData(byte[] bArr, long j2, int i2, int i3, int i4) {
    }

    @CalledByNative
    public byte[] onNativeRecordRawPcmData(byte[] bArr, long j2, int i2, int i3, int i4, boolean z) {
    }

    @Override // com.tencent.rtmp.ITXLivePushListener
    @CalledByNative
    public void onNetStatus(Bundle bundle) {
    }

    @Override // com.tencent.rtmp.ITXLivePushListener
    @CalledByNative
    public void onPushEvent(int i2, Bundle bundle) {
    }

    @CalledByNative
    public void onRecordComplete(int i2, String str, String str2, String str3) {
    }

    @CalledByNative
    public void onRecordEvent(int i2, Bundle bundle) {
    }

    @Override // com.tencent.rtmp.TXLivePusher.AudioCustomProcessListener
    public void onRecordPcmData(byte[] bArr, long j2, int i2, int i3, int i4) {
    }

    @CalledByNative
    public void onRecordProgress(long j2) {
    }

    @Override // com.tencent.rtmp.TXLivePusher.AudioCustomProcessListener
    public void onRecordRawPcmData(byte[] bArr, long j2, int i2, int i3, int i4, boolean z) {
    }

    @Override // com.tencent.rtmp.ui.TXCloudVideoView.b
    public void onShowLog(boolean z) {
    }

    @Override // com.tencent.rtmp.TXLivePusher.ITXSnapshotListener
    @CalledByNative
    public void onSnapshot(Bitmap bitmap) {
    }

    @Override // com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener
    public int onTextureCustomProcess(int i2, int i3, int i4) {
    }

    @Override // com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener
    @CalledByNative
    public void onTextureDestoryed() {
    }

    @Override // com.tencent.rtmp.b
    public boolean pauseBGM() {
    }

    @Override // com.tencent.rtmp.b
    public void pausePusher() {
    }

    @Override // com.tencent.rtmp.b
    public boolean playBGM(String str) {
    }

    @Override // com.tencent.rtmp.b
    public void release() {
    }

    @Override // com.tencent.rtmp.b
    public boolean resumeBGM() {
    }

    @Override // com.tencent.rtmp.b
    public void resumePusher() {
    }

    @Override // com.tencent.rtmp.b
    public void sendCustomPCMData(byte[] bArr) {
    }

    @Override // com.tencent.rtmp.b
    public int sendCustomVideoData(byte[] bArr, int i2, int i3, int i4) {
    }

    @Override // com.tencent.rtmp.b
    public int sendCustomVideoTexture(int i2, int i3, int i4) {
    }

    @Override // com.tencent.rtmp.b
    public void sendMessage(byte[] bArr) {
    }

    @Override // com.tencent.rtmp.b
    public boolean sendMessageEx(byte[] bArr) {
    }

    @Override // com.tencent.rtmp.b
    public void setAudioProcessListener(TXLivePusher.AudioCustomProcessListener audioCustomProcessListener) {
    }

    @Override // com.tencent.rtmp.b
    public void setAudioVolumeEvaluationListener(TXLivePusher.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
    }

    @Override // com.tencent.rtmp.b
    public void setBGMNofify(TXLivePusher.OnBGMNotify onBGMNotify) {
    }

    @Override // com.tencent.rtmp.b
    public void setBGMPitch(float f2) {
    }

    @Override // com.tencent.rtmp.b
    public boolean setBGMPosition(int i2) {
    }

    @Override // com.tencent.rtmp.b
    public boolean setBGMVolume(float f2) {
    }

    @Override // com.tencent.rtmp.b
    public boolean setBeautyFilter(int i2, int i3, int i4, int i5) {
    }

    @Override // com.tencent.rtmp.b
    public void setChinLevel(int i2) {
    }

    @Override // com.tencent.rtmp.b
    public void setConfig(TXLivePushConfig tXLivePushConfig) {
    }

    @Override // com.tencent.rtmp.b
    public void setExposureCompensation(float f2) {
    }

    @Override // com.tencent.rtmp.b
    public void setEyeScaleLevel(int i2) {
    }

    @Override // com.tencent.rtmp.b
    public void setFaceShortLevel(int i2) {
    }

    @Override // com.tencent.rtmp.b
    public void setFaceSlimLevel(int i2) {
    }

    @Override // com.tencent.rtmp.b
    public void setFaceVLevel(int i2) {
    }

    @Override // com.tencent.rtmp.b
    public void setFilter(Bitmap bitmap) {
    }

    @Override // com.tencent.rtmp.b
    public void setFocusPosition(float f2, float f3) {
    }

    @Override // com.tencent.rtmp.b
    public boolean setGreenScreenFile(String str) {
    }

    @Override // com.tencent.rtmp.b
    public boolean setMicVolume(float f2) {
    }

    @Override // com.tencent.rtmp.b
    public boolean setMirror(boolean z) {
    }

    @Override // com.tencent.rtmp.b
    public void setMotionMute(boolean z) {
    }

    @Override // com.tencent.rtmp.b
    public void setMotionTmpl(String str) {
    }

    @Override // com.tencent.rtmp.b
    public void setMute(boolean z) {
    }

    @Override // com.tencent.rtmp.b
    public void setNoseSlimLevel(int i2) {
    }

    @Override // com.tencent.rtmp.b
    public void setPushListener(ITXLivePushListener iTXLivePushListener) {
    }

    @Override // com.tencent.rtmp.b
    public void setRenderRotation(int i2) {
    }

    @Override // com.tencent.rtmp.b
    public void setReverb(int i2) {
    }

    @Override // com.tencent.rtmp.b
    public void setSpecialRatio(float f2) {
    }

    @Override // com.tencent.rtmp.b
    public void setSurface(Surface surface) {
    }

    @Override // com.tencent.rtmp.b
    public void setSurfaceSize(int i2, int i3) {
    }

    @Override // com.tencent.rtmp.b
    public void setVideoProcessListener(TXLivePusher.VideoCustomProcessListener videoCustomProcessListener) {
    }

    @Override // com.tencent.rtmp.b
    public void setVideoQuality(int i2, boolean z, boolean z2) {
    }

    @Override // com.tencent.rtmp.b
    public void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
    }

    @Override // com.tencent.rtmp.b
    public void setVoiceChangerType(int i2) {
    }

    @Override // com.tencent.rtmp.b
    public boolean setZoom(int i2) {
    }

    @Override // com.tencent.rtmp.b
    public void snapshot(TXLivePusher.ITXSnapshotListener iTXSnapshotListener) {
    }

    @Override // com.tencent.rtmp.b
    public void startCameraPreview(TXCloudVideoView tXCloudVideoView) {
    }

    @Override // com.tencent.rtmp.b
    public int startPusher(String str) {
    }

    @Override // com.tencent.rtmp.b
    public int startRecord(String str) {
    }

    @Override // com.tencent.rtmp.b
    public void startScreenCapture() {
    }

    @Override // com.tencent.rtmp.b
    public boolean stopBGM() {
    }

    @Override // com.tencent.rtmp.b
    public void stopCameraPreview(boolean z) {
    }

    @Override // com.tencent.rtmp.b
    public void stopPusher() {
    }

    @Override // com.tencent.rtmp.b
    public void stopRecord() {
    }

    @Override // com.tencent.rtmp.b
    public void stopScreenCapture() {
    }

    @Override // com.tencent.rtmp.b
    public void switchCamera() {
    }

    @Override // com.tencent.rtmp.b
    public boolean turnOnFlashLight(boolean z) {
    }
}
