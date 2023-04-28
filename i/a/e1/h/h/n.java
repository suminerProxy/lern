package i.a.e1.h.h;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: ScheduledRunnable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class n extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, i.a.e1.d.f {
    public static final int FUTURE_INDEX = 1;
    public static final int PARENT_INDEX = 0;
    public static final int THREAD_INDEX = 2;
    private static final long serialVersionUID = -6120223772001106981L;
    public final Runnable actual;
    public static final Object PARENT_DISPOSED = new Object();
    public static final Object SYNC_DISPOSED = new Object();
    public static final Object ASYNC_DISPOSED = new Object();
    public static final Object DONE = new Object();

    public n(Runnable actual, i.a.e1.d.g parent) {
        super(3);
        this.actual = actual;
        lazySet(0, parent);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // i.a.e1.d.f
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == DONE || obj5 == (obj3 = SYNC_DISPOSED) || obj5 == (obj4 = ASYNC_DISPOSED)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == DONE || obj == (obj2 = PARENT_DISPOSED) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((i.a.e1.d.g) obj).c(this);
    }

    @Override // i.a.e1.d.f
    public boolean isDisposed() {
        Object obj = get(0);
        return obj == PARENT_DISPOSED || obj == DONE;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        boolean compareAndSet;
        Object obj4;
        Object obj5;
        lazySet(2, Thread.currentThread());
        try {
            this.actual.run();
        } finally {
            try {
                lazySet(2, null);
                obj4 = get(0);
                if (obj4 != PARENT_DISPOSED) {
                    ((i.a.e1.d.g) obj4).c(this);
                }
                do {
                    obj5 = get(1);
                    if (obj5 != SYNC_DISPOSED) {
                        return;
                    }
                    return;
                } while (!compareAndSet(1, obj5, DONE));
            } catch (Throwable th) {
                do {
                    if (obj == obj2) {
                        break;
                    } else if (obj == obj3) {
                        break;
                    }
                } while (!compareAndSet);
            }
        }
        lazySet(2, null);
        obj4 = get(0);
        if (obj4 != PARENT_DISPOSED && compareAndSet(0, obj4, DONE) && obj4 != null) {
            ((i.a.e1.d.g) obj4).c(this);
        }
        do {
            obj5 = get(1);
            if (obj5 != SYNC_DISPOSED || obj5 == ASYNC_DISPOSED) {
                return;
            }
        } while (!compareAndSet(1, obj5, DONE));
    }

    public void setFuture(Future<?> f2) {
        Object obj;
        do {
            obj = get(1);
            if (obj == DONE) {
                return;
            }
            if (obj == SYNC_DISPOSED) {
                f2.cancel(false);
                return;
            } else if (obj == ASYNC_DISPOSED) {
                f2.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, f2));
    }
}
