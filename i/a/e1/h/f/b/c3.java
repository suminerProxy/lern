package i.a.e1.h.f.b;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* compiled from: FlowableReduceSeedSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class c3<T, R> extends i.a.e1.c.r0<R> {
    public final Publisher<T> b;
    public final R c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.c<R, ? super T, R> f26900d;

    /* compiled from: FlowableReduceSeedSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> implements i.a.e1.c.x<T>, i.a.e1.d.f {
        public final i.a.e1.c.u0<? super R> b;
        public final i.a.e1.g.c<R, ? super T, R> c;

        /* renamed from: d  reason: collision with root package name */
        public R f26901d;

        /* renamed from: e  reason: collision with root package name */
        public Subscription f26902e;

        public a(i.a.e1.c.u0<? super R> actual, i.a.e1.g.c<R, ? super T, R> reducer, R value) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable e2) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T value) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }
    }

    public c3(Publisher<T> source, R seed, i.a.e1.g.c<R, ? super T, R> reducer) {
    }

    @Override // i.a.e1.c.r0
    public void M1(i.a.e1.c.u0<? super R> observer) {
    }
}
