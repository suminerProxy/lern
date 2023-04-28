package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSwitchMap.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class r3<T, R> extends i.a.e1.h.f.e.a<T, R> {
    public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<? extends R>> c;

    /* renamed from: d  reason: collision with root package name */
    public final int f27608d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f27609e;

    /* compiled from: ObservableSwitchMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.p0<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        public final int bufferSize;
        public volatile boolean done;
        public final long index;
        public final b<T, R> parent;
        public volatile i.a.e1.h.c.q<R> queue;

        public a(b<T, R> parent, long index, int bufferSize) {
        }

        public void cancel() {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(R t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }
    }

    /* compiled from: ObservableSwitchMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, R> extends AtomicInteger implements i.a.e1.c.p0<T>, i.a.e1.d.f {
        public static final a<Object, Object> CANCELLED = null;
        private static final long serialVersionUID = -3491074160481096299L;
        public final AtomicReference<a<T, R>> active;
        public final int bufferSize;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final i.a.e1.c.p0<? super R> downstream;
        public final i.a.e1.h.k.c errors;
        public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<? extends R>> mapper;
        public volatile long unique;
        public i.a.e1.d.f upstream;

        public b(i.a.e1.c.p0<? super R> actual, i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<? extends R>> mapper, int bufferSize, boolean delayErrors) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void disposeInner() {
        }

        public void drain() {
        }

        public void innerError(a<T, R> inner, Throwable ex) {
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

    public r3(i.a.e1.c.n0<T> source, i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<? extends R>> mapper, int bufferSize, boolean delayErrors) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super R> t) {
    }
}
