package i.a.y0.e.e;

import i.a.j0;

/* compiled from: ObservableObserveOn.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class d2<T> extends i.a.y0.e.e.a<T, T> {
    public final i.a.j0 c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f28727d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28728e;

    /* compiled from: ObservableObserveOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends i.a.y0.d.b<T> implements i.a.i0<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;
        public final int bufferSize;
        public final boolean delayError;
        public volatile boolean disposed;
        public volatile boolean done;
        public final i.a.i0<? super T> downstream;
        public Throwable error;
        public boolean outputFused;
        public i.a.y0.c.o<T> queue;
        public int sourceMode;
        public i.a.u0.c upstream;
        public final j0.c worker;

        public a(i.a.i0<? super T> i0Var, j0.c cVar, boolean z, int i2) {
        }

        public boolean checkTerminated(boolean z, boolean z2, i.a.i0<? super T> i0Var) {
        }

        @Override // i.a.y0.c.o
        public void clear() {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void drainFused() {
        }

        public void drainNormal() {
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

        @Override // java.lang.Runnable
        public void run() {
        }

        public void schedule() {
        }
    }

    public d2(i.a.g0<T> g0Var, i.a.j0 j0Var, boolean z, int i2) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super T> i0Var) {
    }
}
