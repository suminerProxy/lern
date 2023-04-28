package i.a.e1.m;

import i.a.e1.h.c.q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: MulticastProcessor.java */
@i.a.e1.b.b(i.a.e1.b.a.FULL)
@i.a.e1.b.h("none")
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class d<T> extends c<T> {

    /* renamed from: n  reason: collision with root package name */
    public static final a[] f27937n = null;

    /* renamed from: o  reason: collision with root package name */
    public static final a[] f27938o = null;
    public final AtomicInteger c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<Subscription> f27939d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReference<a<T>[]> f27940e;

    /* renamed from: f  reason: collision with root package name */
    public final int f27941f;

    /* renamed from: g  reason: collision with root package name */
    public final int f27942g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f27943h;

    /* renamed from: i  reason: collision with root package name */
    public volatile q<T> f27944i;

    /* renamed from: j  reason: collision with root package name */
    public volatile boolean f27945j;

    /* renamed from: k  reason: collision with root package name */
    public volatile Throwable f27946k;

    /* renamed from: l  reason: collision with root package name */
    public int f27947l;

    /* renamed from: m  reason: collision with root package name */
    public int f27948m;

    /* compiled from: MulticastProcessor.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicLong implements Subscription {
        private static final long serialVersionUID = -363282618957264509L;
        public final Subscriber<? super T> downstream;
        public long emitted;
        public final d<T> parent;

        public a(Subscriber<? super T> actual, d<T> parent) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public void onComplete() {
        }

        public void onError(Throwable t) {
        }

        public void onNext(T t) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }
    }

    public d(int bufferSize, boolean refCount) {
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> d<T> k9() {
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> d<T> l9(int bufferSize) {
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> d<T> m9(int bufferSize, boolean refCount) {
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> d<T> n9(boolean refCount) {
    }

    @Override // i.a.e1.c.s
    public void F6(@i.a.e1.b.f Subscriber<? super T> s) {
    }

    @Override // i.a.e1.m.c
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

    public boolean j9(a<T> inner) {
    }

    public void o9() {
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

    @i.a.e1.b.d
    public boolean p9(@i.a.e1.b.f T t) {
    }

    public void q9(a<T> inner) {
    }

    public void r9() {
    }

    public void s9() {
    }
}
