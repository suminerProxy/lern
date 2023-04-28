package i.a.e1.h.f.b;

import org.reactivestreams.Subscription;

/* compiled from: FlowableCollectSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class s<T, U> extends i.a.e1.c.r0<U> implements i.a.e1.h.c.d<U> {
    public final i.a.e1.c.s<T> b;
    public final i.a.e1.g.s<? extends U> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.b<? super U, ? super T> f27147d;

    /* compiled from: FlowableCollectSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, U> implements i.a.e1.c.x<T>, i.a.e1.d.f {
        public final i.a.e1.c.u0<? super U> b;
        public final i.a.e1.g.b<? super U, ? super T> c;

        /* renamed from: d  reason: collision with root package name */
        public final U f27148d;

        /* renamed from: e  reason: collision with root package name */
        public Subscription f27149e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f27150f;

        public a(i.a.e1.c.u0<? super U> actual, U u, i.a.e1.g.b<? super U, ? super T> collector) {
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
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }
    }

    public s(i.a.e1.c.s<T> source, i.a.e1.g.s<? extends U> initialSupplier, i.a.e1.g.b<? super U, ? super T> collector) {
    }

    @Override // i.a.e1.c.r0
    public void M1(i.a.e1.c.u0<? super U> observer) {
    }

    @Override // i.a.e1.h.c.d
    public i.a.e1.c.s<U> c() {
    }
}
