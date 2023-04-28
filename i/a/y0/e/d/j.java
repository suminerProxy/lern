package i.a.y0.e.d;

import i.a.b0;
import i.a.g0;
import i.a.i0;
import i.a.v;
import i.a.y;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeFlatMapObservable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class j<T, R> extends b0<R> {
    public final y<T> b;
    public final i.a.x0.o<? super T, ? extends g0<? extends R>> c;

    /* compiled from: MaybeFlatMapObservable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends AtomicReference<i.a.u0.c> implements i0<R>, v<T>, i.a.u0.c {
        private static final long serialVersionUID = -8948264376121066672L;
        public final i0<? super R> downstream;
        public final i.a.x0.o<? super T, ? extends g0<? extends R>> mapper;

        public a(i0<? super R> i0Var, i.a.x0.o<? super T, ? extends g0<? extends R>> oVar) {
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
        public void onNext(R r) {
        }

        @Override // i.a.i0
        public void onSubscribe(i.a.u0.c cVar) {
        }

        @Override // i.a.v, i.a.n0
        public void onSuccess(T t) {
        }
    }

    public j(y<T> yVar, i.a.x0.o<? super T, ? extends g0<? extends R>> oVar) {
    }

    @Override // i.a.b0
    public void subscribeActual(i0<? super R> i0Var) {
    }
}
