package com.baidu.platform.comapi.map;

import android.graphics.Bitmap;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.baidu.platform.comapi.map.ah;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: GLRenderControl.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class f implements ag {
    private static final j c = null;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<SurfaceView> f2695a;
    private int b;

    /* renamed from: d  reason: collision with root package name */
    private final WeakReference<f> f2696d;

    /* renamed from: e  reason: collision with root package name */
    private i f2697e;

    /* renamed from: f  reason: collision with root package name */
    private ap f2698f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2699g;

    /* renamed from: h  reason: collision with root package name */
    private e f2700h;

    /* renamed from: i  reason: collision with root package name */
    private InterfaceC0043f f2701i;

    /* renamed from: j  reason: collision with root package name */
    private g f2702j;

    /* renamed from: k  reason: collision with root package name */
    private k f2703k;

    /* renamed from: l  reason: collision with root package name */
    private int f2704l;

    /* renamed from: m  reason: collision with root package name */
    private int f2705m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f2706n;

    /* compiled from: GLRenderControl.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class d implements g {
        private d() {
        }

        @Override // com.baidu.platform.comapi.map.f.g
        public EGLSurface a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
        }

        public /* synthetic */ d(com.baidu.platform.comapi.map.g gVar) {
        }

        @Override // com.baidu.platform.comapi.map.f.g
        public void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        }
    }

    /* compiled from: GLRenderControl.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface e {
        EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    /* compiled from: GLRenderControl.java */
    /* renamed from: com.baidu.platform.comapi.map.f$f  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface InterfaceC0043f {
        EGLContext a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* compiled from: GLRenderControl.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface g {
        EGLSurface a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    /* compiled from: GLRenderControl.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class i extends Thread {

        /* renamed from: a  reason: collision with root package name */
        private boolean f2720a;
        private boolean b;
        private boolean c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f2721d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f2722e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f2723f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f2724g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f2725h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f2726i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f2727j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f2728k;

        /* renamed from: l  reason: collision with root package name */
        private int f2729l;

        /* renamed from: m  reason: collision with root package name */
        private int f2730m;

        /* renamed from: n  reason: collision with root package name */
        private int f2731n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f2732o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f2733p;
        private boolean q;
        private ArrayList<Runnable> r;
        private boolean s;
        private Runnable t;
        private h u;
        private WeakReference<f> v;

        public i(WeakReference<f> weakReference) {
        }

        public static /* synthetic */ boolean a(i iVar, boolean z) {
        }

        private void i() {
        }

        private void j() {
        }

        private void k() throws InterruptedException {
        }

        private boolean l() {
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

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }

        public boolean a() {
        }

        public void a(int i2) {
        }

        public void b(Runnable runnable) {
        }

        public void a(Runnable runnable) {
        }

        public void a(int i2, int i3) {
        }
    }

    /* compiled from: GLRenderControl.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        private static String f2734a = "GLThreadManager";

        private j() {
        }

        public synchronized void a(i iVar) {
        }

        public void b(i iVar) {
        }

        public /* synthetic */ j(com.baidu.platform.comapi.map.g gVar) {
        }
    }

    /* compiled from: GLRenderControl.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public interface k {
        GL a(GL gl);
    }

    /* compiled from: GLRenderControl.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class l extends Writer {

        /* renamed from: a  reason: collision with root package name */
        private StringBuilder f2735a;

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

    /* compiled from: GLRenderControl.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class m extends b {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ f f2736j;

        public m(f fVar, boolean z) {
        }
    }

    public f(SurfaceView surfaceView) {
    }

    public static /* synthetic */ int a(f fVar) {
    }

    public static /* synthetic */ e b(f fVar) {
    }

    public static /* synthetic */ InterfaceC0043f c(f fVar) {
    }

    public static /* synthetic */ g d(f fVar) {
    }

    public static /* synthetic */ k e(f fVar) {
    }

    public static /* synthetic */ int f(f fVar) {
    }

    public static /* synthetic */ boolean g(f fVar) {
    }

    public static /* synthetic */ ap h(f fVar) {
    }

    public static /* synthetic */ j m() {
    }

    private void n() {
    }

    public void finalize() throws Throwable {
    }

    @Override // com.baidu.platform.comapi.map.ag
    public void i() {
    }

    @Override // com.baidu.platform.comapi.map.ag
    public void j() {
    }

    @Override // com.baidu.platform.comapi.map.ag
    public void k() {
    }

    @Override // com.baidu.platform.comapi.map.ag
    public void l() {
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

    @Override // android.view.SurfaceHolder.Callback2
    @Deprecated
    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
    }

    /* compiled from: GLRenderControl.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class c implements InterfaceC0043f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f2715a;
        private int b;

        private c(f fVar) {
        }

        @Override // com.baidu.platform.comapi.map.f.InterfaceC0043f
        public EGLContext a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        }

        public /* synthetic */ c(f fVar, com.baidu.platform.comapi.map.g gVar) {
        }

        @Override // com.baidu.platform.comapi.map.f.InterfaceC0043f
        public void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        }
    }

    public SurfaceHolder a() {
    }

    @Override // com.baidu.platform.comapi.map.ag
    public ah.a b() {
    }

    public int c() {
    }

    public int d() {
    }

    @Override // com.baidu.platform.comapi.map.ag
    public int e() {
    }

    @Override // com.baidu.platform.comapi.map.ag
    public int f() {
    }

    @Override // com.baidu.platform.comapi.map.ag
    public int g() {
    }

    @Override // com.baidu.platform.comapi.map.ag
    public void h() {
    }

    @Override // com.baidu.platform.comapi.map.ag
    public void b(int i2) {
    }

    @Override // com.baidu.platform.comapi.map.ag
    public void a(int i2) {
    }

    public void b(boolean z) {
    }

    public void c(int i2) {
    }

    @Override // com.baidu.platform.comapi.map.ag
    public void d(int i2) {
    }

    public void a(boolean z) {
    }

    @Override // com.baidu.platform.comapi.map.ag
    public void a(ap apVar) {
    }

    /* compiled from: GLRenderControl.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public abstract class a implements e {

        /* renamed from: a  reason: collision with root package name */
        public int[] f2707a;
        public final /* synthetic */ f b;

        public a(f fVar, int[] iArr) {
        }

        @Override // com.baidu.platform.comapi.map.f.e
        public EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay) {
        }

        public abstract EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        private int[] a(int[] iArr) {
        }
    }

    /* compiled from: GLRenderControl.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class b extends a {
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f2708d;

        /* renamed from: e  reason: collision with root package name */
        public int f2709e;

        /* renamed from: f  reason: collision with root package name */
        public int f2710f;

        /* renamed from: g  reason: collision with root package name */
        public int f2711g;

        /* renamed from: h  reason: collision with root package name */
        public int f2712h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ f f2713i;

        /* renamed from: j  reason: collision with root package name */
        private int[] f2714j;

        public b(f fVar, int i2, int i3, int i4, int i5, int i6, int i7) {
        }

        @Override // com.baidu.platform.comapi.map.f.a
        public EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        }

        private int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i2, int i3) {
        }
    }

    /* compiled from: GLRenderControl.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public EGL10 f2716a;
        public EGLDisplay b;
        public EGLSurface c;

        /* renamed from: d  reason: collision with root package name */
        public EGLConfig f2717d;

        /* renamed from: e  reason: collision with root package name */
        public EGLContext f2718e;

        /* renamed from: f  reason: collision with root package name */
        private WeakReference<f> f2719f;

        public h(WeakReference<f> weakReference) {
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

        public static void a(String str, int i2) {
        }

        public static String b(String str, int i2) {
        }

        private static String b(int i2) {
        }

        public static void a(String str, String str2, int i2) {
        }

        private static String a(int i2) {
        }
    }

    public void a(InterfaceC0043f interfaceC0043f) {
    }

    public void a(e eVar) {
    }

    public void a(int i2, int i3, int i4, int i5, int i6, int i7) {
    }

    @Override // com.baidu.platform.comapi.map.ag
    public void a(Runnable runnable) {
    }

    @Override // com.baidu.platform.comapi.map.ag
    public Bitmap a(int i2, int i3, int i4, int i5, Object obj, Bitmap.Config config) {
    }

    private Bitmap a(int i2, int i3, int i4, int i5, GL10 gl10, Bitmap.Config config) {
    }
}
