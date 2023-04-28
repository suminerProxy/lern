package i.a.y0.e.e;

import i.a.j0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableDebounceTimed.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class e0<T> extends i.a.y0.e.e.a<T, T> {
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeUnit f28739d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.j0 f28740e;

    /* compiled from: ObservableDebounceTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicReference<i.a.u0.c> implements Runnable, i.a.u0.c {
        private static final long serialVersionUID = 6812032969491025141L;
        public final long idx;
        public final AtomicBoolean once;
        public final b<T> parent;
        public final T value;

        public a(T t, long j2, b<T> bVar) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public void setResource(i.a.u0.c cVar) {
        }
    }

    /* compiled from: ObservableDebounceTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> implements i.a.i0<T>, i.a.u0.c {
        public final i.a.i0<? super T> b;
        public final long c;

        /* renamed from: d  reason: collision with root package name */
        public final TimeUnit f28741d;

        /* renamed from: e  reason: collision with root package name */
        public final j0.c f28742e;

        /* renamed from: f  reason: collision with root package name */
        public i.a.u0.c f28743f;

        /* renamed from: g  reason: collision with root package name */
        public i.a.u0.c f28744g;

        /* renamed from: h  reason: collision with root package name */
        public volatile long f28745h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f28746i;

        public b(i.a.i0<? super T> i0Var, long j2, TimeUnit timeUnit, j0.c cVar) {
        }

        public void a(long j2, T t, a<T> aVar) {
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
    }

    public e0(i.a.g0<T> g0Var, long j2, TimeUnit timeUnit, i.a.j0 j0Var) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super T> i0Var) {
    }
}
