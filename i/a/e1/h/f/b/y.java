package i.a.e1.h.f.b;

import i.a.e1.c.q0;
import i.a.e1.h.f.b.v;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableConcatMapScheduler.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class y<T, R> extends i.a.e1.h.f.b.a<T, R> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> f27242d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27243e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.e1.h.k.j f27244f;

    /* renamed from: g  reason: collision with root package name */
    public final i.a.e1.c.q0 f27245g;

    /* compiled from: FlowableConcatMapScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27246a = null;
    }

    /* compiled from: FlowableConcatMapScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class b<T, R> extends AtomicInteger implements i.a.e1.c.x<T>, v.f<R>, Subscription, Runnable {
        private static final long serialVersionUID = -3511336836796789179L;
        public volatile boolean active;
        public volatile boolean cancelled;
        public int consumed;
        public volatile boolean done;
        public final i.a.e1.h.k.c errors;
        public final v.e<R> inner;
        public final int limit;
        public final i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> mapper;
        public final int prefetch;
        public i.a.e1.h.c.q<T> queue;
        public int sourceMode;
        public Subscription upstream;
        public final q0.c worker;

        public b(i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> mapper, int prefetch, q0.c worker) {
        }

        @Override // i.a.e1.h.f.b.v.f
        public final void innerComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public final void onSubscribe(Subscription s) {
        }

        public abstract void schedule();

        public abstract void subscribeActual();
    }

    /* compiled from: FlowableConcatMapScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T, R> extends b<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;
        public final Subscriber<? super R> downstream;
        public final boolean veryEnd;

        public c(Subscriber<? super R> actual, i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> mapper, int prefetch, boolean veryEnd, q0.c worker) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.e1.h.f.b.v.f
        public void innerError(Throwable e2) {
        }

        @Override // i.a.e1.h.f.b.v.f
        public void innerNext(R value) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        @Override // i.a.e1.h.f.b.y.b
        public void schedule() {
        }

        @Override // i.a.e1.h.f.b.y.b
        public void subscribeActual() {
        }
    }

    /* compiled from: FlowableConcatMapScheduler.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class d<T, R> extends b<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;
        public final Subscriber<? super R> downstream;
        public final AtomicInteger wip;

        public d(Subscriber<? super R> actual, i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> mapper, int prefetch, q0.c worker) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.e1.h.f.b.v.f
        public void innerError(Throwable e2) {
        }

        @Override // i.a.e1.h.f.b.v.f
        public void innerNext(R value) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        @Override // i.a.e1.h.f.b.y.b
        public void schedule() {
        }

        @Override // i.a.e1.h.f.b.y.b
        public void subscribeActual() {
        }

        public boolean tryEnter() {
        }
    }

    public y(i.a.e1.c.s<T> source, i.a.e1.g.o<? super T, ? extends Publisher<? extends R>> mapper, int prefetch, i.a.e1.h.k.j errorMode, i.a.e1.c.q0 scheduler) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super R> s) {
    }
}
