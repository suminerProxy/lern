package i.a.y0.e.f;

import i.a.q;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ParallelMap.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class j<T, R> extends i.a.b1.b<R> {

    /* renamed from: a  reason: collision with root package name */
    public final i.a.b1.b<T> f29040a;
    public final i.a.x0.o<? super T, ? extends R> b;

    /* compiled from: ParallelMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> implements i.a.y0.c.a<T>, Subscription {
        public final i.a.y0.c.a<? super R> b;
        public final i.a.x0.o<? super T, ? extends R> c;

        /* renamed from: d  reason: collision with root package name */
        public Subscription f29041d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f29042e;

        public a(i.a.y0.c.a<? super R> aVar, i.a.x0.o<? super T, ? extends R> oVar) {
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

        @Override // i.a.y0.c.a
        public boolean tryOnNext(T t) {
        }
    }

    /* compiled from: ParallelMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, R> implements q<T>, Subscription {
        public final Subscriber<? super R> b;
        public final i.a.x0.o<? super T, ? extends R> c;

        /* renamed from: d  reason: collision with root package name */
        public Subscription f29043d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f29044e;

        public b(Subscriber<? super R> subscriber, i.a.x0.o<? super T, ? extends R> oVar) {
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

    public j(i.a.b1.b<T> bVar, i.a.x0.o<? super T, ? extends R> oVar) {
    }

    @Override // i.a.b1.b
    public int F() {
    }

    @Override // i.a.b1.b
    public void Q(Subscriber<? super R>[] subscriberArr) {
    }
}
