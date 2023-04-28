package i.a.h1;

import i.a.q;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: SerializedSubscriber.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class e<T> implements q<T>, Subscription {

    /* renamed from: h  reason: collision with root package name */
    public static final int f28107h = 4;
    public final Subscriber<? super T> b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public Subscription f28108d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f28109e;

    /* renamed from: f  reason: collision with root package name */
    public i.a.y0.j.a<Object> f28110f;

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f28111g;

    public e(Subscriber<? super T> subscriber) {
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
    public void onError(Throwable th) {
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
    }

    @Override // i.a.q
    public void onSubscribe(Subscription subscription) {
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
    }

    public e(Subscriber<? super T> subscriber, boolean z) {
    }
}
