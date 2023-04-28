package i.a;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Publisher;

/* compiled from: Completable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class c implements i {
    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static c A(Callable<? extends i> callable) {
        i.a.y0.b.b.g(callable, "completableSupplier");
        return i.a.c1.a.O(new i.a.y0.e.a.h(callable));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    private c M(i.a.x0.g<? super i.a.u0.c> gVar, i.a.x0.g<? super Throwable> gVar2, i.a.x0.a aVar, i.a.x0.a aVar2, i.a.x0.a aVar3, i.a.x0.a aVar4) {
        i.a.y0.b.b.g(gVar, "onSubscribe is null");
        i.a.y0.b.b.g(gVar2, "onError is null");
        i.a.y0.b.b.g(aVar, "onComplete is null");
        i.a.y0.b.b.g(aVar2, "onTerminate is null");
        i.a.y0.b.b.g(aVar3, "onAfterTerminate is null");
        i.a.y0.b.b.g(aVar4, "onDispose is null");
        return i.a.c1.a.O(new i.a.y0.e.a.i0(this, gVar, gVar2, aVar, aVar2, aVar3, aVar4));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static c P(Throwable th) {
        i.a.y0.b.b.g(th, "error is null");
        return i.a.c1.a.O(new i.a.y0.e.a.o(th));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static c Q(Callable<? extends Throwable> callable) {
        i.a.y0.b.b.g(callable, "errorSupplier is null");
        return i.a.c1.a.O(new i.a.y0.e.a.p(callable));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static c R(i.a.x0.a aVar) {
        i.a.y0.b.b.g(aVar, "run is null");
        return i.a.c1.a.O(new i.a.y0.e.a.q(aVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static c S(Callable<?> callable) {
        i.a.y0.b.b.g(callable, "callable is null");
        return i.a.c1.a.O(new i.a.y0.e.a.r(callable));
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.f
    private c S0(long j2, TimeUnit timeUnit, j0 j0Var, i iVar) {
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.O(new i.a.y0.e.a.m0(this, j2, timeUnit, j0Var, iVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static c T(Future<?> future) {
        i.a.y0.b.b.g(future, "future is null");
        return R(i.a.y0.b.a.j(future));
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    public static c T0(long j2, TimeUnit timeUnit) {
        return U0(j2, timeUnit, i.a.f1.b.a());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> c U(y<T> yVar) {
        i.a.y0.b.b.g(yVar, "maybe is null");
        return i.a.c1.a.O(new i.a.y0.e.c.q0(yVar));
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.f
    public static c U0(long j2, TimeUnit timeUnit, j0 j0Var) {
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.O(new i.a.y0.e.a.n0(j2, timeUnit, j0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> c V(g0<T> g0Var) {
        i.a.y0.b.b.g(g0Var, "observable is null");
        return i.a.c1.a.O(new i.a.y0.e.a.s(g0Var));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> c W(Publisher<T> publisher) {
        i.a.y0.b.b.g(publisher, "publisher is null");
        return i.a.c1.a.O(new i.a.y0.e.a.t(publisher));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static c X(Runnable runnable) {
        i.a.y0.b.b.g(runnable, "run is null");
        return i.a.c1.a.O(new i.a.y0.e.a.u(runnable));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> c Y(q0<T> q0Var) {
        i.a.y0.b.b.g(q0Var, "single is null");
        return i.a.c1.a.O(new i.a.y0.e.a.v(q0Var));
    }

    private static NullPointerException Y0(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static c c0(Iterable<? extends i> iterable) {
        i.a.y0.b.b.g(iterable, "sources is null");
        return i.a.c1.a.O(new i.a.y0.e.a.e0(iterable));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static c c1(i iVar) {
        i.a.y0.b.b.g(iVar, "source is null");
        if (!(iVar instanceof c)) {
            return i.a.c1.a.O(new i.a.y0.e.a.w(iVar));
        }
        throw new IllegalArgumentException("Use of unsafeCreate(Completable)!");
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public static c d0(Publisher<? extends i> publisher) {
        return f0(publisher, Integer.MAX_VALUE, false);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static c e(Iterable<? extends i> iterable) {
        i.a.y0.b.b.g(iterable, "sources is null");
        return i.a.c1.a.O(new i.a.y0.e.a.a(null, iterable));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static c e0(Publisher<? extends i> publisher, int i2) {
        return f0(publisher, i2, false);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public static <R> c e1(Callable<R> callable, i.a.x0.o<? super R, ? extends i> oVar, i.a.x0.g<? super R> gVar) {
        return f1(callable, oVar, gVar, true);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static c f(i... iVarArr) {
        i.a.y0.b.b.g(iVarArr, "sources is null");
        if (iVarArr.length == 0) {
            return s();
        }
        if (iVarArr.length == 1) {
            return g1(iVarArr[0]);
        }
        return i.a.c1.a.O(new i.a.y0.e.a.a(iVarArr, null));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    private static c f0(Publisher<? extends i> publisher, int i2, boolean z) {
        i.a.y0.b.b.g(publisher, "sources is null");
        i.a.y0.b.b.h(i2, "maxConcurrency");
        return i.a.c1.a.O(new i.a.y0.e.a.a0(publisher, i2, z));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <R> c f1(Callable<R> callable, i.a.x0.o<? super R, ? extends i> oVar, i.a.x0.g<? super R> gVar, boolean z) {
        i.a.y0.b.b.g(callable, "resourceSupplier is null");
        i.a.y0.b.b.g(oVar, "completableFunction is null");
        i.a.y0.b.b.g(gVar, "disposer is null");
        return i.a.c1.a.O(new i.a.y0.e.a.r0(callable, oVar, gVar, z));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static c g0(i... iVarArr) {
        i.a.y0.b.b.g(iVarArr, "sources is null");
        if (iVarArr.length == 0) {
            return s();
        }
        if (iVarArr.length == 1) {
            return g1(iVarArr[0]);
        }
        return i.a.c1.a.O(new i.a.y0.e.a.b0(iVarArr));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static c g1(i iVar) {
        i.a.y0.b.b.g(iVar, "source is null");
        if (iVar instanceof c) {
            return i.a.c1.a.O((c) iVar);
        }
        return i.a.c1.a.O(new i.a.y0.e.a.w(iVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static c h0(i... iVarArr) {
        i.a.y0.b.b.g(iVarArr, "sources is null");
        return i.a.c1.a.O(new i.a.y0.e.a.c0(iVarArr));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static c i0(Iterable<? extends i> iterable) {
        i.a.y0.b.b.g(iterable, "sources is null");
        return i.a.c1.a.O(new i.a.y0.e.a.d0(iterable));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    public static c j0(Publisher<? extends i> publisher) {
        return f0(publisher, Integer.MAX_VALUE, true);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static c k0(Publisher<? extends i> publisher, int i2) {
        return f0(publisher, i2, true);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public static c m0() {
        return i.a.c1.a.O(i.a.y0.e.a.f0.b);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static c s() {
        return i.a.c1.a.O(i.a.y0.e.a.n.b);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static c u(Iterable<? extends i> iterable) {
        i.a.y0.b.b.g(iterable, "sources is null");
        return i.a.c1.a.O(new i.a.y0.e.a.f(iterable));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static c v(Publisher<? extends i> publisher) {
        return w(publisher, 2);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static c w(Publisher<? extends i> publisher, int i2) {
        i.a.y0.b.b.g(publisher, "sources is null");
        i.a.y0.b.b.h(i2, "prefetch");
        return i.a.c1.a.O(new i.a.y0.e.a.d(publisher, i2));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static c x(i... iVarArr) {
        i.a.y0.b.b.g(iVarArr, "sources is null");
        if (iVarArr.length == 0) {
            return s();
        }
        if (iVarArr.length == 1) {
            return g1(iVarArr[0]);
        }
        return i.a.c1.a.O(new i.a.y0.e.a.e(iVarArr));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static c z(g gVar) {
        i.a.y0.b.b.g(gVar, "source is null");
        return i.a.c1.a.O(new i.a.y0.e.a.g(gVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final c A0(i.a.x0.r<? super Throwable> rVar) {
        return W(W0().n5(rVar));
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    public final c B(long j2, TimeUnit timeUnit) {
        return D(j2, timeUnit, i.a.f1.b.a(), false);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final c B0(i.a.x0.o<? super l<Throwable>, ? extends Publisher<?>> oVar) {
        return W(W0().p5(oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    public final c C(long j2, TimeUnit timeUnit, j0 j0Var) {
        return D(j2, timeUnit, j0Var, false);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final c C0(i iVar) {
        i.a.y0.b.b.g(iVar, "other is null");
        return x(iVar, this);
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.f
    public final c D(long j2, TimeUnit timeUnit, j0 j0Var, boolean z) {
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.O(new i.a.y0.e.a.i(this, j2, timeUnit, j0Var, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <T> l<T> D0(Publisher<T> publisher) {
        i.a.y0.b.b.g(publisher, "other is null");
        return W0().Y5(publisher);
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.e
    public final c E(long j2, TimeUnit timeUnit) {
        return F(j2, timeUnit, i.a.f1.b.a());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <T> b0<T> E0(b0<T> b0Var) {
        i.a.y0.b.b.g(b0Var, "other is null");
        return b0Var.concatWith(Z0());
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.e
    public final c F(long j2, TimeUnit timeUnit, j0 j0Var) {
        return U0(j2, timeUnit, j0Var).h(this);
    }

    @i.a.t0.h("none")
    public final i.a.u0.c F0() {
        i.a.y0.d.o oVar = new i.a.y0.d.o();
        d(oVar);
        return oVar;
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final c G(i.a.x0.a aVar) {
        i.a.x0.g<? super i.a.u0.c> h2 = i.a.y0.b.a.h();
        i.a.x0.g<? super Throwable> h3 = i.a.y0.b.a.h();
        i.a.x0.a aVar2 = i.a.y0.b.a.c;
        return M(h2, h3, aVar2, aVar2, aVar, aVar2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final i.a.u0.c G0(i.a.x0.a aVar) {
        i.a.y0.b.b.g(aVar, "onComplete is null");
        i.a.y0.d.j jVar = new i.a.y0.d.j(aVar);
        d(jVar);
        return jVar;
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final c H(i.a.x0.a aVar) {
        i.a.y0.b.b.g(aVar, "onFinally is null");
        return i.a.c1.a.O(new i.a.y0.e.a.l(this, aVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final i.a.u0.c H0(i.a.x0.a aVar, i.a.x0.g<? super Throwable> gVar) {
        i.a.y0.b.b.g(gVar, "onError is null");
        i.a.y0.b.b.g(aVar, "onComplete is null");
        i.a.y0.d.j jVar = new i.a.y0.d.j(gVar, aVar);
        d(jVar);
        return jVar;
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final c I(i.a.x0.a aVar) {
        i.a.x0.g<? super i.a.u0.c> h2 = i.a.y0.b.a.h();
        i.a.x0.g<? super Throwable> h3 = i.a.y0.b.a.h();
        i.a.x0.a aVar2 = i.a.y0.b.a.c;
        return M(h2, h3, aVar, aVar2, aVar2, aVar2);
    }

    public abstract void I0(f fVar);

    @i.a.t0.d
    @i.a.t0.h("none")
    public final c J(i.a.x0.a aVar) {
        i.a.x0.g<? super i.a.u0.c> h2 = i.a.y0.b.a.h();
        i.a.x0.g<? super Throwable> h3 = i.a.y0.b.a.h();
        i.a.x0.a aVar2 = i.a.y0.b.a.c;
        return M(h2, h3, aVar2, aVar2, aVar2, aVar);
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.f
    public final c J0(j0 j0Var) {
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.O(new i.a.y0.e.a.k0(this, j0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final c K(i.a.x0.g<? super Throwable> gVar) {
        i.a.x0.g<? super i.a.u0.c> h2 = i.a.y0.b.a.h();
        i.a.x0.a aVar = i.a.y0.b.a.c;
        return M(h2, gVar, aVar, aVar, aVar, aVar);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final <E extends f> E K0(E e2) {
        d(e2);
        return e2;
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final c L(i.a.x0.g<? super Throwable> gVar) {
        i.a.y0.b.b.g(gVar, "onEvent is null");
        return i.a.c1.a.O(new i.a.y0.e.a.m(this, gVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final c L0(i iVar) {
        i.a.y0.b.b.g(iVar, "other is null");
        return i.a.c1.a.O(new i.a.y0.e.a.l0(this, iVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final i.a.a1.n<Void> M0() {
        i.a.a1.n<Void> nVar = new i.a.a1.n<>();
        d(nVar);
        return nVar;
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final c N(i.a.x0.g<? super i.a.u0.c> gVar) {
        i.a.x0.g<? super Throwable> h2 = i.a.y0.b.a.h();
        i.a.x0.a aVar = i.a.y0.b.a.c;
        return M(gVar, h2, aVar, aVar, aVar, aVar);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final i.a.a1.n<Void> N0(boolean z) {
        i.a.a1.n<Void> nVar = new i.a.a1.n<>();
        if (z) {
            nVar.cancel();
        }
        d(nVar);
        return nVar;
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final c O(i.a.x0.a aVar) {
        i.a.x0.g<? super i.a.u0.c> h2 = i.a.y0.b.a.h();
        i.a.x0.g<? super Throwable> h3 = i.a.y0.b.a.h();
        i.a.x0.a aVar2 = i.a.y0.b.a.c;
        return M(h2, h3, aVar2, aVar, aVar2, aVar2);
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    public final c O0(long j2, TimeUnit timeUnit) {
        return S0(j2, timeUnit, i.a.f1.b.a(), null);
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.f
    public final c P0(long j2, TimeUnit timeUnit, i iVar) {
        i.a.y0.b.b.g(iVar, "other is null");
        return S0(j2, timeUnit, i.a.f1.b.a(), iVar);
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    public final c Q0(long j2, TimeUnit timeUnit, j0 j0Var) {
        return S0(j2, timeUnit, j0Var, null);
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.f
    public final c R0(long j2, TimeUnit timeUnit, j0 j0Var, i iVar) {
        i.a.y0.b.b.g(iVar, "other is null");
        return S0(j2, timeUnit, j0Var, iVar);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final <U> U V0(i.a.x0.o<? super c, U> oVar) {
        try {
            return (U) ((i.a.x0.o) i.a.y0.b.b.g(oVar, "converter is null")).apply(this);
        } catch (Throwable th) {
            i.a.v0.b.b(th);
            throw i.a.y0.j.k.f(th);
        }
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final <T> l<T> W0() {
        if (this instanceof i.a.y0.c.b) {
            return ((i.a.y0.c.b) this).c();
        }
        return i.a.c1.a.P(new i.a.y0.e.a.o0(this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final <T> s<T> X0() {
        if (this instanceof i.a.y0.c.c) {
            return ((i.a.y0.c.c) this).b();
        }
        return i.a.c1.a.Q(new i.a.y0.e.c.k0(this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final c Z() {
        return i.a.c1.a.O(new i.a.y0.e.a.x(this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final <T> b0<T> Z0() {
        if (this instanceof i.a.y0.c.d) {
            return ((i.a.y0.c.d) this).a();
        }
        return i.a.c1.a.R(new i.a.y0.e.a.p0(this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final c a0(h hVar) {
        i.a.y0.b.b.g(hVar, "onLift is null");
        return i.a.c1.a.O(new i.a.y0.e.a.y(this, hVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <T> k0<T> a1(Callable<? extends T> callable) {
        i.a.y0.b.b.g(callable, "completionValueSupplier is null");
        return i.a.c1.a.S(new i.a.y0.e.a.q0(this, callable, null));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.e
    public final <T> k0<a0<T>> b0() {
        return i.a.c1.a.S(new i.a.y0.e.a.z(this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <T> k0<T> b1(T t) {
        i.a.y0.b.b.g(t, "completionValue is null");
        return i.a.c1.a.S(new i.a.y0.e.a.q0(this, null, t));
    }

    @Override // i.a.i
    @i.a.t0.h("none")
    public final void d(f fVar) {
        i.a.y0.b.b.g(fVar, "s is null");
        try {
            f d0 = i.a.c1.a.d0(this, fVar);
            i.a.y0.b.b.g(d0, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            I0(d0);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            i.a.v0.b.b(th);
            i.a.c1.a.Y(th);
            throw Y0(th);
        }
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.f
    public final c d1(j0 j0Var) {
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.O(new i.a.y0.e.a.k(this, j0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final c g(i iVar) {
        i.a.y0.b.b.g(iVar, "other is null");
        return f(this, iVar);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final c h(i iVar) {
        i.a.y0.b.b.g(iVar, "next is null");
        return i.a.c1.a.O(new i.a.y0.e.a.b(this, iVar));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <T> l<T> i(Publisher<T> publisher) {
        i.a.y0.b.b.g(publisher, "next is null");
        return i.a.c1.a.P(new i.a.y0.e.d.b(this, publisher));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <T> s<T> j(y<T> yVar) {
        i.a.y0.b.b.g(yVar, "next is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.o(yVar, this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <T> b0<T> k(g0<T> g0Var) {
        i.a.y0.b.b.g(g0Var, "next is null");
        return i.a.c1.a.R(new i.a.y0.e.d.a(this, g0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <T> k0<T> l(q0<T> q0Var) {
        i.a.y0.b.b.g(q0Var, "next is null");
        return i.a.c1.a.S(new i.a.y0.e.g.g(q0Var, this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final c l0(i iVar) {
        i.a.y0.b.b.g(iVar, "other is null");
        return g0(this, iVar);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final <R> R m(@i.a.t0.f d<? extends R> dVar) {
        return (R) ((d) i.a.y0.b.b.g(dVar, "converter is null")).a(this);
    }

    @i.a.t0.h("none")
    public final void n() {
        i.a.y0.d.h hVar = new i.a.y0.d.h();
        d(hVar);
        hVar.b();
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.f
    public final c n0(j0 j0Var) {
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.O(new i.a.y0.e.a.g0(this, j0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final boolean o(long j2, TimeUnit timeUnit) {
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.d.h hVar = new i.a.y0.d.h();
        d(hVar);
        return hVar.a(j2, timeUnit);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final c o0() {
        return p0(i.a.y0.b.a.c());
    }

    @i.a.t0.g
    @i.a.t0.d
    @i.a.t0.h("none")
    public final Throwable p() {
        i.a.y0.d.h hVar = new i.a.y0.d.h();
        d(hVar);
        return hVar.d();
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final c p0(i.a.x0.r<? super Throwable> rVar) {
        i.a.y0.b.b.g(rVar, "predicate is null");
        return i.a.c1.a.O(new i.a.y0.e.a.h0(this, rVar));
    }

    @i.a.t0.g
    @i.a.t0.d
    @i.a.t0.h("none")
    public final Throwable q(long j2, TimeUnit timeUnit) {
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.d.h hVar = new i.a.y0.d.h();
        d(hVar);
        return hVar.e(j2, timeUnit);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final c q0(i.a.x0.o<? super Throwable, ? extends i> oVar) {
        i.a.y0.b.b.g(oVar, "errorMapper is null");
        return i.a.c1.a.O(new i.a.y0.e.a.j0(this, oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final c r() {
        return i.a.c1.a.O(new i.a.y0.e.a.c(this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final c r0() {
        return i.a.c1.a.O(new i.a.y0.e.a.j(this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final c s0() {
        return W(W0().P4());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final c t(j jVar) {
        return g1(((j) i.a.y0.b.b.g(jVar, "transformer is null")).a(this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final c t0(long j2) {
        return W(W0().Q4(j2));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final c u0(i.a.x0.e eVar) {
        return W(W0().R4(eVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final c v0(i.a.x0.o<? super l<Object>, ? extends Publisher<?>> oVar) {
        return W(W0().S4(oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final c w0() {
        return W(W0().j5());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final c x0(long j2) {
        return W(W0().k5(j2));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final c y(i iVar) {
        i.a.y0.b.b.g(iVar, "other is null");
        return i.a.c1.a.O(new i.a.y0.e.a.b(this, iVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final c y0(long j2, i.a.x0.r<? super Throwable> rVar) {
        return W(W0().l5(j2, rVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final c z0(i.a.x0.d<? super Integer, ? super Throwable> dVar) {
        return W(W0().m5(dVar));
    }
}
