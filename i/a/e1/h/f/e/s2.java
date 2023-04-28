package i.a.e1.h.f.e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableRefCount.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class s2<T> extends i.a.e1.c.i0<T> {
    public final i.a.e1.i.a<T> b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final long f27631d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeUnit f27632e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.e1.c.q0 f27633f;

    /* renamed from: g  reason: collision with root package name */
    public a f27634g;

    /* compiled from: ObservableRefCount.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a extends AtomicReference<i.a.e1.d.f> implements Runnable, i.a.e1.g.g<i.a.e1.d.f> {
        private static final long serialVersionUID = -4552101107598366241L;
        public boolean connected;
        public boolean disconnectedEarly;
        public final s2<?> parent;
        public long subscriberCount;
        public i.a.e1.d.f timer;

        public a(s2<?> parent) {
        }

        @Override // i.a.e1.g.g
        public /* bridge */ /* synthetic */ void accept(i.a.e1.d.f t) throws Throwable {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        /* renamed from: accept  reason: avoid collision after fix types in other method */
        public void accept2(i.a.e1.d.f t) {
        }
    }

    /* compiled from: ObservableRefCount.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends AtomicBoolean implements i.a.e1.c.p0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = -7419642935409022375L;
        public final a connection;
        public final i.a.e1.c.p0<? super T> downstream;
        public final s2<T> parent;
        public i.a.e1.d.f upstream;

        public b(i.a.e1.c.p0<? super T> downstream, s2<T> parent, a connection) {
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

    public s2(i.a.e1.i.a<T> source) {
    }

    public void A8(a rc) {
    }

    public void B8(a rc) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> observer) {
    }

    public void z8(a rc) {
    }

    public s2(i.a.e1.i.a<T> source, int n2, long timeout, TimeUnit unit, i.a.e1.c.q0 scheduler) {
    }
}
