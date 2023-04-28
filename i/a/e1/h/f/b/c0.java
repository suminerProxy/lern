package i.a.e1.h.f.b;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableCount.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class c0<T> extends i.a.e1.h.f.b.a<T, Long> {

    /* compiled from: FlowableCount.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a extends i.a.e1.h.j.f<Long> implements i.a.e1.c.x<Object> {
        private static final long serialVersionUID = 4973004223787171406L;
        public long count;
        public Subscription upstream;

        public a(Subscriber<? super Long> downstream) {
        }

        @Override // i.a.e1.h.j.f, org.reactivestreams.Subscription
        public void cancel() {
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

    public c0(i.a.e1.c.s<T> source) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super Long> s) {
    }
}
