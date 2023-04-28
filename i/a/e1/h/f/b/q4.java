package i.a.e1.h.f.b;

import i.a.e1.h.f.b.r4;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableTimeout.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class q4<T, U, V> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final Publisher<U> f27127d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.g.o<? super T, ? extends Publisher<V>> f27128e;

    /* renamed from: f  reason: collision with root package name */
    public final Publisher<? extends T> f27129f;

    /* compiled from: FlowableTimeout.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a extends AtomicReference<Subscription> implements i.a.e1.c.x<Object>, i.a.e1.d.f {
        private static final long serialVersionUID = 8708641127342403073L;
        public final long idx;
        public final c parent;

        public a(long idx, c parent) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }
    }

    /* compiled from: FlowableTimeout.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends i.a.e1.h.j.i implements i.a.e1.c.x<T>, c {
        private static final long serialVersionUID = 3764492702657003550L;
        public long consumed;
        public final Subscriber<? super T> downstream;
        public Publisher<? extends T> fallback;
        public final AtomicLong index;
        public final i.a.e1.g.o<? super T, ? extends Publisher<?>> itemTimeoutIndicator;
        public final i.a.e1.h.a.f task;
        public final AtomicReference<Subscription> upstream;

        public b(Subscriber<? super T> actual, i.a.e1.g.o<? super T, ? extends Publisher<?>> itemTimeoutIndicator, Publisher<? extends T> fallback) {
        }

        @Override // i.a.e1.h.j.i, org.reactivestreams.Subscription
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

        @Override // i.a.e1.h.f.b.r4.d
        public void onTimeout(long idx) {
        }

        @Override // i.a.e1.h.f.b.q4.c
        public void onTimeoutError(long idx, Throwable ex) {
        }

        public void startFirstTimeout(Publisher<?> firstTimeoutIndicator) {
        }
    }

    /* compiled from: FlowableTimeout.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public interface c extends r4.d {
        void onTimeoutError(long idx, Throwable ex);
    }

    /* compiled from: FlowableTimeout.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class d<T> extends AtomicLong implements i.a.e1.c.x<T>, Subscription, c {
        private static final long serialVersionUID = 3764492702657003550L;
        public final Subscriber<? super T> downstream;
        public final i.a.e1.g.o<? super T, ? extends Publisher<?>> itemTimeoutIndicator;
        public final AtomicLong requested;
        public final i.a.e1.h.a.f task;
        public final AtomicReference<Subscription> upstream;

        public d(Subscriber<? super T> actual, i.a.e1.g.o<? super T, ? extends Publisher<?>> itemTimeoutIndicator) {
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

        @Override // i.a.e1.h.f.b.r4.d
        public void onTimeout(long idx) {
        }

        @Override // i.a.e1.h.f.b.q4.c
        public void onTimeoutError(long idx, Throwable ex) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        public void startFirstTimeout(Publisher<?> firstTimeoutIndicator) {
        }
    }

    public q4(i.a.e1.c.s<T> source, Publisher<U> firstTimeoutIndicator, i.a.e1.g.o<? super T, ? extends Publisher<V>> itemTimeoutIndicator, Publisher<? extends T> other) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
