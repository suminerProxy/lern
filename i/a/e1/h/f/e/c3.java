package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableScalarXMap.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class c3 {

    /* compiled from: ObservableScalarXMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicInteger implements i.a.e1.h.c.l<T>, Runnable {
        public static final int FUSED = 1;
        public static final int ON_COMPLETE = 3;
        public static final int ON_NEXT = 2;
        public static final int START = 0;
        private static final long serialVersionUID = 3880992722410194083L;
        public final i.a.e1.c.p0<? super T> observer;
        public final T value;

        public a(i.a.e1.c.p0<? super T> observer, T value) {
        }

        @Override // i.a.e1.h.c.q
        public void clear() {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.h.c.q
        public boolean isEmpty() {
        }

        @Override // i.a.e1.h.c.q
        public boolean offer(T value) {
        }

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public T poll() {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int mode) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        @Override // i.a.e1.h.c.q
        public boolean offer(T v1, T v2) {
        }
    }

    /* compiled from: ObservableScalarXMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, R> extends i.a.e1.c.i0<R> {
        public final T b;
        public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<? extends R>> c;

        public b(T value, i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<? extends R>> mapper) {
        }

        @Override // i.a.e1.c.i0
        public void c6(i.a.e1.c.p0<? super R> observer) {
        }
    }

    private c3() {
    }

    public static <T, U> i.a.e1.c.i0<U> a(T value, i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<? extends U>> mapper) {
    }

    public static <T, R> boolean b(i.a.e1.c.n0<T> source, i.a.e1.c.p0<? super R> observer, i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<? extends R>> mapper) {
    }
}
