package i.a.e1.h.f.b;

import i.a.e1.h.f.b.h3;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableRetryWhen.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class l3<T> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super i.a.e1.c.s<Throwable>, ? extends Publisher<?>> f27021d;

    /* compiled from: FlowableRetryWhen.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends h3.c<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        public a(Subscriber<? super T> actual, i.a.e1.m.c<Throwable> processor, Subscription receiver) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t) {
        }
    }

    public l3(i.a.e1.c.s<T> source, i.a.e1.g.o<? super i.a.e1.c.s<Throwable>, ? extends Publisher<?>> handler) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
