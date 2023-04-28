package i.a.y0.d;

import i.a.i0;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: InnerQueuedObserver.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class s<T> extends AtomicReference<i.a.u0.c> implements i0<T>, i.a.u0.c {
    private static final long serialVersionUID = -5417183359794346637L;
    public volatile boolean done;
    public int fusionMode;
    public final t<T> parent;
    public final int prefetch;
    public i.a.y0.c.o<T> queue;

    public s(t<T> tVar, int i2) {
    }

    @Override // i.a.u0.c
    public void dispose() {
    }

    public int fusionMode() {
    }

    @Override // i.a.u0.c
    public boolean isDisposed() {
    }

    public boolean isDone() {
    }

    @Override // i.a.i0
    public void onComplete() {
    }

    @Override // i.a.i0
    public void onError(Throwable th) {
    }

    @Override // i.a.i0
    public void onNext(T t) {
    }

    @Override // i.a.i0
    public void onSubscribe(i.a.u0.c cVar) {
    }

    public i.a.y0.c.o<T> queue() {
    }

    public void setDone() {
    }
}
