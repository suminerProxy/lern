package i.a.c1;

import i.a.b0;
import i.a.b1.b;
import i.a.c;
import i.a.f;
import i.a.i0;
import i.a.j0;
import i.a.k0;
import i.a.l;
import i.a.n0;
import i.a.s;
import i.a.t0.g;
import i.a.v;
import i.a.v0.d;
import i.a.x0.e;
import i.a.x0.o;
import i.a.y0.g.h;
import i.a.y0.g.r;
import i.a.y0.j.k;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import org.reactivestreams.Subscriber;

/* compiled from: RxJavaPlugins.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class a {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static volatile i.a.x0.g<? super Throwable> f26643a;
    @g
    public static volatile o<? super Runnable, ? extends Runnable> b;
    @g
    public static volatile o<? super Callable<j0>, ? extends j0> c;
    @g

    /* renamed from: d  reason: collision with root package name */
    public static volatile o<? super Callable<j0>, ? extends j0> f26644d;
    @g

    /* renamed from: e  reason: collision with root package name */
    public static volatile o<? super Callable<j0>, ? extends j0> f26645e;
    @g

    /* renamed from: f  reason: collision with root package name */
    public static volatile o<? super Callable<j0>, ? extends j0> f26646f;
    @g

    /* renamed from: g  reason: collision with root package name */
    public static volatile o<? super j0, ? extends j0> f26647g;
    @g

    /* renamed from: h  reason: collision with root package name */
    public static volatile o<? super j0, ? extends j0> f26648h;
    @g

    /* renamed from: i  reason: collision with root package name */
    public static volatile o<? super j0, ? extends j0> f26649i;
    @g

    /* renamed from: j  reason: collision with root package name */
    public static volatile o<? super j0, ? extends j0> f26650j;
    @g

    /* renamed from: k  reason: collision with root package name */
    public static volatile o<? super l, ? extends l> f26651k;
    @g

    /* renamed from: l  reason: collision with root package name */
    public static volatile o<? super i.a.w0.a, ? extends i.a.w0.a> f26652l;
    @g

    /* renamed from: m  reason: collision with root package name */
    public static volatile o<? super b0, ? extends b0> f26653m;
    @g

    /* renamed from: n  reason: collision with root package name */
    public static volatile o<? super i.a.z0.a, ? extends i.a.z0.a> f26654n;
    @g

    /* renamed from: o  reason: collision with root package name */
    public static volatile o<? super s, ? extends s> f26655o;
    @g

    /* renamed from: p  reason: collision with root package name */
    public static volatile o<? super k0, ? extends k0> f26656p;
    @g
    public static volatile o<? super c, ? extends c> q;
    @g
    public static volatile o<? super b, ? extends b> r;
    @g
    public static volatile i.a.x0.c<? super l, ? super Subscriber, ? extends Subscriber> s;
    @g
    public static volatile i.a.x0.c<? super s, ? super v, ? extends v> t;
    @g
    public static volatile i.a.x0.c<? super b0, ? super i0, ? extends i0> u;
    @g
    public static volatile i.a.x0.c<? super k0, ? super n0, ? extends n0> v;
    @g
    public static volatile i.a.x0.c<? super c, ? super f, ? extends f> w;
    @g
    public static volatile e x;
    public static volatile boolean y;
    public static volatile boolean z;

    private a() {
        throw new IllegalStateException("No instances!");
    }

    @g
    public static i.a.x0.c<? super b0, ? super i0, ? extends i0> A() {
        return u;
    }

    public static void A0(@g i.a.x0.c<? super s, v, ? extends v> cVar) {
        if (!y) {
            t = cVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super b, ? extends b> B() {
        return r;
    }

    public static void B0(@g o<? super b0, ? extends b0> oVar) {
        if (!y) {
            f26653m = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super k0, ? extends k0> C() {
        return f26656p;
    }

    public static void C0(@g i.a.x0.c<? super b0, ? super i0, ? extends i0> cVar) {
        if (!y) {
            u = cVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static i.a.x0.c<? super k0, ? super n0, ? extends n0> D() {
        return v;
    }

    public static void D0(@g o<? super b, ? extends b> oVar) {
        if (!y) {
            r = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super Runnable, ? extends Runnable> E() {
        return b;
    }

    public static void E0(@g o<? super k0, ? extends k0> oVar) {
        if (!y) {
            f26656p = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super j0, ? extends j0> F() {
        return f26648h;
    }

    public static void F0(@g i.a.x0.c<? super k0, ? super n0, ? extends n0> cVar) {
        if (!y) {
            v = cVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @i.a.t0.f
    public static j0 G(@i.a.t0.f Callable<j0> callable) {
        i.a.y0.b.b.g(callable, "Scheduler Callable can't be null");
        o<? super Callable<j0>, ? extends j0> oVar = c;
        if (oVar == null) {
            return d(callable);
        }
        return c(oVar, callable);
    }

    public static void G0(@g o<? super Runnable, ? extends Runnable> oVar) {
        if (!y) {
            b = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @i.a.t0.f
    public static j0 H(@i.a.t0.f Callable<j0> callable) {
        i.a.y0.b.b.g(callable, "Scheduler Callable can't be null");
        o<? super Callable<j0>, ? extends j0> oVar = f26645e;
        if (oVar == null) {
            return d(callable);
        }
        return c(oVar, callable);
    }

    public static void H0(@g o<? super j0, ? extends j0> oVar) {
        if (!y) {
            f26648h = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @i.a.t0.f
    public static j0 I(@i.a.t0.f Callable<j0> callable) {
        i.a.y0.b.b.g(callable, "Scheduler Callable can't be null");
        o<? super Callable<j0>, ? extends j0> oVar = f26646f;
        if (oVar == null) {
            return d(callable);
        }
        return c(oVar, callable);
    }

    public static void I0(@i.a.t0.f Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    @i.a.t0.f
    public static j0 J(@i.a.t0.f Callable<j0> callable) {
        i.a.y0.b.b.g(callable, "Scheduler Callable can't be null");
        o<? super Callable<j0>, ? extends j0> oVar = f26644d;
        if (oVar == null) {
            return d(callable);
        }
        return c(oVar, callable);
    }

    public static void J0() {
        y = false;
    }

    public static boolean K(Throwable th) {
        return (th instanceof d) || (th instanceof i.a.v0.c) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof i.a.v0.a);
    }

    public static boolean L() {
        return z;
    }

    public static boolean M() {
        return y;
    }

    public static void N() {
        y = true;
    }

    @i.a.t0.f
    public static c O(@i.a.t0.f c cVar) {
        o<? super c, ? extends c> oVar = q;
        return oVar != null ? (c) b(oVar, cVar) : cVar;
    }

    @i.a.t0.f
    public static <T> l<T> P(@i.a.t0.f l<T> lVar) {
        o<? super l, ? extends l> oVar = f26651k;
        return oVar != null ? (l) b(oVar, lVar) : lVar;
    }

    @i.a.t0.f
    public static <T> s<T> Q(@i.a.t0.f s<T> sVar) {
        o<? super s, ? extends s> oVar = f26655o;
        return oVar != null ? (s) b(oVar, sVar) : sVar;
    }

    @i.a.t0.f
    public static <T> b0<T> R(@i.a.t0.f b0<T> b0Var) {
        o<? super b0, ? extends b0> oVar = f26653m;
        return oVar != null ? (b0) b(oVar, b0Var) : b0Var;
    }

    @i.a.t0.f
    public static <T> k0<T> S(@i.a.t0.f k0<T> k0Var) {
        o<? super k0, ? extends k0> oVar = f26656p;
        return oVar != null ? (k0) b(oVar, k0Var) : k0Var;
    }

    @i.a.t0.f
    public static <T> i.a.w0.a<T> T(@i.a.t0.f i.a.w0.a<T> aVar) {
        o<? super i.a.w0.a, ? extends i.a.w0.a> oVar = f26652l;
        return oVar != null ? (i.a.w0.a) b(oVar, aVar) : aVar;
    }

    @i.a.t0.f
    public static <T> i.a.z0.a<T> U(@i.a.t0.f i.a.z0.a<T> aVar) {
        o<? super i.a.z0.a, ? extends i.a.z0.a> oVar = f26654n;
        return oVar != null ? (i.a.z0.a) b(oVar, aVar) : aVar;
    }

    @i.a.t0.f
    public static <T> b<T> V(@i.a.t0.f b<T> bVar) {
        o<? super b, ? extends b> oVar = r;
        return oVar != null ? (b) b(oVar, bVar) : bVar;
    }

    public static boolean W() {
        e eVar = x;
        if (eVar != null) {
            try {
                return eVar.getAsBoolean();
            } catch (Throwable th) {
                throw k.f(th);
            }
        }
        return false;
    }

    @i.a.t0.f
    public static j0 X(@i.a.t0.f j0 j0Var) {
        o<? super j0, ? extends j0> oVar = f26647g;
        return oVar == null ? j0Var : (j0) b(oVar, j0Var);
    }

    public static void Y(@i.a.t0.f Throwable th) {
        i.a.x0.g<? super Throwable> gVar = f26643a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!K(th)) {
            th = new i.a.v0.f(th);
        }
        if (gVar != null) {
            try {
                gVar.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                I0(th2);
            }
        }
        th.printStackTrace();
        I0(th);
    }

    @i.a.t0.f
    public static j0 Z(@i.a.t0.f j0 j0Var) {
        o<? super j0, ? extends j0> oVar = f26649i;
        return oVar == null ? j0Var : (j0) b(oVar, j0Var);
    }

    @i.a.t0.f
    public static <T, U, R> R a(@i.a.t0.f i.a.x0.c<T, U, R> cVar, @i.a.t0.f T t2, @i.a.t0.f U u2) {
        try {
            return cVar.apply(t2, u2);
        } catch (Throwable th) {
            throw k.f(th);
        }
    }

    @i.a.t0.f
    public static j0 a0(@i.a.t0.f j0 j0Var) {
        o<? super j0, ? extends j0> oVar = f26650j;
        return oVar == null ? j0Var : (j0) b(oVar, j0Var);
    }

    @i.a.t0.f
    public static <T, R> R b(@i.a.t0.f o<T, R> oVar, @i.a.t0.f T t2) {
        try {
            return oVar.apply(t2);
        } catch (Throwable th) {
            throw k.f(th);
        }
    }

    @i.a.t0.f
    public static Runnable b0(@i.a.t0.f Runnable runnable) {
        i.a.y0.b.b.g(runnable, "run is null");
        o<? super Runnable, ? extends Runnable> oVar = b;
        return oVar == null ? runnable : (Runnable) b(oVar, runnable);
    }

    @i.a.t0.f
    public static j0 c(@i.a.t0.f o<? super Callable<j0>, ? extends j0> oVar, Callable<j0> callable) {
        return (j0) i.a.y0.b.b.g(b(oVar, callable), "Scheduler Callable result can't be null");
    }

    @i.a.t0.f
    public static j0 c0(@i.a.t0.f j0 j0Var) {
        o<? super j0, ? extends j0> oVar = f26648h;
        return oVar == null ? j0Var : (j0) b(oVar, j0Var);
    }

    @i.a.t0.f
    public static j0 d(@i.a.t0.f Callable<j0> callable) {
        try {
            return (j0) i.a.y0.b.b.g(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw k.f(th);
        }
    }

    @i.a.t0.f
    public static f d0(@i.a.t0.f c cVar, @i.a.t0.f f fVar) {
        i.a.x0.c<? super c, ? super f, ? extends f> cVar2 = w;
        return cVar2 != null ? (f) a(cVar2, cVar, fVar) : fVar;
    }

    @i.a.t0.f
    public static j0 e(@i.a.t0.f ThreadFactory threadFactory) {
        return new i.a.y0.g.b((ThreadFactory) i.a.y0.b.b.g(threadFactory, "threadFactory is null"));
    }

    @i.a.t0.f
    public static <T> v<? super T> e0(@i.a.t0.f s<T> sVar, @i.a.t0.f v<? super T> vVar) {
        i.a.x0.c<? super s, ? super v, ? extends v> cVar = t;
        return cVar != null ? (v) a(cVar, sVar, vVar) : vVar;
    }

    @i.a.t0.f
    public static j0 f(@i.a.t0.f ThreadFactory threadFactory) {
        return new i.a.y0.g.g((ThreadFactory) i.a.y0.b.b.g(threadFactory, "threadFactory is null"));
    }

    @i.a.t0.f
    public static <T> i0<? super T> f0(@i.a.t0.f b0<T> b0Var, @i.a.t0.f i0<? super T> i0Var) {
        i.a.x0.c<? super b0, ? super i0, ? extends i0> cVar = u;
        return cVar != null ? (i0) a(cVar, b0Var, i0Var) : i0Var;
    }

    @i.a.t0.f
    public static j0 g(@i.a.t0.f ThreadFactory threadFactory) {
        return new h((ThreadFactory) i.a.y0.b.b.g(threadFactory, "threadFactory is null"));
    }

    @i.a.t0.f
    public static <T> n0<? super T> g0(@i.a.t0.f k0<T> k0Var, @i.a.t0.f n0<? super T> n0Var) {
        i.a.x0.c<? super k0, ? super n0, ? extends n0> cVar = v;
        return cVar != null ? (n0) a(cVar, k0Var, n0Var) : n0Var;
    }

    @i.a.t0.f
    public static j0 h(@i.a.t0.f ThreadFactory threadFactory) {
        return new r((ThreadFactory) i.a.y0.b.b.g(threadFactory, "threadFactory is null"));
    }

    @i.a.t0.f
    public static <T> Subscriber<? super T> h0(@i.a.t0.f l<T> lVar, @i.a.t0.f Subscriber<? super T> subscriber) {
        i.a.x0.c<? super l, ? super Subscriber, ? extends Subscriber> cVar = s;
        return cVar != null ? (Subscriber) a(cVar, lVar, subscriber) : subscriber;
    }

    @g
    public static o<? super j0, ? extends j0> i() {
        return f26647g;
    }

    public static void i0() {
        k0(null);
        G0(null);
        j0(null);
        m0(null);
        q0(null);
        n0(null);
        H0(null);
        p0(null);
        r0(null);
        o0(null);
        x0(null);
        y0(null);
        B0(null);
        C0(null);
        E0(null);
        F0(null);
        t0(null);
        u0(null);
        v0(null);
        w0(null);
        z0(null);
        A0(null);
        D0(null);
        l0(false);
        s0(null);
    }

    @g
    public static i.a.x0.g<? super Throwable> j() {
        return f26643a;
    }

    public static void j0(@g o<? super j0, ? extends j0> oVar) {
        if (!y) {
            f26647g = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super Callable<j0>, ? extends j0> k() {
        return c;
    }

    public static void k0(@g i.a.x0.g<? super Throwable> gVar) {
        if (!y) {
            f26643a = gVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super Callable<j0>, ? extends j0> l() {
        return f26645e;
    }

    public static void l0(boolean z2) {
        if (!y) {
            z = z2;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super Callable<j0>, ? extends j0> m() {
        return f26646f;
    }

    public static void m0(@g o<? super Callable<j0>, ? extends j0> oVar) {
        if (!y) {
            c = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super Callable<j0>, ? extends j0> n() {
        return f26644d;
    }

    public static void n0(@g o<? super Callable<j0>, ? extends j0> oVar) {
        if (!y) {
            f26645e = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super j0, ? extends j0> o() {
        return f26649i;
    }

    public static void o0(@g o<? super Callable<j0>, ? extends j0> oVar) {
        if (!y) {
            f26646f = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super j0, ? extends j0> p() {
        return f26650j;
    }

    public static void p0(@g o<? super Callable<j0>, ? extends j0> oVar) {
        if (!y) {
            f26644d = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static e q() {
        return x;
    }

    public static void q0(@g o<? super j0, ? extends j0> oVar) {
        if (!y) {
            f26649i = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super c, ? extends c> r() {
        return q;
    }

    public static void r0(@g o<? super j0, ? extends j0> oVar) {
        if (!y) {
            f26650j = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static i.a.x0.c<? super c, ? super f, ? extends f> s() {
        return w;
    }

    public static void s0(@g e eVar) {
        if (!y) {
            x = eVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super i.a.w0.a, ? extends i.a.w0.a> t() {
        return f26652l;
    }

    public static void t0(@g o<? super c, ? extends c> oVar) {
        if (!y) {
            q = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super i.a.z0.a, ? extends i.a.z0.a> u() {
        return f26654n;
    }

    public static void u0(@g i.a.x0.c<? super c, ? super f, ? extends f> cVar) {
        if (!y) {
            w = cVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super l, ? extends l> v() {
        return f26651k;
    }

    public static void v0(@g o<? super i.a.w0.a, ? extends i.a.w0.a> oVar) {
        if (!y) {
            f26652l = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static i.a.x0.c<? super l, ? super Subscriber, ? extends Subscriber> w() {
        return s;
    }

    public static void w0(@g o<? super i.a.z0.a, ? extends i.a.z0.a> oVar) {
        if (!y) {
            f26654n = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super s, ? extends s> x() {
        return f26655o;
    }

    public static void x0(@g o<? super l, ? extends l> oVar) {
        if (!y) {
            f26651k = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static i.a.x0.c<? super s, ? super v, ? extends v> y() {
        return t;
    }

    public static void y0(@g i.a.x0.c<? super l, ? super Subscriber, ? extends Subscriber> cVar) {
        if (!y) {
            s = cVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super b0, ? extends b0> z() {
        return f26653m;
    }

    public static void z0(@g o<? super s, ? extends s> oVar) {
        if (!y) {
            f26655o = oVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
}
