package i.a.e1.h.f.b;

import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableOnBackpressureBufferStrategy.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class p2<T> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final long f27087d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.g.a f27088e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.e1.c.h f27089f;

    /* compiled from: FlowableOnBackpressureBufferStrategy.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27090a = null;
    }

    /* compiled from: FlowableOnBackpressureBufferStrategy.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends AtomicInteger implements i.a.e1.c.x<T>, Subscription {
        private static final long serialVersionUID = 3240706908776709697L;
        public final long bufferSize;
        public volatile boolean cancelled;
        public final Deque<T> deque;
        public volatile boolean done;
        public final Subscriber<? super T> downstream;
        public Throwable error;
        public final i.a.e1.g.a onOverflow;
        public final AtomicLong requested;
        public final i.a.e1.c.h strategy;
        public Subscription upstream;

        public b(Subscriber<? super T> actual, i.a.e1.g.a onOverflow, i.a.e1.c.h strategy, long bufferSize) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void clear(Deque<T> dq) {
        }

        public void drain() {
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

    public p2(i.a.e1.c.s<T> source, long bufferSize, i.a.e1.g.a onOverflow, i.a.e1.c.h strategy) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
