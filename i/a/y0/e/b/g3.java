package i.a.y0.e.b;

import i.a.y0.e.b.c3;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableRetryWhen.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class g3<T> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super i.a.l<Throwable>, ? extends Publisher<?>> f28285d;

    /* compiled from: FlowableRetryWhen.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends c3.c<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        public a(Subscriber<? super T> subscriber, i.a.d1.c<Throwable> cVar, Subscription subscription) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }
    }

    public g3(i.a.l<T> lVar, i.a.x0.o<? super i.a.l<Throwable>, ? extends Publisher<?>> oVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
