package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableCache.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class q<T> extends i.a.e1.h.f.e.a<T, T> implements i.a.e1.c.p0<T> {

    /* renamed from: l  reason: collision with root package name */
    public static final a[] f27571l = null;

    /* renamed from: m  reason: collision with root package name */
    public static final a[] f27572m = null;
    public final AtomicBoolean c;

    /* renamed from: d  reason: collision with root package name */
    public final int f27573d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReference<a<T>[]> f27574e;

    /* renamed from: f  reason: collision with root package name */
    public volatile long f27575f;

    /* renamed from: g  reason: collision with root package name */
    public final b<T> f27576g;

    /* renamed from: h  reason: collision with root package name */
    public b<T> f27577h;

    /* renamed from: i  reason: collision with root package name */
    public int f27578i;

    /* renamed from: j  reason: collision with root package name */
    public Throwable f27579j;

    /* renamed from: k  reason: collision with root package name */
    public volatile boolean f27580k;

    /* compiled from: ObservableCache.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicInteger implements i.a.e1.d.f {
        private static final long serialVersionUID = 6770240836423125754L;
        public volatile boolean disposed;
        public final i.a.e1.c.p0<? super T> downstream;
        public long index;
        public b<T> node;
        public int offset;
        public final q<T> parent;

        public a(i.a.e1.c.p0<? super T> downstream, q<T> parent) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }
    }

    /* compiled from: ObservableCache.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T[] f27581a;
        public volatile b<T> b;

        public b(int capacityHint) {
        }
    }

    public q(i.a.e1.c.i0<T> source, int capacityHint) {
    }

    public long A8() {
    }

    public boolean B8() {
    }

    public boolean C8() {
    }

    public void D8(a<T> consumer) {
    }

    public void E8(a<T> consumer) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> t) {
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

    public void z8(a<T> consumer) {
    }
}
