package i.a.e1.h.f.e;

import i.a.e1.c.q0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableTimeoutTimed.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class d4<T> extends i.a.e1.h.f.e.a<T, T> {
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeUnit f27417d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.c.q0 f27418e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.e1.c.n0<? extends T> f27419f;

    /* compiled from: ObservableTimeoutTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> implements i.a.e1.c.p0<T> {
        public final i.a.e1.c.p0<? super T> b;
        public final AtomicReference<i.a.e1.d.f> c;

        public a(i.a.e1.c.p0<? super T> actual, AtomicReference<i.a.e1.d.f> arbiter) {
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

    /* compiled from: ObservableTimeoutTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.p0<T>, i.a.e1.d.f, d {
        private static final long serialVersionUID = 3764492702657003550L;
        public final i.a.e1.c.p0<? super T> downstream;
        public i.a.e1.c.n0<? extends T> fallback;
        public final AtomicLong index;
        public final i.a.e1.h.a.f task;
        public final long timeout;
        public final TimeUnit unit;
        public final AtomicReference<i.a.e1.d.f> upstream;
        public final q0.c worker;

        public b(i.a.e1.c.p0<? super T> actual, long timeout, TimeUnit unit, q0.c worker, i.a.e1.c.n0<? extends T> fallback) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
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

        @Override // i.a.e1.h.f.e.d4.d
        public void onTimeout(long idx) {
        }

        public void startTimeout(long nextIndex) {
        }
    }

    /* compiled from: ObservableTimeoutTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T> extends AtomicLong implements i.a.e1.c.p0<T>, i.a.e1.d.f, d {
        private static final long serialVersionUID = 3764492702657003550L;
        public final i.a.e1.c.p0<? super T> downstream;
        public final i.a.e1.h.a.f task;
        public final long timeout;
        public final TimeUnit unit;
        public final AtomicReference<i.a.e1.d.f> upstream;
        public final q0.c worker;

        public c(i.a.e1.c.p0<? super T> actual, long timeout, TimeUnit unit, q0.c worker) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
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

        @Override // i.a.e1.h.f.e.d4.d
        public void onTimeout(long idx) {
        }

        public void startTimeout(long nextIndex) {
        }
    }

    /* compiled from: ObservableTimeoutTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface d {
        void onTimeout(long idx);
    }

    /* compiled from: ObservableTimeoutTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class e implements Runnable {
        public final d b;
        public final long c;

        public e(long idx, d parent) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public d4(i.a.e1.c.i0<T> source, long timeout, TimeUnit unit, i.a.e1.c.q0 scheduler, i.a.e1.c.n0<? extends T> other) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> observer) {
    }
}
