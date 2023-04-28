package i.a.y0.e.b;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableWindowBoundarySupplier.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class v4<T, B> extends i.a.y0.e.b.a<T, i.a.l<T>> {

    /* renamed from: d  reason: collision with root package name */
    public final Callable<? extends Publisher<B>> f28551d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28552e;

    /* compiled from: FlowableWindowBoundarySupplier.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, B> extends i.a.h1.b<B> {
        public final b<T, B> c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f28553d;

        public a(b<T, B> bVar) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(B b) {
        }
    }

    /* compiled from: FlowableWindowBoundarySupplier.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, B> extends AtomicInteger implements i.a.q<T>, Subscription, Runnable {
        public static final a<Object, Object> BOUNDARY_DISPOSED = null;
        public static final Object NEXT_WINDOW = null;
        private static final long serialVersionUID = 2233020065421370272L;
        public final AtomicReference<a<T, B>> boundarySubscriber;
        public final int capacityHint;
        public volatile boolean done;
        public final Subscriber<? super i.a.l<T>> downstream;
        public long emitted;
        public final i.a.y0.j.c errors;
        public final Callable<? extends Publisher<B>> other;
        public final i.a.y0.f.a<Object> queue;
        public final AtomicLong requested;
        public final AtomicBoolean stopWindows;
        public Subscription upstream;
        public i.a.d1.h<T> window;
        public final AtomicInteger windows;

        public b(Subscriber<? super i.a.l<T>> subscriber, int i2, Callable<? extends Publisher<B>> callable) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void disposeBoundary() {
        }

        public void drain() {
        }

        public void innerComplete() {
        }

        public void innerError(Throwable th) {
        }

        public void innerNext(a<T, B> aVar) {
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

    public v4(i.a.l<T> lVar, Callable<? extends Publisher<B>> callable, int i2) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super i.a.l<T>> subscriber) {
    }
}
