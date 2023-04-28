package i.a.y0.d;

import i.a.n0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FutureSingleObserver.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class r<T> extends CountDownLatch implements n0<T>, Future<T>, i.a.u0.c {
    public T b;
    public Throwable c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<i.a.u0.c> f28163d;

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
    }

    @Override // i.a.u0.c
    public void dispose() {
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
    }

    @Override // i.a.u0.c
    public boolean isDisposed() {
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
    }

    @Override // i.a.n0
    public void onError(Throwable th) {
    }

    @Override // i.a.n0
    public void onSubscribe(i.a.u0.c cVar) {
    }

    @Override // i.a.n0
    public void onSuccess(T t) {
    }

    @Override // java.util.concurrent.Future
    public T get(long j2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
    }
}
