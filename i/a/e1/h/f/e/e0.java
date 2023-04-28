package i.a.e1.h.f.e;

import i.a.e1.c.q0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableDebounceTimed.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class e0<T> extends i.a.e1.h.f.e.a<T, T> {
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeUnit f27426d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.c.q0 f27427e;

    /* compiled from: ObservableDebounceTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<i.a.e1.d.f> implements Runnable, i.a.e1.d.f {
        private static final long serialVersionUID = 6812032969491025141L;
        public final long idx;
        public final AtomicBoolean once;
        public final b<T> parent;
        public final T value;

        public a(T value, long idx, b<T> parent) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public void setResource(i.a.e1.d.f d2) {
        }
    }

    /* compiled from: ObservableDebounceTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> implements i.a.e1.c.p0<T>, i.a.e1.d.f {
        public final i.a.e1.c.p0<? super T> b;
        public final long c;

        /* renamed from: d  reason: collision with root package name */
        public final TimeUnit f27428d;

        /* renamed from: e  reason: collision with root package name */
        public final q0.c f27429e;

        /* renamed from: f  reason: collision with root package name */
        public i.a.e1.d.f f27430f;

        /* renamed from: g  reason: collision with root package name */
        public i.a.e1.d.f f27431g;

        /* renamed from: h  reason: collision with root package name */
        public volatile long f27432h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f27433i;

        public b(i.a.e1.c.p0<? super T> actual, long timeout, TimeUnit unit, q0.c worker) {
        }

        public void a(long idx, T t, a<T> emitter) {
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
    }

    public e0(i.a.e1.c.n0<T> source, long timeout, TimeUnit unit, i.a.e1.c.q0 scheduler) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> t) {
    }
}
