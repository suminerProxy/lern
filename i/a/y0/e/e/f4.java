package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableWindowBoundary.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class f4<T, B> extends i.a.y0.e.e.a<T, i.a.b0<T>> {
    public final i.a.g0<B> c;

    /* renamed from: d  reason: collision with root package name */
    public final int f28766d;

    /* compiled from: ObservableWindowBoundary.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, B> extends i.a.a1.e<B> {
        public final b<T, B> c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f28767d;

        public a(b<T, B> bVar) {
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

    /* compiled from: ObservableWindowBoundary.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, B> extends AtomicInteger implements i.a.i0<T>, i.a.u0.c, Runnable {
        public static final Object NEXT_WINDOW = null;
        private static final long serialVersionUID = 2233020065421370272L;
        public final a<T, B> boundaryObserver;
        public final int capacityHint;
        public volatile boolean done;
        public final i.a.i0<? super i.a.b0<T>> downstream;
        public final i.a.y0.j.c errors;
        public final i.a.y0.f.a<Object> queue;
        public final AtomicBoolean stopWindows;
        public final AtomicReference<i.a.u0.c> upstream;
        public i.a.g1.j<T> window;
        public final AtomicInteger windows;

        public b(i.a.i0<? super i.a.b0<T>> i0Var, int i2) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void drain() {
        }

        public void innerComplete() {
        }

        public void innerError(Throwable th) {
        }

        public void innerNext() {
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

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public f4(i.a.g0<T> g0Var, i.a.g0<B> g0Var2, int i2) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super i.a.b0<T>> i0Var) {
    }
}
