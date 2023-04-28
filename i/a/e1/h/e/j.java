package i.a.e1.h.e;

import i.a.e1.c.p0;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: BlockingObserver.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class j<T> extends AtomicReference<i.a.e1.d.f> implements p0<T>, i.a.e1.d.f {
    public static final Object TERMINATED = null;
    private static final long serialVersionUID = -4875965440900746268L;
    public final Queue<Object> queue;

    public j(Queue<Object> queue) {
    }

    @Override // i.a.e1.d.f
    public void dispose() {
    }

    @Override // i.a.e1.d.f
    public boolean isDisposed() {
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
}
