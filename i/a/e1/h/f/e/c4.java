package i.a.e1.h.f.e;

import i.a.e1.h.f.e.d4;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableTimeout.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class c4<T, U, V> extends i.a.e1.h.f.e.a<T, T> {
    public final i.a.e1.c.n0<U> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<V>> f27401d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.c.n0<? extends T> f27402e;

    /* compiled from: ObservableTimeout.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.p0<Object>, i.a.e1.d.f {
        private static final long serialVersionUID = 8708641127342403073L;
        public final long idx;
        public final d parent;

        public a(long idx, d parent) {
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
        public void onNext(Object t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }
    }

    /* compiled from: ObservableTimeout.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.p0<T>, i.a.e1.d.f, d {
        private static final long serialVersionUID = -7508389464265974549L;
        public final i.a.e1.c.p0<? super T> downstream;
        public i.a.e1.c.n0<? extends T> fallback;
        public final AtomicLong index;
        public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<?>> itemTimeoutIndicator;
        public final i.a.e1.h.a.f task;
        public final AtomicReference<i.a.e1.d.f> upstream;

        public b(i.a.e1.c.p0<? super T> actual, i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<?>> itemTimeoutIndicator, i.a.e1.c.n0<? extends T> fallback) {
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

        @Override // i.a.e1.h.f.e.c4.d
        public void onTimeoutError(long idx, Throwable ex) {
        }

        public void startFirstTimeout(i.a.e1.c.n0<?> firstTimeoutIndicator) {
        }
    }

    /* compiled from: ObservableTimeout.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T> extends AtomicLong implements i.a.e1.c.p0<T>, i.a.e1.d.f, d {
        private static final long serialVersionUID = 3764492702657003550L;
        public final i.a.e1.c.p0<? super T> downstream;
        public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<?>> itemTimeoutIndicator;
        public final i.a.e1.h.a.f task;
        public final AtomicReference<i.a.e1.d.f> upstream;

        public c(i.a.e1.c.p0<? super T> actual, i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<?>> itemTimeoutIndicator) {
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

        @Override // i.a.e1.h.f.e.c4.d
        public void onTimeoutError(long idx, Throwable ex) {
        }

        public void startFirstTimeout(i.a.e1.c.n0<?> firstTimeoutIndicator) {
        }
    }

    /* compiled from: ObservableTimeout.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface d extends d4.d {
        void onTimeoutError(long idx, Throwable ex);
    }

    public c4(i.a.e1.c.i0<T> source, i.a.e1.c.n0<U> firstTimeoutIndicator, i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<V>> itemTimeoutIndicator, i.a.e1.c.n0<? extends T> other) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super T> observer) {
    }
}
