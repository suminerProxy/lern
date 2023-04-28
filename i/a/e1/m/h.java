package i.a.e1.m;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: UnicastProcessor.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class h<T> extends c<T> {
    public final i.a.e1.h.g.c<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<Runnable> f27973d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f27974e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f27975f;

    /* renamed from: g  reason: collision with root package name */
    public Throwable f27976g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<Subscriber<? super T>> f27977h;

    /* renamed from: i  reason: collision with root package name */
    public volatile boolean f27978i;

    /* renamed from: j  reason: collision with root package name */
    public final AtomicBoolean f27979j;

    /* renamed from: k  reason: collision with root package name */
    public final i.a.e1.h.j.c<T> f27980k;

    /* renamed from: l  reason: collision with root package name */
    public final AtomicLong f27981l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f27982m;

    /* compiled from: UnicastProcessor.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public final class a extends i.a.e1.h.j.c<T> {
        private static final long serialVersionUID = -4896760517184205454L;
        public final /* synthetic */ h this$0;

        public a(final h this$0) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.e1.h.c.q
        public void clear() {
        }

        @Override // i.a.e1.h.c.q
        public boolean isEmpty() {
        }

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public T poll() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int requestedMode) {
        }
    }

    public h(int capacityHint, Runnable onTerminate, boolean delayError) {
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> h<T> k9() {
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> h<T> l9(int capacityHint) {
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> h<T> m9(int capacityHint, @i.a.e1.b.f Runnable onTerminate) {
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> h<T> n9(int capacityHint, @i.a.e1.b.f Runnable onTerminate, boolean delayError) {
    }

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> h<T> o9(boolean delayError) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
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

    public boolean j9(boolean failFast, boolean d2, boolean empty, Subscriber<? super T> a2, i.a.e1.h.g.c<T> q) {
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

    @Override // org.reactivestreams.Subscriber, i.a.q
    public void onSubscribe(Subscription s) {
    }

    public void p9() {
    }

    public void q9() {
    }

    public void r9(Subscriber<? super T> a2) {
    }

    public void s9(Subscriber<? super T> a2) {
    }
}
