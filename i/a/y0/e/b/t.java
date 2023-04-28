package i.a.y0.e.b;

import java.util.concurrent.Callable;
import org.reactivestreams.Subscription;

/* compiled from: FlowableCollectSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class t<T, U> extends i.a.k0<U> implements i.a.y0.c.b<U> {
    public final i.a.l<T> b;
    public final Callable<? extends U> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.b<? super U, ? super T> f28500d;

    /* compiled from: FlowableCollectSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, U> implements i.a.q<T>, i.a.u0.c {
        public final i.a.n0<? super U> b;
        public final i.a.x0.b<? super U, ? super T> c;

        /* renamed from: d  reason: collision with root package name */
        public final U f28501d;

        /* renamed from: e  reason: collision with root package name */
        public Subscription f28502e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f28503f;

        public a(i.a.n0<? super U> n0Var, U u, i.a.x0.b<? super U, ? super T> bVar) {
        }

        @Override // i.a.u0.c
        public void dispose() {
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

    public t(i.a.l<T> lVar, Callable<? extends U> callable, i.a.x0.b<? super U, ? super T> bVar) {
    }

    @Override // i.a.k0
    public void b1(i.a.n0<? super U> n0Var) {
    }

    @Override // i.a.y0.c.b
    public i.a.l<U> c() {
    }
}
