package i.a.e1.h.f.b;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableAny.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class i<T> extends i.a.e1.h.f.b.a<T, Boolean> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.r<? super T> f26979d;

    /* compiled from: FlowableAny.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends i.a.e1.h.j.f<Boolean> implements i.a.e1.c.x<T> {
        private static final long serialVersionUID = -2311252482644620661L;
        public boolean done;
        public final i.a.e1.g.r<? super T> predicate;
        public Subscription upstream;

        public a(Subscriber<? super Boolean> actual, i.a.e1.g.r<? super T> predicate) {
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
        public void onNext(T t) {
        }

        @Override // i.a.e1.c.x, org.reactivestreams.Subscriber, i.a.q
        public void onSubscribe(Subscription s) {
        }
    }

    public i(i.a.e1.c.s<T> source, i.a.e1.g.r<? super T> predicate) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super Boolean> s) {
    }
}
