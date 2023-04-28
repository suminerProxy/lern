package i.a.e1.h.h;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AbstractDirectTask.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class a extends AtomicReference<Future<?>> implements i.a.e1.d.f, i.a.e1.n.a {
    public static final FutureTask<Void> DISPOSED;
    public static final FutureTask<Void> FINISHED;
    private static final long serialVersionUID = 1811839108042568751L;
    public final Runnable runnable;
    public Thread runner;

    static {
        Runnable runnable = i.a.e1.h.b.a.b;
        FINISHED = new FutureTask<>(runnable, null);
        DISPOSED = new FutureTask<>(runnable, null);
    }

    public a(Runnable runnable) {
        this.runnable = runnable;
    }

    @Override // i.a.e1.d.f
    public final void dispose() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == FINISHED || future == (futureTask = DISPOSED) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.runner != Thread.currentThread());
    }

    @Override // i.a.e1.n.a
    public Runnable getWrappedRunnable() {
        return this.runnable;
    }

    @Override // i.a.e1.d.f
    public final boolean isDisposed() {
        Future<?> future = get();
        return future == FINISHED || future == DISPOSED;
    }

    public final void setFuture(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == FINISHED) {
                return;
            }
            if (future2 == DISPOSED) {
                future.cancel(this.runner != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
