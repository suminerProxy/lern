package i.a.y0.e.b;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* compiled from: FlowableReduceSeedSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class x2<T, R> extends i.a.k0<R> {
    public final Publisher<T> b;
    public final R c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.c<R, ? super T, R> f28578d;

    /* compiled from: FlowableReduceSeedSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> implements i.a.q<T>, i.a.u0.c {
        public final i.a.n0<? super R> b;
        public final i.a.x0.c<R, ? super T, R> c;

        /* renamed from: d  reason: collision with root package name */
        public R f28579d;

        /* renamed from: e  reason: collision with root package name */
        public Subscription f28580e;

        public a(i.a.n0<? super R> n0Var, i.a.x0.c<R, ? super T, R> cVar, R r) {
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

    public x2(Publisher<T> publisher, R r, i.a.x0.c<R, ? super T, R> cVar) {
    }

    @Override // i.a.k0
    public void b1(i.a.n0<? super R> n0Var) {
    }
}
