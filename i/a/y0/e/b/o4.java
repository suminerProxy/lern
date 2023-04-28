package i.a.y0.e.b;

import java.util.Collection;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableToList.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class o4<T, U extends Collection<? super T>> extends i.a.y0.e.b.a<T, U> {

    /* renamed from: d  reason: collision with root package name */
    public final Callable<U> f28409d;

    /* compiled from: FlowableToList.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, U extends Collection<? super T>> extends i.a.y0.i.f<U> implements i.a.q<T>, Subscription {
        private static final long serialVersionUID = -8134157938864266736L;
        public Subscription upstream;

        public a(Subscriber<? super U> subscriber, U u) {
        }

        @Override // i.a.y0.i.f, org.reactivestreams.Subscription
        public void cancel() {
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
    }

    public o4(i.a.l<T> lVar, Callable<U> callable) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super U> subscriber) {
    }
}
