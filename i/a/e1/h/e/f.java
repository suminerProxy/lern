package i.a.e1.h.e;

import i.a.e1.c.u0;
import java.util.concurrent.CountDownLatch;

/* compiled from: BlockingDisposableMultiObserver.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class f<T> extends CountDownLatch implements i.a.e1.c.c0<T>, u0<T>, i.a.e1.c.m, i.a.e1.d.f {
    public T b;
    public Throwable c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.h.a.f f26816d;

    public void a(i.a.e1.c.m observer) {
    }

    public void b(i.a.e1.c.c0<? super T> observer) {
    }

    public void c(u0<? super T> observer) {
    }

    @Override // i.a.e1.d.f
    public void dispose() {
    }

    @Override // i.a.e1.d.f
    public boolean isDisposed() {
    }

    @Override // i.a.e1.c.c0, i.a.e1.c.m
    public void onComplete() {
    }

    @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
    public void onError(@i.a.e1.b.f Throwable e2) {
    }

    @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
    public void onSubscribe(@i.a.e1.b.f i.a.e1.d.f d2) {
    }

    @Override // i.a.e1.c.c0, i.a.e1.c.u0
    public void onSuccess(@i.a.e1.b.f T t) {
    }
}
