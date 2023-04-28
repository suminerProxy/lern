package i.a.y0.e.f;

import i.a.q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ParallelFromPublisher.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class h<T> extends i.a.b1.b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Publisher<? extends T> f29036a;
    public final int b;
    public final int c;

    /* compiled from: ParallelFromPublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements q<T> {
        private static final long serialVersionUID = -4470634016609963609L;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final long[] emissions;
        public Throwable error;
        public int index;
        public final int limit;
        public final int prefetch;
        public int produced;
        public i.a.y0.c.o<T> queue;
        public final AtomicLongArray requests;
        public int sourceMode;
        public final AtomicInteger subscriberCount;
        public final Subscriber<? super T>[] subscribers;
        public Subscription upstream;

        /* compiled from: ParallelFromPublisher.java */
        /* renamed from: i.a.y0.e.f.h$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class C0588a implements Subscription {
            public final int b;
            public final int c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ a f29037d;

            public C0588a(a aVar, int i2, int i3) {
            }

            @Override // org.reactivestreams.Subscription
            public void cancel() {
            }

            @Override // org.reactivestreams.Subscription
            public void request(long j2) {
            }
        }

        public a(Subscriber<? super T>[] subscriberArr, int i2) {
        }

        public void cancel(int i2) {
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
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }

        public void setupSubscribers() {
        }
    }

    public h(Publisher<? extends T> publisher, int i2, int i3) {
    }

    @Override // i.a.b1.b
    public int F() {
    }

    @Override // i.a.b1.b
    public void Q(Subscriber<? super T>[] subscriberArr) {
    }
}
