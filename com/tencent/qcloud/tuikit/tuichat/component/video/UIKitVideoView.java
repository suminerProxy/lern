package com.tencent.qcloud.tuikit.tuichat.component.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer;
import com.tencent.qcloud.tuikit.tuichat.component.video.proxy.MediaPlayerProxy;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class UIKitVideoView extends TextureView {
    private static int STATE_ERROR;
    private static int STATE_IDLE;
    private static int STATE_PAUSED;
    private static int STATE_PLAYBACK_COMPLETED;
    private static int STATE_PLAYING;
    private static int STATE_PREPARED;
    private static int STATE_PREPARING;
    private static int STATE_STOPPED;
    private static final String TAG = null;
    private Context mContext;
    private int mCurrentState;
    private MediaPlayerProxy mMediaPlayer;
    private IPlayer.OnCompletionListener mOnCompletionListener;
    private IPlayer.OnErrorListener mOnErrorListener;
    private IPlayer.OnInfoListener mOnInfoListener;
    private IPlayer.OnPreparedListener mOnPreparedListener;
    private IPlayer.OnSeekCompleteListener mOnSeekCompleteListener;
    private IPlayer.OnVideoSizeChangedListener mOnVideoSizeChangedListener;
    private IPlayer.OnCompletionListener mOutOnCompletionListener;
    private IPlayer.OnErrorListener mOutOnErrorListener;
    private IPlayer.OnPreparedListener mOutOnPreparedListener;
    private Surface mSurface;
    private TextureView.SurfaceTextureListener mSurfaceTextureListener;
    private Uri mUri;
    private int mVideoHeight;
    private int mVideoRotationDegree;
    private int mVideoWidth;
    private IPlayer.OnSeekCompleteListener onSeekCompleteListener;

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.video.UIKitVideoView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass1 implements IPlayer.OnPreparedListener {
        public final /* synthetic */ UIKitVideoView this$0;

        public AnonymousClass1(UIKitVideoView uIKitVideoView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer.OnPreparedListener
        public void onPrepared(IPlayer iPlayer) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.video.UIKitVideoView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass2 implements IPlayer.OnErrorListener {
        public final /* synthetic */ UIKitVideoView this$0;

        public AnonymousClass2(UIKitVideoView uIKitVideoView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer.OnErrorListener
        public boolean onError(IPlayer iPlayer, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.video.UIKitVideoView$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass3 implements IPlayer.OnInfoListener {
        public final /* synthetic */ UIKitVideoView this$0;

        public AnonymousClass3(UIKitVideoView uIKitVideoView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer.OnInfoListener
        public void onInfo(IPlayer iPlayer, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.video.UIKitVideoView$4  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass4 implements IPlayer.OnCompletionListener {
        public final /* synthetic */ UIKitVideoView this$0;

        public AnonymousClass4(UIKitVideoView uIKitVideoView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer.OnCompletionListener
        public void onCompletion(IPlayer iPlayer) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.video.UIKitVideoView$5  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass5 implements IPlayer.OnVideoSizeChangedListener {
        public final /* synthetic */ UIKitVideoView this$0;

        public AnonymousClass5(UIKitVideoView uIKitVideoView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IPlayer iPlayer, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.video.UIKitVideoView$6  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass6 implements IPlayer.OnSeekCompleteListener {
        public final /* synthetic */ UIKitVideoView this$0;

        public AnonymousClass6(UIKitVideoView uIKitVideoView) {
        }

        @Override // com.tencent.qcloud.tuikit.tuichat.component.video.proxy.IPlayer.OnSeekCompleteListener
        public void OnSeekComplete(IPlayer iPlayer) {
        }
    }

    /* renamed from: com.tencent.qcloud.tuikit.tuichat.component.video.UIKitVideoView$7  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public class AnonymousClass7 implements TextureView.SurfaceTextureListener {
        public final /* synthetic */ UIKitVideoView this$0;

        public AnonymousClass7(UIKitVideoView uIKitVideoView) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public UIKitVideoView(Context context) {
    }

    public static /* synthetic */ int access$002(UIKitVideoView uIKitVideoView, int i2) {
    }

    public static /* synthetic */ int access$100() {
    }

    public static /* synthetic */ IPlayer.OnCompletionListener access$1000(UIKitVideoView uIKitVideoView) {
    }

    public static /* synthetic */ IPlayer.OnSeekCompleteListener access$1100(UIKitVideoView uIKitVideoView) {
    }

    public static /* synthetic */ Surface access$1202(UIKitVideoView uIKitVideoView, Surface surface) {
    }

    public static /* synthetic */ void access$1300(UIKitVideoView uIKitVideoView) {
    }

    public static /* synthetic */ int access$200(UIKitVideoView uIKitVideoView) {
    }

    public static /* synthetic */ int access$202(UIKitVideoView uIKitVideoView, int i2) {
    }

    public static /* synthetic */ int access$300(UIKitVideoView uIKitVideoView) {
    }

    public static /* synthetic */ int access$302(UIKitVideoView uIKitVideoView, int i2) {
    }

    public static /* synthetic */ String access$400() {
    }

    public static /* synthetic */ int access$500(UIKitVideoView uIKitVideoView) {
    }

    public static /* synthetic */ int access$502(UIKitVideoView uIKitVideoView, int i2) {
    }

    public static /* synthetic */ IPlayer.OnPreparedListener access$600(UIKitVideoView uIKitVideoView) {
    }

    public static /* synthetic */ int access$700() {
    }

    public static /* synthetic */ IPlayer.OnErrorListener access$800(UIKitVideoView uIKitVideoView) {
    }

    public static /* synthetic */ int access$900() {
    }

    private void initVideoView(Context context) {
    }

    private void openVideo() {
    }

    public int getCurrentPosition() {
    }

    public int getDuration() {
    }

    public boolean isPlaying() {
    }

    public boolean isPrepared() {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
    }

    public boolean pause() {
    }

    public void resetVideo() {
    }

    public void seekTo(int i2) {
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
    }

    public void setOnCompletionListener(IPlayer.OnCompletionListener onCompletionListener) {
    }

    public void setOnErrorListener(IPlayer.OnErrorListener onErrorListener) {
    }

    public void setOnPreparedListener(IPlayer.OnPreparedListener onPreparedListener) {
    }

    public void setOnSeekCompleteListener(IPlayer.OnSeekCompleteListener onSeekCompleteListener) {
    }

    public void setVideoURI(Uri uri) {
    }

    public boolean start() {
    }

    public boolean stop() {
    }

    public void stop_l() {
    }

    public UIKitVideoView(Context context, AttributeSet attributeSet) {
    }

    public UIKitVideoView(Context context, AttributeSet attributeSet, int i2) {
    }
}
