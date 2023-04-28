package com.sobot.chat.camera;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;
import com.sobot.chat.camera.StProgressViewUpdateHelper;
import com.sobot.chat.camera.listener.StVideoListener;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class StVideoView extends FrameLayout implements SurfaceHolder.Callback, View.OnClickListener, StProgressViewUpdateHelper.Callback, MediaPlayer.OnCompletionListener {
    private ImageButton ib_playBtn;
    private int layout_width;
    private ImageView mBack;
    private String mFirstFrameUrl;
    private MediaPlayer mMediaPlayer;
    private StProgressViewUpdateHelper mUpdateHelper;
    private StVideoListener mVideoListener;
    private String mVideoUrl;
    private VideoView mVideoView;
    private StPlayPauseDrawable playPauseDrawable;
    private TextView st_currentTime;
    private LinearLayout st_progress_container;
    private SeekBar st_seekbar;
    private TextView st_totalTime;

    /* renamed from: com.sobot.chat.camera.StVideoView$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass1 implements MediaPlayer.OnVideoSizeChangedListener {
        public final /* synthetic */ StVideoView this$0;

        public AnonymousClass1(StVideoView stVideoView) {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        }
    }

    /* renamed from: com.sobot.chat.camera.StVideoView$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class AnonymousClass2 implements MediaPlayer.OnPreparedListener {
        public final /* synthetic */ StVideoView this$0;

        public AnonymousClass2(StVideoView stVideoView) {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
        }
    }

    public StVideoView(Context context) {
    }

    public static /* synthetic */ MediaPlayer access$000(StVideoView stVideoView) {
    }

    public static /* synthetic */ void access$100(StVideoView stVideoView, float f2, float f3) {
    }

    public static /* synthetic */ void access$200(StVideoView stVideoView) {
    }

    private void initAttrs() {
    }

    private void initData() {
    }

    private void initView() {
    }

    private void postError() {
    }

    private void postStart() {
    }

    private void releaseUpdateHelper() {
    }

    private void startUpdateHelper() {
    }

    private void startVideo() {
    }

    private void stopUpdateHelper() {
    }

    private void updateVideoViewSize(float f2, float f3) {
    }

    public boolean isPlaying() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    @Override // com.sobot.chat.camera.StProgressViewUpdateHelper.Callback
    public void onUpdateProgressViews(int i2, int i3) {
    }

    public void playVideo() {
    }

    public void releaseMediaPlayer() {
    }

    public void setVideoLisenter(StVideoListener stVideoListener) {
    }

    public void setVideoPath(String str) {
    }

    public void stopVideo() {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public void switchVideoPlay(boolean z) {
    }

    public StVideoView(Context context, AttributeSet attributeSet) {
    }

    public StVideoView(Context context, AttributeSet attributeSet, int i2) {
    }
}
