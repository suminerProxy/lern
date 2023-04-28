package i.a.e1.h.f.b;

import i.a.e1.c.q0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableDebounceTimed.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class g0<T> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final long f26965d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeUnit f26966e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.e1.c.q0 f26967f;

    /* compiled from: FlowableDebounceTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<i.a.e1.d.f> implements Runnable, i.a.e1.d.f {
        private static final long serialVersionUID = 6812032969491025141L;
        public final long idx;
        public final AtomicBoolean once;
        public final b<T> parent;
        public final T value;

        public a(T value, long idx, b<T> parent) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void emit() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public void setResource(i.a.e1.d.f d2) {
        }
    }

    /* compiled from: FlowableDebounceTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends AtomicLong implements i.a.e1.c.x<T>, Subscription {
        private static final long serialVersionUID = -9102637559663639004L;
        public boolean done;
        public final Subscriber<? super T> downstream;
        public volatile long index;
        public final long timeout;
        public i.a.e1.d.f timer;
        public final TimeUnit unit;
        public Subscription upstream;
        public final q0.c worker;

        public b(Subscriber<? super T> actual, long timeout, TimeUnit unit, q0.c worker) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void emit(long idx, T t, a<T> emitter) {
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

    public g0(i.a.e1.c.s<T> source, long timeout, TimeUnit unit, i.a.e1.c.q0 scheduler) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
