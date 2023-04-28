package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableTakeUntil.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class r3<T, U> extends i.a.y0.e.e.a<T, T> {
    public final i.a.g0<? extends U> c;

    /* compiled from: ObservableTakeUntil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, U> extends AtomicInteger implements i.a.i0<T>, i.a.u0.c {
        private static final long serialVersionUID = 1418547743690811973L;
        public final i.a.i0<? super T> downstream;
        public final i.a.y0.j.c error;
        public final a<T, U>.C0579a otherObserver;
        public final AtomicReference<i.a.u0.c> upstream;

        /* compiled from: ObservableTakeUntil.java */
        /* renamed from: i.a.y0.e.e.r3$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class C0579a extends AtomicReference<i.a.u0.c> implements i.a.i0<U> {
            private static final long serialVersionUID = -8693423678067375039L;
            public final /* synthetic */ a this$0;

            public C0579a(a aVar) {
            }

            @Override // i.a.i0
            public void onComplete() {
            }

            @Override // i.a.i0
            public void onError(Throwable th) {
            }

            @Override // i.a.i0
            public void onNext(U u) {
            }

            @Override // i.a.i0
            public void onSubscribe(i.a.u0.c cVar) {
            }
        }

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

        public void otherComplete() {
        }

        public void otherError(Throwable th) {
        }
    }

    public r3(i.a.g0<T> g0Var, i.a.g0<? extends U> g0Var2) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super T> i0Var) {
    }
}
