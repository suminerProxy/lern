package h.w.a.e.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import h.w.a.e.a.h;
import h.w.a.e.b.b.m;
import h.w.a.e.b.b.n;
import h.w.a.e.b.d.a;
import java.util.LinkedList;

/* compiled from: DrawHandler.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
public class c extends Handler {
    public static final int D = 1;
    public static final int E = 2;
    public static final int F = 3;
    public static final int G = 4;
    public static final int H = 5;
    private static final int I = 6;
    private static final int J = 7;
    private static final int K = 8;
    private static final int L = 9;
    private static final int M = 10;
    private static final int N = 11;
    private static final int O = 12;
    private static final int P = 13;
    private static final int Q = 14;
    private static final long R = 10000000;
    private static final int S = 500;
    private boolean A;
    private boolean B;
    private boolean C;

    /* renamed from: a  reason: collision with root package name */
    private h.w.a.e.b.b.s.d f25566a;
    private e b;
    private long c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f25567d;

    /* renamed from: e  reason: collision with root package name */
    private long f25568e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f25569f;

    /* renamed from: g  reason: collision with root package name */
    private d f25570g;

    /* renamed from: h  reason: collision with root package name */
    private h.w.a.e.b.b.f f25571h;

    /* renamed from: i  reason: collision with root package name */
    private h.w.a.e.b.c.a f25572i;

    /* renamed from: j  reason: collision with root package name */
    public h f25573j;

    /* renamed from: k  reason: collision with root package name */
    private g f25574k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f25575l;

    /* renamed from: m  reason: collision with root package name */
    private h.w.a.e.b.b.b f25576m;

    /* renamed from: n  reason: collision with root package name */
    private final a.c f25577n;

    /* renamed from: o  reason: collision with root package name */
    private LinkedList<Long> f25578o;

    /* renamed from: p  reason: collision with root package name */
    private i f25579p;
    private boolean q;
    private long r;
    private long s;
    private long t;
    private long u;
    private long v;
    private boolean w;
    private long x;
    private long y;
    private boolean z;

    /* compiled from: DrawHandler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class a implements Runnable {
        public final /* synthetic */ c b;

        public a(c cVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: DrawHandler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class b extends i {
        public final /* synthetic */ c c;

        public b(c cVar, String str) {
        }

        @Override // h.w.a.e.a.i, java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: DrawHandler.java */
    /* renamed from: h.w.a.e.a.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class C0400c implements h.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f25580a;
        public final /* synthetic */ c b;

        public C0400c(c cVar, Runnable runnable) {
        }

        @Override // h.w.a.e.a.h.a
        public void a(h.w.a.e.b.b.d dVar) {
        }

        @Override // h.w.a.e.a.h.a
        public void b(h.w.a.e.b.b.d dVar) {
        }

        @Override // h.w.a.e.a.h.a
        public void c() {
        }

        @Override // h.w.a.e.a.h.a
        public void d() {
        }

        @Override // h.w.a.e.a.h.a
        public void e() {
        }
    }

    /* compiled from: DrawHandler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public interface d {
        void danmakuShown(h.w.a.e.b.b.d dVar);

        void drawingFinished();

        void prepared();

        void updateTimer(h.w.a.e.b.b.f fVar);
    }

    /* compiled from: DrawHandler.java */
    @TargetApi(16)
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_2.dex_9268620.dex */
    public class e implements Choreographer.FrameCallback {
        public final /* synthetic */ c b;

        private e(c cVar) {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j2) {
        }

        public /* synthetic */ e(c cVar, a aVar) {
        }
    }

    public c(Looper looper, g gVar, boolean z) {
    }

    private synchronized long B() {
    }

    private void I() {
    }

    private void N() {
    }

    private void Q(Runnable runnable) {
    }

    private synchronized void S() {
    }

    private synchronized void T() {
    }

    private void U() {
    }

    public static /* synthetic */ long a(c cVar, long j2) {
    }

    public static /* synthetic */ LinkedList b(c cVar) {
    }

    public static /* synthetic */ boolean c(c cVar, boolean z) {
    }

    public static /* synthetic */ boolean d(c cVar) {
    }

    public static /* synthetic */ void e(c cVar, long j2) {
    }

    private final long e0(long j2) {
    }

    public static /* synthetic */ a.c f(c cVar) {
    }

    private void f0() {
    }

    public static /* synthetic */ boolean g(c cVar) {
    }

    @TargetApi(16)
    private void g0() {
    }

    public static /* synthetic */ void h(c cVar) {
    }

    private void h0() {
    }

    public static /* synthetic */ void i(c cVar) {
    }

    private void i0() {
    }

    public static /* synthetic */ h.w.a.e.b.b.s.d j(c cVar) {
    }

    private void j0(long j2) {
    }

    public static /* synthetic */ boolean k(c cVar) {
    }

    public static /* synthetic */ void l(c cVar) {
    }

    public static /* synthetic */ d m(c cVar) {
    }

    public static /* synthetic */ boolean n(c cVar) {
    }

    public static /* synthetic */ long o(c cVar) {
    }

    public static /* synthetic */ boolean p(c cVar) {
    }

    public static /* synthetic */ long q(c cVar, long j2) {
    }

    public static /* synthetic */ g r(c cVar) {
    }

    public static /* synthetic */ long s(c cVar) {
    }

    public static /* synthetic */ h.w.a.e.b.b.f t(c cVar) {
    }

    private void v(g gVar) {
    }

    private h x(boolean z, h.w.a.e.b.b.f fVar, Context context, int i2, int i3, boolean z2, h.a aVar) {
    }

    public void A() {
    }

    public h.w.a.e.b.b.s.d C() {
    }

    public long D() {
    }

    public m E() {
    }

    public n F() {
    }

    public boolean G() {
    }

    public long H(boolean z) {
    }

    public void J(h.w.a.e.b.b.d dVar, boolean z) {
    }

    public boolean K() {
    }

    public boolean L() {
    }

    public void M(int i2, int i3) {
    }

    public void O() {
    }

    public void P() {
    }

    public void R() {
    }

    public void V(boolean z) {
    }

    public void W() {
    }

    public void X() {
    }

    public void Y(Long l2) {
    }

    public void Z(d dVar) {
    }

    public void a0(h.w.a.e.b.b.s.d dVar) {
    }

    public void b0(boolean z) {
    }

    public void c0(h.w.a.e.b.c.a aVar) {
    }

    public void d0(Long l2) {
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
    }

    public void u(h.w.a.e.b.b.d dVar) {
    }

    public void w() {
    }

    public a.c y(Canvas canvas) {
    }

    public void z(boolean z) {
    }
}
