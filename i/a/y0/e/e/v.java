package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableConcatMap.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class v<T, U> extends i.a.y0.e.e.a<T, U> {
    public final i.a.x0.o<? super T, ? extends i.a.g0<? extends U>> c;

    /* renamed from: d  reason: collision with root package name */
    public final int f28969d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.y0.j.j f28970e;

    /* compiled from: ObservableConcatMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends AtomicInteger implements i.a.i0<T>, i.a.u0.c {
        private static final long serialVersionUID = -6951100001833242599L;
        public volatile boolean active;
        public final int bufferSize;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final i.a.i0<? super R> downstream;
        public final i.a.y0.j.c error;
        public final i.a.x0.o<? super T, ? extends i.a.g0<? extends R>> mapper;
        public final C0581a<R> observer;
        public i.a.y0.c.o<T> queue;
        public int sourceMode;
        public final boolean tillTheEnd;
        public i.a.u0.c upstream;

        /* compiled from: ObservableConcatMap.java */
        /* renamed from: i.a.y0.e.e.v$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class C0581a<R> extends AtomicReference<i.a.u0.c> implements i.a.i0<R> {
            private static final long serialVersionUID = 2620149119579502636L;
            public final i.a.i0<? super R> downstream;
            public final a<?, R> parent;

            public C0581a(i.a.i0<? super R> i0Var, a<?, R> aVar) {
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
            public void onNext(R r) {
            }

            @Override // i.a.i0
            public void onSubscribe(i.a.u0.c cVar) {
            }
        }

        public a(i.a.i0<? super R> i0Var, i.a.x0.o<? super T, ? extends i.a.g0<? extends R>> oVar, int i2, boolean z) {
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
    }

    /* compiled from: ObservableConcatMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, U> extends AtomicInteger implements i.a.i0<T>, i.a.u0.c {
        private static final long serialVersionUID = 8828587559905699186L;
        public volatile boolean active;
        public final int bufferSize;
        public volatile boolean disposed;
        public volatile boolean done;
        public final i.a.i0<? super U> downstream;
        public int fusionMode;
        public final a<U> inner;
        public final i.a.x0.o<? super T, ? extends i.a.g0<? extends U>> mapper;
        public i.a.y0.c.o<T> queue;
        public i.a.u0.c upstream;

        /* compiled from: ObservableConcatMap.java */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class a<U> extends AtomicReference<i.a.u0.c> implements i.a.i0<U> {
            private static final long serialVersionUID = -7449079488798789337L;
            public final i.a.i0<? super U> downstream;
            public final b<?, ?> parent;

            public a(i.a.i0<? super U> i0Var, b<?, ?> bVar) {
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

        public b(i.a.i0<? super U> i0Var, i.a.x0.o<? super T, ? extends i.a.g0<? extends U>> oVar, int i2) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void drain() {
        }

        public void innerComplete() {
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
    }

    public v(i.a.g0<T> g0Var, i.a.x0.o<? super T, ? extends i.a.g0<? extends U>> oVar, int i2, i.a.y0.j.j jVar) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super U> i0Var) {
    }
}
