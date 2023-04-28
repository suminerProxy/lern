package i.a.e1.h.f.f;

import i.a.e1.c.x;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ParallelFromPublisher.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class i<T> extends i.a.e1.k.b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Publisher<? extends T> f27713a;
    public final int b;
    public final int c;

    /* compiled from: ParallelFromPublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicInteger implements x<T> {
        private static final long serialVersionUID = -4470634016609963609L;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final long[] emissions;
        public Throwable error;
        public int index;
        public final int limit;
        public final int prefetch;
        public int produced;
        public i.a.e1.h.c.q<T> queue;
        public final AtomicLongArray requests;
        public int sourceMode;
        public final AtomicInteger subscriberCount;
        public final Subscriber<? super T>[] subscribers;
        public Subscription upstream;

        /* compiled from: ParallelFromPublisher.java */
        /* renamed from: i.a.e1.h.f.f.i$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public final class C0497a implements Subscription {
            public final int b;
            public final int c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ a f27714d;

            public C0497a(final a this$0, int j2, int m2) {
            }

            @Override // org.reactivestreams.Subscription
            public void cancel() {
            }

            @Override // org.reactivestreams.Subscription
            public void request(long n2) {
            }
        }

        public a(Subscriber<? super T>[] subscribers, int prefetch) {
        }

        public void cancel(int m2) {
        }

        public void drain() {
        }

        public void drainAsync() {
        }

        public void drainSync() {
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

        public void setupSubscribers() {
        }
    }

    public i(Publisher<? extends T> source, int parallelism, int prefetch) {
    }

    @Override // i.a.e1.k.b
    public int M() {
    }

    @Override // i.a.e1.k.b
    public void X(Subscriber<? super T>[] subscribers) {
    }
}
