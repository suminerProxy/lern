package i.a.y0.e.b;

import i.a.j0;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableObserveOn.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class j2<T> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.j0 f28320d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f28321e;

    /* renamed from: f  reason: collision with root package name */
    public final int f28322f;

    /* compiled from: FlowableObserveOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class a<T> extends i.a.y0.i.c<T> implements i.a.q<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;
        public volatile boolean cancelled;
        public final boolean delayError;
        public volatile boolean done;
        public Throwable error;
        public final int limit;
        public boolean outputFused;
        public final int prefetch;
        public long produced;
        public i.a.y0.c.o<T> queue;
        public final AtomicLong requested;
        public int sourceMode;
        public Subscription upstream;
        public final j0.c worker;

        public a(j0.c cVar, boolean z, int i2) {
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
        }

        public final boolean checkTerminated(boolean z, boolean z2, Subscriber<?> subscriber) {
        }

        @Override // i.a.y0.c.o
        public final void clear() {
        }

        @Override // i.a.y0.c.o
        public final boolean isEmpty() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j2) {
        }

        @Override // i.a.y0.c.k
        public final int requestFusion(int i2) {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }

        public abstract void runAsync();

        public abstract void runBackfused();

        public abstract void runSync();

        public final void trySchedule() {
        }
    }

    /* compiled from: FlowableObserveOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends a<T> {
        private static final long serialVersionUID = 644624475404284533L;
        public long consumed;
        public final i.a.y0.c.a<? super T> downstream;

        public b(i.a.y0.c.a<? super T> aVar, j0.c cVar, boolean z, int i2) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }

        @Override // i.a.y0.c.o
        @i.a.t0.g
        public T poll() throws Exception {
        }

        @Override // i.a.y0.e.b.j2.a
        public void runAsync() {
        }

        @Override // i.a.y0.e.b.j2.a
        public void runBackfused() {
        }

        @Override // i.a.y0.e.b.j2.a
        public void runSync() {
        }
    }

    /* compiled from: FlowableObserveOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T> extends a<T> implements i.a.q<T> {
        private static final long serialVersionUID = -4547113800637756442L;
        public final Subscriber<? super T> downstream;

        public c(Subscriber<? super T> subscriber, j0.c cVar, boolean z, int i2) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }

        @Override // i.a.y0.c.o
        @i.a.t0.g
        public T poll() throws Exception {
        }

        @Override // i.a.y0.e.b.j2.a
        public void runAsync() {
        }

        @Override // i.a.y0.e.b.j2.a
        public void runBackfused() {
        }

        @Override // i.a.y0.e.b.j2.a
        public void runSync() {
        }
    }

    public j2(i.a.l<T> lVar, i.a.j0 j0Var, boolean z, int i2) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
