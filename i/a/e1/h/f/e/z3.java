package i.a.e1.h.f.e;

import i.a.e1.c.q0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableThrottleFirstTimed.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class z3<T> extends i.a.e1.h.f.e.a<T, T> {
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeUnit f27685d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.c.q0 f27686e;

    /* compiled from: ObservableThrottleFirstTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.p0<T>, i.a.e1.d.f, Runnable {
        private static final long serialVersionUID = 786994795061867455L;
        public final i.a.e1.c.p0<? super T> downstream;
        public volatile boolean gate;
        public final long timeout;
        public final TimeUnit unit;
        public i.a.e1.d.f upstream;
        public final q0.c worker;

        public a(i.a.e1.c.p0<? super T> actual, long timeout, TimeUnit unit, q0.c worker) {
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

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public z3(i.a.e1.c.n0<T> source, long timeout, TimeUnit unit, i.a.e1.c.q0 scheduler) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> t) {
    }
}
