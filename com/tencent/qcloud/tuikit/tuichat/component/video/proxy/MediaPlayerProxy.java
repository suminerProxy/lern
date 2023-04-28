package com.tencent.qcloud.tuikit.tuichat.component.video.proxy;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class MediaPlayerProxy implements IPlayer {
    private static final String TAG = "MediaPlayerProxy";
    private IPlayer mMediaPlayer;

    @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer
    public int getCurrentPosition() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer
    public int getDuration() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer
    public int getVideoHeight() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer
    public int getVideoWidth() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer
    public boolean isPlaying() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer
    public void pause() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer
    public void prepareAsync() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer
    public void release() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer
    public void seekTo(int i2) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer
    public void setDataSource(Context context, Uri uri) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer
    public void setOnCompletionListener(IPlayer.OnCompletionListener onCompletionListener) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer
    public void setOnErrorListener(IPlayer.OnErrorListener onErrorListener) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer
    public void setOnInfoListener(IPlayer.OnInfoListener onInfoListener) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer
    public void setOnPreparedListener(IPlayer.OnPreparedListener onPreparedListener) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer
    public void setOnSeekCompleteListener(IPlayer.OnSeekCompleteListener onSeekCompleteListener) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer
    public void setOnVideoSizeChangedListener(IPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer
    public void setSurface(Surface surface) {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer
    public void start() {
    }

    @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer
    public void stop() {
    }
}
