package i.a.y0.e.c;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeFlatMapSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class f0<T, R> extends i.a.k0<R> {
    public final i.a.y<T> b;
    public final i.a.x0.o<? super T, ? extends i.a.q0<? extends R>> c;

    /* compiled from: MaybeFlatMapSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends AtomicReference<i.a.u0.c> implements i.a.v<T>, i.a.u0.c {
        private static final long serialVersionUID = 4827726964688405508L;
        public final i.a.n0<? super R> downstream;
        public final i.a.x0.o<? super T, ? extends i.a.q0<? extends R>> mapper;

        public a(i.a.n0<? super R> n0Var, i.a.x0.o<? super T, ? extends i.a.q0<? extends R>> oVar) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // i.a.v
        public void onComplete() {
        }

        @Override // i.a.v
        public void onError(Throwable th) {
        }

        @Override // i.a.v
        public void onSubscribe(i.a.u0.c cVar) {
        }

        @Override // i.a.v, i.a.n0
        public void onSuccess(T t) {
        }
    }

    /* compiled from: MaybeFlatMapSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<R> implements i.a.n0<R> {
        public final AtomicReference<i.a.u0.c> b;
        public final i.a.n0<? super R> c;

        public b(AtomicReference<i.a.u0.c> atomicReference, i.a.n0<? super R> n0Var) {
        }

        @Override // i.a.n0
        public void onError(Throwable th) {
        }

        @Override // i.a.n0
        public void onSubscribe(i.a.u0.c cVar) {
        }

        @Override // i.a.n0
        public void onSuccess(R r) {
        }
    }

    public f0(i.a.y<T> yVar, i.a.x0.o<? super T, ? extends i.a.q0<? extends R>> oVar) {
    }

    @Override // i.a.k0
    public void b1(i.a.n0<? super R> n0Var) {
    }
}
