package i.a.e1.h.f.e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSampleTimed.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class a3<T> extends i.a.e1.h.f.e.a<T, T> {
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeUnit f27381d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.c.q0 f27382e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f27383f;

    /* compiled from: ObservableSampleTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends c<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        public final AtomicInteger wip;

        public a(i.a.e1.c.p0<? super T> actual, long period, TimeUnit unit, i.a.e1.c.q0 scheduler) {
        }

        @Override // i.a.e1.h.f.e.a3.c
        public void complete() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: ObservableSampleTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        public b(i.a.e1.c.p0<? super T> actual, long period, TimeUnit unit, i.a.e1.c.q0 scheduler) {
        }

        @Override // i.a.e1.h.f.e.a3.c
        public void complete() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: ObservableSampleTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class c<T> extends AtomicReference<T> implements i.a.e1.c.p0<T>, i.a.e1.d.f, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        public final i.a.e1.c.p0<? super T> downstream;
        public final long period;
        public final i.a.e1.c.q0 scheduler;
        public final AtomicReference<i.a.e1.d.f> timer;
        public final TimeUnit unit;
        public i.a.e1.d.f upstream;

        public c(i.a.e1.c.p0<? super T> actual, long period, TimeUnit unit, i.a.e1.c.q0 scheduler) {
        }

        public void cancelTimer() {
        }

        public abstract void complete();

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void emit() {
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
    }

    public a3(i.a.e1.c.n0<T> source, long period, TimeUnit unit, i.a.e1.c.q0 scheduler, boolean emitLast) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> t) {
    }
}
