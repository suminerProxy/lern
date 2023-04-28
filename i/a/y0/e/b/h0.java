package i.a.y0.e.b;

import i.a.j0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableDebounceTimed.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class h0<T> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final long f28291d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeUnit f28292e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.j0 f28293f;

    /* compiled from: FlowableDebounceTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicReference<i.a.u0.c> implements Runnable, i.a.u0.c {
        private static final long serialVersionUID = 6812032969491025141L;
        public final long idx;
        public final AtomicBoolean once;
        public final b<T> parent;
        public final T value;

        public a(T t, long j2, b<T> bVar) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void emit() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public void setResource(i.a.u0.c cVar) {
        }
    }

    /* compiled from: FlowableDebounceTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends AtomicLong implements i.a.q<T>, Subscription {
        private static final long serialVersionUID = -9102637559663639004L;
        public boolean done;
        public final Subscriber<? super T> downstream;
        public volatile long index;
        public final long timeout;
        public i.a.u0.c timer;
        public final TimeUnit unit;
        public Subscription upstream;
        public final j0.c worker;

        public b(Subscriber<? super T> subscriber, long j2, TimeUnit timeUnit, j0.c cVar) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void emit(long j2, T t, a<T> aVar) {
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

    public h0(i.a.l<T> lVar, long j2, TimeUnit timeUnit, i.a.j0 j0Var) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
