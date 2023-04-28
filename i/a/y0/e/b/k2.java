package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableOnBackpressureBuffer.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class k2<T> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final int f28332d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f28333e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f28334f;

    /* renamed from: g  reason: collision with root package name */
    public final i.a.x0.a f28335g;

    /* compiled from: FlowableOnBackpressureBuffer.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends i.a.y0.i.c<T> implements i.a.q<T> {
        private static final long serialVersionUID = -2514538129242366402L;
        public volatile boolean cancelled;
        public final boolean delayError;
        public volatile boolean done;
        public final Subscriber<? super T> downstream;
        public Throwable error;
        public final i.a.x0.a onOverflow;
        public boolean outputFused;
        public final i.a.y0.c.n<T> queue;
        public final AtomicLong requested;
        public Subscription upstream;

        public a(Subscriber<? super T> subscriber, int i2, boolean z, boolean z2, i.a.x0.a aVar) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public boolean checkTerminated(boolean z, boolean z2, Subscriber<? super T> subscriber) {
        }

        @Override // i.a.y0.c.o
        public void clear() {
        }

        public void drain() {
        }

        @Override // i.a.y0.c.o
        public boolean isEmpty() {
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

        @Override // i.a.y0.c.o
        @i.a.t0.g
        public T poll() throws Exception {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }

        @Override // i.a.y0.c.k
        public int requestFusion(int i2) {
        }
    }

    public k2(i.a.l<T> lVar, int i2, boolean z, boolean z2, i.a.x0.a aVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
