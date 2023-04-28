package i.a.e1.h.d;

import java.util.Optional;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ParallelMapTryOptional.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class d0<T, R> extends i.a.e1.k.b<R> {

    /* renamed from: a  reason: collision with root package name */
    public final i.a.e1.k.b<T> f26773a;
    public final i.a.e1.g.o<? super T, Optional<? extends R>> b;
    public final i.a.e1.g.c<? super Long, ? super Throwable, i.a.e1.k.a> c;

    /* compiled from: ParallelMapTryOptional.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f26774a = null;
    }

    /* compiled from: ParallelMapTryOptional.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, R> implements i.a.e1.h.c.c<T>, Subscription {
        public final i.a.e1.h.c.c<? super R> b;
        public final i.a.e1.g.o<? super T, Optional<? extends R>> c;

        /* renamed from: d  reason: collision with root package name */
        public final i.a.e1.g.c<? super Long, ? super Throwable, i.a.e1.k.a> f26775d;

        /* renamed from: e  reason: collision with root package name */
        public Subscription f26776e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f26777f;

        public b(i.a.e1.h.c.c<? super R> actual, i.a.e1.g.o<? super T, Optional<? extends R>> mapper, i.a.e1.g.c<? super Long, ? super Throwable, i.a.e1.k.a> errorHandler) {
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

    /* compiled from: ParallelMapTryOptional.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T, R> implements i.a.e1.h.c.c<T>, Subscription {
        public final Subscriber<? super R> b;
        public final i.a.e1.g.o<? super T, Optional<? extends R>> c;

        /* renamed from: d  reason: collision with root package name */
        public final i.a.e1.g.c<? super Long, ? super Throwable, i.a.e1.k.a> f26778d;

        /* renamed from: e  reason: collision with root package name */
        public Subscription f26779e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f26780f;

        public c(Subscriber<? super R> actual, i.a.e1.g.o<? super T, Optional<? extends R>> mapper, i.a.e1.g.c<? super Long, ? super Throwable, i.a.e1.k.a> errorHandler) {
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

    public d0(i.a.e1.k.b<T> source, i.a.e1.g.o<? super T, Optional<? extends R>> mapper, i.a.e1.g.c<? super Long, ? super Throwable, i.a.e1.k.a> errorHandler) {
    }

    @Override // i.a.e1.k.b
    public int M() {
    }

    @Override // i.a.e1.k.b
    public void X(Subscriber<? super R>[] subscribers) {
    }
}
