package i.a.e1.h.f.b;

import i.a.e1.c.q0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableThrottleLatest.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class o4<T> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final long f27075d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeUnit f27076e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.e1.c.q0 f27077f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f27078g;

    /* compiled from: FlowableThrottleLatest.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicInteger implements i.a.e1.c.x<T>, Subscription, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final Subscriber<? super T> downstream;
        public final boolean emitLast;
        public long emitted;
        public Throwable error;
        public final AtomicReference<T> latest;
        public final AtomicLong requested;
        public final long timeout;
        public volatile boolean timerFired;
        public boolean timerRunning;
        public final TimeUnit unit;
        public Subscription upstream;
        public final q0.c worker;

        public a(Subscriber<? super T> downstream, long timeout, TimeUnit unit, q0.c worker, boolean emitLast) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
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

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public o4(i.a.e1.c.s<T> source, long timeout, TimeUnit unit, i.a.e1.c.q0 scheduler, boolean emitLast) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
