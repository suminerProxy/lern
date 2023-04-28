package i.a.y0.e.g;

import java.util.Iterator;

/* compiled from: SingleFlatMapIterableObservable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class a0<T, R> extends i.a.b0<R> {
    public final i.a.q0<T> b;
    public final i.a.x0.o<? super T, ? extends Iterable<? extends R>> c;

    /* compiled from: SingleFlatMapIterableObservable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends i.a.y0.d.b<R> implements i.a.n0<T> {
        private static final long serialVersionUID = -8938804753851907758L;
        public volatile boolean cancelled;
        public final i.a.i0<? super R> downstream;
        public volatile Iterator<? extends R> it;
        public final i.a.x0.o<? super T, ? extends Iterable<? extends R>> mapper;
        public boolean outputFused;
        public i.a.u0.c upstream;

        public a(i.a.i0<? super R> i0Var, i.a.x0.o<? super T, ? extends Iterable<? extends R>> oVar) {
        }

        @Override // i.a.y0.c.o
        public void clear() {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // i.a.y0.c.o
        public boolean isEmpty() {
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

        @Override // i.a.y0.c.o
        @i.a.t0.g
        public R poll() throws Exception {
        }

        @Override // i.a.y0.c.k
        public int requestFusion(int i2) {
        }
    }

    public a0(i.a.q0<T> q0Var, i.a.x0.o<? super T, ? extends Iterable<? extends R>> oVar) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super R> i0Var) {
    }
}
