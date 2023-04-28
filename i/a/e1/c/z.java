package i.a.e1.c;

import i.a.e1.h.f.b.d1;
import i.a.e1.h.f.c.a1;
import i.a.e1.h.f.c.b1;
import i.a.e1.h.f.c.c1;
import i.a.e1.h.f.c.e1;
import i.a.e1.h.f.c.f1;
import i.a.e1.h.f.c.g1;
import i.a.e1.h.f.c.h1;
import i.a.e1.h.f.c.i1;
import i.a.e1.h.f.c.j1;
import i.a.e1.h.f.c.k1;
import i.a.e1.h.f.c.l1;
import i.a.e1.h.f.c.m1;
import i.a.e1.h.f.c.n1;
import i.a.e1.h.f.c.o1;
import i.a.e1.h.f.c.p1;
import i.a.e1.h.f.c.q1;
import i.a.e1.h.f.c.r1;
import i.a.e1.h.f.c.s1;
import i.a.e1.h.f.c.t1;
import i.a.e1.h.f.c.u1;
import i.a.e1.h.f.c.v1;
import i.a.e1.h.f.c.w1;
import i.a.e1.h.f.c.x1;
import i.a.e1.h.f.c.z0;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.reactivestreams.Publisher;

/* compiled from: Maybe.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class z<T> implements f0<T> {
    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> A(@i.a.e1.b.f Iterable<? extends f0<? extends T>> sources) {
        return s.c3(sources).h1(i.a.e1.h.b.a.k());
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> B(@i.a.e1.b.f Publisher<? extends f0<? extends T>> sources) {
        return s.g3(sources).h1(i.a.e1.h.b.a.k());
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> C(@i.a.e1.b.f Publisher<? extends f0<? extends T>> sources, int prefetch) {
        return s.g3(sources).j1(i.a.e1.h.b.a.k(), true, prefetch);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> D(@i.a.e1.b.f Iterable<? extends f0<? extends T>> sources) {
        return s.c3(sources).b1(r1.instance(), false);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> z<T> D0(@i.a.e1.b.f i.a.e1.g.a action) {
        Objects.requireNonNull(action, "action is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.j0(action));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> E(@i.a.e1.b.f Iterable<? extends f0<? extends T>> sources, int maxConcurrency) {
        return s.c3(sources).c1(r1.instance(), false, maxConcurrency, 1);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> z<T> E0(@i.a.e1.b.f Callable<? extends T> callable) {
        Objects.requireNonNull(callable, "callable is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.k0(callable));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> z<T> E2(@i.a.e1.b.f f0<T> onSubscribe) {
        if (!(onSubscribe instanceof z)) {
            Objects.requireNonNull(onSubscribe, "onSubscribe is null");
            return i.a.e1.l.a.Q(new t1(onSubscribe));
        }
        throw new IllegalArgumentException("unsafeCreate(Maybe) should be upgraded");
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> F(@i.a.e1.b.f Publisher<? extends f0<? extends T>> sources) {
        return s.g3(sources).Z0(r1.instance());
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> z<T> F0(@i.a.e1.b.f p completableSource) {
        Objects.requireNonNull(completableSource, "completableSource is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.l0(completableSource));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> G(@i.a.e1.b.f Publisher<? extends f0<? extends T>> sources, int maxConcurrency) {
        return s.g3(sources).a1(r1.instance(), maxConcurrency, 1);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> z<T> G0(@i.a.e1.b.f CompletionStage<T> stage) {
        Objects.requireNonNull(stage, "stage is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.d.o(stage));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T, D> z<T> G2(@i.a.e1.b.f i.a.e1.g.s<? extends D> resourceSupplier, @i.a.e1.b.f i.a.e1.g.o<? super D, ? extends f0<? extends T>> sourceSupplier, @i.a.e1.b.f i.a.e1.g.g<? super D> resourceCleanup) {
        return H2(resourceSupplier, sourceSupplier, resourceCleanup, true);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> H(@i.a.e1.b.f Iterable<? extends f0<? extends T>> sources) {
        return s.c3(sources).b1(r1.instance(), true);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> z<T> H0(@i.a.e1.b.f Future<? extends T> future) {
        Objects.requireNonNull(future, "future is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.m0(future, 0L, null));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T, D> z<T> H2(@i.a.e1.b.f i.a.e1.g.s<? extends D> resourceSupplier, @i.a.e1.b.f i.a.e1.g.o<? super D, ? extends f0<? extends T>> sourceSupplier, @i.a.e1.b.f i.a.e1.g.g<? super D> resourceCleanup, boolean eager) {
        Objects.requireNonNull(resourceSupplier, "resourceSupplier is null");
        Objects.requireNonNull(sourceSupplier, "sourceSupplier is null");
        Objects.requireNonNull(resourceCleanup, "resourceCleanup is null");
        return i.a.e1.l.a.Q(new v1(resourceSupplier, sourceSupplier, resourceCleanup, eager));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> I(@i.a.e1.b.f Iterable<? extends f0<? extends T>> sources, int maxConcurrency) {
        return s.c3(sources).c1(r1.instance(), true, maxConcurrency, 1);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> z<T> I0(@i.a.e1.b.f Future<? extends T> future, long timeout, @i.a.e1.b.f TimeUnit unit) {
        Objects.requireNonNull(future, "future is null");
        Objects.requireNonNull(unit, "unit is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.m0(future, timeout, unit));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> z<T> I2(@i.a.e1.b.f f0<T> source) {
        if (source instanceof z) {
            return i.a.e1.l.a.Q((z) source);
        }
        Objects.requireNonNull(source, "source is null");
        return i.a.e1.l.a.Q(new t1(source));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> J(@i.a.e1.b.f Publisher<? extends f0<? extends T>> sources) {
        return s.g3(sources).b1(r1.instance(), true);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> z<T> J0(@i.a.e1.b.f n0<T> source) {
        Objects.requireNonNull(source, "source is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.e.r0(source, 0L));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> r0<Boolean> J1(@i.a.e1.b.f f0<? extends T> source1, @i.a.e1.b.f f0<? extends T> source2) {
        return K1(source1, source2, i.a.e1.h.b.b.a());
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> z<R> J2(@i.a.e1.b.f f0<? extends T1> source1, @i.a.e1.b.f f0<? extends T2> source2, @i.a.e1.b.f f0<? extends T3> source3, @i.a.e1.b.f f0<? extends T4> source4, @i.a.e1.b.f f0<? extends T5> source5, @i.a.e1.b.f f0<? extends T6> source6, @i.a.e1.b.f f0<? extends T7> source7, @i.a.e1.b.f f0<? extends T8> source8, @i.a.e1.b.f f0<? extends T9> source9, @i.a.e1.b.f i.a.e1.g.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(source6, "source6 is null");
        Objects.requireNonNull(source7, "source7 is null");
        Objects.requireNonNull(source8, "source8 is null");
        Objects.requireNonNull(source9, "source9 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return S2(i.a.e1.h.b.a.E(zipper), source1, source2, source3, source4, source5, source6, source7, source8, source9);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> K(@i.a.e1.b.f Publisher<? extends f0<? extends T>> sources, int maxConcurrency) {
        return s.g3(sources).c1(r1.instance(), true, maxConcurrency, 1);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> z<T> K0(@i.a.e1.b.f Optional<T> optional) {
        Objects.requireNonNull(optional, "optional is null");
        return (z) optional.map(f.f26733a).orElseGet(a.f26729a);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> r0<Boolean> K1(@i.a.e1.b.f f0<? extends T> source1, @i.a.e1.b.f f0<? extends T> source2, @i.a.e1.b.f i.a.e1.g.d<? super T, ? super T> isEqual) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(isEqual, "isEqual is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.c.x(source1, source2, isEqual));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> z<R> K2(@i.a.e1.b.f f0<? extends T1> source1, @i.a.e1.b.f f0<? extends T2> source2, @i.a.e1.b.f f0<? extends T3> source3, @i.a.e1.b.f f0<? extends T4> source4, @i.a.e1.b.f f0<? extends T5> source5, @i.a.e1.b.f f0<? extends T6> source6, @i.a.e1.b.f f0<? extends T7> source7, @i.a.e1.b.f f0<? extends T8> source8, @i.a.e1.b.f i.a.e1.g.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(source6, "source6 is null");
        Objects.requireNonNull(source7, "source7 is null");
        Objects.requireNonNull(source8, "source8 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return S2(i.a.e1.h.b.a.D(zipper), source1, source2, source3, source4, source5, source6, source7, source8);
    }

    @i.a.e1.b.b(i.a.e1.b.a.UNBOUNDED_IN)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> z<T> L0(@i.a.e1.b.f Publisher<T> source) {
        Objects.requireNonNull(source, "source is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.b.u0(source, 0L));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T1, T2, T3, T4, T5, T6, T7, R> z<R> L2(@i.a.e1.b.f f0<? extends T1> source1, @i.a.e1.b.f f0<? extends T2> source2, @i.a.e1.b.f f0<? extends T3> source3, @i.a.e1.b.f f0<? extends T4> source4, @i.a.e1.b.f f0<? extends T5> source5, @i.a.e1.b.f f0<? extends T6> source6, @i.a.e1.b.f f0<? extends T7> source7, @i.a.e1.b.f i.a.e1.g.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(source6, "source6 is null");
        Objects.requireNonNull(source7, "source7 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return S2(i.a.e1.h.b.a.C(zipper), source1, source2, source3, source4, source5, source6, source7);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> z<T> M0(@i.a.e1.b.f Runnable run) {
        Objects.requireNonNull(run, "run is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.n0(run));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T1, T2, T3, T4, T5, T6, R> z<R> M2(@i.a.e1.b.f f0<? extends T1> source1, @i.a.e1.b.f f0<? extends T2> source2, @i.a.e1.b.f f0<? extends T3> source3, @i.a.e1.b.f f0<? extends T4> source4, @i.a.e1.b.f f0<? extends T5> source5, @i.a.e1.b.f f0<? extends T6> source6, @i.a.e1.b.f i.a.e1.g.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(source6, "source6 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return S2(i.a.e1.h.b.a.B(zipper), source1, source2, source3, source4, source5, source6);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> z<T> N0(@i.a.e1.b.f x0<T> single) {
        Objects.requireNonNull(single, "single is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.o0(single));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T1, T2, T3, T4, T5, R> z<R> N2(@i.a.e1.b.f f0<? extends T1> source1, @i.a.e1.b.f f0<? extends T2> source2, @i.a.e1.b.f f0<? extends T3> source3, @i.a.e1.b.f f0<? extends T4> source4, @i.a.e1.b.f f0<? extends T5> source5, @i.a.e1.b.f i.a.e1.g.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return S2(i.a.e1.h.b.a.A(zipper), source1, source2, source3, source4, source5);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> z<T> O0(@i.a.e1.b.f i.a.e1.g.s<? extends T> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.p0(supplier));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T1, T2, T3, T4, R> z<R> O2(@i.a.e1.b.f f0<? extends T1> source1, @i.a.e1.b.f f0<? extends T2> source2, @i.a.e1.b.f f0<? extends T3> source3, @i.a.e1.b.f f0<? extends T4> source4, @i.a.e1.b.f i.a.e1.g.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return S2(i.a.e1.h.b.a.z(zipper), source1, source2, source3, source4);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T1, T2, T3, R> z<R> P2(@i.a.e1.b.f f0<? extends T1> source1, @i.a.e1.b.f f0<? extends T2> source2, @i.a.e1.b.f f0<? extends T3> source3, @i.a.e1.b.f i.a.e1.g.h<? super T1, ? super T2, ? super T3, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return S2(i.a.e1.h.b.a.y(zipper), source1, source2, source3);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T1, T2, R> z<R> Q2(@i.a.e1.b.f f0<? extends T1> source1, @i.a.e1.b.f f0<? extends T2> source2, @i.a.e1.b.f i.a.e1.g.c<? super T1, ? super T2, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return S2(i.a.e1.h.b.a.x(zipper), source1, source2);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> z<T> R(@i.a.e1.b.f d0<T> onSubscribe) {
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.j(onSubscribe));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T, R> z<R> R2(@i.a.e1.b.f Iterable<? extends f0<? extends T>> sources, @i.a.e1.b.f i.a.e1.g.o<? super Object[], ? extends R> zipper) {
        Objects.requireNonNull(zipper, "zipper is null");
        Objects.requireNonNull(sources, "sources is null");
        return i.a.e1.l.a.Q(new x1(sources, zipper));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> z<T> S0(T item) {
        Objects.requireNonNull(item, "item is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.v0(item));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @SafeVarargs
    @i.a.e1.b.d
    public static <T, R> z<R> S2(@i.a.e1.b.f i.a.e1.g.o<? super Object[], ? extends R> zipper, @i.a.e1.b.f f0<? extends T>... sources) {
        Objects.requireNonNull(sources, "sources is null");
        if (sources.length == 0) {
            return o0();
        }
        Objects.requireNonNull(zipper, "zipper is null");
        return i.a.e1.l.a.Q(new w1(sources, zipper));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> z<T> T(@i.a.e1.b.f i.a.e1.g.s<? extends f0<? extends T>> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.k(supplier));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> X0(@i.a.e1.b.f f0<? extends T> source1, @i.a.e1.b.f f0<? extends T> source2) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        return e1(source1, source2);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> Y0(@i.a.e1.b.f f0<? extends T> source1, @i.a.e1.b.f f0<? extends T> source2, @i.a.e1.b.f f0<? extends T> source3) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        return e1(source1, source2, source3);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> Z0(@i.a.e1.b.f f0<? extends T> source1, @i.a.e1.b.f f0<? extends T> source2, @i.a.e1.b.f f0<? extends T> source3, @i.a.e1.b.f f0<? extends T> source4) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        return e1(source1, source2, source3, source4);
    }

    @i.a.e1.b.b(i.a.e1.b.a.UNBOUNDED_IN)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> Z1(@i.a.e1.b.f Publisher<? extends f0<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return i.a.e1.l.a.P(new i.a.e1.h.f.d.k(sources, i.a.e1.h.b.a.k(), false));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> a1(@i.a.e1.b.f Iterable<? extends f0<? extends T>> sources) {
        return s.c3(sources).M2(i.a.e1.h.b.a.k(), false, Integer.MAX_VALUE);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> a2(@i.a.e1.b.f Publisher<? extends f0<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return i.a.e1.l.a.P(new i.a.e1.h.f.d.k(sources, i.a.e1.h.b.a.k(), true));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> b1(@i.a.e1.b.f Publisher<? extends f0<? extends T>> sources) {
        return c1(sources, Integer.MAX_VALUE);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> c1(@i.a.e1.b.f Publisher<? extends f0<? extends T>> sources, int maxConcurrency) {
        Objects.requireNonNull(sources, "sources is null");
        i.a.e1.h.b.b.b(maxConcurrency, "maxConcurrency");
        return i.a.e1.l.a.P(new d1(sources, i.a.e1.h.b.a.k(), false, maxConcurrency));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> z<T> d(@i.a.e1.b.f Iterable<? extends f0<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.b(null, sources));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> z<T> d1(@i.a.e1.b.f f0<? extends f0<? extends T>> source) {
        Objects.requireNonNull(source, "source is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.i0(source, i.a.e1.h.b.a.k()));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @SafeVarargs
    @i.a.e1.b.d
    public static <T> z<T> e(@i.a.e1.b.f f0<? extends T>... sources) {
        Objects.requireNonNull(sources, "sources is null");
        if (sources.length == 0) {
            return o0();
        }
        if (sources.length == 1) {
            return I2(sources[0]);
        }
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.b(sources, null));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @SafeVarargs
    @i.a.e1.b.d
    public static <T> s<T> e1(f0<? extends T>... sources) {
        Objects.requireNonNull(sources, "sources is null");
        if (sources.length == 0) {
            return s.k2();
        }
        if (sources.length == 1) {
            return i.a.e1.l.a.P(new p1(sources[0]));
        }
        return i.a.e1.l.a.P(new z0(sources));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @SafeVarargs
    @i.a.e1.b.d
    public static <T> s<T> f1(@i.a.e1.b.f f0<? extends T>... sources) {
        Objects.requireNonNull(sources, "sources is null");
        return s.W2(sources).M2(i.a.e1.h.b.a.k(), true, Math.max(1, sources.length));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> g1(@i.a.e1.b.f f0<? extends T> source1, @i.a.e1.b.f f0<? extends T> source2) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        return f1(source1, source2);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> h1(@i.a.e1.b.f f0<? extends T> source1, @i.a.e1.b.f f0<? extends T> source2, @i.a.e1.b.f f0<? extends T> source3) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        return f1(source1, source2, source3);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> i1(@i.a.e1.b.f f0<? extends T> source1, @i.a.e1.b.f f0<? extends T> source2, @i.a.e1.b.f f0<? extends T> source3, @i.a.e1.b.f f0<? extends T> source4) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        return f1(source1, source2, source3, source4);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> j1(@i.a.e1.b.f Iterable<? extends f0<? extends T>> sources) {
        return s.c3(sources).M2(i.a.e1.h.b.a.k(), true, Integer.MAX_VALUE);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> k1(@i.a.e1.b.f Publisher<? extends f0<? extends T>> sources) {
        return l1(sources, Integer.MAX_VALUE);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> l1(@i.a.e1.b.f Publisher<? extends f0<? extends T>> sources, int maxConcurrency) {
        Objects.requireNonNull(sources, "sources is null");
        i.a.e1.h.b.b.b(maxConcurrency, "maxConcurrency");
        return i.a.e1.l.a.P(new d1(sources, i.a.e1.h.b.a.k(), true, maxConcurrency));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public static <T> z<T> n1() {
        return i.a.e1.l.a.Q(a1.b);
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public static <T> z<T> o0() {
        return i.a.e1.l.a.Q(i.a.e1.h.f.c.w.b);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> z<T> p0(@i.a.e1.b.f i.a.e1.g.s<? extends Throwable> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.z(supplier));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> q(@i.a.e1.b.f f0<? extends T> source1, @i.a.e1.b.f f0<? extends T> source2) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        return w(source1, source2);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> z<T> q0(@i.a.e1.b.f Throwable throwable) {
        Objects.requireNonNull(throwable, "throwable is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.y(throwable));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> r(@i.a.e1.b.f f0<? extends T> source1, @i.a.e1.b.f f0<? extends T> source2, @i.a.e1.b.f f0<? extends T> source3) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        return w(source1, source2, source3);
    }

    @i.a.e1.b.h("io.reactivex:computation")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static z<Long> r2(long delay, @i.a.e1.b.f TimeUnit unit) {
        return s2(delay, unit, i.a.e1.n.b.a());
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> s(@i.a.e1.b.f f0<? extends T> source1, @i.a.e1.b.f f0<? extends T> source2, @i.a.e1.b.f f0<? extends T> source3, @i.a.e1.b.f f0<? extends T> source4) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        return w(source1, source2, source3, source4);
    }

    @i.a.e1.b.h("custom")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static z<Long> s2(long delay, @i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f q0 scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return i.a.e1.l.a.Q(new o1(Math.max(0L, delay), unit, scheduler));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> t(@i.a.e1.b.f Iterable<? extends f0<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return i.a.e1.l.a.P(new i.a.e1.h.f.c.g(sources));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> u(@i.a.e1.b.f Publisher<? extends f0<? extends T>> sources) {
        return v(sources, 2);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> v(@i.a.e1.b.f Publisher<? extends f0<? extends T>> sources, int prefetch) {
        Objects.requireNonNull(sources, "sources is null");
        i.a.e1.h.b.b.b(prefetch, "prefetch");
        return i.a.e1.l.a.P(new i.a.e1.h.f.d.e(sources, i.a.e1.h.b.a.k(), i.a.e1.h.k.j.IMMEDIATE, prefetch));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @SafeVarargs
    @i.a.e1.b.d
    public static <T> s<T> w(@i.a.e1.b.f f0<? extends T>... sources) {
        Objects.requireNonNull(sources, "sources is null");
        if (sources.length == 0) {
            return s.k2();
        }
        if (sources.length == 1) {
            return i.a.e1.l.a.P(new p1(sources[0]));
        }
        return i.a.e1.l.a.P(new i.a.e1.h.f.c.e(sources));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @SafeVarargs
    @i.a.e1.b.d
    public static <T> s<T> x(@i.a.e1.b.f f0<? extends T>... sources) {
        Objects.requireNonNull(sources, "sources is null");
        if (sources.length == 0) {
            return s.k2();
        }
        if (sources.length == 1) {
            return i.a.e1.l.a.P(new p1(sources[0]));
        }
        return i.a.e1.l.a.P(new i.a.e1.h.f.c.f(sources));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @SafeVarargs
    @i.a.e1.b.d
    public static <T> s<T> y(@i.a.e1.b.f f0<? extends T>... sources) {
        return s.W2(sources).Z0(r1.instance());
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @SafeVarargs
    @i.a.e1.b.d
    public static <T> s<T> z(@i.a.e1.b.f f0<? extends T>... sources) {
        return s.W2(sources).b1(r1.instance(), true);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <U> i0<U> A0(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends Iterable<? extends U>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return i.a.e1.l.a.R(new i.a.e1.h.f.c.f0(this, mapper));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final s<T> A1(@i.a.e1.b.f i.a.e1.g.o<? super s<Object>, ? extends Publisher<?>> handler) {
        return A2().l5(handler);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final s<T> A2() {
        if (this instanceof i.a.e1.h.c.d) {
            return ((i.a.e1.h.c.d) this).c();
        }
        return i.a.e1.l.a.P(new p1(this));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> s<R> B0(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends Stream<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return i.a.e1.l.a.P(new i.a.e1.h.d.m(this, mapper));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final z<T> B1() {
        return D1(Long.MAX_VALUE, i.a.e1.h.b.a.c());
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final Future<T> B2() {
        return (Future) W1(new i.a.e1.h.e.r());
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> i0<R> C0(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends Stream<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return i.a.e1.l.a.R(new i.a.e1.h.d.n(this, mapper));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> C1(long times) {
        return D1(times, i.a.e1.h.b.a.c());
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final i0<T> C2() {
        if (this instanceof i.a.e1.h.c.f) {
            return ((i.a.e1.h.c.f) this).a();
        }
        return i.a.e1.l.a.R(new q1(this));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> D1(long times, @i.a.e1.b.f i.a.e1.g.r<? super Throwable> predicate) {
        return A2().G5(times, predicate).c6();
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final r0<T> D2() {
        return i.a.e1.l.a.S(new s1(this, null));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> E1(@i.a.e1.b.f i.a.e1.g.d<? super Integer, ? super Throwable> predicate) {
        return A2().H5(predicate).c6();
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> F1(@i.a.e1.b.f i.a.e1.g.r<? super Throwable> predicate) {
        return D1(Long.MAX_VALUE, predicate);
    }

    @i.a.e1.b.h("custom")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> F2(@i.a.e1.b.f q0 scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return i.a.e1.l.a.Q(new u1(this, scheduler));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> G1(@i.a.e1.b.f i.a.e1.g.e stop) {
        Objects.requireNonNull(stop, "stop is null");
        return D1(Long.MAX_VALUE, i.a.e1.h.b.a.v(stop));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> H1(@i.a.e1.b.f i.a.e1.g.o<? super s<Throwable>, ? extends Publisher<?>> handler) {
        return A2().K5(handler).c6();
    }

    @i.a.e1.b.h("none")
    public final void I1(@i.a.e1.b.f c0<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        b(new i.a.e1.h.e.c0(observer));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> z<R> L(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends f0<? extends R>> mapper) {
        return s0(mapper);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final s<T> L1(@i.a.e1.b.f p other) {
        Objects.requireNonNull(other, "other is null");
        return s.u0(j.A1(other).p1(), A2());
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final j M(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends p> mapper) {
        return v0(mapper);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final s<T> M1(@i.a.e1.b.f f0<T> other) {
        Objects.requireNonNull(other, "other is null");
        return s.u0(I2(other).A2(), A2());
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> z<R> N(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends x0<? extends R>> mapper) {
        return y0(mapper);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final s<T> N1(@i.a.e1.b.f x0<T> other) {
        Objects.requireNonNull(other, "other is null");
        return s.u0(r0.w2(other).n2(), A2());
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final s<T> O(@i.a.e1.b.f f0<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return q(this, other);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final s<T> O1(@i.a.e1.b.f Publisher<T> other) {
        Objects.requireNonNull(other, "other is null");
        return A2().w6(other);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<Boolean> P(@i.a.e1.b.f Object item) {
        Objects.requireNonNull(item, "item is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.c.h(this, item));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final z<T> P0() {
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.q0(this));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final i0<T> P1(@i.a.e1.b.f n0<T> other) {
        Objects.requireNonNull(other, "other is null");
        return i0.h8(other).o1(C2());
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final r0<Long> Q() {
        return i.a.e1.l.a.S(new i.a.e1.h.f.c.i(this));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final j Q0() {
        return i.a.e1.l.a.O(new i.a.e1.h.f.c.s0(this));
    }

    @i.a.e1.b.f
    @i.a.e1.b.h("none")
    public final i.a.e1.d.f Q1() {
        return T1(i.a.e1.h.b.a.h(), i.a.e1.h.b.a.f26750f, i.a.e1.h.b.a.c);
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final r0<Boolean> R0() {
        return i.a.e1.l.a.S(new i.a.e1.h.f.c.u0(this));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final i.a.e1.d.f R1(@i.a.e1.b.f i.a.e1.g.g<? super T> onSuccess) {
        return T1(onSuccess, i.a.e1.h.b.a.f26750f, i.a.e1.h.b.a.c);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> S(@i.a.e1.b.f T defaultItem) {
        Objects.requireNonNull(defaultItem, "defaultItem is null");
        return i.a.e1.l.a.S(new s1(this, defaultItem));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final i.a.e1.d.f S1(@i.a.e1.b.f i.a.e1.g.g<? super T> onSuccess, @i.a.e1.b.f i.a.e1.g.g<? super Throwable> onError) {
        return T1(onSuccess, onError, i.a.e1.h.b.a.c);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> z<R> T0(@i.a.e1.b.f e0<? extends R, ? super T> lift) {
        Objects.requireNonNull(lift, "lift is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.w0(this, lift));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final i.a.e1.d.f T1(@i.a.e1.b.f i.a.e1.g.g<? super T> onSuccess, @i.a.e1.b.f i.a.e1.g.g<? super Throwable> onError, @i.a.e1.b.f i.a.e1.g.a onComplete) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onError, "onError is null");
        Objects.requireNonNull(onComplete, "onComplete is null");
        return (i.a.e1.d.f) W1(new i.a.e1.h.f.c.d(onSuccess, onError, onComplete));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <U, R> z<R> T2(@i.a.e1.b.f f0<? extends U> other, @i.a.e1.b.f i.a.e1.g.c<? super T, ? super U, ? extends R> zipper) {
        Objects.requireNonNull(other, "other is null");
        return Q2(this, other, zipper);
    }

    @i.a.e1.b.h("io.reactivex:computation")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> U(long time, @i.a.e1.b.f TimeUnit unit) {
        return W(time, unit, i.a.e1.n.b.a(), false);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> z<R> U0(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends R> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.x0(this, mapper));
    }

    public abstract void U1(@i.a.e1.b.f c0<? super T> observer);

    @i.a.e1.b.h("custom")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> V(long time, @i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f q0 scheduler) {
        return W(time, unit, scheduler, false);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> z<R> V0(@i.a.e1.b.f i.a.e1.g.o<? super T, Optional<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.d.p(this, mapper));
    }

    @i.a.e1.b.h("custom")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> V1(@i.a.e1.b.f q0 scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return i.a.e1.l.a.Q(new g1(this, scheduler));
    }

    @i.a.e1.b.h("custom")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> W(long time, @i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f q0 scheduler, boolean delayError) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.l(this, Math.max(0L, time), unit, scheduler, delayError));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final r0<h0<T>> W0() {
        return i.a.e1.l.a.S(new i.a.e1.h.f.c.y0(this));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <E extends c0<? super T>> E W1(E observer) {
        b(observer);
        return observer;
    }

    @i.a.e1.b.h("io.reactivex:computation")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> X(long time, @i.a.e1.b.f TimeUnit unit, boolean delayError) {
        return W(time, unit, i.a.e1.n.b.a(), delayError);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> X1(@i.a.e1.b.f f0<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return i.a.e1.l.a.Q(new h1(this, other));
    }

    @i.a.e1.b.b(i.a.e1.b.a.UNBOUNDED_IN)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <U> z<T> Y(@i.a.e1.b.f Publisher<U> delayIndicator) {
        Objects.requireNonNull(delayIndicator, "delayIndicator is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.m(this, delayIndicator));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> Y1(@i.a.e1.b.f x0<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return i.a.e1.l.a.S(new i1(this, other));
    }

    @i.a.e1.b.h("io.reactivex:computation")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> Z(long time, @i.a.e1.b.f TimeUnit unit) {
        return a0(time, unit, i.a.e1.n.b.a());
    }

    @i.a.e1.b.h("custom")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> a0(long time, @i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f q0 scheduler) {
        return b0(s.Q7(time, unit, scheduler));
    }

    @Override // i.a.e1.c.f0
    @i.a.e1.b.h("none")
    public final void b(@i.a.e1.b.f c0<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        c0<? super T> e0 = i.a.e1.l.a.e0(this, observer);
        Objects.requireNonNull(e0, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            U1(e0);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            i.a.e1.e.b.b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @i.a.e1.b.b(i.a.e1.b.a.UNBOUNDED_IN)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <U> z<T> b0(@i.a.e1.b.f Publisher<U> subscriptionIndicator) {
        Objects.requireNonNull(subscriptionIndicator, "subscriptionIndicator is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.n(this, subscriptionIndicator));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <U> z<T> b2(@i.a.e1.b.f f0<U> other) {
        Objects.requireNonNull(other, "other is null");
        return i.a.e1.l.a.Q(new j1(this, other));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> z<R> c0(@i.a.e1.b.f i.a.e1.g.o<? super T, h0<R>> selector) {
        Objects.requireNonNull(selector, "selector is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.p(this, selector));
    }

    @i.a.e1.b.b(i.a.e1.b.a.UNBOUNDED_IN)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <U> z<T> c2(@i.a.e1.b.f Publisher<U> other) {
        Objects.requireNonNull(other, "other is null");
        return i.a.e1.l.a.Q(new k1(this, other));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> d0(@i.a.e1.b.f i.a.e1.g.g<? super T> onAfterSuccess) {
        Objects.requireNonNull(onAfterSuccess, "onAfterSuccess is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.r(this, onAfterSuccess));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final i.a.e1.j.n<T> d2() {
        i.a.e1.j.n<T> nVar = new i.a.e1.j.n<>();
        b(nVar);
        return nVar;
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> e0(@i.a.e1.b.f i.a.e1.g.a onAfterTerminate) {
        i.a.e1.g.g h2 = i.a.e1.h.b.a.h();
        i.a.e1.g.g h3 = i.a.e1.h.b.a.h();
        i.a.e1.g.g h4 = i.a.e1.h.b.a.h();
        i.a.e1.g.a aVar = i.a.e1.h.b.a.c;
        Objects.requireNonNull(onAfterTerminate, "onAfterTerminate is null");
        return i.a.e1.l.a.Q(new f1(this, h2, h3, h4, aVar, onAfterTerminate, aVar));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final i.a.e1.j.n<T> e2(boolean dispose) {
        i.a.e1.j.n<T> nVar = new i.a.e1.j.n<>();
        if (dispose) {
            nVar.dispose();
        }
        b(nVar);
        return nVar;
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> f(@i.a.e1.b.f f0<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return e(this, other);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> f0(@i.a.e1.b.f i.a.e1.g.a onFinally) {
        Objects.requireNonNull(onFinally, "onFinally is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.s(this, onFinally));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("io.reactivex:computation")
    public final z<i.a.e1.n.d<T>> f2() {
        return i2(TimeUnit.MILLISECONDS, i.a.e1.n.b.a());
    }

    @i.a.e1.b.g
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final T g() {
        i.a.e1.h.e.i iVar = new i.a.e1.h.e.i();
        b(iVar);
        return (T) iVar.c();
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> g0(@i.a.e1.b.f i.a.e1.g.a onComplete) {
        i.a.e1.g.g h2 = i.a.e1.h.b.a.h();
        i.a.e1.g.g h3 = i.a.e1.h.b.a.h();
        i.a.e1.g.g h4 = i.a.e1.h.b.a.h();
        Objects.requireNonNull(onComplete, "onComplete is null");
        i.a.e1.g.a aVar = i.a.e1.h.b.a.c;
        return i.a.e1.l.a.Q(new f1(this, h2, h3, h4, onComplete, aVar, aVar));
    }

    @i.a.e1.b.h("custom")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<i.a.e1.n.d<T>> g2(@i.a.e1.b.f q0 scheduler) {
        return i2(TimeUnit.MILLISECONDS, scheduler);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final T h(@i.a.e1.b.f T defaultValue) {
        Objects.requireNonNull(defaultValue, "defaultValue is null");
        i.a.e1.h.e.i iVar = new i.a.e1.h.e.i();
        b(iVar);
        return (T) iVar.d(defaultValue);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> h0(@i.a.e1.b.f i.a.e1.g.a onDispose) {
        i.a.e1.g.g h2 = i.a.e1.h.b.a.h();
        i.a.e1.g.g h3 = i.a.e1.h.b.a.h();
        i.a.e1.g.g h4 = i.a.e1.h.b.a.h();
        i.a.e1.g.a aVar = i.a.e1.h.b.a.c;
        Objects.requireNonNull(onDispose, "onDispose is null");
        return i.a.e1.l.a.Q(new f1(this, h2, h3, h4, aVar, aVar, onDispose));
    }

    @i.a.e1.b.h("io.reactivex:computation")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<i.a.e1.n.d<T>> h2(@i.a.e1.b.f TimeUnit unit) {
        return i2(unit, i.a.e1.n.b.a());
    }

    @i.a.e1.b.h("none")
    public final void i() {
        m(i.a.e1.h.b.a.h(), i.a.e1.h.b.a.f26749e, i.a.e1.h.b.a.c);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> i0(@i.a.e1.b.f i.a.e1.g.g<? super Throwable> onError) {
        i.a.e1.g.g h2 = i.a.e1.h.b.a.h();
        i.a.e1.g.g h3 = i.a.e1.h.b.a.h();
        Objects.requireNonNull(onError, "onError is null");
        i.a.e1.g.a aVar = i.a.e1.h.b.a.c;
        return i.a.e1.l.a.Q(new f1(this, h2, h3, onError, aVar, aVar, aVar));
    }

    @i.a.e1.b.h("custom")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<i.a.e1.n.d<T>> i2(@i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f q0 scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return i.a.e1.l.a.Q(new l1(this, unit, scheduler, true));
    }

    @i.a.e1.b.h("none")
    public final void j(@i.a.e1.b.f c0<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        i.a.e1.h.e.f fVar = new i.a.e1.h.e.f();
        observer.onSubscribe(fVar);
        b(fVar);
        fVar.b(observer);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> j0(@i.a.e1.b.f i.a.e1.g.b<? super T, ? super Throwable> onEvent) {
        Objects.requireNonNull(onEvent, "onEvent is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.t(this, onEvent));
    }

    @i.a.e1.b.h("io.reactivex:computation")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> j2(long timeout, @i.a.e1.b.f TimeUnit unit) {
        return l2(timeout, unit, i.a.e1.n.b.a());
    }

    @i.a.e1.b.h("none")
    public final void k(@i.a.e1.b.f i.a.e1.g.g<? super T> onSuccess) {
        m(onSuccess, i.a.e1.h.b.a.f26749e, i.a.e1.h.b.a.c);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> k0(@i.a.e1.b.f i.a.e1.g.g<? super i.a.e1.d.f> onSubscribe, @i.a.e1.b.f i.a.e1.g.a onDispose) {
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        Objects.requireNonNull(onDispose, "onDispose is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.u(this, onSubscribe, onDispose));
    }

    @i.a.e1.b.h("io.reactivex:computation")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> k2(long timeout, @i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f f0<? extends T> fallback) {
        Objects.requireNonNull(fallback, "fallback is null");
        return m2(timeout, unit, i.a.e1.n.b.a(), fallback);
    }

    @i.a.e1.b.h("none")
    public final void l(@i.a.e1.b.f i.a.e1.g.g<? super T> onSuccess, @i.a.e1.b.f i.a.e1.g.g<? super Throwable> onError) {
        m(onSuccess, onError, i.a.e1.h.b.a.c);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> l0(@i.a.e1.b.f i.a.e1.g.g<? super i.a.e1.d.f> onSubscribe) {
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        i.a.e1.g.g h2 = i.a.e1.h.b.a.h();
        i.a.e1.g.g h3 = i.a.e1.h.b.a.h();
        i.a.e1.g.a aVar = i.a.e1.h.b.a.c;
        return i.a.e1.l.a.Q(new f1(this, onSubscribe, h2, h3, aVar, aVar, aVar));
    }

    @i.a.e1.b.h("custom")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> l2(long timeout, @i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f q0 scheduler) {
        return n2(s2(timeout, unit, scheduler));
    }

    @i.a.e1.b.h("none")
    public final void m(@i.a.e1.b.f i.a.e1.g.g<? super T> onSuccess, @i.a.e1.b.f i.a.e1.g.g<? super Throwable> onError, @i.a.e1.b.f i.a.e1.g.a onComplete) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onError, "onError is null");
        Objects.requireNonNull(onComplete, "onComplete is null");
        i.a.e1.h.e.i iVar = new i.a.e1.h.e.i();
        b(iVar);
        iVar.b(onSuccess, onError, onComplete);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> m0(@i.a.e1.b.f i.a.e1.g.g<? super T> onSuccess) {
        i.a.e1.g.g h2 = i.a.e1.h.b.a.h();
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        i.a.e1.g.g h3 = i.a.e1.h.b.a.h();
        i.a.e1.g.a aVar = i.a.e1.h.b.a.c;
        return i.a.e1.l.a.Q(new f1(this, h2, onSuccess, h3, aVar, aVar, aVar));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final s<T> m1(@i.a.e1.b.f f0<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return X0(this, other);
    }

    @i.a.e1.b.h("custom")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> m2(long timeout, @i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f q0 scheduler, @i.a.e1.b.f f0<? extends T> fallback) {
        Objects.requireNonNull(fallback, "fallback is null");
        return o2(s2(timeout, unit, scheduler), fallback);
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final z<T> n() {
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.c(this));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> n0(@i.a.e1.b.f i.a.e1.g.a onTerminate) {
        Objects.requireNonNull(onTerminate, "onTerminate is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.v(this, onTerminate));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <U> z<T> n2(@i.a.e1.b.f f0<U> timeoutIndicator) {
        Objects.requireNonNull(timeoutIndicator, "timeoutIndicator is null");
        return i.a.e1.l.a.Q(new m1(this, timeoutIndicator, null));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <U> z<U> o(@i.a.e1.b.f Class<? extends U> clazz) {
        Objects.requireNonNull(clazz, "clazz is null");
        return (z<U>) U0(i.a.e1.h.b.a.e(clazz));
    }

    @i.a.e1.b.h("custom")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> o1(@i.a.e1.b.f q0 scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return i.a.e1.l.a.Q(new b1(this, scheduler));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <U> z<T> o2(@i.a.e1.b.f f0<U> timeoutIndicator, @i.a.e1.b.f f0<? extends T> fallback) {
        Objects.requireNonNull(timeoutIndicator, "timeoutIndicator is null");
        Objects.requireNonNull(fallback, "fallback is null");
        return i.a.e1.l.a.Q(new m1(this, timeoutIndicator, fallback));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> z<R> p(@i.a.e1.b.f g0<? super T, ? extends R> transformer) {
        Objects.requireNonNull(transformer, "transformer is null");
        return I2(transformer.a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <U> z<U> p1(@i.a.e1.b.f Class<U> clazz) {
        Objects.requireNonNull(clazz, "clazz is null");
        return r0(i.a.e1.h.b.a.l(clazz)).o(clazz);
    }

    @i.a.e1.b.b(i.a.e1.b.a.UNBOUNDED_IN)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <U> z<T> p2(@i.a.e1.b.f Publisher<U> timeoutIndicator) {
        Objects.requireNonNull(timeoutIndicator, "timeoutIndicator is null");
        return i.a.e1.l.a.Q(new n1(this, timeoutIndicator, null));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final z<T> q1() {
        return r1(i.a.e1.h.b.a.c());
    }

    @i.a.e1.b.b(i.a.e1.b.a.UNBOUNDED_IN)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <U> z<T> q2(@i.a.e1.b.f Publisher<U> timeoutIndicator, @i.a.e1.b.f f0<? extends T> fallback) {
        Objects.requireNonNull(timeoutIndicator, "timeoutIndicator is null");
        Objects.requireNonNull(fallback, "fallback is null");
        return i.a.e1.l.a.Q(new n1(this, timeoutIndicator, fallback));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> r0(@i.a.e1.b.f i.a.e1.g.r<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.a0(this, predicate));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> r1(@i.a.e1.b.f i.a.e1.g.r<? super Throwable> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return i.a.e1.l.a.Q(new c1(this, predicate));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> z<R> s0(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends f0<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.i0(this, mapper));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> s1(@i.a.e1.b.f i.a.e1.g.o<? super Throwable, ? extends f0<? extends T>> fallbackSupplier) {
        Objects.requireNonNull(fallbackSupplier, "fallbackSupplier is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.d1(this, fallbackSupplier));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <U, R> z<R> t0(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends f0<? extends U>> mapper, @i.a.e1.b.f i.a.e1.g.c<? super T, ? super U, ? extends R> combiner) {
        Objects.requireNonNull(mapper, "mapper is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.c0(this, mapper, combiner));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> t1(@i.a.e1.b.f f0<? extends T> fallback) {
        Objects.requireNonNull(fallback, "fallback is null");
        return s1(i.a.e1.h.b.a.n(fallback));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("io.reactivex:computation")
    public final z<i.a.e1.n.d<T>> t2() {
        return w2(TimeUnit.MILLISECONDS, i.a.e1.n.b.a());
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> z<R> u0(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends f0<? extends R>> onSuccessMapper, @i.a.e1.b.f i.a.e1.g.o<? super Throwable, ? extends f0<? extends R>> onErrorMapper, @i.a.e1.b.f i.a.e1.g.s<? extends f0<? extends R>> onCompleteSupplier) {
        Objects.requireNonNull(onSuccessMapper, "onSuccessMapper is null");
        Objects.requireNonNull(onErrorMapper, "onErrorMapper is null");
        Objects.requireNonNull(onCompleteSupplier, "onCompleteSupplier is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.g0(this, onSuccessMapper, onErrorMapper, onCompleteSupplier));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> u1(@i.a.e1.b.f i.a.e1.g.o<? super Throwable, ? extends T> itemSupplier) {
        Objects.requireNonNull(itemSupplier, "itemSupplier is null");
        return i.a.e1.l.a.Q(new e1(this, itemSupplier));
    }

    @i.a.e1.b.h("custom")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<i.a.e1.n.d<T>> u2(@i.a.e1.b.f q0 scheduler) {
        return w2(TimeUnit.MILLISECONDS, scheduler);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final j v0(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends p> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.c.d0(this, mapper));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> v1(@i.a.e1.b.f T item) {
        Objects.requireNonNull(item, "item is null");
        return u1(i.a.e1.h.b.a.n(item));
    }

    @i.a.e1.b.h("io.reactivex:computation")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<i.a.e1.n.d<T>> v2(@i.a.e1.b.f TimeUnit unit) {
        return w2(unit, i.a.e1.n.b.a());
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> i0<R> w0(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends n0<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return i.a.e1.l.a.R(new i.a.e1.h.f.d.o(this, mapper));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final z<T> w1() {
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.q(this));
    }

    @i.a.e1.b.h("custom")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<i.a.e1.n.d<T>> w2(@i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f q0 scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return i.a.e1.l.a.Q(new l1(this, unit, scheduler, false));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> s<R> x0(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return i.a.e1.l.a.P(new i.a.e1.h.f.d.p(this, mapper));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final s<T> x1() {
        return y1(Long.MAX_VALUE);
    }

    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final <R> R x2(@i.a.e1.b.f a0<T, ? extends R> converter) {
        Objects.requireNonNull(converter, "converter is null");
        return converter.a(this);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> z<R> y0(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends x0<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.h0(this, mapper));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final s<T> y1(long times) {
        return A2().j5(times);
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final CompletionStage<T> y2() {
        return (CompletionStage) W1(new i.a.e1.h.d.b(false, null));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <U> s<U> z0(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends Iterable<? extends U>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return i.a.e1.l.a.P(new i.a.e1.h.f.c.e0(this, mapper));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final s<T> z1(@i.a.e1.b.f i.a.e1.g.e stop) {
        return A2().k5(stop);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final CompletionStage<T> z2(@i.a.e1.b.g T defaultItem) {
        return (CompletionStage) W1(new i.a.e1.h.d.b(true, defaultItem));
    }
}
