package i.a.y0.e.c;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeObserveOn.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class z0<T> extends i.a.y0.e.c.a<T, T> {
    public final i.a.j0 c;

    /* compiled from: MaybeObserveOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicReference<i.a.u0.c> implements i.a.v<T>, i.a.u0.c, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        public final i.a.v<? super T> downstream;
        public Throwable error;
        public final i.a.j0 scheduler;
        public T value;

        public a(i.a.v<? super T> vVar, i.a.j0 j0Var) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
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

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public z0(i.a.y<T> yVar, i.a.j0 j0Var) {
    }

    @Override // i.a.s
    public void q1(i.a.v<? super T> vVar) {
    }
}
