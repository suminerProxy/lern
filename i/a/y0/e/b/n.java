package i.a.y0.e.b;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableBufferBoundary.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class n<T, U extends Collection<? super T>, Open, Close> extends i.a.y0.e.b.a<T, U> {

    /* renamed from: d  reason: collision with root package name */
    public final Callable<U> f28375d;

    /* renamed from: e  reason: collision with root package name */
    public final Publisher<? extends Open> f28376e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.x0.o<? super Open, ? extends Publisher<? extends Close>> f28377f;

    /* compiled from: FlowableBufferBoundary.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements i.a.q<T>, Subscription {
        private static final long serialVersionUID = -8466418554264089604L;
        public final i.a.x0.o<? super Open, ? extends Publisher<? extends Close>> bufferClose;
        public final Publisher<? extends Open> bufferOpen;
        public final Callable<C> bufferSupplier;
        public Map<Long, C> buffers;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final Subscriber<? super C> downstream;
        public long emitted;
        public final i.a.y0.j.c errors;
        public long index;
        public final i.a.y0.f.c<C> queue;
        public final AtomicLong requested;
        public final i.a.u0.b subscribers;
        public final AtomicReference<Subscription> upstream;

        /* compiled from: FlowableBufferBoundary.java */
        /* renamed from: i.a.y0.e.b.n$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class C0542a<Open> extends AtomicReference<Subscription> implements i.a.q<Open>, i.a.u0.c {
            private static final long serialVersionUID = -8498650778633225126L;
            public final a<?, ?, Open, ?> parent;

            public C0542a(a<?, ?, Open, ?> aVar) {
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
            public void onNext(Open open) {
            }

            @Override // i.a.q
            public void onSubscribe(Subscription subscription) {
            }
        }

        public a(Subscriber<? super C> subscriber, Publisher<? extends Open> publisher, i.a.x0.o<? super Open, ? extends Publisher<? extends Close>> oVar, Callable<C> callable) {
        }

        public void boundaryError(i.a.u0.c cVar, Throwable th) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void close(b<T, C> bVar, long j2) {
        }

        public void drain() {
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

        public void open(Open open) {
        }

        public void openComplete(C0542a<Open> c0542a) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    /* compiled from: FlowableBufferBoundary.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, C extends Collection<? super T>> extends AtomicReference<Subscription> implements i.a.q<Object>, i.a.u0.c {
        private static final long serialVersionUID = -8498650778633225126L;
        public final long index;
        public final a<T, C, ?, ?> parent;

        public b(a<T, C, ?, ?> aVar, long j2) {
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
        public void onNext(Object obj) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }
    }

    public n(i.a.l<T> lVar, Publisher<? extends Open> publisher, i.a.x0.o<? super Open, ? extends Publisher<? extends Close>> oVar, Callable<U> callable) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super U> subscriber) {
    }
}
