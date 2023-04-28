package i.a.e1.h.f.b;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableWindow.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class x4<T> extends i.a.e1.h.f.b.a<T, i.a.e1.c.s<T>> {

    /* renamed from: d  reason: collision with root package name */
    public final long f27239d;

    /* renamed from: e  reason: collision with root package name */
    public final long f27240e;

    /* renamed from: f  reason: collision with root package name */
    public final int f27241f;

    /* compiled from: FlowableWindow.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicInteger implements i.a.e1.c.x<T>, Subscription, Runnable {
        private static final long serialVersionUID = -2365647875069161133L;
        public final int bufferSize;
        public final Subscriber<? super i.a.e1.c.s<T>> downstream;
        public long index;
        public final AtomicBoolean once;
        public final long size;
        public Subscription upstream;
        public i.a.e1.m.h<T> window;

        public a(Subscriber<? super i.a.e1.c.s<T>> actual, long size, int bufferSize) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
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

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: FlowableWindow.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends AtomicInteger implements i.a.e1.c.x<T>, Subscription, Runnable {
        private static final long serialVersionUID = 2428527070996323976L;
        public final int bufferSize;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final Subscriber<? super i.a.e1.c.s<T>> downstream;
        public Throwable error;
        public final AtomicBoolean firstRequest;
        public long index;
        public final AtomicBoolean once;
        public long produced;
        public final i.a.e1.h.g.c<i.a.e1.m.h<T>> queue;
        public final AtomicLong requested;
        public final long size;
        public final long skip;
        public Subscription upstream;
        public final ArrayDeque<i.a.e1.m.h<T>> windows;
        public final AtomicInteger wip;

        public b(Subscriber<? super i.a.e1.c.s<T>> actual, long size, long skip, int bufferSize) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public boolean checkTerminated(boolean d2, boolean empty, Subscriber<?> a2, i.a.e1.h.g.c<?> q) {
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

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: FlowableWindow.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T> extends AtomicInteger implements i.a.e1.c.x<T>, Subscription, Runnable {
        private static final long serialVersionUID = -8792836352386833856L;
        public final int bufferSize;
        public final Subscriber<? super i.a.e1.c.s<T>> downstream;
        public final AtomicBoolean firstRequest;
        public long index;
        public final AtomicBoolean once;
        public final long size;
        public final long skip;
        public Subscription upstream;
        public i.a.e1.m.h<T> window;

        public c(Subscriber<? super i.a.e1.c.s<T>> actual, long size, long skip, int bufferSize) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
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

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public x4(i.a.e1.c.s<T> source, long size, long skip, int bufferSize) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super i.a.e1.c.s<T>> s) {
    }
}
