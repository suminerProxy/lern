package i.a.y0.e.g;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SingleDoFinally.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class o<T> extends i.a.k0<T> {
    public final i.a.q0<T> b;
    public final i.a.x0.a c;

    /* compiled from: SingleDoFinally.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements i.a.n0<T>, i.a.u0.c {
        private static final long serialVersionUID = 4109457741734051389L;
        public final i.a.n0<? super T> downstream;
        public final i.a.x0.a onFinally;
        public i.a.u0.c upstream;

        public a(i.a.n0<? super T> n0Var, i.a.x0.a aVar) {
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

        public void runFinally() {
        }
    }

    public o(i.a.q0<T> q0Var, i.a.x0.a aVar) {
    }

    @Override // i.a.k0
    public void b1(i.a.n0<? super T> n0Var) {
    }
}
