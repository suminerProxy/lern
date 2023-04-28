package i.a.e1.h.f.b;

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
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class s1<T, K, V> extends i.a.e1.h.f.b.a<T, i.a.e1.f.b<K, V>> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super T, ? extends K> f27154d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.g.o<? super T, ? extends V> f27155e;

    /* renamed from: f  reason: collision with root package name */
    public final int f27156f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f27157g;

    /* renamed from: h  reason: collision with root package name */
    public final i.a.e1.g.o<? super i.a.e1.g.g<Object>, ? extends Map<K, Object>> f27158h;

    /* compiled from: FlowableGroupBy.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<K, V> implements i.a.e1.g.g<c<K, V>> {
        public final Queue<c<K, V>> b;

        public a(Queue<c<K, V>> evictedGroups) {
        }

        public void a(c<K, V> value) {
        }

        @Override // i.a.e1.g.g
        public /* bridge */ /* synthetic */ void accept(Object value) throws Throwable {
        }
    }

    /* compiled from: FlowableGroupBy.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<K, T> extends i.a.e1.f.b<K, T> {

        /* renamed from: d  reason: collision with root package name */
        public final d<T, K> f27159d;

        public c(K key, d<T, K> state) {
        }

        public static <T, K> c<K, T> f9(K key, int bufferSize, b<?, K, T> parent, boolean delayError) {
        }

        @Override // i.a.e1.c.s
        public void F6(Subscriber<? super T> s) {
        }

        public void onComplete() {
        }

        public void onError(Throwable e2) {
        }

        public void onNext(T t) {
        }
    }

    /* compiled from: FlowableGroupBy.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class d<T, K> extends i.a.e1.h.j.c<T> implements Publisher<T> {
        public static final int ABANDONED = 2;
        public static final int ABANDONED_HAS_SUBSCRIBER = 3;
        public static final int FRESH = 0;
        public static final int HAS_SUBSCRIBER = 1;
        private static final long serialVersionUID = -3852313036005250360L;
        public final AtomicReference<Subscriber<? super T>> actual;
        public final AtomicBoolean cancelled;
        public final boolean delayError;
        public volatile boolean done;
        public Throwable error;
        public final K key;
        public final AtomicInteger once;
        public boolean outputFused;
        public final b<?, K, T> parent;
        public int produced;
        public final i.a.e1.h.g.c<T> queue;
        public final AtomicLong requested;

        public d(int bufferSize, b<?, K, T> parent, K key, boolean delayError) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void cancelParent() {
        }

        public boolean checkTerminated(boolean d2, boolean empty, Subscriber<? super T> a2, boolean delayError, long emitted) {
        }

        @Override // i.a.e1.h.c.q
        public void clear() {
        }

        public void drain() {
        }

        public void drainFused() {
        }

        public void drainNormal() {
        }

        @Override // i.a.e1.h.c.q
        public boolean isEmpty() {
        }

        public void onComplete() {
        }

        public void onError(Throwable e2) {
        }

        public void onNext(T t) {
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

        public void requestParent(long e2) {
        }

        @Override // org.reactivestreams.Publisher
        public void subscribe(Subscriber<? super T> subscriber) {
        }

        public boolean tryAbandon() {
        }

        public void tryReplenish() {
        }
    }

    public s1(i.a.e1.c.s<T> source, i.a.e1.g.o<? super T, ? extends K> keySelector, i.a.e1.g.o<? super T, ? extends V> valueSelector, int bufferSize, boolean delayError, i.a.e1.g.o<? super i.a.e1.g.g<Object>, ? extends Map<K, Object>> mapFactory) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super i.a.e1.f.b<K, V>> s) {
    }

    /* compiled from: FlowableGroupBy.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, K, V> extends AtomicLong implements i.a.e1.c.x<T>, Subscription {
        public static final Object NULL_KEY = null;
        private static final long serialVersionUID = -3688291656102519502L;
        public final int bufferSize;
        public final AtomicBoolean cancelled;
        public final boolean delayError;
        public boolean done;
        public final Subscriber<? super i.a.e1.f.b<K, V>> downstream;
        public long emittedGroups;
        public final Queue<c<K, V>> evictedGroups;
        public final AtomicLong groupConsumed;
        public final AtomicInteger groupCount;
        public final Map<Object, c<K, V>> groups;
        public final i.a.e1.g.o<? super T, ? extends K> keySelector;
        public final int limit;
        public Subscription upstream;
        public final i.a.e1.g.o<? super T, ? extends V> valueSelector;

        public b(Subscriber<? super i.a.e1.f.b<K, V>> actual, i.a.e1.g.o<? super T, ? extends K> keySelector, i.a.e1.g.o<? super T, ? extends V> valueSelector, int bufferSize, boolean delayError, Map<Object, c<K, V>> groups, Queue<c<K, V>> evictedGroups) {
        }

        private void completeEvictions() {
        }

        public static String groupHangWarning(long n2) {
        }

        @Override // org.reactivestreams.Subscription
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

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        public void requestGroup(long n2) {
        }

        public void cancel(K key) {
        }
    }
}
