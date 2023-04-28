package i.a.y0.h;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* compiled from: FutureSubscriber.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class j<T> extends CountDownLatch implements i.a.q<T>, Future<T>, Subscription {
    public T b;
    public Throwable c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<Subscription> f29182d;

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
    }

    @Override // i.a.q
    public void onSubscribe(Subscription subscription) {
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
    }

    @Override // java.util.concurrent.Future
    public T get(long j2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
    }
}
