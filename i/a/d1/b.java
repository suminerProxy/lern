package i.a.d1;

import i.a.y0.j.a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: BehaviorProcessor.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class b<T> extends c<T> {

    /* renamed from: j  reason: collision with root package name */
    public static final Object[] f26661j = null;

    /* renamed from: k  reason: collision with root package name */
    public static final a[] f26662k = null;

    /* renamed from: l  reason: collision with root package name */
    public static final a[] f26663l = null;
    public final AtomicReference<a<T>[]> c;

    /* renamed from: d  reason: collision with root package name */
    public final ReadWriteLock f26664d;

    /* renamed from: e  reason: collision with root package name */
    public final Lock f26665e;

    /* renamed from: f  reason: collision with root package name */
    public final Lock f26666f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReference<Object> f26667g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<Throwable> f26668h;

    /* renamed from: i  reason: collision with root package name */
    public long f26669i;

    /* compiled from: BehaviorProcessor.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicLong implements Subscription, a.InterfaceC0597a<Object> {
        private static final long serialVersionUID = 3293175281126227086L;
        public volatile boolean cancelled;
        public final Subscriber<? super T> downstream;
        public boolean emitting;
        public boolean fastPath;
        public long index;
        public boolean next;
        public i.a.y0.j.a<Object> queue;
        public final b<T> state;

        public a(Subscriber<? super T> subscriber, b<T> bVar) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void emitFirst() {
        }

        public void emitLoop() {
        }

        public void emitNext(Object obj, long j2) {
        }

        public boolean isFull() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }

        @Override // i.a.y0.j.a.InterfaceC0597a, i.a.x0.r
        public boolean test(Object obj) {
        }
    }

    public b() {
    }

    @i.a.t0.d
    @i.a.t0.f
    public static <T> b<T> O8() {
    }

    @i.a.t0.d
    @i.a.t0.f
    public static <T> b<T> P8(T t) {
    }

    @Override // i.a.d1.c
    @i.a.t0.g
    public Throwable I8() {
    }

    @Override // i.a.d1.c
    public boolean J8() {
    }

    @Override // i.a.d1.c
    public boolean K8() {
    }

    @Override // i.a.d1.c
    public boolean L8() {
    }

    public boolean N8(a<T> aVar) {
    }

    @i.a.t0.g
    public T Q8() {
    }

    @Deprecated
    public Object[] R8() {
    }

    @Deprecated
    public T[] S8(T[] tArr) {
    }

    public boolean T8() {
    }

    public boolean U8(T t) {
    }

    public void V8(a<T> aVar) {
    }

    public void W8(Object obj) {
    }

    public int X8() {
    }

    public a<T>[] Y8(Object obj) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
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

    @Override // org.reactivestreams.Subscriber, i.a.q
    public void onSubscribe(Subscription subscription) {
    }

    public b(T t) {
    }
}
