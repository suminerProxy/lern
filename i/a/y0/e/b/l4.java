package i.a.y0.e.b;

import i.a.y0.e.b.m4;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableTimeout.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class l4<T, U, V> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final Publisher<U> f28354d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.x0.o<? super T, ? extends Publisher<V>> f28355e;

    /* renamed from: f  reason: collision with root package name */
    public final Publisher<? extends T> f28356f;

    /* compiled from: FlowableTimeout.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a extends AtomicReference<Subscription> implements i.a.q<Object>, i.a.u0.c {
        private static final long serialVersionUID = 8708641127342403073L;
        public final long idx;
        public final c parent;

        public a(long j2, c cVar) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }
    }

    /* compiled from: FlowableTimeout.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends i.a.y0.i.i implements i.a.q<T>, c {
        private static final long serialVersionUID = 3764492702657003550L;
        public long consumed;
        public final Subscriber<? super T> downstream;
        public Publisher<? extends T> fallback;
        public final AtomicLong index;
        public final i.a.x0.o<? super T, ? extends Publisher<?>> itemTimeoutIndicator;
        public final i.a.y0.a.h task;
        public final AtomicReference<Subscription> upstream;

        public b(Subscriber<? super T> subscriber, i.a.x0.o<? super T, ? extends Publisher<?>> oVar, Publisher<? extends T> publisher) {
        }

        @Override // i.a.y0.i.i, org.reactivestreams.Subscription
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

        @Override // i.a.y0.e.b.m4.d
        public void onTimeout(long j2) {
        }

        @Override // i.a.y0.e.b.l4.c
        public void onTimeoutError(long j2, Throwable th) {
        }

        public void startFirstTimeout(Publisher<?> publisher) {
        }
    }

    /* compiled from: FlowableTimeout.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface c extends m4.d {
        void onTimeoutError(long j2, Throwable th);
    }

    /* compiled from: FlowableTimeout.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class d<T> extends AtomicLong implements i.a.q<T>, Subscription, c {
        private static final long serialVersionUID = 3764492702657003550L;
        public final Subscriber<? super T> downstream;
        public final i.a.x0.o<? super T, ? extends Publisher<?>> itemTimeoutIndicator;
        public final AtomicLong requested;
        public final i.a.y0.a.h task;
        public final AtomicReference<Subscription> upstream;

        public d(Subscriber<? super T> subscriber, i.a.x0.o<? super T, ? extends Publisher<?>> oVar) {
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

        @Override // i.a.y0.e.b.m4.d
        public void onTimeout(long j2) {
        }

        @Override // i.a.y0.e.b.l4.c
        public void onTimeoutError(long j2, Throwable th) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }

        public void startFirstTimeout(Publisher<?> publisher) {
        }
    }

    public l4(i.a.l<T> lVar, Publisher<U> publisher, i.a.x0.o<? super T, ? extends Publisher<V>> oVar, Publisher<? extends T> publisher2) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
