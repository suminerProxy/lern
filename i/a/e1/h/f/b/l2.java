package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableMergeWithSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class l2<T> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.c.x0<? extends T> f27020d;

    /* compiled from: FlowableMergeWithSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicInteger implements i.a.e1.c.x<T>, Subscription {
        public static final int OTHER_STATE_CONSUMED_OR_EMPTY = 2;
        public static final int OTHER_STATE_HAS_VALUE = 1;
        private static final long serialVersionUID = -4592979584110982903L;
        public volatile boolean cancelled;
        public int consumed;
        public final Subscriber<? super T> downstream;
        public long emitted;
        public final i.a.e1.h.k.c errors;
        public final int limit;
        public volatile boolean mainDone;
        public final AtomicReference<Subscription> mainSubscription;
        public final C0451a<T> otherObserver;
        public volatile int otherState;
        public final int prefetch;
        public volatile i.a.e1.h.c.p<T> queue;
        public final AtomicLong requested;
        public T singleItem;

        /* compiled from: FlowableMergeWithSingle.java */
        /* renamed from: i.a.e1.h.f.b.l2$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0451a<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.u0<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            public final a<T> parent;

            public C0451a(a<T> parent) {
            }

            @Override // i.a.e1.c.u0, i.a.e1.c.m
            public void onError(Throwable e2) {
            }

            @Override // i.a.e1.c.u0, i.a.e1.c.m
            public void onSubscribe(i.a.e1.d.f d2) {
            }

            @Override // i.a.e1.c.u0
            public void onSuccess(T t) {
            }
        }

        public a(Subscriber<? super T> downstream) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void drain() {
        }

        public void drainLoop() {
        }

        public i.a.e1.h.c.p<T> getOrCreateQueue() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable ex) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        public void otherError(Throwable ex) {
        }

        public void otherSuccess(T value) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    public l2(i.a.e1.c.s<T> source, i.a.e1.c.x0<? extends T> other) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> subscriber) {
    }
}
