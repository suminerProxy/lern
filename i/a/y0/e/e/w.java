package i.a.y0.e.e;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableConcatMapEager.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class w<T, R> extends i.a.y0.e.e.a<T, R> {
    public final i.a.x0.o<? super T, ? extends i.a.g0<? extends R>> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.y0.j.j f28978d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28979e;

    /* renamed from: f  reason: collision with root package name */
    public final int f28980f;

    /* compiled from: ObservableConcatMapEager.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends AtomicInteger implements i.a.i0<T>, i.a.u0.c, i.a.y0.d.t<R> {
        private static final long serialVersionUID = 8080567949447303262L;
        public int activeCount;
        public volatile boolean cancelled;
        public i.a.y0.d.s<R> current;
        public volatile boolean done;
        public final i.a.i0<? super R> downstream;
        public final i.a.y0.j.c error;
        public final i.a.y0.j.j errorMode;
        public final i.a.x0.o<? super T, ? extends i.a.g0<? extends R>> mapper;
        public final int maxConcurrency;
        public final ArrayDeque<i.a.y0.d.s<R>> observers;
        public final int prefetch;
        public i.a.y0.c.o<T> queue;
        public int sourceMode;
        public i.a.u0.c upstream;

        public a(i.a.i0<? super R> i0Var, i.a.x0.o<? super T, ? extends i.a.g0<? extends R>> oVar, int i2, int i3, i.a.y0.j.j jVar) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void disposeAll() {
        }

        @Override // i.a.y0.d.t
        public void drain() {
        }

        public void drainAndDispose() {
        }

        @Override // i.a.y0.d.t
        public void innerComplete(i.a.y0.d.s<R> sVar) {
        }

        @Override // i.a.y0.d.t
        public void innerError(i.a.y0.d.s<R> sVar, Throwable th) {
        }

        @Override // i.a.y0.d.t
        public void innerNext(i.a.y0.d.s<R> sVar, R r) {
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

    public w(i.a.g0<T> g0Var, i.a.x0.o<? super T, ? extends i.a.g0<? extends R>> oVar, i.a.y0.j.j jVar, int i2, int i3) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super R> i0Var) {
    }
}
