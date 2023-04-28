package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableScalarXMap.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class x2 {

    /* compiled from: ObservableScalarXMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements i.a.y0.c.j<T>, Runnable {
        public static final int FUSED = 1;
        public static final int ON_COMPLETE = 3;
        public static final int ON_NEXT = 2;
        public static final int START = 0;
        private static final long serialVersionUID = 3880992722410194083L;
        public final i.a.i0<? super T> observer;
        public final T value;

        public a(i.a.i0<? super T> i0Var, T t) {
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

        @Override // i.a.y0.c.o
        public boolean offer(T t) {
        }

        @Override // i.a.y0.c.o
        @i.a.t0.g
        public T poll() throws Exception {
        }

        @Override // i.a.y0.c.k
        public int requestFusion(int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        @Override // i.a.y0.c.o
        public boolean offer(T t, T t2) {
        }
    }

    /* compiled from: ObservableScalarXMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, R> extends i.a.b0<R> {
        public final T b;
        public final i.a.x0.o<? super T, ? extends i.a.g0<? extends R>> c;

        public b(T t, i.a.x0.o<? super T, ? extends i.a.g0<? extends R>> oVar) {
        }

        @Override // i.a.b0
        public void subscribeActual(i.a.i0<? super R> i0Var) {
        }
    }

    private x2() {
    }

    public static <T, U> i.a.b0<U> a(T t, i.a.x0.o<? super T, ? extends i.a.g0<? extends U>> oVar) {
    }

    public static <T, R> boolean b(i.a.g0<T> g0Var, i.a.i0<? super R> i0Var, i.a.x0.o<? super T, ? extends i.a.g0<? extends R>> oVar) {
    }
}
