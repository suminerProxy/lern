package i.a.e1.h.f.b;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableWindowBoundarySelector.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class z4<T, B, V> extends i.a.e1.h.f.b.a<T, i.a.e1.c.s<T>> {

    /* renamed from: d  reason: collision with root package name */
    public final Publisher<B> f27274d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.g.o<? super B, ? extends Publisher<V>> f27275e;

    /* renamed from: f  reason: collision with root package name */
    public final int f27276f;

    /* compiled from: FlowableWindowBoundarySelector.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, B, V> extends AtomicInteger implements i.a.e1.c.x<T>, Subscription, Runnable {
        private static final long serialVersionUID = 8646217640096099753L;
        public final int bufferSize;
        public final i.a.e1.g.o<? super B, ? extends Publisher<V>> closingIndicator;
        public final Subscriber<? super i.a.e1.c.s<T>> downstream;
        public final AtomicBoolean downstreamCancelled;
        public long emitted;
        public final i.a.e1.h.k.c error;
        public final Publisher<B> open;
        public volatile boolean openDone;
        public final i.a.e1.h.c.p<Object> queue;
        public final AtomicLong requested;
        public final i.a.e1.d.d resources;
        public final c<B> startSubscriber;
        public Subscription upstream;
        public volatile boolean upstreamCanceled;
        public volatile boolean upstreamDone;
        public final AtomicLong windowCount;
        public final List<i.a.e1.m.h<T>> windows;

        /* compiled from: FlowableWindowBoundarySelector.java */
        /* renamed from: i.a.e1.h.f.b.z4$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0454a<T, V> extends i.a.e1.c.s<T> implements i.a.e1.c.x<V>, i.a.e1.d.f {
            public final a<T, ?, V> c;

            /* renamed from: d  reason: collision with root package name */
            public final i.a.e1.m.h<T> f27277d;

            /* renamed from: e  reason: collision with root package name */
            public final AtomicReference<Subscription> f27278e;

            /* renamed from: f  reason: collision with root package name */
            public final AtomicBoolean f27279f;

            public C0454a(a<T, ?, V> parent, i.a.e1.m.h<T> window) {
            }

            @Override // i.a.e1.c.s
            public void F6(Subscriber<? super T> s) {
            }

            @Override // i.a.e1.d.f
            public void dispose() {
            }

            public boolean e9() {
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
            public void onNext(V t) {
            }

            @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
            public void onSubscribe(Subscription s) {
            }
        }

        /* compiled from: FlowableWindowBoundarySelector.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class b<B> {

            /* renamed from: a  reason: collision with root package name */
            public final B f27280a;

            public b(B item) {
            }
        }

        /* compiled from: FlowableWindowBoundarySelector.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class c<B> extends AtomicReference<Subscription> implements i.a.e1.c.x<B> {
            private static final long serialVersionUID = -3326496781427702834L;
            public final a<?, B, ?> parent;

            public c(a<?, B, ?> parent) {
            }

            public void cancel() {
            }

            @Override // org.reactivestreams.Subscriber
            public void onComplete() {
            }

            @Override // org.reactivestreams.Subscriber
            public void onError(Throwable t) {
            }

            @Override // org.reactivestreams.Subscriber
            public void onNext(B t) {
            }

            @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
            public void onSubscribe(Subscription s) {
            }
        }

        public a(Subscriber<? super i.a.e1.c.s<T>> actual, Publisher<B> open, i.a.e1.g.o<? super B, ? extends Publisher<V>> closingIndicator, int bufferSize) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void close(C0454a<T, V> what) {
        }

        public void closeError(Throwable t) {
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

        public void open(B startValue) {
        }

        public void openComplete() {
        }

        public void openError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public void terminateDownstream(Subscriber<?> downstream) {
        }
    }

    public z4(i.a.e1.c.s<T> source, Publisher<B> open, i.a.e1.g.o<? super B, ? extends Publisher<V>> closingIndicator, int bufferSize) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super i.a.e1.c.s<T>> s) {
    }
}
