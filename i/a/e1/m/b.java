package i.a.e1.m;

import i.a.e1.h.k.a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: BehaviorProcessor.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class b<T> extends c<T> {

    /* renamed from: j  reason: collision with root package name */
    public static final Object[] f27928j = null;

    /* renamed from: k  reason: collision with root package name */
    public static final a[] f27929k = null;

    /* renamed from: l  reason: collision with root package name */
    public static final a[] f27930l = null;
    public final AtomicReference<a<T>[]> c;

    /* renamed from: d  reason: collision with root package name */
    public final ReadWriteLock f27931d;

    /* renamed from: e  reason: collision with root package name */
    public final Lock f27932e;

    /* renamed from: f  reason: collision with root package name */
    public final Lock f27933f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReference<Object> f27934g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<Throwable> f27935h;

    /* renamed from: i  reason: collision with root package name */
    public long f27936i;

    /* compiled from: BehaviorProcessor.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicLong implements Subscription, a.InterfaceC0508a<Object> {
        private static final long serialVersionUID = 3293175281126227086L;
        public volatile boolean cancelled;
        public final Subscriber<? super T> downstream;
        public boolean emitting;
        public boolean fastPath;
        public long index;
        public boolean next;
        public i.a.e1.h.k.a<Object> queue;
        public final b<T> state;

        public a(Subscriber<? super T> actual, b<T> state) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void emitFirst() {
        }

        public void emitLoop() {
        }

        public void emitNext(Object value, long stateIndex) {
        }

        public boolean isFull() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        @Override // i.a.e1.h.k.a.InterfaceC0508a, i.a.e1.g.r
        public boolean test(Object o2) {
        }
    }

    public b() {
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> b<T> k9() {
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> b<T> l9(T defaultValue) {
    }

    @Override // i.a.e1.c.s
    public void F6(@i.a.e1.b.f Subscriber<? super T> s) {
    }

    @Override // i.a.e1.m.c
    @i.a.e1.b.g
    @i.a.e1.b.d
    public Throwable e9() {
    }

    @Override // i.a.e1.m.c
    @i.a.e1.b.d
    public boolean f9() {
    }

    @Override // i.a.e1.m.c
    @i.a.e1.b.d
    public boolean g9() {
    }

    @Override // i.a.e1.m.c
    @i.a.e1.b.d
    public boolean h9() {
    }

    public boolean j9(a<T> rs) {
    }

    @i.a.e1.b.g
    @i.a.e1.b.d
    public T m9() {
    }

    @i.a.e1.b.d
    public boolean n9() {
    }

    @i.a.e1.b.d
    public boolean o9(@i.a.e1.b.f T t) {
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(@i.a.e1.b.f Throwable t) {
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(@i.a.e1.b.f T t) {
    }

    @Override // org.reactivestreams.Subscriber, i.a.q
    public void onSubscribe(@i.a.e1.b.f Subscription s) {
    }

    public void p9(a<T> rs) {
    }

    public void q9(Object o2) {
    }

    @i.a.e1.b.d
    public int r9() {
    }

    public a<T>[] s9(Object terminalValue) {
    }

    public b(T defaultValue) {
    }
}
