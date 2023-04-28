package i.a.y0.e.b;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableGroupBy.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class n1<T, K, V> extends i.a.y0.e.b.a<T, i.a.w0.b<K, V>> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super T, ? extends K> f28382d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.x0.o<? super T, ? extends V> f28383e;

    /* renamed from: f  reason: collision with root package name */
    public final int f28384f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f28385g;

    /* renamed from: h  reason: collision with root package name */
    public final i.a.x0.o<? super i.a.x0.g<Object>, ? extends Map<K, Object>> f28386h;

    /* compiled from: FlowableGroupBy.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<K, V> implements i.a.x0.g<c<K, V>> {
        public final Queue<c<K, V>> b;

        public a(Queue<c<K, V>> queue) {
        }

        public void a(c<K, V> cVar) {
        }

        @Override // i.a.x0.g
        public /* bridge */ /* synthetic */ void accept(Object obj) throws Exception {
        }
    }

    /* compiled from: FlowableGroupBy.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, K, V> extends i.a.y0.i.c<i.a.w0.b<K, V>> implements i.a.q<T> {
        public static final Object NULL_KEY = null;
        private static final long serialVersionUID = -3688291656102519502L;
        public final int bufferSize;
        public final AtomicBoolean cancelled;
        public final boolean delayError;
        public boolean done;
        public final Subscriber<? super i.a.w0.b<K, V>> downstream;
        public Throwable error;
        public final Queue<c<K, V>> evictedGroups;
        public volatile boolean finished;
        public final AtomicInteger groupCount;
        public final Map<Object, c<K, V>> groups;
        public final i.a.x0.o<? super T, ? extends K> keySelector;
        public boolean outputFused;
        public final i.a.y0.f.c<i.a.w0.b<K, V>> queue;
        public final AtomicLong requested;
        public Subscription upstream;
        public final i.a.x0.o<? super T, ? extends V> valueSelector;

        public b(Subscriber<? super i.a.w0.b<K, V>> subscriber, i.a.x0.o<? super T, ? extends K> oVar, i.a.x0.o<? super T, ? extends V> oVar2, int i2, boolean z, Map<Object, c<K, V>> map, Queue<c<K, V>> queue) {
        }

        private void completeEvictions() {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public boolean checkTerminated(boolean z, boolean z2, Subscriber<?> subscriber, i.a.y0.f.c<?> cVar) {
        }

        @Override // i.a.y0.c.o
        public void clear() {
        }

        public void drain() {
        }

        public void drainFused() {
        }

        public void drainNormal() {
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
        public /* bridge */ /* synthetic */ Object poll() throws Exception {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }

        @Override // i.a.y0.c.k
        public int requestFusion(int i2) {
        }

        @Override // i.a.y0.c.o
        @i.a.t0.g
        public i.a.w0.b<K, V> poll() {
        }

        public void cancel(K k2) {
        }
    }

    /* compiled from: FlowableGroupBy.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<K, T> extends i.a.w0.b<K, T> {

        /* renamed from: d  reason: collision with root package name */
        public final d<T, K> f28387d;

        public c(K k2, d<T, K> dVar) {
        }

        public static <T, K> c<K, T> J8(K k2, int i2, b<?, K, T> bVar, boolean z) {
        }

        @Override // i.a.l
        public void g6(Subscriber<? super T> subscriber) {
        }

        public void onComplete() {
        }

        public void onError(Throwable th) {
        }

        public void onNext(T t) {
        }
    }

    /* compiled from: FlowableGroupBy.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class d<T, K> extends i.a.y0.i.c<T> implements Publisher<T> {
        private static final long serialVersionUID = -3852313036005250360L;
        public final AtomicReference<Subscriber<? super T>> actual;
        public final AtomicBoolean cancelled;
        public final boolean delayError;
        public volatile boolean done;
        public Throwable error;
        public final K key;
        public final AtomicBoolean once;
        public boolean outputFused;
        public final b<?, K, T> parent;
        public int produced;
        public final i.a.y0.f.c<T> queue;
        public final AtomicLong requested;

        public d(int i2, b<?, K, T> bVar, K k2, boolean z) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public boolean checkTerminated(boolean z, boolean z2, Subscriber<? super T> subscriber, boolean z3) {
        }

        @Override // i.a.y0.c.o
        public void clear() {
        }

        public void drain() {
        }

        public void drainFused() {
        }

        public void drainNormal() {
        }

        @Override // i.a.y0.c.o
        public boolean isEmpty() {
        }

        public void onComplete() {
        }

        public void onError(Throwable th) {
        }

        public void onNext(T t) {
        }

        @Override // i.a.y0.c.o
        @i.a.t0.g
        public T poll() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }

        @Override // i.a.y0.c.k
        public int requestFusion(int i2) {
        }

        @Override // org.reactivestreams.Publisher
        public void subscribe(Subscriber<? super T> subscriber) {
        }
    }

    public n1(i.a.l<T> lVar, i.a.x0.o<? super T, ? extends K> oVar, i.a.x0.o<? super T, ? extends V> oVar2, int i2, boolean z, i.a.x0.o<? super i.a.x0.g<Object>, ? extends Map<K, Object>> oVar3) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super i.a.w0.b<K, V>> subscriber) {
    }
}
