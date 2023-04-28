package i.a.e1.h.f.g;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleResumeNext.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class u0<T> extends i.a.e1.c.r0<T> {
    public final i.a.e1.c.x0<? extends T> b;
    public final i.a.e1.g.o<? super Throwable, ? extends i.a.e1.c.x0<? extends T>> c;

    /* compiled from: SingleResumeNext.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.u0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = -5314538511045349925L;
        public final i.a.e1.c.u0<? super T> downstream;
        public final i.a.e1.g.o<? super Throwable, ? extends i.a.e1.c.x0<? extends T>> nextFunction;

        public a(i.a.e1.c.u0<? super T> actual, i.a.e1.g.o<? super Throwable, ? extends i.a.e1.c.x0<? extends T>> nextFunction) {
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

    public u0(i.a.e1.c.x0<? extends T> source, i.a.e1.g.o<? super Throwable, ? extends i.a.e1.c.x0<? extends T>> nextFunction) {
    }

    @Override // i.a.e1.c.r0
    public void M1(final i.a.e1.c.u0<? super T> observer) {
    }
}
