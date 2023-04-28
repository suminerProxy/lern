package i.a.y0.g;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AbstractDirectTask.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class a extends AtomicReference<Future<?>> implements i.a.u0.c, i.a.f1.a {
    public static final FutureTask<Void> DISPOSED = null;
    public static final FutureTask<Void> FINISHED = null;
    private static final long serialVersionUID = 1811839108042568751L;
    public final Runnable runnable;
    public Thread runner;

    public a(Runnable runnable) {
    }

    @Override // i.a.u0.c
    public final void dispose() {
    }

    @Override // i.a.f1.a
    public Runnable getWrappedRunnable() {
    }

    @Override // i.a.u0.c
    public final boolean isDisposed() {
    }

    public final void setFuture(Future<?> future) {
    }
}
