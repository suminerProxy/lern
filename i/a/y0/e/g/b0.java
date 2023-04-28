package i.a.y0.e.g;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleFlatMapMaybe.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class b0<T, R> extends i.a.s<R> {
    public final i.a.q0<? extends T> b;
    public final i.a.x0.o<? super T, ? extends i.a.y<? extends R>> c;

    /* compiled from: SingleFlatMapMaybe.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<R> implements i.a.v<R> {
        public final AtomicReference<i.a.u0.c> b;
        public final i.a.v<? super R> c;

        public a(AtomicReference<i.a.u0.c> atomicReference, i.a.v<? super R> vVar) {
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
        public void onSuccess(R r) {
        }
    }

    /* compiled from: SingleFlatMapMaybe.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, R> extends AtomicReference<i.a.u0.c> implements i.a.n0<T>, i.a.u0.c {
        private static final long serialVersionUID = -5843758257109742742L;
        public final i.a.v<? super R> downstream;
        public final i.a.x0.o<? super T, ? extends i.a.y<? extends R>> mapper;

        public b(i.a.v<? super R> vVar, i.a.x0.o<? super T, ? extends i.a.y<? extends R>> oVar) {
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
    }

    public b0(i.a.q0<? extends T> q0Var, i.a.x0.o<? super T, ? extends i.a.y<? extends R>> oVar) {
    }

    @Override // i.a.s
    public void q1(i.a.v<? super R> vVar) {
    }
}
