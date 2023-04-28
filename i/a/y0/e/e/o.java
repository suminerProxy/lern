package i.a.y0.e.e;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableBufferBoundarySupplier.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class o<T, U extends Collection<? super T>, B> extends i.a.y0.e.e.a<T, U> {
    public final Callable<? extends i.a.g0<B>> c;

    /* renamed from: d  reason: collision with root package name */
    public final Callable<U> f28878d;

    /* compiled from: ObservableBufferBoundarySupplier.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, U extends Collection<? super T>, B> extends i.a.a1.e<B> {
        public final b<T, U, B> c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f28879d;

        public a(b<T, U, B> bVar) {
        }

        @Override // i.a.i0
        public void onComplete() {
        }

        @Override // i.a.i0
        public void onError(Throwable th) {
        }

        @Override // i.a.i0
        public void onNext(B b) {
        }
    }

    /* compiled from: ObservableBufferBoundarySupplier.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, U extends Collection<? super T>, B> extends i.a.y0.d.v<T, U, U> implements i.a.i0<T>, i.a.u0.c {
        public final Callable<U> L;
        public final Callable<? extends i.a.g0<B>> M;
        public i.a.u0.c N;
        public final AtomicReference<i.a.u0.c> O;
        public U P;

        public b(i.a.i0<? super U> i0Var, Callable<U> callable, Callable<? extends i.a.g0<B>> callable2) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.y0.d.v, i.a.y0.j.r
        public /* bridge */ /* synthetic */ void f(i.a.i0 i0Var, Object obj) {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        public void j(i.a.i0<? super U> i0Var, U u) {
        }

        public void k() {
        }

        public void l() {
        }

        @Override // i.a.i0
        public void onComplete() {
        }

        @Override // i.a.i0
        public void onError(Throwable th) {
        }

        @Override // i.a.i0
        public void onNext(T t) {
        }

        @Override // i.a.i0
        public void onSubscribe(i.a.u0.c cVar) {
        }
    }

    public o(i.a.g0<T> g0Var, Callable<? extends i.a.g0<B>> callable, Callable<U> callable2) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super U> i0Var) {
    }
}
