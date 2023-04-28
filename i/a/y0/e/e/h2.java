package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservablePublishSelector.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class h2<T, R> extends i.a.y0.e.e.a<T, R> {
    public final i.a.x0.o<? super i.a.b0<T>, ? extends i.a.g0<R>> c;

    /* compiled from: ObservablePublishSelector.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> implements i.a.i0<T> {
        public final i.a.g1.e<T> b;
        public final AtomicReference<i.a.u0.c> c;

        public a(i.a.g1.e<T> eVar, AtomicReference<i.a.u0.c> atomicReference) {
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

    /* compiled from: ObservablePublishSelector.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, R> extends AtomicReference<i.a.u0.c> implements i.a.i0<R>, i.a.u0.c {
        private static final long serialVersionUID = 854110278590336484L;
        public final i.a.i0<? super R> downstream;
        public i.a.u0.c upstream;

        public b(i.a.i0<? super R> i0Var) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // i.a.i0
        public void onComplete() {
        }

        @Override // i.a.i0
        public void onError(Throwable th) {
        }

        @Override // i.a.i0
        public void onNext(R r) {
        }

        @Override // i.a.i0
        public void onSubscribe(i.a.u0.c cVar) {
        }
    }

    public h2(i.a.g0<T> g0Var, i.a.x0.o<? super i.a.b0<T>, ? extends i.a.g0<R>> oVar) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super R> i0Var) {
    }
}
