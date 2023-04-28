package i.a.e1.h.f.b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableSampleTimed.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class n3<T> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final long f27058d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeUnit f27059e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.e1.c.q0 f27060f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f27061g;

    /* compiled from: FlowableSampleTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends c<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        public final AtomicInteger wip;

        public a(Subscriber<? super T> actual, long period, TimeUnit unit, i.a.e1.c.q0 scheduler) {
        }

        @Override // i.a.e1.h.f.b.n3.c
        public void complete() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: FlowableSampleTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        public b(Subscriber<? super T> actual, long period, TimeUnit unit, i.a.e1.c.q0 scheduler) {
        }

        @Override // i.a.e1.h.f.b.n3.c
        public void complete() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: FlowableSampleTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class c<T> extends AtomicReference<T> implements i.a.e1.c.x<T>, Subscription, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        public final Subscriber<? super T> downstream;
        public final long period;
        public final AtomicLong requested;
        public final i.a.e1.c.q0 scheduler;
        public final i.a.e1.h.a.f timer;
        public final TimeUnit unit;
        public Subscription upstream;

        public c(Subscriber<? super T> actual, long period, TimeUnit unit, i.a.e1.c.q0 scheduler) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void cancelTimer() {
        }

        public abstract void complete();

        public void emit() {
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

    public n3(i.a.e1.c.s<T> source, long period, TimeUnit unit, i.a.e1.c.q0 scheduler, boolean emitLast) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
