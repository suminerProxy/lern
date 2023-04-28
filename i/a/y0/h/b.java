package i.a.y0.h;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: BasicFuseableSubscriber.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public abstract class b<T, R> implements i.a.q<T>, i.a.y0.c.l<R> {
    public final Subscriber<? super R> b;
    public Subscription c;

    /* renamed from: d  reason: collision with root package name */
    public i.a.y0.c.l<T> f29177d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f29178e;

    /* renamed from: f  reason: collision with root package name */
    public int f29179f;

    public b(Subscriber<? super R> subscriber) {
    }

    public void a() {
    }

    public boolean b() {
    }

    public final void c(Throwable th) {
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    public void clear() {
    }

    public final int d(int i2) {
    }

    @Override // i.a.y0.c.o
    public boolean isEmpty() {
    }

    @Override // i.a.y0.c.o
    public final boolean offer(R r) {
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
    }

    @Override // i.a.q
    public final void onSubscribe(Subscription subscription) {
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
    }

    @Override // i.a.y0.c.o
    public final boolean offer(R r, R r2) {
    }
}
