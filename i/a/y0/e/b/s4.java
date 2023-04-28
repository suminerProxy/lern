package i.a.y0.e.b;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableWindow.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class s4<T> extends i.a.y0.e.b.a<T, i.a.l<T>> {

    /* renamed from: d  reason: collision with root package name */
    public final long f28497d;

    /* renamed from: e  reason: collision with root package name */
    public final long f28498e;

    /* renamed from: f  reason: collision with root package name */
    public final int f28499f;

    /* compiled from: FlowableWindow.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements i.a.q<T>, Subscription, Runnable {
        private static final long serialVersionUID = -2365647875069161133L;
        public final int bufferSize;
        public final Subscriber<? super i.a.l<T>> downstream;
        public long index;
        public final AtomicBoolean once;
        public final long size;
        public Subscription upstream;
        public i.a.d1.h<T> window;

        public a(Subscriber<? super i.a.l<T>> subscriber, long j2, int i2) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
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

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: FlowableWindow.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends AtomicInteger implements i.a.q<T>, Subscription, Runnable {
        private static final long serialVersionUID = 2428527070996323976L;
        public final int bufferSize;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final Subscriber<? super i.a.l<T>> downstream;
        public Throwable error;
        public final AtomicBoolean firstRequest;
        public long index;
        public final AtomicBoolean once;
        public long produced;
        public final i.a.y0.f.c<i.a.d1.h<T>> queue;
        public final AtomicLong requested;
        public final long size;
        public final long skip;
        public Subscription upstream;
        public final ArrayDeque<i.a.d1.h<T>> windows;
        public final AtomicInteger wip;

        public b(Subscriber<? super i.a.l<T>> subscriber, long j2, long j3, int i2) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public boolean checkTerminated(boolean z, boolean z2, Subscriber<?> subscriber, i.a.y0.f.c<?> cVar) {
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

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: FlowableWindow.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T> extends AtomicInteger implements i.a.q<T>, Subscription, Runnable {
        private static final long serialVersionUID = -8792836352386833856L;
        public final int bufferSize;
        public final Subscriber<? super i.a.l<T>> downstream;
        public final AtomicBoolean firstRequest;
        public long index;
        public final AtomicBoolean once;
        public final long size;
        public final long skip;
        public Subscription upstream;
        public i.a.d1.h<T> window;

        public c(Subscriber<? super i.a.l<T>> subscriber, long j2, long j3, int i2) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
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

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public s4(i.a.l<T> lVar, long j2, long j3, int i2) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super i.a.l<T>> subscriber) {
    }
}
