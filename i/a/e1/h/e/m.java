package i.a.e1.h.e;

import i.a.e1.c.p0;

/* compiled from: DeferredScalarDisposable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class m<T> extends b<T> {
    public static final int DISPOSED = 4;
    public static final int FUSED_CONSUMED = 32;
    public static final int FUSED_EMPTY = 8;
    public static final int FUSED_READY = 16;
    public static final int TERMINATED = 2;
    private static final long serialVersionUID = -5502432239815349361L;
    public final p0<? super T> downstream;
    public T value;

    public m(p0<? super T> downstream) {
    }

    @Override // i.a.e1.h.c.q
    public final void clear() {
    }

    public final void complete(T value) {
    }

    public void dispose() {
    }

    public final void error(Throwable t) {
    }

    @Override // i.a.e1.d.f
    public final boolean isDisposed() {
    }

    @Override // i.a.e1.h.c.q
    public final boolean isEmpty() {
    }

    @Override // i.a.e1.h.c.q
    @i.a.e1.b.g
    public final T poll() {
    }

    @Override // i.a.e1.h.c.m
    public final int requestFusion(int mode) {
    }

    public final boolean tryDispose() {
    }

    public final void complete() {
    }
}
