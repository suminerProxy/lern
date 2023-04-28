package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableCreate.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class c0<T> extends i.a.e1.c.i0<T> {
    public final i.a.e1.c.l0<T> b;

    /* compiled from: ObservableCreate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.k0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = -3434801548987643227L;
        public final i.a.e1.c.p0<? super T> observer;

        public a(i.a.e1.c.p0<? super T> observer) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.c.k0, i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.c.r
        public void onComplete() {
        }

        @Override // i.a.e1.c.r
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.r
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.k0
        public i.a.e1.c.k0<T> serialize() {
        }

        @Override // i.a.e1.c.k0
        public void setCancellable(i.a.e1.g.f c) {
        }

        @Override // i.a.e1.c.k0
        public void setDisposable(i.a.e1.d.f d2) {
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
        }

        @Override // i.a.e1.c.k0
        public boolean tryOnError(Throwable t) {
        }
    }

    /* compiled from: ObservableCreate.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends AtomicInteger implements i.a.e1.c.k0<T> {
        private static final long serialVersionUID = 4883307006032401862L;
        public volatile boolean done;
        public final i.a.e1.c.k0<T> emitter;
        public final i.a.e1.h.k.c errors;
        public final i.a.e1.h.g.c<T> queue;

        public b(i.a.e1.c.k0<T> emitter) {
        }

        public void drain() {
        }

        public void drainLoop() {
        }

        @Override // i.a.e1.c.k0, i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.c.r
        public void onComplete() {
        }

        @Override // i.a.e1.c.r
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.r
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.k0
        public i.a.e1.c.k0<T> serialize() {
        }

        @Override // i.a.e1.c.k0
        public void setCancellable(i.a.e1.g.f c) {
        }

        @Override // i.a.e1.c.k0
        public void setDisposable(i.a.e1.d.f d2) {
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public String toString() {
        }

        @Override // i.a.e1.c.k0
        public boolean tryOnError(Throwable t) {
        }
    }

    public c0(i.a.e1.c.l0<T> source) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> observer) {
    }
}
