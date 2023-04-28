package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableSkipUntil.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class a4<T, U> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final Publisher<U> f26876d;

    /* compiled from: FlowableSkipUntil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicInteger implements i.a.e1.h.c.c<T>, Subscription {
        private static final long serialVersionUID = -6270983465606289181L;
        public final Subscriber<? super T> downstream;
        public final i.a.e1.h.k.c error;
        public volatile boolean gate;
        public final a<T>.C0439a other;
        public final AtomicLong requested;
        public final AtomicReference<Subscription> upstream;

        /* compiled from: FlowableSkipUntil.java */
        /* renamed from: i.a.e1.h.f.b.a4$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class C0439a extends AtomicReference<Subscription> implements i.a.e1.c.x<Object> {
            private static final long serialVersionUID = -5592042965931999169L;
            public final /* synthetic */ a this$0;

            public C0439a(final a this$0) {
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

        @Override // i.a.e1.h.c.c
        public boolean tryOnNext(T t) {
        }
    }

    public a4(i.a.e1.c.s<T> source, Publisher<U> other) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> child) {
    }
}
