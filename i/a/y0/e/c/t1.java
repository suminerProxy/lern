package i.a.y0.e.c;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeZipArray.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class t1<T, R> extends i.a.s<R> {
    public final i.a.y<? extends T>[] b;
    public final i.a.x0.o<? super Object[], ? extends R> c;

    /* compiled from: MaybeZipArray.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class a implements i.a.x0.o<T, R> {
        public final /* synthetic */ t1 b;

        public a(t1 t1Var) {
        }

        @Override // i.a.x0.o
        public R apply(T t) throws Exception {
        }
    }

    /* compiled from: MaybeZipArray.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, R> extends AtomicInteger implements i.a.u0.c {
        private static final long serialVersionUID = -5556924161382950569L;
        public final i.a.v<? super R> downstream;
        public final c<T>[] observers;
        public final Object[] values;
        public final i.a.x0.o<? super Object[], ? extends R> zipper;

        public b(i.a.v<? super R> vVar, int i2, i.a.x0.o<? super Object[], ? extends R> oVar) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void disposeExcept(int i2) {
        }

        public void innerComplete(int i2) {
        }

        public void innerError(Throwable th, int i2) {
        }

        public void innerSuccess(T t, int i2) {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }
    }

    /* compiled from: MaybeZipArray.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T> extends AtomicReference<i.a.u0.c> implements i.a.v<T> {
        private static final long serialVersionUID = 3323743579927613702L;
        public final int index;
        public final b<T, ?> parent;

        public c(b<T, ?> bVar, int i2) {
        }

        public void dispose() {
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

    public t1(i.a.y<? extends T>[] yVarArr, i.a.x0.o<? super Object[], ? extends R> oVar) {
    }

    @Override // i.a.s
    public void q1(i.a.v<? super R> vVar) {
    }
}
