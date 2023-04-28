package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableAmb.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class h<T> extends i.a.e1.c.s<T> {
    public final Publisher<? extends T>[] c;

    /* renamed from: d  reason: collision with root package name */
    public final Iterable<? extends Publisher<? extends T>> f26975d;

    /* compiled from: FlowableAmb.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> implements Subscription {
        public final Subscriber<? super T> b;
        public final b<T>[] c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicInteger f26976d;

        public a(Subscriber<? super T> actual, int count) {
        }

        public void a(Publisher<? extends T>[] sources) {
        }

        public boolean b(int index) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    /* compiled from: FlowableAmb.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends AtomicReference<Subscription> implements i.a.e1.c.x<T>, Subscription {
        private static final long serialVersionUID = -1185974347409665484L;
        public final Subscriber<? super T> downstream;
        public final int index;
        public final AtomicLong missedRequested;
        public final a<T> parent;
        public boolean won;

        public b(a<T> parent, int index, Subscriber<? super T> downstream) {
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

    public h(Publisher<? extends T>[] sources, Iterable<? extends Publisher<? extends T>> sourcesIterable) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
