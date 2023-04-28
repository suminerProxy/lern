package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableConcatWithSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class z<T> extends i.a.e1.h.f.e.a<T, T> {
    public final i.a.e1.c.x0<? extends T> c;

    /* compiled from: ObservableConcatWithSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.p0<T>, i.a.e1.c.u0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = -1953724749712440952L;
        public final i.a.e1.c.p0<? super T> downstream;
        public boolean inSingle;
        public i.a.e1.c.x0<? extends T> other;

        public a(i.a.e1.c.p0<? super T> actual, i.a.e1.c.x0<? extends T> other) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // i.a.e1.c.u0
        public void onSuccess(T t) {
        }
    }

    public z(i.a.e1.c.i0<T> source, i.a.e1.c.x0<? extends T> other) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> observer) {
    }
}
