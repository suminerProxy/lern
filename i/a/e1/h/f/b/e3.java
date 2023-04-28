package i.a.e1.h.f.b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableRefCount.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class e3<T> extends i.a.e1.c.s<T> {
    public final i.a.e1.f.a<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final int f26932d;

    /* renamed from: e  reason: collision with root package name */
    public final long f26933e;

    /* renamed from: f  reason: collision with root package name */
    public final TimeUnit f26934f;

    /* renamed from: g  reason: collision with root package name */
    public final i.a.e1.c.q0 f26935g;

    /* renamed from: h  reason: collision with root package name */
    public a f26936h;

    /* compiled from: FlowableRefCount.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a extends AtomicReference<i.a.e1.d.f> implements Runnable, i.a.e1.g.g<i.a.e1.d.f> {
        private static final long serialVersionUID = -4552101107598366241L;
        public boolean connected;
        public boolean disconnectedEarly;
        public final e3<?> parent;
        public long subscriberCount;
        public i.a.e1.d.f timer;

        public a(e3<?> parent) {
        }

        @Override // i.a.e1.g.g
        public /* bridge */ /* synthetic */ void accept(i.a.e1.d.f t) throws Throwable {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        /* renamed from: accept  reason: avoid collision after fix types in other method */
        public void accept2(i.a.e1.d.f t) {
        }
    }

    /* compiled from: FlowableRefCount.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends AtomicBoolean implements i.a.e1.c.x<T>, Subscription {
        private static final long serialVersionUID = -7419642935409022375L;
        public final a connection;
        public final Subscriber<? super T> downstream;
        public final e3<T> parent;
        public Subscription upstream;

        public b(Subscriber<? super T> actual, e3<T> parent, a connection) {
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

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    public e3(i.a.e1.f.a<T> source) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }

    public void e9(a rc) {
    }

    public void f9(a rc) {
    }

    public void g9(a rc) {
    }

    public e3(i.a.e1.f.a<T> source, int n2, long timeout, TimeUnit unit, i.a.e1.c.q0 scheduler) {
    }
}
