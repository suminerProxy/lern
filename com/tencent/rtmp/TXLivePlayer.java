package com.tencent.rtmp;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXLivePlayer {
    public static final int PLAY_TYPE_LIVE_FLV = 1;
    public static final int PLAY_TYPE_LIVE_RTMP = 0;
    public static final int PLAY_TYPE_LIVE_RTMP_ACC = 5;
    public static final int PLAY_TYPE_LOCAL_VIDEO = 6;
    public static final int PLAY_TYPE_VOD_FLV = 2;
    public static final int PLAY_TYPE_VOD_HLS = 3;
    public static final int PLAY_TYPE_VOD_MP4 = 4;
    public static final String TAG = "TXLivePlayer";
    private a mImpl;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface ITXAudioRawDataListener {
        void onAudioInfoChanged(int i2, int i3, int i4);

        void onPcmDataAvailable(byte[] bArr, long j2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface ITXAudioVolumeEvaluationListener {
        void onAudioVolumeEvaluationNotify(int i2);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface ITXLivePlayVideoRenderListener {
        void onRenderVideoFrame(TXLiteAVTexture tXLiteAVTexture);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface ITXSnapshotListener {
        void onSnapshot(Bitmap bitmap);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface ITXVideoRawDataListener {
        void onVideoRawDataAvailable(byte[] bArr, int i2, int i3, int i4);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static class TXLiteAVTexture {
        public Object eglContext;
        public int height;
        public int textureId;
        public int width;
    }

    public TXLivePlayer(Context context) {
    }

    public boolean addVideoRawData(byte[] bArr) {
    }

    public void callExperimentalAPI(String str) {
    }

    public void enableAudioVolumeEvaluation(int i2) {
    }

    public boolean enableHardwareDecode(boolean z) {
    }

    public long getCurrentRenderPts() {
    }

    public boolean isPlaying() {
    }

    public void pause() {
    }

    public int prepareLiveSeek(String str, int i2) {
    }

    public void resume() {
    }

    public int resumeLive() {
    }

    public void seek(int i2) {
    }

    public void setAudioRawDataListener(ITXAudioRawDataListener iTXAudioRawDataListener) {
    }

    public void setAudioRoute(int i2) {
    }

    public void setAudioVolumeEvaluationListener(ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
    }

    public void setAutoPlay(boolean z) {
    }

    public void setConfig(TXLivePlayConfig tXLivePlayConfig) {
    }

    public void setMute(boolean z) {
    }

    public void setPlayListener(ITXLivePlayListener iTXLivePlayListener) {
    }

    public void setPlayerView(TXCloudVideoView tXCloudVideoView) {
    }

    public void setRate(float f2) {
    }

    public void setRenderMode(int i2) {
    }

    public void setRenderRotation(int i2) {
    }

    public void setSurface(Surface surface) {
    }

    public void setSurfaceSize(int i2, int i3) {
    }

    public void setVideoRawDataListener(ITXVideoRawDataListener iTXVideoRawDataListener) {
    }

    public void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
    }

    public int setVideoRenderListener(ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener, Object obj) {
    }

    public void setVolume(int i2) {
    }

    public void showDebugView(boolean z) {
    }

    public void snapshot(ITXSnapshotListener iTXSnapshotListener) {
    }

    public int startPlay(String str, int i2) {
    }

    public int startRecord(int i2) {
    }

    public int stopPlay(boolean z) {
    }

    public int stopRecord() {
    }

    public int switchStream(String str) {
    }
}
