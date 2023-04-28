package i.a.e1.h.f.b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableTakeLastTimed.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class i4<T> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final long f26996d;

    /* renamed from: e  reason: collision with root package name */
    public final long f26997e;

    /* renamed from: f  reason: collision with root package name */
    public final TimeUnit f26998f;

    /* renamed from: g  reason: collision with root package name */
    public final i.a.e1.c.q0 f26999g;

    /* renamed from: h  reason: collision with root package name */
    public final int f27000h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f27001i;

    /* compiled from: FlowableTakeLastTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicInteger implements i.a.e1.c.x<T>, Subscription {
        private static final long serialVersionUID = -5677354903406201275L;
        public volatile boolean cancelled;
        public final long count;
        public final boolean delayError;
        public volatile boolean done;
        public final Subscriber<? super T> downstream;
        public Throwable error;
        public final i.a.e1.h.g.c<Object> queue;
        public final AtomicLong requested;
        public final i.a.e1.c.q0 scheduler;
        public final long time;
        public final TimeUnit unit;
        public Subscription upstream;

        public a(Subscriber<? super T> actual, long count, long time, TimeUnit unit, i.a.e1.c.q0 scheduler, int bufferSize, boolean delayError) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public boolean checkTerminated(boolean empty, Subscriber<? super T> a2, boolean delayError) {
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

        public void trim(long now, i.a.e1.h.g.c<Object> q) {
        }
    }

    public i4(i.a.e1.c.s<T> source, long count, long time, TimeUnit unit, i.a.e1.c.q0 scheduler, int bufferSize, boolean delayError) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
