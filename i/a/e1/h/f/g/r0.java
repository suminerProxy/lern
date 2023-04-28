package i.a.e1.h.f.g;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleObserveOn.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class r0<T> extends i.a.e1.c.r0<T> {
    public final i.a.e1.c.x0<T> b;
    public final i.a.e1.c.q0 c;

    /* compiled from: SingleObserveOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.u0<T>, i.a.e1.d.f, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;
        public final i.a.e1.c.u0<? super T> downstream;
        public Throwable error;
        public final i.a.e1.c.q0 scheduler;
        public T value;

        public a(i.a.e1.c.u0<? super T> actual, i.a.e1.c.q0 scheduler) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
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

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public r0(i.a.e1.c.x0<T> source, i.a.e1.c.q0 scheduler) {
    }

    @Override // i.a.e1.c.r0
    public void M1(final i.a.e1.c.u0<? super T> observer) {
    }
}
