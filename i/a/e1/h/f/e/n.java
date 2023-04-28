package i.a.e1.h.f.e;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableBufferBoundary.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class n<T, U extends Collection<? super T>, Open, Close> extends i.a.e1.h.f.e.a<T, U> {
    public final i.a.e1.g.s<U> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.c.n0<? extends Open> f27527d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.g.o<? super Open, ? extends i.a.e1.c.n0<? extends Close>> f27528e;

    /* compiled from: ObservableBufferBoundary.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements i.a.e1.c.p0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = -8466418554264089604L;
        public final i.a.e1.g.o<? super Open, ? extends i.a.e1.c.n0<? extends Close>> bufferClose;
        public final i.a.e1.c.n0<? extends Open> bufferOpen;
        public final i.a.e1.g.s<C> bufferSupplier;
        public Map<Long, C> buffers;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final i.a.e1.c.p0<? super C> downstream;
        public final i.a.e1.h.k.c errors;
        public long index;
        public final i.a.e1.d.d observers;
        public final i.a.e1.h.g.c<C> queue;
        public final AtomicReference<i.a.e1.d.f> upstream;

        /* compiled from: ObservableBufferBoundary.java */
        /* renamed from: i.a.e1.h.f.e.n$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0486a<Open> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.p0<Open>, i.a.e1.d.f {
            private static final long serialVersionUID = -8498650778633225126L;
            public final a<?, ?, Open, ?> parent;

            public C0486a(a<?, ?, Open, ?> parent) {
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
            public void onNext(Open t) {
            }

            @Override // i.a.e1.c.p0
            public void onSubscribe(i.a.e1.d.f d2) {
            }
        }

        public a(i.a.e1.c.p0<? super C> actual, i.a.e1.c.n0<? extends Open> bufferOpen, i.a.e1.g.o<? super Open, ? extends i.a.e1.c.n0<? extends Close>> bufferClose, i.a.e1.g.s<C> bufferSupplier) {
        }

        public void boundaryError(i.a.e1.d.f observer, Throwable ex) {
        }

        public void close(b<T, C> closer, long idx) {
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

        public void open(Open token) {
        }

        public void openComplete(C0486a<Open> os) {
        }
    }

    /* compiled from: ObservableBufferBoundary.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, C extends Collection<? super T>> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.p0<Object>, i.a.e1.d.f {
        private static final long serialVersionUID = -8498650778633225126L;
        public final long index;
        public final a<T, C, ?, ?> parent;

        public b(a<T, C, ?, ?> parent, long index) {
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
        public void onNext(Object t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }
    }

    public n(i.a.e1.c.n0<T> source, i.a.e1.c.n0<? extends Open> bufferOpen, i.a.e1.g.o<? super Open, ? extends i.a.e1.c.n0<? extends Close>> bufferClose, i.a.e1.g.s<U> bufferSupplier) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super U> t) {
    }
}
