package i.a.y0.e.b;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableBufferBoundarySupplier.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class o<T, U extends Collection<? super T>, B> extends i.a.y0.e.b.a<T, U> {

    /* renamed from: d  reason: collision with root package name */
    public final Callable<? extends Publisher<B>> f28392d;

    /* renamed from: e  reason: collision with root package name */
    public final Callable<U> f28393e;

    /* compiled from: FlowableBufferBoundarySupplier.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, U extends Collection<? super T>, B> extends i.a.h1.b<B> {
        public final b<T, U, B> c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f28394d;

        public a(b<T, U, B> bVar) {
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

    /* compiled from: FlowableBufferBoundarySupplier.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, U extends Collection<? super T>, B> extends i.a.y0.h.n<T, U, U> implements i.a.q<T>, Subscription, i.a.u0.c {
        public final Callable<U> D0;
        public final Callable<? extends Publisher<B>> E0;
        public Subscription F0;
        public final AtomicReference<i.a.u0.c> G0;
        public U H0;

        public b(Subscriber<? super U> subscriber, Callable<U> callable, Callable<? extends Publisher<B>> callable2) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.y0.h.n, i.a.y0.j.u
        public /* bridge */ /* synthetic */ boolean f(Subscriber subscriber, Object obj) {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        public boolean l(Subscriber<? super U> subscriber, U u) {
        }

        public void m() {
        }

        public void n() {
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

    public o(i.a.l<T> lVar, Callable<? extends Publisher<B>> callable, Callable<U> callable2) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super U> subscriber) {
    }
}
