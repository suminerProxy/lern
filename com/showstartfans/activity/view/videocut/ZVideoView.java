package com.showstartfans.activity.view.videocut;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.VideoView;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class ZVideoView extends VideoView {
    private int b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f7327d;

    /* renamed from: e  reason: collision with root package name */
    private int f7328e;

    /* renamed from: f  reason: collision with root package name */
    private List<MediaPlayer.OnPreparedListener> f7329f;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements MediaPlayer.OnPreparedListener {
        public final /* synthetic */ ZVideoView b;

        public a(ZVideoView zVideoView) {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
        }
    }

    public ZVideoView(Context context) {
    }

    public static /* synthetic */ List a(ZVideoView zVideoView) {
    }

    private void b() {
    }

    public void addOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
    }

    @Override // android.widget.VideoView, android.view.SurfaceView, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @Override // android.widget.VideoView
    public void setVideoURI(Uri uri) {
    }

    public ZVideoView(Context context, AttributeSet attributeSet) {
    }

    public ZVideoView(Context context, AttributeSet attributeSet, int i2) {
    }
}
