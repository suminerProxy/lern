package i.a.y0.h;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* compiled from: BlockingSubscriber.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class f<T> extends AtomicReference<Subscription> implements i.a.q<T>, Subscription {
    public static final Object TERMINATED = null;
    private static final long serialVersionUID = -4875965440900746268L;
    public final Queue<Object> queue;

    public f(Queue<Object> queue) {
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    public boolean isCancelled() {
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
