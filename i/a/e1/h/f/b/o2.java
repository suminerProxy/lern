package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableOnBackpressureBuffer.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class o2<T> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final int f27070d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f27071e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f27072f;

    /* renamed from: g  reason: collision with root package name */
    public final i.a.e1.g.a f27073g;

    /* compiled from: FlowableOnBackpressureBuffer.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends i.a.e1.h.j.c<T> implements i.a.e1.c.x<T> {
        private static final long serialVersionUID = -2514538129242366402L;
        public volatile boolean cancelled;
        public final boolean delayError;
        public volatile boolean done;
        public final Subscriber<? super T> downstream;
        public Throwable error;
        public final i.a.e1.g.a onOverflow;
        public boolean outputFused;
        public final i.a.e1.h.c.p<T> queue;
        public final AtomicLong requested;
        public Subscription upstream;

        public a(Subscriber<? super T> actual, int bufferSize, boolean unbounded, boolean delayError, i.a.e1.g.a onOverflow) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public boolean checkTerminated(boolean d2, boolean empty, Subscriber<? super T> a2) {
        }

        @Override // i.a.e1.h.c.q
        public void clear() {
        }

        public void drain() {
        }

        @Override // i.a.e1.h.c.q
        public boolean isEmpty() {
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

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public T poll() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int mode) {
        }
    }

    public o2(i.a.e1.c.s<T> source, int bufferSize, boolean unbounded, boolean delayError, i.a.e1.g.a onOverflow) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
