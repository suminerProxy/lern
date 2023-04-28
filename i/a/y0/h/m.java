package i.a.y0.h;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* compiled from: LambdaSubscriber.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class m<T> extends AtomicReference<Subscription> implements i.a.q<T>, Subscription, i.a.u0.c, i.a.a1.g {
    private static final long serialVersionUID = -7251123623727029452L;
    public final i.a.x0.a onComplete;
    public final i.a.x0.g<? super Throwable> onError;
    public final i.a.x0.g<? super T> onNext;
    public final i.a.x0.g<? super Subscription> onSubscribe;

    public m(i.a.x0.g<? super T> gVar, i.a.x0.g<? super Throwable> gVar2, i.a.x0.a aVar, i.a.x0.g<? super Subscription> gVar3) {
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // i.a.u0.c
    public void dispose() {
    }

    @Override // i.a.a1.g
    public boolean hasCustomOnError() {
    }

    @Override // i.a.u0.c
    public boolean isDisposed() {
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
