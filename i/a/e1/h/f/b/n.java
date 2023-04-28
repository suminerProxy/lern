package i.a.e1.h.f.b;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableBufferBoundary.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class n<T, U extends Collection<? super T>, Open, Close> extends i.a.e1.h.f.b.a<T, U> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.s<U> f27042d;

    /* renamed from: e  reason: collision with root package name */
    public final Publisher<? extends Open> f27043e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.e1.g.o<? super Open, ? extends Publisher<? extends Close>> f27044f;

    /* compiled from: FlowableBufferBoundary.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements i.a.e1.c.x<T>, Subscription {
        private static final long serialVersionUID = -8466418554264089604L;
        public final i.a.e1.g.o<? super Open, ? extends Publisher<? extends Close>> bufferClose;
        public final Publisher<? extends Open> bufferOpen;
        public final i.a.e1.g.s<C> bufferSupplier;
        public Map<Long, C> buffers;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final Subscriber<? super C> downstream;
        public long emitted;
        public final i.a.e1.h.k.c errors;
        public long index;
        public final i.a.e1.h.g.c<C> queue;
        public final AtomicLong requested;
        public final i.a.e1.d.d subscribers;
        public final AtomicReference<Subscription> upstream;

        /* compiled from: FlowableBufferBoundary.java */
        /* renamed from: i.a.e1.h.f.b.n$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0452a<Open> extends AtomicReference<Subscription> implements i.a.e1.c.x<Open>, i.a.e1.d.f {
            private static final long serialVersionUID = -8498650778633225126L;
            public final a<?, ?, Open, ?> parent;

            public C0452a(a<?, ?, Open, ?> parent) {
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
            public void onNext(Open t) {
            }

            @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
            public void onSubscribe(Subscription s) {
            }
        }

        public a(Subscriber<? super C> actual, Publisher<? extends Open> bufferOpen, i.a.e1.g.o<? super Open, ? extends Publisher<? extends Close>> bufferClose, i.a.e1.g.s<C> bufferSupplier) {
        }

        public void boundaryError(i.a.e1.d.f subscriber, Throwable ex) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void close(b<T, C> closer, long idx) {
        }

        public void drain() {
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

        public void open(Open token) {
        }

        public void openComplete(C0452a<Open> os) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    /* compiled from: FlowableBufferBoundary.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, C extends Collection<? super T>> extends AtomicReference<Subscription> implements i.a.e1.c.x<Object>, i.a.e1.d.f {
        private static final long serialVersionUID = -8498650778633225126L;
        public final long index;
        public final a<T, C, ?, ?> parent;

        public b(a<T, C, ?, ?> parent, long index) {
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
        public void onNext(Object t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }
    }

    public n(i.a.e1.c.s<T> source, Publisher<? extends Open> bufferOpen, i.a.e1.g.o<? super Open, ? extends Publisher<? extends Close>> bufferClose, i.a.e1.g.s<U> bufferSupplier) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super U> s) {
    }
}
