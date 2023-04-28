package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableTakeUntil.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class k4<T, U> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final Publisher<? extends U> f27017d;

    /* compiled from: FlowableTakeUntil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicInteger implements i.a.e1.c.x<T>, Subscription {
        private static final long serialVersionUID = -4945480365982832967L;
        public final Subscriber<? super T> downstream;
        public final i.a.e1.h.k.c error;
        public final a<T>.C0450a other;
        public final AtomicLong requested;
        public final AtomicReference<Subscription> upstream;

        /* compiled from: FlowableTakeUntil.java */
        /* renamed from: i.a.e1.h.f.b.k4$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class C0450a extends AtomicReference<Subscription> implements i.a.e1.c.x<Object> {
            private static final long serialVersionUID = -3592821756711087922L;
            public final /* synthetic */ a this$0;

            public C0450a(final a this$0) {
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

        public a(Subscriber<? super T> downstream) {
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
    }

    public k4(i.a.e1.c.s<T> source, Publisher<? extends U> other) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> child) {
    }
}
