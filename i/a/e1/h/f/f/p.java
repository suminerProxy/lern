package i.a.e1.h.f.f;

import i.a.e1.c.q0;
import i.a.e1.c.x;
import i.a.e1.h.h.o;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ParallelRunOn.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class p<T> extends i.a.e1.k.b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final i.a.e1.k.b<? extends T> f27741a;
    public final q0 b;
    public final int c;

    /* compiled from: ParallelRunOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class a<T> extends AtomicInteger implements x<T>, Subscription, Runnable {
        private static final long serialVersionUID = 9222303586456402150L;
        public volatile boolean cancelled;
        public int consumed;
        public volatile boolean done;
        public Throwable error;
        public final int limit;
        public final int prefetch;
        public final i.a.e1.h.g.b<T> queue;
        public final AtomicLong requested;
        public Subscription upstream;
        public final q0.c worker;

        public a(int prefetch, i.a.e1.h.g.b<T> queue, q0.c worker) {
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long n2) {
        }

        public final void schedule() {
        }
    }

    /* compiled from: ParallelRunOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class b implements o.a {

        /* renamed from: a  reason: collision with root package name */
        public final Subscriber<? super T>[] f27742a;
        public final Subscriber<T>[] b;
        public final /* synthetic */ p c;

        public b(final p this$0, Subscriber<? super T>[] subscribers, Subscriber<T>[] parents) {
        }

        @Override // i.a.e1.h.h.o.a
        public void a(int i2, q0.c w) {
        }
    }

    /* compiled from: ParallelRunOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T> extends a<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        public final i.a.e1.h.c.c<? super T> downstream;

        public c(i.a.e1.h.c.c<? super T> actual, int prefetch, i.a.e1.h.g.b<T> queue, q0.c worker) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: ParallelRunOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class d<T> extends a<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        public final Subscriber<? super T> downstream;

        public d(Subscriber<? super T> actual, int prefetch, i.a.e1.h.g.b<T> queue, q0.c worker) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public p(i.a.e1.k.b<? extends T> parent, q0 scheduler, int prefetch) {
    }

    @Override // i.a.e1.k.b
    public int M() {
    }

    @Override // i.a.e1.k.b
    public void X(final Subscriber<? super T>[] subscribers) {
    }

    public void c0(int i2, Subscriber<? super T>[] subscribers, Subscriber<T>[] parents, q0.c worker) {
    }
}
