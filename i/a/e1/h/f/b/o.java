package i.a.e1.h.f.b;

import java.util.Collection;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableBufferExactBoundary.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class o<T, U extends Collection<? super T>, B> extends i.a.e1.h.f.b.a<T, U> {

    /* renamed from: d  reason: collision with root package name */
    public final Publisher<B> f27065d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.g.s<U> f27066e;

    /* compiled from: FlowableBufferExactBoundary.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, U extends Collection<? super T>, B> extends i.a.e1.p.b<B> {
        public final b<T, U, B> c;

        public a(b<T, U, B> parent) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(B t) {
        }
    }

    /* compiled from: FlowableBufferExactBoundary.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, U extends Collection<? super T>, B> extends i.a.e1.h.i.n<T, U, U> implements i.a.e1.c.x<T>, Subscription, i.a.e1.d.f {
        public final i.a.e1.g.s<U> D0;
        public final Publisher<B> E0;
        public Subscription F0;
        public i.a.e1.d.f G0;
        public U H0;

        public b(Subscriber<? super U> actual, i.a.e1.g.s<U> bufferSupplier, Publisher<B> boundary) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.h.i.n, i.a.e1.h.k.u
        public /* bridge */ /* synthetic */ boolean f(Subscriber a2, Object v) {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        public boolean l(Subscriber<? super U> a2, U v) {
        }

        public void m() {
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

    public o(i.a.e1.c.s<T> source, Publisher<B> boundary, i.a.e1.g.s<U> bufferSupplier) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super U> s) {
    }
}
