package i.a.e1.h.f.e;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableWindowBoundarySelector.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class l4<T, B, V> extends i.a.e1.h.f.e.a<T, i.a.e1.c.i0<T>> {
    public final i.a.e1.c.n0<B> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super B, ? extends i.a.e1.c.n0<V>> f27505d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27506e;

    /* compiled from: ObservableWindowBoundarySelector.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, B, V> extends AtomicInteger implements i.a.e1.c.p0<T>, i.a.e1.d.f, Runnable {
        private static final long serialVersionUID = 8646217640096099753L;
        public final int bufferSize;
        public final i.a.e1.g.o<? super B, ? extends i.a.e1.c.n0<V>> closingIndicator;
        public final i.a.e1.c.p0<? super i.a.e1.c.i0<T>> downstream;
        public final AtomicBoolean downstreamDisposed;
        public long emitted;
        public final i.a.e1.h.k.c error;
        public final i.a.e1.c.n0<B> open;
        public volatile boolean openDone;
        public final i.a.e1.h.c.p<Object> queue;
        public final AtomicLong requested;
        public final i.a.e1.d.d resources;
        public final c<B> startObserver;
        public i.a.e1.d.f upstream;
        public volatile boolean upstreamCanceled;
        public volatile boolean upstreamDone;
        public final AtomicLong windowCount;
        public final List<i.a.e1.o.j<T>> windows;

        /* compiled from: ObservableWindowBoundarySelector.java */
        /* renamed from: i.a.e1.h.f.e.l4$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0485a<T, V> extends i.a.e1.c.i0<T> implements i.a.e1.c.p0<V>, i.a.e1.d.f {
            public final a<T, ?, V> b;
            public final i.a.e1.o.j<T> c;

            /* renamed from: d  reason: collision with root package name */
            public final AtomicReference<i.a.e1.d.f> f27507d;

            /* renamed from: e  reason: collision with root package name */
            public final AtomicBoolean f27508e;

            public C0485a(a<T, ?, V> parent, i.a.e1.o.j<T> window) {
            }

            @Override // i.a.e1.c.i0
            public void c6(i.a.e1.c.p0<? super T> o2) {
            }

            @Override // i.a.e1.d.f
            public void dispose() {
            }

            @Override // i.a.e1.d.f
            public boolean isDisposed() {
            }

            @Override // i.a.e1.c.p0
            public void onComplete() {
            }

            @Override // i.a.e1.c.p0
            public void onError(Throwable t) {
            }

            @Override // i.a.e1.c.p0
            public void onNext(V t) {
            }

            @Override // i.a.e1.c.p0
            public void onSubscribe(i.a.e1.d.f d2) {
            }

            public boolean z8() {
            }
        }

        /* compiled from: ObservableWindowBoundarySelector.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class b<B> {

            /* renamed from: a  reason: collision with root package name */
            public final B f27509a;

            public b(B item) {
            }
        }

        /* compiled from: ObservableWindowBoundarySelector.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class c<B> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.p0<B> {
            private static final long serialVersionUID = -3326496781427702834L;
            public final a<?, B, ?> parent;

            public c(a<?, B, ?> parent) {
            }

            public void dispose() {
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

            @Override // i.a.e1.c.p0
            public void onSubscribe(i.a.e1.d.f d2) {
            }
        }

        public a(i.a.e1.c.p0<? super i.a.e1.c.i0<T>> downstream, i.a.e1.c.n0<B> open, i.a.e1.g.o<? super B, ? extends i.a.e1.c.n0<V>> closingIndicator, int bufferSize) {
        }

        public void close(C0485a<T, V> what) {
        }

        public void closeError(Throwable t) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void drain() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        public void open(B startValue) {
        }

        public void openComplete() {
        }

        public void openError(Throwable t) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public void terminateDownstream(i.a.e1.c.p0<?> downstream) {
        }
    }

    public l4(i.a.e1.c.n0<T> source, i.a.e1.c.n0<B> open, i.a.e1.g.o<? super B, ? extends i.a.e1.c.n0<V>> closingIndicator, int bufferSize) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super i.a.e1.c.i0<T>> t) {
    }
}
