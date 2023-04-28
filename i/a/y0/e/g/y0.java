package i.a.y0.e.g;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleZipArray.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class y0<T, R> extends i.a.k0<R> {
    public final i.a.q0<? extends T>[] b;
    public final i.a.x0.o<? super Object[], ? extends R> c;

    /* compiled from: SingleZipArray.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class a implements i.a.x0.o<T, R> {
        public final /* synthetic */ y0 b;

        public a(y0 y0Var) {
        }

        @Override // i.a.x0.o
        public R apply(T t) throws Exception {
        }
    }

    /* compiled from: SingleZipArray.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, R> extends AtomicInteger implements i.a.u0.c {
        private static final long serialVersionUID = -5556924161382950569L;
        public final i.a.n0<? super R> downstream;
        public final c<T>[] observers;
        public final Object[] values;
        public final i.a.x0.o<? super Object[], ? extends R> zipper;

        public b(i.a.n0<? super R> n0Var, int i2, i.a.x0.o<? super Object[], ? extends R> oVar) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void disposeExcept(int i2) {
        }

        public void innerError(Throwable th, int i2) {
        }

        public void innerSuccess(T t, int i2) {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }
    }

    /* compiled from: SingleZipArray.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T> extends AtomicReference<i.a.u0.c> implements i.a.n0<T> {
        private static final long serialVersionUID = 3323743579927613702L;
        public final int index;
        public final b<T, ?> parent;

        public c(b<T, ?> bVar, int i2) {
        }

        public void dispose() {
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

    public y0(i.a.q0<? extends T>[] q0VarArr, i.a.x0.o<? super Object[], ? extends R> oVar) {
    }

    @Override // i.a.k0
    public void b1(i.a.n0<? super R> n0Var) {
    }
}
