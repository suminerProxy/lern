package h.j.a;

import android.graphics.Rect;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.flurgle.camerakit.AspectRatio;
import h.j.a.q;
import h.j.a.r;
import java.io.File;
import java.util.List;
import java.util.TreeSet;

/* compiled from: Camera1.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
public class b extends h.j.a.d {
    private static final int A = 3000;
    private static final String x = "b";
    private static final int y = 300;
    private static final int z = 1000;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private int f17290d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f17291e;

    /* renamed from: f  reason: collision with root package name */
    private Camera f17292f;

    /* renamed from: g  reason: collision with root package name */
    private Camera.Parameters f17293g;

    /* renamed from: h  reason: collision with root package name */
    private g f17294h;

    /* renamed from: i  reason: collision with root package name */
    private Camera.CameraInfo f17295i;

    /* renamed from: j  reason: collision with root package name */
    private t f17296j;

    /* renamed from: k  reason: collision with root package name */
    private t f17297k;

    /* renamed from: l  reason: collision with root package name */
    private MediaRecorder f17298l;

    /* renamed from: m  reason: collision with root package name */
    private File f17299m;

    /* renamed from: n  reason: collision with root package name */
    private Camera.AutoFocusCallback f17300n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f17301o;

    /* renamed from: p  reason: collision with root package name */
    private int f17302p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private Handler w;

    /* compiled from: Camera1.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class a implements q.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f17303a;

        public a(b bVar) {
        }

        @Override // h.j.a.q.b
        public void a() {
        }
    }

    /* compiled from: Camera1.java */
    /* renamed from: h.j.a.b$b  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class C0332b implements Camera.PictureCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f17304a;

        public C0332b(b bVar) {
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
        }
    }

    /* compiled from: Camera1.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class c implements Camera.PreviewCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f17305a;

        /* compiled from: Camera1.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class a implements r.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ c f17306a;

            public a(c cVar) {
            }

            @Override // h.j.a.r.a
            public void a(YuvImage yuvImage) {
            }
        }

        public c(b bVar) {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
        }
    }

    /* compiled from: Camera1.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class d implements View.OnTouchListener {
        public final /* synthetic */ b b;

        /* compiled from: Camera1.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class a implements Camera.AutoFocusCallback {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d f17307a;

            public a(d dVar) {
            }

            @Override // android.hardware.Camera.AutoFocusCallback
            public void onAutoFocus(boolean z, Camera camera) {
            }
        }

        /* compiled from: Camera1.java */
        /* renamed from: h.j.a.b$d$b  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class C0333b implements Camera.AutoFocusCallback {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d f17308a;

            public C0333b(d dVar) {
            }

            @Override // android.hardware.Camera.AutoFocusCallback
            public void onAutoFocus(boolean z, Camera camera) {
            }
        }

        /* compiled from: Camera1.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
        public class c implements Camera.AutoFocusCallback {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d f17309a;

            public c(d dVar) {
            }

            @Override // android.hardware.Camera.AutoFocusCallback
            public void onAutoFocus(boolean z, Camera camera) {
            }
        }

        public d(b bVar) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
        }
    }

    /* compiled from: Camera1.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_1.dex_9470356.dex */
    public class e implements Runnable {
        public final /* synthetic */ Camera b;
        public final /* synthetic */ boolean c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ b f17310d;

        public e(b bVar, Camera camera, boolean z) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public b(f fVar, q qVar) {
    }

    public static /* synthetic */ int A(b bVar) {
    }

    public static /* synthetic */ Rect B(b bVar, float f2, float f3) {
    }

    public static /* synthetic */ int C(b bVar) {
    }

    private void D(boolean z2) {
    }

    private void E() {
    }

    private int F() {
    }

    private int G() {
    }

    private static int H(float f2, int i2, int i3) {
    }

    private Rect I(float f2, float f3) {
    }

    private int J() {
    }

    private void K() {
    }

    private void L() {
    }

    private TreeSet<AspectRatio> M(List<Camera.Size> list, List<Camera.Size> list2) {
    }

    private CamcorderProfile N(int i2) {
    }

    private int O() {
    }

    private int P() {
    }

    public static t Q(List<t> list, int i2, int i3) {
    }

    public static t R(List<t> list, int i2, int i3) {
    }

    private void S() {
    }

    private void U(boolean z2) {
    }

    private void V() {
    }

    private void W() {
    }

    private void X(boolean z2, Camera camera) {
    }

    private void Z() {
    }

    public static /* synthetic */ Camera r(b bVar) {
    }

    public static /* synthetic */ boolean s(b bVar) {
    }

    public static /* synthetic */ void t(b bVar, boolean z2, Camera camera) {
    }

    public static /* synthetic */ Camera.AutoFocusCallback u(b bVar) {
    }

    public static /* synthetic */ Camera.Parameters v(b bVar) {
    }

    public static /* synthetic */ void w(b bVar) {
    }

    public static /* synthetic */ boolean x(b bVar) {
    }

    public static /* synthetic */ void y(b bVar, boolean z2) {
    }

    public static /* synthetic */ boolean z(b bVar, boolean z2) {
    }

    public void T(boolean z2) {
    }

    public void Y(Camera.AutoFocusCallback autoFocusCallback) {
    }

    @Override // h.j.a.d
    public void a() {
    }

    public List<t> a0(List<Camera.Size> list) {
    }

    @Override // h.j.a.d
    public void b() {
    }

    @Override // h.j.a.d
    @Nullable
    public g c() {
    }

    @Override // h.j.a.d
    public t d() {
    }

    @Override // h.j.a.d
    public t e() {
    }

    @Override // h.j.a.d
    public boolean f() {
    }

    @Override // h.j.a.d
    public void g(int i2) {
    }

    @Override // h.j.a.d
    public void h(int i2) {
    }

    @Override // h.j.a.d
    public void i(int i2) {
    }

    @Override // h.j.a.d
    public void j(int i2) {
    }

    @Override // h.j.a.d
    public void k(int i2) {
    }

    @Override // h.j.a.d
    public void l(String str) {
    }

    @Override // h.j.a.d
    public void m(int i2) {
    }

    @Override // h.j.a.d
    public void n(int i2) {
    }

    @Override // h.j.a.d
    public void o() {
    }

    @Override // h.j.a.d
    public void p() {
    }

    @Override // h.j.a.d
    public void q() {
    }
}
