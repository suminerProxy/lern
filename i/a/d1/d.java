package i.a.d1;

import i.a.y0.c.o;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: MulticastProcessor.java */
@i.a.t0.h("none")
@i.a.t0.b(i.a.t0.a.FULL)
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class d<T> extends c<T> {

    /* renamed from: o  reason: collision with root package name */
    public static final a[] f26670o = null;

    /* renamed from: p  reason: collision with root package name */
    public static final a[] f26671p = null;
    public final AtomicInteger c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<Subscription> f26672d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReference<a<T>[]> f26673e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f26674f;

    /* renamed from: g  reason: collision with root package name */
    public final int f26675g;

    /* renamed from: h  reason: collision with root package name */
    public final int f26676h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f26677i;

    /* renamed from: j  reason: collision with root package name */
    public volatile o<T> f26678j;

    /* renamed from: k  reason: collision with root package name */
    public volatile boolean f26679k;

    /* renamed from: l  reason: collision with root package name */
    public volatile Throwable f26680l;

    /* renamed from: m  reason: collision with root package name */
    public int f26681m;

    /* renamed from: n  reason: collision with root package name */
    public int f26682n;

    /* compiled from: MulticastProcessor.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicLong implements Subscription {
        private static final long serialVersionUID = -363282618957264509L;
        public final Subscriber<? super T> downstream;
        public long emitted;
        public final d<T> parent;

        public a(Subscriber<? super T> subscriber, d<T> dVar) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void onComplete() {
        }

        public void onError(Throwable th) {
        }

        public void onNext(T t) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    public d(int i2, boolean z) {
    }

    @i.a.t0.d
    @i.a.t0.f
    public static <T> d<T> O8() {
    }

    @i.a.t0.d
    @i.a.t0.f
    public static <T> d<T> P8(int i2) {
    }

    @i.a.t0.d
    @i.a.t0.f
    public static <T> d<T> Q8(int i2, boolean z) {
    }

    @i.a.t0.d
    @i.a.t0.f
    public static <T> d<T> R8(boolean z) {
    }

    @Override // i.a.d1.c
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

    public void S8() {
    }

    public boolean T8(T t) {
    }

    public void U8(a<T> aVar) {
    }

    public void V8() {
    }

    public void W8() {
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
}
