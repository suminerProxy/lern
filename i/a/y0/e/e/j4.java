package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableWithLatestFrom.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class j4<T, U, R> extends i.a.y0.e.e.a<T, R> {
    public final i.a.x0.c<? super T, ? super U, ? extends R> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.g0<? extends U> f28826d;

    /* compiled from: ObservableWithLatestFrom.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, U, R> extends AtomicReference<U> implements i.a.i0<T>, i.a.u0.c {
        private static final long serialVersionUID = -312246233408980075L;
        public final i.a.x0.c<? super T, ? super U, ? extends R> combiner;
        public final i.a.i0<? super R> downstream;
        public final AtomicReference<i.a.u0.c> other;
        public final AtomicReference<i.a.u0.c> upstream;

        public a(i.a.i0<? super R> i0Var, i.a.x0.c<? super T, ? super U, ? extends R> cVar) {
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

        public void otherError(Throwable th) {
        }

        public boolean setOther(i.a.u0.c cVar) {
        }
    }

    /* compiled from: ObservableWithLatestFrom.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class b implements i.a.i0<U> {
        private final a<T, U, R> b;
        public final /* synthetic */ j4 c;

        public b(j4 j4Var, a<T, U, R> aVar) {
        }

        @Override // i.a.i0
        public void onComplete() {
        }

        @Override // i.a.i0
        public void onError(Throwable th) {
        }

        @Override // i.a.i0
        public void onNext(U u) {
        }

        @Override // i.a.i0
        public void onSubscribe(i.a.u0.c cVar) {
        }
    }

    public j4(i.a.g0<T> g0Var, i.a.x0.c<? super T, ? super U, ? extends R> cVar, i.a.g0<? extends U> g0Var2) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super R> i0Var) {
    }
}
