package i.a.y0.g;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: ScheduledRunnable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class n extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, i.a.u0.c {
    public static final Object ASYNC_DISPOSED = null;
    public static final Object DONE = null;
    public static final int FUTURE_INDEX = 1;
    public static final Object PARENT_DISPOSED = null;
    public static final int PARENT_INDEX = 0;
    public static final Object SYNC_DISPOSED = null;
    public static final int THREAD_INDEX = 2;
    private static final long serialVersionUID = -6120223772001106981L;
    public final Runnable actual;

    public n(Runnable runnable, i.a.y0.a.c cVar) {
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
    }

    @Override // i.a.u0.c
    public void dispose() {
    }

    @Override // i.a.u0.c
    public boolean isDisposed() {
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    public void setFuture(Future<?> future) {
    }
}
