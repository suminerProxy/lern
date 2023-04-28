package org.libpag;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import org.libpag.CacheManager;
import org.libpag.l;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class PAGImageView extends View {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f29820a = null;
    public static long b = 1073741824;
    private static ThreadPoolExecutor c;

    /* renamed from: d  reason: collision with root package name */
    private static ThreadPoolExecutor f29821d;
    private final ValueAnimator.AnimatorUpdateListener A;
    private ArrayList<PAGImageViewListener> B;
    private final AnimatorListenerAdapter C;
    private volatile int D;
    private volatile int E;
    private volatile int F;
    private volatile int G;
    private float H;
    private boolean I;
    private Runnable J;
    private Runnable K;
    private WeakReference<Future> L;
    private boolean M;

    /* renamed from: e  reason: collision with root package name */
    private ValueAnimator f29822e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f29823f;

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f29824g;

    /* renamed from: h  reason: collision with root package name */
    private volatile Boolean f29825h;

    /* renamed from: i  reason: collision with root package name */
    private volatile boolean f29826i;

    /* renamed from: j  reason: collision with root package name */
    private final Object f29827j;

    /* renamed from: k  reason: collision with root package name */
    private int f29828k;

    /* renamed from: l  reason: collision with root package name */
    private float f29829l;

    /* renamed from: m  reason: collision with root package name */
    private PAGComposition f29830m;

    /* renamed from: n  reason: collision with root package name */
    private String f29831n;

    /* renamed from: o  reason: collision with root package name */
    private int f29832o;

    /* renamed from: p  reason: collision with root package name */
    private Matrix f29833p;
    private ArrayList<WeakReference<Future>> q;
    private float r;
    public volatile CacheManager.a s;
    public volatile a t;
    public volatile l.b u;
    public volatile CacheManager v;
    private volatile Bitmap w;
    private ConcurrentHashMap<Integer, Bitmap> x;
    private Matrix y;
    private volatile long z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface PAGImageViewListener {
        void onAnimationCancel(PAGImageView pAGImageView);

        void onAnimationEnd(PAGImageView pAGImageView);

        void onAnimationRepeat(PAGImageView pAGImageView);

        void onAnimationStart(PAGImageView pAGImageView);

        void onAnimationUpdate(PAGImageView pAGImageView);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f29834a;
        public String b;
        public boolean c;
    }

    public PAGImageView(Context context) {
    }

    public static long MaxDiskCache() {
    }

    public static void SetMaxDiskCache(long j2) {
    }

    public static /* synthetic */ long a(PAGImageView pAGImageView) {
    }

    public static /* synthetic */ ArrayList b(PAGImageView pAGImageView) {
    }

    public static /* synthetic */ void c(PAGImageView pAGImageView) {
    }

    public static /* synthetic */ boolean d(PAGImageView pAGImageView) {
    }

    public static /* synthetic */ ValueAnimator e(PAGImageView pAGImageView) {
    }

    public static /* synthetic */ Bitmap f(PAGImageView pAGImageView) {
    }

    private void g() {
    }

    private void h() {
    }

    private boolean i() {
    }

    private void j() {
    }

    private void k() {
    }

    private void l() {
    }

    private void m() {
    }

    private void n() {
    }

    private void o() {
    }

    private void p() {
    }

    private void q() {
    }

    private void r() {
    }

    private void s() {
    }

    public void addListener(PAGImageViewListener pAGImageViewListener) {
    }

    public boolean cacheAllFramesInMemory() {
    }

    public int currentFrame() {
    }

    public Bitmap currentImage() {
    }

    public void finalize() {
    }

    public boolean flush() {
    }

    public PAGComposition getComposition() {
    }

    public String getPath() {
    }

    public boolean isPlaying() {
    }

    public Matrix matrix() {
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z) {
    }

    public void pause() {
    }

    public void play() {
    }

    public void removeListener(PAGImageViewListener pAGImageViewListener) {
    }

    public float renderScale() {
    }

    public int scaleMode() {
    }

    public void setCacheAllFramesInMemory(boolean z) {
    }

    public void setComposition(PAGComposition pAGComposition) {
    }

    public void setCurrentFrame(int i2) {
    }

    public void setMatrix(Matrix matrix) {
    }

    public boolean setPath(String str, float f2) {
    }

    public void setRenderScale(float f2) {
    }

    public void setRepeatCount(int i2) {
    }

    public void setScaleMode(int i2) {
    }

    public static /* synthetic */ long a(PAGImageView pAGImageView, long j2) {
    }

    private static void c() {
    }

    private void d() {
    }

    private void e() {
    }

    private boolean f() {
    }

    public boolean b() {
    }

    public void setComposition(PAGComposition pAGComposition, float f2) {
    }

    private float a(Context context) {
    }

    public boolean b(l.a aVar) {
    }

    public a a() {
    }

    public boolean setPath(String str) {
    }

    private boolean a(int i2) {
    }

    public PAGImageView(Context context, AttributeSet attributeSet) {
    }

    public PAGImageView(Context context, AttributeSet attributeSet, int i2) {
    }

    public static void a(l.a aVar) {
    }
}
