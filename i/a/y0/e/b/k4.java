package i.a.y0.e.b;

import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableTimeInterval.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class k4<T> extends i.a.y0.e.b.a<T, i.a.f1.d<T>> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.j0 f28340d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeUnit f28341e;

    /* compiled from: FlowableTimeInterval.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> implements i.a.q<T>, Subscription {
        public final Subscriber<? super i.a.f1.d<T>> b;
        public final TimeUnit c;

        /* renamed from: d  reason: collision with root package name */
        public final i.a.j0 f28342d;

        /* renamed from: e  reason: collision with root package name */
        public Subscription f28343e;

        /* renamed from: f  reason: collision with root package name */
        public long f28344f;

        public a(Subscriber<? super i.a.f1.d<T>> subscriber, TimeUnit timeUnit, i.a.j0 j0Var) {
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.q
        public void onSubscribe(Subscription subscription) {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    public k4(i.a.l<T> lVar, TimeUnit timeUnit, i.a.j0 j0Var) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super i.a.f1.d<T>> subscriber) {
    }
}
