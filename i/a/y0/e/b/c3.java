package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableRepeatWhen.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class c3<T> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super i.a.l<Object>, ? extends Publisher<?>> f28236d;

    /* compiled from: FlowableRepeatWhen.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends c<T, Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        public a(Subscriber<? super T> subscriber, i.a.d1.c<Object> cVar, Subscription subscription) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }
    }

    /* compiled from: FlowableRepeatWhen.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, U> extends AtomicInteger implements i.a.q<Object>, Subscription {
        private static final long serialVersionUID = 2827772011130406689L;
        public final AtomicLong requested;
        public final Publisher<T> source;
        public c<T, U> subscriber;
        public final AtomicReference<Subscription> upstream;

        public b(Publisher<T> publisher) {
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
        public void onNext(Object obj) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    /* compiled from: FlowableRepeatWhen.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class c<T, U> extends i.a.y0.i.i implements i.a.q<T> {
        private static final long serialVersionUID = -5604623027276966720L;
        public final Subscriber<? super T> downstream;
        public final i.a.d1.c<U> processor;
        private long produced;
        public final Subscription receiver;

        public c(Subscriber<? super T> subscriber, i.a.d1.c<U> cVar, Subscription subscription) {
        }

        public final void again(U u) {
        }

        @Override // i.a.y0.i.i, org.reactivestreams.Subscription
        public final void cancel() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
        }

        @Override // i.a.q
        public final void onSubscribe(Subscription subscription) {
        }
    }

    public c3(i.a.l<T> lVar, i.a.x0.o<? super i.a.l<Object>, ? extends Publisher<?>> oVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
