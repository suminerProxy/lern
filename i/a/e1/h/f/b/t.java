package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableCombineLatest.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class t<T, R> extends i.a.e1.c.s<R> {
    @i.a.e1.b.g
    public final Publisher<? extends T>[] c;
    @i.a.e1.b.g

    /* renamed from: d  reason: collision with root package name */
    public final Iterable<? extends Publisher<? extends T>> f27164d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.g.o<? super Object[], ? extends R> f27165e;

    /* renamed from: f  reason: collision with root package name */
    public final int f27166f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f27167g;

    /* compiled from: FlowableCombineLatest.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> extends i.a.e1.h.j.c<R> {
        private static final long serialVersionUID = -5082275438355852221L;
        public volatile boolean cancelled;
        public final i.a.e1.g.o<? super Object[], ? extends R> combiner;
        public int completedSources;
        public final boolean delayErrors;
        public volatile boolean done;
        public final Subscriber<? super R> downstream;
        public final i.a.e1.h.k.c error;
        public final Object[] latest;
        public int nonEmptySources;
        public boolean outputFused;
        public final i.a.e1.h.g.c<Object> queue;
        public final AtomicLong requested;
        public final b<T>[] subscribers;

        public a(Subscriber<? super R> actual, i.a.e1.g.o<? super Object[], ? extends R> combiner, int n2, int bufferSize, boolean delayErrors) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void cancelAll() {
        }

        public boolean checkTerminated(boolean d2, boolean empty, Subscriber<?> a2, i.a.e1.h.g.c<?> q) {
        }

        @Override // i.a.e1.h.c.q
        public void clear() {
        }

        public void drain() {
        }

        public void drainAsync() {
        }

        public void drainOutput() {
        }

        public void innerComplete(int index) {
        }

        public void innerError(int index, Throwable e2) {
        }

        public void innerValue(int index, T value) {
        }

        @Override // i.a.e1.h.c.q
        public boolean isEmpty() {
        }

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public R poll() throws Throwable {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int requestedMode) {
        }

        public void subscribe(Publisher<? extends T>[] sources, int n2) {
        }
    }

    /* compiled from: FlowableCombineLatest.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> extends AtomicReference<Subscription> implements i.a.e1.c.x<T> {
        private static final long serialVersionUID = -8730235182291002949L;
        public final int index;
        public final int limit;
        public final a<T, ?> parent;
        public final int prefetch;
        public int produced;

        public b(a<T, ?> parent, int index, int prefetch) {
        }

        public void cancel() {
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

        public void requestOne() {
        }
    }

    /* compiled from: FlowableCombineLatest.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class c implements i.a.e1.g.o<T, R> {
        public final /* synthetic */ t b;

        public c(final t this$0) {
        }

        @Override // i.a.e1.g.o
        public R apply(T t) throws Throwable {
        }
    }

    public t(@i.a.e1.b.f Publisher<? extends T>[] array, @i.a.e1.b.f i.a.e1.g.o<? super Object[], ? extends R> combiner, int bufferSize, boolean delayErrors) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super R> s) {
    }

    public t(@i.a.e1.b.f Iterable<? extends Publisher<? extends T>> iterable, @i.a.e1.b.f i.a.e1.g.o<? super Object[], ? extends R> combiner, int bufferSize, boolean delayErrors) {
    }
}
