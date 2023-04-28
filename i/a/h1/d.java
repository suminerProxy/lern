package i.a.h1;

import i.a.q;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: SafeSubscriber.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class d<T> implements q<T>, Subscription {
    public final Subscriber<? super T> b;
    public Subscription c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f28106d;

    public d(Subscriber<? super T> subscriber) {
    }

    public void a() {
    }

    public void b() {
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
}
