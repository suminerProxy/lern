package i.a.e1.h.i;

import org.reactivestreams.Subscription;

/* compiled from: BasicFuseableConditionalSubscriber.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public abstract class a<T, R> implements i.a.e1.h.c.c<T>, i.a.e1.h.c.n<R> {
    public final i.a.e1.h.c.c<? super R> b;
    public Subscription c;

    /* renamed from: d  reason: collision with root package name */
    public i.a.e1.h.c.n<T> f27862d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f27863e;

    /* renamed from: f  reason: collision with root package name */
    public int f27864f;

    public a(i.a.e1.h.c.c<? super R> downstream) {
    }

    public void a() {
    }

    public boolean b() {
    }

    public final void c(Throwable t) {
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // i.a.e1.h.c.q
    public void clear() {
    }

    public final int d(int mode) {
    }

    @Override // i.a.e1.h.c.q
    public boolean isEmpty() {
    }

    @Override // i.a.e1.h.c.q
    public final boolean offer(R e2) {
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable t) {
    }

    @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
    public final void onSubscribe(Subscription s) {
    }

    @Override // org.reactivestreams.Subscription
    public void request(long n2) {
    }

    @Override // i.a.e1.h.c.q
    public final boolean offer(R v1, R v2) {
    }
}
