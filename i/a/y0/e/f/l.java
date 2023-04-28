package i.a.y0.e.f;

import i.a.x0.q;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ParallelPeek.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class l<T> extends i.a.b1.b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final i.a.b1.b<T> f29053a;
    public final i.a.x0.g<? super T> b;
    public final i.a.x0.g<? super T> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.g<? super Throwable> f29054d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.x0.a f29055e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.x0.a f29056f;

    /* renamed from: g  reason: collision with root package name */
    public final i.a.x0.g<? super Subscription> f29057g;

    /* renamed from: h  reason: collision with root package name */
    public final q f29058h;

    /* renamed from: i  reason: collision with root package name */
    public final i.a.x0.a f29059i;

    /* compiled from: ParallelPeek.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> implements i.a.q<T>, Subscription {
        public final Subscriber<? super T> b;
        public final l<T> c;

        /* renamed from: d  reason: collision with root package name */
        public Subscription f29060d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f29061e;

        public a(Subscriber<? super T> subscriber, l<T> lVar) {
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

    public l(i.a.b1.b<T> bVar, i.a.x0.g<? super T> gVar, i.a.x0.g<? super T> gVar2, i.a.x0.g<? super Throwable> gVar3, i.a.x0.a aVar, i.a.x0.a aVar2, i.a.x0.g<? super Subscription> gVar4, q qVar, i.a.x0.a aVar3) {
    }

    @Override // i.a.b1.b
    public int F() {
    }

    @Override // i.a.b1.b
    public void Q(Subscriber<? super T>[] subscriberArr) {
    }
}
