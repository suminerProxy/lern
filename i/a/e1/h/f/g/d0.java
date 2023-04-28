package i.a.e1.h.f.g;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleFlatMapMaybe.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class d0<T, R> extends i.a.e1.c.z<R> {
    public final i.a.e1.c.x0<? extends T> b;
    public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.f0<? extends R>> c;

    /* compiled from: SingleFlatMapMaybe.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<R> implements i.a.e1.c.c0<R> {
        public final AtomicReference<i.a.e1.d.f> b;
        public final i.a.e1.c.c0<? super R> c;

        public a(AtomicReference<i.a.e1.d.f> parent, i.a.e1.c.c0<? super R> downstream) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.m
        public void onComplete() {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
        public void onError(final Throwable e2) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
        public void onSubscribe(final i.a.e1.d.f d2) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0
        public void onSuccess(final R value) {
        }
    }

    /* compiled from: SingleFlatMapMaybe.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, R> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.u0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = -5843758257109742742L;
        public final i.a.e1.c.c0<? super R> downstream;
        public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.f0<? extends R>> mapper;

        public b(i.a.e1.c.c0<? super R> actual, i.a.e1.g.o<? super T, ? extends i.a.e1.c.f0<? extends R>> mapper) {
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
    }

    public d0(i.a.e1.c.x0<? extends T> source, i.a.e1.g.o<? super T, ? extends i.a.e1.c.f0<? extends R>> mapper) {
    }

    @Override // i.a.e1.c.z
    public void U1(i.a.e1.c.c0<? super R> downstream) {
    }
}
