package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableCache.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class r<T> extends i.a.y0.e.b.a<T, T> implements i.a.q<T> {

    /* renamed from: m  reason: collision with root package name */
    public static final a[] f28432m = null;

    /* renamed from: n  reason: collision with root package name */
    public static final a[] f28433n = null;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f28434d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28435e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReference<a<T>[]> f28436f;

    /* renamed from: g  reason: collision with root package name */
    public volatile long f28437g;

    /* renamed from: h  reason: collision with root package name */
    public final b<T> f28438h;

    /* renamed from: i  reason: collision with root package name */
    public b<T> f28439i;

    /* renamed from: j  reason: collision with root package name */
    public int f28440j;

    /* renamed from: k  reason: collision with root package name */
    public Throwable f28441k;

    /* renamed from: l  reason: collision with root package name */
    public volatile boolean f28442l;

    /* compiled from: FlowableCache.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = 6770240836423125754L;
        public final Subscriber<? super T> downstream;
        public long index;
        public b<T> node;
        public int offset;
        public final r<T> parent;
        public final AtomicLong requested;

        public a(Subscriber<? super T> subscriber, r<T> rVar) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    /* compiled from: FlowableCache.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T[] f28443a;
        public volatile b<T> b;

        public b(int i2) {
        }
    }

    public r(i.a.l<T> lVar, int i2) {
    }

    public void I8(a<T> aVar) {
    }

    public long J8() {
    }

    public boolean K8() {
    }

    public boolean L8() {
    }

    public void M8(a<T> aVar) {
    }

    public void N8(a<T> aVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
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
