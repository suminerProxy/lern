package i.a.e1.l;

import i.a.e1.b.f;
import i.a.e1.b.g;
import i.a.e1.c.c0;
import i.a.e1.c.i0;
import i.a.e1.c.j;
import i.a.e1.c.m;
import i.a.e1.c.p0;
import i.a.e1.c.q0;
import i.a.e1.c.r0;
import i.a.e1.c.u0;
import i.a.e1.c.z;
import i.a.e1.e.d;
import i.a.e1.g.c;
import i.a.e1.g.e;
import i.a.e1.g.o;
import i.a.e1.g.s;
import i.a.e1.h.h.h;
import i.a.e1.h.h.r;
import i.a.e1.h.k.k;
import i.a.e1.k.b;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import org.reactivestreams.Subscriber;

/* compiled from: RxJavaPlugins.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class a {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static volatile i.a.e1.g.g<? super Throwable> f27910a;
    @g
    public static volatile o<? super Runnable, ? extends Runnable> b;
    @g
    public static volatile o<? super s<q0>, ? extends q0> c;
    @g

    /* renamed from: d  reason: collision with root package name */
    public static volatile o<? super s<q0>, ? extends q0> f27911d;
    @g

    /* renamed from: e  reason: collision with root package name */
    public static volatile o<? super s<q0>, ? extends q0> f27912e;
    @g

    /* renamed from: f  reason: collision with root package name */
    public static volatile o<? super s<q0>, ? extends q0> f27913f;
    @g

    /* renamed from: g  reason: collision with root package name */
    public static volatile o<? super q0, ? extends q0> f27914g;
    @g

    /* renamed from: h  reason: collision with root package name */
    public static volatile o<? super q0, ? extends q0> f27915h;
    @g

    /* renamed from: i  reason: collision with root package name */
    public static volatile o<? super q0, ? extends q0> f27916i;
    @g

    /* renamed from: j  reason: collision with root package name */
    public static volatile o<? super q0, ? extends q0> f27917j;
    @g

    /* renamed from: k  reason: collision with root package name */
    public static volatile o<? super i.a.e1.c.s, ? extends i.a.e1.c.s> f27918k;
    @g

    /* renamed from: l  reason: collision with root package name */
    public static volatile o<? super i.a.e1.f.a, ? extends i.a.e1.f.a> f27919l;
    @g

    /* renamed from: m  reason: collision with root package name */
    public static volatile o<? super i0, ? extends i0> f27920m;
    @g

    /* renamed from: n  reason: collision with root package name */
    public static volatile o<? super i.a.e1.i.a, ? extends i.a.e1.i.a> f27921n;
    @g

    /* renamed from: o  reason: collision with root package name */
    public static volatile o<? super z, ? extends z> f27922o;
    @g

    /* renamed from: p  reason: collision with root package name */
    public static volatile o<? super r0, ? extends r0> f27923p;
    @g
    public static volatile o<? super j, ? extends j> q;
    @g
    public static volatile o<? super b, ? extends b> r;
    @g
    public static volatile c<? super i.a.e1.c.s, ? super Subscriber, ? extends Subscriber> s;
    @g
    public static volatile c<? super z, ? super c0, ? extends c0> t;
    @g
    public static volatile c<? super i0, ? super p0, ? extends p0> u;
    @g
    public static volatile c<? super r0, ? super u0, ? extends u0> v;
    @g
    public static volatile c<? super j, ? super m, ? extends m> w;
    @g
    public static volatile e x;
    public static volatile boolean y;
    public static volatile boolean z;

    private a() {
        throw new IllegalStateException("No instances!");
    }

    @g
    public static c<? super i0, ? super p0, ? extends p0> A() {
        return u;
    }

    public static void A0(@g c<? super z, c0, ? extends c0> onMaybeSubscribe) {
        if (!y) {
            t = onMaybeSubscribe;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super b, ? extends b> B() {
        return r;
    }

    public static void B0(@g o<? super i0, ? extends i0> onObservableAssembly) {
        if (!y) {
            f27920m = onObservableAssembly;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super r0, ? extends r0> C() {
        return f27923p;
    }

    public static void C0(@g c<? super i0, ? super p0, ? extends p0> onObservableSubscribe) {
        if (!y) {
            u = onObservableSubscribe;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static c<? super r0, ? super u0, ? extends u0> D() {
        return v;
    }

    public static void D0(@g o<? super b, ? extends b> handler) {
        if (!y) {
            r = handler;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super Runnable, ? extends Runnable> E() {
        return b;
    }

    public static void E0(@g o<? super r0, ? extends r0> onSingleAssembly) {
        if (!y) {
            f27923p = onSingleAssembly;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super q0, ? extends q0> F() {
        return f27915h;
    }

    public static void F0(@g c<? super r0, ? super u0, ? extends u0> onSingleSubscribe) {
        if (!y) {
            v = onSingleSubscribe;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @f
    public static q0 G(@f s<q0> defaultScheduler) {
        Objects.requireNonNull(defaultScheduler, "Scheduler Supplier can't be null");
        o<? super s<q0>, ? extends q0> oVar = c;
        if (oVar == null) {
            return d(defaultScheduler);
        }
        return c(oVar, defaultScheduler);
    }

    public static void G0(@g o<? super Runnable, ? extends Runnable> handler) {
        if (!y) {
            b = handler;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @f
    public static q0 H(@f s<q0> defaultScheduler) {
        Objects.requireNonNull(defaultScheduler, "Scheduler Supplier can't be null");
        o<? super s<q0>, ? extends q0> oVar = f27912e;
        if (oVar == null) {
            return d(defaultScheduler);
        }
        return c(oVar, defaultScheduler);
    }

    public static void H0(@g o<? super q0, ? extends q0> handler) {
        if (!y) {
            f27915h = handler;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @f
    public static q0 I(@f s<q0> defaultScheduler) {
        Objects.requireNonNull(defaultScheduler, "Scheduler Supplier can't be null");
        o<? super s<q0>, ? extends q0> oVar = f27913f;
        if (oVar == null) {
            return d(defaultScheduler);
        }
        return c(oVar, defaultScheduler);
    }

    public static void I0(@f Throwable error) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, error);
    }

    @f
    public static q0 J(@f s<q0> defaultScheduler) {
        Objects.requireNonNull(defaultScheduler, "Scheduler Supplier can't be null");
        o<? super s<q0>, ? extends q0> oVar = f27911d;
        if (oVar == null) {
            return d(defaultScheduler);
        }
        return c(oVar, defaultScheduler);
    }

    public static void J0() {
        y = false;
    }

    public static boolean K(Throwable error) {
        return (error instanceof d) || (error instanceof i.a.e1.e.c) || (error instanceof IllegalStateException) || (error instanceof NullPointerException) || (error instanceof IllegalArgumentException) || (error instanceof i.a.e1.e.a);
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

    @f
    public static j O(@f j source) {
        o<? super j, ? extends j> oVar = q;
        return oVar != null ? (j) b(oVar, source) : source;
    }

    @f
    public static <T> i.a.e1.c.s<T> P(@f i.a.e1.c.s<T> source) {
        o<? super i.a.e1.c.s, ? extends i.a.e1.c.s> oVar = f27918k;
        return oVar != null ? (i.a.e1.c.s) b(oVar, source) : source;
    }

    @f
    public static <T> z<T> Q(@f z<T> source) {
        o<? super z, ? extends z> oVar = f27922o;
        return oVar != null ? (z) b(oVar, source) : source;
    }

    @f
    public static <T> i0<T> R(@f i0<T> source) {
        o<? super i0, ? extends i0> oVar = f27920m;
        return oVar != null ? (i0) b(oVar, source) : source;
    }

    @f
    public static <T> r0<T> S(@f r0<T> source) {
        o<? super r0, ? extends r0> oVar = f27923p;
        return oVar != null ? (r0) b(oVar, source) : source;
    }

    @f
    public static <T> i.a.e1.f.a<T> T(@f i.a.e1.f.a<T> source) {
        o<? super i.a.e1.f.a, ? extends i.a.e1.f.a> oVar = f27919l;
        return oVar != null ? (i.a.e1.f.a) b(oVar, source) : source;
    }

    @f
    public static <T> i.a.e1.i.a<T> U(@f i.a.e1.i.a<T> source) {
        o<? super i.a.e1.i.a, ? extends i.a.e1.i.a> oVar = f27921n;
        return oVar != null ? (i.a.e1.i.a) b(oVar, source) : source;
    }

    @f
    public static <T> b<T> V(@f b<T> source) {
        o<? super b, ? extends b> oVar = r;
        return oVar != null ? (b) b(oVar, source) : source;
    }

    public static boolean W() {
        e eVar = x;
        if (eVar != null) {
            try {
                return eVar.getAsBoolean();
            } catch (Throwable th) {
                throw k.i(th);
            }
        }
        return false;
    }

    @f
    public static q0 X(@f q0 defaultScheduler) {
        o<? super q0, ? extends q0> oVar = f27914g;
        return oVar == null ? defaultScheduler : (q0) b(oVar, defaultScheduler);
    }

    public static void Y(@f Throwable error) {
        i.a.e1.g.g<? super Throwable> gVar = f27910a;
        if (error == null) {
            error = k.b("onError called with a null Throwable.");
        } else if (!K(error)) {
            error = new i.a.e1.e.f(error);
        }
        if (gVar != null) {
            try {
                gVar.accept(error);
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                I0(th);
            }
        }
        error.printStackTrace();
        I0(error);
    }

    @f
    public static q0 Z(@f q0 defaultScheduler) {
        o<? super q0, ? extends q0> oVar = f27916i;
        return oVar == null ? defaultScheduler : (q0) b(oVar, defaultScheduler);
    }

    @f
    public static <T, U, R> R a(@f c<T, U, R> f2, @f T t2, @f U u2) {
        try {
            return f2.apply(t2, u2);
        } catch (Throwable th) {
            throw k.i(th);
        }
    }

    @f
    public static q0 a0(@f q0 defaultScheduler) {
        o<? super q0, ? extends q0> oVar = f27917j;
        return oVar == null ? defaultScheduler : (q0) b(oVar, defaultScheduler);
    }

    @f
    public static <T, R> R b(@f o<T, R> f2, @f T t2) {
        try {
            return f2.apply(t2);
        } catch (Throwable th) {
            throw k.i(th);
        }
    }

    @f
    public static Runnable b0(@f Runnable run) {
        Objects.requireNonNull(run, "run is null");
        o<? super Runnable, ? extends Runnable> oVar = b;
        return oVar == null ? run : (Runnable) b(oVar, run);
    }

    @f
    public static q0 c(@f o<? super s<q0>, ? extends q0> f2, s<q0> s2) {
        Object b2 = b(f2, s2);
        Objects.requireNonNull(b2, "Scheduler Supplier result can't be null");
        return (q0) b2;
    }

    @f
    public static q0 c0(@f q0 defaultScheduler) {
        o<? super q0, ? extends q0> oVar = f27915h;
        return oVar == null ? defaultScheduler : (q0) b(oVar, defaultScheduler);
    }

    @f
    public static q0 d(@f s<q0> s2) {
        try {
            q0 q0Var = s2.get();
            Objects.requireNonNull(q0Var, "Scheduler Supplier result can't be null");
            return q0Var;
        } catch (Throwable th) {
            throw k.i(th);
        }
    }

    @f
    public static m d0(@f j source, @f m observer) {
        c<? super j, ? super m, ? extends m> cVar = w;
        return cVar != null ? (m) a(cVar, source, observer) : observer;
    }

    @f
    public static q0 e(@f ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory is null");
        return new i.a.e1.h.h.b(threadFactory);
    }

    @f
    public static <T> c0<? super T> e0(@f z<T> source, @f c0<? super T> observer) {
        c<? super z, ? super c0, ? extends c0> cVar = t;
        return cVar != null ? (c0) a(cVar, source, observer) : observer;
    }

    @f
    public static q0 f(@f ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory is null");
        return new i.a.e1.h.h.g(threadFactory);
    }

    @f
    public static <T> p0<? super T> f0(@f i0<T> source, @f p0<? super T> observer) {
        c<? super i0, ? super p0, ? extends p0> cVar = u;
        return cVar != null ? (p0) a(cVar, source, observer) : observer;
    }

    @f
    public static q0 g(@f ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory is null");
        return new h(threadFactory);
    }

    @f
    public static <T> u0<? super T> g0(@f r0<T> source, @f u0<? super T> observer) {
        c<? super r0, ? super u0, ? extends u0> cVar = v;
        return cVar != null ? (u0) a(cVar, source, observer) : observer;
    }

    @f
    public static q0 h(@f ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory is null");
        return new r(threadFactory);
    }

    @f
    public static <T> Subscriber<? super T> h0(@f i.a.e1.c.s<T> source, @f Subscriber<? super T> subscriber) {
        c<? super i.a.e1.c.s, ? super Subscriber, ? extends Subscriber> cVar = s;
        return cVar != null ? (Subscriber) a(cVar, source, subscriber) : subscriber;
    }

    @g
    public static o<? super q0, ? extends q0> i() {
        return f27914g;
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
    public static i.a.e1.g.g<? super Throwable> j() {
        return f27910a;
    }

    public static void j0(@g o<? super q0, ? extends q0> handler) {
        if (!y) {
            f27914g = handler;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super s<q0>, ? extends q0> k() {
        return c;
    }

    public static void k0(@g i.a.e1.g.g<? super Throwable> handler) {
        if (!y) {
            f27910a = handler;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super s<q0>, ? extends q0> l() {
        return f27912e;
    }

    public static void l0(boolean enable) {
        if (!y) {
            z = enable;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super s<q0>, ? extends q0> m() {
        return f27913f;
    }

    public static void m0(@g o<? super s<q0>, ? extends q0> handler) {
        if (!y) {
            c = handler;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super s<q0>, ? extends q0> n() {
        return f27911d;
    }

    public static void n0(@g o<? super s<q0>, ? extends q0> handler) {
        if (!y) {
            f27912e = handler;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super q0, ? extends q0> o() {
        return f27916i;
    }

    public static void o0(@g o<? super s<q0>, ? extends q0> handler) {
        if (!y) {
            f27913f = handler;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super q0, ? extends q0> p() {
        return f27917j;
    }

    public static void p0(@g o<? super s<q0>, ? extends q0> handler) {
        if (!y) {
            f27911d = handler;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static e q() {
        return x;
    }

    public static void q0(@g o<? super q0, ? extends q0> handler) {
        if (!y) {
            f27916i = handler;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super j, ? extends j> r() {
        return q;
    }

    public static void r0(@g o<? super q0, ? extends q0> handler) {
        if (!y) {
            f27917j = handler;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static c<? super j, ? super m, ? extends m> s() {
        return w;
    }

    public static void s0(@g e handler) {
        if (!y) {
            x = handler;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super i.a.e1.f.a, ? extends i.a.e1.f.a> t() {
        return f27919l;
    }

    public static void t0(@g o<? super j, ? extends j> onCompletableAssembly) {
        if (!y) {
            q = onCompletableAssembly;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super i.a.e1.i.a, ? extends i.a.e1.i.a> u() {
        return f27921n;
    }

    public static void u0(@g c<? super j, ? super m, ? extends m> onCompletableSubscribe) {
        if (!y) {
            w = onCompletableSubscribe;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super i.a.e1.c.s, ? extends i.a.e1.c.s> v() {
        return f27918k;
    }

    public static void v0(@g o<? super i.a.e1.f.a, ? extends i.a.e1.f.a> onConnectableFlowableAssembly) {
        if (!y) {
            f27919l = onConnectableFlowableAssembly;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static c<? super i.a.e1.c.s, ? super Subscriber, ? extends Subscriber> w() {
        return s;
    }

    public static void w0(@g o<? super i.a.e1.i.a, ? extends i.a.e1.i.a> onConnectableObservableAssembly) {
        if (!y) {
            f27921n = onConnectableObservableAssembly;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super z, ? extends z> x() {
        return f27922o;
    }

    public static void x0(@g o<? super i.a.e1.c.s, ? extends i.a.e1.c.s> onFlowableAssembly) {
        if (!y) {
            f27918k = onFlowableAssembly;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static c<? super z, ? super c0, ? extends c0> y() {
        return t;
    }

    public static void y0(@g c<? super i.a.e1.c.s, ? super Subscriber, ? extends Subscriber> onFlowableSubscribe) {
        if (!y) {
            s = onFlowableSubscribe;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    @g
    public static o<? super i0, ? extends i0> z() {
        return f27920m;
    }

    public static void z0(@g o<? super z, ? extends z> onMaybeAssembly) {
        if (!y) {
            f27922o = onMaybeAssembly;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
}
