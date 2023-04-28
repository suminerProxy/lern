package i.a.y0.h;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: DeferredScalarSubscriber.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class h<T, R> extends i.a.y0.i.f<R> implements i.a.q<T> {
    private static final long serialVersionUID = 2984505488220891551L;
    public boolean hasValue;
    public Subscription upstream;

    public h(Subscriber<? super R> subscriber) {
    }

    @Override // i.a.y0.i.f, org.reactivestreams.Subscription
    public void cancel() {
    }

    public void onComplete() {
    }

    public void onError(Throwable th) {
    }

    public void onSubscribe(Subscription subscription) {
    }
}
