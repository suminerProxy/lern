package i.a.e1.p;

import i.a.e1.c.x;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: SerializedSubscriber.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class e<T> implements x<T>, Subscription {

    /* renamed from: h  reason: collision with root package name */
    public static final int f28040h = 4;
    public final Subscriber<? super T> b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public Subscription f28041d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f28042e;

    /* renamed from: f  reason: collision with root package name */
    public i.a.e1.h.k.a<Object> f28043f;

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f28044g;

    public e(Subscriber<? super T> downstream) {
    }

    public void a() {
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable t) {
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(@i.a.e1.b.f T t) {
    }

    @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
    public void onSubscribe(@i.a.e1.b.f Subscription s) {
    }

    @Override // org.reactivestreams.Subscription
    public void request(long n2) {
    }

    public e(@i.a.e1.b.f Subscriber<? super T> actual, boolean delayError) {
    }
}
