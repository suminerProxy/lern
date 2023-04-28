package i.a.y0.d;

import i.a.i0;

/* compiled from: DeferredScalarDisposable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class l<T> extends b<T> {
    public static final int DISPOSED = 4;
    public static final int FUSED_CONSUMED = 32;
    public static final int FUSED_EMPTY = 8;
    public static final int FUSED_READY = 16;
    public static final int TERMINATED = 2;
    private static final long serialVersionUID = -5502432239815349361L;
    public final i0<? super T> downstream;
    public T value;

    public l(i0<? super T> i0Var) {
    }

    @Override // i.a.y0.c.o
    public final void clear() {
    }

    public final void complete(T t) {
    }

    public void dispose() {
    }

    public final void error(Throwable th) {
    }

    @Override // i.a.u0.c
    public final boolean isDisposed() {
    }

    @Override // i.a.y0.c.o
    public final boolean isEmpty() {
    }

    @Override // i.a.y0.c.o
    @i.a.t0.g
    public final T poll() throws Exception {
    }

    @Override // i.a.y0.c.k
    public final int requestFusion(int i2) {
    }

    public final boolean tryDispose() {
    }

    public final void complete() {
    }
}
