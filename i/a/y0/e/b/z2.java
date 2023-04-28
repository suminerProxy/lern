package i.a.y0.e.b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableRefCount.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class z2<T> extends i.a.l<T> {
    public final i.a.w0.a<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final int f28609d;

    /* renamed from: e  reason: collision with root package name */
    public final long f28610e;

    /* renamed from: f  reason: collision with root package name */
    public final TimeUnit f28611f;

    /* renamed from: g  reason: collision with root package name */
    public final i.a.j0 f28612g;

    /* renamed from: h  reason: collision with root package name */
    public a f28613h;

    /* compiled from: FlowableRefCount.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a extends AtomicReference<i.a.u0.c> implements Runnable, i.a.x0.g<i.a.u0.c> {
        private static final long serialVersionUID = -4552101107598366241L;
        public boolean connected;
        public boolean disconnectedEarly;
        public final z2<?> parent;
        public long subscriberCount;
        public i.a.u0.c timer;

        public a(z2<?> z2Var) {
        }

        @Override // i.a.x0.g
        public /* bridge */ /* synthetic */ void accept(i.a.u0.c cVar) throws Exception {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        /* renamed from: accept  reason: avoid collision after fix types in other method */
        public void accept2(i.a.u0.c cVar) throws Exception {
        }
    }

    /* compiled from: FlowableRefCount.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends AtomicBoolean implements i.a.q<T>, Subscription {
        private static final long serialVersionUID = -7419642935409022375L;
        public final a connection;
        public final Subscriber<? super T> downstream;
        public final z2<T> parent;
        public Subscription upstream;

        public b(Subscriber<? super T> subscriber, z2<T> z2Var, a aVar) {
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
    }

    public z2(i.a.w0.a<T> aVar) {
    }

    public void I8(a aVar) {
    }

    public void J8(a aVar) {
    }

    public void K8(a aVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }

    public z2(i.a.w0.a<T> aVar, int i2, long j2, TimeUnit timeUnit, i.a.j0 j0Var) {
    }
}
