package i.a.y0.e.c;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeCallbackObserver.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class d<T> extends AtomicReference<i.a.u0.c> implements i.a.v<T>, i.a.u0.c, i.a.a1.g {
    private static final long serialVersionUID = -6076952298809384986L;
    public final i.a.x0.a onComplete;
    public final i.a.x0.g<? super Throwable> onError;
    public final i.a.x0.g<? super T> onSuccess;

    public d(i.a.x0.g<? super T> gVar, i.a.x0.g<? super Throwable> gVar2, i.a.x0.a aVar) {
    }

    @Override // i.a.u0.c
    public void dispose() {
    }

    @Override // i.a.a1.g
    public boolean hasCustomOnError() {
    }

    @Override // i.a.u0.c
    public boolean isDisposed() {
    }

    @Override // i.a.v
    public void onComplete() {
    }

    @Override // i.a.v
    public void onError(Throwable th) {
    }

    @Override // i.a.v
    public void onSubscribe(i.a.u0.c cVar) {
    }

    @Override // i.a.v, i.a.n0
    public void onSuccess(T t) {
    }
}
