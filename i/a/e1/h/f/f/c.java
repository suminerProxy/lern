package i.a.e1.h.f.f;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ParallelDoOnNextTry.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class c<T> extends i.a.e1.k.b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final i.a.e1.k.b<T> f27690a;
    public final i.a.e1.g.g<? super T> b;
    public final i.a.e1.g.c<? super Long, ? super Throwable, i.a.e1.k.a> c;

    /* compiled from: ParallelDoOnNextTry.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27691a = null;
    }

    /* compiled from: ParallelDoOnNextTry.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> implements i.a.e1.h.c.c<T>, Subscription {
        public final i.a.e1.h.c.c<? super T> b;
        public final i.a.e1.g.g<? super T> c;

        /* renamed from: d  reason: collision with root package name */
        public final i.a.e1.g.c<? super Long, ? super Throwable, i.a.e1.k.a> f27692d;

        /* renamed from: e  reason: collision with root package name */
        public Subscription f27693e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f27694f;

        public b(i.a.e1.h.c.c<? super T> actual, i.a.e1.g.g<? super T> onNext, i.a.e1.g.c<? super Long, ? super Throwable, i.a.e1.k.a> errorHandler) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        @Override // i.a.e1.h.c.c
        public boolean tryOnNext(T t) {
        }
    }

    /* compiled from: ParallelDoOnNextTry.java */
    /* renamed from: i.a.e1.h.f.f.c$c  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class C0496c<T> implements i.a.e1.h.c.c<T>, Subscription {
        public final Subscriber<? super T> b;
        public final i.a.e1.g.g<? super T> c;

        /* renamed from: d  reason: collision with root package name */
        public final i.a.e1.g.c<? super Long, ? super Throwable, i.a.e1.k.a> f27695d;

        /* renamed from: e  reason: collision with root package name */
        public Subscription f27696e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f27697f;

        public C0496c(Subscriber<? super T> actual, i.a.e1.g.g<? super T> onNext, i.a.e1.g.c<? super Long, ? super Throwable, i.a.e1.k.a> errorHandler) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n2) {
        }

        @Override // i.a.e1.h.c.c
        public boolean tryOnNext(T t) {
        }
    }

    public c(i.a.e1.k.b<T> source, i.a.e1.g.g<? super T> onNext, i.a.e1.g.c<? super Long, ? super Throwable, i.a.e1.k.a> errorHandler) {
    }

    @Override // i.a.e1.k.b
    public int M() {
    }

    @Override // i.a.e1.k.b
    public void X(Subscriber<? super T>[] subscribers) {
    }
}
