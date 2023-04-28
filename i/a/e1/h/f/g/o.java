package i.a.e1.h.f.g;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SingleDoFinally.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class o<T> extends i.a.e1.c.r0<T> {
    public final i.a.e1.c.x0<T> b;
    public final i.a.e1.g.a c;

    /* compiled from: SingleDoFinally.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicInteger implements i.a.e1.c.u0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = 4109457741734051389L;
        public final i.a.e1.c.u0<? super T> downstream;
        public final i.a.e1.g.a onFinally;
        public i.a.e1.d.f upstream;

        public a(i.a.e1.c.u0<? super T> actual, i.a.e1.g.a onFinally) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.c.u0, i.a.e1.c.m
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.u0, i.a.e1.c.m
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // i.a.e1.c.u0
        public void onSuccess(T t) {
        }

        public void runFinally() {
        }
    }

    public o(i.a.e1.c.x0<T> source, i.a.e1.g.a onFinally) {
    }

    @Override // i.a.e1.c.r0
    public void M1(i.a.e1.c.u0<? super T> observer) {
    }
}
