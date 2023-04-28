package i.a.e1.h.i;

import i.a.e1.c.x;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* compiled from: InnerQueuedSubscriber.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class k<T> extends AtomicReference<Subscription> implements x<T>, Subscription {
    private static final long serialVersionUID = 22876611072430776L;
    public volatile boolean done;
    public int fusionMode;
    public final int limit;
    public final l<T> parent;
    public final int prefetch;
    public long produced;
    public volatile i.a.e1.h.c.q<T> queue;

    public k(l<T> parent, int prefetch) {
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    public boolean isDone() {
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

    public i.a.e1.h.c.q<T> queue() {
    }

    @Override // org.reactivestreams.Subscription
    public void request(long n2) {
    }

    public void setDone() {
    }
}
