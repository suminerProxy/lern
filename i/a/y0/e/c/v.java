package i.a.y0.e.c;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeEqualSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class v<T> extends i.a.k0<Boolean> {
    public final i.a.y<? extends T> b;
    public final i.a.y<? extends T> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.d<? super T, ? super T> f28658d;

    /* compiled from: MaybeEqualSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements i.a.u0.c {
        public final i.a.n0<? super Boolean> downstream;
        public final i.a.x0.d<? super T, ? super T> isEqual;
        public final b<T> observer1;
        public final b<T> observer2;

        public a(i.a.n0<? super Boolean> n0Var, i.a.x0.d<? super T, ? super T> dVar) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void done() {
        }

        public void error(b<T> bVar, Throwable th) {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        public void subscribe(i.a.y<? extends T> yVar, i.a.y<? extends T> yVar2) {
        }
    }

    /* compiled from: MaybeEqualSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends AtomicReference<i.a.u0.c> implements i.a.v<T> {
        private static final long serialVersionUID = -3031974433025990931L;
        public final a<T> parent;
        public Object value;

        public b(a<T> aVar) {
        }

        public void dispose() {
        }

        @Override // i.a.v
        public void onComplete() {
        }

        @Override // i.a.v
        public void onError(Throwable th) {
        }

        @Override // i.a.v
        public void onSubscribe(i.a.u0.c cVar) {
        }

        @Override // i.a.v, i.a.n0
        public void onSuccess(T t) {
        }
    }

    public v(i.a.y<? extends T> yVar, i.a.y<? extends T> yVar2, i.a.x0.d<? super T, ? super T> dVar) {
    }

    @Override // i.a.k0
    public void b1(i.a.n0<? super Boolean> n0Var) {
    }
}
