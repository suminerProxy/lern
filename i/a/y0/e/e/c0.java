package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableCreate.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class c0<T> extends i.a.b0<T> {
    public final i.a.e0<T> b;

    /* compiled from: ObservableCreate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicReference<i.a.u0.c> implements i.a.d0<T>, i.a.u0.c {
        private static final long serialVersionUID = -3434801548987643227L;
        public final i.a.i0<? super T> observer;

        public a(i.a.i0<? super T> i0Var) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.d0, i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // i.a.k
        public void onComplete() {
        }

        @Override // i.a.k
        public void onError(Throwable th) {
        }

        @Override // i.a.k
        public void onNext(T t) {
        }

        @Override // i.a.d0
        public i.a.d0<T> serialize() {
        }

        @Override // i.a.d0
        public void setCancellable(i.a.x0.f fVar) {
        }

        @Override // i.a.d0
        public void setDisposable(i.a.u0.c cVar) {
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
        }

        @Override // i.a.d0
        public boolean tryOnError(Throwable th) {
        }
    }

    /* compiled from: ObservableCreate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends AtomicInteger implements i.a.d0<T> {
        private static final long serialVersionUID = 4883307006032401862L;
        public volatile boolean done;
        public final i.a.d0<T> emitter;
        public final i.a.y0.j.c error;
        public final i.a.y0.f.c<T> queue;

        public b(i.a.d0<T> d0Var) {
        }

        public void drain() {
        }

        public void drainLoop() {
        }

        @Override // i.a.d0, i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // i.a.k
        public void onComplete() {
        }

        @Override // i.a.k
        public void onError(Throwable th) {
        }

        @Override // i.a.k
        public void onNext(T t) {
        }

        @Override // i.a.d0
        public i.a.d0<T> serialize() {
        }

        @Override // i.a.d0
        public void setCancellable(i.a.x0.f fVar) {
        }

        @Override // i.a.d0
        public void setDisposable(i.a.u0.c cVar) {
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public String toString() {
        }

        @Override // i.a.d0
        public boolean tryOnError(Throwable th) {
        }
    }

    public c0(i.a.e0<T> e0Var) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super T> i0Var) {
    }
}
