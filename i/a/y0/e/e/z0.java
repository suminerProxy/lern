package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMapMaybe.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class z0<T, R> extends i.a.y0.e.e.a<T, R> {
    public final i.a.x0.o<? super T, ? extends i.a.y<? extends R>> c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f29005d;

    /* compiled from: ObservableFlatMapMaybe.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends AtomicInteger implements i.a.i0<T>, i.a.u0.c {
        private static final long serialVersionUID = 8600231336733376951L;
        public final AtomicInteger active;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public final i.a.i0<? super R> downstream;
        public final i.a.y0.j.c errors;
        public final i.a.x0.o<? super T, ? extends i.a.y<? extends R>> mapper;
        public final AtomicReference<i.a.y0.f.c<R>> queue;
        public final i.a.u0.b set;
        public i.a.u0.c upstream;

        /* compiled from: ObservableFlatMapMaybe.java */
        /* renamed from: i.a.y0.e.e.z0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class C0584a extends AtomicReference<i.a.u0.c> implements i.a.v<R>, i.a.u0.c {
            private static final long serialVersionUID = -502562646270949838L;
            public final /* synthetic */ a this$0;

            public C0584a(a aVar) {
            }

            @Override // i.a.u0.c
            public void dispose() {
            }

            @Override // i.a.u0.c
            public boolean isDisposed() {
            }

            @Override // i.a.v
            public void onComplete() {
            }

            @Override // i.a.v
            public void onError(Throwable th) {
            }

            @Override // i.a.v
            public void onSubscribe(i.a.u0.c cVar) {
            }

            @Override // i.a.v, i.a.n0
            public void onSuccess(R r) {
            }
        }

        public a(i.a.i0<? super R> i0Var, i.a.x0.o<? super T, ? extends i.a.y<? extends R>> oVar, boolean z) {
        }

        public void clear() {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void drain() {
        }

        public void drainLoop() {
        }

        public i.a.y0.f.c<R> getOrCreateQueue() {
        }

        public void innerComplete(a<T, R>.C0584a c0584a) {
        }

        public void innerError(a<T, R>.C0584a c0584a, Throwable th) {
        }

        public void innerSuccess(a<T, R>.C0584a c0584a, R r) {
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

    public z0(i.a.g0<T> g0Var, i.a.x0.o<? super T, ? extends i.a.y<? extends R>> oVar, boolean z) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super R> i0Var) {
    }
}
