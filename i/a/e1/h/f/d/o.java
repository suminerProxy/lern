package i.a.e1.h.f.d;

import i.a.e1.c.c0;
import i.a.e1.c.f0;
import i.a.e1.c.i0;
import i.a.e1.c.n0;
import i.a.e1.c.p0;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeFlatMapObservable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class o<T, R> extends i0<R> {
    public final f0<T> b;
    public final i.a.e1.g.o<? super T, ? extends n0<? extends R>> c;

    /* compiled from: MaybeFlatMapObservable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> extends AtomicReference<i.a.e1.d.f> implements p0<R>, c0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = -8948264376121066672L;
        public final p0<? super R> downstream;
        public final i.a.e1.g.o<? super T, ? extends n0<? extends R>> mapper;

        public a(p0<? super R> downstream, i.a.e1.g.o<? super T, ? extends n0<? extends R>> mapper) {
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
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(R t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0
        public void onSuccess(T t) {
        }
    }

    public o(f0<T> source, i.a.e1.g.o<? super T, ? extends n0<? extends R>> mapper) {
    }

    @Override // i.a.e1.c.i0
    public void c6(p0<? super R> observer) {
    }
}
