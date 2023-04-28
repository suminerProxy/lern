package i.a.e1.h.f.c;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeTimeoutMaybe.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class m1<T, U> extends i.a.e1.h.f.c.a<T, T> {
    public final i.a.e1.c.f0<U> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.c.f0<? extends T> f27316d;

    /* compiled from: MaybeTimeoutMaybe.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.c0<T> {
        private static final long serialVersionUID = 8663801314800248617L;
        public final i.a.e1.c.c0<? super T> downstream;

        public a(i.a.e1.c.c0<? super T> downstream) {
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

    /* compiled from: MaybeTimeoutMaybe.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, U> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.c0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = -5955289211445418871L;
        public final i.a.e1.c.c0<? super T> downstream;
        public final i.a.e1.c.f0<? extends T> fallback;
        public final c<T, U> other;
        public final a<T> otherObserver;

        public b(i.a.e1.c.c0<? super T> actual, i.a.e1.c.f0<? extends T> fallback) {
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
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0
        public void onSuccess(T value) {
        }

        public void otherComplete() {
        }

        public void otherError(Throwable e2) {
        }
    }

    /* compiled from: MaybeTimeoutMaybe.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T, U> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.c0<Object> {
        private static final long serialVersionUID = 8663801314800248617L;
        public final b<T, U> parent;

        public c(b<T, U> parent) {
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
        public void onSuccess(Object value) {
        }
    }

    public m1(i.a.e1.c.f0<T> source, i.a.e1.c.f0<U> other, i.a.e1.c.f0<? extends T> fallback) {
    }

    @Override // i.a.e1.c.z
    public void U1(i.a.e1.c.c0<? super T> observer) {
    }
}
