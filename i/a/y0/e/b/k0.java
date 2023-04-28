package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableDelaySubscriptionOther.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class k0<T, U> extends i.a.l<T> {
    public final Publisher<? extends T> c;

    /* renamed from: d  reason: collision with root package name */
    public final Publisher<U> f28331d;

    /* compiled from: FlowableDelaySubscriptionOther.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicLong implements i.a.q<T>, Subscription {
        private static final long serialVersionUID = 2259811067697317255L;
        public final Subscriber<? super T> downstream;
        public final Publisher<? extends T> main;
        public final a<T>.C0541a other;
        public final AtomicReference<Subscription> upstream;

        /* compiled from: FlowableDelaySubscriptionOther.java */
        /* renamed from: i.a.y0.e.b.k0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class C0541a extends AtomicReference<Subscription> implements i.a.q<Object> {
            private static final long serialVersionUID = -3892798459447644106L;
            public final /* synthetic */ a this$0;

            public C0541a(a aVar) {
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

        public a(Subscriber<? super T> subscriber, Publisher<? extends T> publisher) {
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
    }

    public k0(Publisher<? extends T> publisher, Publisher<U> publisher2) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
