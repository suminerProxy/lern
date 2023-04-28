package i.a.y0.e.g;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* compiled from: SingleTakeUntil.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class r0<T, U> extends i.a.k0<T> {
    public final i.a.q0<T> b;
    public final Publisher<U> c;

    /* compiled from: SingleTakeUntil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicReference<i.a.u0.c> implements i.a.n0<T>, i.a.u0.c {
        private static final long serialVersionUID = -622603812305745221L;
        public final i.a.n0<? super T> downstream;
        public final b other;

        public a(i.a.n0<? super T> n0Var) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // i.a.n0
        public void onError(Throwable th) {
        }

        @Override // i.a.n0
        public void onSubscribe(i.a.u0.c cVar) {
        }

        @Override // i.a.n0
        public void onSuccess(T t) {
        }

        public void otherError(Throwable th) {
        }
    }

    /* compiled from: SingleTakeUntil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b extends AtomicReference<Subscription> implements i.a.q<Object> {
        private static final long serialVersionUID = 5170026210238877381L;
        public final a<?> parent;

        public b(a<?> aVar) {
        }

        public void dispose() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }
    }

    public r0(i.a.q0<T> q0Var, Publisher<U> publisher) {
    }

    @Override // i.a.k0
    public void b1(i.a.n0<? super T> n0Var) {
    }
}
