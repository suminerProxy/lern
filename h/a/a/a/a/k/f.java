package h.a.a.a.a.k;

import android.content.Context;
import h.a.a.a.a.l.a0;
import h.a.a.a.a.l.a1;
import h.a.a.a.a.l.a2;
import h.a.a.a.a.l.b0;
import h.a.a.a.a.l.b1;
import h.a.a.a.a.l.b2;
import h.a.a.a.a.l.c0;
import h.a.a.a.a.l.c1;
import h.a.a.a.a.l.c2;
import h.a.a.a.a.l.d0;
import h.a.a.a.a.l.d1;
import h.a.a.a.a.l.d2;
import h.a.a.a.a.l.e0;
import h.a.a.a.a.l.e1;
import h.a.a.a.a.l.f0;
import h.a.a.a.a.l.f1;
import h.a.a.a.a.l.f2;
import h.a.a.a.a.l.g0;
import h.a.a.a.a.l.g1;
import h.a.a.a.a.l.g2;
import h.a.a.a.a.l.h0;
import h.a.a.a.a.l.i0;
import h.a.a.a.a.l.j0;
import h.a.a.a.a.l.k0;
import h.a.a.a.a.l.l0;
import h.a.a.a.a.l.l1;
import h.a.a.a.a.l.m0;
import h.a.a.a.a.l.m1;
import h.a.a.a.a.l.m2;
import h.a.a.a.a.l.n0;
import h.a.a.a.a.l.n2;
import h.a.a.a.a.l.o0;
import h.a.a.a.a.l.o2;
import h.a.a.a.a.l.p0;
import h.a.a.a.a.l.p2;
import h.a.a.a.a.l.q0;
import h.a.a.a.a.l.q1;
import h.a.a.a.a.l.r0;
import h.a.a.a.a.l.s;
import h.a.a.a.a.l.s0;
import h.a.a.a.a.l.s1;
import h.a.a.a.a.l.t;
import h.a.a.a.a.l.t0;
import h.a.a.a.a.l.t1;
import h.a.a.a.a.l.u;
import h.a.a.a.a.l.u0;
import h.a.a.a.a.l.u1;
import h.a.a.a.a.l.v;
import h.a.a.a.a.l.v0;
import h.a.a.a.a.l.v1;
import h.a.a.a.a.l.w;
import h.a.a.a.a.l.w0;
import h.a.a.a.a.l.w1;
import h.a.a.a.a.l.x;
import h.a.a.a.a.l.x0;
import h.a.a.a.a.l.x1;
import h.a.a.a.a.l.y0;
import h.a.a.a.a.l.y1;
import h.a.a.a.a.l.z;
import h.a.a.a.a.l.z0;
import h.a.a.a.a.l.z1;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import okhttp3.OkHttpClient;

/* compiled from: InternalRequestOperation.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
public class f {

    /* renamed from: h  reason: collision with root package name */
    private static final int f15753h = 1000;

    /* renamed from: i  reason: collision with root package name */
    private static final int f15754i = 10000;

    /* renamed from: j  reason: collision with root package name */
    private static ExecutorService f15755j;

    /* renamed from: a  reason: collision with root package name */
    private volatile URI f15756a;
    private URI b;
    private OkHttpClient c;

    /* renamed from: d  reason: collision with root package name */
    private Context f15757d;

    /* renamed from: e  reason: collision with root package name */
    private h.a.a.a.a.i.h.c f15758e;

    /* renamed from: f  reason: collision with root package name */
    private int f15759f;

    /* renamed from: g  reason: collision with root package name */
    private h.a.a.a.a.a f15760g;

    /* compiled from: InternalRequestOperation.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public static class a implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
        }
    }

    /* compiled from: InternalRequestOperation.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class b implements HostnameVerifier {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f15761a;
        public final /* synthetic */ f b;

        public b(f fVar, String str) {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
        }
    }

    /* compiled from: InternalRequestOperation.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class c implements h.a.a.a.a.h.a<y1, z1> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h.a.a.a.a.h.a f15762a;
        public final /* synthetic */ f b;

        public c(f fVar, h.a.a.a.a.h.a aVar) {
        }

        public void a(y1 y1Var, h.a.a.a.a.b bVar, h.a.a.a.a.f fVar) {
        }

        public void b(y1 y1Var, z1 z1Var) {
        }

        @Override // h.a.a.a.a.h.a
        public /* bridge */ /* synthetic */ void onFailure(y1 y1Var, h.a.a.a.a.b bVar, h.a.a.a.a.f fVar) {
        }

        @Override // h.a.a.a.a.h.a
        public /* bridge */ /* synthetic */ void onSuccess(y1 y1Var, z1 z1Var) {
        }
    }

    /* compiled from: InternalRequestOperation.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class d implements h.a.a.a.a.h.a<h.a.a.a.a.l.c, h.a.a.a.a.l.d> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h.a.a.a.a.h.a f15763a;
        public final /* synthetic */ f b;

        public d(f fVar, h.a.a.a.a.h.a aVar) {
        }

        public void a(h.a.a.a.a.l.c cVar, h.a.a.a.a.b bVar, h.a.a.a.a.f fVar) {
        }

        public void b(h.a.a.a.a.l.c cVar, h.a.a.a.a.l.d dVar) {
        }

        @Override // h.a.a.a.a.h.a
        public /* bridge */ /* synthetic */ void onFailure(h.a.a.a.a.l.c cVar, h.a.a.a.a.b bVar, h.a.a.a.a.f fVar) {
        }

        @Override // h.a.a.a.a.h.a
        public /* bridge */ /* synthetic */ void onSuccess(h.a.a.a.a.l.c cVar, h.a.a.a.a.l.d dVar) {
        }
    }

    /* compiled from: InternalRequestOperation.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class e implements h.a.a.a.a.h.a<o2, p2> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h.a.a.a.a.h.a f15764a;
        public final /* synthetic */ f b;

        public e(f fVar, h.a.a.a.a.h.a aVar) {
        }

        public void a(o2 o2Var, h.a.a.a.a.b bVar, h.a.a.a.a.f fVar) {
        }

        public void b(o2 o2Var, p2 p2Var) {
        }

        @Override // h.a.a.a.a.h.a
        public /* bridge */ /* synthetic */ void onFailure(o2 o2Var, h.a.a.a.a.b bVar, h.a.a.a.a.f fVar) {
        }

        @Override // h.a.a.a.a.h.a
        public /* bridge */ /* synthetic */ void onSuccess(o2 o2Var, p2 p2Var) {
        }
    }

    /* compiled from: InternalRequestOperation.java */
    /* renamed from: h.a.a.a.a.k.f$f  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class C0295f implements h.a.a.a.a.h.a<h.a.a.a.a.l.g, h.a.a.a.a.l.h> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h.a.a.a.a.h.a f15765a;
        public final /* synthetic */ f b;

        public C0295f(f fVar, h.a.a.a.a.h.a aVar) {
        }

        public void a(h.a.a.a.a.l.g gVar, h.a.a.a.a.b bVar, h.a.a.a.a.f fVar) {
        }

        public void b(h.a.a.a.a.l.g gVar, h.a.a.a.a.l.h hVar) {
        }

        @Override // h.a.a.a.a.h.a
        public /* bridge */ /* synthetic */ void onFailure(h.a.a.a.a.l.g gVar, h.a.a.a.a.b bVar, h.a.a.a.a.f fVar) {
        }

        @Override // h.a.a.a.a.h.a
        public /* bridge */ /* synthetic */ void onSuccess(h.a.a.a.a.l.g gVar, h.a.a.a.a.l.h hVar) {
        }
    }

    /* compiled from: InternalRequestOperation.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_0.dex_8988432.dex */
    public class g implements Callable {
        public final /* synthetic */ UnsupportedEncodingException b;
        public final /* synthetic */ f c;

        public g(f fVar, UnsupportedEncodingException unsupportedEncodingException) {
        }

        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
        }
    }

    public f(Context context, URI uri, h.a.a.a.a.i.h.c cVar, h.a.a.a.a.a aVar) {
    }

    public static /* synthetic */ void b(f fVar, l1 l1Var, m1 m1Var, h.a.a.a.a.h.a aVar) {
    }

    public static /* synthetic */ long c(f fVar, List list) {
    }

    private OkHttpClient f(String str, h.a.a.a.a.a aVar) {
    }

    private long g(List<q1> list) {
    }

    private void h(l lVar, l1 l1Var) {
    }

    private <Request extends l1, Result extends m1> void i(Request request, Result result) throws h.a.a.a.a.b {
    }

    private <Request extends l1, Result extends m1> void j(Request request, Result result, h.a.a.a.a.h.a<Request, Result> aVar) {
    }

    private boolean k(boolean z) {
    }

    public h.a.a.a.a.a A() {
    }

    public OkHttpClient B() {
    }

    public h<o0> C(n0 n0Var, h.a.a.a.a.h.a<n0, o0> aVar) {
    }

    public h<k0> D(j0 j0Var, h.a.a.a.a.h.a<j0, k0> aVar) {
    }

    public h<m0> E(l0 l0Var, h.a.a.a.a.h.a<l0, m0> aVar) {
    }

    public h<q0> F(p0 p0Var, h.a.a.a.a.h.a<p0, q0> aVar) {
    }

    public h<s0> G(r0 r0Var, h.a.a.a.a.h.a<r0, s0> aVar) {
    }

    public h<u0> H(t0 t0Var, h.a.a.a.a.h.a<t0, u0> aVar) {
    }

    public h<w0> I(v0 v0Var, h.a.a.a.a.h.a<v0, w0> aVar) {
    }

    public h<y0> J(x0 x0Var, h.a.a.a.a.h.a<x0, y0> aVar) {
    }

    public h<a1> K(z0 z0Var, h.a.a.a.a.h.a<z0, a1> aVar) {
    }

    public h<c1> L(b1 b1Var, h.a.a.a.a.h.a<b1, c1> aVar) {
    }

    public h<e1> M(d1 d1Var, h.a.a.a.a.h.a<d1, e1> aVar) {
    }

    public h<g1> N(f1 f1Var, h.a.a.a.a.h.a<f1, g1> aVar) {
    }

    public h<t1> O(s1 s1Var, h.a.a.a.a.h.a<s1, t1> aVar) {
    }

    public h<v1> P(u1 u1Var, h.a.a.a.a.h.a<u1, v1> aVar) {
    }

    public h<x1> Q(w1 w1Var, h.a.a.a.a.h.a<w1, x1> aVar) {
    }

    public h<z1> R(y1 y1Var, h.a.a.a.a.h.a<y1, z1> aVar) {
    }

    public h<b2> S(a2 a2Var, h.a.a.a.a.h.a<a2, b2> aVar) {
    }

    public h<d2> T(c2 c2Var, h.a.a.a.a.h.a<c2, d2> aVar) {
    }

    public h<g2> U(f2 f2Var, h.a.a.a.a.h.a<f2, g2> aVar) {
    }

    public void V(h.a.a.a.a.i.h.c cVar) {
    }

    public h.a.a.a.a.l.d W(h.a.a.a.a.l.c cVar) throws h.a.a.a.a.b, h.a.a.a.a.f {
    }

    public h.a.a.a.a.l.h X(h.a.a.a.a.l.g gVar) throws h.a.a.a.a.b, h.a.a.a.a.f {
    }

    public x Y(w wVar) throws h.a.a.a.a.b, h.a.a.a.a.f {
    }

    public q0 Z(p0 p0Var) throws h.a.a.a.a.b, h.a.a.a.a.f {
    }

    public h<h.a.a.a.a.l.b> a(h.a.a.a.a.l.a aVar, h.a.a.a.a.h.a<h.a.a.a.a.l.a, h.a.a.a.a.l.b> aVar2) {
    }

    public s0 a0(r0 r0Var) throws h.a.a.a.a.b, h.a.a.a.a.f {
    }

    public z1 b0(y1 y1Var) throws h.a.a.a.a.b, h.a.a.a.a.f {
    }

    public b2 c0(a2 a2Var) throws h.a.a.a.a.b, h.a.a.a.a.f {
    }

    public h<h.a.a.a.a.l.d> d(h.a.a.a.a.l.c cVar, h.a.a.a.a.h.a<h.a.a.a.a.l.c, h.a.a.a.a.l.d> aVar) {
    }

    public d2 d0(c2 c2Var) throws h.a.a.a.a.b, h.a.a.a.a.f {
    }

    public n2 e(m2 m2Var) throws h.a.a.a.a.b, h.a.a.a.a.f {
    }

    public g2 e0(f2 f2Var) throws h.a.a.a.a.b, h.a.a.a.a.f {
    }

    public p2 f0(o2 o2Var) throws h.a.a.a.a.b, h.a.a.a.a.f {
    }

    public h<n2> g0(m2 m2Var, h.a.a.a.a.h.a<m2, n2> aVar) {
    }

    public h<p2> h0(o2 o2Var, h.a.a.a.a.h.a<o2, p2> aVar) {
    }

    public h<h.a.a.a.a.l.h> l(h.a.a.a.a.l.g gVar, h.a.a.a.a.h.a<h.a.a.a.a.l.g, h.a.a.a.a.l.h> aVar) {
    }

    public h<h.a.a.a.a.l.j> m(h.a.a.a.a.l.i iVar, h.a.a.a.a.h.a<h.a.a.a.a.l.i, h.a.a.a.a.l.j> aVar) {
    }

    public h<h.a.a.a.a.l.l> n(h.a.a.a.a.l.k kVar, h.a.a.a.a.h.a<h.a.a.a.a.l.k, h.a.a.a.a.l.l> aVar) {
    }

    public h<h.a.a.a.a.l.r> o(h.a.a.a.a.l.q qVar, h.a.a.a.a.h.a<h.a.a.a.a.l.q, h.a.a.a.a.l.r> aVar) {
    }

    public h<h.a.a.a.a.l.n> p(h.a.a.a.a.l.m mVar, h.a.a.a.a.h.a<h.a.a.a.a.l.m, h.a.a.a.a.l.n> aVar) {
    }

    public h<h.a.a.a.a.l.p> q(h.a.a.a.a.l.o oVar, h.a.a.a.a.h.a<h.a.a.a.a.l.o, h.a.a.a.a.l.p> aVar) {
    }

    public h<t> r(s sVar, h.a.a.a.a.h.a<s, t> aVar) {
    }

    public h<v> s(u uVar, h.a.a.a.a.h.a<u, v> aVar) {
    }

    public h<x> t(w wVar, h.a.a.a.a.h.a<w, x> aVar) {
    }

    public Context u() {
    }

    public h<a0> v(z zVar, h.a.a.a.a.h.a<z, a0> aVar) {
    }

    public h<c0> w(b0 b0Var, h.a.a.a.a.h.a<b0, c0> aVar) {
    }

    public h<e0> x(d0 d0Var, h.a.a.a.a.h.a<d0, e0> aVar) {
    }

    public h<g0> y(f0 f0Var, h.a.a.a.a.h.a<f0, g0> aVar) {
    }

    public h<i0> z(h0 h0Var, h.a.a.a.a.h.a<h0, i0> aVar) {
    }

    public f(Context context, h.a.a.a.a.i.h.c cVar, h.a.a.a.a.a aVar) {
    }
}
