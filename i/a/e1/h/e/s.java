package i.a.e1.h.e;

import i.a.e1.c.p0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FutureObserver.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class s<T> extends CountDownLatch implements p0<T>, Future<T>, i.a.e1.d.f {
    public T b;
    public Throwable c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<i.a.e1.d.f> f26822d;

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

    @Override // i.a.e1.c.p0
    public void onComplete() {
    }

    @Override // i.a.e1.c.p0
    public void onError(Throwable t) {
    }

    @Override // i.a.e1.c.p0
    public void onNext(T t) {
    }

    @Override // i.a.e1.c.p0
    public void onSubscribe(i.a.e1.d.f d2) {
    }

    @Override // java.util.concurrent.Future
    public T get(long timeout, @i.a.e1.b.f TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
    }
}
