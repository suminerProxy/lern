package i.a.e1.h.f.b;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableCollect.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class r<T, U> extends i.a.e1.h.f.b.a<T, U> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.s<? extends U> f27130d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.g.b<? super U, ? super T> f27131e;

    /* compiled from: FlowableCollect.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, U> extends i.a.e1.h.j.f<U> implements i.a.e1.c.x<T> {
        private static final long serialVersionUID = -3589550218733891694L;
        public final i.a.e1.g.b<? super U, ? super T> collector;
        public boolean done;
        public final U u;
        public Subscription upstream;

        public a(Subscriber<? super U> actual, U u, i.a.e1.g.b<? super U, ? super T> collector) {
        }

        @Override // i.a.e1.h.j.f, org.reactivestreams.Subscription
        public void cancel() {
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
    }

    public r(i.a.e1.c.s<T> source, i.a.e1.g.s<? extends U> initialSupplier, i.a.e1.g.b<? super U, ? super T> collector) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super U> s) {
    }
}
