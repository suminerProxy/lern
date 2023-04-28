package i.a.e1.o;

import i.a.e1.c.c0;
import i.a.e1.c.z;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeSubject.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class d<T> extends z<T> implements c0<T> {

    /* renamed from: f  reason: collision with root package name */
    public static final a[] f28014f = null;

    /* renamed from: g  reason: collision with root package name */
    public static final a[] f28015g = null;
    public final AtomicReference<a<T>[]> b;
    public final AtomicBoolean c;

    /* renamed from: d  reason: collision with root package name */
    public T f28016d;

    /* renamed from: e  reason: collision with root package name */
    public Throwable f28017e;

    /* compiled from: MaybeSubject.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<d<T>> implements i.a.e1.d.f {
        private static final long serialVersionUID = -7650903191002190468L;
        public final c0<? super T> downstream;

        public a(c0<? super T> actual, d<T> parent) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> d<T> V2() {
    }

    @Override // i.a.e1.c.z
    public void U1(c0<? super T> observer) {
    }

    public boolean U2(a<T> inner) {
    }

    @i.a.e1.b.g
    public Throwable W2() {
    }

    @i.a.e1.b.g
    public T X2() {
    }

    public boolean Y2() {
    }

    public boolean Z2() {
    }

    public boolean a3() {
    }

    public boolean b3() {
    }

    public int c3() {
    }

    public void d3(a<T> inner) {
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
