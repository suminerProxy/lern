package i.a.e1.h.f.d;

import i.a.e1.c.i0;
import i.a.e1.c.n0;
import i.a.e1.c.p0;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableAndThenObservable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class a<R> extends i0<R> {
    public final i.a.e1.c.p b;
    public final n0<? extends R> c;

    /* compiled from: CompletableAndThenObservable.java */
    /* renamed from: i.a.e1.h.f.d.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class C0463a<R> extends AtomicReference<i.a.e1.d.f> implements p0<R>, i.a.e1.c.m, i.a.e1.d.f {
        private static final long serialVersionUID = -8948264376121066672L;
        public final p0<? super R> downstream;
        public n0<? extends R> other;

        public C0463a(p0<? super R> downstream, n0<? extends R> other) {
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
    }

    public a(i.a.e1.c.p source, n0<? extends R> other) {
    }

    @Override // i.a.e1.c.i0
    public void c6(p0<? super R> observer) {
    }
}
