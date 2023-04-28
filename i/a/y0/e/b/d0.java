package i.a.y0.e.b;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableCount.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class d0<T> extends i.a.y0.e.b.a<T, Long> {

    /* compiled from: FlowableCount.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a extends i.a.y0.i.f<Long> implements i.a.q<Object> {
        private static final long serialVersionUID = 4973004223787171406L;
        public long count;
        public Subscription upstream;

        public a(Subscriber<? super Long> subscriber) {
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
        public void onNext(Object obj) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }
    }

    public d0(i.a.l<T> lVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super Long> subscriber) {
    }
}
