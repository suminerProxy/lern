package com.tencent.rtmp;

import android.view.Surface;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public interface a {
    boolean addVideoRawData(byte[] bArr);

    void callExperimentalAPI(String str);

    void enableAudioVolumeEvaluation(int i2);

    boolean enableHardwareDecode(boolean z);

    long getCurrentRenderPts();

    boolean isPlaying();

    void pause();

    int prepareLiveSeek(String str, int i2);

    void resume();

    int resumeLive();

    void seek(int i2);

    void setAudioRawDataListener(TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener);

    void setAudioRoute(int i2);

    void setAudioVolumeEvaluationListener(TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener);

    void setAutoPlay(boolean z);

    void setConfig(TXLivePlayConfig tXLivePlayConfig);

    void setMute(boolean z);

    void setPlayListener(ITXLivePlayListener iTXLivePlayListener);

    void setPlayerView(TXCloudVideoView tXCloudVideoView);

    void setRate(float f2);

    void setRenderMode(int i2);

    void setRenderRotation(int i2);

    void setSurface(Surface surface);

    void setSurfaceSize(int i2, int i3);

    void setVideoRawDataListener(TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener);

    void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener);

    int setVideoRenderListener(TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener, Object obj);

    void setVolume(int i2);

    void showDebugView(boolean z);

    void snapshot(TXLivePlayer.ITXSnapshotListener iTXSnapshotListener);

    int startPlay(String str, int i2);

    int startRecord(int i2);

    int stopPlay(boolean z);

    int stopRecord();

    int switchStream(String str);
}
