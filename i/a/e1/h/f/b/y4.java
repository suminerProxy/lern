package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableWindowBoundary.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class y4<T, B> extends i.a.e1.h.f.b.a<T, i.a.e1.c.s<T>> {

    /* renamed from: d  reason: collision with root package name */
    public final Publisher<B> f27255d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27256e;

    /* compiled from: FlowableWindowBoundary.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, B> extends i.a.e1.p.b<B> {
        public final b<T, B> c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f27257d;

        public a(b<T, B> parent) {
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
    }

    /* compiled from: FlowableWindowBoundary.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, B> extends AtomicInteger implements i.a.e1.c.x<T>, Subscription, Runnable {
        public static final Object NEXT_WINDOW = null;
        private static final long serialVersionUID = 2233020065421370272L;
        public final a<T, B> boundarySubscriber;
        public final int capacityHint;
        public volatile boolean done;
        public final Subscriber<? super i.a.e1.c.s<T>> downstream;
        public long emitted;
        public final i.a.e1.h.k.c errors;
        public final i.a.e1.h.g.a<Object> queue;
        public final AtomicLong requested;
        public final AtomicBoolean stopWindows;
        public final AtomicReference<Subscription> upstream;
        public i.a.e1.m.h<T> window;
        public final AtomicInteger windows;

        public b(Subscriber<? super i.a.e1.c.s<T>> downstream, int capacityHint) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void drain() {
        }

        public void innerComplete() {
        }

        public void innerError(Throwable e2) {
        }

        public void innerNext() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable e2) {
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

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public y4(i.a.e1.c.s<T> source, Publisher<B> other, int capacityHint) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super i.a.e1.c.s<T>> subscriber) {
    }
}
