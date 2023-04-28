package org.libpag;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.opengl.EGLContext;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class PAGView extends TextureView implements TextureView.SurfaceTextureListener, m.a.a.d {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f29837a = null;
    private static a b;
    private static HandlerThread c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile int f29838d;
    private Runnable A;
    private boolean B;

    /* renamed from: e  reason: collision with root package name */
    private TextureView.SurfaceTextureListener f29839e;

    /* renamed from: f  reason: collision with root package name */
    private PAGPlayer f29840f;

    /* renamed from: g  reason: collision with root package name */
    private PAGSurface f29841g;

    /* renamed from: h  reason: collision with root package name */
    private PAGFile f29842h;

    /* renamed from: i  reason: collision with root package name */
    private ValueAnimator f29843i;

    /* renamed from: j  reason: collision with root package name */
    private volatile boolean f29844j;

    /* renamed from: k  reason: collision with root package name */
    private volatile Boolean f29845k;

    /* renamed from: l  reason: collision with root package name */
    private String f29846l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f29847m;

    /* renamed from: n  reason: collision with root package name */
    private EGLContext f29848n;

    /* renamed from: o  reason: collision with root package name */
    private SparseArray<PAGText> f29849o;

    /* renamed from: p  reason: collision with root package name */
    private SparseArray<PAGImage> f29850p;
    private boolean q;
    private volatile boolean r;
    private final Object s;
    private float t;
    private ArrayList<PAGViewListener> u;
    private ArrayList<PAGFlushListener> v;
    private volatile long w;
    private final ValueAnimator.AnimatorUpdateListener x;
    private final AnimatorListenerAdapter y;
    private Runnable z;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface PAGFlushListener {
        void onFlush();
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface PAGViewListener {
        void onAnimationCancel(PAGView pAGView);

        void onAnimationEnd(PAGView pAGView);

        void onAnimationRepeat(PAGView pAGView);

        void onAnimationStart(PAGView pAGView);

        void onAnimationUpdate(PAGView pAGView);
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final Object f29851a;
        private List<PAGView> b;

        public a(Looper looper) {
        }

        public void a(PAGView pAGView) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    public PAGView(Context context) {
    }

    public static /* synthetic */ void a(PAGView pAGView) {
    }

    public static /* synthetic */ long b(PAGView pAGView) {
    }

    public static /* synthetic */ void c(PAGView pAGView) {
    }

    public static /* synthetic */ ArrayList d(PAGView pAGView) {
    }

    public static /* synthetic */ void e(PAGView pAGView) {
    }

    public static /* synthetic */ ArrayList f(PAGView pAGView) {
    }

    public static /* synthetic */ boolean g(PAGView pAGView) {
    }

    public static /* synthetic */ ValueAnimator h(PAGView pAGView) {
    }

    private static void i(PAGView pAGView) {
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

    public void addListener(PAGViewListener pAGViewListener) {
    }

    public void addPAGFlushListener(PAGFlushListener pAGFlushListener) {
    }

    public boolean cacheEnabled() {
    }

    public float cacheScale() {
    }

    public long currentFrame() {
    }

    public long duration() {
    }

    public boolean flush() {
    }

    public void freeCache() {
    }

    public float getAnimationScale(Context context) {
    }

    public PAGComposition getComposition() {
    }

    public PAGLayer[] getLayersUnderPoint(float f2, float f3) {
    }

    public String getPath() {
    }

    public double getProgress() {
    }

    public boolean isPlaying() {
    }

    public boolean isSync() {
    }

    public Bitmap makeSnapshot() {
    }

    public Matrix matrix() {
    }

    public float maxFrameRate() {
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // m.a.a.d
    public void onResume() {
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

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z) {
    }

    public void play() {
    }

    public void removeListener(PAGViewListener pAGViewListener) {
    }

    public void removePAGFlushListener(PAGFlushListener pAGFlushListener) {
    }

    public int scaleMode() {
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setCacheEnabled(boolean z) {
    }

    public void setCacheScale(float f2) {
    }

    public void setComposition(PAGComposition pAGComposition) {
    }

    public void setMatrix(Matrix matrix) {
    }

    public void setMaxFrameRate(float f2) {
    }

    public boolean setPath(String str) {
    }

    public void setProgress(double d2) {
    }

    public void setRepeatCount(int i2) {
    }

    public void setScaleMode(int i2) {
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
    }

    public void setSync(boolean z) {
    }

    public void setVideoEnabled(boolean z) {
    }

    public void stop() {
    }

    public boolean videoEnabled() {
    }

    public static /* synthetic */ void a() {
    }

    private static synchronized void b() {
    }

    private static void c() {
    }

    private static synchronized void d() {
    }

    private void e() {
    }

    private void f() {
    }

    private boolean g() {
    }

    private void h() {
    }

    public static /* synthetic */ long a(PAGView pAGView, long j2) {
    }

    private static void a(int i2, Object obj) {
    }

    private void i() {
    }

    public PAGView(Context context, EGLContext eGLContext) {
    }

    public PAGView(Context context, AttributeSet attributeSet) {
    }

    public PAGView(Context context, AttributeSet attributeSet, int i2) {
    }
}
