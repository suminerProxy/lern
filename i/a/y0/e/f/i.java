package i.a.y0.e.f;

import i.a.q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ParallelJoin.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class i<T> extends i.a.l<T> {
    public final i.a.b1.b<? extends T> c;

    /* renamed from: d  reason: collision with root package name */
    public final int f29038d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f29039e;

    /* compiled from: ParallelJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicReference<Subscription> implements q<T> {
        private static final long serialVersionUID = 8410034718427740355L;
        public final int limit;
        public final c<T> parent;
        public final int prefetch;
        public long produced;
        public volatile i.a.y0.c.n<T> queue;

        public a(c<T> cVar, int i2) {
        }

        public boolean cancel() {
        }

        public i.a.y0.c.n<T> getQueue() {
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

        public void request(long j2) {
        }

        public void requestOne() {
        }
    }

    /* compiled from: ParallelJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends c<T> {
        private static final long serialVersionUID = 6312374661811000451L;

        public b(Subscriber<? super T> subscriber, int i2, int i3) {
        }

        @Override // i.a.y0.e.f.i.c
        public void drain() {
        }

        public void drainLoop() {
        }

        @Override // i.a.y0.e.f.i.c
        public void onComplete() {
        }

        @Override // i.a.y0.e.f.i.c
        public void onError(Throwable th) {
        }

        @Override // i.a.y0.e.f.i.c
        public void onNext(a<T> aVar, T t) {
        }
    }

    /* compiled from: ParallelJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class c<T> extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = 3100232009247827843L;
        public volatile boolean cancelled;
        public final AtomicInteger done;
        public final Subscriber<? super T> downstream;
        public final i.a.y0.j.c errors;
        public final AtomicLong requested;
        public final a<T>[] subscribers;

        public c(Subscriber<? super T> subscriber, int i2, int i3) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void cancelAll() {
        }

        public void cleanup() {
        }

        public abstract void drain();

        public abstract void onComplete();

        public abstract void onError(Throwable th);

        public abstract void onNext(a<T> aVar, T t);

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    /* compiled from: ParallelJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class d<T> extends c<T> {
        private static final long serialVersionUID = -5737965195918321883L;

        public d(Subscriber<? super T> subscriber, int i2, int i3) {
        }

        @Override // i.a.y0.e.f.i.c
        public void drain() {
        }

        public void drainLoop() {
        }

        @Override // i.a.y0.e.f.i.c
        public void onComplete() {
        }

        @Override // i.a.y0.e.f.i.c
        public void onError(Throwable th) {
        }

        @Override // i.a.y0.e.f.i.c
        public void onNext(a<T> aVar, T t) {
        }
    }

    public i(i.a.b1.b<? extends T> bVar, int i2, boolean z) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
