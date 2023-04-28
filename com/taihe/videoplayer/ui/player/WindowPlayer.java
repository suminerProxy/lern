package com.taihe.videoplayer.ui.player;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import h.x.g.f;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class WindowPlayer extends AbsPlayer implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {
    private long A;
    private GestureDetector B;
    private f.e C;
    private f.d D;

    /* renamed from: e  reason: collision with root package name */
    private RelativeLayout f7914e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f7915f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f7916g;

    /* renamed from: h  reason: collision with root package name */
    private SimpleDraweeView f7917h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f7918i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f7919j;

    /* renamed from: k  reason: collision with root package name */
    private LinearLayout f7920k;

    /* renamed from: l  reason: collision with root package name */
    private SeekBar f7921l;

    /* renamed from: m  reason: collision with root package name */
    private ImageView f7922m;

    /* renamed from: n  reason: collision with root package name */
    private ProgressBar f7923n;

    /* renamed from: o  reason: collision with root package name */
    private ImageView f7924o;

    /* renamed from: p  reason: collision with root package name */
    private TextView f7925p;
    private TextView q;
    private LinearLayout r;
    private boolean s;
    private long t;
    private long u;
    private long v;
    private long w;
    private String x;
    private boolean y;
    private boolean z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ WindowPlayer b;

        public a(WindowPlayer windowPlayer) {
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
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7926a = null;
        public static final /* synthetic */ int[] b = null;
    }

    public WindowPlayer(Context context) {
    }

    public static /* synthetic */ boolean A(View view, MotionEvent motionEvent) {
    }

    private /* synthetic */ void B(ValueAnimator valueAnimator) {
    }

    private /* synthetic */ void D(boolean z, ValueAnimator valueAnimator) {
    }

    private /* synthetic */ void F(boolean z) {
    }

    private /* synthetic */ void H(View view) {
    }

    private /* synthetic */ void J(View view) {
    }

    private /* synthetic */ void L(View view) {
    }

    private void N() {
    }

    private void S() {
    }

    private void T() {
    }

    private void U() {
    }

    public static /* synthetic */ void r(WindowPlayer windowPlayer) {
    }

    public static /* synthetic */ void s(WindowPlayer windowPlayer) {
    }

    private void setWindowIcon(f.d dVar) {
    }

    private void w(Context context) {
    }

    private void x(Context context) {
    }

    private /* synthetic */ void y() {
    }

    public /* synthetic */ void C(ValueAnimator valueAnimator) {
    }

    public /* synthetic */ void E(boolean z, ValueAnimator valueAnimator) {
    }

    public /* synthetic */ void G(boolean z) {
    }

    public /* synthetic */ void I(View view) {
    }

    public /* synthetic */ void K(View view) {
    }

    public /* synthetic */ void M(View view) {
    }

    public void O() {
    }

    public void P(String str, String str2, boolean z, boolean z2, long j2) {
    }

    public void Q(boolean z, boolean z2, long j2) {
    }

    public void R(boolean z) {
    }

    public void V(String str, boolean z, boolean z2, long j2) {
    }

    @Override // com.taihe.videoplayer.ui.player.AbsPlayer, h.x.g.l.a.m
    public void c(f.e eVar) {
    }

    @Override // com.taihe.videoplayer.ui.player.AbsPlayer, h.x.g.l.a.m
    public void e(long j2, long j3) {
    }

    public f.d getCurrentPlayStatus() {
    }

    public long getCurrentProgress() {
    }

    public long getTotalProgress() {
    }

    @Override // com.taihe.videoplayer.ui.player.AbsPlayer, h.x.g.l.a.m
    public void hide() {
    }

    @Override // com.taihe.videoplayer.ui.player.AbsPlayer, h.x.g.l.a.m
    public void i(String str) {
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

    public void setAlwaysHideTitle(boolean z) {
    }

    public void setCurrentPlayStatus(f.d dVar) {
    }

    public void setInitializationInfo(String str) {
    }

    @Override // com.taihe.videoplayer.ui.player.AbsPlayer, h.x.g.l.a.m
    public void setWatermark(Bitmap bitmap, float f2, float f3) {
    }

    @Override // com.taihe.videoplayer.ui.player.AbsPlayer, h.x.g.l.a.m
    public void show() {
    }

    public void t() {
    }

    public boolean u() {
    }

    public void v() {
    }

    public /* synthetic */ void z() {
    }

    public WindowPlayer(Context context, AttributeSet attributeSet) {
    }

    public WindowPlayer(Context context, AttributeSet attributeSet, int i2) {
    }
}
