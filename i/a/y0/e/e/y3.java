package i.a.y0.e.e;

import i.a.j0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableTimeoutTimed.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class y3<T> extends i.a.y0.e.e.a<T, T> {
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeUnit f29002d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.j0 f29003e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.g0<? extends T> f29004f;

    /* compiled from: ObservableTimeoutTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> implements i.a.i0<T> {
        public final i.a.i0<? super T> b;
        public final AtomicReference<i.a.u0.c> c;

        public a(i.a.i0<? super T> i0Var, AtomicReference<i.a.u0.c> atomicReference) {
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

    /* compiled from: ObservableTimeoutTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends AtomicReference<i.a.u0.c> implements i.a.i0<T>, i.a.u0.c, d {
        private static final long serialVersionUID = 3764492702657003550L;
        public final i.a.i0<? super T> downstream;
        public i.a.g0<? extends T> fallback;
        public final AtomicLong index;
        public final i.a.y0.a.h task;
        public final long timeout;
        public final TimeUnit unit;
        public final AtomicReference<i.a.u0.c> upstream;
        public final j0.c worker;

        public b(i.a.i0<? super T> i0Var, long j2, TimeUnit timeUnit, j0.c cVar, i.a.g0<? extends T> g0Var) {
        }

        @Override // i.a.u0.c
        public void dispose() {
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

        @Override // i.a.y0.e.e.y3.d
        public void onTimeout(long j2) {
        }

        public void startTimeout(long j2) {
        }
    }

    /* compiled from: ObservableTimeoutTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T> extends AtomicLong implements i.a.i0<T>, i.a.u0.c, d {
        private static final long serialVersionUID = 3764492702657003550L;
        public final i.a.i0<? super T> downstream;
        public final i.a.y0.a.h task;
        public final long timeout;
        public final TimeUnit unit;
        public final AtomicReference<i.a.u0.c> upstream;
        public final j0.c worker;

        public c(i.a.i0<? super T> i0Var, long j2, TimeUnit timeUnit, j0.c cVar) {
        }

        @Override // i.a.u0.c
        public void dispose() {
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

        @Override // i.a.y0.e.e.y3.d
        public void onTimeout(long j2) {
        }

        public void startTimeout(long j2) {
        }
    }

    /* compiled from: ObservableTimeoutTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface d {
        void onTimeout(long j2);
    }

    /* compiled from: ObservableTimeoutTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class e implements Runnable {
        public final d b;
        public final long c;

        public e(long j2, d dVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public y3(i.a.b0<T> b0Var, long j2, TimeUnit timeUnit, i.a.j0 j0Var, i.a.g0<? extends T> g0Var) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super T> i0Var) {
    }
}
