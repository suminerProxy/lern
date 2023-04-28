package i.a.y0.e.b;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableScanSeed.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class l3<T, R> extends i.a.y0.e.b.a<T, R> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.c<R, ? super T, R> f28352d;

    /* renamed from: e  reason: collision with root package name */
    public final Callable<R> f28353e;

    /* compiled from: FlowableScanSeed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends AtomicInteger implements i.a.q<T>, Subscription {
        private static final long serialVersionUID = -1776795561228106469L;
        public final i.a.x0.c<R, ? super T, R> accumulator;
        public volatile boolean cancelled;
        public int consumed;
        public volatile boolean done;
        public final Subscriber<? super R> downstream;
        public Throwable error;
        public final int limit;
        public final int prefetch;
        public final i.a.y0.c.n<R> queue;
        public final AtomicLong requested;
        public Subscription upstream;
        public R value;

        public a(Subscriber<? super R> subscriber, i.a.x0.c<R, ? super T, R> cVar, R r, int i2) {
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
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    public l3(i.a.l<T> lVar, Callable<R> callable, i.a.x0.c<R, ? super T, R> cVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super R> subscriber) {
    }
}
