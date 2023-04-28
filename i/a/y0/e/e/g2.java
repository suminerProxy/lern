package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservablePublish.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class g2<T> extends i.a.z0.a<T> implements i.a.y0.c.g<T> {
    public final i.a.g0<T> b;
    public final AtomicReference<b<T>> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.g0<T> f28777d;

    /* compiled from: ObservablePublish.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicReference<Object> implements i.a.u0.c {
        private static final long serialVersionUID = -1100270633763673112L;
        public final i.a.i0<? super T> child;

        public a(i.a.i0<? super T> i0Var) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        public void setParent(b<T> bVar) {
        }
    }

    /* compiled from: ObservablePublish.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> implements i.a.i0<T>, i.a.u0.c {

        /* renamed from: f  reason: collision with root package name */
        public static final a[] f28778f = null;

        /* renamed from: g  reason: collision with root package name */
        public static final a[] f28779g = null;
        public final AtomicReference<b<T>> b;
        public final AtomicReference<a<T>[]> c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicBoolean f28780d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicReference<i.a.u0.c> f28781e;

        public b(AtomicReference<b<T>> atomicReference) {
        }

        public boolean a(a<T> aVar) {
        }

        public void b(a<T> aVar) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // i.a.i0
        public void onComplete() {
        }

        @Override // i.a.i0
        public void onError(Throwable th) {
        }

        @Override // i.a.i0
        public void onNext(T t) {
        }

        @Override // i.a.i0
        public void onSubscribe(i.a.u0.c cVar) {
        }
    }

    /* compiled from: ObservablePublish.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T> implements i.a.g0<T> {
        private final AtomicReference<b<T>> b;

        public c(AtomicReference<b<T>> atomicReference) {
        }

        @Override // i.a.g0
        public void subscribe(i.a.i0<? super T> i0Var) {
        }
    }

    private g2(i.a.g0<T> g0Var, i.a.g0<T> g0Var2, AtomicReference<b<T>> atomicReference) {
    }

    public static <T> i.a.z0.a<T> m(i.a.g0<T> g0Var) {
    }

    @Override // i.a.z0.a
    public void f(i.a.x0.g<? super i.a.u0.c> gVar) {
    }

    @Override // i.a.y0.c.g
    public i.a.g0<T> source() {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super T> i0Var) {
    }
}
