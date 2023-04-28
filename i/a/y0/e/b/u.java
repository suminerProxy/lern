package i.a.y0.e.b;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableCombineLatest.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class u<T, R> extends i.a.l<R> {
    @i.a.t0.g
    public final Publisher<? extends T>[] c;
    @i.a.t0.g

    /* renamed from: d  reason: collision with root package name */
    public final Iterable<? extends Publisher<? extends T>> f28515d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.x0.o<? super Object[], ? extends R> f28516e;

    /* renamed from: f  reason: collision with root package name */
    public final int f28517f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f28518g;

    /* compiled from: FlowableCombineLatest.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends i.a.y0.i.c<R> {
        private static final long serialVersionUID = -5082275438355852221L;
        public volatile boolean cancelled;
        public final i.a.x0.o<? super Object[], ? extends R> combiner;
        public int completedSources;
        public final boolean delayErrors;
        public volatile boolean done;
        public final Subscriber<? super R> downstream;
        public final AtomicReference<Throwable> error;
        public final Object[] latest;
        public int nonEmptySources;
        public boolean outputFused;
        public final i.a.y0.f.c<Object> queue;
        public final AtomicLong requested;
        public final b<T>[] subscribers;

        public a(Subscriber<? super R> subscriber, i.a.x0.o<? super Object[], ? extends R> oVar, int i2, int i3, boolean z) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void cancelAll() {
        }

        public boolean checkTerminated(boolean z, boolean z2, Subscriber<?> subscriber, i.a.y0.f.c<?> cVar) {
        }

        @Override // i.a.y0.c.o
        public void clear() {
        }

        public void drain() {
        }

        public void drainAsync() {
        }

        public void drainOutput() {
        }

        public void innerComplete(int i2) {
        }

        public void innerError(int i2, Throwable th) {
        }

        public void innerValue(int i2, T t) {
        }

        @Override // i.a.y0.c.o
        public boolean isEmpty() {
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

        public void subscribe(Publisher<? extends T>[] publisherArr, int i2) {
        }
    }

    /* compiled from: FlowableCombineLatest.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends AtomicReference<Subscription> implements i.a.q<T> {
        private static final long serialVersionUID = -8730235182291002949L;
        public final int index;
        public final int limit;
        public final a<T, ?> parent;
        public final int prefetch;
        public int produced;

        public b(a<T, ?> aVar, int i2, int i3) {
        }

        public void cancel() {
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

        public void requestOne() {
        }
    }

    /* compiled from: FlowableCombineLatest.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class c implements i.a.x0.o<T, R> {
        public final /* synthetic */ u b;

        public c(u uVar) {
        }

        @Override // i.a.x0.o
        public R apply(T t) throws Exception {
        }
    }

    public u(@i.a.t0.f Publisher<? extends T>[] publisherArr, @i.a.t0.f i.a.x0.o<? super Object[], ? extends R> oVar, int i2, boolean z) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super R> subscriber) {
    }

    public u(@i.a.t0.f Iterable<? extends Publisher<? extends T>> iterable, @i.a.t0.f i.a.x0.o<? super Object[], ? extends R> oVar, int i2, boolean z) {
    }
}
