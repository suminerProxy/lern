package i.a.y0.e.b;

import i.a.j0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableTimeoutTimed.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class m4<T> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final long f28371d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeUnit f28372e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.j0 f28373f;

    /* renamed from: g  reason: collision with root package name */
    public final Publisher<? extends T> f28374g;

    /* compiled from: FlowableTimeoutTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> implements i.a.q<T> {
        public final Subscriber<? super T> b;
        public final i.a.y0.i.i c;

        public a(Subscriber<? super T> subscriber, i.a.y0.i.i iVar) {
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
    }

    /* compiled from: FlowableTimeoutTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends i.a.y0.i.i implements i.a.q<T>, d {
        private static final long serialVersionUID = 3764492702657003550L;
        public long consumed;
        public final Subscriber<? super T> downstream;
        public Publisher<? extends T> fallback;
        public final AtomicLong index;
        public final i.a.y0.a.h task;
        public final long timeout;
        public final TimeUnit unit;
        public final AtomicReference<Subscription> upstream;
        public final j0.c worker;

        public b(Subscriber<? super T> subscriber, long j2, TimeUnit timeUnit, j0.c cVar, Publisher<? extends T> publisher) {
        }

        @Override // i.a.y0.i.i, org.reactivestreams.Subscription
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

        @Override // i.a.y0.e.b.m4.d
        public void onTimeout(long j2) {
        }

        public void startTimeout(long j2) {
        }
    }

    /* compiled from: FlowableTimeoutTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T> extends AtomicLong implements i.a.q<T>, Subscription, d {
        private static final long serialVersionUID = 3764492702657003550L;
        public final Subscriber<? super T> downstream;
        public final AtomicLong requested;
        public final i.a.y0.a.h task;
        public final long timeout;
        public final TimeUnit unit;
        public final AtomicReference<Subscription> upstream;
        public final j0.c worker;

        public c(Subscriber<? super T> subscriber, long j2, TimeUnit timeUnit, j0.c cVar) {
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

        @Override // i.a.y0.e.b.m4.d
        public void onTimeout(long j2) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }

        public void startTimeout(long j2) {
        }
    }

    /* compiled from: FlowableTimeoutTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface d {
        void onTimeout(long j2);
    }

    /* compiled from: FlowableTimeoutTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class e implements Runnable {
        public final d b;
        public final long c;

        public e(long j2, d dVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public m4(i.a.l<T> lVar, long j2, TimeUnit timeUnit, i.a.j0 j0Var, Publisher<? extends T> publisher) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
