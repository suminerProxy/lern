package i.a.e1.h.f.c;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeOnErrorNext.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class d1<T> extends i.a.e1.h.f.c.a<T, T> {
    public final i.a.e1.g.o<? super Throwable, ? extends i.a.e1.c.f0<? extends T>> c;

    /* compiled from: MaybeOnErrorNext.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.c0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = 2026620218879969836L;
        public final i.a.e1.c.c0<? super T> downstream;
        public final i.a.e1.g.o<? super Throwable, ? extends i.a.e1.c.f0<? extends T>> resumeFunction;

        /* compiled from: MaybeOnErrorNext.java */
        /* renamed from: i.a.e1.h.f.c.d1$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0456a<T> implements i.a.e1.c.c0<T> {
            public final i.a.e1.c.c0<? super T> b;
            public final AtomicReference<i.a.e1.d.f> c;

            public C0456a(i.a.e1.c.c0<? super T> actual, AtomicReference<i.a.e1.d.f> d2) {
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

        public a(i.a.e1.c.c0<? super T> actual, i.a.e1.g.o<? super Throwable, ? extends i.a.e1.c.f0<? extends T>> resumeFunction) {
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

    public d1(i.a.e1.c.f0<T> source, i.a.e1.g.o<? super Throwable, ? extends i.a.e1.c.f0<? extends T>> resumeFunction) {
    }

    @Override // i.a.e1.c.z
    public void U1(i.a.e1.c.c0<? super T> observer) {
    }
}
