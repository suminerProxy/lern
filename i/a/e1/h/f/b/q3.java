package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableScanSeed.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class q3<T, R> extends i.a.e1.h.f.b.a<T, R> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.c<R, ? super T, R> f27125d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.g.s<R> f27126e;

    /* compiled from: FlowableScanSeed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> extends AtomicInteger implements i.a.e1.c.x<T>, Subscription {
        private static final long serialVersionUID = -1776795561228106469L;
        public final i.a.e1.g.c<R, ? super T, R> accumulator;
        public volatile boolean cancelled;
        public int consumed;
        public volatile boolean done;
        public final Subscriber<? super R> downstream;
        public Throwable error;
        public final int limit;
        public final int prefetch;
        public final i.a.e1.h.c.p<R> queue;
        public final AtomicLong requested;
        public Subscription upstream;
        public R value;

        public a(Subscriber<? super R> actual, i.a.e1.g.c<R, ? super T, R> accumulator, R value, int prefetch) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void drain() {
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

    public q3(i.a.e1.c.s<T> source, i.a.e1.g.s<R> seedSupplier, i.a.e1.g.c<R, ? super T, R> accumulator) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super R> s) {
    }
}
