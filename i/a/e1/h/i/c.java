package i.a.e1.h.i;

import i.a.e1.c.x;
import java.util.concurrent.CountDownLatch;
import org.reactivestreams.Subscription;

/* compiled from: BlockingBaseSubscriber.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class c<T> extends CountDownLatch implements x<T> {
    public T b;
    public Throwable c;

    /* renamed from: d  reason: collision with root package name */
    public Subscription f27868d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f27869e;

    public final T a() {
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
    }

    @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
    public final void onSubscribe(Subscription s) {
    }
}
