package i.a.e1.h.f.d;

import i.a.e1.c.c0;
import i.a.e1.c.f0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableConcatMapMaybe.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class d<T, R> extends i.a.e1.c.s<R> {
    public final i.a.e1.c.s<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super T, ? extends f0<? extends R>> f27334d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.h.k.j f27335e;

    /* renamed from: f  reason: collision with root package name */
    public final int f27336f;

    /* compiled from: FlowableConcatMapMaybe.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> extends AtomicInteger implements i.a.e1.c.x<T>, Subscription {
        public static final int STATE_ACTIVE = 1;
        public static final int STATE_INACTIVE = 0;
        public static final int STATE_RESULT_VALUE = 2;
        private static final long serialVersionUID = -9140123220065488293L;
        public volatile boolean cancelled;
        public int consumed;
        public volatile boolean done;
        public final Subscriber<? super R> downstream;
        public long emitted;
        public final i.a.e1.h.k.j errorMode;
        public final i.a.e1.h.k.c errors;
        public final C0465a<R> inner;
        public R item;
        public final i.a.e1.g.o<? super T, ? extends f0<? extends R>> mapper;
        public final int prefetch;
        public final i.a.e1.h.c.p<T> queue;
        public final AtomicLong requested;
        public volatile int state;
        public Subscription upstream;

        /* compiled from: FlowableConcatMapMaybe.java */
        /* renamed from: i.a.e1.h.f.d.d$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0465a<R> extends AtomicReference<i.a.e1.d.f> implements c0<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            public final a<?, R> parent;

            public C0465a(a<?, R> parent) {
            }

            public void dispose() {
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
            public void onSuccess(R t) {
            }
        }

        public a(Subscriber<? super R> downstream, i.a.e1.g.o<? super T, ? extends f0<? extends R>> mapper, int prefetch, i.a.e1.h.k.j errorMode) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void drain() {
        }

        public void innerComplete() {
        }

        public void innerError(Throwable ex) {
        }

        public void innerSuccess(R item) {
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

    public d(i.a.e1.c.s<T> source, i.a.e1.g.o<? super T, ? extends f0<? extends R>> mapper, i.a.e1.h.k.j errorMode, int prefetch) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super R> s) {
    }
}
