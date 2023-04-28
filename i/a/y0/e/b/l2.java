package i.a.y0.e.b;

import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableOnBackpressureBufferStrategy.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class l2<T> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final long f28348d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.x0.a f28349e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.a f28350f;

    /* compiled from: FlowableOnBackpressureBufferStrategy.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28351a = null;
    }

    /* compiled from: FlowableOnBackpressureBufferStrategy.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends AtomicInteger implements i.a.q<T>, Subscription {
        private static final long serialVersionUID = 3240706908776709697L;
        public final long bufferSize;
        public volatile boolean cancelled;
        public final Deque<T> deque;
        public volatile boolean done;
        public final Subscriber<? super T> downstream;
        public Throwable error;
        public final i.a.x0.a onOverflow;
        public final AtomicLong requested;
        public final i.a.a strategy;
        public Subscription upstream;

        public b(Subscriber<? super T> subscriber, i.a.x0.a aVar, i.a.a aVar2, long j2) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void clear(Deque<T> deque) {
        }

        public void drain() {
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

    public l2(i.a.l<T> lVar, long j2, i.a.x0.a aVar, i.a.a aVar2) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
