package i.a.e1.h.i;

import i.a.e1.c.x;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* compiled from: BoundedSubscriber.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class g<T> extends AtomicReference<Subscription> implements x<T>, Subscription, i.a.e1.d.f, i.a.e1.j.g {
    private static final long serialVersionUID = -7251123623727029452L;
    public final int bufferSize;
    public int consumed;
    public final int limit;
    public final i.a.e1.g.a onComplete;
    public final i.a.e1.g.g<? super Throwable> onError;
    public final i.a.e1.g.g<? super T> onNext;
    public final i.a.e1.g.g<? super Subscription> onSubscribe;

    public g(i.a.e1.g.g<? super T> onNext, i.a.e1.g.g<? super Throwable> onError, i.a.e1.g.a onComplete, i.a.e1.g.g<? super Subscription> onSubscribe, int bufferSize) {
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // i.a.e1.d.f
    public void dispose() {
    }

    @Override // i.a.e1.j.g
    public boolean hasCustomOnError() {
    }

    @Override // i.a.e1.d.f
    public boolean isDisposed() {
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

    @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
    public void onSubscribe(Subscription s) {
    }

    @Override // org.reactivestreams.Subscription
    public void request(long n2) {
    }
}
