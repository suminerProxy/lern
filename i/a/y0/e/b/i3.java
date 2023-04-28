package i.a.y0.e.b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableSampleTimed.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class i3<T> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final long f28303d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeUnit f28304e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.j0 f28305f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f28306g;

    /* compiled from: FlowableSampleTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends c<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        public final AtomicInteger wip;

        public a(Subscriber<? super T> subscriber, long j2, TimeUnit timeUnit, i.a.j0 j0Var) {
        }

        @Override // i.a.y0.e.b.i3.c
        public void complete() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: FlowableSampleTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        public b(Subscriber<? super T> subscriber, long j2, TimeUnit timeUnit, i.a.j0 j0Var) {
        }

        @Override // i.a.y0.e.b.i3.c
        public void complete() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: FlowableSampleTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class c<T> extends AtomicReference<T> implements i.a.q<T>, Subscription, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        public final Subscriber<? super T> downstream;
        public final long period;
        public final AtomicLong requested;
        public final i.a.j0 scheduler;
        public final i.a.y0.a.h timer;
        public final TimeUnit unit;
        public Subscription upstream;

        public c(Subscriber<? super T> subscriber, long j2, TimeUnit timeUnit, i.a.j0 j0Var) {
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

    public i3(i.a.l<T> lVar, long j2, TimeUnit timeUnit, i.a.j0 j0Var, boolean z) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
