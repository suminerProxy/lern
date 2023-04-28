package com.showstartfans.activity.view;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.VideoView;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class CustomVideoView extends VideoView {
    private Context b;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements MediaPlayer.OnCompletionListener {
        public final /* synthetic */ CustomVideoView b;

        /* renamed from: com.showstartfans.activity.view.CustomVideoView$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
        public class C0133a implements MediaPlayer.OnInfoListener {
            public final /* synthetic */ a b;

            public C0133a(a aVar) {
            }

            @Override // android.media.MediaPlayer.OnInfoListener
            public boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
            }
        }

        public a(CustomVideoView customVideoView) {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
        }
    }

    public CustomVideoView(Context context) {
    }

    private void a(Context context) {
    }

    @Override // android.widget.VideoView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
    }

    @Override // android.widget.VideoView, android.view.SurfaceView, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.widget.VideoView
    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
    }

    public void setVideoURI(int i2) {
    }

    public CustomVideoView(Context context, AttributeSet attributeSet) {
    }

    public CustomVideoView(Context context, AttributeSet attributeSet, int i2) {
    }
}
