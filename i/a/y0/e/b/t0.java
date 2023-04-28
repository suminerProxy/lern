package i.a.y0.e.b;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableElementAt.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class t0<T> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final long f28504d;

    /* renamed from: e  reason: collision with root package name */
    public final T f28505e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f28506f;

    /* compiled from: FlowableElementAt.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends i.a.y0.i.f<T> implements i.a.q<T> {
        private static final long serialVersionUID = 4066607327284737757L;
        public long count;
        public final T defaultValue;
        public boolean done;
        public final boolean errorOnFewer;
        public final long index;
        public Subscription upstream;

        public a(Subscriber<? super T> subscriber, long j2, T t, boolean z) {
        }

        @Override // i.a.y0.i.f, org.reactivestreams.Subscription
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
    }

    public t0(i.a.l<T> lVar, long j2, T t, boolean z) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
