package i.a.e1.h.i;

import i.a.e1.c.x;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* compiled from: ForEachWhileSubscriber.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class i<T> extends AtomicReference<Subscription> implements x<T>, i.a.e1.d.f {
    private static final long serialVersionUID = -4403180040475402120L;
    public boolean done;
    public final i.a.e1.g.a onComplete;
    public final i.a.e1.g.g<? super Throwable> onError;
    public final i.a.e1.g.r<? super T> onNext;

    public i(i.a.e1.g.r<? super T> onNext, i.a.e1.g.g<? super Throwable> onError, i.a.e1.g.a onComplete) {
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
}
