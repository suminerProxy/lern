package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSubscribeOn.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class k3<T> extends i.a.y0.e.e.a<T, T> {
    public final i.a.j0 c;

    /* compiled from: ObservableSubscribeOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicReference<i.a.u0.c> implements i.a.i0<T>, i.a.u0.c {
        private static final long serialVersionUID = 8094547886072529208L;
        public final i.a.i0<? super T> downstream;
        public final AtomicReference<i.a.u0.c> upstream;

        public a(i.a.i0<? super T> i0Var) {
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
        public void onNext(T t) {
        }

        @Override // i.a.i0
        public void onSubscribe(i.a.u0.c cVar) {
        }

        public void setDisposable(i.a.u0.c cVar) {
        }
    }

    /* compiled from: ObservableSubscribeOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class b implements Runnable {
        private final a<T> b;
        public final /* synthetic */ k3 c;

        public b(k3 k3Var, a<T> aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public k3(i.a.g0<T> g0Var, i.a.j0 j0Var) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super T> i0Var) {
    }
}
