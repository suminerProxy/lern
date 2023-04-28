package i.a.y0.h;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* compiled from: ForEachWhileSubscriber.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class i<T> extends AtomicReference<Subscription> implements i.a.q<T>, i.a.u0.c {
    private static final long serialVersionUID = -4403180040475402120L;
    public boolean done;
    public final i.a.x0.a onComplete;
    public final i.a.x0.g<? super Throwable> onError;
    public final i.a.x0.r<? super T> onNext;

    public i(i.a.x0.r<? super T> rVar, i.a.x0.g<? super Throwable> gVar, i.a.x0.a aVar) {
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
}
