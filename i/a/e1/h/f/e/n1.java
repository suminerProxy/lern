package i.a.e1.h.f.e;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableGroupBy.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class n1<T, K, V> extends i.a.e1.h.f.e.a<T, i.a.e1.i.b<K, V>> {
    public final i.a.e1.g.o<? super T, ? extends K> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super T, ? extends V> f27529d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27530e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f27531f;

    /* compiled from: ObservableGroupBy.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, K, V> extends AtomicInteger implements i.a.e1.c.p0<T>, i.a.e1.d.f {
        public static final Object NULL_KEY = null;
        private static final long serialVersionUID = -3688291656102519502L;
        public final int bufferSize;
        public final AtomicBoolean cancelled;
        public final boolean delayError;
        public final i.a.e1.c.p0<? super i.a.e1.i.b<K, V>> downstream;
        public final Map<Object, b<K, V>> groups;
        public final i.a.e1.g.o<? super T, ? extends K> keySelector;
        public i.a.e1.d.f upstream;
        public final i.a.e1.g.o<? super T, ? extends V> valueSelector;

        public a(i.a.e1.c.p0<? super i.a.e1.i.b<K, V>> actual, i.a.e1.g.o<? super T, ? extends K> keySelector, i.a.e1.g.o<? super T, ? extends V> valueSelector, int bufferSize, boolean delayError) {
        }

        public void cancel(K key) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.c.p0
        public void onComplete() {
        }

        @Override // i.a.e1.c.p0
        public void onError(Throwable t) {
        }

        @Override // i.a.e1.c.p0
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.p0
        public void onSubscribe(i.a.e1.d.f d2) {
        }
    }

    /* compiled from: ObservableGroupBy.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<K, T> extends i.a.e1.i.b<K, T> {
        public final c<T, K> c;

        public b(K key, c<T, K> state) {
        }

        public static <T, K> b<K, T> A8(K key, int bufferSize, a<?, K, T> parent, boolean delayError) {
        }

        @Override // i.a.e1.c.i0
        public void c6(i.a.e1.c.p0<? super T> observer) {
        }

        public void onComplete() {
        }

        public void onError(Throwable e2) {
        }

        public void onNext(T t) {
        }
    }

    /* compiled from: ObservableGroupBy.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class c<T, K> extends AtomicInteger implements i.a.e1.d.f, i.a.e1.c.n0<T> {
        public static final int ABANDONED = 2;
        public static final int ABANDONED_HAS_SUBSCRIBER = 3;
        public static final int FRESH = 0;
        public static final int HAS_SUBSCRIBER = 1;
        private static final long serialVersionUID = -3852313036005250360L;
        public final AtomicReference<i.a.e1.c.p0<? super T>> actual;
        public final AtomicBoolean cancelled;
        public final boolean delayError;
        public volatile boolean done;
        public Throwable error;
        public final K key;
        public final AtomicInteger once;
        public final a<?, K, T> parent;
        public final i.a.e1.h.g.c<T> queue;

        public c(int bufferSize, a<?, K, T> parent, K key, boolean delayError) {
        }

        public void cancelParent() {
        }

        public boolean checkTerminated(boolean d2, boolean empty, i.a.e1.c.p0<? super T> a2, boolean delayError) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        public void drain() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        public void onComplete() {
        }

        public void onError(Throwable e2) {
        }

        public void onNext(T t) {
        }

        @Override // i.a.e1.c.n0
        public void subscribe(i.a.e1.c.p0<? super T> observer) {
        }

        public boolean tryAbandon() {
        }
    }

    public n1(i.a.e1.c.n0<T> source, i.a.e1.g.o<? super T, ? extends K> keySelector, i.a.e1.g.o<? super T, ? extends V> valueSelector, int bufferSize, boolean delayError) {
    }

    @Override // i.a.e1.c.i0
    public void c6(i.a.e1.c.p0<? super i.a.e1.i.b<K, V>> t) {
    }
}
