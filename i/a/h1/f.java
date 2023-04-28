package i.a.h1;

import i.a.q;
import i.a.x0.g;
import i.a.y0.c.l;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: TestSubscriber.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public class f<T> extends i.a.a1.a<T, f<T>> implements q<T>, Subscription, i.a.u0.c {

    /* renamed from: l  reason: collision with root package name */
    private final Subscriber<? super T> f28112l;

    /* renamed from: m  reason: collision with root package name */
    private volatile boolean f28113m;

    /* renamed from: n  reason: collision with root package name */
    private final AtomicReference<Subscription> f28114n;

    /* renamed from: o  reason: collision with root package name */
    private final AtomicLong f28115o;

    /* renamed from: p  reason: collision with root package name */
    private l<T> f28116p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unexpected branching in enum static init block */
    /* compiled from: TestSubscriber.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a implements q<Object> {
        private static final /* synthetic */ a[] $VALUES = null;
        public static final a INSTANCE = null;

        private a(String str, int i2) {
        }

        public static a valueOf(String str) {
        }

        public static a[] values() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }
    }

    public f() {
    }

    public static <T> f<T> h0() {
    }

    public static <T> f<T> i0(long j2) {
    }

    public static <T> f<T> j0(Subscriber<? super T> subscriber) {
    }

    public static String k0(int i2) {
    }

    public final f<T> b0() {
    }

    public final f<T> c0(int i2) {
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
    }

    public final f<T> d0() {
    }

    @Override // i.a.u0.c
    public final void dispose() {
    }

    public final f<T> e0() {
    }

    public final f<T> f0(g<? super f<T>> gVar) {
    }

    public final f<T> g0() {
    }

    @Override // i.a.u0.c
    public final boolean isDisposed() {
    }

    public final boolean l0() {
    }

    public final boolean m0() {
    }

    public void n0() {
    }

    public final f<T> o0(long j2) {
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

    @Override // i.a.q
    public void onSubscribe(Subscription subscription) {
    }

    @Override // i.a.a1.a
    public /* bridge */ /* synthetic */ i.a.a1.a p() {
    }

    public final f<T> p0(int i2) {
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j2) {
    }

    @Override // i.a.a1.a
    public /* bridge */ /* synthetic */ i.a.a1.a s() {
    }

    public f(long j2) {
    }

    public f(Subscriber<? super T> subscriber) {
    }

    public f(Subscriber<? super T> subscriber, long j2) {
    }
}
