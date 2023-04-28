package i.a.y0.e.b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableTakeLastTimed.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class d4<T> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final long f28250d;

    /* renamed from: e  reason: collision with root package name */
    public final long f28251e;

    /* renamed from: f  reason: collision with root package name */
    public final TimeUnit f28252f;

    /* renamed from: g  reason: collision with root package name */
    public final i.a.j0 f28253g;

    /* renamed from: h  reason: collision with root package name */
    public final int f28254h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f28255i;

    /* compiled from: FlowableTakeLastTimed.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements i.a.q<T>, Subscription {
        private static final long serialVersionUID = -5677354903406201275L;
        public volatile boolean cancelled;
        public final long count;
        public final boolean delayError;
        public volatile boolean done;
        public final Subscriber<? super T> downstream;
        public Throwable error;
        public final i.a.y0.f.c<Object> queue;
        public final AtomicLong requested;
        public final i.a.j0 scheduler;
        public final long time;
        public final TimeUnit unit;
        public Subscription upstream;

        public a(Subscriber<? super T> subscriber, long j2, long j3, TimeUnit timeUnit, i.a.j0 j0Var, int i2, boolean z) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public boolean checkTerminated(boolean z, Subscriber<? super T> subscriber, boolean z2) {
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

        public void trim(long j2, i.a.y0.f.c<Object> cVar) {
        }
    }

    public d4(i.a.l<T> lVar, long j2, long j3, TimeUnit timeUnit, i.a.j0 j0Var, int i2, boolean z) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
