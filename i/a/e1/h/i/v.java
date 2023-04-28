package i.a.e1.h.i;

import i.a.e1.c.x;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: SubscriberResourceWrapper.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class v<T> extends AtomicReference<i.a.e1.d.f> implements x<T>, i.a.e1.d.f, Subscription {
    private static final long serialVersionUID = -8612022020200669122L;
    public final Subscriber<? super T> downstream;
    public final AtomicReference<Subscription> upstream;

    public v(Subscriber<? super T> downstream) {
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // i.a.e1.d.f
    public void dispose() {
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

    public void setResource(i.a.e1.d.f resource) {
    }
}
