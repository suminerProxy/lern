package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableWindowBoundary.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class k4<T, B> extends i.a.e1.h.f.e.a<T, i.a.e1.c.i0<T>> {
    public final i.a.e1.c.n0<B> c;

    /* renamed from: d  reason: collision with root package name */
    public final int f27498d;

    /* compiled from: ObservableWindowBoundary.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, B> extends i.a.e1.j.e<B> {
        public final b<T, B> c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f27499d;

        public a(b<T, B> parent) {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(B t) {
        }
    }

    /* compiled from: ObservableWindowBoundary.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, B> extends AtomicInteger implements i.a.e1.c.p0<T>, i.a.e1.d.f, Runnable {
        public static final Object NEXT_WINDOW = null;
        private static final long serialVersionUID = 2233020065421370272L;
        public final a<T, B> boundaryObserver;
        public final int capacityHint;
        public volatile boolean done;
        public final i.a.e1.c.p0<? super i.a.e1.c.i0<T>> downstream;
        public final i.a.e1.h.k.c errors;
        public final i.a.e1.h.g.a<Object> queue;
        public final AtomicBoolean stopWindows;
        public final AtomicReference<i.a.e1.d.f> upstream;
        public i.a.e1.o.j<T> window;
        public final AtomicInteger windows;

        public b(i.a.e1.c.p0<? super i.a.e1.c.i0<T>> downstream, int capacityHint) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void drain() {
        }

        public void innerComplete() {
        }

        public void innerError(Throwable e2) {
        }

        public void innerNext() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public k4(i.a.e1.c.n0<T> source, i.a.e1.c.n0<B> other, int capacityHint) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super i.a.e1.c.i0<T>> observer) {
    }
}
