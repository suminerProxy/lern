package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableZip.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class e5<T, R> extends i.a.e1.c.s<R> {
    public final Publisher<? extends T>[] c;

    /* renamed from: d  reason: collision with root package name */
    public final Iterable<? extends Publisher<? extends T>> f26940d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.g.o<? super Object[], ? extends R> f26941e;

    /* renamed from: f  reason: collision with root package name */
    public final int f26942f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f26943g;

    /* compiled from: FlowableZip.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = -2434867452883857743L;
        public volatile boolean cancelled;
        public final Object[] current;
        public final boolean delayErrors;
        public final Subscriber<? super R> downstream;
        public final i.a.e1.h.k.c errors;
        public final AtomicLong requested;
        public final b<T, R>[] subscribers;
        public final i.a.e1.g.o<? super Object[], ? extends R> zipper;

        public a(Subscriber<? super R> actual, i.a.e1.g.o<? super Object[], ? extends R> zipper, int n2, int prefetch, boolean delayErrors) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void cancelAll() {
        }

        public void drain() {
        }

        public void error(b<T, R> inner, Throwable e2) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        public void subscribe(Publisher<? extends T>[] sources, int n2) {
        }
    }

    /* compiled from: FlowableZip.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, R> extends AtomicReference<Subscription> implements i.a.e1.c.x<T>, Subscription {
        private static final long serialVersionUID = -4627193790118206028L;
        public volatile boolean done;
        public final int limit;
        public final a<T, R> parent;
        public final int prefetch;
        public long produced;
        public i.a.e1.h.c.q<T> queue;
        public int sourceMode;

        public b(a<T, R> parent, int prefetch) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
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

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    public e5(Publisher<? extends T>[] sources, Iterable<? extends Publisher<? extends T>> sourcesIterable, i.a.e1.g.o<? super Object[], ? extends R> zipper, int bufferSize, boolean delayError) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super R> s) {
    }
}
