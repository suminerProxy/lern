package i.a.e1.h.f.d;

import i.a.e1.c.c0;
import i.a.e1.c.f0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableSwitchMapMaybe.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class j<T, R> extends i.a.e1.c.s<R> {
    public final i.a.e1.c.s<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super T, ? extends f0<? extends R>> f27354d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f27355e;

    /* compiled from: FlowableSwitchMapMaybe.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> extends AtomicInteger implements i.a.e1.c.x<T>, Subscription {
        public static final C0468a<Object> INNER_DISPOSED = null;
        private static final long serialVersionUID = -5402190102429853762L;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final Subscriber<? super R> downstream;
        public long emitted;
        public final i.a.e1.h.k.c errors;
        public final AtomicReference<C0468a<R>> inner;
        public final i.a.e1.g.o<? super T, ? extends f0<? extends R>> mapper;
        public final AtomicLong requested;
        public Subscription upstream;

        /* compiled from: FlowableSwitchMapMaybe.java */
        /* renamed from: i.a.e1.h.f.d.j$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0468a<R> extends AtomicReference<i.a.e1.d.f> implements c0<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            public volatile R item;
            public final a<?, R> parent;

            public C0468a(a<?, R> parent) {
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

        public a(Subscriber<? super R> downstream, i.a.e1.g.o<? super T, ? extends f0<? extends R>> mapper, boolean delayErrors) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void disposeInner() {
        }

        public void drain() {
        }

        public void innerComplete(C0468a<R> sender) {
        }

        public void innerError(C0468a<R> sender, Throwable ex) {
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

    public j(i.a.e1.c.s<T> source, i.a.e1.g.o<? super T, ? extends f0<? extends R>> mapper, boolean delayErrors) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super R> s) {
    }
}
