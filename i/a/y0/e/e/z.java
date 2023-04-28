package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableConcatWithSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class z<T> extends i.a.y0.e.e.a<T, T> {
    public final i.a.q0<? extends T> c;

    /* compiled from: ObservableConcatWithSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicReference<i.a.u0.c> implements i.a.i0<T>, i.a.n0<T>, i.a.u0.c {
        private static final long serialVersionUID = -1953724749712440952L;
        public final i.a.i0<? super T> downstream;
        public boolean inSingle;
        public i.a.q0<? extends T> other;

        public a(i.a.i0<? super T> i0Var, i.a.q0<? extends T> q0Var) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // i.a.i0
        public void onComplete() {
        }

        @Override // i.a.i0
        public void onError(Throwable th) {
        }

        @Override // i.a.i0
        public void onNext(T t) {
        }

        @Override // i.a.i0
        public void onSubscribe(i.a.u0.c cVar) {
        }

        @Override // i.a.n0
        public void onSuccess(T t) {
        }
    }

    public z(i.a.b0<T> b0Var, i.a.q0<? extends T> q0Var) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super T> i0Var) {
    }
}
