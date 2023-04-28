package com.tencent.liteav.txcplayer;

import com.tencent.liteav.txcplayer.ITXVCubePlayer;
import java.util.Map;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class a implements ITXVCubePlayer {
    private ITXVCubePlayer.b mOnBufferingUpdateListener;
    private ITXVCubePlayer.c mOnCompletionListener;
    private ITXVCubePlayer.d mOnErrorListener;
    private ITXVCubePlayer.a mOnGetTargetState;
    private ITXVCubePlayer.e mOnHLSKeyErrorListener;
    private ITXVCubePlayer.f mOnHevcVideoDecoderErrorListener;
    private ITXVCubePlayer.g mOnInfoListener;
    private ITXVCubePlayer.h mOnPreparedListener;
    private ITXVCubePlayer.i mOnSeekCompleteListener;
    private ITXVCubePlayer.j mOnTimedTextListener;
    private ITXVCubePlayer.k mOnVideoDecoderErrorListener;
    private ITXVCubePlayer.l mOnVideoSizeChangedListener;

    public int getTXCVodVideoViewTargetState() {
    }

    public final void notifyHLSKeyError() {
    }

    public final void notifyHevcVideoDecoderError() {
    }

    public final void notifyOnBufferingUpdate(int i2) {
    }

    public final void notifyOnCompletion() {
    }

    public final boolean notifyOnError(int i2, int i3) {
    }

    public final boolean notifyOnInfo(int i2, int i3, int i4, Object obj) {
    }

    public final void notifyOnPrepared() {
    }

    public final void notifyOnSeekComplete() {
    }

    public final void notifyOnTimedText(com.tencent.liteav.txcplayer.d.d dVar) {
    }

    public final void notifyOnVideoSizeChanged(int i2, int i3, int i4, int i5, String str) {
    }

    public final void notifyVideoDecoderError() {
    }

    public void resetListeners() {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnBufferingUpdateListener(ITXVCubePlayer.b bVar) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnCompletionListener(ITXVCubePlayer.c cVar) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnErrorListener(ITXVCubePlayer.d dVar) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setOnGetTXCVodVideoViewTargetState(ITXVCubePlayer.a aVar) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnHLSKeyErrorListener(ITXVCubePlayer.e eVar) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnHevcVideoDecoderErrorListener(ITXVCubePlayer.f fVar) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnInfoListener(ITXVCubePlayer.g gVar) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnPreparedListener(ITXVCubePlayer.h hVar) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnSeekCompleteListener(ITXVCubePlayer.i iVar) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnTimedTextListener(ITXVCubePlayer.j jVar) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnVideoDecoderErrorListener(ITXVCubePlayer.k kVar) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public final void setOnVideoSizeChangedListener(ITXVCubePlayer.l lVar) {
    }

    @Override // com.tencent.liteav.txcplayer.ITXVCubePlayer
    public void setPrivateConfig(Map<String, Object> map) {
    }
}
