package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMapCompletable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class x0<T> extends i.a.y0.e.e.a<T, T> {
    public final i.a.x0.o<? super T, ? extends i.a.i> c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f28990d;

    /* compiled from: ObservableFlatMapCompletable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends i.a.y0.d.b<T> implements i.a.i0<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        public final boolean delayErrors;
        public volatile boolean disposed;
        public final i.a.i0<? super T> downstream;
        public final i.a.y0.j.c errors;
        public final i.a.x0.o<? super T, ? extends i.a.i> mapper;
        public final i.a.u0.b set;
        public i.a.u0.c upstream;

        /* compiled from: ObservableFlatMapCompletable.java */
        /* renamed from: i.a.y0.e.e.x0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class C0582a extends AtomicReference<i.a.u0.c> implements i.a.f, i.a.u0.c {
            private static final long serialVersionUID = 8606673141535671828L;
            public final /* synthetic */ a this$0;

            public C0582a(a aVar) {
            }

            @Override // i.a.u0.c
            public void dispose() {
            }

            @Override // i.a.u0.c
            public boolean isDisposed() {
            }

            @Override // i.a.f
            public void onComplete() {
            }

            @Override // i.a.f
            public void onError(Throwable th) {
            }

            @Override // i.a.f
            public void onSubscribe(i.a.u0.c cVar) {
            }
        }

        public a(i.a.i0<? super T> i0Var, i.a.x0.o<? super T, ? extends i.a.i> oVar, boolean z) {
        }

        @Override // i.a.y0.c.o
        public void clear() {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void innerComplete(a<T>.C0582a c0582a) {
        }

        public void innerError(a<T>.C0582a c0582a, Throwable th) {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // i.a.y0.c.o
        public boolean isEmpty() {
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

        @Override // i.a.y0.c.o
        @i.a.t0.g
        public T poll() throws Exception {
        }

        @Override // i.a.y0.c.k
        public int requestFusion(int i2) {
        }
    }

    public x0(i.a.g0<T> g0Var, i.a.x0.o<? super T, ? extends i.a.i> oVar, boolean z) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super T> i0Var) {
    }
}
