package i.a.e1.h.f.b;

import java.util.Collection;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableToList.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class t4<T, U extends Collection<? super T>> extends i.a.e1.h.f.b.a<T, U> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.s<U> f27177d;

    /* compiled from: FlowableToList.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, U extends Collection<? super T>> extends i.a.e1.h.j.f<U> implements i.a.e1.c.x<T>, Subscription {
        private static final long serialVersionUID = -8134157938864266736L;
        public Subscription upstream;

        public a(Subscriber<? super U> actual, U collection) {
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

    public t4(i.a.e1.c.s<T> source, i.a.e1.g.s<U> collectionSupplier) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super U> s) {
    }
}
