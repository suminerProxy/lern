package com.taihe.videoplayer.ui.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.taihe.videoplayer.ui.view.AScrollTextView;
import com.taihe.videoplayer.ui.view.VideoProgressLayout;
import com.taihe.videoplayer.ui.view.VodMoreView;
import com.taihe.videoplayer.ui.view.VodQualityView;
import com.taihe.videoplayer.ui.view.VolumeBrightnessProgressLayout;
import h.x.g.f;
import h.x.g.k.d.d;
import h.x.g.k.d.h;
import h.x.g.k.g.c;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class FullScreenPlayer extends AbsPlayer implements View.OnClickListener, VodMoreView.c, VodQualityView.b, SeekBar.OnSeekBarChangeListener {
    private GestureDetector A;
    private h.x.g.k.g.c B;
    private boolean C;
    private boolean D;
    private f.e E;
    private f.d F;
    private f.b G;
    private h.x.g.c H;
    private boolean I;
    private long J;
    private long K;
    private long L;
    private long M;
    private boolean N;

    /* renamed from: e  reason: collision with root package name */
    private LinearLayout f7900e;

    /* renamed from: f  reason: collision with root package name */
    private LinearLayout f7901f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f7902g;

    /* renamed from: h  reason: collision with root package name */
    private AScrollTextView f7903h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f7904i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f7905j;

    /* renamed from: k  reason: collision with root package name */
    private SeekBar f7906k;

    /* renamed from: l  reason: collision with root package name */
    private ImageView f7907l;

    /* renamed from: m  reason: collision with root package name */
    private ProgressBar f7908m;

    /* renamed from: n  reason: collision with root package name */
    public LinearLayout f7909n;

    /* renamed from: o  reason: collision with root package name */
    private ImageView f7910o;

    /* renamed from: p  reason: collision with root package name */
    private TextView f7911p;
    public TextView q;
    public TextView r;
    public TextView s;
    public LinearLayout t;
    public FrameLayout u;
    private LinearLayout v;
    private LinearLayout w;
    private LinearLayout x;
    private VideoProgressLayout y;
    private VolumeBrightnessProgressLayout z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ FullScreenPlayer b;

        public a(FullScreenPlayer fullScreenPlayer) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b implements c.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FullScreenPlayer f7912a;

        public b(FullScreenPlayer fullScreenPlayer) {
        }

        @Override // h.x.g.k.g.c.a
        public void a(float f2) {
        }

        @Override // h.x.g.k.g.c.a
        public void b(float f2) {
        }

        @Override // h.x.g.k.g.c.a
        public void c(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7913a = null;
        public static final /* synthetic */ int[] b = null;
    }

    public FullScreenPlayer(Context context, f.b bVar) {
    }

    public static /* synthetic */ long A(FullScreenPlayer fullScreenPlayer) {
    }

    public static /* synthetic */ f.e B(FullScreenPlayer fullScreenPlayer) {
    }

    private void F(Context context) {
    }

    private void G(Context context) {
    }

    public static /* synthetic */ boolean H(View view, MotionEvent motionEvent) {
    }

    public static /* synthetic */ boolean I(View view, MotionEvent motionEvent) {
    }

    private /* synthetic */ void J(View view) {
    }

    private void L() {
    }

    private void O() {
    }

    private void P() {
    }

    private void Q() {
    }

    private void R() {
    }

    public static /* synthetic */ void r(FullScreenPlayer fullScreenPlayer) {
    }

    public static /* synthetic */ void s(FullScreenPlayer fullScreenPlayer) {
    }

    private void setFullPlayIcon(f.d dVar) {
    }

    public static /* synthetic */ long t(FullScreenPlayer fullScreenPlayer) {
    }

    public static /* synthetic */ h.x.g.k.g.c u(FullScreenPlayer fullScreenPlayer) {
    }

    public static /* synthetic */ VolumeBrightnessProgressLayout v(FullScreenPlayer fullScreenPlayer) {
    }

    public static /* synthetic */ SeekBar w(FullScreenPlayer fullScreenPlayer) {
    }

    public static /* synthetic */ boolean x(FullScreenPlayer fullScreenPlayer, boolean z) {
    }

    public static /* synthetic */ f.d y(FullScreenPlayer fullScreenPlayer) {
    }

    public static /* synthetic */ VideoProgressLayout z(FullScreenPlayer fullScreenPlayer) {
    }

    public void C() {
    }

    public void D() {
    }

    public boolean E() {
    }

    public /* synthetic */ void K(View view) {
    }

    public void M() {
    }

    public void N(boolean z, boolean z2, long j2) {
    }

    @Override // com.taihe.videoplayer.ui.view.VodMoreView.c
    public void a(float f2) {
    }

    @Override // com.taihe.videoplayer.ui.player.AbsPlayer, h.x.g.l.a.m
    public void b(h hVar) {
    }

    @Override // com.taihe.videoplayer.ui.player.AbsPlayer, h.x.g.l.a.m
    public void c(f.e eVar) {
    }

    @Override // com.taihe.videoplayer.ui.view.VodMoreView.c
    public void d(boolean z) {
    }

    @Override // com.taihe.videoplayer.ui.player.AbsPlayer, h.x.g.l.a.m
    public void e(long j2, long j3) {
    }

    @Override // com.taihe.videoplayer.ui.player.AbsPlayer, h.x.g.l.a.m
    public void f(List<d> list) {
    }

    @Override // com.taihe.videoplayer.ui.view.VodMoreView.c
    public void g(boolean z) {
    }

    public f.d getCurrentPlayStatus() {
    }

    public long getCurrentProgress() {
    }

    public long getTotalProgress() {
    }

    @Override // com.taihe.videoplayer.ui.player.AbsPlayer, h.x.g.l.a.m
    public void h(h.x.g.k.d.b bVar) {
    }

    @Override // com.taihe.videoplayer.ui.player.AbsPlayer, h.x.g.l.a.m
    public void hide() {
    }

    @Override // com.taihe.videoplayer.ui.player.AbsPlayer, h.x.g.l.a.m
    public void i(String str) {
    }

    @Override // com.taihe.videoplayer.ui.view.VodQualityView.b
    public void j(h hVar) {
    }

    @Override // com.taihe.videoplayer.ui.player.AbsPlayer, h.x.g.l.a.m
    public void k(f.d dVar) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
    }

    @Override // com.taihe.videoplayer.ui.player.AbsPlayer, h.x.g.l.a.m
    public void release() {
    }

    public void setBarrageOn(boolean z) {
    }

    public void setCurrentPlayStatus(f.d dVar) {
    }

    public void setFullScreenViewCallBack(h.x.g.c cVar) {
    }

    @Override // com.taihe.videoplayer.ui.player.AbsPlayer, h.x.g.l.a.m
    public void setVideoQualityList(List<h> list) {
    }

    @Override // com.taihe.videoplayer.ui.player.AbsPlayer, h.x.g.l.a.m
    public void setWatermark(Bitmap bitmap, float f2, float f3) {
    }

    @Override // com.taihe.videoplayer.ui.player.AbsPlayer, h.x.g.l.a.m
    public void show() {
    }

    public FullScreenPlayer(Context context) {
    }

    public FullScreenPlayer(Context context, AttributeSet attributeSet) {
    }

    public FullScreenPlayer(Context context, AttributeSet attributeSet, int i2) {
    }
}
