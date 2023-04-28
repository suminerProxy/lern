package i.a.d1;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: UnicastProcessor.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class h<T> extends c<T> {
    public final i.a.y0.f.c<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<Runnable> f26707d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f26708e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f26709f;

    /* renamed from: g  reason: collision with root package name */
    public Throwable f26710g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<Subscriber<? super T>> f26711h;

    /* renamed from: i  reason: collision with root package name */
    public volatile boolean f26712i;

    /* renamed from: j  reason: collision with root package name */
    public final AtomicBoolean f26713j;

    /* renamed from: k  reason: collision with root package name */
    public final i.a.y0.i.c<T> f26714k;

    /* renamed from: l  reason: collision with root package name */
    public final AtomicLong f26715l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f26716m;

    /* compiled from: UnicastProcessor.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class a extends i.a.y0.i.c<T> {
        private static final long serialVersionUID = -4896760517184205454L;
        public final /* synthetic */ h this$0;

        public a(h hVar) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.y0.c.o
        public void clear() {
        }

        @Override // i.a.y0.c.o
        public boolean isEmpty() {
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
    }

    public h(int i2) {
    }

    @i.a.t0.d
    @i.a.t0.f
    public static <T> h<T> O8() {
    }

    @i.a.t0.d
    @i.a.t0.f
    public static <T> h<T> P8(int i2) {
    }

    @i.a.t0.d
    @i.a.t0.f
    public static <T> h<T> Q8(int i2, Runnable runnable) {
    }

    @i.a.t0.d
    @i.a.t0.f
    public static <T> h<T> R8(int i2, Runnable runnable, boolean z) {
    }

    @i.a.t0.d
    @i.a.t0.f
    public static <T> h<T> S8(boolean z) {
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

    public boolean N8(boolean z, boolean z2, boolean z3, Subscriber<? super T> subscriber, i.a.y0.f.c<T> cVar) {
    }

    public void T8() {
    }

    public void U8() {
    }

    public void V8(Subscriber<? super T> subscriber) {
    }

    public void W8(Subscriber<? super T> subscriber) {
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

    public h(int i2, Runnable runnable) {
    }

    public h(int i2, Runnable runnable, boolean z) {
    }
}
