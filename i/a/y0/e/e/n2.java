package i.a.y0.e.e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableRefCount.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class n2<T> extends i.a.b0<T> {
    public final i.a.z0.a<T> b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final long f28872d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeUnit f28873e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.j0 f28874f;

    /* renamed from: g  reason: collision with root package name */
    public a f28875g;

    /* compiled from: ObservableRefCount.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a extends AtomicReference<i.a.u0.c> implements Runnable, i.a.x0.g<i.a.u0.c> {
        private static final long serialVersionUID = -4552101107598366241L;
        public boolean connected;
        public boolean disconnectedEarly;
        public final n2<?> parent;
        public long subscriberCount;
        public i.a.u0.c timer;

        public a(n2<?> n2Var) {
        }

        @Override // i.a.x0.g
        public /* bridge */ /* synthetic */ void accept(i.a.u0.c cVar) throws Exception {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        /* renamed from: accept  reason: avoid collision after fix types in other method */
        public void accept2(i.a.u0.c cVar) throws Exception {
        }
    }

    /* compiled from: ObservableRefCount.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends AtomicBoolean implements i.a.i0<T>, i.a.u0.c {
        private static final long serialVersionUID = -7419642935409022375L;
        public final a connection;
        public final i.a.i0<? super T> downstream;
        public final n2<T> parent;
        public i.a.u0.c upstream;

        public b(i.a.i0<? super T> i0Var, n2<T> n2Var, a aVar) {
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

    public n2(i.a.z0.a<T> aVar) {
    }

    public void b(a aVar) {
    }

    public void c(a aVar) {
    }

    public void d(a aVar) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super T> i0Var) {
    }

    public n2(i.a.z0.a<T> aVar, int i2, long j2, TimeUnit timeUnit, i.a.j0 j0Var) {
    }
}
