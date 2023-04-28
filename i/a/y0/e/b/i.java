package i.a.y0.e.b;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableAny.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class i<T> extends i.a.y0.e.b.a<T, Boolean> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.r<? super T> f28300d;

    /* compiled from: FlowableAny.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends i.a.y0.i.f<Boolean> implements i.a.q<T> {
        private static final long serialVersionUID = -2311252482644620661L;
        public boolean done;
        public final i.a.x0.r<? super T> predicate;
        public Subscription upstream;

        public a(Subscriber<? super Boolean> subscriber, i.a.x0.r<? super T> rVar) {
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

    public i(i.a.l<T> lVar, i.a.x0.r<? super T> rVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super Boolean> subscriber) {
    }
}
