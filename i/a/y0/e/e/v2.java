package i.a.y0.e.e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSampleTimed.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class v2<T> extends i.a.y0.e.e.a<T, T> {
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeUnit f28972d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.j0 f28973e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f28974f;

    /* compiled from: ObservableSampleTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends c<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        public final AtomicInteger wip;

        public a(i.a.i0<? super T> i0Var, long j2, TimeUnit timeUnit, i.a.j0 j0Var) {
        }

        @Override // i.a.y0.e.e.v2.c
        public void complete() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: ObservableSampleTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        public b(i.a.i0<? super T> i0Var, long j2, TimeUnit timeUnit, i.a.j0 j0Var) {
        }

        @Override // i.a.y0.e.e.v2.c
        public void complete() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: ObservableSampleTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class c<T> extends AtomicReference<T> implements i.a.i0<T>, i.a.u0.c, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        public final i.a.i0<? super T> downstream;
        public final long period;
        public final i.a.j0 scheduler;
        public final AtomicReference<i.a.u0.c> timer;
        public final TimeUnit unit;
        public i.a.u0.c upstream;

        public c(i.a.i0<? super T> i0Var, long j2, TimeUnit timeUnit, i.a.j0 j0Var) {
        }

        public void cancelTimer() {
        }

        public abstract void complete();

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void emit() {
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

    public v2(i.a.g0<T> g0Var, long j2, TimeUnit timeUnit, i.a.j0 j0Var, boolean z) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super T> i0Var) {
    }
}
