package i.a.e1.h.d;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* compiled from: FlowableStageSubscriber.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class l<T> extends CompletableFuture<T> implements i.a.e1.c.x<T> {
    public final AtomicReference<Subscription> b;
    public T c;

    public abstract void a(Subscription s);

    public final void b() {
    }

    public final void c() {
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean mayInterruptIfRunning) {
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean complete(T value) {
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean completeExceptionally(Throwable ex) {
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable t) {
    }

    @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
    public final void onSubscribe(@i.a.e1.b.f Subscription s) {
    }
}
