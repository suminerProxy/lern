package i.a.e1.h.f.c;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeSubscribeOn.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class g1<T> extends i.a.e1.h.f.c.a<T, T> {
    public final i.a.e1.c.q0 c;

    /* compiled from: MaybeSubscribeOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.c0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = 8571289934935992137L;
        public final i.a.e1.c.c0<? super T> downstream;
        public final i.a.e1.h.a.f task;

        public a(i.a.e1.c.c0<? super T> downstream) {
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
    }

    /* compiled from: MaybeSubscribeOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> implements Runnable {
        public final i.a.e1.c.c0<? super T> b;
        public final i.a.e1.c.f0<T> c;

        public b(i.a.e1.c.c0<? super T> observer, i.a.e1.c.f0<T> source) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public g1(i.a.e1.c.f0<T> source, i.a.e1.c.q0 scheduler) {
    }

    @Override // i.a.e1.c.z
    public void U1(i.a.e1.c.c0<? super T> observer) {
    }
}
