package com.flurgle.camerakit;

import android.content.Context;
import android.graphics.YuvImage;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import h.j.a.f;
import h.j.a.g;
import h.j.a.k;
import h.j.a.q;
import h.j.a.t;
import java.io.File;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class CameraView extends FrameLayout implements LifecycleObserver {
    private static Handler r;
    private int b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f3276d;

    /* renamed from: e  reason: collision with root package name */
    private int f3277e;

    /* renamed from: f  reason: collision with root package name */
    private int f3278f;

    /* renamed from: g  reason: collision with root package name */
    private int f3279g;

    /* renamed from: h  reason: collision with root package name */
    private int f3280h;

    /* renamed from: i  reason: collision with root package name */
    private int f3281i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3282j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f3283k;

    /* renamed from: l  reason: collision with root package name */
    private e f3284l;

    /* renamed from: m  reason: collision with root package name */
    private k f3285m;

    /* renamed from: n  reason: collision with root package name */
    private h.j.a.d f3286n;

    /* renamed from: o  reason: collision with root package name */
    private q f3287o;

    /* renamed from: p  reason: collision with root package name */
    private Lifecycle f3288p;
    private boolean q;

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class a extends k {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ CameraView f3289e;

        public a(CameraView cameraView, Context context) {
        }

        @Override // h.j.a.k
        public void f(int i2) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class b implements View.OnTouchListener {
        public final /* synthetic */ FocusMarkerLayout b;
        public final /* synthetic */ CameraView c;

        public b(CameraView cameraView, FocusMarkerLayout focusMarkerLayout) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class c implements Runnable {
        public final /* synthetic */ CameraView b;

        public c(CameraView cameraView) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class d implements Runnable {
        public final /* synthetic */ int b;
        public final /* synthetic */ CameraView c;

        public d(CameraView cameraView, int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class e extends f {

        /* renamed from: a  reason: collision with root package name */
        private f f3290a;
        public final /* synthetic */ CameraView b;

        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class a extends f {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ e f3291a;

            public a(e eVar) {
            }
        }

        private e(CameraView cameraView) {
        }

        @Override // h.j.a.f
        public void a() {
        }

        @Override // h.j.a.f
        public void b() {
        }

        @Override // h.j.a.f
        public void c(YuvImage yuvImage) {
        }

        @Override // h.j.a.f
        public void d(byte[] bArr) {
        }

        @Override // h.j.a.f
        public void e(File file) {
        }

        @NonNull
        public f f() {
        }

        public void g(@Nullable f fVar) {
        }

        public /* synthetic */ e(CameraView cameraView, a aVar) {
        }
    }

    public CameraView(@NonNull Context context) {
    }

    public static /* synthetic */ h.j.a.d a(CameraView cameraView) {
    }

    public static /* synthetic */ q b(CameraView cameraView) {
    }

    public static /* synthetic */ int c(CameraView cameraView) {
    }

    public static /* synthetic */ boolean d(CameraView cameraView) {
    }

    public static /* synthetic */ int e(CameraView cameraView) {
    }

    public static /* synthetic */ int f(CameraView cameraView) {
    }

    private void h(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }

    private void j(boolean z, boolean z2) {
    }

    public void g() {
    }

    @Nullable
    public g getCameraProperties() {
    }

    public t getCaptureSize() {
    }

    public int getFacing() {
    }

    public int getFlash() {
    }

    public t getPreviewSize() {
    }

    public boolean i() {
    }

    public void k() {
    }

    public void l() {
    }

    public void m() {
    }

    public void n() {
    }

    public int o() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause(LifecycleOwner lifecycleOwner) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(LifecycleOwner lifecycleOwner) {
    }

    public int p() {
    }

    public void setCameraListener(f fVar) {
    }

    public void setCropOutput(boolean z) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
    }

    public void setFacing(int i2) {
    }

    public void setFlash(int i2) {
    }

    public void setFocus(int i2) {
    }

    public void setJpegQuality(int i2) {
    }

    public void setMethod(int i2) {
    }

    public void setPermissions(int i2) {
    }

    public void setVideoOutput(String str) {
    }

    public void setVideoQuality(int i2) {
    }

    public void setZoom(int i2) {
    }

    public CameraView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
    }
}
