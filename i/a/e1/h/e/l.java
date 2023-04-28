package i.a.e1.h.e;

import i.a.e1.c.u0;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ConsumerSingleObserver.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class l<T> extends AtomicReference<i.a.e1.d.f> implements u0<T>, i.a.e1.d.f, i.a.e1.j.g {
    private static final long serialVersionUID = -7012088219455310787L;
    public final i.a.e1.g.g<? super Throwable> onError;
    public final i.a.e1.g.g<? super T> onSuccess;

    public l(i.a.e1.g.g<? super T> onSuccess, i.a.e1.g.g<? super Throwable> onError) {
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

    @Override // i.a.e1.c.u0, i.a.e1.c.m
    public void onError(Throwable e2) {
    }

    @Override // i.a.e1.c.u0, i.a.e1.c.m
    public void onSubscribe(i.a.e1.d.f d2) {
    }

    @Override // i.a.e1.c.u0
    public void onSuccess(T value) {
    }
}
