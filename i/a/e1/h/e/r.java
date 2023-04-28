package i.a.e1.h.e;

import i.a.e1.c.u0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FutureMultiObserver.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class r<T> extends CountDownLatch implements i.a.e1.c.c0<T>, u0<T>, i.a.e1.c.m, Future<T>, i.a.e1.d.f {
    public T b;
    public Throwable c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<i.a.e1.d.f> f26821d;

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
    }

    @Override // i.a.e1.d.f
    public void dispose() {
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
    }

    @Override // i.a.e1.d.f
    public boolean isDisposed() {
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
    }

    @Override // i.a.e1.c.c0, i.a.e1.c.m
    public void onComplete() {
    }

    @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
    public void onError(Throwable t) {
    }

    @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
    public void onSubscribe(i.a.e1.d.f d2) {
    }

    @Override // i.a.e1.c.c0, i.a.e1.c.u0
    public void onSuccess(T t) {
    }

    @Override // java.util.concurrent.Future
    public T get(long timeout, @i.a.e1.b.f TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
    }
}
