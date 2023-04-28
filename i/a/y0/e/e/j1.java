package i.a.y0.e.e;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableGroupBy.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class j1<T, K, V> extends i.a.y0.e.e.a<T, i.a.z0.b<K, V>> {
    public final i.a.x0.o<? super T, ? extends K> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super T, ? extends V> f28821d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28822e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f28823f;

    /* compiled from: ObservableGroupBy.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, K, V> extends AtomicInteger implements i.a.i0<T>, i.a.u0.c {
        public static final Object NULL_KEY = null;
        private static final long serialVersionUID = -3688291656102519502L;
        public final int bufferSize;
        public final AtomicBoolean cancelled;
        public final boolean delayError;
        public final i.a.i0<? super i.a.z0.b<K, V>> downstream;
        public final Map<Object, b<K, V>> groups;
        public final i.a.x0.o<? super T, ? extends K> keySelector;
        public i.a.u0.c upstream;
        public final i.a.x0.o<? super T, ? extends V> valueSelector;

        public a(i.a.i0<? super i.a.z0.b<K, V>> i0Var, i.a.x0.o<? super T, ? extends K> oVar, i.a.x0.o<? super T, ? extends V> oVar2, int i2, boolean z) {
        }

        public void cancel(K k2) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // i.a.i0
        public void onComplete() {
        }

        @Override // i.a.i0
        public void onError(Throwable th) {
        }

        @Override // i.a.i0
        public void onNext(T t) {
        }

        @Override // i.a.i0
        public void onSubscribe(i.a.u0.c cVar) {
        }
    }

    /* compiled from: ObservableGroupBy.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<K, T> extends i.a.z0.b<K, T> {
        public final c<T, K> c;

        public b(K k2, c<T, K> cVar) {
        }

        public static <T, K> b<K, T> c(K k2, int i2, a<?, K, T> aVar, boolean z) {
        }

        public void onComplete() {
        }

        public void onError(Throwable th) {
        }

        public void onNext(T t) {
        }

        @Override // i.a.b0
        public void subscribeActual(i.a.i0<? super T> i0Var) {
        }
    }

    /* compiled from: ObservableGroupBy.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T, K> extends AtomicInteger implements i.a.u0.c, i.a.g0<T> {
        private static final long serialVersionUID = -3852313036005250360L;
        public final AtomicReference<i.a.i0<? super T>> actual;
        public final AtomicBoolean cancelled;
        public final boolean delayError;
        public volatile boolean done;
        public Throwable error;
        public final K key;
        public final AtomicBoolean once;
        public final a<?, K, T> parent;
        public final i.a.y0.f.c<T> queue;

        public c(int i2, a<?, K, T> aVar, K k2, boolean z) {
        }

        public boolean checkTerminated(boolean z, boolean z2, i.a.i0<? super T> i0Var, boolean z3) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void drain() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        public void onComplete() {
        }

        public void onError(Throwable th) {
        }

        public void onNext(T t) {
        }

        @Override // i.a.g0
        public void subscribe(i.a.i0<? super T> i0Var) {
        }
    }

    public j1(i.a.g0<T> g0Var, i.a.x0.o<? super T, ? extends K> oVar, i.a.x0.o<? super T, ? extends V> oVar2, int i2, boolean z) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super i.a.z0.b<K, V>> i0Var) {
    }
}
