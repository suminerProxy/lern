package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableAmb.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class h<T> extends i.a.l<T> {
    public final Publisher<? extends T>[] c;

    /* renamed from: d  reason: collision with root package name */
    public final Iterable<? extends Publisher<? extends T>> f28289d;

    /* compiled from: FlowableAmb.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> implements Subscription {
        public final Subscriber<? super T> b;
        public final b<T>[] c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicInteger f28290d;

        public a(Subscriber<? super T> subscriber, int i2) {
        }

        public void a(Publisher<? extends T>[] publisherArr) {
        }

        public boolean b(int i2) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    /* compiled from: FlowableAmb.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends AtomicReference<Subscription> implements i.a.q<T>, Subscription {
        private static final long serialVersionUID = -1185974347409665484L;
        public final Subscriber<? super T> downstream;
        public final int index;
        public final AtomicLong missedRequested;
        public final a<T> parent;
        public boolean won;

        public b(a<T> aVar, int i2, Subscriber<? super T> subscriber) {
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

    public h(Publisher<? extends T>[] publisherArr, Iterable<? extends Publisher<? extends T>> iterable) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
