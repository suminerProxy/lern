package i.a.e1.h.f.e;

import i.a.e1.c.q0;

/* compiled from: ObservableObserveOn.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class h2<T> extends i.a.e1.h.f.e.a<T, T> {
    public final i.a.e1.c.q0 c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f27470d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27471e;

    /* compiled from: ObservableObserveOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends i.a.e1.h.e.b<T> implements i.a.e1.c.p0<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;
        public final int bufferSize;
        public final boolean delayError;
        public volatile boolean disposed;
        public volatile boolean done;
        public final i.a.e1.c.p0<? super T> downstream;
        public Throwable error;
        public boolean outputFused;
        public i.a.e1.h.c.q<T> queue;
        public int sourceMode;
        public i.a.e1.d.f upstream;
        public final q0.c worker;

        public a(i.a.e1.c.p0<? super T> actual, q0.c worker, boolean delayError, int bufferSize) {
        }

        public boolean checkTerminated(boolean d2, boolean empty, i.a.e1.c.p0<? super T> a2) {
        }

        @Override // i.a.e1.h.c.q
        public void clear() {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void drainFused() {
        }

        public void drainNormal() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.h.c.q
        public boolean isEmpty() {
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

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public T poll() throws Throwable {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int mode) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public void schedule() {
        }
    }

    public h2(i.a.e1.c.n0<T> source, i.a.e1.c.q0 scheduler, boolean delayError, int bufferSize) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> observer) {
    }
}
