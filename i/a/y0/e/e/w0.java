package i.a.y0.e.e;

import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMap.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class w0<T, U> extends i.a.y0.e.e.a<T, U> {
    public final i.a.x0.o<? super T, ? extends i.a.g0<? extends U>> c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f28981d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28982e;

    /* renamed from: f  reason: collision with root package name */
    public final int f28983f;

    /* compiled from: ObservableFlatMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, U> extends AtomicReference<i.a.u0.c> implements i.a.i0<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        public volatile boolean done;
        public int fusionMode;
        public final long id;
        public final b<T, U> parent;
        public volatile i.a.y0.c.o<U> queue;

        public a(b<T, U> bVar, long j2) {
        }

        public void dispose() {
        }

        @Override // i.a.i0
        public void onComplete() {
        }

        @Override // i.a.i0
        public void onError(Throwable th) {
        }

        @Override // i.a.i0
        public void onNext(U u) {
        }

        @Override // i.a.i0
        public void onSubscribe(i.a.u0.c cVar) {
        }
    }

    /* compiled from: ObservableFlatMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, U> extends AtomicInteger implements i.a.u0.c, i.a.i0<T> {
        public static final a<?, ?>[] CANCELLED = null;
        public static final a<?, ?>[] EMPTY = null;
        private static final long serialVersionUID = -2117620485640801370L;
        public final int bufferSize;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final i.a.i0<? super U> downstream;
        public final i.a.y0.j.c errors;
        public long lastId;
        public int lastIndex;
        public final i.a.x0.o<? super T, ? extends i.a.g0<? extends U>> mapper;
        public final int maxConcurrency;
        public final AtomicReference<a<?, ?>[]> observers;
        public volatile i.a.y0.c.n<U> queue;
        public Queue<i.a.g0<? extends U>> sources;
        public long uniqueId;
        public i.a.u0.c upstream;
        public int wip;

        public b(i.a.i0<? super U> i0Var, i.a.x0.o<? super T, ? extends i.a.g0<? extends U>> oVar, boolean z, int i2, int i3) {
        }

        public boolean addInner(a<T, U> aVar) {
        }

        public boolean checkTerminate() {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public boolean disposeAll() {
        }

        public void drain() {
        }

        public void drainLoop() {
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

        public void removeInner(a<T, U> aVar) {
        }

        public void subscribeInner(i.a.g0<? extends U> g0Var) {
        }

        public void tryEmit(U u, a<T, U> aVar) {
        }

        public boolean tryEmitScalar(Callable<? extends U> callable) {
        }
    }

    public w0(i.a.g0<T> g0Var, i.a.x0.o<? super T, ? extends i.a.g0<? extends U>> oVar, boolean z, int i2, int i3) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super U> i0Var) {
    }
}
