package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableFlatMap.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class z0<T, U> extends i.a.y0.e.b.a<T, U> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super T, ? extends Publisher<? extends U>> f28604d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f28605e;

    /* renamed from: f  reason: collision with root package name */
    public final int f28606f;

    /* renamed from: g  reason: collision with root package name */
    public final int f28607g;

    /* compiled from: FlowableFlatMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, U> extends AtomicReference<Subscription> implements i.a.q<U>, i.a.u0.c {
        private static final long serialVersionUID = -4606175640614850599L;
        public final int bufferSize;
        public volatile boolean done;
        public int fusionMode;
        public final long id;
        public final int limit;
        public final b<T, U> parent;
        public long produced;
        public volatile i.a.y0.c.o<U> queue;

        public a(b<T, U> bVar, long j2) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(U u) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }

        public void requestMore(long j2) {
        }
    }

    /* compiled from: FlowableFlatMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, U> extends AtomicInteger implements i.a.q<T>, Subscription {
        public static final a<?, ?>[] CANCELLED = null;
        public static final a<?, ?>[] EMPTY = null;
        private static final long serialVersionUID = -2117620485640801370L;
        public final int bufferSize;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final Subscriber<? super U> downstream;
        public final i.a.y0.j.c errs;
        public long lastId;
        public int lastIndex;
        public final i.a.x0.o<? super T, ? extends Publisher<? extends U>> mapper;
        public final int maxConcurrency;
        public volatile i.a.y0.c.n<U> queue;
        public final AtomicLong requested;
        public int scalarEmitted;
        public final int scalarLimit;
        public final AtomicReference<a<?, ?>[]> subscribers;
        public long uniqueId;
        public Subscription upstream;

        public b(Subscriber<? super U> subscriber, i.a.x0.o<? super T, ? extends Publisher<? extends U>> oVar, boolean z, int i2, int i3) {
        }

        public boolean addInner(a<T, U> aVar) {
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

        public i.a.y0.c.o<U> getInnerQueue(a<T, U> aVar) {
        }

        public i.a.y0.c.o<U> getMainQueue() {
        }

        public void innerError(a<T, U> aVar, Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }

        public void removeInner(a<T, U> aVar) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }

        public void tryEmit(U u, a<T, U> aVar) {
        }

        public void tryEmitScalar(U u) {
        }
    }

    public z0(i.a.l<T> lVar, i.a.x0.o<? super T, ? extends Publisher<? extends U>> oVar, boolean z, int i2, int i3) {
    }

    public static <T, U> i.a.q<T> I8(Subscriber<? super U> subscriber, i.a.x0.o<? super T, ? extends Publisher<? extends U>> oVar, boolean z, int i2, int i3) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super U> subscriber) {
    }
}
