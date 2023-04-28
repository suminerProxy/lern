package com.tencent.ugc;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import com.tencent.ugc.TXVideoEditConstants;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXUGCRecord {
    private static final String TAG = "TXUGCRecord";
    private static TXUGCRecord instance;
    private UGCRecorderJni mUGCRecorder;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface VideoCustomProcessListener {
        void onDetectFacePoints(float[] fArr);

        int onTextureCustomProcess(int i2, int i3, int i4);

        void onTextureDestroyed();
    }

    public TXUGCRecord(Context context) {
    }

    public static synchronized TXUGCRecord getInstance(Context context) {
    }

    public TXBeautyManager getBeautyManager() {
    }

    public int getMaxZoom() {
    }

    public int getMusicDuration(String str) {
    }

    public TXUGCPartsManager getPartsManager() {
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

    public void setBGMNofify(TXRecordCommon.ITXBGMNotify iTXBGMNotify) {
    }

    public boolean setBGMVolume(float f2) {
    }

    @Deprecated
    public void setBeautyDepth(int i2, int i3, int i4, int i5) {
    }

    @Deprecated
    public void setBeautyStyle(int i2) {
    }

    @Deprecated
    public void setChinLevel(int i2) {
    }

    @Deprecated
    public void setEyeScaleLevel(float f2) {
    }

    @Deprecated
    public void setFaceScaleLevel(float f2) {
    }

    @Deprecated
    public void setFaceShortLevel(int i2) {
    }

    @Deprecated
    public void setFaceVLevel(int i2) {
    }

    @Deprecated
    public void setFilter(Bitmap bitmap) {
    }

    public void setFocusPosition(float f2, float f3) {
    }

    @TargetApi(18)
    @Deprecated
    public void setGreenScreenFile(String str, boolean z) {
    }

    public void setHomeOrientation(int i2) {
    }

    public boolean setMicVolume(float f2) {
    }

    @Deprecated
    public void setMotionMute(boolean z) {
    }

    @Deprecated
    public void setMotionTmpl(String str) {
    }

    public void setMute(boolean z) {
    }

    @Deprecated
    public void setNoseSlimLevel(int i2) {
    }

    public void setRecordSpeed(int i2) {
    }

    public void setRenderRotation(int i2) {
    }

    public void setReverb(int i2) {
    }

    @Deprecated
    public void setSpecialRatio(float f2) {
    }

    public void setVideoBitrate(int i2) {
    }

    public void setVideoProcessListener(VideoCustomProcessListener videoCustomProcessListener) {
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
}
