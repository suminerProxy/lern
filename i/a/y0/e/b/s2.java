package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowablePublishMulticast.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class s2<T, R> extends i.a.y0.e.b.a<T, R> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super i.a.l<T>, ? extends Publisher<? extends R>> f28479d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28480e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f28481f;

    /* compiled from: FlowablePublishMulticast.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends i.a.l<T> implements i.a.q<T>, i.a.u0.c {

        /* renamed from: n  reason: collision with root package name */
        public static final b[] f28482n = null;

        /* renamed from: o  reason: collision with root package name */
        public static final b[] f28483o = null;
        public final AtomicInteger c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReference<b<T>[]> f28484d;

        /* renamed from: e  reason: collision with root package name */
        public final int f28485e;

        /* renamed from: f  reason: collision with root package name */
        public final int f28486f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f28487g;

        /* renamed from: h  reason: collision with root package name */
        public final AtomicReference<Subscription> f28488h;

        /* renamed from: i  reason: collision with root package name */
        public volatile i.a.y0.c.o<T> f28489i;

        /* renamed from: j  reason: collision with root package name */
        public int f28490j;

        /* renamed from: k  reason: collision with root package name */
        public volatile boolean f28491k;

        /* renamed from: l  reason: collision with root package name */
        public Throwable f28492l;

        /* renamed from: m  reason: collision with root package name */
        public int f28493m;

        public a(int i2, boolean z) {
        }

        public boolean I8(b<T> bVar) {
        }

        public void J8() {
        }

        public void K8() {
        }

        public void L8(Throwable th) {
        }

        public void M8(b<T> bVar) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.l
        public void g6(Subscriber<? super T> subscriber) {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
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

    /* compiled from: FlowablePublishMulticast.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends AtomicLong implements Subscription {
        private static final long serialVersionUID = 8664815189257569791L;
        public final Subscriber<? super T> downstream;
        public long emitted;
        public final a<T> parent;

        public b(Subscriber<? super T> subscriber, a<T> aVar) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public boolean isCancelled() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    /* compiled from: FlowablePublishMulticast.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<R> implements i.a.q<R>, Subscription {
        public final Subscriber<? super R> b;
        public final a<?> c;

        /* renamed from: d  reason: collision with root package name */
        public Subscription f28494d;

        public c(Subscriber<? super R> subscriber, a<?> aVar) {
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
        public void onNext(R r) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    public s2(i.a.l<T> lVar, i.a.x0.o<? super i.a.l<T>, ? extends Publisher<? extends R>> oVar, int i2, boolean z) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super R> subscriber) {
    }
}
