package i.a.e1.h.d;

import i.a.e1.c.p0;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableStageObserver.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class z<T> extends CompletableFuture<T> implements p0<T> {
    public final AtomicReference<i.a.e1.d.f> b;
    public T c;

    public final void a() {
    }

    public final void b() {
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

    @Override // i.a.e1.c.p0
    public final void onError(Throwable t) {
    }

    @Override // i.a.e1.c.p0
    public final void onSubscribe(@i.a.e1.b.f i.a.e1.d.f d2) {
    }
}
