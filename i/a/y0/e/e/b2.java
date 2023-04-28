package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableMergeWithSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class b2<T> extends i.a.y0.e.e.a<T, T> {
    public final i.a.q0<? extends T> c;

    /* compiled from: ObservableMergeWithSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements i.a.i0<T>, i.a.u0.c {
        public static final int OTHER_STATE_CONSUMED_OR_EMPTY = 2;
        public static final int OTHER_STATE_HAS_VALUE = 1;
        private static final long serialVersionUID = -4592979584110982903L;
        public volatile boolean disposed;
        public final i.a.i0<? super T> downstream;
        public final i.a.y0.j.c error;
        public final AtomicReference<i.a.u0.c> mainDisposable;
        public volatile boolean mainDone;
        public final C0570a<T> otherObserver;
        public volatile int otherState;
        public volatile i.a.y0.c.n<T> queue;
        public T singleItem;

        /* compiled from: ObservableMergeWithSingle.java */
        /* renamed from: i.a.y0.e.e.b2$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class C0570a<T> extends AtomicReference<i.a.u0.c> implements i.a.n0<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            public final a<T> parent;

            public C0570a(a<T> aVar) {
            }

            @Override // i.a.n0
            public void onError(Throwable th) {
            }

            @Override // i.a.n0
            public void onSubscribe(i.a.u0.c cVar) {
            }

            @Override // i.a.n0
            public void onSuccess(T t) {
            }
        }

        public a(i.a.i0<? super T> i0Var) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void drain() {
        }

        public void drainLoop() {
        }

        public i.a.y0.c.n<T> getOrCreateQueue() {
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

        public void otherError(Throwable th) {
        }

        public void otherSuccess(T t) {
        }
    }

    public b2(i.a.b0<T> b0Var, i.a.q0<? extends T> q0Var) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super T> i0Var) {
    }
}
