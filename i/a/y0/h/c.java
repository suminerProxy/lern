package i.a.y0.h;

import java.util.concurrent.CountDownLatch;
import org.reactivestreams.Subscription;

/* compiled from: BlockingBaseSubscriber.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class c<T> extends CountDownLatch implements i.a.q<T> {
    public T b;
    public Throwable c;

    /* renamed from: d  reason: collision with root package name */
    public Subscription f29180d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f29181e;

    public final T a() {
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
    }

    @Override // i.a.q
    public final void onSubscribe(Subscription subscription) {
    }
}
