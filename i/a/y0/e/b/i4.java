package i.a.y0.e.b;

import i.a.j0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableThrottleFirstTimed.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class i4<T> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final long f28307d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeUnit f28308e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.j0 f28309f;

    /* compiled from: FlowableThrottleFirstTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicLong implements i.a.q<T>, Subscription, Runnable {
        private static final long serialVersionUID = -9102637559663639004L;
        public boolean done;
        public final Subscriber<? super T> downstream;
        public volatile boolean gate;
        public final long timeout;
        public final i.a.y0.a.h timer;
        public final TimeUnit unit;
        public Subscription upstream;
        public final j0.c worker;

        public a(Subscriber<? super T> subscriber, long j2, TimeUnit timeUnit, j0.c cVar) {
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

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public i4(i.a.l<T> lVar, long j2, TimeUnit timeUnit, i.a.j0 j0Var) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
