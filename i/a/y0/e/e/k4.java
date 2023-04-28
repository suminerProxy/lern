package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: ObservableWithLatestFromMany.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class k4<T, R> extends i.a.y0.e.e.a<T, R> {
    @i.a.t0.g
    public final i.a.g0<?>[] c;
    @i.a.t0.g

    /* renamed from: d  reason: collision with root package name */
    public final Iterable<? extends i.a.g0<?>> f28838d;
    @i.a.t0.f

    /* renamed from: e  reason: collision with root package name */
    public final i.a.x0.o<? super Object[], R> f28839e;

    /* compiled from: ObservableWithLatestFromMany.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class a implements i.a.x0.o<T, R> {
        public final /* synthetic */ k4 b;

        public a(k4 k4Var) {
        }

        @Override // i.a.x0.o
        public R apply(T t) throws Exception {
        }
    }

    /* compiled from: ObservableWithLatestFromMany.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, R> extends AtomicInteger implements i.a.i0<T>, i.a.u0.c {
        private static final long serialVersionUID = 1577321883966341961L;
        public final i.a.x0.o<? super Object[], R> combiner;
        public volatile boolean done;
        public final i.a.i0<? super R> downstream;
        public final i.a.y0.j.c error;
        public final c[] observers;
        public final AtomicReference<i.a.u0.c> upstream;
        public final AtomicReferenceArray<Object> values;

        public b(i.a.i0<? super R> i0Var, i.a.x0.o<? super Object[], R> oVar, int i2) {
        }

        public void cancelAllBut(int i2) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void innerComplete(int i2, boolean z) {
        }

        public void innerError(int i2, Throwable th) {
        }

        public void innerNext(int i2, Object obj) {
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

        public void subscribe(i.a.g0<?>[] g0VarArr, int i2) {
        }
    }

    /* compiled from: ObservableWithLatestFromMany.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c extends AtomicReference<i.a.u0.c> implements i.a.i0<Object> {
        private static final long serialVersionUID = 3256684027868224024L;
        public boolean hasValue;
        public final int index;
        public final b<?, ?> parent;

        public c(b<?, ?> bVar, int i2) {
        }

        public void dispose() {
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

    public k4(@i.a.t0.f i.a.g0<T> g0Var, @i.a.t0.f i.a.g0<?>[] g0VarArr, @i.a.t0.f i.a.x0.o<? super Object[], R> oVar) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super R> i0Var) {
    }

    public k4(@i.a.t0.f i.a.g0<T> g0Var, @i.a.t0.f Iterable<? extends i.a.g0<?>> iterable, @i.a.t0.f i.a.x0.o<? super Object[], R> oVar) {
    }
}
