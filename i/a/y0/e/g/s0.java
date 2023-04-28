package i.a.y0.e.g;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleTimeout.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class s0<T> extends i.a.k0<T> {
    public final i.a.q0<T> b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeUnit f29088d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.j0 f29089e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.q0<? extends T> f29090f;

    /* compiled from: SingleTimeout.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicReference<i.a.u0.c> implements i.a.n0<T>, Runnable, i.a.u0.c {
        private static final long serialVersionUID = 37497744973048446L;
        public final i.a.n0<? super T> downstream;
        public final C0591a<T> fallback;
        public i.a.q0<? extends T> other;
        public final AtomicReference<i.a.u0.c> task;
        public final long timeout;
        public final TimeUnit unit;

        /* compiled from: SingleTimeout.java */
        /* renamed from: i.a.y0.e.g.s0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class C0591a<T> extends AtomicReference<i.a.u0.c> implements i.a.n0<T> {
            private static final long serialVersionUID = 2071387740092105509L;
            public final i.a.n0<? super T> downstream;

            public C0591a(i.a.n0<? super T> n0Var) {
            }

            @Override // i.a.n0
            public void onError(Throwable th) {
            }

            @Override // i.a.n0
            public void onSubscribe(i.a.u0.c cVar) {
            }

            @Override // i.a.n0
            public void onSuccess(T t) {
            }
        }

        public a(i.a.n0<? super T> n0Var, i.a.q0<? extends T> q0Var, long j2, TimeUnit timeUnit) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // i.a.n0
        public void onError(Throwable th) {
        }

        @Override // i.a.n0
        public void onSubscribe(i.a.u0.c cVar) {
        }

        @Override // i.a.n0
        public void onSuccess(T t) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public s0(i.a.q0<T> q0Var, long j2, TimeUnit timeUnit, i.a.j0 j0Var, i.a.q0<? extends T> q0Var2) {
    }

    @Override // i.a.k0
    public void b1(i.a.n0<? super T> n0Var) {
    }
}
