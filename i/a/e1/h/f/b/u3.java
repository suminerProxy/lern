package i.a.e1.h.f.b;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class u3<T> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final T f27180d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f27181e;

    /* compiled from: FlowableSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends i.a.e1.h.j.f<T> implements i.a.e1.c.x<T> {
        private static final long serialVersionUID = -5526049321428043809L;
        public final T defaultValue;
        public boolean done;
        public final boolean failOnEmpty;
        public Subscription upstream;

        public a(Subscriber<? super T> actual, T defaultValue, boolean failOnEmpty) {
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

    public u3(i.a.e1.c.s<T> source, T defaultValue, boolean failOnEmpty) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
