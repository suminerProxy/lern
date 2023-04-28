package i.a.e1.h.f.c;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeSwitchIfEmptySingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class i1<T> extends i.a.e1.c.r0<T> implements i.a.e1.h.c.h<T> {
    public final i.a.e1.c.f0<T> b;
    public final i.a.e1.c.x0<? extends T> c;

    /* compiled from: MaybeSwitchIfEmptySingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.c0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = 4603919676453758899L;
        public final i.a.e1.c.u0<? super T> downstream;
        public final i.a.e1.c.x0<? extends T> other;

        /* compiled from: MaybeSwitchIfEmptySingle.java */
        /* renamed from: i.a.e1.h.f.c.i1$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0460a<T> implements i.a.e1.c.u0<T> {
            public final i.a.e1.c.u0<? super T> b;
            public final AtomicReference<i.a.e1.d.f> c;

            public C0460a(i.a.e1.c.u0<? super T> actual, AtomicReference<i.a.e1.d.f> parent) {
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

        public a(i.a.e1.c.u0<? super T> actual, i.a.e1.c.x0<? extends T> other) {
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

    public i1(i.a.e1.c.f0<T> source, i.a.e1.c.x0<? extends T> other) {
    }

    @Override // i.a.e1.c.r0
    public void M1(i.a.e1.c.u0<? super T> observer) {
    }

    @Override // i.a.e1.h.c.h
    public i.a.e1.c.f0<T> source() {
    }
}
