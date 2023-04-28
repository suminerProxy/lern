package i.a.y0.e.f;

import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ParallelReduce.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class m<T, R> extends i.a.b1.b<R> {

    /* renamed from: a  reason: collision with root package name */
    public final i.a.b1.b<? extends T> f29062a;
    public final Callable<R> b;
    public final i.a.x0.c<R, ? super T, R> c;

    /* compiled from: ParallelReduce.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends i.a.y0.h.h<T, R> {
        private static final long serialVersionUID = 8200530050639449080L;
        public R accumulator;
        public boolean done;
        public final i.a.x0.c<R, ? super T, R> reducer;

        public a(Subscriber<? super R> subscriber, R r, i.a.x0.c<R, ? super T, R> cVar) {
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

    public m(i.a.b1.b<? extends T> bVar, Callable<R> callable, i.a.x0.c<R, ? super T, R> cVar) {
    }

    @Override // i.a.b1.b
    public int F() {
    }

    @Override // i.a.b1.b
    public void Q(Subscriber<? super R>[] subscriberArr) {
    }

    public void V(Subscriber<?>[] subscriberArr, Throwable th) {
    }
}
