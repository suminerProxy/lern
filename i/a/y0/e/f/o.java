package i.a.y0.e.f;

import i.a.j0;
import i.a.q;
import i.a.y0.g.o;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ParallelRunOn.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class o<T> extends i.a.b1.b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final i.a.b1.b<? extends T> f29064a;
    public final j0 b;
    public final int c;

    /* compiled from: ParallelRunOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static abstract class a<T> extends AtomicInteger implements q<T>, Subscription, Runnable {
        private static final long serialVersionUID = 9222303586456402150L;
        public volatile boolean cancelled;
        public int consumed;
        public volatile boolean done;
        public Throwable error;
        public final int limit;
        public final int prefetch;
        public final i.a.y0.f.b<T> queue;
        public final AtomicLong requested;
        public Subscription upstream;
        public final j0.c worker;

        public a(int i2, i.a.y0.f.b<T> bVar, j0.c cVar) {
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j2) {
        }

        public final void schedule() {
        }
    }

    /* compiled from: ParallelRunOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class b implements o.a {

        /* renamed from: a  reason: collision with root package name */
        public final Subscriber<? super T>[] f29065a;
        public final Subscriber<T>[] b;
        public final /* synthetic */ o c;

        public b(o oVar, Subscriber<? super T>[] subscriberArr, Subscriber<T>[] subscriberArr2) {
        }

        @Override // i.a.y0.g.o.a
        public void a(int i2, j0.c cVar) {
        }
    }

    /* compiled from: ParallelRunOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T> extends a<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        public final i.a.y0.c.a<? super T> downstream;

        public c(i.a.y0.c.a<? super T> aVar, int i2, i.a.y0.f.b<T> bVar, j0.c cVar) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* compiled from: ParallelRunOn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class d<T> extends a<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        public final Subscriber<? super T> downstream;

        public d(Subscriber<? super T> subscriber, int i2, i.a.y0.f.b<T> bVar, j0.c cVar) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public o(i.a.b1.b<? extends T> bVar, j0 j0Var, int i2) {
    }

    @Override // i.a.b1.b
    public int F() {
    }

    @Override // i.a.b1.b
    public void Q(Subscriber<? super T>[] subscriberArr) {
    }

    public void V(int i2, Subscriber<? super T>[] subscriberArr, Subscriber<T>[] subscriberArr2, j0.c cVar) {
    }
}
