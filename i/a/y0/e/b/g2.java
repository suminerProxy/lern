package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableMergeWithMaybe.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class g2<T> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.y<? extends T> f28284d;

    /* compiled from: FlowableMergeWithMaybe.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements i.a.q<T>, Subscription {
        public static final int OTHER_STATE_CONSUMED_OR_EMPTY = 2;
        public static final int OTHER_STATE_HAS_VALUE = 1;
        private static final long serialVersionUID = -4592979584110982903L;
        public volatile boolean cancelled;
        public int consumed;
        public final Subscriber<? super T> downstream;
        public long emitted;
        public final i.a.y0.j.c error;
        public final int limit;
        public volatile boolean mainDone;
        public final AtomicReference<Subscription> mainSubscription;
        public final C0538a<T> otherObserver;
        public volatile int otherState;
        public final int prefetch;
        public volatile i.a.y0.c.n<T> queue;
        public final AtomicLong requested;
        public T singleItem;

        /* compiled from: FlowableMergeWithMaybe.java */
        /* renamed from: i.a.y0.e.b.g2$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class C0538a<T> extends AtomicReference<i.a.u0.c> implements i.a.v<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            public final a<T> parent;

            public C0538a(a<T> aVar) {
            }

            @Override // i.a.v
            public void onComplete() {
            }

            @Override // i.a.v
            public void onError(Throwable th) {
            }

            @Override // i.a.v
            public void onSubscribe(i.a.u0.c cVar) {
            }

            @Override // i.a.v, i.a.n0
            public void onSuccess(T t) {
            }
        }

        public a(Subscriber<? super T> subscriber) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void drain() {
        }

        public void drainLoop() {
        }

        public i.a.y0.c.n<T> getOrCreateQueue() {
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

        public void otherComplete() {
        }

        public void otherError(Throwable th) {
        }

        public void otherSuccess(T t) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    public g2(i.a.l<T> lVar, i.a.y<? extends T> yVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
