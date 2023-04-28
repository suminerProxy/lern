package i.a.e1.h.e;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CallbackCompletableObserver.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class k extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.m, i.a.e1.d.f, i.a.e1.g.g<Throwable>, i.a.e1.j.g {
    private static final long serialVersionUID = -4361286194466301354L;
    public final i.a.e1.g.a onComplete;
    public final i.a.e1.g.g<? super Throwable> onError;

    public k(i.a.e1.g.a onComplete) {
    }

    @Override // i.a.e1.g.g
    public /* bridge */ /* synthetic */ void accept(Throwable e2) throws Throwable {
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

    @Override // i.a.e1.c.m
    public void onComplete() {
    }

    @Override // i.a.e1.c.m
    public void onError(Throwable e2) {
    }

    @Override // i.a.e1.c.m
    public void onSubscribe(i.a.e1.d.f d2) {
    }

    /* renamed from: accept  reason: avoid collision after fix types in other method */
    public void accept2(Throwable e2) {
    }

    public k(i.a.e1.g.g<? super Throwable> onError, i.a.e1.g.a onComplete) {
    }
}
