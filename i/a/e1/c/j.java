package i.a.e1.c;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Publisher;

/* compiled from: Completable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class j implements p {
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static j A(@i.a.e1.b.f Iterable<? extends p> sources) {
        return s.c3(sources).T0(i.a.e1.h.b.a.k());
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public static j A1(@i.a.e1.b.f p source) {
        Objects.requireNonNull(source, "source is null");
        if (source instanceof j) {
            return i.a.e1.l.a.O((j) source);
        }
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.x(source));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static j B(@i.a.e1.b.f Publisher<? extends p> sources) {
        return C(sources, 2);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static j C(@i.a.e1.b.f Publisher<? extends p> sources, int prefetch) {
        return s.g3(sources).V0(i.a.e1.h.b.a.k(), true, prefetch);
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public static j E(@i.a.e1.b.f n source) {
        Objects.requireNonNull(source, "source is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.g(source));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static j F(@i.a.e1.b.f i.a.e1.g.s<? extends p> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.h(supplier));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static r0<Boolean> P0(@i.a.e1.b.f p source1, @i.a.e1.b.f p source2) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        return p0(source1, source2).l(r0.N0(Boolean.TRUE));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    private j S(final i.a.e1.g.g<? super i.a.e1.d.f> onSubscribe, final i.a.e1.g.g<? super Throwable> onError, final i.a.e1.g.a onComplete, final i.a.e1.g.a onTerminate, final i.a.e1.g.a onAfterTerminate, final i.a.e1.g.a onDispose) {
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        Objects.requireNonNull(onError, "onError is null");
        Objects.requireNonNull(onComplete, "onComplete is null");
        Objects.requireNonNull(onTerminate, "onTerminate is null");
        Objects.requireNonNull(onAfterTerminate, "onAfterTerminate is null");
        Objects.requireNonNull(onDispose, "onDispose is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.k0(this, onSubscribe, onError, onComplete, onTerminate, onAfterTerminate, onDispose));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static j V(@i.a.e1.b.f i.a.e1.g.s<? extends Throwable> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.p(supplier));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public static j W(@i.a.e1.b.f Throwable throwable) {
        Objects.requireNonNull(throwable, "throwable is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.o(throwable));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public static j X(@i.a.e1.b.f i.a.e1.g.a action) {
        Objects.requireNonNull(action, "action is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.q(action));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static j Y(@i.a.e1.b.f Callable<?> callable) {
        Objects.requireNonNull(callable, "callable is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.r(callable));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static j Z(@i.a.e1.b.f CompletionStage<?> stage) {
        Objects.requireNonNull(stage, "stage is null");
        return i.a.e1.l.a.O(new i.a.e1.h.d.a(stage));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static j a0(@i.a.e1.b.f Future<?> future) {
        Objects.requireNonNull(future, "future is null");
        return X(i.a.e1.h.b.a.j(future));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> j b0(@i.a.e1.b.f f0<T> maybe) {
        Objects.requireNonNull(maybe, "maybe is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.c.s0(maybe));
    }

    @i.a.e1.b.b(i.a.e1.b.a.UNBOUNDED_IN)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static j b1(@i.a.e1.b.f Publisher<? extends p> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.d.i(sources, i.a.e1.h.b.a.k(), false));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> j c0(@i.a.e1.b.f n0<T> observable) {
        Objects.requireNonNull(observable, "observable is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.s(observable));
    }

    @i.a.e1.b.b(i.a.e1.b.a.UNBOUNDED_IN)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static j c1(@i.a.e1.b.f Publisher<? extends p> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.d.i(sources, i.a.e1.h.b.a.k(), true));
    }

    @i.a.e1.b.b(i.a.e1.b.a.UNBOUNDED_IN)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> j d0(@i.a.e1.b.f Publisher<T> publisher) {
        Objects.requireNonNull(publisher, "publisher is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.t(publisher));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static j e(@i.a.e1.b.f Iterable<? extends p> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.a(null, sources));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public static j e0(@i.a.e1.b.f Runnable run) {
        Objects.requireNonNull(run, "run is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.u(run));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @SafeVarargs
    @i.a.e1.b.d
    public static j f(@i.a.e1.b.f p... sources) {
        Objects.requireNonNull(sources, "sources is null");
        if (sources.length == 0) {
            return t();
        }
        if (sources.length == 1) {
            return A1(sources[0]);
        }
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.a(sources, null));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> j f0(@i.a.e1.b.f x0<T> single) {
        Objects.requireNonNull(single, "single is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.v(single));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static j g0(@i.a.e1.b.f i.a.e1.g.s<?> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.w(supplier));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static j k0(@i.a.e1.b.f Iterable<? extends p> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.f0(sources));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("custom")
    private j k1(long timeout, TimeUnit unit, q0 scheduler, p fallback) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.o0(this, timeout, unit, scheduler, fallback));
    }

    @i.a.e1.b.b(i.a.e1.b.a.UNBOUNDED_IN)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static j l0(@i.a.e1.b.f Publisher<? extends p> sources) {
        return n0(sources, Integer.MAX_VALUE, false);
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("io.reactivex:computation")
    public static j l1(long delay, @i.a.e1.b.f TimeUnit unit) {
        return m1(delay, unit, i.a.e1.n.b.a());
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static j m0(@i.a.e1.b.f Publisher<? extends p> sources, int maxConcurrency) {
        return n0(sources, maxConcurrency, false);
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("custom")
    public static j m1(long delay, @i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f q0 scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.p0(delay, unit, scheduler));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    private static j n0(@i.a.e1.b.f Publisher<? extends p> sources, int maxConcurrency, boolean delayErrors) {
        Objects.requireNonNull(sources, "sources is null");
        i.a.e1.h.b.b.b(maxConcurrency, "maxConcurrency");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.b0(sources, maxConcurrency, delayErrors));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @SafeVarargs
    @i.a.e1.b.d
    public static j o0(@i.a.e1.b.f p... sources) {
        Objects.requireNonNull(sources, "sources is null");
        if (sources.length == 0) {
            return t();
        }
        if (sources.length == 1) {
            return A1(sources[0]);
        }
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.c0(sources));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @SafeVarargs
    @i.a.e1.b.d
    public static j p0(@i.a.e1.b.f p... sources) {
        Objects.requireNonNull(sources, "sources is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.d0(sources));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static j q0(@i.a.e1.b.f Iterable<? extends p> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.e0(sources));
    }

    @i.a.e1.b.b(i.a.e1.b.a.UNBOUNDED_IN)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static j r0(@i.a.e1.b.f Publisher<? extends p> sources) {
        return n0(sources, Integer.MAX_VALUE, true);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static j s0(@i.a.e1.b.f Publisher<? extends p> sources, int maxConcurrency) {
        return n0(sources, maxConcurrency, true);
    }

    private static NullPointerException s1(Throwable ex) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(ex);
        return nullPointerException;
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public static j t() {
        return i.a.e1.l.a.O(i.a.e1.h.f.a.n.b);
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public static j u0() {
        return i.a.e1.l.a.O(i.a.e1.h.f.a.g0.b);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static j v(@i.a.e1.b.f Iterable<? extends p> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.f(sources));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static j w(@i.a.e1.b.f Publisher<? extends p> sources) {
        return x(sources, 2);
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public static j w1(@i.a.e1.b.f p onSubscribe) {
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        if (!(onSubscribe instanceof j)) {
            return i.a.e1.l.a.O(new i.a.e1.h.f.a.x(onSubscribe));
        }
        throw new IllegalArgumentException("Use of unsafeCreate(Completable)!");
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static j x(@i.a.e1.b.f Publisher<? extends p> sources, int prefetch) {
        Objects.requireNonNull(sources, "sources is null");
        i.a.e1.h.b.b.b(prefetch, "prefetch");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.d(sources, prefetch));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @SafeVarargs
    @i.a.e1.b.d
    public static j y(@i.a.e1.b.f p... sources) {
        Objects.requireNonNull(sources, "sources is null");
        if (sources.length == 0) {
            return t();
        }
        if (sources.length == 1) {
            return A1(sources[0]);
        }
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.e(sources));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <R> j y1(@i.a.e1.b.f i.a.e1.g.s<R> resourceSupplier, @i.a.e1.b.f i.a.e1.g.o<? super R, ? extends p> sourceSupplier, @i.a.e1.b.f i.a.e1.g.g<? super R> resourceCleanup) {
        return z1(resourceSupplier, sourceSupplier, resourceCleanup, true);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @SafeVarargs
    @i.a.e1.b.d
    public static j z(@i.a.e1.b.f p... sources) {
        return s.W2(sources).V0(i.a.e1.h.b.a.k(), true, 2);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <R> j z1(@i.a.e1.b.f i.a.e1.g.s<R> resourceSupplier, @i.a.e1.b.f i.a.e1.g.o<? super R, ? extends p> sourceSupplier, @i.a.e1.b.f i.a.e1.g.g<? super R> resourceCleanup, boolean eager) {
        Objects.requireNonNull(resourceSupplier, "resourceSupplier is null");
        Objects.requireNonNull(sourceSupplier, "sourceSupplier is null");
        Objects.requireNonNull(resourceCleanup, "resourceCleanup is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.t0(resourceSupplier, sourceSupplier, resourceCleanup, eager));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <T> z<T> A0(@i.a.e1.b.f i.a.e1.g.o<? super Throwable, ? extends T> itemSupplier) {
        Objects.requireNonNull(itemSupplier, "itemSupplier is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.a.j0(this, itemSupplier));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <T> z<T> B0(@i.a.e1.b.f T item) {
        Objects.requireNonNull(item, "item is null");
        return A0(i.a.e1.h.b.a.n(item));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final j C0() {
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.j(this));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final j D(@i.a.e1.b.f p other) {
        Objects.requireNonNull(other, "other is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.b(this, other));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final j D0() {
        return d0(p1().i5());
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final j E0(long times) {
        return d0(p1().j5(times));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final j F0(@i.a.e1.b.f i.a.e1.g.e stop) {
        return d0(p1().k5(stop));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("io.reactivex:computation")
    public final j G(long time, @i.a.e1.b.f TimeUnit unit) {
        return I(time, unit, i.a.e1.n.b.a(), false);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final j G0(@i.a.e1.b.f i.a.e1.g.o<? super s<Object>, ? extends Publisher<?>> handler) {
        return d0(p1().l5(handler));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("custom")
    public final j H(long time, @i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f q0 scheduler) {
        return I(time, unit, scheduler, false);
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final j H0() {
        return d0(p1().E5());
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("custom")
    public final j I(long time, @i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f q0 scheduler, boolean delayError) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.i(this, time, unit, scheduler, delayError));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final j I0(long times) {
        return d0(p1().F5(times));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("io.reactivex:computation")
    public final j J(long time, @i.a.e1.b.f TimeUnit unit) {
        return K(time, unit, i.a.e1.n.b.a());
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final j J0(long times, @i.a.e1.b.f i.a.e1.g.r<? super Throwable> predicate) {
        return d0(p1().G5(times, predicate));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("custom")
    public final j K(long time, @i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f q0 scheduler) {
        return m1(time, unit, scheduler).h(this);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final j K0(@i.a.e1.b.f i.a.e1.g.d<? super Integer, ? super Throwable> predicate) {
        return d0(p1().H5(predicate));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final j L(@i.a.e1.b.f i.a.e1.g.a onAfterTerminate) {
        i.a.e1.g.g<? super i.a.e1.d.f> h2 = i.a.e1.h.b.a.h();
        i.a.e1.g.g<? super Throwable> h3 = i.a.e1.h.b.a.h();
        i.a.e1.g.a aVar = i.a.e1.h.b.a.c;
        return S(h2, h3, aVar, aVar, onAfterTerminate, aVar);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final j L0(@i.a.e1.b.f i.a.e1.g.r<? super Throwable> predicate) {
        return d0(p1().I5(predicate));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final j M(@i.a.e1.b.f i.a.e1.g.a onFinally) {
        Objects.requireNonNull(onFinally, "onFinally is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.l(this, onFinally));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final j M0(@i.a.e1.b.f i.a.e1.g.e stop) {
        Objects.requireNonNull(stop, "stop is null");
        return J0(Long.MAX_VALUE, i.a.e1.h.b.a.v(stop));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final j N(@i.a.e1.b.f i.a.e1.g.a onComplete) {
        i.a.e1.g.g<? super i.a.e1.d.f> h2 = i.a.e1.h.b.a.h();
        i.a.e1.g.g<? super Throwable> h3 = i.a.e1.h.b.a.h();
        i.a.e1.g.a aVar = i.a.e1.h.b.a.c;
        return S(h2, h3, onComplete, aVar, aVar, aVar);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final j N0(@i.a.e1.b.f i.a.e1.g.o<? super s<Throwable>, ? extends Publisher<?>> handler) {
        return d0(p1().K5(handler));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final j O(@i.a.e1.b.f i.a.e1.g.a onDispose) {
        i.a.e1.g.g<? super i.a.e1.d.f> h2 = i.a.e1.h.b.a.h();
        i.a.e1.g.g<? super Throwable> h3 = i.a.e1.h.b.a.h();
        i.a.e1.g.a aVar = i.a.e1.h.b.a.c;
        return S(h2, h3, aVar, aVar, aVar, onDispose);
    }

    @i.a.e1.b.h("none")
    public final void O0(@i.a.e1.b.f m observer) {
        Objects.requireNonNull(observer, "observer is null");
        d(new i.a.e1.h.e.b0(observer));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final j P(@i.a.e1.b.f i.a.e1.g.g<? super Throwable> onError) {
        i.a.e1.g.g<? super i.a.e1.d.f> h2 = i.a.e1.h.b.a.h();
        i.a.e1.g.a aVar = i.a.e1.h.b.a.c;
        return S(h2, onError, aVar, aVar, aVar, aVar);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final j Q(@i.a.e1.b.f i.a.e1.g.g<? super Throwable> onEvent) {
        Objects.requireNonNull(onEvent, "onEvent is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.m(this, onEvent));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final j Q0(@i.a.e1.b.f p other) {
        Objects.requireNonNull(other, "other is null");
        return y(other, this);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final j R(@i.a.e1.b.f i.a.e1.g.g<? super i.a.e1.d.f> onSubscribe, @i.a.e1.b.f i.a.e1.g.a onDispose) {
        i.a.e1.g.g<? super Throwable> h2 = i.a.e1.h.b.a.h();
        i.a.e1.g.a aVar = i.a.e1.h.b.a.c;
        return S(onSubscribe, h2, aVar, aVar, aVar, onDispose);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <T> s<T> R0(@i.a.e1.b.f f0<T> other) {
        Objects.requireNonNull(other, "other is null");
        return s.u0(z.I2(other).A2(), p1());
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <T> s<T> S0(@i.a.e1.b.f x0<T> other) {
        Objects.requireNonNull(other, "other is null");
        return s.u0(r0.w2(other).n2(), p1());
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final j T(@i.a.e1.b.f i.a.e1.g.g<? super i.a.e1.d.f> onSubscribe) {
        i.a.e1.g.g<? super Throwable> h2 = i.a.e1.h.b.a.h();
        i.a.e1.g.a aVar = i.a.e1.h.b.a.c;
        return S(onSubscribe, h2, aVar, aVar, aVar, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <T> s<T> T0(@i.a.e1.b.f Publisher<T> other) {
        Objects.requireNonNull(other, "other is null");
        return p1().w6(other);
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final j U(@i.a.e1.b.f i.a.e1.g.a onTerminate) {
        i.a.e1.g.g<? super i.a.e1.d.f> h2 = i.a.e1.h.b.a.h();
        i.a.e1.g.g<? super Throwable> h3 = i.a.e1.h.b.a.h();
        i.a.e1.g.a aVar = i.a.e1.h.b.a.c;
        return S(h2, h3, aVar, onTerminate, aVar, aVar);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <T> i0<T> U0(@i.a.e1.b.f n0<T> other) {
        Objects.requireNonNull(other, "other is null");
        return i0.h8(other).o1(t1());
    }

    @i.a.e1.b.f
    @i.a.e1.b.h("none")
    public final i.a.e1.d.f V0() {
        i.a.e1.h.e.p pVar = new i.a.e1.h.e.p();
        d(pVar);
        return pVar;
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final i.a.e1.d.f W0(@i.a.e1.b.f i.a.e1.g.a onComplete) {
        Objects.requireNonNull(onComplete, "onComplete is null");
        i.a.e1.h.e.k kVar = new i.a.e1.h.e.k(onComplete);
        d(kVar);
        return kVar;
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final i.a.e1.d.f X0(@i.a.e1.b.f i.a.e1.g.a onComplete, @i.a.e1.b.f i.a.e1.g.g<? super Throwable> onError) {
        Objects.requireNonNull(onError, "onError is null");
        Objects.requireNonNull(onComplete, "onComplete is null");
        i.a.e1.h.e.k kVar = new i.a.e1.h.e.k(onError, onComplete);
        d(kVar);
        return kVar;
    }

    public abstract void Y0(@i.a.e1.b.f m observer);

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("custom")
    public final j Z0(@i.a.e1.b.f q0 scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.m0(this, scheduler));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <E extends m> E a1(E observer) {
        d(observer);
        return observer;
    }

    @Override // i.a.e1.c.p
    @i.a.e1.b.h("none")
    public final void d(@i.a.e1.b.f m observer) {
        Objects.requireNonNull(observer, "observer is null");
        try {
            m d0 = i.a.e1.l.a.d0(this, observer);
            Objects.requireNonNull(d0, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            Y0(d0);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            i.a.e1.e.b.b(th);
            i.a.e1.l.a.Y(th);
            throw s1(th);
        }
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final j d1(@i.a.e1.b.f p other) {
        Objects.requireNonNull(other, "other is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.n0(this, other));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final i.a.e1.j.n<Void> e1() {
        i.a.e1.j.n<Void> nVar = new i.a.e1.j.n<>();
        d(nVar);
        return nVar;
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final i.a.e1.j.n<Void> f1(boolean dispose) {
        i.a.e1.j.n<Void> nVar = new i.a.e1.j.n<>();
        if (dispose) {
            nVar.dispose();
        }
        d(nVar);
        return nVar;
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final j g(@i.a.e1.b.f p other) {
        Objects.requireNonNull(other, "other is null");
        return f(this, other);
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("io.reactivex:computation")
    public final j g1(long timeout, @i.a.e1.b.f TimeUnit unit) {
        return k1(timeout, unit, i.a.e1.n.b.a(), null);
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final j h(@i.a.e1.b.f p next) {
        Objects.requireNonNull(next, "next is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.b(this, next));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final j h0() {
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.y(this));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("io.reactivex:computation")
    public final j h1(long timeout, @i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f p fallback) {
        Objects.requireNonNull(fallback, "fallback is null");
        return k1(timeout, unit, i.a.e1.n.b.a(), fallback);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <T> s<T> i(@i.a.e1.b.f Publisher<T> next) {
        Objects.requireNonNull(next, "next is null");
        return i.a.e1.l.a.P(new i.a.e1.h.f.d.b(this, next));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final j i0(@i.a.e1.b.f o onLift) {
        Objects.requireNonNull(onLift, "onLift is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.z(this, onLift));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("custom")
    public final j i1(long timeout, @i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f q0 scheduler) {
        return k1(timeout, unit, scheduler, null);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <T> z<T> j(@i.a.e1.b.f f0<T> next) {
        Objects.requireNonNull(next, "next is null");
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.o(next, this));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final <T> r0<h0<T>> j0() {
        return i.a.e1.l.a.S(new i.a.e1.h.f.a.a0(this));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("custom")
    public final j j1(long timeout, @i.a.e1.b.f TimeUnit unit, @i.a.e1.b.f q0 scheduler, @i.a.e1.b.f p fallback) {
        Objects.requireNonNull(fallback, "fallback is null");
        return k1(timeout, unit, scheduler, fallback);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <T> i0<T> k(@i.a.e1.b.f n0<T> next) {
        Objects.requireNonNull(next, "next is null");
        return i.a.e1.l.a.R(new i.a.e1.h.f.d.a(this, next));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <T> r0<T> l(@i.a.e1.b.f x0<T> next) {
        Objects.requireNonNull(next, "next is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.g.g(next, this));
    }

    @i.a.e1.b.h("none")
    public final void m() {
        i.a.e1.h.e.i iVar = new i.a.e1.h.e.i();
        d(iVar);
        iVar.c();
    }

    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final boolean n(long timeout, @i.a.e1.b.f TimeUnit unit) {
        Objects.requireNonNull(unit, "unit is null");
        i.a.e1.h.e.i iVar = new i.a.e1.h.e.i();
        d(iVar);
        return iVar.a(timeout, unit);
    }

    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final <R> R n1(@i.a.e1.b.f k<? extends R> converter) {
        Objects.requireNonNull(converter, "converter is null");
        return converter.a(this);
    }

    @i.a.e1.b.h("none")
    public final void o() {
        r(i.a.e1.h.b.a.c, i.a.e1.h.b.a.f26749e);
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <T> CompletionStage<T> o1(@i.a.e1.b.g T defaultItem) {
        return (CompletionStage) a1(new i.a.e1.h.d.b(true, defaultItem));
    }

    @i.a.e1.b.h("none")
    public final void p(@i.a.e1.b.f m observer) {
        Objects.requireNonNull(observer, "observer is null");
        i.a.e1.h.e.f fVar = new i.a.e1.h.e.f();
        observer.onSubscribe(fVar);
        d(fVar);
        fVar.a(observer);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <T> s<T> p1() {
        if (this instanceof i.a.e1.h.c.d) {
            return ((i.a.e1.h.c.d) this).c();
        }
        return i.a.e1.l.a.P(new i.a.e1.h.f.a.q0(this));
    }

    @i.a.e1.b.h("none")
    public final void q(@i.a.e1.b.f i.a.e1.g.a onComplete) {
        r(onComplete, i.a.e1.h.b.a.f26749e);
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final Future<Void> q1() {
        return (Future) a1(new i.a.e1.h.e.r());
    }

    @i.a.e1.b.h("none")
    public final void r(@i.a.e1.b.f i.a.e1.g.a onComplete, @i.a.e1.b.f i.a.e1.g.g<? super Throwable> onError) {
        Objects.requireNonNull(onComplete, "onComplete is null");
        Objects.requireNonNull(onError, "onError is null");
        i.a.e1.h.e.i iVar = new i.a.e1.h.e.i();
        d(iVar);
        iVar.b(i.a.e1.h.b.a.h(), onError, onComplete);
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final <T> z<T> r1() {
        if (this instanceof i.a.e1.h.c.e) {
            return ((i.a.e1.h.c.e) this).b();
        }
        return i.a.e1.l.a.Q(new i.a.e1.h.f.c.l0(this));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final j s() {
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.c(this));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final j t0(@i.a.e1.b.f p other) {
        Objects.requireNonNull(other, "other is null");
        return o0(this, other);
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final <T> i0<T> t1() {
        if (this instanceof i.a.e1.h.c.f) {
            return ((i.a.e1.h.c.f) this).a();
        }
        return i.a.e1.l.a.R(new i.a.e1.h.f.a.r0(this));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final j u(@i.a.e1.b.f q transformer) {
        Objects.requireNonNull(transformer, "transformer is null");
        return A1(transformer.a(this));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <T> r0<T> u1(@i.a.e1.b.f i.a.e1.g.s<? extends T> completionValueSupplier) {
        Objects.requireNonNull(completionValueSupplier, "completionValueSupplier is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.a.s0(this, completionValueSupplier, null));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("custom")
    public final j v0(@i.a.e1.b.f q0 scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.h0(this, scheduler));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final <T> r0<T> v1(T completionValue) {
        Objects.requireNonNull(completionValue, "completionValue is null");
        return i.a.e1.l.a.S(new i.a.e1.h.f.a.s0(this, null, completionValue));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final j w0() {
        return x0(i.a.e1.h.b.a.c());
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final j x0(@i.a.e1.b.f i.a.e1.g.r<? super Throwable> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.i0(this, predicate));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("custom")
    public final j x1(@i.a.e1.b.f q0 scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.k(this, scheduler));
    }

    @i.a.e1.b.h("none")
    @i.a.e1.b.f
    @i.a.e1.b.d
    public final j y0(@i.a.e1.b.f i.a.e1.g.o<? super Throwable, ? extends p> fallbackSupplier) {
        Objects.requireNonNull(fallbackSupplier, "fallbackSupplier is null");
        return i.a.e1.l.a.O(new i.a.e1.h.f.a.l0(this, fallbackSupplier));
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    @i.a.e1.b.h("none")
    public final j z0(@i.a.e1.b.f p fallback) {
        Objects.requireNonNull(fallback, "fallback is null");
        return y0(i.a.e1.h.b.a.n(fallback));
    }
}
