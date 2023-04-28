package i.a.y0.e.e;

import i.a.y0.e.e.y3;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableTimeout.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class x3<T, U, V> extends i.a.y0.e.e.a<T, T> {
    public final i.a.g0<U> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super T, ? extends i.a.g0<V>> f28996d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.g0<? extends T> f28997e;

    /* compiled from: ObservableTimeout.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a extends AtomicReference<i.a.u0.c> implements i.a.i0<Object>, i.a.u0.c {
        private static final long serialVersionUID = 8708641127342403073L;
        public final long idx;
        public final d parent;

        public a(long j2, d dVar) {
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
        public void onNext(Object obj) {
        }

        @Override // i.a.i0
        public void onSubscribe(i.a.u0.c cVar) {
        }
    }

    /* compiled from: ObservableTimeout.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends AtomicReference<i.a.u0.c> implements i.a.i0<T>, i.a.u0.c, d {
        private static final long serialVersionUID = -7508389464265974549L;
        public final i.a.i0<? super T> downstream;
        public i.a.g0<? extends T> fallback;
        public final AtomicLong index;
        public final i.a.x0.o<? super T, ? extends i.a.g0<?>> itemTimeoutIndicator;
        public final i.a.y0.a.h task;
        public final AtomicReference<i.a.u0.c> upstream;

        public b(i.a.i0<? super T> i0Var, i.a.x0.o<? super T, ? extends i.a.g0<?>> oVar, i.a.g0<? extends T> g0Var) {
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

        @Override // i.a.y0.e.e.y3.d
        public void onTimeout(long j2) {
        }

        @Override // i.a.y0.e.e.x3.d
        public void onTimeoutError(long j2, Throwable th) {
        }

        public void startFirstTimeout(i.a.g0<?> g0Var) {
        }
    }

    /* compiled from: ObservableTimeout.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T> extends AtomicLong implements i.a.i0<T>, i.a.u0.c, d {
        private static final long serialVersionUID = 3764492702657003550L;
        public final i.a.i0<? super T> downstream;
        public final i.a.x0.o<? super T, ? extends i.a.g0<?>> itemTimeoutIndicator;
        public final i.a.y0.a.h task;
        public final AtomicReference<i.a.u0.c> upstream;

        public c(i.a.i0<? super T> i0Var, i.a.x0.o<? super T, ? extends i.a.g0<?>> oVar) {
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

        @Override // i.a.y0.e.e.y3.d
        public void onTimeout(long j2) {
        }

        @Override // i.a.y0.e.e.x3.d
        public void onTimeoutError(long j2, Throwable th) {
        }

        public void startFirstTimeout(i.a.g0<?> g0Var) {
        }
    }

    /* compiled from: ObservableTimeout.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface d extends y3.d {
        void onTimeoutError(long j2, Throwable th);
    }

    public x3(i.a.b0<T> b0Var, i.a.g0<U> g0Var, i.a.x0.o<? super T, ? extends i.a.g0<V>> oVar, i.a.g0<? extends T> g0Var2) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super T> i0Var) {
    }
}
