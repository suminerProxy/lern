package i.a.y0.h;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* compiled from: InnerQueuedSubscriber.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class k<T> extends AtomicReference<Subscription> implements i.a.q<T>, Subscription {
    private static final long serialVersionUID = 22876611072430776L;
    public volatile boolean done;
    public int fusionMode;
    public final int limit;
    public final l<T> parent;
    public final int prefetch;
    public long produced;
    public volatile i.a.y0.c.o<T> queue;

    public k(l<T> lVar, int i2) {
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
    public void onError(Throwable th) {
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
    }

    @Override // i.a.q
    public void onSubscribe(Subscription subscription) {
    }

    public i.a.y0.c.o<T> queue() {
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
    }

    public void requestOne() {
    }

    public void setDone() {
    }
}
