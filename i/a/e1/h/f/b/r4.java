package i.a.e1.h.f.b;

import i.a.e1.c.q0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableTimeoutTimed.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class r4<T> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final long f27143d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeUnit f27144e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.e1.c.q0 f27145f;

    /* renamed from: g  reason: collision with root package name */
    public final Publisher<? extends T> f27146g;

    /* compiled from: FlowableTimeoutTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> implements i.a.e1.c.x<T> {
        public final Subscriber<? super T> b;
        public final i.a.e1.h.j.i c;

        public a(Subscriber<? super T> actual, i.a.e1.h.j.i arbiter) {
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
    }

    /* compiled from: FlowableTimeoutTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends i.a.e1.h.j.i implements i.a.e1.c.x<T>, d {
        private static final long serialVersionUID = 3764492702657003550L;
        public long consumed;
        public final Subscriber<? super T> downstream;
        public Publisher<? extends T> fallback;
        public final AtomicLong index;
        public final i.a.e1.h.a.f task;
        public final long timeout;
        public final TimeUnit unit;
        public final AtomicReference<Subscription> upstream;
        public final q0.c worker;

        public b(Subscriber<? super T> actual, long timeout, TimeUnit unit, q0.c worker, Publisher<? extends T> fallback) {
        }

        @Override // i.a.e1.h.j.i, org.reactivestreams.Subscription
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

        @Override // i.a.e1.h.f.b.r4.d
        public void onTimeout(long idx) {
        }

        public void startTimeout(long nextIndex) {
        }
    }

    /* compiled from: FlowableTimeoutTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T> extends AtomicLong implements i.a.e1.c.x<T>, Subscription, d {
        private static final long serialVersionUID = 3764492702657003550L;
        public final Subscriber<? super T> downstream;
        public final AtomicLong requested;
        public final i.a.e1.h.a.f task;
        public final long timeout;
        public final TimeUnit unit;
        public final AtomicReference<Subscription> upstream;
        public final q0.c worker;

        public c(Subscriber<? super T> actual, long timeout, TimeUnit unit, q0.c worker) {
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

        @Override // i.a.e1.h.f.b.r4.d
        public void onTimeout(long idx) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        public void startTimeout(long nextIndex) {
        }
    }

    /* compiled from: FlowableTimeoutTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface d {
        void onTimeout(long idx);
    }

    /* compiled from: FlowableTimeoutTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class e implements Runnable {
        public final d b;
        public final long c;

        public e(long idx, d parent) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public r4(i.a.e1.c.s<T> source, long timeout, TimeUnit unit, i.a.e1.c.q0 scheduler, Publisher<? extends T> other) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
