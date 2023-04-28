package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableCache.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class r<T> extends i.a.y0.e.e.a<T, T> implements i.a.i0<T> {

    /* renamed from: l  reason: collision with root package name */
    public static final a[] f28920l = null;

    /* renamed from: m  reason: collision with root package name */
    public static final a[] f28921m = null;
    public final AtomicBoolean c;

    /* renamed from: d  reason: collision with root package name */
    public final int f28922d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReference<a<T>[]> f28923e;

    /* renamed from: f  reason: collision with root package name */
    public volatile long f28924f;

    /* renamed from: g  reason: collision with root package name */
    public final b<T> f28925g;

    /* renamed from: h  reason: collision with root package name */
    public b<T> f28926h;

    /* renamed from: i  reason: collision with root package name */
    public int f28927i;

    /* renamed from: j  reason: collision with root package name */
    public Throwable f28928j;

    /* renamed from: k  reason: collision with root package name */
    public volatile boolean f28929k;

    /* compiled from: ObservableCache.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements i.a.u0.c {
        private static final long serialVersionUID = 6770240836423125754L;
        public volatile boolean disposed;
        public final i.a.i0<? super T> downstream;
        public long index;
        public b<T> node;
        public int offset;
        public final r<T> parent;

        public a(i.a.i0<? super T> i0Var, r<T> rVar) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }
    }

    /* compiled from: ObservableCache.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T[] f28930a;
        public volatile b<T> b;

        public b(int i2) {
        }
    }

    public r(i.a.b0<T> b0Var, int i2) {
    }

    public void b(a<T> aVar) {
    }

    public long c() {
    }

    public boolean d() {
    }

    public boolean e() {
    }

    public void f(a<T> aVar) {
    }

    public void g(a<T> aVar) {
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

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super T> i0Var) {
    }
}
