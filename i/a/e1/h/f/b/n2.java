package i.a.e1.h.f.b;

import i.a.e1.c.q0;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableObserveOn.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class n2<T> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.c.q0 f27055d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f27056e;

    /* renamed from: f  reason: collision with root package name */
    public final int f27057f;

    /* compiled from: FlowableObserveOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class a<T> extends i.a.e1.h.j.c<T> implements i.a.e1.c.x<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;
        public volatile boolean cancelled;
        public final boolean delayError;
        public volatile boolean done;
        public Throwable error;
        public final int limit;
        public boolean outputFused;
        public final int prefetch;
        public long produced;
        public i.a.e1.h.c.q<T> queue;
        public final AtomicLong requested;
        public int sourceMode;
        public Subscription upstream;
        public final q0.c worker;

        public a(q0.c worker, boolean delayError, int prefetch) {
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
        }

        public final boolean checkTerminated(boolean d2, boolean empty, Subscriber<?> a2) {
        }

        @Override // i.a.e1.h.c.q
        public final void clear() {
        }

        @Override // i.a.e1.h.c.q
        public final boolean isEmpty() {
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

        @Override // i.a.e1.h.c.m
        public final int requestFusion(int requestedMode) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }

        public abstract void runAsync();

        public abstract void runBackfused();

        public abstract void runSync();

        public final void trySchedule() {
        }
    }

    /* compiled from: FlowableObserveOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends a<T> {
        private static final long serialVersionUID = 644624475404284533L;
        public long consumed;
        public final i.a.e1.h.c.c<? super T> downstream;

        public b(i.a.e1.h.c.c<? super T> actual, q0.c worker, boolean delayError, int prefetch) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public T poll() throws Throwable {
        }

        @Override // i.a.e1.h.f.b.n2.a
        public void runAsync() {
        }

        @Override // i.a.e1.h.f.b.n2.a
        public void runBackfused() {
        }

        @Override // i.a.e1.h.f.b.n2.a
        public void runSync() {
        }
    }

    /* compiled from: FlowableObserveOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T> extends a<T> implements i.a.e1.c.x<T> {
        private static final long serialVersionUID = -4547113800637756442L;
        public final Subscriber<? super T> downstream;

        public c(Subscriber<? super T> actual, q0.c worker, boolean delayError, int prefetch) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public T poll() throws Throwable {
        }

        @Override // i.a.e1.h.f.b.n2.a
        public void runAsync() {
        }

        @Override // i.a.e1.h.f.b.n2.a
        public void runBackfused() {
        }

        @Override // i.a.e1.h.f.b.n2.a
        public void runSync() {
        }
    }

    public n2(i.a.e1.c.s<T> source, i.a.e1.c.q0 scheduler, boolean delayError, int prefetch) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
