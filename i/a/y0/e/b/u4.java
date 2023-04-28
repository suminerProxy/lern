package i.a.y0.e.b;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableWindowBoundarySelector.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class u4<T, B, V> extends i.a.y0.e.b.a<T, i.a.l<T>> {

    /* renamed from: d  reason: collision with root package name */
    public final Publisher<B> f28533d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.x0.o<? super B, ? extends Publisher<V>> f28534e;

    /* renamed from: f  reason: collision with root package name */
    public final int f28535f;

    /* compiled from: FlowableWindowBoundarySelector.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, V> extends i.a.h1.b<V> {
        public final c<T, ?, V> c;

        /* renamed from: d  reason: collision with root package name */
        public final i.a.d1.h<T> f28536d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f28537e;

        public a(c<T, ?, V> cVar, i.a.d1.h<T> hVar) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(V v) {
        }
    }

    /* compiled from: FlowableWindowBoundarySelector.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, B> extends i.a.h1.b<B> {
        public final c<T, B, ?> c;

        public b(c<T, B, ?> cVar) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(B b) {
        }
    }

    /* compiled from: FlowableWindowBoundarySelector.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T, B, V> extends i.a.y0.h.n<T, Object, i.a.l<T>> implements Subscription {
        public final Publisher<B> D0;
        public final i.a.x0.o<? super B, ? extends Publisher<V>> E0;
        public final int F0;
        public final i.a.u0.b G0;
        public Subscription H0;
        public final AtomicReference<i.a.u0.c> I0;
        public final List<i.a.d1.h<T>> J0;
        public final AtomicLong K0;
        public final AtomicBoolean L0;

        public c(Subscriber<? super i.a.l<T>> subscriber, Publisher<B> publisher, i.a.x0.o<? super B, ? extends Publisher<V>> oVar, int i2) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void dispose() {
        }

        @Override // i.a.y0.h.n, i.a.y0.j.u
        public boolean f(Subscriber<? super i.a.l<T>> subscriber, Object obj) {
        }

        public void l(a<T, V> aVar) {
        }

        public void m() {
        }

        public void n(Throwable th) {
        }

        public void o(B b) {
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

    /* compiled from: FlowableWindowBoundarySelector.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class d<T, B> {

        /* renamed from: a  reason: collision with root package name */
        public final i.a.d1.h<T> f28538a;
        public final B b;

        public d(i.a.d1.h<T> hVar, B b) {
        }
    }

    public u4(i.a.l<T> lVar, Publisher<B> publisher, i.a.x0.o<? super B, ? extends Publisher<V>> oVar, int i2) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super i.a.l<T>> subscriber) {
    }
}
