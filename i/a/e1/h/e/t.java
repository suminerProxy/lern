package i.a.e1.h.e;

import i.a.e1.c.p0;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: InnerQueuedObserver.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class t<T> extends AtomicReference<i.a.e1.d.f> implements p0<T>, i.a.e1.d.f {
    private static final long serialVersionUID = -5417183359794346637L;
    public volatile boolean done;
    public int fusionMode;
    public final u<T> parent;
    public final int prefetch;
    public i.a.e1.h.c.q<T> queue;

    public t(u<T> parent, int prefetch) {
    }

    @Override // i.a.e1.d.f
    public void dispose() {
    }

    @Override // i.a.e1.d.f
    public boolean isDisposed() {
    }

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

    public i.a.e1.h.c.q<T> queue() {
    }

    public void setDone() {
    }
}
