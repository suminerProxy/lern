package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableCache.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class q<T> extends i.a.e1.h.f.b.a<T, T> implements i.a.e1.c.x<T> {

    /* renamed from: m  reason: collision with root package name */
    public static final a[] f27100m = null;

    /* renamed from: n  reason: collision with root package name */
    public static final a[] f27101n = null;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f27102d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27103e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReference<a<T>[]> f27104f;

    /* renamed from: g  reason: collision with root package name */
    public volatile long f27105g;

    /* renamed from: h  reason: collision with root package name */
    public final b<T> f27106h;

    /* renamed from: i  reason: collision with root package name */
    public b<T> f27107i;

    /* renamed from: j  reason: collision with root package name */
    public int f27108j;

    /* renamed from: k  reason: collision with root package name */
    public Throwable f27109k;

    /* renamed from: l  reason: collision with root package name */
    public volatile boolean f27110l;

    /* compiled from: FlowableCache.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = 6770240836423125754L;
        public final Subscriber<? super T> downstream;
        public long index;
        public b<T> node;
        public int offset;
        public final q<T> parent;
        public final AtomicLong requested;

        public a(Subscriber<? super T> downstream, q<T> parent) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    /* compiled from: FlowableCache.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T[] f27111a;
        public volatile b<T> b;

        public b(int capacityHint) {
        }
    }

    public q(i.a.e1.c.s<T> source, int capacityHint) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> t) {
    }

    public void e9(a<T> consumer) {
    }

    public long f9() {
    }

    public boolean g9() {
    }

    public boolean h9() {
    }

    public void i9(a<T> consumer) {
    }

    public void j9(a<T> consumer) {
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
