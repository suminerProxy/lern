package com.baidu.platform.comapi.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: GLTextureView.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class h extends TextureView implements TextureView.SurfaceTextureListener {
    public static final int DEBUG_CHECK_GL_ERROR = 1;
    public static final int DEBUG_LOG_GL_CALLS = 2;
    public static final int RENDERMODE_CONTINUOUSLY = 1;
    public static final int RENDERMODE_WHEN_DIRTY = 0;
    private static final g c = null;

    /* renamed from: a  reason: collision with root package name */
    private int f2737a;
    private final View.OnLayoutChangeListener b;

    /* renamed from: d  reason: collision with root package name */
    private final WeakReference<h> f2738d;

    /* renamed from: e  reason: collision with root package name */
    private f f2739e;

    /* renamed from: f  reason: collision with root package name */
    private ap f2740f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2741g;

    /* renamed from: h  reason: collision with root package name */
    private GLSurfaceView.EGLConfigChooser f2742h;

    /* renamed from: i  reason: collision with root package name */
    private GLSurfaceView.EGLContextFactory f2743i;

    /* renamed from: j  reason: collision with root package name */
    private GLSurfaceView.EGLWindowSurfaceFactory f2744j;

    /* renamed from: k  reason: collision with root package name */
    private GLSurfaceView.GLWrapper f2745k;

    /* renamed from: l  reason: collision with root package name */
    private int f2746l;

    /* renamed from: m  reason: collision with root package name */
    private int f2747m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f2748n;

    /* compiled from: GLTextureView.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public abstract class a implements GLSurfaceView.EGLConfigChooser {

        /* renamed from: a  reason: collision with root package name */
        public int[] f2749a;
        public final /* synthetic */ h b;

        public a(h hVar, int[] iArr) {
        }

        private int[] a(int[] iArr) {
        }

        public abstract EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        @Override // android.opengl.GLSurfaceView.EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        }
    }

    /* compiled from: GLTextureView.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class d implements GLSurfaceView.EGLWindowSurfaceFactory {
        private d() {
        }

        @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
        }

        @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
        public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        }

        public /* synthetic */ d(com.baidu.platform.comapi.map.i iVar) {
        }
    }

    /* compiled from: GLTextureView.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class f extends Thread {

        /* renamed from: a  reason: collision with root package name */
        private boolean f2762a;
        private boolean b;
        private boolean c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f2763d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f2764e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f2765f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f2766g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f2767h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f2768i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f2769j;

        /* renamed from: k  reason: collision with root package name */
        private int f2770k;

        /* renamed from: l  reason: collision with root package name */
        private int f2771l;

        /* renamed from: m  reason: collision with root package name */
        private int f2772m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f2773n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f2774o;

        /* renamed from: p  reason: collision with root package name */
        private ArrayList<Runnable> f2775p;
        private boolean q;
        private e r;
        private WeakReference<h> s;

        public f(WeakReference<h> weakReference) {
        }

        public static /* synthetic */ boolean a(f fVar, boolean z) {
        }

        private void j() {
        }

        private void k() {
        }

        private void l() throws InterruptedException {
        }

        private boolean m() {
        }

        public int b() {
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }

        public void f() {
        }

        public void g() {
        }

        public void h() {
        }

        public void i() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }

        public boolean a() {
        }

        public void a(int i2) {
        }

        public void a(int i2, int i3) {
        }

        public void a(Runnable runnable) {
        }
    }

    /* compiled from: GLTextureView.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        private static String f2776a = "GLThreadManager";
        private static final Class b = null;
        private static final Method c = null;

        /* renamed from: d  reason: collision with root package name */
        private boolean f2777d;

        /* renamed from: e  reason: collision with root package name */
        private int f2778e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f2779f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f2780g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f2781h;

        /* renamed from: i  reason: collision with root package name */
        private f f2782i;

        private g() {
        }

        public synchronized void a(f fVar) {
        }

        public boolean b(f fVar) {
        }

        public void c(f fVar) {
        }

        public /* synthetic */ g(com.baidu.platform.comapi.map.i iVar) {
        }

        private void c() {
        }

        public synchronized boolean a() {
        }

        public synchronized void a(GL10 gl10) {
        }

        public synchronized boolean b() {
        }
    }

    /* compiled from: GLTextureView.java */
    /* renamed from: com.baidu.platform.comapi.map.h$h  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class C0044h extends Writer {

        /* renamed from: a  reason: collision with root package name */
        private StringBuilder f2783a;

        private void a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) {
        }
    }

    /* compiled from: GLTextureView.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class i extends b {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ h f2784j;

        public i(h hVar, boolean z) {
        }
    }

    public h(Context context) {
    }

    public static /* synthetic */ int a(h hVar) {
    }

    public static /* synthetic */ GLSurfaceView.EGLConfigChooser b(h hVar) {
    }

    public static /* synthetic */ GLSurfaceView.EGLContextFactory c(h hVar) {
    }

    public static /* synthetic */ GLSurfaceView.EGLWindowSurfaceFactory d(h hVar) {
    }

    public static /* synthetic */ GLSurfaceView.GLWrapper e(h hVar) {
    }

    public static /* synthetic */ int f(h hVar) {
    }

    public static /* synthetic */ boolean g(h hVar) {
    }

    public static /* synthetic */ ap h(h hVar) {
    }

    public Bitmap captureImageFromSurface(int i2, int i3, int i4, int i5, Object obj, Bitmap.Config config) {
    }

    public void finalize() throws Throwable {
    }

    public int getDebugFlags() {
    }

    public int getFPS() {
    }

    public boolean getPreserveEGLContextOnPause() {
    }

    public int getRenderMode() {
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void queueEvent(Runnable runnable) {
    }

    public void requestRender() {
    }

    public void setDebugFlags(int i2) {
    }

    public void setEGLConfigChooser(GLSurfaceView.EGLConfigChooser eGLConfigChooser) {
    }

    public void setEGLContextClientVersion(int i2) {
    }

    public void setEGLContextFactory(GLSurfaceView.EGLContextFactory eGLContextFactory) {
    }

    public void setEGLWindowSurfaceFactory(GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
    }

    public void setFPS(int i2) {
    }

    public void setGLWrapper(GLSurfaceView.GLWrapper gLWrapper) {
    }

    public void setPreserveEGLContextOnPause(boolean z) {
    }

    public void setRenderMode(int i2) {
    }

    public void setRenderer(ap apVar) {
    }

    public void surfaceChanged(SurfaceTexture surfaceTexture, int i2, int i3, int i4) {
    }

    public void surfaceCreated(SurfaceTexture surfaceTexture) {
    }

    public void surfaceDestroyed(SurfaceTexture surfaceTexture) {
    }

    /* compiled from: GLTextureView.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class c implements GLSurfaceView.EGLContextFactory {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f2757a;
        private int b;

        private c(h hVar) {
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        }

        public /* synthetic */ c(h hVar, com.baidu.platform.comapi.map.i iVar) {
        }
    }

    public static /* synthetic */ g a() {
    }

    private void b() {
    }

    private void c() {
    }

    private Bitmap a(int i2, int i3, int i4, int i5, GL10 gl10, Bitmap.Config config) {
    }

    public void setEGLConfigChooser(boolean z) {
    }

    public void setEGLConfigChooser(int i2, int i3, int i4, int i5, int i6, int i7) {
    }

    public h(Context context, AttributeSet attributeSet) {
    }

    /* compiled from: GLTextureView.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class b extends a {
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f2750d;

        /* renamed from: e  reason: collision with root package name */
        public int f2751e;

        /* renamed from: f  reason: collision with root package name */
        public int f2752f;

        /* renamed from: g  reason: collision with root package name */
        public int f2753g;

        /* renamed from: h  reason: collision with root package name */
        public int f2754h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ h f2755i;

        /* renamed from: j  reason: collision with root package name */
        private int[] f2756j;

        public b(h hVar, int i2, int i3, int i4, int i5, int i6, int i7) {
        }

        @Override // com.baidu.platform.comapi.map.h.a
        public EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        }

        private int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i2, int i3) {
        }
    }

    public h(Context context, AttributeSet attributeSet, int i2) {
    }

    /* compiled from: GLTextureView.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public EGL10 f2758a;
        public EGLDisplay b;
        public EGLSurface c;

        /* renamed from: d  reason: collision with root package name */
        public EGLConfig f2759d;

        /* renamed from: e  reason: collision with root package name */
        public EGLContext f2760e;

        /* renamed from: f  reason: collision with root package name */
        private WeakReference<h> f2761f;

        public e(WeakReference<h> weakReference) {
        }

        public static void a(String str, String str2, int i2) {
        }

        private void g() {
        }

        public void a() {
        }

        public boolean b() {
        }

        public GL c() {
        }

        public int d() {
        }

        public void e() {
        }

        public void f() {
        }

        private void a(String str) {
        }

        public static String b(String str, int i2) {
        }

        public static void a(String str, int i2) {
        }
    }
}
