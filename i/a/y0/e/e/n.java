package i.a.y0.e.e;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableBufferBoundary.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class n<T, U extends Collection<? super T>, Open, Close> extends i.a.y0.e.e.a<T, U> {
    public final Callable<U> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.g0<? extends Open> f28870d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.x0.o<? super Open, ? extends i.a.g0<? extends Close>> f28871e;

    /* compiled from: ObservableBufferBoundary.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements i.a.i0<T>, i.a.u0.c {
        private static final long serialVersionUID = -8466418554264089604L;
        public final i.a.x0.o<? super Open, ? extends i.a.g0<? extends Close>> bufferClose;
        public final i.a.g0<? extends Open> bufferOpen;
        public final Callable<C> bufferSupplier;
        public Map<Long, C> buffers;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final i.a.i0<? super C> downstream;
        public final i.a.y0.j.c errors;
        public long index;
        public final i.a.u0.b observers;
        public final i.a.y0.f.c<C> queue;
        public final AtomicReference<i.a.u0.c> upstream;

        /* compiled from: ObservableBufferBoundary.java */
        /* renamed from: i.a.y0.e.e.n$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class C0577a<Open> extends AtomicReference<i.a.u0.c> implements i.a.i0<Open>, i.a.u0.c {
            private static final long serialVersionUID = -8498650778633225126L;
            public final a<?, ?, Open, ?> parent;

            public C0577a(a<?, ?, Open, ?> aVar) {
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
            public void onNext(Open open) {
            }

            @Override // i.a.i0
            public void onSubscribe(i.a.u0.c cVar) {
            }
        }

        public a(i.a.i0<? super C> i0Var, i.a.g0<? extends Open> g0Var, i.a.x0.o<? super Open, ? extends i.a.g0<? extends Close>> oVar, Callable<C> callable) {
        }

        public void boundaryError(i.a.u0.c cVar, Throwable th) {
        }

        public void close(b<T, C> bVar, long j2) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void drain() {
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

        public void open(Open open) {
        }

        public void openComplete(C0577a<Open> c0577a) {
        }
    }

    /* compiled from: ObservableBufferBoundary.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, C extends Collection<? super T>> extends AtomicReference<i.a.u0.c> implements i.a.i0<Object>, i.a.u0.c {
        private static final long serialVersionUID = -8498650778633225126L;
        public final long index;
        public final a<T, C, ?, ?> parent;

        public b(a<T, C, ?, ?> aVar, long j2) {
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
        public void onNext(Object obj) {
        }

        @Override // i.a.i0
        public void onSubscribe(i.a.u0.c cVar) {
        }
    }

    public n(i.a.g0<T> g0Var, i.a.g0<? extends Open> g0Var2, i.a.x0.o<? super Open, ? extends i.a.g0<? extends Close>> oVar, Callable<U> callable) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super U> i0Var) {
    }
}
