package i.a.e1.m;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: PublishProcessor.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class e<T> extends c<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final a[] f27949e = null;

    /* renamed from: f  reason: collision with root package name */
    public static final a[] f27950f = null;
    public final AtomicReference<a<T>[]> c;

    /* renamed from: d  reason: collision with root package name */
    public Throwable f27951d;

    /* compiled from: PublishProcessor.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicLong implements Subscription {
        private static final long serialVersionUID = 3562861878281475070L;
        public final Subscriber<? super T> downstream;
        public final e<T> parent;

        public a(Subscriber<? super T> actual, e<T> parent) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        public boolean isCancelled() {
        }

        public boolean isFull() {
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

    @i.a.e1.b.f
    @i.a.e1.b.d
    public static <T> e<T> k9() {
    }

    @Override // i.a.e1.c.s
    public void F6(@i.a.e1.b.f Subscriber<? super T> t) {
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

    public boolean j9(a<T> ps) {
    }

    @i.a.e1.b.d
    public boolean l9(@i.a.e1.b.f T t) {
    }

    public void m9(a<T> ps) {
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
}
