package i.a.y0.e.b;

import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableCollect.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class s<T, U> extends i.a.y0.e.b.a<T, U> {

    /* renamed from: d  reason: collision with root package name */
    public final Callable<? extends U> f28466d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.x0.b<? super U, ? super T> f28467e;

    /* compiled from: FlowableCollect.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, U> extends i.a.y0.i.f<U> implements i.a.q<T> {
        private static final long serialVersionUID = -3589550218733891694L;
        public final i.a.x0.b<? super U, ? super T> collector;
        public boolean done;
        public final U u;
        public Subscription upstream;

        public a(Subscriber<? super U> subscriber, U u, i.a.x0.b<? super U, ? super T> bVar) {
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

    public s(i.a.l<T> lVar, Callable<? extends U> callable, i.a.x0.b<? super U, ? super T> bVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super U> subscriber) {
    }
}
