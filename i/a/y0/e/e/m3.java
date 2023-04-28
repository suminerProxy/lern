package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSwitchMap.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class m3<T, R> extends i.a.y0.e.e.a<T, R> {
    public final i.a.x0.o<? super T, ? extends i.a.g0<? extends R>> c;

    /* renamed from: d  reason: collision with root package name */
    public final int f28864d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f28865e;

    /* compiled from: ObservableSwitchMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends AtomicReference<i.a.u0.c> implements i.a.i0<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        public final int bufferSize;
        public volatile boolean done;
        public final long index;
        public final b<T, R> parent;
        public volatile i.a.y0.c.o<R> queue;

        public a(b<T, R> bVar, long j2, int i2) {
        }

        public void cancel() {
        }

        @Override // i.a.i0
        public void onComplete() {
        }

        @Override // i.a.i0
        public void onError(Throwable th) {
        }

        @Override // i.a.i0
        public void onNext(R r) {
        }

        @Override // i.a.i0
        public void onSubscribe(i.a.u0.c cVar) {
        }
    }

    /* compiled from: ObservableSwitchMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, R> extends AtomicInteger implements i.a.i0<T>, i.a.u0.c {
        public static final a<Object, Object> CANCELLED = null;
        private static final long serialVersionUID = -3491074160481096299L;
        public final AtomicReference<a<T, R>> active;
        public final int bufferSize;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final i.a.i0<? super R> downstream;
        public final i.a.y0.j.c errors;
        public final i.a.x0.o<? super T, ? extends i.a.g0<? extends R>> mapper;
        public volatile long unique;
        public i.a.u0.c upstream;

        public b(i.a.i0<? super R> i0Var, i.a.x0.o<? super T, ? extends i.a.g0<? extends R>> oVar, int i2, boolean z) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void disposeInner() {
        }

        public void drain() {
        }

        public void innerError(a<T, R> aVar, Throwable th) {
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

    public m3(i.a.g0<T> g0Var, i.a.x0.o<? super T, ? extends i.a.g0<? extends R>> oVar, int i2, boolean z) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super R> i0Var) {
    }
}
