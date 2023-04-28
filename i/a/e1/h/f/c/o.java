package i.a.e1.h.f.c;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeDelayWithCompletable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class o<T> extends i.a.e1.c.z<T> {
    public final i.a.e1.c.f0<T> b;
    public final i.a.e1.c.p c;

    /* compiled from: MaybeDelayWithCompletable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> implements i.a.e1.c.c0<T> {
        public final AtomicReference<i.a.e1.d.f> b;
        public final i.a.e1.c.c0<? super T> c;

        public a(AtomicReference<i.a.e1.d.f> parent, i.a.e1.c.c0<? super T> downstream) {
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

    /* compiled from: MaybeDelayWithCompletable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.m, i.a.e1.d.f {
        private static final long serialVersionUID = 703409937383992161L;
        public final i.a.e1.c.c0<? super T> downstream;
        public final i.a.e1.c.f0<T> source;

        public b(i.a.e1.c.c0<? super T> actual, i.a.e1.c.f0<T> source) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
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
    }

    public o(i.a.e1.c.f0<T> source, i.a.e1.c.p other) {
    }

    @Override // i.a.e1.c.z
    public void U1(i.a.e1.c.c0<? super T> observer) {
    }
}
