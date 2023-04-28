package i.a.y0.h;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: SubscriberResourceWrapper.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class v<T> extends AtomicReference<i.a.u0.c> implements i.a.q<T>, i.a.u0.c, Subscription {
    private static final long serialVersionUID = -8612022020200669122L;
    public final Subscriber<? super T> downstream;
    public final AtomicReference<Subscription> upstream;

    public v(Subscriber<? super T> subscriber) {
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // i.a.u0.c
    public void dispose() {
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

    public void setResource(i.a.u0.c cVar) {
    }
}
