package i.a.y0.e.b;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableDematerialize.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class l0<T, R> extends i.a.y0.e.b.a<T, R> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super T, ? extends i.a.a0<R>> f28345d;

    /* compiled from: FlowableDematerialize.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> implements i.a.q<T>, Subscription {
        public final Subscriber<? super R> b;
        public final i.a.x0.o<? super T, ? extends i.a.a0<R>> c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f28346d;

        /* renamed from: e  reason: collision with root package name */
        public Subscription f28347e;

        public a(Subscriber<? super R> subscriber, i.a.x0.o<? super T, ? extends i.a.a0<R>> oVar) {
        }

        @Override // org.reactivestreams.Subscription
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

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    public l0(i.a.l<T> lVar, i.a.x0.o<? super T, ? extends i.a.a0<R>> oVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super R> subscriber) {
    }
}
