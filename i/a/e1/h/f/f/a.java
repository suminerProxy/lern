package i.a.e1.h.f.f;

import i.a.e1.g.s;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: ParallelCollect.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class a<T, C> extends i.a.e1.k.b<C> {

    /* renamed from: a  reason: collision with root package name */
    public final i.a.e1.k.b<? extends T> f27687a;
    public final s<? extends C> b;
    public final i.a.e1.g.b<? super C, ? super T> c;

    /* compiled from: ParallelCollect.java */
    /* renamed from: i.a.e1.h.f.f.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class C0495a<T, C> extends i.a.e1.h.i.h<T, C> {
        private static final long serialVersionUID = -4767392946044436228L;
        public C collection;
        public final i.a.e1.g.b<? super C, ? super T> collector;
        public boolean done;

        public C0495a(Subscriber<? super C> subscriber, C initialValue, i.a.e1.g.b<? super C, ? super T> collector) {
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

    public a(i.a.e1.k.b<? extends T> source, s<? extends C> initialCollection, i.a.e1.g.b<? super C, ? super T> collector) {
    }

    @Override // i.a.e1.k.b
    public int M() {
    }

    @Override // i.a.e1.k.b
    public void X(Subscriber<? super C>[] subscribers) {
    }

    public void c0(Subscriber<?>[] subscribers, Throwable ex) {
    }
}
