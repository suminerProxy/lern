package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ObservableUnsubscribeOn.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class c4<T> extends i.a.y0.e.e.a<T, T> {
    public final i.a.j0 c;

    /* compiled from: ObservableUnsubscribeOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicBoolean implements i.a.i0<T>, i.a.u0.c {
        private static final long serialVersionUID = 1015244841293359600L;
        public final i.a.i0<? super T> downstream;
        public final i.a.j0 scheduler;
        public i.a.u0.c upstream;

        /* compiled from: ObservableUnsubscribeOn.java */
        /* renamed from: i.a.y0.e.e.c4$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class RunnableC0571a implements Runnable {
            public final /* synthetic */ a b;

            public RunnableC0571a(a aVar) {
            }

            @Override // java.lang.Runnable
            public void run() {
            }
        }

        public a(i.a.i0<? super T> i0Var, i.a.j0 j0Var) {
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
    }

    public c4(i.a.g0<T> g0Var, i.a.j0 j0Var) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super T> i0Var) {
    }
}
