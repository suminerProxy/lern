package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowablePublishMulticast.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class x2<T, R> extends i.a.e1.h.f.b.a<T, R> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super i.a.e1.c.s<T>, ? extends Publisher<? extends R>> f27221d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27222e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f27223f;

    /* compiled from: FlowablePublishMulticast.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends i.a.e1.c.s<T> implements i.a.e1.c.x<T>, i.a.e1.d.f {

        /* renamed from: n  reason: collision with root package name */
        public static final b[] f27224n = null;

        /* renamed from: o  reason: collision with root package name */
        public static final b[] f27225o = null;
        public final AtomicInteger c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReference<b<T>[]> f27226d;

        /* renamed from: e  reason: collision with root package name */
        public final int f27227e;

        /* renamed from: f  reason: collision with root package name */
        public final int f27228f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f27229g;

        /* renamed from: h  reason: collision with root package name */
        public final AtomicReference<Subscription> f27230h;

        /* renamed from: i  reason: collision with root package name */
        public volatile i.a.e1.h.c.q<T> f27231i;

        /* renamed from: j  reason: collision with root package name */
        public int f27232j;

        /* renamed from: k  reason: collision with root package name */
        public volatile boolean f27233k;

        /* renamed from: l  reason: collision with root package name */
        public Throwable f27234l;

        /* renamed from: m  reason: collision with root package name */
        public int f27235m;

        public a(int prefetch, boolean delayError) {
        }

        @Override // i.a.e1.c.s
        public void F6(Subscriber<? super T> s) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public boolean e9(b<T> s) {
        }

        public void f9() {
        }

        public void g9() {
        }

        public void h9(Throwable ex) {
        }

        public void i9(b<T> s) {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
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

    /* compiled from: FlowablePublishMulticast.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends AtomicLong implements Subscription {
        private static final long serialVersionUID = 8664815189257569791L;
        public final Subscriber<? super T> downstream;
        public long emitted;
        public final a<T> parent;

        public b(Subscriber<? super T> actual, a<T> parent) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public boolean isCancelled() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    /* compiled from: FlowablePublishMulticast.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<R> implements i.a.e1.c.x<R>, Subscription {
        public final Subscriber<? super R> b;
        public final a<?> c;

        /* renamed from: d  reason: collision with root package name */
        public Subscription f27236d;

        public c(Subscriber<? super R> actual, a<?> processor) {
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
        public void onNext(R t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    public x2(i.a.e1.c.s<T> source, i.a.e1.g.o<? super i.a.e1.c.s<T>, ? extends Publisher<? extends R>> selector, int prefetch, boolean delayError) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super R> s) {
    }
}
