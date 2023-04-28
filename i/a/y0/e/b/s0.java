package i.a.y0.e.b;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableDoOnLifecycle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class s0<T> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    private final i.a.x0.g<? super Subscription> f28468d;

    /* renamed from: e  reason: collision with root package name */
    private final i.a.x0.q f28469e;

    /* renamed from: f  reason: collision with root package name */
    private final i.a.x0.a f28470f;

    /* compiled from: FlowableDoOnLifecycle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> implements i.a.q<T>, Subscription {
        public final Subscriber<? super T> b;
        public final i.a.x0.g<? super Subscription> c;

        /* renamed from: d  reason: collision with root package name */
        public final i.a.x0.q f28471d;

        /* renamed from: e  reason: collision with root package name */
        public final i.a.x0.a f28472e;

        /* renamed from: f  reason: collision with root package name */
        public Subscription f28473f;

        public a(Subscriber<? super T> subscriber, i.a.x0.g<? super Subscription> gVar, i.a.x0.q qVar, i.a.x0.a aVar) {
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

    public s0(i.a.l<T> lVar, i.a.x0.g<? super Subscription> gVar, i.a.x0.q qVar, i.a.x0.a aVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
