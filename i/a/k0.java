package i.a;

import i.a.y0.e.b.d1;
import i.a.y0.e.b.r3;
import i.a.y0.e.e.e3;
import i.a.y0.e.g.s0;
import i.a.y0.e.g.t0;
import i.a.y0.e.g.u0;
import i.a.y0.e.g.v0;
import i.a.y0.e.g.w0;
import i.a.y0.e.g.x0;
import i.a.y0.e.g.y0;
import i.a.y0.e.g.z0;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Publisher;

/* compiled from: Single.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class k0<T> implements q0<T> {
    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> k0<T> A(o0<T> o0Var) {
        i.a.y0.b.b.g(o0Var, "source is null");
        return i.a.c1.a.S(new i.a.y0.e.g.d(o0Var));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> A0(q0<? extends T> q0Var, q0<? extends T> q0Var2) {
        i.a.y0.b.b.g(q0Var, "source1 is null");
        i.a.y0.b.b.g(q0Var2, "source2 is null");
        return E0(l.N2(q0Var, q0Var2));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T, U> k0<T> A1(Callable<U> callable, i.a.x0.o<? super U, ? extends q0<? extends T>> oVar, i.a.x0.g<? super U> gVar, boolean z) {
        i.a.y0.b.b.g(callable, "resourceSupplier is null");
        i.a.y0.b.b.g(oVar, "singleFunction is null");
        i.a.y0.b.b.g(gVar, "disposer is null");
        return i.a.c1.a.S(new x0(callable, oVar, gVar, z));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> k0<T> B(Callable<? extends q0<? extends T>> callable) {
        i.a.y0.b.b.g(callable, "singleSupplier is null");
        return i.a.c1.a.S(new i.a.y0.e.g.e(callable));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> B0(q0<? extends T> q0Var, q0<? extends T> q0Var2, q0<? extends T> q0Var3) {
        i.a.y0.b.b.g(q0Var, "source1 is null");
        i.a.y0.b.b.g(q0Var2, "source2 is null");
        i.a.y0.b.b.g(q0Var3, "source3 is null");
        return E0(l.N2(q0Var, q0Var2, q0Var3));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> k0<T> B1(q0<T> q0Var) {
        i.a.y0.b.b.g(q0Var, "source is null");
        if (q0Var instanceof k0) {
            return i.a.c1.a.S((k0) q0Var);
        }
        return i.a.c1.a.S(new i.a.y0.e.g.f0(q0Var));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> C0(q0<? extends T> q0Var, q0<? extends T> q0Var2, q0<? extends T> q0Var3, q0<? extends T> q0Var4) {
        i.a.y0.b.b.g(q0Var, "source1 is null");
        i.a.y0.b.b.g(q0Var2, "source2 is null");
        i.a.y0.b.b.g(q0Var3, "source3 is null");
        i.a.y0.b.b.g(q0Var4, "source4 is null");
        return E0(l.N2(q0Var, q0Var2, q0Var3, q0Var4));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> k0<R> C1(q0<? extends T1> q0Var, q0<? extends T2> q0Var2, q0<? extends T3> q0Var3, q0<? extends T4> q0Var4, q0<? extends T5> q0Var5, q0<? extends T6> q0Var6, q0<? extends T7> q0Var7, q0<? extends T8> q0Var8, q0<? extends T9> q0Var9, i.a.x0.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        i.a.y0.b.b.g(q0Var, "source1 is null");
        i.a.y0.b.b.g(q0Var2, "source2 is null");
        i.a.y0.b.b.g(q0Var3, "source3 is null");
        i.a.y0.b.b.g(q0Var4, "source4 is null");
        i.a.y0.b.b.g(q0Var5, "source5 is null");
        i.a.y0.b.b.g(q0Var6, "source6 is null");
        i.a.y0.b.b.g(q0Var7, "source7 is null");
        i.a.y0.b.b.g(q0Var8, "source8 is null");
        i.a.y0.b.b.g(q0Var9, "source9 is null");
        return L1(i.a.y0.b.a.E(nVar), q0Var, q0Var2, q0Var3, q0Var4, q0Var5, q0Var6, q0Var7, q0Var8, q0Var9);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> D0(Iterable<? extends q0<? extends T>> iterable) {
        return E0(l.T2(iterable));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> k0<R> D1(q0<? extends T1> q0Var, q0<? extends T2> q0Var2, q0<? extends T3> q0Var3, q0<? extends T4> q0Var4, q0<? extends T5> q0Var5, q0<? extends T6> q0Var6, q0<? extends T7> q0Var7, q0<? extends T8> q0Var8, i.a.x0.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        i.a.y0.b.b.g(q0Var, "source1 is null");
        i.a.y0.b.b.g(q0Var2, "source2 is null");
        i.a.y0.b.b.g(q0Var3, "source3 is null");
        i.a.y0.b.b.g(q0Var4, "source4 is null");
        i.a.y0.b.b.g(q0Var5, "source5 is null");
        i.a.y0.b.b.g(q0Var6, "source6 is null");
        i.a.y0.b.b.g(q0Var7, "source7 is null");
        i.a.y0.b.b.g(q0Var8, "source8 is null");
        return L1(i.a.y0.b.a.D(mVar), q0Var, q0Var2, q0Var3, q0Var4, q0Var5, q0Var6, q0Var7, q0Var8);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> E0(Publisher<? extends q0<? extends T>> publisher) {
        i.a.y0.b.b.g(publisher, "sources is null");
        return i.a.c1.a.P(new d1(publisher, i.a.y0.e.g.h0.c(), true, Integer.MAX_VALUE, l.U()));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T1, T2, T3, T4, T5, T6, T7, R> k0<R> E1(q0<? extends T1> q0Var, q0<? extends T2> q0Var2, q0<? extends T3> q0Var3, q0<? extends T4> q0Var4, q0<? extends T5> q0Var5, q0<? extends T6> q0Var6, q0<? extends T7> q0Var7, i.a.x0.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        i.a.y0.b.b.g(q0Var, "source1 is null");
        i.a.y0.b.b.g(q0Var2, "source2 is null");
        i.a.y0.b.b.g(q0Var3, "source3 is null");
        i.a.y0.b.b.g(q0Var4, "source4 is null");
        i.a.y0.b.b.g(q0Var5, "source5 is null");
        i.a.y0.b.b.g(q0Var6, "source6 is null");
        i.a.y0.b.b.g(q0Var7, "source7 is null");
        return L1(i.a.y0.b.a.C(lVar), q0Var, q0Var2, q0Var3, q0Var4, q0Var5, q0Var6, q0Var7);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T1, T2, T3, T4, T5, T6, R> k0<R> F1(q0<? extends T1> q0Var, q0<? extends T2> q0Var2, q0<? extends T3> q0Var3, q0<? extends T4> q0Var4, q0<? extends T5> q0Var5, q0<? extends T6> q0Var6, i.a.x0.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        i.a.y0.b.b.g(q0Var, "source1 is null");
        i.a.y0.b.b.g(q0Var2, "source2 is null");
        i.a.y0.b.b.g(q0Var3, "source3 is null");
        i.a.y0.b.b.g(q0Var4, "source4 is null");
        i.a.y0.b.b.g(q0Var5, "source5 is null");
        i.a.y0.b.b.g(q0Var6, "source6 is null");
        return L1(i.a.y0.b.a.B(kVar), q0Var, q0Var2, q0Var3, q0Var4, q0Var5, q0Var6);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public static <T> k0<T> G0() {
        return i.a.c1.a.S(i.a.y0.e.g.m0.b);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T1, T2, T3, T4, T5, R> k0<R> G1(q0<? extends T1> q0Var, q0<? extends T2> q0Var2, q0<? extends T3> q0Var3, q0<? extends T4> q0Var4, q0<? extends T5> q0Var5, i.a.x0.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        i.a.y0.b.b.g(q0Var, "source1 is null");
        i.a.y0.b.b.g(q0Var2, "source2 is null");
        i.a.y0.b.b.g(q0Var3, "source3 is null");
        i.a.y0.b.b.g(q0Var4, "source4 is null");
        i.a.y0.b.b.g(q0Var5, "source5 is null");
        return L1(i.a.y0.b.a.A(jVar), q0Var, q0Var2, q0Var3, q0Var4, q0Var5);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T1, T2, T3, T4, R> k0<R> H1(q0<? extends T1> q0Var, q0<? extends T2> q0Var2, q0<? extends T3> q0Var3, q0<? extends T4> q0Var4, i.a.x0.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        i.a.y0.b.b.g(q0Var, "source1 is null");
        i.a.y0.b.b.g(q0Var2, "source2 is null");
        i.a.y0.b.b.g(q0Var3, "source3 is null");
        i.a.y0.b.b.g(q0Var4, "source4 is null");
        return L1(i.a.y0.b.a.z(iVar), q0Var, q0Var2, q0Var3, q0Var4);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T1, T2, T3, R> k0<R> I1(q0<? extends T1> q0Var, q0<? extends T2> q0Var2, q0<? extends T3> q0Var3, i.a.x0.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        i.a.y0.b.b.g(q0Var, "source1 is null");
        i.a.y0.b.b.g(q0Var2, "source2 is null");
        i.a.y0.b.b.g(q0Var3, "source3 is null");
        return L1(i.a.y0.b.a.y(hVar), q0Var, q0Var2, q0Var3);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T1, T2, R> k0<R> J1(q0<? extends T1> q0Var, q0<? extends T2> q0Var2, i.a.x0.c<? super T1, ? super T2, ? extends R> cVar) {
        i.a.y0.b.b.g(q0Var, "source1 is null");
        i.a.y0.b.b.g(q0Var2, "source2 is null");
        return L1(i.a.y0.b.a.x(cVar), q0Var, q0Var2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T, R> k0<R> K1(Iterable<? extends q0<? extends T>> iterable, i.a.x0.o<? super Object[], ? extends R> oVar) {
        i.a.y0.b.b.g(oVar, "zipper is null");
        i.a.y0.b.b.g(iterable, "sources is null");
        return i.a.c1.a.S(new z0(iterable, oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T, R> k0<R> L1(i.a.x0.o<? super Object[], ? extends R> oVar, q0<? extends T>... q0VarArr) {
        i.a.y0.b.b.g(oVar, "zipper is null");
        i.a.y0.b.b.g(q0VarArr, "sources is null");
        if (q0VarArr.length == 0) {
            return X(new NoSuchElementException());
        }
        return i.a.c1.a.S(new y0(q0VarArr, oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> k0<Boolean> W(q0<? extends T> q0Var, q0<? extends T> q0Var2) {
        i.a.y0.b.b.g(q0Var, "first is null");
        i.a.y0.b.b.g(q0Var2, "second is null");
        return i.a.c1.a.S(new i.a.y0.e.g.v(q0Var, q0Var2));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> k0<T> X(Throwable th) {
        i.a.y0.b.b.g(th, "error is null");
        return Y(i.a.y0.b.a.m(th));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> k0<T> Y(Callable<? extends Throwable> callable) {
        i.a.y0.b.b.g(callable, "errorSupplier is null");
        return i.a.c1.a.S(new i.a.y0.e.g.w(callable));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> k0<T> e(Iterable<? extends q0<? extends T>> iterable) {
        i.a.y0.b.b.g(iterable, "sources is null");
        return i.a.c1.a.S(new i.a.y0.e.g.a(null, iterable));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public static <T> k0<T> f(q0<? extends T>... q0VarArr) {
        if (q0VarArr.length == 0) {
            return Y(i.a.y0.e.g.h0.a());
        }
        if (q0VarArr.length == 1) {
            return B1(q0VarArr[0]);
        }
        return i.a.c1.a.S(new i.a.y0.e.g.a(q0VarArr, null));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> k0<T> h0(Callable<? extends T> callable) {
        i.a.y0.b.b.g(callable, "callable is null");
        return i.a.c1.a.S(new i.a.y0.e.g.d0(callable));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public static <T> k0<T> i0(Future<? extends T> future) {
        return w1(l.P2(future));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public static <T> k0<T> j0(Future<? extends T> future, long j2, TimeUnit timeUnit) {
        return w1(l.Q2(future, j2, timeUnit));
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    public static <T> k0<T> k0(Future<? extends T> future, long j2, TimeUnit timeUnit, j0 j0Var) {
        return w1(l.R2(future, j2, timeUnit, j0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    public static <T> k0<T> l0(Future<? extends T> future, j0 j0Var) {
        return w1(l.S2(future, j0Var));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> m(q0<? extends T> q0Var, q0<? extends T> q0Var2) {
        i.a.y0.b.b.g(q0Var, "source1 is null");
        i.a.y0.b.b.g(q0Var2, "source2 is null");
        return q(l.N2(q0Var, q0Var2));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> k0<T> m0(g0<? extends T> g0Var) {
        i.a.y0.b.b.g(g0Var, "observableSource is null");
        return i.a.c1.a.S(new e3(g0Var, null));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> n(q0<? extends T> q0Var, q0<? extends T> q0Var2, q0<? extends T> q0Var3) {
        i.a.y0.b.b.g(q0Var, "source1 is null");
        i.a.y0.b.b.g(q0Var2, "source2 is null");
        i.a.y0.b.b.g(q0Var3, "source3 is null");
        return q(l.N2(q0Var, q0Var2, q0Var3));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> k0<T> n0(Publisher<? extends T> publisher) {
        i.a.y0.b.b.g(publisher, "publisher is null");
        return i.a.c1.a.S(new i.a.y0.e.g.e0(publisher));
    }

    private k0<T> n1(long j2, TimeUnit timeUnit, j0 j0Var, q0<? extends T> q0Var) {
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.S(new s0(this, j2, timeUnit, j0Var, q0Var));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> o(q0<? extends T> q0Var, q0<? extends T> q0Var2, q0<? extends T> q0Var3, q0<? extends T> q0Var4) {
        i.a.y0.b.b.g(q0Var, "source1 is null");
        i.a.y0.b.b.g(q0Var2, "source2 is null");
        i.a.y0.b.b.g(q0Var3, "source3 is null");
        i.a.y0.b.b.g(q0Var4, "source4 is null");
        return q(l.N2(q0Var, q0Var2, q0Var3, q0Var4));
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    public static k0<Long> o1(long j2, TimeUnit timeUnit) {
        return p1(j2, timeUnit, i.a.f1.b.a());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> p(Iterable<? extends q0<? extends T>> iterable) {
        return q(l.T2(iterable));
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.f
    public static k0<Long> p1(long j2, TimeUnit timeUnit, j0 j0Var) {
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.S(new t0(j2, timeUnit, j0Var));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> q(Publisher<? extends q0<? extends T>> publisher) {
        return r(publisher, 2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> k0<T> q0(T t) {
        i.a.y0.b.b.g(t, "value is null");
        return i.a.c1.a.S(new i.a.y0.e.g.i0(t));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> r(Publisher<? extends q0<? extends T>> publisher, int i2) {
        i.a.y0.b.b.g(publisher, "sources is null");
        i.a.y0.b.b.h(i2, "prefetch");
        return i.a.c1.a.P(new i.a.y0.e.b.z(publisher, i.a.y0.e.g.h0.c(), i2, i.a.y0.j.j.IMMEDIATE));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> b0<T> s(g0<? extends q0<? extends T>> g0Var) {
        i.a.y0.b.b.g(g0Var, "sources is null");
        return i.a.c1.a.R(new i.a.y0.e.e.v(g0Var, i.a.y0.e.g.h0.d(), 2, i.a.y0.j.j.IMMEDIATE));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> t(q0<? extends T>... q0VarArr) {
        return i.a.c1.a.P(new i.a.y0.e.b.w(l.N2(q0VarArr), i.a.y0.e.g.h0.c(), 2, i.a.y0.j.j.BOUNDARY));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> u(q0<? extends T>... q0VarArr) {
        return l.N2(q0VarArr).W0(i.a.y0.e.g.h0.c());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> u0(q0<? extends T> q0Var, q0<? extends T> q0Var2) {
        i.a.y0.b.b.g(q0Var, "source1 is null");
        i.a.y0.b.b.g(q0Var2, "source2 is null");
        return y0(l.N2(q0Var, q0Var2));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> v(Iterable<? extends q0<? extends T>> iterable) {
        return l.T2(iterable).W0(i.a.y0.e.g.h0.c());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> v0(q0<? extends T> q0Var, q0<? extends T> q0Var2, q0<? extends T> q0Var3) {
        i.a.y0.b.b.g(q0Var, "source1 is null");
        i.a.y0.b.b.g(q0Var2, "source2 is null");
        i.a.y0.b.b.g(q0Var3, "source3 is null");
        return y0(l.N2(q0Var, q0Var2, q0Var3));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> w(Publisher<? extends q0<? extends T>> publisher) {
        return l.U2(publisher).W0(i.a.y0.e.g.h0.c());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> w0(q0<? extends T> q0Var, q0<? extends T> q0Var2, q0<? extends T> q0Var3, q0<? extends T> q0Var4) {
        i.a.y0.b.b.g(q0Var, "source1 is null");
        i.a.y0.b.b.g(q0Var2, "source2 is null");
        i.a.y0.b.b.g(q0Var3, "source3 is null");
        i.a.y0.b.b.g(q0Var4, "source4 is null");
        return y0(l.N2(q0Var, q0Var2, q0Var3, q0Var4));
    }

    private static <T> k0<T> w1(l<T> lVar) {
        return i.a.c1.a.S(new r3(lVar, null));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> x0(Iterable<? extends q0<? extends T>> iterable) {
        return y0(l.T2(iterable));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> k0<T> x1(q0<T> q0Var) {
        i.a.y0.b.b.g(q0Var, "onSubscribe is null");
        if (!(q0Var instanceof k0)) {
            return i.a.c1.a.S(new i.a.y0.e.g.f0(q0Var));
        }
        throw new IllegalArgumentException("unsafeCreate(Single) should be upgraded");
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> y0(Publisher<? extends q0<? extends T>> publisher) {
        i.a.y0.b.b.g(publisher, "sources is null");
        return i.a.c1.a.P(new d1(publisher, i.a.y0.e.g.h0.c(), false, Integer.MAX_VALUE, l.U()));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> k0<T> z0(q0<? extends q0<? extends T>> q0Var) {
        i.a.y0.b.b.g(q0Var, "source is null");
        return i.a.c1.a.S(new i.a.y0.e.g.x(q0Var, i.a.y0.b.a.k()));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public static <T, U> k0<T> z1(Callable<U> callable, i.a.x0.o<? super U, ? extends q0<? extends T>> oVar, i.a.x0.g<? super U> gVar) {
        return A1(callable, oVar, gVar, true);
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    public final k0<T> C(long j2, TimeUnit timeUnit) {
        return E(j2, timeUnit, i.a.f1.b.a(), false);
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    public final k0<T> D(long j2, TimeUnit timeUnit, j0 j0Var) {
        return E(j2, timeUnit, j0Var, false);
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.f
    public final k0<T> E(long j2, TimeUnit timeUnit, j0 j0Var, boolean z) {
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.S(new i.a.y0.e.g.f(this, j2, timeUnit, j0Var, z));
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    public final k0<T> F(long j2, TimeUnit timeUnit, boolean z) {
        return E(j2, timeUnit, i.a.f1.b.a(), z);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> F0(q0<? extends T> q0Var) {
        return u0(this, q0Var);
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    public final k0<T> G(long j2, TimeUnit timeUnit) {
        return H(j2, timeUnit, i.a.f1.b.a());
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    public final k0<T> H(long j2, TimeUnit timeUnit, j0 j0Var) {
        return J(b0.timer(j2, timeUnit, j0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.f
    public final k0<T> H0(j0 j0Var) {
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.S(new i.a.y0.e.g.n0(this, j0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final k0<T> I(i iVar) {
        i.a.y0.b.b.g(iVar, "other is null");
        return i.a.c1.a.S(new i.a.y0.e.g.g(this, iVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final k0<T> I0(k0<? extends T> k0Var) {
        i.a.y0.b.b.g(k0Var, "resumeSingleInCaseOfError is null");
        return J0(i.a.y0.b.a.n(k0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <U> k0<T> J(g0<U> g0Var) {
        i.a.y0.b.b.g(g0Var, "other is null");
        return i.a.c1.a.S(new i.a.y0.e.g.h(this, g0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final k0<T> J0(i.a.x0.o<? super Throwable, ? extends q0<? extends T>> oVar) {
        i.a.y0.b.b.g(oVar, "resumeFunctionInCaseOfError is null");
        return i.a.c1.a.S(new i.a.y0.e.g.p0(this, oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <U> k0<T> K(q0<U> q0Var) {
        i.a.y0.b.b.g(q0Var, "other is null");
        return i.a.c1.a.S(new i.a.y0.e.g.j(this, q0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final k0<T> K0(i.a.x0.o<Throwable, ? extends T> oVar) {
        i.a.y0.b.b.g(oVar, "resumeFunction is null");
        return i.a.c1.a.S(new i.a.y0.e.g.o0(this, oVar, null));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <U> k0<T> L(Publisher<U> publisher) {
        i.a.y0.b.b.g(publisher, "other is null");
        return i.a.c1.a.S(new i.a.y0.e.g.i(this, publisher));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final k0<T> L0(T t) {
        i.a.y0.b.b.g(t, "value is null");
        return i.a.c1.a.S(new i.a.y0.e.g.o0(this, null, t));
    }

    @i.a.t0.h("none")
    @i.a.t0.d
    @i.a.t0.e
    @i.a.t0.f
    public final <R> s<R> M(i.a.x0.o<? super T, a0<R>> oVar) {
        i.a.y0.b.b.g(oVar, "selector is null");
        return i.a.c1.a.Q(new i.a.y0.e.g.k(this, oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final k0<T> M0() {
        return i.a.c1.a.S(new i.a.y0.e.g.l(this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final <U, R> k0<R> M1(q0<U> q0Var, i.a.x0.c<? super T, ? super U, ? extends R> cVar) {
        return J1(this, q0Var, cVar);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final k0<T> N(i.a.x0.g<? super T> gVar) {
        i.a.y0.b.b.g(gVar, "doAfterSuccess is null");
        return i.a.c1.a.S(new i.a.y0.e.g.m(this, gVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> N0() {
        return s1().P4();
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final k0<T> O(i.a.x0.a aVar) {
        i.a.y0.b.b.g(aVar, "onAfterTerminate is null");
        return i.a.c1.a.S(new i.a.y0.e.g.n(this, aVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> O0(long j2) {
        return s1().Q4(j2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final k0<T> P(i.a.x0.a aVar) {
        i.a.y0.b.b.g(aVar, "onFinally is null");
        return i.a.c1.a.S(new i.a.y0.e.g.o(this, aVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> P0(i.a.x0.e eVar) {
        return s1().R4(eVar);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final k0<T> Q(i.a.x0.a aVar) {
        i.a.y0.b.b.g(aVar, "onDispose is null");
        return i.a.c1.a.S(new i.a.y0.e.g.p(this, aVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> Q0(i.a.x0.o<? super l<Object>, ? extends Publisher<?>> oVar) {
        return s1().S4(oVar);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final k0<T> R(i.a.x0.g<? super Throwable> gVar) {
        i.a.y0.b.b.g(gVar, "onError is null");
        return i.a.c1.a.S(new i.a.y0.e.g.q(this, gVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final k0<T> R0() {
        return w1(s1().j5());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final k0<T> S(i.a.x0.b<? super T, ? super Throwable> bVar) {
        i.a.y0.b.b.g(bVar, "onEvent is null");
        return i.a.c1.a.S(new i.a.y0.e.g.r(this, bVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final k0<T> S0(long j2) {
        return w1(s1().k5(j2));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final k0<T> T(i.a.x0.g<? super i.a.u0.c> gVar) {
        i.a.y0.b.b.g(gVar, "onSubscribe is null");
        return i.a.c1.a.S(new i.a.y0.e.g.s(this, gVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final k0<T> T0(long j2, i.a.x0.r<? super Throwable> rVar) {
        return w1(s1().l5(j2, rVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final k0<T> U(i.a.x0.g<? super T> gVar) {
        i.a.y0.b.b.g(gVar, "onSuccess is null");
        return i.a.c1.a.S(new i.a.y0.e.g.t(this, gVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final k0<T> U0(i.a.x0.d<? super Integer, ? super Throwable> dVar) {
        return w1(s1().m5(dVar));
    }

    @i.a.t0.h("none")
    @i.a.t0.d
    @i.a.t0.e
    @i.a.t0.f
    public final k0<T> V(i.a.x0.a aVar) {
        i.a.y0.b.b.g(aVar, "onTerminate is null");
        return i.a.c1.a.S(new i.a.y0.e.g.u(this, aVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final k0<T> V0(i.a.x0.r<? super Throwable> rVar) {
        return w1(s1().n5(rVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final k0<T> W0(i.a.x0.o<? super l<Throwable>, ? extends Publisher<?>> oVar) {
        return w1(s1().p5(oVar));
    }

    @i.a.t0.h("none")
    public final i.a.u0.c X0() {
        return a1(i.a.y0.b.a.h(), i.a.y0.b.a.f28142f);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final i.a.u0.c Y0(i.a.x0.b<? super T, ? super Throwable> bVar) {
        i.a.y0.b.b.g(bVar, "onCallback is null");
        i.a.y0.d.d dVar = new i.a.y0.d.d(bVar);
        d(dVar);
        return dVar;
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final s<T> Z(i.a.x0.r<? super T> rVar) {
        i.a.y0.b.b.g(rVar, "predicate is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.z(this, rVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final i.a.u0.c Z0(i.a.x0.g<? super T> gVar) {
        return a1(gVar, i.a.y0.b.a.f28142f);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <R> k0<R> a0(i.a.x0.o<? super T, ? extends q0<? extends R>> oVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        return i.a.c1.a.S(new i.a.y0.e.g.x(this, oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final i.a.u0.c a1(i.a.x0.g<? super T> gVar, i.a.x0.g<? super Throwable> gVar2) {
        i.a.y0.b.b.g(gVar, "onSuccess is null");
        i.a.y0.b.b.g(gVar2, "onError is null");
        i.a.y0.d.k kVar = new i.a.y0.d.k(gVar, gVar2);
        d(kVar);
        return kVar;
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final c b0(i.a.x0.o<? super T, ? extends i> oVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        return i.a.c1.a.O(new i.a.y0.e.g.y(this, oVar));
    }

    public abstract void b1(@i.a.t0.f n0<? super T> n0Var);

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <R> s<R> c0(i.a.x0.o<? super T, ? extends y<? extends R>> oVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        return i.a.c1.a.Q(new i.a.y0.e.g.b0(this, oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.f
    public final k0<T> c1(j0 j0Var) {
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.S(new i.a.y0.e.g.q0(this, j0Var));
    }

    @Override // i.a.q0
    @i.a.t0.h("none")
    public final void d(n0<? super T> n0Var) {
        i.a.y0.b.b.g(n0Var, "subscriber is null");
        n0<? super T> g0 = i.a.c1.a.g0(this, n0Var);
        i.a.y0.b.b.g(g0, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            b1(g0);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            i.a.v0.b.b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <R> b0<R> d0(i.a.x0.o<? super T, ? extends g0<? extends R>> oVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        return i.a.c1.a.R(new i.a.y0.e.d.s(this, oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final <E extends n0<? super T>> E d1(E e2) {
        d(e2);
        return e2;
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> e0(i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        return i.a.c1.a.P(new i.a.y0.e.g.c0(this, oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final k0<T> e1(i iVar) {
        i.a.y0.b.b.g(iVar, "other is null");
        return g1(new i.a.y0.e.a.o0(iVar));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <U> l<U> f0(i.a.x0.o<? super T, ? extends Iterable<? extends U>> oVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        return i.a.c1.a.P(new i.a.y0.e.g.z(this, oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <E> k0<T> f1(q0<? extends E> q0Var) {
        i.a.y0.b.b.g(q0Var, "other is null");
        return g1(new u0(q0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final k0<T> g(q0<? extends T> q0Var) {
        i.a.y0.b.b.g(q0Var, "other is null");
        return f(this, q0Var);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <U> b0<U> g0(i.a.x0.o<? super T, ? extends Iterable<? extends U>> oVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        return i.a.c1.a.R(new i.a.y0.e.g.a0(this, oVar));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <E> k0<T> g1(Publisher<E> publisher) {
        i.a.y0.b.b.g(publisher, "other is null");
        return i.a.c1.a.S(new i.a.y0.e.g.r0(this, publisher));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final <R> R h(@i.a.t0.f l0<T, ? extends R> l0Var) {
        return (R) ((l0) i.a.y0.b.b.g(l0Var, "converter is null")).a(this);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final i.a.a1.n<T> h1() {
        i.a.a1.n<T> nVar = new i.a.a1.n<>();
        d(nVar);
        return nVar;
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final T i() {
        i.a.y0.d.h hVar = new i.a.y0.d.h();
        d(hVar);
        return (T) hVar.b();
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final i.a.a1.n<T> i1(boolean z) {
        i.a.a1.n<T> nVar = new i.a.a1.n<>();
        if (z) {
            nVar.cancel();
        }
        d(nVar);
        return nVar;
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final k0<T> j() {
        return i.a.c1.a.S(new i.a.y0.e.g.b(this));
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    public final k0<T> j1(long j2, TimeUnit timeUnit) {
        return n1(j2, timeUnit, i.a.f1.b.a(), null);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <U> k0<U> k(Class<? extends U> cls) {
        i.a.y0.b.b.g(cls, "clazz is null");
        return (k0<U>) s0(i.a.y0.b.a.e(cls));
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    public final k0<T> k1(long j2, TimeUnit timeUnit, j0 j0Var) {
        return n1(j2, timeUnit, j0Var, null);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final <R> k0<R> l(r0<? super T, ? extends R> r0Var) {
        return B1(((r0) i.a.y0.b.b.g(r0Var, "transformer is null")).a(this));
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.f
    public final k0<T> l1(long j2, TimeUnit timeUnit, j0 j0Var, q0<? extends T> q0Var) {
        i.a.y0.b.b.g(q0Var, "other is null");
        return n1(j2, timeUnit, j0Var, q0Var);
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.f
    public final k0<T> m1(long j2, TimeUnit timeUnit, q0<? extends T> q0Var) {
        i.a.y0.b.b.g(q0Var, "other is null");
        return n1(j2, timeUnit, i.a.f1.b.a(), q0Var);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final k0<T> o0() {
        return i.a.c1.a.S(new i.a.y0.e.g.g0(this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final c p0() {
        return i.a.c1.a.O(new i.a.y0.e.a.v(this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final <R> R q1(i.a.x0.o<? super k0<T>, R> oVar) {
        try {
            return (R) ((i.a.x0.o) i.a.y0.b.b.g(oVar, "convert is null")).apply(this);
        } catch (Throwable th) {
            i.a.v0.b.b(th);
            throw i.a.y0.j.k.f(th);
        }
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <R> k0<R> r0(p0<? extends R, ? super T> p0Var) {
        i.a.y0.b.b.g(p0Var, "onLift is null");
        return i.a.c1.a.S(new i.a.y0.e.g.j0(this, p0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @Deprecated
    public final c r1() {
        return i.a.c1.a.O(new i.a.y0.e.a.v(this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <R> k0<R> s0(i.a.x0.o<? super T, ? extends R> oVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        return i.a.c1.a.S(new i.a.y0.e.g.k0(this, oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> s1() {
        if (this instanceof i.a.y0.c.b) {
            return ((i.a.y0.c.b) this).c();
        }
        return i.a.c1.a.P(new u0(this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.e
    public final k0<a0<T>> t0() {
        return i.a.c1.a.S(new i.a.y0.e.g.l0(this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final Future<T> t1() {
        return (Future) d1(new i.a.y0.d.r());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final s<T> u1() {
        if (this instanceof i.a.y0.c.c) {
            return ((i.a.y0.c.c) this).b();
        }
        return i.a.c1.a.Q(new i.a.y0.e.c.n0(this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final b0<T> v1() {
        if (this instanceof i.a.y0.c.d) {
            return ((i.a.y0.c.d) this).a();
        }
        return i.a.c1.a.R(new v0(this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> x(q0<? extends T> q0Var) {
        return m(this, q0Var);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final k0<Boolean> y(Object obj) {
        return z(obj, i.a.y0.b.b.d());
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.f
    public final k0<T> y1(j0 j0Var) {
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.S(new w0(this, j0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final k0<Boolean> z(Object obj, i.a.x0.d<Object, Object> dVar) {
        i.a.y0.b.b.g(obj, "value is null");
        i.a.y0.b.b.g(dVar, "comparer is null");
        return i.a.c1.a.S(new i.a.y0.e.g.c(this, obj, dVar));
    }
}
