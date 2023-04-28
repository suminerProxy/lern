package i.a.e1.h.f.d;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* compiled from: FlowableConcatMapCompletable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class c<T> extends i.a.e1.c.j {
    public final i.a.e1.c.s<T> b;
    public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.h.k.j f27332d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27333e;

    /* compiled from: FlowableConcatMapCompletable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicInteger implements i.a.e1.c.x<T>, i.a.e1.d.f {
        private static final long serialVersionUID = 3610901111000061034L;
        public volatile boolean active;
        public int consumed;
        public volatile boolean disposed;
        public volatile boolean done;
        public final i.a.e1.c.m downstream;
        public final i.a.e1.h.k.j errorMode;
        public final i.a.e1.h.k.c errors;
        public final C0464a inner;
        public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> mapper;
        public final int prefetch;
        public final i.a.e1.h.c.p<T> queue;
        public Subscription upstream;

        /* compiled from: FlowableConcatMapCompletable.java */
        /* renamed from: i.a.e1.h.f.d.c$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0464a extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.m {
            private static final long serialVersionUID = 5638352172918776687L;
            public final a<?> parent;

            public C0464a(a<?> parent) {
            }

            public void dispose() {
            }

            @Override // i.a.e1.c.m
            public void onComplete() {
            }

            @Override // i.a.e1.c.m
            public void onError(Throwable e2) {
            }

            @Override // i.a.e1.c.m
            public void onSubscribe(i.a.e1.d.f d2) {
            }
        }

        public a(i.a.e1.c.m downstream, i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> mapper, i.a.e1.h.k.j errorMode, int prefetch) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void drain() {
        }

        public void innerComplete() {
        }

        public void innerError(Throwable ex) {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
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
    }

    public c(i.a.e1.c.s<T> source, i.a.e1.g.o<? super T, ? extends i.a.e1.c.p> mapper, i.a.e1.h.k.j errorMode, int prefetch) {
    }

    @Override // i.a.e1.c.j
    public void Y0(i.a.e1.c.m observer) {
    }
}
