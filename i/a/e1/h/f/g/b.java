package i.a.e1.h.f.g;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleCache.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class b<T> extends i.a.e1.c.r0<T> implements i.a.e1.c.u0<T> {

    /* renamed from: g  reason: collision with root package name */
    public static final a[] f27746g = null;

    /* renamed from: h  reason: collision with root package name */
    public static final a[] f27747h = null;
    public final i.a.e1.c.x0<? extends T> b;
    public final AtomicInteger c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<a<T>[]> f27748d;

    /* renamed from: e  reason: collision with root package name */
    public T f27749e;

    /* renamed from: f  reason: collision with root package name */
    public Throwable f27750f;

    /* compiled from: SingleCache.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicBoolean implements i.a.e1.d.f {
        private static final long serialVersionUID = 7514387411091976596L;
        public final i.a.e1.c.u0<? super T> downstream;
        public final b<T> parent;

        public a(i.a.e1.c.u0<? super T> actual, b<T> parent) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }
    }

    public b(i.a.e1.c.x0<? extends T> source) {
    }

    public boolean I2(a<T> observer) {
    }

    public void J2(a<T> observer) {
    }

    @Override // i.a.e1.c.r0
    public void M1(final i.a.e1.c.u0<? super T> observer) {
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
