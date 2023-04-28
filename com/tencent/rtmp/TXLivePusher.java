package com.tencent.rtmp;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXLivePusher implements b {
    public static final int RGB_BGRA = 4;
    public static final int RGB_RGBA = 5;
    private static final String TAG = "TXLivePusher";
    public static final int YUV_420P = 3;
    public static final int YUV_420SP = 1;
    public static final int YUV_420YpCbCr = 2;
    private b mImpl;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface AudioCustomProcessListener {
        void onRecordPcmData(byte[] bArr, long j2, int i2, int i3, int i4);

        void onRecordRawPcmData(byte[] bArr, long j2, int i2, int i3, int i4, boolean z);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface ITXAudioVolumeEvaluationListener {
        void onAudioVolumeEvaluationNotify(int i2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface ITXSnapshotListener {
        void onSnapshot(Bitmap bitmap);
    }

    @Deprecated
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface OnBGMNotify {
        void onBGMComplete(int i2);

        void onBGMProgress(long j2, long j3);

        void onBGMStart();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface VideoCustomProcessListener {
        void onDetectFacePoints(float[] fArr);

        int onTextureCustomProcess(int i2, int i3, int i4);

        void onTextureDestoryed();
    }

    public TXLivePusher(Context context) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void callExperimentalAPI(String str) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void enableAudioVolumeEvaluation(int i2) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized TXAudioEffectManager getAudioEffectManager() {
    }

    @Override // com.tencent.rtmp.b
    public synchronized TXBeautyManager getBeautyManager() {
    }

    @Override // com.tencent.rtmp.b
    public synchronized TXLivePushConfig getConfig() {
    }

    @Override // com.tencent.rtmp.b
    public synchronized int getMaxZoom() {
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized int getMusicDuration(String str) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized boolean isPushing() {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void onLogRecord(String str) {
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized boolean pauseBGM() {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void pausePusher() {
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized boolean playBGM(String str) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void release() {
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized boolean resumeBGM() {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void resumePusher() {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void sendCustomPCMData(byte[] bArr) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized int sendCustomVideoData(byte[] bArr, int i2, int i3, int i4) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized int sendCustomVideoTexture(int i2, int i3, int i4) {
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void sendMessage(byte[] bArr) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized boolean sendMessageEx(byte[] bArr) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setAudioProcessListener(AudioCustomProcessListener audioCustomProcessListener) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setAudioVolumeEvaluationListener(ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setBGMNofify(OnBGMNotify onBGMNotify) {
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setBGMPitch(float f2) {
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized boolean setBGMPosition(int i2) {
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized boolean setBGMVolume(float f2) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized boolean setBeautyFilter(int i2, int i3, int i4, int i5) {
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setChinLevel(int i2) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setConfig(TXLivePushConfig tXLivePushConfig) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setExposureCompensation(float f2) {
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setEyeScaleLevel(int i2) {
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setFaceShortLevel(int i2) {
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setFaceSlimLevel(int i2) {
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setFaceVLevel(int i2) {
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setFilter(Bitmap bitmap) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setFocusPosition(float f2, float f3) {
    }

    @Override // com.tencent.rtmp.b
    @TargetApi(18)
    @Deprecated
    public synchronized boolean setGreenScreenFile(String str) {
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized boolean setMicVolume(float f2) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized boolean setMirror(boolean z) {
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setMotionMute(boolean z) {
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setMotionTmpl(String str) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setMute(boolean z) {
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setNoseSlimLevel(int i2) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setPushListener(ITXLivePushListener iTXLivePushListener) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setRenderRotation(int i2) {
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setReverb(int i2) {
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setSpecialRatio(float f2) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setSurface(Surface surface) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setSurfaceSize(int i2, int i3) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setVideoProcessListener(VideoCustomProcessListener videoCustomProcessListener) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setVideoQuality(int i2, boolean z, boolean z2) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized void setVoiceChangerType(int i2) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized boolean setZoom(int i2) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void snapshot(ITXSnapshotListener iTXSnapshotListener) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void startCameraPreview(TXCloudVideoView tXCloudVideoView) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized int startPusher(String str) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized int startRecord(String str) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void startScreenCapture() {
    }

    @Override // com.tencent.rtmp.b
    @Deprecated
    public synchronized boolean stopBGM() {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void stopCameraPreview(boolean z) {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void stopPusher() {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void stopRecord() {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void stopScreenCapture() {
    }

    @Override // com.tencent.rtmp.b
    public synchronized void switchCamera() {
    }

    @Override // com.tencent.rtmp.b
    public synchronized boolean turnOnFlashLight(boolean z) {
    }
}
