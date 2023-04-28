package i.a.e1.h.f.e;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ObservableConcatMapEager.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class v<T, R> extends i.a.e1.h.f.e.a<T, R> {
    public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<? extends R>> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.h.k.j f27649d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27650e;

    /* renamed from: f  reason: collision with root package name */
    public final int f27651f;

    /* compiled from: ObservableConcatMapEager.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> extends AtomicInteger implements i.a.e1.c.p0<T>, i.a.e1.d.f, i.a.e1.h.e.u<R> {
        private static final long serialVersionUID = 8080567949447303262L;
        public int activeCount;
        public volatile boolean cancelled;
        public i.a.e1.h.e.t<R> current;
        public volatile boolean done;
        public final i.a.e1.c.p0<? super R> downstream;
        public final i.a.e1.h.k.j errorMode;
        public final i.a.e1.h.k.c errors;
        public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<? extends R>> mapper;
        public final int maxConcurrency;
        public final ArrayDeque<i.a.e1.h.e.t<R>> observers;
        public final int prefetch;
        public i.a.e1.h.c.q<T> queue;
        public int sourceMode;
        public i.a.e1.d.f upstream;

        public a(i.a.e1.c.p0<? super R> actual, i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<? extends R>> mapper, int maxConcurrency, int prefetch, i.a.e1.h.k.j errorMode) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void disposeAll() {
        }

        @Override // i.a.e1.h.e.u
        public void drain() {
        }

        public void drainAndDispose() {
        }

        @Override // i.a.e1.h.e.u
        public void innerComplete(i.a.e1.h.e.t<R> inner) {
        }

        @Override // i.a.e1.h.e.u
        public void innerError(i.a.e1.h.e.t<R> inner, Throwable e2) {
        }

        @Override // i.a.e1.h.e.u
        public void innerNext(i.a.e1.h.e.t<R> inner, R value) {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(T value) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }
    }

    public v(i.a.e1.c.n0<T> source, i.a.e1.g.o<? super T, ? extends i.a.e1.c.n0<? extends R>> mapper, i.a.e1.h.k.j errorMode, int maxConcurrency, int prefetch) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super R> observer) {
    }
}
