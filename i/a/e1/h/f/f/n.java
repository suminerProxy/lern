package i.a.e1.h.f.f;

import i.a.e1.g.s;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ParallelReduce.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class n<T, R> extends i.a.e1.k.b<R> {

    /* renamed from: a  reason: collision with root package name */
    public final i.a.e1.k.b<? extends T> f27739a;
    public final s<R> b;
    public final i.a.e1.g.c<R, ? super T, R> c;

    /* compiled from: ParallelReduce.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> extends i.a.e1.h.i.h<T, R> {
        private static final long serialVersionUID = 8200530050639449080L;
        public R accumulator;
        public boolean done;
        public final i.a.e1.g.c<R, ? super T, R> reducer;

        public a(Subscriber<? super R> subscriber, R initialValue, i.a.e1.g.c<R, ? super T, R> reducer) {
        }

        @Override // i.a.e1.h.i.h, i.a.e1.h.j.f, org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // i.a.e1.h.i.h, org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // i.a.e1.h.i.h, org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.h.i.h, i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }
    }

    public n(i.a.e1.k.b<? extends T> source, s<R> initialSupplier, i.a.e1.g.c<R, ? super T, R> reducer) {
    }

    @Override // i.a.e1.k.b
    public int M() {
    }

    @Override // i.a.e1.k.b
    public void X(Subscriber<? super R>[] subscribers) {
    }

    public void c0(Subscriber<?>[] subscribers, Throwable ex) {
    }
}
