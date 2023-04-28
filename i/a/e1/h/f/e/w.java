package i.a.e1.h.f.e;

import i.a.e1.c.q0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableConcatMapScheduler.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class w<T, U> extends i.a.e1.h.f.e.a<T, U> {
    public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<? extends U>> c;

    /* renamed from: d  reason: collision with root package name */
    public final int f27661d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.h.k.j f27662e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.e1.c.q0 f27663f;

    /* compiled from: ObservableConcatMapScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> extends AtomicInteger implements i.a.e1.c.p0<T>, i.a.e1.d.f, Runnable {
        private static final long serialVersionUID = -6951100001833242599L;
        public volatile boolean active;
        public final int bufferSize;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final i.a.e1.c.p0<? super R> downstream;
        public final i.a.e1.h.k.c errors;
        public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<? extends R>> mapper;
        public final C0489a<R> observer;
        public i.a.e1.h.c.q<T> queue;
        public int sourceMode;
        public final boolean tillTheEnd;
        public i.a.e1.d.f upstream;
        public final q0.c worker;

        /* compiled from: ObservableConcatMapScheduler.java */
        /* renamed from: i.a.e1.h.f.e.w$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0489a<R> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.p0<R> {
            private static final long serialVersionUID = 2620149119579502636L;
            public final i.a.e1.c.p0<? super R> downstream;
            public final a<?, R> parent;

            public C0489a(i.a.e1.c.p0<? super R> actual, a<?, R> parent) {
            }

            public void dispose() {
            }

            @Override // i.a.e1.c.p0
            public void onComplete() {
            }

            @Override // i.a.e1.c.p0
            public void onError(Throwable e2) {
            }

            @Override // i.a.e1.c.p0
            public void onNext(R value) {
            }

            @Override // i.a.e1.c.p0
            public void onSubscribe(i.a.e1.d.f d2) {
            }
        }

        public a(i.a.e1.c.p0<? super R> actual, i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<? extends R>> mapper, int bufferSize, boolean tillTheEnd, q0.c worker) {
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
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(T value) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: ObservableConcatMapScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, U> extends AtomicInteger implements i.a.e1.c.p0<T>, i.a.e1.d.f, Runnable {
        private static final long serialVersionUID = 8828587559905699186L;
        public volatile boolean active;
        public final int bufferSize;
        public volatile boolean disposed;
        public volatile boolean done;
        public final i.a.e1.c.p0<? super U> downstream;
        public int fusionMode;
        public final a<U> inner;
        public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<? extends U>> mapper;
        public i.a.e1.h.c.q<T> queue;
        public i.a.e1.d.f upstream;
        public final q0.c worker;

        /* compiled from: ObservableConcatMapScheduler.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class a<U> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.p0<U> {
            private static final long serialVersionUID = -7449079488798789337L;
            public final i.a.e1.c.p0<? super U> downstream;
            public final b<?, ?> parent;

            public a(i.a.e1.c.p0<? super U> actual, b<?, ?> parent) {
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
            public void onNext(U t) {
            }

            @Override // i.a.e1.c.p0
            public void onSubscribe(i.a.e1.d.f d2) {
            }
        }

        public b(i.a.e1.c.p0<? super U> actual, i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<? extends U>> mapper, int bufferSize, q0.c worker) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void drain() {
        }

        public void innerComplete() {
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

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public w(i.a.e1.c.n0<T> source, i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<? extends U>> mapper, int bufferSize, i.a.e1.h.k.j delayErrors, i.a.e1.c.q0 scheduler) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super U> observer) {
    }
}
