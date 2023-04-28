package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableZip.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class z4<T, R> extends i.a.l<R> {
    public final Publisher<? extends T>[] c;

    /* renamed from: d  reason: collision with root package name */
    public final Iterable<? extends Publisher<? extends T>> f28617d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.x0.o<? super Object[], ? extends R> f28618e;

    /* renamed from: f  reason: collision with root package name */
    public final int f28619f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f28620g;

    /* compiled from: FlowableZip.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = -2434867452883857743L;
        public volatile boolean cancelled;
        public final Object[] current;
        public final boolean delayErrors;
        public final Subscriber<? super R> downstream;
        public final i.a.y0.j.c errors;
        public final AtomicLong requested;
        public final b<T, R>[] subscribers;
        public final i.a.x0.o<? super Object[], ? extends R> zipper;

        public a(Subscriber<? super R> subscriber, i.a.x0.o<? super Object[], ? extends R> oVar, int i2, int i3, boolean z) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void cancelAll() {
        }

        public void drain() {
        }

        public void error(b<T, R> bVar, Throwable th) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }

        public void subscribe(Publisher<? extends T>[] publisherArr, int i2) {
        }
    }

    /* compiled from: FlowableZip.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, R> extends AtomicReference<Subscription> implements i.a.q<T>, Subscription {
        private static final long serialVersionUID = -4627193790118206028L;
        public volatile boolean done;
        public final int limit;
        public final a<T, R> parent;
        public final int prefetch;
        public long produced;
        public i.a.y0.c.o<T> queue;
        public int sourceMode;

        public b(a<T, R> aVar, int i2) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
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

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    public z4(Publisher<? extends T>[] publisherArr, Iterable<? extends Publisher<? extends T>> iterable, i.a.x0.o<? super Object[], ? extends R> oVar, int i2, boolean z) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super R> subscriber) {
    }
}
