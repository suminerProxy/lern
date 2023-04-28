package com.tencent.rtmp;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.view.Surface;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface b {
    void callExperimentalAPI(String str);

    void enableAudioVolumeEvaluation(int i2);

    TXAudioEffectManager getAudioEffectManager();

    TXBeautyManager getBeautyManager();

    TXLivePushConfig getConfig();

    int getMaxZoom();

    @Deprecated
    int getMusicDuration(String str);

    boolean isPushing();

    void onLogRecord(String str);

    @Deprecated
    boolean pauseBGM();

    void pausePusher();

    @Deprecated
    boolean playBGM(String str);

    void release();

    @Deprecated
    boolean resumeBGM();

    void resumePusher();

    void sendCustomPCMData(byte[] bArr);

    int sendCustomVideoData(byte[] bArr, int i2, int i3, int i4);

    int sendCustomVideoTexture(int i2, int i3, int i4);

    @Deprecated
    void sendMessage(byte[] bArr);

    boolean sendMessageEx(byte[] bArr);

    void setAudioProcessListener(TXLivePusher.AudioCustomProcessListener audioCustomProcessListener);

    void setAudioVolumeEvaluationListener(TXLivePusher.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener);

    @Deprecated
    void setBGMNofify(TXLivePusher.OnBGMNotify onBGMNotify);

    @Deprecated
    void setBGMPitch(float f2);

    @Deprecated
    boolean setBGMPosition(int i2);

    @Deprecated
    boolean setBGMVolume(float f2);

    boolean setBeautyFilter(int i2, int i3, int i4, int i5);

    @Deprecated
    void setChinLevel(int i2);

    void setConfig(TXLivePushConfig tXLivePushConfig);

    void setExposureCompensation(float f2);

    @Deprecated
    void setEyeScaleLevel(int i2);

    @Deprecated
    void setFaceShortLevel(int i2);

    @Deprecated
    void setFaceSlimLevel(int i2);

    @Deprecated
    void setFaceVLevel(int i2);

    @Deprecated
    void setFilter(Bitmap bitmap);

    void setFocusPosition(float f2, float f3);

    @TargetApi(18)
    @Deprecated
    boolean setGreenScreenFile(String str);

    @Deprecated
    boolean setMicVolume(float f2);

    boolean setMirror(boolean z);

    @Deprecated
    void setMotionMute(boolean z);

    @Deprecated
    void setMotionTmpl(String str);

    void setMute(boolean z);

    @Deprecated
    void setNoseSlimLevel(int i2);

    void setPushListener(ITXLivePushListener iTXLivePushListener);

    void setRenderRotation(int i2);

    @Deprecated
    void setReverb(int i2);

    @Deprecated
    void setSpecialRatio(float f2);

    void setSurface(Surface surface);

    void setSurfaceSize(int i2, int i3);

    void setVideoProcessListener(TXLivePusher.VideoCustomProcessListener videoCustomProcessListener);

    void setVideoQuality(int i2, boolean z, boolean z2);

    void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener);

    @Deprecated
    void setVoiceChangerType(int i2);

    boolean setZoom(int i2);

    void snapshot(TXLivePusher.ITXSnapshotListener iTXSnapshotListener);

    void startCameraPreview(TXCloudVideoView tXCloudVideoView);

    int startPusher(String str);

    int startRecord(String str);

    void startScreenCapture();

    @Deprecated
    boolean stopBGM();

    void stopCameraPreview(boolean z);

    void stopPusher();

    void stopRecord();

    void stopScreenCapture();

    void switchCamera();

    boolean turnOnFlashLight(boolean z);
}
