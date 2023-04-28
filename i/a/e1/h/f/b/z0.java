package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableFlatMap.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class z0<T, U> extends i.a.e1.h.f.b.a<T, U> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super T, ? extends Publisher<? extends U>> f27259d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f27260e;

    /* renamed from: f  reason: collision with root package name */
    public final int f27261f;

    /* renamed from: g  reason: collision with root package name */
    public final int f27262g;

    /* compiled from: FlowableFlatMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, U> extends AtomicReference<Subscription> implements i.a.e1.c.x<U>, i.a.e1.d.f {
        private static final long serialVersionUID = -4606175640614850599L;
        public final int bufferSize;
        public volatile boolean done;
        public int fusionMode;
        public final long id;
        public final int limit;
        public final b<T, U> parent;
        public long produced;
        public volatile i.a.e1.h.c.q<U> queue;

        public a(b<T, U> parent, int bufferSize, long id) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(U t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        public void requestMore(long n2) {
        }
    }

    /* compiled from: FlowableFlatMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, U> extends AtomicInteger implements i.a.e1.c.x<T>, Subscription {
        public static final a<?, ?>[] CANCELLED = null;
        public static final a<?, ?>[] EMPTY = null;
        private static final long serialVersionUID = -2117620485640801370L;
        public final int bufferSize;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final Subscriber<? super U> downstream;
        public final i.a.e1.h.k.c errors;
        public long lastId;
        public int lastIndex;
        public final i.a.e1.g.o<? super T, ? extends Publisher<? extends U>> mapper;
        public final int maxConcurrency;
        public volatile i.a.e1.h.c.p<U> queue;
        public final AtomicLong requested;
        public int scalarEmitted;
        public final int scalarLimit;
        public final AtomicReference<a<?, ?>[]> subscribers;
        public long uniqueId;
        public Subscription upstream;

        public b(Subscriber<? super U> actual, i.a.e1.g.o<? super T, ? extends Publisher<? extends U>> mapper, boolean delayErrors, int maxConcurrency, int bufferSize) {
        }

        public boolean addInner(a<T, U> inner) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public boolean checkTerminate() {
        }

        public void clearScalarQueue() {
        }

        public void disposeAll() {
        }

        public void drain() {
        }

        public void drainLoop() {
        }

        public i.a.e1.h.c.q<U> getMainQueue() {
        }

        public void innerError(a<T, U> inner, Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        public void removeInner(a<T, U> inner) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        public void tryEmit(U value, a<T, U> inner) {
        }

        public void tryEmitScalar(U value) {
        }
    }

    public z0(i.a.e1.c.s<T> source, i.a.e1.g.o<? super T, ? extends Publisher<? extends U>> mapper, boolean delayErrors, int maxConcurrency, int bufferSize) {
    }

    public static <T, U> i.a.e1.c.x<T> e9(Subscriber<? super U> s, i.a.e1.g.o<? super T, ? extends Publisher<? extends U>> mapper, boolean delayErrors, int maxConcurrency, int bufferSize) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super U> s) {
    }
}
