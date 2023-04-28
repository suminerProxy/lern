package i.a.e1.h.e;

import i.a.e1.c.u0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: BlockingMultiObserver.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class i<T> extends CountDownLatch implements u0<T>, i.a.e1.c.m, i.a.e1.c.c0<T> {
    public T b;
    public Throwable c;

    /* renamed from: d  reason: collision with root package name */
    public i.a.e1.d.f f26817d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f26818e;

    public boolean a(long timeout, TimeUnit unit) {
    }

    public void b(i.a.e1.g.g<? super T> onSuccess, i.a.e1.g.g<? super Throwable> onError, i.a.e1.g.a onComplete) {
    }

    public T c() {
    }

    public T d(T defaultValue) {
    }

    public void e() {
    }

    @Override // i.a.e1.c.m
    public void onComplete() {
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
