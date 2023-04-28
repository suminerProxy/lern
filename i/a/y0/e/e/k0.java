package i.a.y0.e.e;

import java.util.Collection;
import java.util.concurrent.Callable;

/* compiled from: ObservableDistinct.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class k0<T, K> extends i.a.y0.e.e.a<T, T> {
    public final i.a.x0.o<? super T, K> c;

    /* renamed from: d  reason: collision with root package name */
    public final Callable<? extends Collection<? super K>> f28829d;

    /* compiled from: ObservableDistinct.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, K> extends i.a.y0.d.a<T, T> {

        /* renamed from: g  reason: collision with root package name */
        public final Collection<? super K> f28830g;

        /* renamed from: h  reason: collision with root package name */
        public final i.a.x0.o<? super T, K> f28831h;

        public a(i.a.i0<? super T> i0Var, i.a.x0.o<? super T, K> oVar, Collection<? super K> collection) {
        }

        @Override // i.a.y0.d.a, i.a.y0.c.o
        public void clear() {
        }

        @Override // i.a.y0.d.a, i.a.i0
        public void onComplete() {
        }

        @Override // i.a.y0.d.a, i.a.i0
        public void onError(Throwable th) {
        }

        @Override // i.a.i0
        public void onNext(T t) {
        }

        @Override // i.a.y0.c.o
        @i.a.t0.g
        public T poll() throws Exception {
        }

        @Override // i.a.y0.c.k
        public int requestFusion(int i2) {
        }
    }

    public k0(i.a.g0<T> g0Var, i.a.x0.o<? super T, K> oVar, Callable<? extends Collection<? super K>> callable) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super T> i0Var) {
    }
}
