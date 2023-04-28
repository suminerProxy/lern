package i.a.e1.h.f.g;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleFlatMapCompletable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class a0<T> extends i.a.e1.c.j {
    public final i.a.e1.c.x0<T> b;
    public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> c;

    /* compiled from: SingleFlatMapCompletable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.u0<T>, i.a.e1.c.m, i.a.e1.d.f {
        private static final long serialVersionUID = -2177128922851101253L;
        public final i.a.e1.c.m downstream;
        public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> mapper;

        public a(i.a.e1.c.m actual, i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> mapper) {
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

    public a0(i.a.e1.c.x0<T> source, i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> mapper) {
    }

    @Override // i.a.e1.c.j
    public void Y0(i.a.e1.c.m observer) {
    }
}
