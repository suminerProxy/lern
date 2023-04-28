package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableConcatMapEager.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class w<T, R> extends i.a.e1.h.f.b.a<T, R> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> f27197d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27198e;

    /* renamed from: f  reason: collision with root package name */
    public final int f27199f;

    /* renamed from: g  reason: collision with root package name */
    public final i.a.e1.h.k.j f27200g;

    /* compiled from: FlowableConcatMapEager.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> extends AtomicInteger implements i.a.e1.c.x<T>, Subscription, i.a.e1.h.i.l<R> {
        private static final long serialVersionUID = -4255299542215038287L;
        public volatile boolean cancelled;
        public volatile i.a.e1.h.i.k<R> current;
        public volatile boolean done;
        public final Subscriber<? super R> downstream;
        public final i.a.e1.h.k.j errorMode;
        public final i.a.e1.h.k.c errors;
        public final i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> mapper;
        public final int maxConcurrency;
        public final int prefetch;
        public final AtomicLong requested;
        public final i.a.e1.h.g.c<i.a.e1.h.i.k<R>> subscribers;
        public Subscription upstream;

        public a(Subscriber<? super R> actual, i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> mapper, int maxConcurrency, int prefetch, i.a.e1.h.k.j errorMode) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void cancelAll() {
        }

        @Override // i.a.e1.h.i.l
        public void drain() {
        }

        public void drainAndCancel() {
        }

        @Override // i.a.e1.h.i.l
        public void innerComplete(i.a.e1.h.i.k<R> inner) {
        }

        @Override // i.a.e1.h.i.l
        public void innerError(i.a.e1.h.i.k<R> inner, Throwable e2) {
        }

        @Override // i.a.e1.h.i.l
        public void innerNext(i.a.e1.h.i.k<R> inner, R value) {
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

    public w(i.a.e1.c.s<T> source, i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> mapper, int maxConcurrency, int prefetch, i.a.e1.h.k.j errorMode) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super R> s) {
    }
}
