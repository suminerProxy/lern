package i.a.y0.e.b;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableSwitchIfEmpty.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class y3<T> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final Publisher<? extends T> f28595d;

    /* compiled from: FlowableSwitchIfEmpty.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> implements i.a.q<T> {
        public final Subscriber<? super T> b;
        public final Publisher<? extends T> c;

        /* renamed from: d  reason: collision with root package name */
        public final i.a.y0.i.i f28596d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f28597e;

        public a(Subscriber<? super T> subscriber, Publisher<? extends T> publisher) {
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

    public y3(i.a.l<T> lVar, Publisher<? extends T> publisher) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
