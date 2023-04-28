package i.a.e1.h.f.g;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleTimeout.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class y0<T> extends i.a.e1.c.r0<T> {
    public final i.a.e1.c.x0<T> b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeUnit f27780d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.c.q0 f27781e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.e1.c.x0<? extends T> f27782f;

    /* compiled from: SingleTimeout.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.u0<T>, Runnable, i.a.e1.d.f {
        private static final long serialVersionUID = 37497744973048446L;
        public final i.a.e1.c.u0<? super T> downstream;
        public final C0502a<T> fallback;
        public i.a.e1.c.x0<? extends T> other;
        public final AtomicReference<i.a.e1.d.f> task;
        public final long timeout;
        public final TimeUnit unit;

        /* compiled from: SingleTimeout.java */
        /* renamed from: i.a.e1.h.f.g.y0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0502a<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.u0<T> {
            private static final long serialVersionUID = 2071387740092105509L;
            public final i.a.e1.c.u0<? super T> downstream;

            public C0502a(i.a.e1.c.u0<? super T> downstream) {
            }

            @Override // i.a.e1.c.u0, i.a.e1.c.m
            public void onError(Throwable e2) {
            }

            @Override // i.a.e1.c.u0, i.a.e1.c.m
            public void onSubscribe(i.a.e1.d.f d2) {
            }

            @Override // i.a.e1.c.u0
            public void onSuccess(T t) {
            }
        }

        public a(i.a.e1.c.u0<? super T> actual, i.a.e1.c.x0<? extends T> other, long timeout, TimeUnit unit) {
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
        public void onSuccess(T t) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public y0(i.a.e1.c.x0<T> source, long timeout, TimeUnit unit, i.a.e1.c.q0 scheduler, i.a.e1.c.x0<? extends T> other) {
    }

    @Override // i.a.e1.c.r0
    public void M1(final i.a.e1.c.u0<? super T> observer) {
    }
}
