package i.a.y0.e.b;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableFlattenIterable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class f1<T, R> extends i.a.y0.e.b.a<T, R> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super T, ? extends Iterable<? extends R>> f28271d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28272e;

    /* compiled from: FlowableFlattenIterable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends i.a.y0.i.c<R> implements i.a.q<T> {
        private static final long serialVersionUID = -3096000382929934955L;
        public volatile boolean cancelled;
        public int consumed;
        public Iterator<? extends R> current;
        public volatile boolean done;
        public final Subscriber<? super R> downstream;
        public final AtomicReference<Throwable> error;
        public int fusionMode;
        public final int limit;
        public final i.a.x0.o<? super T, ? extends Iterable<? extends R>> mapper;
        public final int prefetch;
        public i.a.y0.c.o<T> queue;
        public final AtomicLong requested;
        public Subscription upstream;

        public a(Subscriber<? super R> subscriber, i.a.x0.o<? super T, ? extends Iterable<? extends R>> oVar, int i2) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public boolean checkTerminated(boolean z, boolean z2, Subscriber<?> subscriber, i.a.y0.c.o<?> oVar) {
        }

        @Override // i.a.y0.c.o
        public void clear() {
        }

        public void consumedOne(boolean z) {
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
        public R poll() throws Exception {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }

        @Override // i.a.y0.c.k
        public int requestFusion(int i2) {
        }
    }

    public f1(i.a.l<T> lVar, i.a.x0.o<? super T, ? extends Iterable<? extends R>> oVar, int i2) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super R> subscriber) {
    }
}
