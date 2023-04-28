package com.tencent.rtmp;

import android.content.Context;
import android.view.Surface;
import com.tencent.liteav.txcvodplayer.renderer.TextureRenderView;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.util.ArrayList;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class TXVodPlayer {
    public static final String TAG = "TXVodPlayer";
    private final com.tencent.liteav.a mPlayer;

    public TXVodPlayer(Context context) {
    }

    public static String getEncryptedPlayKey(String str) {
    }

    public void attachTRTC(Object obj) {
    }

    public void detachTRTC() {
    }

    public boolean enableHardwareDecode(boolean z) {
    }

    public int getBitrateIndex() {
    }

    public float getBufferDuration() {
    }

    public float getCurrentPlaybackTime() {
    }

    public float getDuration() {
    }

    public int getHeight() {
    }

    public float getPlayableDuration() {
    }

    public ArrayList<TXBitrateItem> getSupportedBitrates() {
    }

    public int getWidth() {
    }

    public boolean isLoop() {
    }

    public boolean isPlaying() {
    }

    public void pause() {
    }

    public void publishAudio() {
    }

    public void publishVideo() {
    }

    public void resume() {
    }

    public void seek(int i2) {
    }

    public void setAudioPlayoutVolume(int i2) {
    }

    public void setAutoPlay(boolean z) {
    }

    public void setBitrateIndex(int i2) {
    }

    public void setConfig(TXVodPlayConfig tXVodPlayConfig) {
    }

    public void setLoop(boolean z) {
    }

    public void setMirror(boolean z) {
    }

    public void setMute(boolean z) {
    }

    @Deprecated
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

    public boolean setRequestAudioFocus(boolean z) {
    }

    public void setStartTime(float f2) {
    }

    public void setStringOption(String str, Object obj) {
    }

    public void setSurface(Surface surface) {
    }

    public void setToken(String str) {
    }

    public void setVodListener(ITXVodPlayListener iTXVodPlayListener) {
    }

    public void snapshot(TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
    }

    public int startPlay(String str) {
    }

    public int startPlayDrm(TXPlayerDrmBuilder tXPlayerDrmBuilder) {
    }

    public int stopPlay(boolean z) {
    }

    public void unpublishAudio() {
    }

    public void unpublishVideo() {
    }

    @Deprecated
    public int startPlay(TXPlayerAuthBuilder tXPlayerAuthBuilder) {
    }

    public void seek(float f2) {
    }

    public void setPlayerView(TextureRenderView textureRenderView) {
    }

    public void startPlay(TXPlayInfoParams tXPlayInfoParams) {
    }
}
