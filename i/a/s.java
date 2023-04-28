package i.a;

import i.a.y0.e.b.d1;
import i.a.y0.e.c.a1;
import i.a.y0.e.c.b1;
import i.a.y0.e.c.c1;
import i.a.y0.e.c.e1;
import i.a.y0.e.c.f1;
import i.a.y0.e.c.g1;
import i.a.y0.e.c.h1;
import i.a.y0.e.c.i1;
import i.a.y0.e.c.j1;
import i.a.y0.e.c.k1;
import i.a.y0.e.c.l1;
import i.a.y0.e.c.m1;
import i.a.y0.e.c.n1;
import i.a.y0.e.c.o1;
import i.a.y0.e.c.p1;
import i.a.y0.e.c.q1;
import i.a.y0.e.c.r1;
import i.a.y0.e.c.s0;
import i.a.y0.e.c.s1;
import i.a.y0.e.c.t0;
import i.a.y0.e.c.t1;
import i.a.y0.e.c.u0;
import i.a.y0.e.c.u1;
import i.a.y0.e.c.v0;
import i.a.y0.e.c.w0;
import i.a.y0.e.c.x0;
import i.a.y0.e.c.y0;
import i.a.y0.e.c.z0;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Publisher;

/* compiled from: Maybe.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class s<T> implements y<T> {
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> A0(y<? extends T> yVar, y<? extends T> yVar2, y<? extends T> yVar3, y<? extends T> yVar4) {
        i.a.y0.b.b.g(yVar, "source1 is null");
        i.a.y0.b.b.g(yVar2, "source2 is null");
        i.a.y0.b.b.g(yVar3, "source3 is null");
        i.a.y0.b.b.g(yVar4, "source4 is null");
        return F0(yVar, yVar2, yVar3, yVar4);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> B0(Iterable<? extends y<? extends T>> iterable) {
        return C0(l.T2(iterable));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> C0(Publisher<? extends y<? extends T>> publisher) {
        return D0(publisher, Integer.MAX_VALUE);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> s<T> D(w<T> wVar) {
        i.a.y0.b.b.g(wVar, "onSubscribe is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.j(wVar));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> D0(Publisher<? extends y<? extends T>> publisher, int i2) {
        i.a.y0.b.b.g(publisher, "source is null");
        i.a.y0.b.b.h(i2, "maxConcurrency");
        return i.a.c1.a.P(new d1(publisher, o1.instance(), false, i2, 1));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> s<T> E0(y<? extends y<? extends T>> yVar) {
        i.a.y0.b.b.g(yVar, "source is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.h0(yVar, i.a.y0.b.a.k()));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> s<T> F(Callable<? extends y<? extends T>> callable) {
        i.a.y0.b.b.g(callable, "maybeSupplier is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.k(callable));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> F0(y<? extends T>... yVarArr) {
        i.a.y0.b.b.g(yVarArr, "sources is null");
        if (yVarArr.length == 0) {
            return l.g2();
        }
        if (yVarArr.length == 1) {
            return i.a.c1.a.P(new m1(yVarArr[0]));
        }
        return i.a.c1.a.P(new x0(yVarArr));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> G0(y<? extends T>... yVarArr) {
        if (yVarArr.length == 0) {
            return l.g2();
        }
        return l.N2(yVarArr).x2(o1.instance(), true, yVarArr.length);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> H0(y<? extends T> yVar, y<? extends T> yVar2) {
        i.a.y0.b.b.g(yVar, "source1 is null");
        i.a.y0.b.b.g(yVar2, "source2 is null");
        return G0(yVar, yVar2);
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    public static s<Long> H1(long j2, TimeUnit timeUnit) {
        return I1(j2, timeUnit, i.a.f1.b.a());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> I0(y<? extends T> yVar, y<? extends T> yVar2, y<? extends T> yVar3) {
        i.a.y0.b.b.g(yVar, "source1 is null");
        i.a.y0.b.b.g(yVar2, "source2 is null");
        i.a.y0.b.b.g(yVar3, "source3 is null");
        return G0(yVar, yVar2, yVar3);
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.f
    public static s<Long> I1(long j2, TimeUnit timeUnit, j0 j0Var) {
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.Q(new l1(Math.max(0L, j2), timeUnit, j0Var));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> J0(y<? extends T> yVar, y<? extends T> yVar2, y<? extends T> yVar3, y<? extends T> yVar4) {
        i.a.y0.b.b.g(yVar, "source1 is null");
        i.a.y0.b.b.g(yVar2, "source2 is null");
        i.a.y0.b.b.g(yVar3, "source3 is null");
        i.a.y0.b.b.g(yVar4, "source4 is null");
        return G0(yVar, yVar2, yVar3, yVar4);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> K0(Iterable<? extends y<? extends T>> iterable) {
        return l.T2(iterable).w2(o1.instance(), true);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> L0(Publisher<? extends y<? extends T>> publisher) {
        return M0(publisher, Integer.MAX_VALUE);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> M0(Publisher<? extends y<? extends T>> publisher, int i2) {
        i.a.y0.b.b.g(publisher, "source is null");
        i.a.y0.b.b.h(i2, "maxConcurrency");
        return i.a.c1.a.P(new d1(publisher, o1.instance(), true, i2, 1));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public static <T> s<T> O0() {
        return i.a.c1.a.Q(y0.b);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> s<T> O1(y<T> yVar) {
        if (!(yVar instanceof s)) {
            i.a.y0.b.b.g(yVar, "onSubscribe is null");
            return i.a.c1.a.Q(new q1(yVar));
        }
        throw new IllegalArgumentException("unsafeCreate(Maybe) should be upgraded");
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public static <T, D> s<T> Q1(Callable<? extends D> callable, i.a.x0.o<? super D, ? extends y<? extends T>> oVar, i.a.x0.g<? super D> gVar) {
        return R1(callable, oVar, gVar, true);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T, D> s<T> R1(Callable<? extends D> callable, i.a.x0.o<? super D, ? extends y<? extends T>> oVar, i.a.x0.g<? super D> gVar, boolean z) {
        i.a.y0.b.b.g(callable, "resourceSupplier is null");
        i.a.y0.b.b.g(oVar, "sourceSupplier is null");
        i.a.y0.b.b.g(gVar, "disposer is null");
        return i.a.c1.a.Q(new s1(callable, oVar, gVar, z));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> s<T> S1(y<T> yVar) {
        if (yVar instanceof s) {
            return i.a.c1.a.Q((s) yVar);
        }
        i.a.y0.b.b.g(yVar, "onSubscribe is null");
        return i.a.c1.a.Q(new q1(yVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> s<R> T1(y<? extends T1> yVar, y<? extends T2> yVar2, y<? extends T3> yVar3, y<? extends T4> yVar4, y<? extends T5> yVar5, y<? extends T6> yVar6, y<? extends T7> yVar7, y<? extends T8> yVar8, y<? extends T9> yVar9, i.a.x0.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        i.a.y0.b.b.g(yVar, "source1 is null");
        i.a.y0.b.b.g(yVar2, "source2 is null");
        i.a.y0.b.b.g(yVar3, "source3 is null");
        i.a.y0.b.b.g(yVar4, "source4 is null");
        i.a.y0.b.b.g(yVar5, "source5 is null");
        i.a.y0.b.b.g(yVar6, "source6 is null");
        i.a.y0.b.b.g(yVar7, "source7 is null");
        i.a.y0.b.b.g(yVar8, "source8 is null");
        i.a.y0.b.b.g(yVar9, "source9 is null");
        return c2(i.a.y0.b.a.E(nVar), yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7, yVar8, yVar9);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> s<R> U1(y<? extends T1> yVar, y<? extends T2> yVar2, y<? extends T3> yVar3, y<? extends T4> yVar4, y<? extends T5> yVar5, y<? extends T6> yVar6, y<? extends T7> yVar7, y<? extends T8> yVar8, i.a.x0.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        i.a.y0.b.b.g(yVar, "source1 is null");
        i.a.y0.b.b.g(yVar2, "source2 is null");
        i.a.y0.b.b.g(yVar3, "source3 is null");
        i.a.y0.b.b.g(yVar4, "source4 is null");
        i.a.y0.b.b.g(yVar5, "source5 is null");
        i.a.y0.b.b.g(yVar6, "source6 is null");
        i.a.y0.b.b.g(yVar7, "source7 is null");
        i.a.y0.b.b.g(yVar8, "source8 is null");
        return c2(i.a.y0.b.a.D(mVar), yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7, yVar8);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T1, T2, T3, T4, T5, T6, T7, R> s<R> V1(y<? extends T1> yVar, y<? extends T2> yVar2, y<? extends T3> yVar3, y<? extends T4> yVar4, y<? extends T5> yVar5, y<? extends T6> yVar6, y<? extends T7> yVar7, i.a.x0.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        i.a.y0.b.b.g(yVar, "source1 is null");
        i.a.y0.b.b.g(yVar2, "source2 is null");
        i.a.y0.b.b.g(yVar3, "source3 is null");
        i.a.y0.b.b.g(yVar4, "source4 is null");
        i.a.y0.b.b.g(yVar5, "source5 is null");
        i.a.y0.b.b.g(yVar6, "source6 is null");
        i.a.y0.b.b.g(yVar7, "source7 is null");
        return c2(i.a.y0.b.a.C(lVar), yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public static <T> s<T> W() {
        return i.a.c1.a.Q(i.a.y0.e.c.u.b);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T1, T2, T3, T4, T5, T6, R> s<R> W1(y<? extends T1> yVar, y<? extends T2> yVar2, y<? extends T3> yVar3, y<? extends T4> yVar4, y<? extends T5> yVar5, y<? extends T6> yVar6, i.a.x0.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        i.a.y0.b.b.g(yVar, "source1 is null");
        i.a.y0.b.b.g(yVar2, "source2 is null");
        i.a.y0.b.b.g(yVar3, "source3 is null");
        i.a.y0.b.b.g(yVar4, "source4 is null");
        i.a.y0.b.b.g(yVar5, "source5 is null");
        i.a.y0.b.b.g(yVar6, "source6 is null");
        return c2(i.a.y0.b.a.B(kVar), yVar, yVar2, yVar3, yVar4, yVar5, yVar6);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> s<T> X(Throwable th) {
        i.a.y0.b.b.g(th, "exception is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.w(th));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T1, T2, T3, T4, T5, R> s<R> X1(y<? extends T1> yVar, y<? extends T2> yVar2, y<? extends T3> yVar3, y<? extends T4> yVar4, y<? extends T5> yVar5, i.a.x0.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        i.a.y0.b.b.g(yVar, "source1 is null");
        i.a.y0.b.b.g(yVar2, "source2 is null");
        i.a.y0.b.b.g(yVar3, "source3 is null");
        i.a.y0.b.b.g(yVar4, "source4 is null");
        i.a.y0.b.b.g(yVar5, "source5 is null");
        return c2(i.a.y0.b.a.A(jVar), yVar, yVar2, yVar3, yVar4, yVar5);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> s<T> Y(Callable<? extends Throwable> callable) {
        i.a.y0.b.b.g(callable, "errorSupplier is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.x(callable));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T1, T2, T3, T4, R> s<R> Y1(y<? extends T1> yVar, y<? extends T2> yVar2, y<? extends T3> yVar3, y<? extends T4> yVar4, i.a.x0.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        i.a.y0.b.b.g(yVar, "source1 is null");
        i.a.y0.b.b.g(yVar2, "source2 is null");
        i.a.y0.b.b.g(yVar3, "source3 is null");
        i.a.y0.b.b.g(yVar4, "source4 is null");
        return c2(i.a.y0.b.a.z(iVar), yVar, yVar2, yVar3, yVar4);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T1, T2, T3, R> s<R> Z1(y<? extends T1> yVar, y<? extends T2> yVar2, y<? extends T3> yVar3, i.a.x0.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        i.a.y0.b.b.g(yVar, "source1 is null");
        i.a.y0.b.b.g(yVar2, "source2 is null");
        i.a.y0.b.b.g(yVar3, "source3 is null");
        return c2(i.a.y0.b.a.y(hVar), yVar, yVar2, yVar3);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T1, T2, R> s<R> a2(y<? extends T1> yVar, y<? extends T2> yVar2, i.a.x0.c<? super T1, ? super T2, ? extends R> cVar) {
        i.a.y0.b.b.g(yVar, "source1 is null");
        i.a.y0.b.b.g(yVar2, "source2 is null");
        return c2(i.a.y0.b.a.x(cVar), yVar, yVar2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T, R> s<R> b2(Iterable<? extends y<? extends T>> iterable, i.a.x0.o<? super Object[], ? extends R> oVar) {
        i.a.y0.b.b.g(oVar, "zipper is null");
        i.a.y0.b.b.g(iterable, "sources is null");
        return i.a.c1.a.Q(new u1(iterable, oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T, R> s<R> c2(i.a.x0.o<? super Object[], ? extends R> oVar, y<? extends T>... yVarArr) {
        i.a.y0.b.b.g(yVarArr, "sources is null");
        if (yVarArr.length == 0) {
            return W();
        }
        i.a.y0.b.b.g(oVar, "zipper is null");
        return i.a.c1.a.Q(new t1(yVarArr, oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> s<T> d(Iterable<? extends y<? extends T>> iterable) {
        i.a.y0.b.b.g(iterable, "sources is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.b(null, iterable));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public static <T> s<T> e(y<? extends T>... yVarArr) {
        if (yVarArr.length == 0) {
            return W();
        }
        if (yVarArr.length == 1) {
            return S1(yVarArr[0]);
        }
        return i.a.c1.a.Q(new i.a.y0.e.c.b(yVarArr, null));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> s<T> k0(i.a.x0.a aVar) {
        i.a.y0.b.b.g(aVar, "run is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.i0(aVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public static <T> k0<Boolean> k1(y<? extends T> yVar, y<? extends T> yVar2) {
        return l1(yVar, yVar2, i.a.y0.b.b.d());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> s<T> l0(@i.a.t0.f Callable<? extends T> callable) {
        i.a.y0.b.b.g(callable, "callable is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.j0(callable));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> k0<Boolean> l1(y<? extends T> yVar, y<? extends T> yVar2, i.a.x0.d<? super T, ? super T> dVar) {
        i.a.y0.b.b.g(yVar, "source1 is null");
        i.a.y0.b.b.g(yVar2, "source2 is null");
        i.a.y0.b.b.g(dVar, "isEqual is null");
        return i.a.c1.a.S(new i.a.y0.e.c.v(yVar, yVar2, dVar));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> m(y<? extends T> yVar, y<? extends T> yVar2) {
        i.a.y0.b.b.g(yVar, "source1 is null");
        i.a.y0.b.b.g(yVar2, "source2 is null");
        return s(yVar, yVar2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> s<T> m0(i iVar) {
        i.a.y0.b.b.g(iVar, "completableSource is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.k0(iVar));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> n(y<? extends T> yVar, y<? extends T> yVar2, y<? extends T> yVar3) {
        i.a.y0.b.b.g(yVar, "source1 is null");
        i.a.y0.b.b.g(yVar2, "source2 is null");
        i.a.y0.b.b.g(yVar3, "source3 is null");
        return s(yVar, yVar2, yVar3);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> s<T> n0(Future<? extends T> future) {
        i.a.y0.b.b.g(future, "future is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.l0(future, 0L, null));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> o(y<? extends T> yVar, y<? extends T> yVar2, y<? extends T> yVar3, y<? extends T> yVar4) {
        i.a.y0.b.b.g(yVar, "source1 is null");
        i.a.y0.b.b.g(yVar2, "source2 is null");
        i.a.y0.b.b.g(yVar3, "source3 is null");
        i.a.y0.b.b.g(yVar4, "source4 is null");
        return s(yVar, yVar2, yVar3, yVar4);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> s<T> o0(Future<? extends T> future, long j2, TimeUnit timeUnit) {
        i.a.y0.b.b.g(future, "future is null");
        i.a.y0.b.b.g(timeUnit, "unit is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.l0(future, j2, timeUnit));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> p(Iterable<? extends y<? extends T>> iterable) {
        i.a.y0.b.b.g(iterable, "sources is null");
        return i.a.c1.a.P(new i.a.y0.e.c.g(iterable));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> s<T> p0(Runnable runnable) {
        i.a.y0.b.b.g(runnable, "run is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.m0(runnable));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> q(Publisher<? extends y<? extends T>> publisher) {
        return r(publisher, 2);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> s<T> q0(q0<T> q0Var) {
        i.a.y0.b.b.g(q0Var, "singleSource is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.n0(q0Var));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> r(Publisher<? extends y<? extends T>> publisher, int i2) {
        i.a.y0.b.b.g(publisher, "sources is null");
        i.a.y0.b.b.h(i2, "prefetch");
        return i.a.c1.a.P(new i.a.y0.e.b.z(publisher, o1.instance(), i2, i.a.y0.j.j.IMMEDIATE));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> s(y<? extends T>... yVarArr) {
        i.a.y0.b.b.g(yVarArr, "sources is null");
        if (yVarArr.length == 0) {
            return l.g2();
        }
        if (yVarArr.length == 1) {
            return i.a.c1.a.P(new m1(yVarArr[0]));
        }
        return i.a.c1.a.P(new i.a.y0.e.c.e(yVarArr));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> t(y<? extends T>... yVarArr) {
        if (yVarArr.length == 0) {
            return l.g2();
        }
        if (yVarArr.length == 1) {
            return i.a.c1.a.P(new m1(yVarArr[0]));
        }
        return i.a.c1.a.P(new i.a.y0.e.c.f(yVarArr));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> u(y<? extends T>... yVarArr) {
        return l.N2(yVarArr).W0(o1.instance());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public static <T> s<T> u0(T t) {
        i.a.y0.b.b.g(t, "item is null");
        return i.a.c1.a.Q(new t0(t));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> v(Iterable<? extends y<? extends T>> iterable) {
        i.a.y0.b.b.g(iterable, "sources is null");
        return l.T2(iterable).U0(o1.instance());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> w(Publisher<? extends y<? extends T>> publisher) {
        return l.U2(publisher).U0(o1.instance());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> x(Iterable<? extends y<? extends T>> iterable) {
        return l.T2(iterable).W0(o1.instance());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public static <T> l<T> y(Publisher<? extends y<? extends T>> publisher) {
        return l.U2(publisher).W0(o1.instance());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> y0(y<? extends T> yVar, y<? extends T> yVar2) {
        i.a.y0.b.b.g(yVar, "source1 is null");
        i.a.y0.b.b.g(yVar2, "source2 is null");
        return F0(yVar, yVar2);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public static <T> l<T> z0(y<? extends T> yVar, y<? extends T> yVar2, y<? extends T> yVar3) {
        i.a.y0.b.b.g(yVar, "source1 is null");
        i.a.y0.b.b.g(yVar2, "source2 is null");
        i.a.y0.b.b.g(yVar3, "source3 is null");
        return F0(yVar, yVar2, yVar3);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> A(y<? extends T> yVar) {
        i.a.y0.b.b.g(yVar, "other is null");
        return m(this, yVar);
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    @i.a.t0.f
    public final s<T> A1(long j2, TimeUnit timeUnit, y<? extends T> yVar) {
        i.a.y0.b.b.g(yVar, "other is null");
        return C1(j2, timeUnit, i.a.f1.b.a(), yVar);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final k0<Boolean> B(Object obj) {
        i.a.y0.b.b.g(obj, "item is null");
        return i.a.c1.a.S(new i.a.y0.e.c.h(this, obj));
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    public final s<T> B1(long j2, TimeUnit timeUnit, j0 j0Var) {
        return D1(I1(j2, timeUnit, j0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final k0<Long> C() {
        return i.a.c1.a.S(new i.a.y0.e.c.i(this));
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.f
    public final s<T> C1(long j2, TimeUnit timeUnit, j0 j0Var, y<? extends T> yVar) {
        i.a.y0.b.b.g(yVar, "fallback is null");
        return E1(I1(j2, timeUnit, j0Var), yVar);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <U> s<T> D1(y<U> yVar) {
        i.a.y0.b.b.g(yVar, "timeoutIndicator is null");
        return i.a.c1.a.Q(new j1(this, yVar, null));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final s<T> E(T t) {
        i.a.y0.b.b.g(t, "item is null");
        return t1(u0(t));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <U> s<T> E1(y<U> yVar, y<? extends T> yVar2) {
        i.a.y0.b.b.g(yVar, "timeoutIndicator is null");
        i.a.y0.b.b.g(yVar2, "fallback is null");
        return i.a.c1.a.Q(new j1(this, yVar, yVar2));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final <U> s<T> F1(Publisher<U> publisher) {
        i.a.y0.b.b.g(publisher, "timeoutIndicator is null");
        return i.a.c1.a.Q(new k1(this, publisher, null));
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    public final s<T> G(long j2, TimeUnit timeUnit) {
        return H(j2, timeUnit, i.a.f1.b.a());
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final <U> s<T> G1(Publisher<U> publisher, y<? extends T> yVar) {
        i.a.y0.b.b.g(publisher, "timeoutIndicator is null");
        i.a.y0.b.b.g(yVar, "fallback is null");
        return i.a.c1.a.Q(new k1(this, publisher, yVar));
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.f
    public final s<T> H(long j2, TimeUnit timeUnit, j0 j0Var) {
        i.a.y0.b.b.g(timeUnit, "unit is null");
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.l(this, Math.max(0L, j2), timeUnit, j0Var));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final <U, V> s<T> I(Publisher<U> publisher) {
        i.a.y0.b.b.g(publisher, "delayIndicator is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.m(this, publisher));
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    public final s<T> J(long j2, TimeUnit timeUnit) {
        return K(j2, timeUnit, i.a.f1.b.a());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <R> R J1(i.a.x0.o<? super s<T>, R> oVar) {
        try {
            return (R) ((i.a.x0.o) i.a.y0.b.b.g(oVar, "convert is null")).apply(this);
        } catch (Throwable th) {
            i.a.v0.b.b(th);
            throw i.a.y0.j.k.f(th);
        }
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    public final s<T> K(long j2, TimeUnit timeUnit, j0 j0Var) {
        return L(l.r7(j2, timeUnit, j0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> K1() {
        if (this instanceof i.a.y0.c.b) {
            return ((i.a.y0.c.b) this).c();
        }
        return i.a.c1.a.P(new m1(this));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final <U> s<T> L(Publisher<U> publisher) {
        i.a.y0.b.b.g(publisher, "subscriptionIndicator is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.n(this, publisher));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final b0<T> L1() {
        if (this instanceof i.a.y0.c.d) {
            return ((i.a.y0.c.d) this).a();
        }
        return i.a.c1.a.R(new n1(this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final s<T> M(i.a.x0.g<? super T> gVar) {
        i.a.y0.b.b.g(gVar, "doAfterSuccess is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.q(this, gVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final k0<T> M1() {
        return i.a.c1.a.S(new p1(this, null));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final s<T> N(i.a.x0.a aVar) {
        i.a.x0.g h2 = i.a.y0.b.a.h();
        i.a.x0.g h3 = i.a.y0.b.a.h();
        i.a.x0.g h4 = i.a.y0.b.a.h();
        i.a.x0.a aVar2 = i.a.y0.b.a.c;
        return i.a.c1.a.Q(new i.a.y0.e.c.d1(this, h2, h3, h4, aVar2, (i.a.x0.a) i.a.y0.b.b.g(aVar, "onAfterTerminate is null"), aVar2));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final l<T> N0(y<? extends T> yVar) {
        i.a.y0.b.b.g(yVar, "other is null");
        return y0(this, yVar);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final k0<T> N1(T t) {
        i.a.y0.b.b.g(t, "defaultValue is null");
        return i.a.c1.a.S(new p1(this, t));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final s<T> O(i.a.x0.a aVar) {
        i.a.y0.b.b.g(aVar, "onFinally is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.r(this, aVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final s<T> P(i.a.x0.a aVar) {
        i.a.x0.a aVar2 = i.a.y0.b.a.c;
        return i.a.c1.a.Q(new i.a.y0.e.c.d1(this, i.a.y0.b.a.h(), i.a.y0.b.a.h(), i.a.y0.b.a.h(), (i.a.x0.a) i.a.y0.b.b.g(aVar, "onComplete is null"), aVar2, aVar2));
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.f
    public final s<T> P0(j0 j0Var) {
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.Q(new z0(this, j0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.f
    public final s<T> P1(j0 j0Var) {
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.Q(new r1(this, j0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final s<T> Q(i.a.x0.a aVar) {
        i.a.x0.g h2 = i.a.y0.b.a.h();
        i.a.x0.g h3 = i.a.y0.b.a.h();
        i.a.x0.g h4 = i.a.y0.b.a.h();
        i.a.x0.a aVar2 = i.a.y0.b.a.c;
        return i.a.c1.a.Q(new i.a.y0.e.c.d1(this, h2, h3, h4, aVar2, aVar2, (i.a.x0.a) i.a.y0.b.b.g(aVar, "onDispose is null")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <U> s<U> Q0(Class<U> cls) {
        i.a.y0.b.b.g(cls, "clazz is null");
        return Z(i.a.y0.b.a.l(cls)).k(cls);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final s<T> R(i.a.x0.g<? super Throwable> gVar) {
        i.a.x0.a aVar = i.a.y0.b.a.c;
        return i.a.c1.a.Q(new i.a.y0.e.c.d1(this, i.a.y0.b.a.h(), i.a.y0.b.a.h(), (i.a.x0.g) i.a.y0.b.b.g(gVar, "onError is null"), aVar, aVar, aVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final s<T> R0() {
        return S0(i.a.y0.b.a.c());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final s<T> S(i.a.x0.b<? super T, ? super Throwable> bVar) {
        i.a.y0.b.b.g(bVar, "onEvent is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.s(this, bVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final s<T> S0(i.a.x0.r<? super Throwable> rVar) {
        i.a.y0.b.b.g(rVar, "predicate is null");
        return i.a.c1.a.Q(new a1(this, rVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final s<T> T(i.a.x0.g<? super i.a.u0.c> gVar) {
        i.a.x0.g h2 = i.a.y0.b.a.h();
        i.a.x0.g h3 = i.a.y0.b.a.h();
        i.a.x0.a aVar = i.a.y0.b.a.c;
        return i.a.c1.a.Q(new i.a.y0.e.c.d1(this, (i.a.x0.g) i.a.y0.b.b.g(gVar, "onSubscribe is null"), h2, h3, aVar, aVar, aVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final s<T> T0(y<? extends T> yVar) {
        i.a.y0.b.b.g(yVar, "next is null");
        return U0(i.a.y0.b.a.n(yVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final s<T> U(i.a.x0.g<? super T> gVar) {
        i.a.x0.g h2 = i.a.y0.b.a.h();
        i.a.x0.a aVar = i.a.y0.b.a.c;
        return i.a.c1.a.Q(new i.a.y0.e.c.d1(this, i.a.y0.b.a.h(), (i.a.x0.g) i.a.y0.b.b.g(gVar, "onSubscribe is null"), h2, aVar, aVar, aVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final s<T> U0(i.a.x0.o<? super Throwable, ? extends y<? extends T>> oVar) {
        i.a.y0.b.b.g(oVar, "resumeFunction is null");
        return i.a.c1.a.Q(new b1(this, oVar, true));
    }

    @i.a.t0.h("none")
    @i.a.t0.d
    @i.a.t0.e
    @i.a.t0.f
    public final s<T> V(i.a.x0.a aVar) {
        i.a.y0.b.b.g(aVar, "onTerminate is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.t(this, aVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final s<T> V0(i.a.x0.o<? super Throwable, ? extends T> oVar) {
        i.a.y0.b.b.g(oVar, "valueSupplier is null");
        return i.a.c1.a.Q(new c1(this, oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final s<T> W0(T t) {
        i.a.y0.b.b.g(t, "item is null");
        return V0(i.a.y0.b.a.n(t));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final s<T> X0(y<? extends T> yVar) {
        i.a.y0.b.b.g(yVar, "next is null");
        return i.a.c1.a.Q(new b1(this, i.a.y0.b.a.n(yVar), false));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final s<T> Y0() {
        return i.a.c1.a.Q(new i.a.y0.e.c.p(this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final s<T> Z(i.a.x0.r<? super T> rVar) {
        i.a.y0.b.b.g(rVar, "predicate is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.y(this, rVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> Z0() {
        return a1(Long.MAX_VALUE);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <R> s<R> a0(i.a.x0.o<? super T, ? extends y<? extends R>> oVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.h0(this, oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> a1(long j2) {
        return K1().Q4(j2);
    }

    @Override // i.a.y
    @i.a.t0.h("none")
    public final void b(v<? super T> vVar) {
        i.a.y0.b.b.g(vVar, "observer is null");
        v<? super T> e0 = i.a.c1.a.e0(this, vVar);
        i.a.y0.b.b.g(e0, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            q1(e0);
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
    public final <U, R> s<R> b0(i.a.x0.o<? super T, ? extends y<? extends U>> oVar, i.a.x0.c<? super T, ? super U, ? extends R> cVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        i.a.y0.b.b.g(cVar, "resultSelector is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.a0(this, oVar, cVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> b1(i.a.x0.e eVar) {
        return K1().R4(eVar);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <R> s<R> c0(i.a.x0.o<? super T, ? extends y<? extends R>> oVar, i.a.x0.o<? super Throwable, ? extends y<? extends R>> oVar2, Callable<? extends y<? extends R>> callable) {
        i.a.y0.b.b.g(oVar, "onSuccessMapper is null");
        i.a.y0.b.b.g(oVar2, "onErrorMapper is null");
        i.a.y0.b.b.g(callable, "onCompleteSupplier is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.e0(this, oVar, oVar2, callable));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    public final l<T> c1(i.a.x0.o<? super l<Object>, ? extends Publisher<?>> oVar) {
        return K1().S4(oVar);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final c d0(i.a.x0.o<? super T, ? extends i> oVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        return i.a.c1.a.O(new i.a.y0.e.c.b0(this, oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final s<T> d1() {
        return f1(Long.MAX_VALUE, i.a.y0.b.a.c());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <U, R> s<R> d2(y<? extends U> yVar, i.a.x0.c<? super T, ? super U, ? extends R> cVar) {
        i.a.y0.b.b.g(yVar, "other is null");
        return a2(this, yVar, cVar);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <R> b0<R> e0(i.a.x0.o<? super T, ? extends g0<? extends R>> oVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        return i.a.c1.a.R(new i.a.y0.e.d.j(this, oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final s<T> e1(long j2) {
        return f1(j2, i.a.y0.b.a.c());
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final s<T> f(y<? extends T> yVar) {
        i.a.y0.b.b.g(yVar, "other is null");
        return e(this, yVar);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <R> l<R> f0(i.a.x0.o<? super T, ? extends Publisher<? extends R>> oVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        return i.a.c1.a.P(new i.a.y0.e.d.k(this, oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final s<T> f1(long j2, i.a.x0.r<? super Throwable> rVar) {
        return K1().l5(j2, rVar).H5();
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final <R> R g(@i.a.t0.f t<T, ? extends R> tVar) {
        return (R) ((t) i.a.y0.b.b.g(tVar, "converter is null")).a(this);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <R> k0<R> g0(i.a.x0.o<? super T, ? extends q0<? extends R>> oVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        return i.a.c1.a.S(new i.a.y0.e.c.f0(this, oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final s<T> g1(i.a.x0.d<? super Integer, ? super Throwable> dVar) {
        return K1().m5(dVar).H5();
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final T h() {
        i.a.y0.d.h hVar = new i.a.y0.d.h();
        b(hVar);
        return (T) hVar.b();
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <R> s<R> h0(i.a.x0.o<? super T, ? extends q0<? extends R>> oVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.g0(this, oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final s<T> h1(i.a.x0.r<? super Throwable> rVar) {
        return f1(Long.MAX_VALUE, rVar);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final T i(T t) {
        i.a.y0.b.b.g(t, "defaultValue is null");
        i.a.y0.d.h hVar = new i.a.y0.d.h();
        b(hVar);
        return (T) hVar.c(t);
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.FULL)
    @i.a.t0.d
    @i.a.t0.f
    public final <U> l<U> i0(i.a.x0.o<? super T, ? extends Iterable<? extends U>> oVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        return i.a.c1.a.P(new i.a.y0.e.c.c0(this, oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final s<T> i1(i.a.x0.e eVar) {
        i.a.y0.b.b.g(eVar, "stop is null");
        return f1(Long.MAX_VALUE, i.a.y0.b.a.v(eVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final s<T> j() {
        return i.a.c1.a.Q(new i.a.y0.e.c.c(this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <U> b0<U> j0(i.a.x0.o<? super T, ? extends Iterable<? extends U>> oVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        return i.a.c1.a.R(new i.a.y0.e.c.d0(this, oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final s<T> j1(i.a.x0.o<? super l<Throwable>, ? extends Publisher<?>> oVar) {
        return K1().p5(oVar).H5();
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <U> s<U> k(Class<? extends U> cls) {
        i.a.y0.b.b.g(cls, "clazz is null");
        return (s<U>) w0(i.a.y0.b.a.e(cls));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final <R> s<R> l(z<? super T, ? extends R> zVar) {
        return S1(((z) i.a.y0.b.b.g(zVar, "transformer is null")).a(this));
    }

    @i.a.t0.h("none")
    public final i.a.u0.c m1() {
        return p1(i.a.y0.b.a.h(), i.a.y0.b.a.f28142f, i.a.y0.b.a.c);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final i.a.u0.c n1(i.a.x0.g<? super T> gVar) {
        return p1(gVar, i.a.y0.b.a.f28142f, i.a.y0.b.a.c);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final i.a.u0.c o1(i.a.x0.g<? super T> gVar, i.a.x0.g<? super Throwable> gVar2) {
        return p1(gVar, gVar2, i.a.y0.b.a.c);
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final i.a.u0.c p1(i.a.x0.g<? super T> gVar, i.a.x0.g<? super Throwable> gVar2, i.a.x0.a aVar) {
        i.a.y0.b.b.g(gVar, "onSuccess is null");
        i.a.y0.b.b.g(gVar2, "onError is null");
        i.a.y0.b.b.g(aVar, "onComplete is null");
        return (i.a.u0.c) s1(new i.a.y0.e.c.d(gVar, gVar2, aVar));
    }

    public abstract void q1(v<? super T> vVar);

    @i.a.t0.d
    @i.a.t0.h("none")
    public final s<T> r0() {
        return i.a.c1.a.Q(new i.a.y0.e.c.o0(this));
    }

    @i.a.t0.d
    @i.a.t0.h("custom")
    @i.a.t0.f
    public final s<T> r1(j0 j0Var) {
        i.a.y0.b.b.g(j0Var, "scheduler is null");
        return i.a.c1.a.Q(new e1(this, j0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final c s0() {
        return i.a.c1.a.O(new i.a.y0.e.c.q0(this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final <E extends v<? super T>> E s1(E e2) {
        b(e2);
        return e2;
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final k0<Boolean> t0() {
        return i.a.c1.a.S(new s0(this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final s<T> t1(y<? extends T> yVar) {
        i.a.y0.b.b.g(yVar, "other is null");
        return i.a.c1.a.Q(new f1(this, yVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final k0<T> u1(q0<? extends T> q0Var) {
        i.a.y0.b.b.g(q0Var, "other is null");
        return i.a.c1.a.S(new g1(this, q0Var));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <R> s<R> v0(x<? extends R, ? super T> xVar) {
        i.a.y0.b.b.g(xVar, "onLift is null");
        return i.a.c1.a.Q(new u0(this, xVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <U> s<T> v1(y<U> yVar) {
        i.a.y0.b.b.g(yVar, "other is null");
        return i.a.c1.a.Q(new h1(this, yVar));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <R> s<R> w0(i.a.x0.o<? super T, ? extends R> oVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        return i.a.c1.a.Q(new v0(this, oVar));
    }

    @i.a.t0.h("none")
    @i.a.t0.b(i.a.t0.a.UNBOUNDED_IN)
    @i.a.t0.d
    @i.a.t0.f
    public final <U> s<T> w1(Publisher<U> publisher) {
        i.a.y0.b.b.g(publisher, "other is null");
        return i.a.c1.a.Q(new i1(this, publisher));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.e
    public final k0<a0<T>> x0() {
        return i.a.c1.a.S(new w0(this));
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final i.a.a1.n<T> x1() {
        i.a.a1.n<T> nVar = new i.a.a1.n<>();
        b(nVar);
        return nVar;
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    public final i.a.a1.n<T> y1(boolean z) {
        i.a.a1.n<T> nVar = new i.a.a1.n<>();
        if (z) {
            nVar.cancel();
        }
        b(nVar);
        return nVar;
    }

    @i.a.t0.d
    @i.a.t0.h("none")
    @i.a.t0.f
    public final <R> s<R> z(i.a.x0.o<? super T, ? extends y<? extends R>> oVar) {
        i.a.y0.b.b.g(oVar, "mapper is null");
        return i.a.c1.a.Q(new i.a.y0.e.c.h0(this, oVar));
    }

    @i.a.t0.d
    @i.a.t0.h("io.reactivex:computation")
    public final s<T> z1(long j2, TimeUnit timeUnit) {
        return B1(j2, timeUnit, i.a.f1.b.a());
    }
}
