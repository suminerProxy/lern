package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableDelaySubscriptionOther.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class j0<T, U> extends i.a.e1.c.s<T> {
    public final Publisher<? extends T> c;

    /* renamed from: d  reason: collision with root package name */
    public final Publisher<U> f27004d;

    /* compiled from: FlowableDelaySubscriptionOther.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicLong implements i.a.e1.c.x<T>, Subscription {
        private static final long serialVersionUID = 2259811067697317255L;
        public final Subscriber<? super T> downstream;
        public final Publisher<? extends T> main;
        public final a<T>.C0447a other;
        public final AtomicReference<Subscription> upstream;

        /* compiled from: FlowableDelaySubscriptionOther.java */
        /* renamed from: i.a.e1.h.f.b.j0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class C0447a extends AtomicReference<Subscription> implements i.a.e1.c.x<Object> {
            private static final long serialVersionUID = -3892798459447644106L;
            public final /* synthetic */ a this$0;

            public C0447a(final a this$0) {
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

        public a(Subscriber<? super T> downstream, Publisher<? extends T> main) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void next() {
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
    }

    public j0(Publisher<? extends T> main, Publisher<U> other) {
    }

    @Override // i.a.e1.c.s
    public void F6(final Subscriber<? super T> child) {
    }
}
