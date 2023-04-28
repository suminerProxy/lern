package i.a.e1.h.f.g;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleDelayWithSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class j<T, U> extends i.a.e1.c.r0<T> {
    public final i.a.e1.c.x0<T> b;
    public final i.a.e1.c.x0<U> c;

    /* compiled from: SingleDelayWithSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, U> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.u0<U>, i.a.e1.d.f {
        private static final long serialVersionUID = -8565274649390031272L;
        public final i.a.e1.c.u0<? super T> downstream;
        public final i.a.e1.c.x0<T> source;

        public a(i.a.e1.c.u0<? super T> actual, i.a.e1.c.x0<T> source) {
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
        public void onSuccess(U value) {
        }
    }

    public j(i.a.e1.c.x0<T> source, i.a.e1.c.x0<U> other) {
    }

    @Override // i.a.e1.c.r0
    public void M1(i.a.e1.c.u0<? super T> observer) {
    }
}
