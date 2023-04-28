package com.tencent.qcloud.tuikit.tuichat.component.video.proxy;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer;
import java.io.IOException;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class SystemMediaPlayerWrapper implements IPlayer {
    private MediaPlayer mMediaPlayer;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.video.proxy.SystemMediaPlayerWrapper$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements MediaPlayer.OnPreparedListener {
        public final /* synthetic */ SystemMediaPlayerWrapper this$0;
        public final /* synthetic */ IPlayer.OnPreparedListener val$l;

        public AnonymousClass1(SystemMediaPlayerWrapper systemMediaPlayerWrapper, IPlayer.OnPreparedListener onPreparedListener) {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.video.proxy.SystemMediaPlayerWrapper$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements MediaPlayer.OnErrorListener {
        public final /* synthetic */ SystemMediaPlayerWrapper this$0;
        public final /* synthetic */ IPlayer.OnErrorListener val$l;

        public AnonymousClass2(SystemMediaPlayerWrapper systemMediaPlayerWrapper, IPlayer.OnErrorListener onErrorListener) {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.video.proxy.SystemMediaPlayerWrapper$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements MediaPlayer.OnCompletionListener {
        public final /* synthetic */ SystemMediaPlayerWrapper this$0;
        public final /* synthetic */ IPlayer.OnCompletionListener val$l;

        public AnonymousClass3(SystemMediaPlayerWrapper systemMediaPlayerWrapper, IPlayer.OnCompletionListener onCompletionListener) {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.video.proxy.SystemMediaPlayerWrapper$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements MediaPlayer.OnSeekCompleteListener {
        public final /* synthetic */ SystemMediaPlayerWrapper this$0;
        public final /* synthetic */ IPlayer.OnSeekCompleteListener val$l;

        public AnonymousClass4(SystemMediaPlayerWrapper systemMediaPlayerWrapper, IPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.video.proxy.SystemMediaPlayerWrapper$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements MediaPlayer.OnVideoSizeChangedListener {
        public final /* synthetic */ SystemMediaPlayerWrapper this$0;
        public final /* synthetic */ IPlayer.OnVideoSizeChangedListener val$l;

        public AnonymousClass5(SystemMediaPlayerWrapper systemMediaPlayerWrapper, IPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.video.proxy.SystemMediaPlayerWrapper$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements MediaPlayer.OnInfoListener {
        public final /* synthetic */ SystemMediaPlayerWrapper this$0;
        public final /* synthetic */ IPlayer.OnInfoListener val$l;

        public AnonymousClass6(SystemMediaPlayerWrapper systemMediaPlayerWrapper, IPlayer.OnInfoListener onInfoListener) {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        }
    }

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
