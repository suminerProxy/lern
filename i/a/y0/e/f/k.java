package i.a.y0.e.f;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ParallelMapTry.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class k<T, R> extends i.a.b1.b<R> {

    /* renamed from: a  reason: collision with root package name */
    public final i.a.b1.b<T> f29045a;
    public final i.a.x0.o<? super T, ? extends R> b;
    public final i.a.x0.c<? super Long, ? super Throwable, i.a.b1.a> c;

    /* compiled from: ParallelMapTry.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f29046a = null;
    }

    /* compiled from: ParallelMapTry.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, R> implements i.a.y0.c.a<T>, Subscription {
        public final i.a.y0.c.a<? super R> b;
        public final i.a.x0.o<? super T, ? extends R> c;

        /* renamed from: d  reason: collision with root package name */
        public final i.a.x0.c<? super Long, ? super Throwable, i.a.b1.a> f29047d;

        /* renamed from: e  reason: collision with root package name */
        public Subscription f29048e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f29049f;

        public b(i.a.y0.c.a<? super R> aVar, i.a.x0.o<? super T, ? extends R> oVar, i.a.x0.c<? super Long, ? super Throwable, i.a.b1.a> cVar) {
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

    /* compiled from: ParallelMapTry.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T, R> implements i.a.y0.c.a<T>, Subscription {
        public final Subscriber<? super R> b;
        public final i.a.x0.o<? super T, ? extends R> c;

        /* renamed from: d  reason: collision with root package name */
        public final i.a.x0.c<? super Long, ? super Throwable, i.a.b1.a> f29050d;

        /* renamed from: e  reason: collision with root package name */
        public Subscription f29051e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f29052f;

        public c(Subscriber<? super R> subscriber, i.a.x0.o<? super T, ? extends R> oVar, i.a.x0.c<? super Long, ? super Throwable, i.a.b1.a> cVar) {
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

    public k(i.a.b1.b<T> bVar, i.a.x0.o<? super T, ? extends R> oVar, i.a.x0.c<? super Long, ? super Throwable, i.a.b1.a> cVar) {
    }

    @Override // i.a.b1.b
    public int F() {
    }

    @Override // i.a.b1.b
    public void Q(Subscriber<? super R>[] subscriberArr) {
    }
}
