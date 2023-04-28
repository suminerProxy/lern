package i.a.e1.p;

import i.a.e1.c.x;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: TestSubscriber.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class f<T> extends i.a.e1.j.a<T, f<T>> implements x<T>, Subscription {

    /* renamed from: j  reason: collision with root package name */
    private final Subscriber<? super T> f28045j;

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f28046k;

    /* renamed from: l  reason: collision with root package name */
    private final AtomicReference<Subscription> f28047l;

    /* renamed from: m  reason: collision with root package name */
    private final AtomicLong f28048m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: TestSubscriber.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a implements x<Object> {
        private static final /* synthetic */ a[] $VALUES = null;
        public static final a INSTANCE = null;

        private a(String $enum$name, int $enum$ordinal) {
        }

        public static a valueOf(String name) {
        }

        public static a[] values() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }
    }

    public f() {
    }

    @i.a.e1.b.f
    public static <T> f<T> C() {
    }

    @i.a.e1.b.f
    public static <T> f<T> D(long initialRequested) {
    }

    public static <T> f<T> E(@i.a.e1.b.f Subscriber<? super T> delegate) {
    }

    public final f<T> B() {
    }

    public final boolean F() {
    }

    public final boolean G() {
    }

    public void H() {
    }

    public final f<T> I(long n2) {
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
    }

    @Override // i.a.e1.j.a, i.a.e1.d.f
    public final void dispose() {
    }

    @Override // i.a.e1.j.a, i.a.e1.d.f
    public final boolean isDisposed() {
    }

    @Override // i.a.e1.j.a
    public /* bridge */ /* synthetic */ i.a.e1.j.a k() {
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

    @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
    public void onSubscribe(@i.a.e1.b.f Subscription s) {
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long n2) {
    }

    public f(long initialRequest) {
    }

    public f(@i.a.e1.b.f Subscriber<? super T> downstream) {
    }

    public f(@i.a.e1.b.f Subscriber<? super T> actual, long initialRequest) {
    }
}
