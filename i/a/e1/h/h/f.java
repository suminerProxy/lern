package i.a.e1.h.h;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: InstantPeriodicTask.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class f implements Callable<Void>, i.a.e1.d.f {

    /* renamed from: g  reason: collision with root package name */
    public static final FutureTask<Void> f27816g = new FutureTask<>(i.a.e1.h.b.a.b, null);
    public final Runnable b;

    /* renamed from: e  reason: collision with root package name */
    public final ExecutorService f27818e;

    /* renamed from: f  reason: collision with root package name */
    public Thread f27819f;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<Future<?>> f27817d = new AtomicReference<>();
    public final AtomicReference<Future<?>> c = new AtomicReference<>();

    public f(Runnable task, ExecutorService executor) {
        this.b = task;
        this.f27818e = executor;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public Void call() {
        this.f27819f = Thread.currentThread();
        try {
            this.b.run();
            c(this.f27818e.submit(this));
            this.f27819f = null;
        } catch (Throwable th) {
            i.a.e1.e.b.b(th);
            this.f27819f = null;
            i.a.e1.l.a.Y(th);
        }
        return null;
    }

    public void b(Future<?> f2) {
        Future<?> future;
        do {
            future = this.f27817d.get();
            if (future == f27816g) {
                f2.cancel(this.f27819f != Thread.currentThread());
                return;
            }
        } while (!this.f27817d.compareAndSet(future, f2));
    }

    public void c(Future<?> f2) {
        Future<?> future;
        do {
            future = this.c.get();
            if (future == f27816g) {
                f2.cancel(this.f27819f != Thread.currentThread());
                return;
            }
        } while (!this.c.compareAndSet(future, f2));
    }

    @Override // i.a.e1.d.f
    public void dispose() {
        AtomicReference<Future<?>> atomicReference = this.f27817d;
        FutureTask<Void> futureTask = f27816g;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.f27819f != Thread.currentThread());
        }
        Future<?> andSet2 = this.c.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.f27819f != Thread.currentThread());
    }

    @Override // i.a.e1.d.f
    public boolean isDisposed() {
        return this.f27817d.get() == f27816g;
    }
}
