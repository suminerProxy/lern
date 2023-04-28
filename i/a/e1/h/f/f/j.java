package i.a.e1.h.f.f;

import i.a.e1.c.s;
import i.a.e1.c.x;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ParallelJoin.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class j<T> extends s<T> {
    public final i.a.e1.k.b<? extends T> c;

    /* renamed from: d  reason: collision with root package name */
    public final int f27715d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f27716e;

    /* compiled from: ParallelJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<Subscription> implements x<T> {
        private static final long serialVersionUID = 8410034718427740355L;
        public final int limit;
        public final c<T> parent;
        public final int prefetch;
        public long produced;
        public volatile i.a.e1.h.c.p<T> queue;

        public a(c<T> parent, int prefetch) {
        }

        public boolean cancel() {
        }

        public i.a.e1.h.c.p<T> getQueue() {
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

        public void request(long n2) {
        }

        public void requestOne() {
        }
    }

    /* compiled from: ParallelJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends c<T> {
        private static final long serialVersionUID = 6312374661811000451L;

        public b(Subscriber<? super T> actual, int n2, int prefetch) {
        }

        @Override // i.a.e1.h.f.f.j.c
        public void drain() {
        }

        public void drainLoop() {
        }

        @Override // i.a.e1.h.f.f.j.c
        public void onComplete() {
        }

        @Override // i.a.e1.h.f.f.j.c
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.h.f.f.j.c
        public void onNext(a<T> inner, T value) {
        }
    }

    /* compiled from: ParallelJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class c<T> extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = 3100232009247827843L;
        public volatile boolean cancelled;
        public final AtomicInteger done;
        public final Subscriber<? super T> downstream;
        public final i.a.e1.h.k.c errors;
        public final AtomicLong requested;
        public final a<T>[] subscribers;

        public c(Subscriber<? super T> actual, int n2, int prefetch) {
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

        public abstract void onError(Throwable e2);

        public abstract void onNext(a<T> inner, T value);

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    /* compiled from: ParallelJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class d<T> extends c<T> {
        private static final long serialVersionUID = -5737965195918321883L;

        public d(Subscriber<? super T> actual, int n2, int prefetch) {
        }

        @Override // i.a.e1.h.f.f.j.c
        public void drain() {
        }

        public void drainLoop() {
        }

        @Override // i.a.e1.h.f.f.j.c
        public void onComplete() {
        }

        @Override // i.a.e1.h.f.f.j.c
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.h.f.f.j.c
        public void onNext(a<T> inner, T value) {
        }
    }

    public j(i.a.e1.k.b<? extends T> source, int prefetch, boolean delayErrors) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
