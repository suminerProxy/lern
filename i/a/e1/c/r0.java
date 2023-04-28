package i.a.e1.c;

import i.a.e1.h.f.b.w3;
import i.a.e1.h.f.c.s1;
import i.a.e1.h.f.e.j3;
import i.a.e1.h.f.g.a1;
import i.a.e1.h.f.g.b1;
import i.a.e1.h.f.g.c1;
import i.a.e1.h.f.g.d1;
import i.a.e1.h.f.g.e1;
import i.a.e1.h.f.g.f1;
import i.a.e1.h.f.g.z0;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.reactivestreams.Publisher;

/* compiled from: Single.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class r0<T> implements x0<T> {
    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> A(@i.a.e1.b.f Iterable<? extends x0<? extends T>> sources) {
        return s.c3(sources).m1(i.a.e1.h.b.a.k());
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T1, T2, T3, T4, T5, T6, R> r0<R> A2(@i.a.e1.b.f x0<? extends T1> source1, @i.a.e1.b.f x0<? extends T2> source2, @i.a.e1.b.f x0<? extends T3> source3, @i.a.e1.b.f x0<? extends T4> source4, @i.a.e1.b.f x0<? extends T5> source5, @i.a.e1.b.f x0<? extends T6> source6, @i.a.e1.b.f i.a.e1.g.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(source6, "source6 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return G2(i.a.e1.h.b.a.B(zipper), source1, source2, source3, source4, source5, source6);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> B(@i.a.e1.b.f Publisher<? extends x0<? extends T>> sources) {
        return s.g3(sources).m1(i.a.e1.h.b.a.k());
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T1, T2, T3, T4, T5, R> r0<R> B2(@i.a.e1.b.f x0<? extends T1> source1, @i.a.e1.b.f x0<? extends T2> source2, @i.a.e1.b.f x0<? extends T3> source3, @i.a.e1.b.f x0<? extends T4> source4, @i.a.e1.b.f x0<? extends T5> source5, @i.a.e1.b.f i.a.e1.g.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return G2(i.a.e1.h.b.a.A(zipper), source1, source2, source3, source4, source5);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> C(@i.a.e1.b.f Publisher<? extends x0<? extends T>> sources, int prefetch) {
        return s.g3(sources).o1(i.a.e1.h.b.a.k(), true, prefetch);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> r0<T> C0(@i.a.e1.b.f Callable<? extends T> callable) {
        Objects.requireNonNull(callable, "callable is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.g0(callable));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> r0<Boolean> C1(@i.a.e1.b.f x0<? extends T> source1, @i.a.e1.b.f x0<? extends T> source2) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.w(source1, source2));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T1, T2, T3, T4, R> r0<R> C2(@i.a.e1.b.f x0<? extends T1> source1, @i.a.e1.b.f x0<? extends T2> source2, @i.a.e1.b.f x0<? extends T3> source3, @i.a.e1.b.f x0<? extends T4> source4, @i.a.e1.b.f i.a.e1.g.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return G2(i.a.e1.h.b.a.z(zipper), source1, source2, source3, source4);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> D(@i.a.e1.b.f Iterable<? extends x0<? extends T>> sources) {
        return s.c3(sources).b1(i.a.e1.h.f.g.l0.c(), false);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> r0<T> D0(@i.a.e1.b.f CompletionStage<T> stage) {
        Objects.requireNonNull(stage, "stage is null");
        return i.a.e1.l.a.S(new i.a.e1.h.d.g0(stage));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T1, T2, T3, R> r0<R> D2(@i.a.e1.b.f x0<? extends T1> source1, @i.a.e1.b.f x0<? extends T2> source2, @i.a.e1.b.f x0<? extends T3> source3, @i.a.e1.b.f i.a.e1.g.h<? super T1, ? super T2, ? super T3, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return G2(i.a.e1.h.b.a.y(zipper), source1, source2, source3);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> E(@i.a.e1.b.f Iterable<? extends x0<? extends T>> sources, int maxConcurrency) {
        return s.c3(sources).c1(i.a.e1.h.f.g.l0.c(), false, maxConcurrency, 1);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> r0<T> E0(@i.a.e1.b.f Future<? extends T> future) {
        return r2(s.a3(future));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T1, T2, R> r0<R> E2(@i.a.e1.b.f x0<? extends T1> source1, @i.a.e1.b.f x0<? extends T2> source2, @i.a.e1.b.f i.a.e1.g.c<? super T1, ? super T2, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return G2(i.a.e1.h.b.a.x(zipper), source1, source2);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> F(@i.a.e1.b.f Publisher<? extends x0<? extends T>> sources) {
        return s.g3(sources).Z0(i.a.e1.h.f.g.l0.c());
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> r0<T> F0(@i.a.e1.b.f Future<? extends T> future, long timeout, @i.a.e1.b.f TimeUnit unit) {
        return r2(s.b3(future, timeout, unit));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T, R> r0<R> F2(@i.a.e1.b.f Iterable<? extends x0<? extends T>> sources, @i.a.e1.b.f i.a.e1.g.o<? super Object[], ? extends R> zipper) {
        Objects.requireNonNull(zipper, "zipper is null");
        Objects.requireNonNull(sources, "sources is null");
        return i.a.e1.l.a.S(new f1(sources, zipper));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> G(@i.a.e1.b.f Publisher<? extends x0<? extends T>> sources, int maxConcurrency) {
        return s.g3(sources).a1(i.a.e1.h.f.g.l0.c(), maxConcurrency, 1);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> r0<T> G0(@i.a.e1.b.f f0<T> maybe) {
        Objects.requireNonNull(maybe, "maybe is null");
        return i.a.e1.l.a.S(new s1(maybe, null));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @SafeVarargs
    @i.a.e1.b.d
    public static <T, R> r0<R> G2(@i.a.e1.b.f i.a.e1.g.o<? super Object[], ? extends R> zipper, @i.a.e1.b.f x0<? extends T>... sources) {
        Objects.requireNonNull(zipper, "zipper is null");
        Objects.requireNonNull(sources, "sources is null");
        if (sources.length == 0) {
            return p0(new NoSuchElementException());
        }
        return i.a.e1.l.a.S(new e1(sources, zipper));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> H(@i.a.e1.b.f Iterable<? extends x0<? extends T>> sources) {
        return s.c3(sources).b1(i.a.e1.h.f.g.l0.c(), true);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> r0<T> H0(@i.a.e1.b.f f0<T> maybe, @i.a.e1.b.f T defaultItem) {
        Objects.requireNonNull(maybe, "maybe is null");
        Objects.requireNonNull(defaultItem, "defaultItem is null");
        return i.a.e1.l.a.S(new s1(maybe, defaultItem));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> I(@i.a.e1.b.f Iterable<? extends x0<? extends T>> sources, int maxConcurrency) {
        return s.c3(sources).c1(i.a.e1.h.f.g.l0.c(), true, maxConcurrency, 1);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> r0<T> I0(@i.a.e1.b.f n0<? extends T> observable) {
        Objects.requireNonNull(observable, "observable is null");
        return i.a.e1.l.a.S(new j3(observable, null));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> J(@i.a.e1.b.f Publisher<? extends x0<? extends T>> sources) {
        return s.g3(sources).b1(i.a.e1.h.f.g.l0.c(), true);
    }

    @i.a.e1.b.b(i.a.e1.b.a.UNBOUNDED_IN)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> r0<T> J0(@i.a.e1.b.f Publisher<? extends T> publisher) {
        Objects.requireNonNull(publisher, "publisher is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.h0(publisher));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> K(@i.a.e1.b.f Publisher<? extends x0<? extends T>> sources, int maxConcurrency) {
        return s.g3(sources).c1(i.a.e1.h.f.g.l0.c(), true, maxConcurrency, 1);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> r0<T> K0(@i.a.e1.b.f i.a.e1.g.s<? extends T> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.i0(supplier));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> r0<T> N0(T item) {
        Objects.requireNonNull(item, "item is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.m0(item));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> P1(@i.a.e1.b.f Publisher<? extends x0<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return i.a.e1.l.a.P(new i.a.e1.h.f.d.m(sources, i.a.e1.h.b.a.k(), false));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> Q1(@i.a.e1.b.f Publisher<? extends x0<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return i.a.e1.l.a.P(new i.a.e1.h.f.d.m(sources, i.a.e1.h.b.a.k(), true));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> r0<T> R(@i.a.e1.b.f v0<T> source) {
        Objects.requireNonNull(source, "source is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.d(source));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> r0<T> S(@i.a.e1.b.f i.a.e1.g.s<? extends x0<? extends T>> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.e(supplier));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> S0(@i.a.e1.b.f x0<? extends T> source1, @i.a.e1.b.f x0<? extends T> source2) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        return s.W2(source1, source2).O2(i.a.e1.h.b.a.k(), false, Integer.MAX_VALUE);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> T0(@i.a.e1.b.f x0<? extends T> source1, @i.a.e1.b.f x0<? extends T> source2, @i.a.e1.b.f x0<? extends T> source3) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        return s.W2(source1, source2, source3).O2(i.a.e1.h.b.a.k(), false, Integer.MAX_VALUE);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> U0(@i.a.e1.b.f x0<? extends T> source1, @i.a.e1.b.f x0<? extends T> source2, @i.a.e1.b.f x0<? extends T> source3, @i.a.e1.b.f x0<? extends T> source4) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        return s.W2(source1, source2, source3, source4).O2(i.a.e1.h.b.a.k(), false, Integer.MAX_VALUE);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> V0(@i.a.e1.b.f Iterable<? extends x0<? extends T>> sources) {
        return s.c3(sources).N2(i.a.e1.h.b.a.k());
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> W0(@i.a.e1.b.f Publisher<? extends x0<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return i.a.e1.l.a.P(new i.a.e1.h.f.b.f1(sources, i.a.e1.h.b.a.k(), false, Integer.MAX_VALUE));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> r0<T> X0(@i.a.e1.b.f x0<? extends x0<? extends T>> source) {
        Objects.requireNonNull(source, "source is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.y(source, i.a.e1.h.b.a.k()));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @SafeVarargs
    @i.a.e1.b.d
    public static <T> s<T> Y0(x0<? extends T>... sources) {
        return s.W2(sources).O2(i.a.e1.h.b.a.k(), false, Math.max(1, sources.length));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @SafeVarargs
    @i.a.e1.b.d
    public static <T> s<T> Z0(@i.a.e1.b.f x0<? extends T>... sources) {
        return s.W2(sources).O2(i.a.e1.h.b.a.k(), true, Math.max(1, sources.length));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> a1(@i.a.e1.b.f x0<? extends T> source1, @i.a.e1.b.f x0<? extends T> source2) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        return s.W2(source1, source2).O2(i.a.e1.h.b.a.k(), true, Integer.MAX_VALUE);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> b1(@i.a.e1.b.f x0<? extends T> source1, @i.a.e1.b.f x0<? extends T> source2, @i.a.e1.b.f x0<? extends T> source3) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        return s.W2(source1, source2, source3).O2(i.a.e1.h.b.a.k(), true, Integer.MAX_VALUE);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> c1(@i.a.e1.b.f x0<? extends T> source1, @i.a.e1.b.f x0<? extends T> source2, @i.a.e1.b.f x0<? extends T> source3, @i.a.e1.b.f x0<? extends T> source4) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        return s.W2(source1, source2, source3, source4).O2(i.a.e1.h.b.a.k(), true, Integer.MAX_VALUE);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> d1(@i.a.e1.b.f Iterable<? extends x0<? extends T>> sources) {
        return s.c3(sources).O2(i.a.e1.h.b.a.k(), true, Integer.MAX_VALUE);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> r0<T> e(@i.a.e1.b.f Iterable<? extends x0<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.a(null, sources));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> e1(@i.a.e1.b.f Publisher<? extends x0<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return i.a.e1.l.a.P(new i.a.e1.h.f.b.f1(sources, i.a.e1.h.b.a.k(), true, Integer.MAX_VALUE));
    }

    private r0<T> e2(final long timeout, final TimeUnit unit, final q0 scheduler, final x0<? extends T> fallback) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.y0(this, timeout, unit, scheduler, fallback));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @SafeVarargs
    @i.a.e1.b.d
    public static <T> r0<T> f(@i.a.e1.b.f x0<? extends T>... sources) {
        Objects.requireNonNull(sources, "sources is null");
        if (sources.length == 0) {
            return o0(i.a.e1.h.f.g.l0.a());
        }
        if (sources.length == 1) {
            return w2(sources[0]);
        }
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.a(sources, null));
    }

    @i.a.e1.b.h("io.reactivex:computation")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static r0<Long> f2(long delay, @i.a.e1.b.f TimeUnit unit) {
        return g2(delay, unit, i.a.e1.n.b.a());
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public static <T> r0<T> g1() {
        return i.a.e1.l.a.S(i.a.e1.h.f.g.q0.b);
    }

    @i.a.e1.b.h("custom")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static r0<Long> g2(long delay, @i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f q0 scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return i.a.e1.l.a.S(new z0(delay, unit, scheduler));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> r0<T> o0(@i.a.e1.b.f i.a.e1.g.s<? extends Throwable> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.x(supplier));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> p(@i.a.e1.b.f x0<? extends T> source1, @i.a.e1.b.f x0<? extends T> source2) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        return s.W2(source1, source2).n1(i.a.e1.h.b.a.k(), false);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> r0<T> p0(@i.a.e1.b.f Throwable throwable) {
        Objects.requireNonNull(throwable, "throwable is null");
        return o0(i.a.e1.h.b.a.o(throwable));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> q(@i.a.e1.b.f x0<? extends T> source1, @i.a.e1.b.f x0<? extends T> source2, @i.a.e1.b.f x0<? extends T> source3) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        return s.W2(source1, source2, source3).n1(i.a.e1.h.b.a.k(), false);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> r(@i.a.e1.b.f x0<? extends T> source1, @i.a.e1.b.f x0<? extends T> source2, @i.a.e1.b.f x0<? extends T> source3, @i.a.e1.b.f x0<? extends T> source4) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        return s.W2(source1, source2, source3, source4).n1(i.a.e1.h.b.a.k(), false);
    }

    @i.a.e1.b.f
    private static <T> r0<T> r2(@i.a.e1.b.f s<T> source) {
        return i.a.e1.l.a.S(new w3(source, null));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> s(@i.a.e1.b.f Iterable<? extends x0<? extends T>> sources) {
        return s.c3(sources).n1(i.a.e1.h.b.a.k(), false);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> r0<T> s2(@i.a.e1.b.f x0<T> onSubscribe) {
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        if (!(onSubscribe instanceof r0)) {
            return i.a.e1.l.a.S(new i.a.e1.h.f.g.j0(onSubscribe));
        }
        throw new IllegalArgumentException("unsafeCreate(Single) should be upgraded");
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> t(@i.a.e1.b.f Publisher<? extends x0<? extends T>> sources) {
        return u(sources, 2);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> s<T> u(@i.a.e1.b.f Publisher<? extends x0<? extends T>> sources, int prefetch) {
        Objects.requireNonNull(sources, "sources is null");
        i.a.e1.h.b.b.b(prefetch, "prefetch");
        return i.a.e1.l.a.P(new i.a.e1.h.f.d.g(sources, i.a.e1.h.b.a.k(), i.a.e1.h.k.j.IMMEDIATE, prefetch));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T, U> r0<T> u2(@i.a.e1.b.f i.a.e1.g.s<U> resourceSupplier, @i.a.e1.b.f i.a.e1.g.o<? super U, ? extends x0<? extends T>> sourceSupplier, @i.a.e1.b.f i.a.e1.g.g<? super U> resourceCleanup) {
        return v2(resourceSupplier, sourceSupplier, resourceCleanup, true);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> i0<T> v(@i.a.e1.b.f n0<? extends x0<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return i.a.e1.l.a.R(new i.a.e1.h.f.d.s(sources, i.a.e1.h.b.a.k(), i.a.e1.h.k.j.IMMEDIATE, 2));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T, U> r0<T> v2(@i.a.e1.b.f i.a.e1.g.s<U> resourceSupplier, @i.a.e1.b.f i.a.e1.g.o<? super U, ? extends x0<? extends T>> sourceSupplier, @i.a.e1.b.f i.a.e1.g.g<? super U> resourceCleanup, boolean eager) {
        Objects.requireNonNull(resourceSupplier, "resourceSupplier is null");
        Objects.requireNonNull(sourceSupplier, "sourceSupplier is null");
        Objects.requireNonNull(resourceCleanup, "resourceCleanup is null");
        return i.a.e1.l.a.S(new d1(resourceSupplier, sourceSupplier, resourceCleanup, eager));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @SafeVarargs
    @i.a.e1.b.d
    public static <T> s<T> w(@i.a.e1.b.f x0<? extends T>... sources) {
        return s.W2(sources).n1(i.a.e1.h.b.a.k(), false);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> r0<T> w2(@i.a.e1.b.f x0<T> source) {
        Objects.requireNonNull(source, "source is null");
        if (source instanceof r0) {
            return i.a.e1.l.a.S((r0) source);
        }
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.j0(source));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @SafeVarargs
    @i.a.e1.b.d
    public static <T> s<T> x(@i.a.e1.b.f x0<? extends T>... sources) {
        return s.W2(sources).n1(i.a.e1.h.b.a.k(), true);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> r0<R> x2(@i.a.e1.b.f x0<? extends T1> source1, @i.a.e1.b.f x0<? extends T2> source2, @i.a.e1.b.f x0<? extends T3> source3, @i.a.e1.b.f x0<? extends T4> source4, @i.a.e1.b.f x0<? extends T5> source5, @i.a.e1.b.f x0<? extends T6> source6, @i.a.e1.b.f x0<? extends T7> source7, @i.a.e1.b.f x0<? extends T8> source8, @i.a.e1.b.f x0<? extends T9> source9, @i.a.e1.b.f i.a.e1.g.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> zipper) {
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
        return G2(i.a.e1.h.b.a.E(zipper), source1, source2, source3, source4, source5, source6, source7, source8, source9);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @SafeVarargs
    @i.a.e1.b.d
    public static <T> s<T> y(@i.a.e1.b.f x0<? extends T>... sources) {
        return s.W2(sources).Z0(i.a.e1.h.f.g.l0.c());
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> r0<R> y2(@i.a.e1.b.f x0<? extends T1> source1, @i.a.e1.b.f x0<? extends T2> source2, @i.a.e1.b.f x0<? extends T3> source3, @i.a.e1.b.f x0<? extends T4> source4, @i.a.e1.b.f x0<? extends T5> source5, @i.a.e1.b.f x0<? extends T6> source6, @i.a.e1.b.f x0<? extends T7> source7, @i.a.e1.b.f x0<? extends T8> source8, @i.a.e1.b.f i.a.e1.g.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(source6, "source6 is null");
        Objects.requireNonNull(source7, "source7 is null");
        Objects.requireNonNull(source8, "source8 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return G2(i.a.e1.h.b.a.D(zipper), source1, source2, source3, source4, source5, source6, source7, source8);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @SafeVarargs
    @i.a.e1.b.d
    public static <T> s<T> z(@i.a.e1.b.f x0<? extends T>... sources) {
        return s.W2(sources).b1(i.a.e1.h.f.g.l0.c(), true);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T1, T2, T3, T4, T5, T6, T7, R> r0<R> z2(@i.a.e1.b.f x0<? extends T1> source1, @i.a.e1.b.f x0<? extends T2> source2, @i.a.e1.b.f x0<? extends T3> source3, @i.a.e1.b.f x0<? extends T4> source4, @i.a.e1.b.f x0<? extends T5> source5, @i.a.e1.b.f x0<? extends T6> source6, @i.a.e1.b.f x0<? extends T7> source7, @i.a.e1.b.f i.a.e1.g.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(source6, "source6 is null");
        Objects.requireNonNull(source7, "source7 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return G2(i.a.e1.h.b.a.C(zipper), source1, source2, source3, source4, source5, source6, source7);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> s<R> A0(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends Stream<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return i.a.e1.l.a.P(new i.a.e1.h.d.e0(this, mapper));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> A1(@i.a.e1.b.f i.a.e1.g.o<? super s<Throwable>, ? extends Publisher<?>> handler) {
        return r2(n2().K5(handler));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> i0<R> B0(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends Stream<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return i.a.e1.l.a.R(new i.a.e1.h.d.f0(this, mapper));
    }

    @i.a.e1.b.h("none")
    public final void B1(@i.a.e1.b.f u0<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        d(new i.a.e1.h.e.d0(observer));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final s<T> D1(@i.a.e1.b.f p other) {
        Objects.requireNonNull(other, "other is null");
        return s.u0(j.A1(other).p1(), n2());
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final s<T> E1(@i.a.e1.b.f f0<T> other) {
        Objects.requireNonNull(other, "other is null");
        return s.u0(z.I2(other).A2(), n2());
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final s<T> F1(@i.a.e1.b.f x0<T> other) {
        Objects.requireNonNull(other, "other is null");
        return s.u0(w2(other).n2(), n2());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final s<T> G1(@i.a.e1.b.f Publisher<T> other) {
        Objects.requireNonNull(other, "other is null");
        return n2().w6(other);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final i0<T> H1(@i.a.e1.b.f n0<T> other) {
        Objects.requireNonNull(other, "other is null");
        return i0.h8(other).o1(q2());
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <U, R> r0<R> H2(@i.a.e1.b.f x0<U> other, @i.a.e1.b.f i.a.e1.g.c<? super T, ? super U, ? extends R> zipper) {
        return E2(this, other, zipper);
    }

    @i.a.e1.b.f
    @i.a.e1.b.h("none")
    public final i.a.e1.d.f I1() {
        return L1(i.a.e1.h.b.a.h(), i.a.e1.h.b.a.f26750f);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final i.a.e1.d.f J1(@i.a.e1.b.f i.a.e1.g.b<? super T, ? super Throwable> onCallback) {
        Objects.requireNonNull(onCallback, "onCallback is null");
        i.a.e1.h.e.d dVar = new i.a.e1.h.e.d(onCallback);
        d(dVar);
        return dVar;
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final i.a.e1.d.f K1(@i.a.e1.b.f i.a.e1.g.g<? super T> onSuccess) {
        return L1(onSuccess, i.a.e1.h.b.a.f26750f);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> r0<R> L(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends x0<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.y(this, mapper));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final r0<T> L0() {
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.k0(this));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final i.a.e1.d.f L1(@i.a.e1.b.f i.a.e1.g.g<? super T> onSuccess, @i.a.e1.b.f i.a.e1.g.g<? super Throwable> onError) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onError, "onError is null");
        i.a.e1.h.e.l lVar = new i.a.e1.h.e.l(onSuccess, onError);
        d(lVar);
        return lVar;
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final j M(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends p> mapper) {
        return u0(mapper);
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final j M0() {
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.v(this));
    }

    public abstract void M1(@i.a.e1.b.f u0<? super T> observer);

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> z<R> N(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends f0<? extends R>> mapper) {
        return v0(mapper);
    }

    @i.a.e1.b.h("custom")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> N1(@i.a.e1.b.f q0 scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.v0(this, scheduler));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final s<T> O(@i.a.e1.b.f x0<? extends T> other) {
        return p(this, other);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> r0<R> O0(@i.a.e1.b.f w0<? extends R, ? super T> lift) {
        Objects.requireNonNull(lift, "lift is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.n0(this, lift));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <E extends u0<? super T>> E O1(E observer) {
        d(observer);
        return observer;
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<Boolean> P(@i.a.e1.b.f Object item) {
        return Q(item, i.a.e1.h.b.b.a());
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> r0<R> P0(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends R> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.o0(this, mapper));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<Boolean> Q(@i.a.e1.b.f Object item, @i.a.e1.b.f i.a.e1.g.d<Object, Object> comparer) {
        Objects.requireNonNull(item, "item is null");
        Objects.requireNonNull(comparer, "comparer is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.c(this, item, comparer));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> z<R> Q0(@i.a.e1.b.f i.a.e1.g.o<? super T, Optional<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.d.h0(this, mapper));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final r0<h0<T>> R0() {
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.p0(this));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> R1(@i.a.e1.b.f p other) {
        Objects.requireNonNull(other, "other is null");
        return T1(new i.a.e1.h.f.a.q0(other));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <E> r0<T> S1(@i.a.e1.b.f x0<? extends E> other) {
        Objects.requireNonNull(other, "other is null");
        return T1(new a1(other));
    }

    @i.a.e1.b.h("io.reactivex:computation")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> T(long time, @i.a.e1.b.f TimeUnit unit) {
        return V(time, unit, i.a.e1.n.b.a(), false);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <E> r0<T> T1(@i.a.e1.b.f Publisher<E> other) {
        Objects.requireNonNull(other, "other is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.w0(this, other));
    }

    @i.a.e1.b.h("custom")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> U(long time, @i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f q0 scheduler) {
        return V(time, unit, scheduler, false);
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final i.a.e1.j.n<T> U1() {
        i.a.e1.j.n<T> nVar = new i.a.e1.j.n<>();
        d(nVar);
        return nVar;
    }

    @i.a.e1.b.h("custom")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> V(long time, @i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f q0 scheduler, boolean delayError) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.f(this, time, unit, scheduler, delayError));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final i.a.e1.j.n<T> V1(boolean dispose) {
        i.a.e1.j.n<T> nVar = new i.a.e1.j.n<>();
        if (dispose) {
            nVar.dispose();
        }
        d(nVar);
        return nVar;
    }

    @i.a.e1.b.h("io.reactivex:computation")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> W(long time, @i.a.e1.b.f TimeUnit unit, boolean delayError) {
        return V(time, unit, i.a.e1.n.b.a(), delayError);
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("io.reactivex:computation")
    public final r0<i.a.e1.n.d<T>> W1() {
        return Z1(TimeUnit.MILLISECONDS, i.a.e1.n.b.a());
    }

    @i.a.e1.b.h("io.reactivex:computation")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> X(long time, @i.a.e1.b.f TimeUnit unit) {
        return Y(time, unit, i.a.e1.n.b.a());
    }

    @i.a.e1.b.h("custom")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<i.a.e1.n.d<T>> X1(@i.a.e1.b.f q0 scheduler) {
        return Z1(TimeUnit.MILLISECONDS, scheduler);
    }

    @i.a.e1.b.h("custom")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> Y(long time, @i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f q0 scheduler) {
        return a0(i0.k7(time, unit, scheduler));
    }

    @i.a.e1.b.h("io.reactivex:computation")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<i.a.e1.n.d<T>> Y1(@i.a.e1.b.f TimeUnit unit) {
        return Z1(unit, i.a.e1.n.b.a());
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> Z(@i.a.e1.b.f p subscriptionIndicator) {
        Objects.requireNonNull(subscriptionIndicator, "subscriptionIndicator is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.g(this, subscriptionIndicator));
    }

    @i.a.e1.b.h("custom")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<i.a.e1.n.d<T>> Z1(@i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f q0 scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.x0(this, unit, scheduler, true));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <U> r0<T> a0(@i.a.e1.b.f n0<U> subscriptionIndicator) {
        Objects.requireNonNull(subscriptionIndicator, "subscriptionIndicator is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.h(this, subscriptionIndicator));
    }

    @i.a.e1.b.h("io.reactivex:computation")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> a2(long timeout, @i.a.e1.b.f TimeUnit unit) {
        return e2(timeout, unit, i.a.e1.n.b.a(), null);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <U> r0<T> b0(@i.a.e1.b.f x0<U> subscriptionIndicator) {
        Objects.requireNonNull(subscriptionIndicator, "subscriptionIndicator is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.j(this, subscriptionIndicator));
    }

    @i.a.e1.b.h("custom")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> b2(long timeout, @i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f q0 scheduler) {
        return e2(timeout, unit, scheduler, null);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <U> r0<T> c0(@i.a.e1.b.f Publisher<U> subscriptionIndicator) {
        Objects.requireNonNull(subscriptionIndicator, "subscriptionIndicator is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.i(this, subscriptionIndicator));
    }

    @i.a.e1.b.h("custom")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> c2(long timeout, @i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f q0 scheduler, @i.a.e1.b.f x0<? extends T> fallback) {
        Objects.requireNonNull(fallback, "fallback is null");
        return e2(timeout, unit, scheduler, fallback);
    }

    @Override // i.a.e1.c.x0
    @i.a.e1.b.h("none")
    public final void d(@i.a.e1.b.f u0<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        u0<? super T> g0 = i.a.e1.l.a.g0(this, observer);
        Objects.requireNonNull(g0, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            M1(g0);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            i.a.e1.e.b.b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> z<R> d0(@i.a.e1.b.f i.a.e1.g.o<? super T, h0<R>> selector) {
        Objects.requireNonNull(selector, "selector is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.g.k(this, selector));
    }

    @i.a.e1.b.h("io.reactivex:computation")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> d2(long timeout, @i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f x0<? extends T> fallback) {
        Objects.requireNonNull(fallback, "fallback is null");
        return e2(timeout, unit, i.a.e1.n.b.a(), fallback);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> e0(@i.a.e1.b.f i.a.e1.g.g<? super T> onAfterSuccess) {
        Objects.requireNonNull(onAfterSuccess, "onAfterSuccess is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.m(this, onAfterSuccess));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> f0(@i.a.e1.b.f i.a.e1.g.a onAfterTerminate) {
        Objects.requireNonNull(onAfterTerminate, "onAfterTerminate is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.n(this, onAfterTerminate));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final s<T> f1(@i.a.e1.b.f x0<? extends T> other) {
        return S0(this, other);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> g(@i.a.e1.b.f x0<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return f(this, other);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> g0(@i.a.e1.b.f i.a.e1.g.a onFinally) {
        Objects.requireNonNull(onFinally, "onFinally is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.o(this, onFinally));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final T h() {
        i.a.e1.h.e.i iVar = new i.a.e1.h.e.i();
        d(iVar);
        return (T) iVar.c();
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> h0(@i.a.e1.b.f i.a.e1.g.a onDispose) {
        Objects.requireNonNull(onDispose, "onDispose is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.p(this, onDispose));
    }

    @i.a.e1.b.h("custom")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> h1(@i.a.e1.b.f q0 scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.r0(this, scheduler));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("io.reactivex:computation")
    public final r0<i.a.e1.n.d<T>> h2() {
        return k2(TimeUnit.MILLISECONDS, i.a.e1.n.b.a());
    }

    @i.a.e1.b.h("none")
    public final void i() {
        l(i.a.e1.h.b.a.h(), i.a.e1.h.b.a.f26749e);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> i0(@i.a.e1.b.f i.a.e1.g.g<? super Throwable> onError) {
        Objects.requireNonNull(onError, "onError is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.q(this, onError));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <U> z<U> i1(@i.a.e1.b.f Class<U> clazz) {
        Objects.requireNonNull(clazz, "clazz is null");
        return q0(i.a.e1.h.b.a.l(clazz)).o(clazz);
    }

    @i.a.e1.b.h("custom")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<i.a.e1.n.d<T>> i2(@i.a.e1.b.f q0 scheduler) {
        return k2(TimeUnit.MILLISECONDS, scheduler);
    }

    @i.a.e1.b.h("none")
    public final void j(@i.a.e1.b.f u0<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        i.a.e1.h.e.f fVar = new i.a.e1.h.e.f();
        observer.onSubscribe(fVar);
        d(fVar);
        fVar.c(observer);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> j0(@i.a.e1.b.f i.a.e1.g.b<? super T, ? super Throwable> onEvent) {
        Objects.requireNonNull(onEvent, "onEvent is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.r(this, onEvent));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final z<T> j1() {
        return k1(i.a.e1.h.b.a.c());
    }

    @i.a.e1.b.h("io.reactivex:computation")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<i.a.e1.n.d<T>> j2(@i.a.e1.b.f TimeUnit unit) {
        return k2(unit, i.a.e1.n.b.a());
    }

    @i.a.e1.b.h("none")
    public final void k(@i.a.e1.b.f i.a.e1.g.g<? super T> onSuccess) {
        l(onSuccess, i.a.e1.h.b.a.f26749e);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> k0(@i.a.e1.b.f i.a.e1.g.g<? super i.a.e1.d.f> onSubscribe, @i.a.e1.b.f i.a.e1.g.a onDispose) {
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        Objects.requireNonNull(onDispose, "onDispose is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.s(this, onSubscribe, onDispose));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> k1(@i.a.e1.b.f i.a.e1.g.r<? super Throwable> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.g.s0(this, predicate));
    }

    @i.a.e1.b.h("custom")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<i.a.e1.n.d<T>> k2(@i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f q0 scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.x0(this, unit, scheduler, false));
    }

    @i.a.e1.b.h("none")
    public final void l(@i.a.e1.b.f i.a.e1.g.g<? super T> onSuccess, @i.a.e1.b.f i.a.e1.g.g<? super Throwable> onError) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onError, "onError is null");
        i.a.e1.h.e.i iVar = new i.a.e1.h.e.i();
        d(iVar);
        iVar.b(onSuccess, onError, i.a.e1.h.b.a.c);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> l0(@i.a.e1.b.f i.a.e1.g.g<? super i.a.e1.d.f> onSubscribe) {
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.t(this, onSubscribe));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> l1(@i.a.e1.b.f i.a.e1.g.o<? super Throwable, ? extends x0<? extends T>> fallbackSupplier) {
        Objects.requireNonNull(fallbackSupplier, "fallbackSupplier is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.u0(this, fallbackSupplier));
    }

    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final <R> R l2(@i.a.e1.b.f s0<T, ? extends R> converter) {
        Objects.requireNonNull(converter, "converter is null");
        return converter.a(this);
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final r0<T> m() {
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.b(this));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> m0(@i.a.e1.b.f i.a.e1.g.g<? super T> onSuccess) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.u(this, onSuccess));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> m1(@i.a.e1.b.f x0<? extends T> fallback) {
        Objects.requireNonNull(fallback, "fallback is null");
        return l1(i.a.e1.h.b.a.n(fallback));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final CompletionStage<T> m2() {
        return (CompletionStage) O1(new i.a.e1.h.d.b(false, null));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <U> r0<U> n(@i.a.e1.b.f Class<? extends U> clazz) {
        Objects.requireNonNull(clazz, "clazz is null");
        return (r0<U>) P0(i.a.e1.h.b.a.e(clazz));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> n0(@i.a.e1.b.f i.a.e1.g.a onTerminate) {
        Objects.requireNonNull(onTerminate, "onTerminate is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.v(this, onTerminate));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> n1(@i.a.e1.b.f i.a.e1.g.o<Throwable, ? extends T> itemSupplier) {
        Objects.requireNonNull(itemSupplier, "itemSupplier is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.t0(this, itemSupplier, null));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final s<T> n2() {
        if (this instanceof i.a.e1.h.c.d) {
            return ((i.a.e1.h.c.d) this).c();
        }
        return i.a.e1.l.a.P(new a1(this));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> r0<R> o(@i.a.e1.b.f y0<? super T, ? extends R> transformer) {
        Objects.requireNonNull(transformer, "transformer is null");
        return w2(transformer.a(this));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> o1(@i.a.e1.b.f T item) {
        Objects.requireNonNull(item, "item is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.t0(this, null, item));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final Future<T> o2() {
        return (Future) O1(new i.a.e1.h.e.r());
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final r0<T> p1() {
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.l(this));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final z<T> p2() {
        if (this instanceof i.a.e1.h.c.e) {
            return ((i.a.e1.h.c.e) this).b();
        }
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.o0(this));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final z<T> q0(@i.a.e1.b.f i.a.e1.g.r<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.b0(this, predicate));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final s<T> q1() {
        return n2().i5();
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final i0<T> q2() {
        if (this instanceof i.a.e1.h.c.f) {
            return ((i.a.e1.h.c.f) this).a();
        }
        return i.a.e1.l.a.R(new b1(this));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> r0<R> r0(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends x0<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.y(this, mapper));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final s<T> r1(long times) {
        return n2().j5(times);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <U, R> r0<R> s0(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends x0<? extends U>> mapper, @i.a.e1.b.f i.a.e1.g.c<? super T, ? super U, ? extends R> combiner) {
        Objects.requireNonNull(mapper, "mapper is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.z(this, mapper, combiner));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final s<T> s1(@i.a.e1.b.f i.a.e1.g.e stop) {
        return n2().k5(stop);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> r0<R> t0(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends x0<? extends R>> onSuccessMapper, @i.a.e1.b.f i.a.e1.g.o<? super Throwable, ? extends x0<? extends R>> onErrorMapper) {
        Objects.requireNonNull(onSuccessMapper, "onSuccessMapper is null");
        Objects.requireNonNull(onErrorMapper, "onErrorMapper is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.e0(this, onSuccessMapper, onErrorMapper));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final s<T> t1(@i.a.e1.b.f i.a.e1.g.o<? super s<Object>, ? extends Publisher<?>> handler) {
        return n2().l5(handler);
    }

    @i.a.e1.b.h("custom")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> t2(@i.a.e1.b.f q0 scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return i.a.e1.l.a.S(new c1(this, scheduler));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final j u0(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends p> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.g.a0(this, mapper));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final r0<T> u1() {
        return r2(n2().E5());
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> z<R> v0(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends f0<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.g.d0(this, mapper));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> v1(long times) {
        return r2(n2().F5(times));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> i0<R> w0(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends n0<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return i.a.e1.l.a.R(new i.a.e1.h.f.d.x(this, mapper));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> w1(long times, @i.a.e1.b.f i.a.e1.g.r<? super Throwable> predicate) {
        return r2(n2().G5(times, predicate));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <R> s<R> x0(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return i.a.e1.l.a.P(new i.a.e1.h.f.g.f0(this, mapper));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> x1(@i.a.e1.b.f i.a.e1.g.d<? super Integer, ? super Throwable> predicate) {
        return r2(n2().H5(predicate));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <U> s<U> y0(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends Iterable<? extends U>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return i.a.e1.l.a.P(new i.a.e1.h.f.g.b0(this, mapper));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> y1(@i.a.e1.b.f i.a.e1.g.r<? super Throwable> predicate) {
        return r2(n2().I5(predicate));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <U> i0<U> z0(@i.a.e1.b.f i.a.e1.g.o<? super T, ? extends Iterable<? extends U>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return i.a.e1.l.a.R(new i.a.e1.h.f.g.c0(this, mapper));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final r0<T> z1(@i.a.e1.b.f i.a.e1.g.e stop) {
        Objects.requireNonNull(stop, "stop is null");
        return w1(Long.MAX_VALUE, i.a.e1.h.b.a.v(stop));
    }
}
