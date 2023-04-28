package i.a.e1.h.f.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMapSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class a1<T, R> extends i.a.e1.h.f.e.a<T, R> {
    public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.x0<? extends R>> c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f27379d;

    /* compiled from: ObservableFlatMapSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> extends AtomicInteger implements i.a.e1.c.p0<T>, i.a.e1.d.f {
        private static final long serialVersionUID = 8600231336733376951L;
        public final AtomicInteger active;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public final i.a.e1.c.p0<? super R> downstream;
        public final i.a.e1.h.k.c errors;
        public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.x0<? extends R>> mapper;
        public final AtomicReference<i.a.e1.h.g.c<R>> queue;
        public final i.a.e1.d.d set;
        public i.a.e1.d.f upstream;

        /* compiled from: ObservableFlatMapSingle.java */
        /* renamed from: i.a.e1.h.f.e.a1$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class C0476a extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.u0<R>, i.a.e1.d.f {
            private static final long serialVersionUID = -502562646270949838L;
            public final /* synthetic */ a this$0;

            public C0476a(final a this$0) {
            }

            @Override // i.a.e1.d.f
            public void dispose() {
            }

            @Override // i.a.e1.d.f
            public boolean isDisposed() {
            }

            @Override // i.a.e1.c.u0, i.a.e1.c.m
            public void onError(Throwable e2) {
            }

            @Override // i.a.e1.c.u0, i.a.e1.c.m
            public void onSubscribe(i.a.e1.d.f d2) {
            }

            @Override // i.a.e1.c.u0
            public void onSuccess(R value) {
            }
        }

        public a(i.a.e1.c.p0<? super R> actual, i.a.e1.g.o<? super T, ? extends i.a.e1.c.x0<? extends R>> mapper, boolean delayErrors) {
        }

        public void clear() {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void drain() {
        }

        public void drainLoop() {
        }

        public i.a.e1.h.g.c<R> getOrCreateQueue() {
        }

        public void innerError(a<T, R>.C0476a inner, Throwable e2) {
        }

        public void innerSuccess(a<T, R>.C0476a inner, R value) {
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

    public a1(i.a.e1.c.n0<T> source, i.a.e1.g.o<? super T, ? extends i.a.e1.c.x0<? extends R>> mapper, boolean delayError) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super R> observer) {
    }
}
