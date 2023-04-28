package i.a.y0.e.e;

import i.a.j0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableThrottleLatest.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class v3<T> extends i.a.y0.e.e.a<T, T> {
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeUnit f28975d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.j0 f28976e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f28977f;

    /* compiled from: ObservableThrottleLatest.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements i.a.i0<T>, i.a.u0.c, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final i.a.i0<? super T> downstream;
        public final boolean emitLast;
        public Throwable error;
        public final AtomicReference<T> latest;
        public final long timeout;
        public volatile boolean timerFired;
        public boolean timerRunning;
        public final TimeUnit unit;
        public i.a.u0.c upstream;
        public final j0.c worker;

        public a(i.a.i0<? super T> i0Var, long j2, TimeUnit timeUnit, j0.c cVar, boolean z) {
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

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public v3(i.a.b0<T> b0Var, long j2, TimeUnit timeUnit, i.a.j0 j0Var, boolean z) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super T> i0Var) {
    }
}
