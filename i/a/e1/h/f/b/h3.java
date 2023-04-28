package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableRepeatWhen.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class h3<T> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super i.a.e1.c.s<Object>, ? extends Publisher<?>> f26978d;

    /* compiled from: FlowableRepeatWhen.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends c<T, Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        public a(Subscriber<? super T> actual, i.a.e1.m.c<Object> processor, Subscription receiver) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }
    }

    /* compiled from: FlowableRepeatWhen.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, U> extends AtomicInteger implements i.a.e1.c.x<Object>, Subscription {
        private static final long serialVersionUID = 2827772011130406689L;
        public final AtomicLong requested;
        public final Publisher<T> source;
        public c<T, U> subscriber;
        public final AtomicReference<Subscription> upstream;

        public b(Publisher<T> source) {
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
        public void onNext(Object t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    /* compiled from: FlowableRepeatWhen.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static abstract class c<T, U> extends i.a.e1.h.j.i implements i.a.e1.c.x<T> {
        private static final long serialVersionUID = -5604623027276966720L;
        public final Subscriber<? super T> downstream;
        public final i.a.e1.m.c<U> processor;
        private long produced;
        public final Subscription receiver;

        public c(Subscriber<? super T> actual, i.a.e1.m.c<U> processor, Subscription receiver) {
        }

        public final void again(U signal) {
        }

        @Override // i.a.e1.h.j.i, org.reactivestreams.Subscription
        public final void cancel() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public final void onSubscribe(Subscription s) {
        }
    }

    public h3(i.a.e1.c.s<T> source, i.a.e1.g.o<? super i.a.e1.c.s<Object>, ? extends Publisher<?>> handler) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
