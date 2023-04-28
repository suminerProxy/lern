package i.a.e1.h.f.c;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* compiled from: MaybeDelaySubscriptionOtherPublisher.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class n<T, U> extends i.a.e1.h.f.c.a<T, T> {
    public final Publisher<U> c;

    /* compiled from: MaybeDelaySubscriptionOtherPublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.c0<T> {
        private static final long serialVersionUID = 706635022205076709L;
        public final i.a.e1.c.c0<? super T> downstream;

        public a(i.a.e1.c.c0<? super T> downstream) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.m
        public void onComplete() {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0
        public void onSuccess(T value) {
        }
    }

    /* compiled from: MaybeDelaySubscriptionOtherPublisher.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T> implements i.a.e1.c.x<Object>, i.a.e1.d.f {
        public final a<T> b;
        public i.a.e1.c.f0<T> c;

        /* renamed from: d  reason: collision with root package name */
        public Subscription f27317d;

        public b(i.a.e1.c.c0<? super T> actual, i.a.e1.c.f0<T> source) {
        }

        public void a() {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }
    }

    public n(i.a.e1.c.f0<T> source, Publisher<U> other) {
    }

    @Override // i.a.e1.c.z
    public void U1(i.a.e1.c.c0<? super T> observer) {
    }
}
