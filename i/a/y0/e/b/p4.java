package i.a.y0.e.b;

import java.util.Collection;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscription;

/* compiled from: FlowableToListSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class p4<T, U extends Collection<? super T>> extends i.a.k0<U> implements i.a.y0.c.b<U> {
    public final i.a.l<T> b;
    public final Callable<U> c;

    /* compiled from: FlowableToListSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, U extends Collection<? super T>> implements i.a.q<T>, i.a.u0.c {
        public final i.a.n0<? super U> b;
        public Subscription c;

        /* renamed from: d  reason: collision with root package name */
        public U f28419d;

        public a(i.a.n0<? super U> n0Var, U u) {
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

    public p4(i.a.l<T> lVar) {
    }

    @Override // i.a.k0
    public void b1(i.a.n0<? super U> n0Var) {
    }

    @Override // i.a.y0.c.b
    public i.a.l<U> c() {
    }

    public p4(i.a.l<T> lVar, Callable<U> callable) {
    }
}
