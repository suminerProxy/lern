package i.a.e1.k;

import i.a.e1.b.f;
import i.a.e1.b.h;
import i.a.e1.c.q0;
import i.a.e1.c.s;
import i.a.e1.g.o;
import i.a.e1.g.r;
import i.a.e1.h.d.a0;
import i.a.e1.h.d.b0;
import i.a.e1.h.d.c0;
import i.a.e1.h.d.d0;
import i.a.e1.h.f.f.e;
import i.a.e1.h.f.f.i;
import i.a.e1.h.f.f.j;
import i.a.e1.h.f.f.k;
import i.a.e1.h.f.f.l;
import i.a.e1.h.f.f.m;
import i.a.e1.h.f.f.n;
import i.a.e1.h.f.f.p;
import i.a.e1.h.f.f.q;
import i.a.e1.h.j.g;
import i.a.e1.h.k.w;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Stream;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ParallelFlowable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class b<T> {
    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @h("none")
    @f
    @i.a.e1.b.d
    public static <T> b<T> C(@f Publisher<? extends T> source) {
        return E(source, Runtime.getRuntime().availableProcessors(), s.T());
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @h("none")
    @f
    @i.a.e1.b.d
    public static <T> b<T> D(@f Publisher<? extends T> source, int parallelism) {
        return E(source, parallelism, s.T());
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @h("none")
    @f
    @i.a.e1.b.d
    public static <T> b<T> E(@f Publisher<? extends T> source, int parallelism, int prefetch) {
        Objects.requireNonNull(source, "source is null");
        i.a.e1.h.b.b.b(parallelism, "parallelism");
        i.a.e1.h.b.b.b(prefetch, "prefetch");
        return i.a.e1.l.a.V(new i(source, parallelism, prefetch));
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @SafeVarargs
    @i.a.e1.b.d
    public static <T> b<T> F(@f Publisher<T>... publishers) {
        Objects.requireNonNull(publishers, "publishers is null");
        if (publishers.length != 0) {
            return i.a.e1.l.a.V(new i.a.e1.h.f.f.h(publishers));
        }
        throw new IllegalArgumentException("Zero publishers not supported");
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @h("none")
    @f
    @i.a.e1.b.d
    public final <R> b<R> A(@f o<? super T, ? extends Stream<? extends R>> mapper) {
        return B(mapper, s.T());
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @h("none")
    @f
    @i.a.e1.b.d
    public final <R> b<R> B(@f o<? super T, ? extends Stream<? extends R>> mapper, int prefetch) {
        Objects.requireNonNull(mapper, "mapper is null");
        i.a.e1.h.b.b.b(prefetch, "prefetch");
        return i.a.e1.l.a.V(new b0(this, mapper, prefetch));
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @i.a.e1.b.d
    public final <R> b<R> G(@f o<? super T, ? extends R> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return i.a.e1.l.a.V(new k(this, mapper));
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @i.a.e1.b.d
    public final <R> b<R> H(@f o<? super T, ? extends R> mapper, @f i.a.e1.g.c<? super Long, ? super Throwable, a> errorHandler) {
        Objects.requireNonNull(mapper, "mapper is null");
        Objects.requireNonNull(errorHandler, "errorHandler is null");
        return i.a.e1.l.a.V(new l(this, mapper, errorHandler));
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @i.a.e1.b.d
    public final <R> b<R> I(@f o<? super T, ? extends R> mapper, @f a errorHandler) {
        Objects.requireNonNull(mapper, "mapper is null");
        Objects.requireNonNull(errorHandler, "errorHandler is null");
        return i.a.e1.l.a.V(new l(this, mapper, errorHandler));
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @i.a.e1.b.d
    public final <R> b<R> J(@f o<? super T, Optional<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return i.a.e1.l.a.V(new c0(this, mapper));
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @i.a.e1.b.d
    public final <R> b<R> K(@f o<? super T, Optional<? extends R>> mapper, @f i.a.e1.g.c<? super Long, ? super Throwable, a> errorHandler) {
        Objects.requireNonNull(mapper, "mapper is null");
        Objects.requireNonNull(errorHandler, "errorHandler is null");
        return i.a.e1.l.a.V(new d0(this, mapper, errorHandler));
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @i.a.e1.b.d
    public final <R> b<R> L(@f o<? super T, Optional<? extends R>> mapper, @f a errorHandler) {
        Objects.requireNonNull(mapper, "mapper is null");
        Objects.requireNonNull(errorHandler, "errorHandler is null");
        return i.a.e1.l.a.V(new d0(this, mapper, errorHandler));
    }

    @i.a.e1.b.d
    public abstract int M();

    @i.a.e1.b.b(i.a.e1.b.a.UNBOUNDED_IN)
    @h("none")
    @f
    @i.a.e1.b.d
    public final s<T> N(@f i.a.e1.g.c<T, T, T> reducer) {
        Objects.requireNonNull(reducer, "reducer is null");
        return i.a.e1.l.a.P(new i.a.e1.h.f.f.o(this, reducer));
    }

    @i.a.e1.b.b(i.a.e1.b.a.UNBOUNDED_IN)
    @h("none")
    @f
    @i.a.e1.b.d
    public final <R> b<R> O(@f i.a.e1.g.s<R> initialSupplier, @f i.a.e1.g.c<R, ? super T, R> reducer) {
        Objects.requireNonNull(initialSupplier, "initialSupplier is null");
        Objects.requireNonNull(reducer, "reducer is null");
        return i.a.e1.l.a.V(new n(this, initialSupplier, reducer));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @h("custom")
    @f
    @i.a.e1.b.d
    public final b<T> P(@f q0 scheduler) {
        return Q(scheduler, s.T());
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @h("custom")
    @f
    @i.a.e1.b.d
    public final b<T> Q(@f q0 scheduler, int prefetch) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        i.a.e1.h.b.b.b(prefetch, "prefetch");
        return i.a.e1.l.a.V(new p(this, scheduler, prefetch));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @h("none")
    @f
    @i.a.e1.b.d
    public final s<T> R() {
        return S(s.T());
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @h("none")
    @f
    @i.a.e1.b.d
    public final s<T> S(int prefetch) {
        i.a.e1.h.b.b.b(prefetch, "prefetch");
        return i.a.e1.l.a.P(new j(this, prefetch, false));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @h("none")
    @f
    @i.a.e1.b.d
    public final s<T> T() {
        return U(s.T());
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @h("none")
    @f
    @i.a.e1.b.d
    public final s<T> U(int prefetch) {
        i.a.e1.h.b.b.b(prefetch, "prefetch");
        return i.a.e1.l.a.P(new j(this, prefetch, true));
    }

    @i.a.e1.b.b(i.a.e1.b.a.UNBOUNDED_IN)
    @h("none")
    @f
    @i.a.e1.b.d
    public final s<T> V(@f Comparator<? super T> comparator) {
        return W(comparator, 16);
    }

    @i.a.e1.b.b(i.a.e1.b.a.UNBOUNDED_IN)
    @h("none")
    @f
    @i.a.e1.b.d
    public final s<T> W(@f Comparator<? super T> comparator, int capacityHint) {
        Objects.requireNonNull(comparator, "comparator is null");
        i.a.e1.h.b.b.b(capacityHint, "capacityHint");
        return i.a.e1.l.a.P(new q(O(i.a.e1.h.b.a.f((capacityHint / M()) + 1), i.a.e1.h.k.o.instance()).G(new w(comparator)), comparator));
    }

    @i.a.e1.b.b(i.a.e1.b.a.SPECIAL)
    @h("none")
    public abstract void X(@f Subscriber<? super T>[] subscribers);

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @i.a.e1.b.d
    public final <R> R Y(@f c<T, R> converter) {
        Objects.requireNonNull(converter, "converter is null");
        return converter.a(this);
    }

    @i.a.e1.b.b(i.a.e1.b.a.UNBOUNDED_IN)
    @h("none")
    @f
    @i.a.e1.b.d
    public final s<List<T>> Z(@f Comparator<? super T> comparator) {
        return a0(comparator, 16);
    }

    @i.a.e1.b.b(i.a.e1.b.a.UNBOUNDED_IN)
    @h("none")
    @f
    @i.a.e1.b.d
    public final <A, R> s<R> a(@f Collector<T, A, R> collector) {
        Objects.requireNonNull(collector, "collector is null");
        return i.a.e1.l.a.P(new a0(this, collector));
    }

    @i.a.e1.b.b(i.a.e1.b.a.UNBOUNDED_IN)
    @h("none")
    @f
    @i.a.e1.b.d
    public final s<List<T>> a0(@f Comparator<? super T> comparator, int capacityHint) {
        Objects.requireNonNull(comparator, "comparator is null");
        i.a.e1.h.b.b.b(capacityHint, "capacityHint");
        return i.a.e1.l.a.P(O(i.a.e1.h.b.a.f((capacityHint / M()) + 1), i.a.e1.h.k.o.instance()).G(new w(comparator)).N(new i.a.e1.h.k.p(comparator)));
    }

    @i.a.e1.b.b(i.a.e1.b.a.UNBOUNDED_IN)
    @h("none")
    @f
    @i.a.e1.b.d
    public final <C> b<C> b(@f i.a.e1.g.s<? extends C> collectionSupplier, @f i.a.e1.g.b<? super C, ? super T> collector) {
        Objects.requireNonNull(collectionSupplier, "collectionSupplier is null");
        Objects.requireNonNull(collector, "collector is null");
        return i.a.e1.l.a.V(new i.a.e1.h.f.f.a(this, collectionSupplier, collector));
    }

    public final boolean b0(@f Subscriber<?>[] subscribers) {
        Objects.requireNonNull(subscribers, "subscribers is null");
        int M = M();
        if (subscribers.length != M) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("parallelism = " + M + ", subscribers = " + subscribers.length);
            int length = subscribers.length;
            for (int i2 = 0; i2 < length; i2++) {
                g.error(illegalArgumentException, subscribers[i2]);
            }
            return false;
        }
        return true;
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @i.a.e1.b.d
    public final <U> b<U> c(@f d<T, U> composer) {
        Objects.requireNonNull(composer, "composer is null");
        return i.a.e1.l.a.V(composer.a(this));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @h("none")
    @f
    @i.a.e1.b.d
    public final <R> b<R> d(@f o<? super T, ? extends Publisher<? extends R>> mapper) {
        return e(mapper, 2);
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @h("none")
    @f
    @i.a.e1.b.d
    public final <R> b<R> e(@f o<? super T, ? extends Publisher<? extends R>> mapper, int prefetch) {
        Objects.requireNonNull(mapper, "mapper is null");
        i.a.e1.h.b.b.b(prefetch, "prefetch");
        return i.a.e1.l.a.V(new i.a.e1.h.f.f.b(this, mapper, prefetch, i.a.e1.h.k.j.IMMEDIATE));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @h("none")
    @f
    @i.a.e1.b.d
    public final <R> b<R> f(@f o<? super T, ? extends Publisher<? extends R>> mapper, int prefetch, boolean tillTheEnd) {
        Objects.requireNonNull(mapper, "mapper is null");
        i.a.e1.h.b.b.b(prefetch, "prefetch");
        return i.a.e1.l.a.V(new i.a.e1.h.f.f.b(this, mapper, prefetch, tillTheEnd ? i.a.e1.h.k.j.END : i.a.e1.h.k.j.BOUNDARY));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @h("none")
    @f
    @i.a.e1.b.d
    public final <R> b<R> g(@f o<? super T, ? extends Publisher<? extends R>> mapper, boolean tillTheEnd) {
        return f(mapper, 2, tillTheEnd);
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @i.a.e1.b.d
    public final b<T> h(@f i.a.e1.g.g<? super T> onAfterNext) {
        Objects.requireNonNull(onAfterNext, "onAfterNext is null");
        i.a.e1.g.g h2 = i.a.e1.h.b.a.h();
        i.a.e1.g.g h3 = i.a.e1.h.b.a.h();
        i.a.e1.g.a aVar = i.a.e1.h.b.a.c;
        return i.a.e1.l.a.V(new m(this, h2, onAfterNext, h3, aVar, aVar, i.a.e1.h.b.a.h(), i.a.e1.h.b.a.f26751g, aVar));
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @i.a.e1.b.d
    public final b<T> i(@f i.a.e1.g.a onAfterTerminate) {
        Objects.requireNonNull(onAfterTerminate, "onAfterTerminate is null");
        i.a.e1.g.g h2 = i.a.e1.h.b.a.h();
        i.a.e1.g.g h3 = i.a.e1.h.b.a.h();
        i.a.e1.g.g h4 = i.a.e1.h.b.a.h();
        i.a.e1.g.a aVar = i.a.e1.h.b.a.c;
        return i.a.e1.l.a.V(new m(this, h2, h3, h4, aVar, onAfterTerminate, i.a.e1.h.b.a.h(), i.a.e1.h.b.a.f26751g, aVar));
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @i.a.e1.b.d
    public final b<T> j(@f i.a.e1.g.a onCancel) {
        Objects.requireNonNull(onCancel, "onCancel is null");
        i.a.e1.g.g h2 = i.a.e1.h.b.a.h();
        i.a.e1.g.g h3 = i.a.e1.h.b.a.h();
        i.a.e1.g.g h4 = i.a.e1.h.b.a.h();
        i.a.e1.g.a aVar = i.a.e1.h.b.a.c;
        return i.a.e1.l.a.V(new m(this, h2, h3, h4, aVar, aVar, i.a.e1.h.b.a.h(), i.a.e1.h.b.a.f26751g, onCancel));
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @i.a.e1.b.d
    public final b<T> k(@f i.a.e1.g.a onComplete) {
        Objects.requireNonNull(onComplete, "onComplete is null");
        i.a.e1.g.g h2 = i.a.e1.h.b.a.h();
        i.a.e1.g.g h3 = i.a.e1.h.b.a.h();
        i.a.e1.g.g h4 = i.a.e1.h.b.a.h();
        i.a.e1.g.a aVar = i.a.e1.h.b.a.c;
        return i.a.e1.l.a.V(new m(this, h2, h3, h4, onComplete, aVar, i.a.e1.h.b.a.h(), i.a.e1.h.b.a.f26751g, aVar));
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @i.a.e1.b.d
    public final b<T> l(@f i.a.e1.g.g<? super Throwable> onError) {
        Objects.requireNonNull(onError, "onError is null");
        i.a.e1.g.g h2 = i.a.e1.h.b.a.h();
        i.a.e1.g.g h3 = i.a.e1.h.b.a.h();
        i.a.e1.g.a aVar = i.a.e1.h.b.a.c;
        return i.a.e1.l.a.V(new m(this, h2, h3, onError, aVar, aVar, i.a.e1.h.b.a.h(), i.a.e1.h.b.a.f26751g, aVar));
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @i.a.e1.b.d
    public final b<T> m(@f i.a.e1.g.g<? super T> onNext) {
        Objects.requireNonNull(onNext, "onNext is null");
        i.a.e1.g.g h2 = i.a.e1.h.b.a.h();
        i.a.e1.g.g h3 = i.a.e1.h.b.a.h();
        i.a.e1.g.a aVar = i.a.e1.h.b.a.c;
        return i.a.e1.l.a.V(new m(this, onNext, h2, h3, aVar, aVar, i.a.e1.h.b.a.h(), i.a.e1.h.b.a.f26751g, aVar));
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @i.a.e1.b.d
    public final b<T> n(@f i.a.e1.g.g<? super T> onNext, @f i.a.e1.g.c<? super Long, ? super Throwable, a> errorHandler) {
        Objects.requireNonNull(onNext, "onNext is null");
        Objects.requireNonNull(errorHandler, "errorHandler is null");
        return i.a.e1.l.a.V(new i.a.e1.h.f.f.c(this, onNext, errorHandler));
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @i.a.e1.b.d
    public final b<T> o(@f i.a.e1.g.g<? super T> onNext, @f a errorHandler) {
        Objects.requireNonNull(onNext, "onNext is null");
        Objects.requireNonNull(errorHandler, "errorHandler is null");
        return i.a.e1.l.a.V(new i.a.e1.h.f.f.c(this, onNext, errorHandler));
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @i.a.e1.b.d
    public final b<T> p(@f i.a.e1.g.q onRequest) {
        Objects.requireNonNull(onRequest, "onRequest is null");
        i.a.e1.g.g h2 = i.a.e1.h.b.a.h();
        i.a.e1.g.g h3 = i.a.e1.h.b.a.h();
        i.a.e1.g.g h4 = i.a.e1.h.b.a.h();
        i.a.e1.g.a aVar = i.a.e1.h.b.a.c;
        return i.a.e1.l.a.V(new m(this, h2, h3, h4, aVar, aVar, i.a.e1.h.b.a.h(), onRequest, aVar));
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @i.a.e1.b.d
    public final b<T> q(@f i.a.e1.g.g<? super Subscription> onSubscribe) {
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        i.a.e1.g.g h2 = i.a.e1.h.b.a.h();
        i.a.e1.g.g h3 = i.a.e1.h.b.a.h();
        i.a.e1.g.g h4 = i.a.e1.h.b.a.h();
        i.a.e1.g.a aVar = i.a.e1.h.b.a.c;
        return i.a.e1.l.a.V(new m(this, h2, h3, h4, aVar, aVar, onSubscribe, i.a.e1.h.b.a.f26751g, aVar));
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @i.a.e1.b.d
    public final b<T> r(@f r<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return i.a.e1.l.a.V(new i.a.e1.h.f.f.d(this, predicate));
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @i.a.e1.b.d
    public final b<T> s(@f r<? super T> predicate, @f i.a.e1.g.c<? super Long, ? super Throwable, a> errorHandler) {
        Objects.requireNonNull(predicate, "predicate is null");
        Objects.requireNonNull(errorHandler, "errorHandler is null");
        return i.a.e1.l.a.V(new e(this, predicate, errorHandler));
    }

    @i.a.e1.b.b(i.a.e1.b.a.PASS_THROUGH)
    @h("none")
    @f
    @i.a.e1.b.d
    public final b<T> t(@f r<? super T> predicate, @f a errorHandler) {
        Objects.requireNonNull(predicate, "predicate is null");
        Objects.requireNonNull(errorHandler, "errorHandler is null");
        return i.a.e1.l.a.V(new e(this, predicate, errorHandler));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @h("none")
    @f
    @i.a.e1.b.d
    public final <R> b<R> u(@f o<? super T, ? extends Publisher<? extends R>> mapper) {
        return x(mapper, false, s.T(), s.T());
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @h("none")
    @f
    @i.a.e1.b.d
    public final <R> b<R> v(@f o<? super T, ? extends Publisher<? extends R>> mapper, boolean delayError) {
        return x(mapper, delayError, s.T(), s.T());
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @h("none")
    @f
    @i.a.e1.b.d
    public final <R> b<R> w(@f o<? super T, ? extends Publisher<? extends R>> mapper, boolean delayError, int maxConcurrency) {
        return x(mapper, delayError, maxConcurrency, s.T());
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @h("none")
    @f
    @i.a.e1.b.d
    public final <R> b<R> x(@f o<? super T, ? extends Publisher<? extends R>> mapper, boolean delayError, int maxConcurrency, int prefetch) {
        Objects.requireNonNull(mapper, "mapper is null");
        i.a.e1.h.b.b.b(maxConcurrency, "maxConcurrency");
        i.a.e1.h.b.b.b(prefetch, "prefetch");
        return i.a.e1.l.a.V(new i.a.e1.h.f.f.f(this, mapper, delayError, maxConcurrency, prefetch));
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @h("none")
    @f
    @i.a.e1.b.d
    public final <U> b<U> y(@f o<? super T, ? extends Iterable<? extends U>> mapper) {
        return z(mapper, s.T());
    }

    @i.a.e1.b.b(i.a.e1.b.a.FULL)
    @h("none")
    @f
    @i.a.e1.b.d
    public final <U> b<U> z(@f o<? super T, ? extends Iterable<? extends U>> mapper, int bufferSize) {
        Objects.requireNonNull(mapper, "mapper is null");
        i.a.e1.h.b.b.b(bufferSize, "bufferSize");
        return i.a.e1.l.a.V(new i.a.e1.h.f.f.g(this, mapper, bufferSize));
    }
}
