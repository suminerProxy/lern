package i.a.e1.h.f.e;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMap.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class w0<T, U> extends i.a.e1.h.f.e.a<T, U> {
    public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<? extends U>> c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f27664d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27665e;

    /* renamed from: f  reason: collision with root package name */
    public final int f27666f;

    /* compiled from: ObservableFlatMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, U> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.p0<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        public volatile boolean done;
        public int fusionMode;
        public final long id;
        public final b<T, U> parent;
        public volatile i.a.e1.h.c.q<U> queue;

        public a(b<T, U> parent, long id) {
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

    /* compiled from: ObservableFlatMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, U> extends AtomicInteger implements i.a.e1.d.f, i.a.e1.c.p0<T> {
        public static final a<?, ?>[] CANCELLED = null;
        public static final a<?, ?>[] EMPTY = null;
        private static final long serialVersionUID = -2117620485640801370L;
        public final int bufferSize;
        public final boolean delayErrors;
        public volatile boolean disposed;
        public volatile boolean done;
        public final i.a.e1.c.p0<? super U> downstream;
        public final i.a.e1.h.k.c errors;
        public int lastIndex;
        public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<? extends U>> mapper;
        public final int maxConcurrency;
        public final AtomicReference<a<?, ?>[]> observers;
        public volatile i.a.e1.h.c.p<U> queue;
        public Queue<i.a.e1.c.n0<? extends U>> sources;
        public long uniqueId;
        public i.a.e1.d.f upstream;
        public int wip;

        public b(i.a.e1.c.p0<? super U> actual, i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<? extends U>> mapper, boolean delayErrors, int maxConcurrency, int bufferSize) {
        }

        public boolean addInner(a<T, U> inner) {
        }

        public boolean checkTerminate() {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public boolean disposeAll() {
        }

        public void drain() {
        }

        public void drainLoop() {
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

        public void removeInner(a<T, U> inner) {
        }

        public void subscribeInner(i.a.e1.c.n0<? extends U> p2) {
        }

        public void subscribeMore(int innerCompleted) {
        }

        public void tryEmit(U value, a<T, U> inner) {
        }

        public boolean tryEmitScalar(i.a.e1.g.s<? extends U> value) {
        }
    }

    public w0(i.a.e1.c.n0<T> source, i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<? extends U>> mapper, boolean delayErrors, int maxConcurrency, int bufferSize) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super U> t) {
    }
}
