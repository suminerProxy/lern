package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableFlatMapMaybe.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class c1<T, R> extends i.a.e1.h.f.b.a<T, R> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.f0<? extends R>> f26896d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f26897e;

    /* renamed from: f  reason: collision with root package name */
    public final int f26898f;

    /* compiled from: FlowableFlatMapMaybe.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> extends AtomicInteger implements i.a.e1.c.x<T>, Subscription {
        private static final long serialVersionUID = 8600231336733376951L;
        public final AtomicInteger active;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public final Subscriber<? super R> downstream;
        public final i.a.e1.h.k.c errors;
        public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.f0<? extends R>> mapper;
        public final int maxConcurrency;
        public final AtomicReference<i.a.e1.h.g.c<R>> queue;
        public final AtomicLong requested;
        public final i.a.e1.d.d set;
        public Subscription upstream;

        /* compiled from: FlowableFlatMapMaybe.java */
        /* renamed from: i.a.e1.h.f.b.c1$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class C0441a extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.c0<R>, i.a.e1.d.f {
            private static final long serialVersionUID = -502562646270949838L;
            public final /* synthetic */ a this$0;

            public C0441a(final a this$0) {
            }

            @Override // i.a.e1.d.f
            public void dispose() {
            }

            @Override // i.a.e1.d.f
            public boolean isDisposed() {
            }

            @Override // i.a.e1.c.c0, i.a.e1.c.m
            public void onComplete() {
            }

            @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
            public void onError(Throwable e2) {
            }

            @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
            public void onSubscribe(i.a.e1.d.f d2) {
            }

            @Override // i.a.e1.c.c0, i.a.e1.c.u0
            public void onSuccess(R value) {
            }
        }

        public a(Subscriber<? super R> actual, i.a.e1.g.o<? super T, ? extends i.a.e1.c.f0<? extends R>> mapper, boolean delayErrors, int maxConcurrency) {
        }

        public static boolean checkTerminate(boolean d2, i.a.e1.h.g.c<?> q) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void clear() {
        }

        public void drain() {
        }

        public void drainLoop() {
        }

        public i.a.e1.h.g.c<R> getOrCreateQueue() {
        }

        public void innerComplete(a<T, R>.C0441a inner) {
        }

        public void innerError(a<T, R>.C0441a inner, Throwable e2) {
        }

        public void innerSuccess(a<T, R>.C0441a inner, R value) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    public c1(i.a.e1.c.s<T> source, i.a.e1.g.o<? super T, ? extends i.a.e1.c.f0<? extends R>> mapper, boolean delayError, int maxConcurrency) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super R> s) {
    }
}
