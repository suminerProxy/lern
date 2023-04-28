package i.a.e1.h.e;

import i.a.e1.c.p0;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ForEachWhileObserver.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class q<T> extends AtomicReference<i.a.e1.d.f> implements p0<T>, i.a.e1.d.f {
    private static final long serialVersionUID = -4403180040475402120L;
    public boolean done;
    public final i.a.e1.g.a onComplete;
    public final i.a.e1.g.g<? super Throwable> onError;
    public final i.a.e1.g.r<? super T> onNext;

    public q(i.a.e1.g.r<? super T> onNext, i.a.e1.g.g<? super Throwable> onError, i.a.e1.g.a onComplete) {
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
