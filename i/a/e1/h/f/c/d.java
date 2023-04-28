package i.a.e1.h.f.c;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeCallbackObserver.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class d<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.c0<T>, i.a.e1.d.f, i.a.e1.j.g {
    private static final long serialVersionUID = -6076952298809384986L;
    public final i.a.e1.g.a onComplete;
    public final i.a.e1.g.g<? super Throwable> onError;
    public final i.a.e1.g.g<? super T> onSuccess;

    public d(i.a.e1.g.g<? super T> onSuccess, i.a.e1.g.g<? super Throwable> onError, i.a.e1.g.a onComplete) {
    }

    @Override // i.a.e1.d.f
    public void dispose() {
    }

    @Override // i.a.e1.j.g
    public boolean hasCustomOnError() {
    }

    @Override // i.a.e1.d.f
    public boolean isDisposed() {
    }

    @Override // i.a.e1.c.c0, i.a.e1.c.m
    public void onComplete() {
    }

    @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
    public void onError(Throwable e2) {
    }

    @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
    public void onSubscribe(i.a.e1.d.f d2) {
    }

    @Override // i.a.e1.c.c0, i.a.e1.c.u0
    public void onSuccess(T value) {
    }
}
