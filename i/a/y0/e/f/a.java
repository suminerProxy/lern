package i.a.y0.e.f;

import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ParallelCollect.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class a<T, C> extends i.a.b1.b<C> {

    /* renamed from: a  reason: collision with root package name */
    public final i.a.b1.b<? extends T> f29011a;
    public final Callable<? extends C> b;
    public final i.a.x0.b<? super C, ? super T> c;

    /* compiled from: ParallelCollect.java */
    /* renamed from: i.a.y0.e.f.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class C0586a<T, C> extends i.a.y0.h.h<T, C> {
        private static final long serialVersionUID = -4767392946044436228L;
        public C collection;
        public final i.a.x0.b<? super C, ? super T> collector;
        public boolean done;

        public C0586a(Subscriber<? super C> subscriber, C c, i.a.x0.b<? super C, ? super T> bVar) {
        }

        @Override // i.a.y0.h.h, i.a.y0.i.f, org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.y0.h.h, org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // i.a.y0.h.h, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.y0.h.h, i.a.q
        public void onSubscribe(Subscription subscription) {
        }
    }

    public a(i.a.b1.b<? extends T> bVar, Callable<? extends C> callable, i.a.x0.b<? super C, ? super T> bVar2) {
    }

    @Override // i.a.b1.b
    public int F() {
    }

    @Override // i.a.b1.b
    public void Q(Subscriber<? super C>[] subscriberArr) {
    }

    public void V(Subscriber<?>[] subscriberArr, Throwable th) {
    }
}
