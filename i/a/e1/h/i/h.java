package i.a.e1.h.i;

import i.a.e1.c.x;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: DeferredScalarSubscriber.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class h<T, R> extends i.a.e1.h.j.f<R> implements x<T> {
    private static final long serialVersionUID = 2984505488220891551L;
    public boolean hasValue;
    public Subscription upstream;

    public h(Subscriber<? super R> downstream) {
    }

    @Override // i.a.e1.h.j.f, org.reactivestreams.Subscription
    public void cancel() {
    }

    public void onComplete() {
    }

    public void onError(Throwable t) {
    }

    public void onSubscribe(Subscription s) {
    }
}
