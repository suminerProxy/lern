package i.a.y0.e.f;

import i.a.x0.r;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ParallelFilter.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class d<T> extends i.a.b1.b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final i.a.b1.b<T> f29022a;
    public final r<? super T> b;

    /* compiled from: ParallelFilter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class a<T> implements i.a.y0.c.a<T>, Subscription {
        public final r<? super T> b;
        public Subscription c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f29023d;

        public a(r<? super T> rVar) {
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j2) {
        }
    }

    /* compiled from: ParallelFilter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends a<T> {

        /* renamed from: e  reason: collision with root package name */
        public final i.a.y0.c.a<? super T> f29024e;

        public b(i.a.y0.c.a<? super T> aVar, r<? super T> rVar) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }

        @Override // i.a.y0.c.a
        public boolean tryOnNext(T t) {
        }
    }

    /* compiled from: ParallelFilter.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T> extends a<T> {

        /* renamed from: e  reason: collision with root package name */
        public final Subscriber<? super T> f29025e;

        public c(Subscriber<? super T> subscriber, r<? super T> rVar) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }

        @Override // i.a.y0.c.a
        public boolean tryOnNext(T t) {
        }
    }

    public d(i.a.b1.b<T> bVar, r<? super T> rVar) {
    }

    @Override // i.a.b1.b
    public int F() {
    }

    @Override // i.a.b1.b
    public void Q(Subscriber<? super T>[] subscriberArr) {
    }
}
