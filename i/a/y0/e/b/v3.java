package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableSkipUntil.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class v3<T, U> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final Publisher<U> f28550d;

    /* compiled from: FlowableSkipUntil.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements i.a.y0.c.a<T>, Subscription {
        private static final long serialVersionUID = -6270983465606289181L;
        public final Subscriber<? super T> downstream;
        public final i.a.y0.j.c error;
        public volatile boolean gate;
        public final a<T>.C0544a other;
        public final AtomicLong requested;
        public final AtomicReference<Subscription> upstream;

        /* compiled from: FlowableSkipUntil.java */
        /* renamed from: i.a.y0.e.b.v3$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class C0544a extends AtomicReference<Subscription> implements i.a.q<Object> {
            private static final long serialVersionUID = -5592042965931999169L;
            public final /* synthetic */ a this$0;

            public C0544a(a aVar) {
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

        public a(Subscriber<? super T> subscriber) {
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

        @Override // i.a.y0.c.a
        public boolean tryOnNext(T t) {
        }
    }

    public v3(i.a.l<T> lVar, Publisher<U> publisher) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
