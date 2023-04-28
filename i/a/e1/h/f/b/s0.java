package i.a.e1.h.f.b;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* compiled from: FlowableElementAt.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class s0<T> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final long f27151d;

    /* renamed from: e  reason: collision with root package name */
    public final T f27152e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f27153f;

    /* compiled from: FlowableElementAt.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends i.a.e1.h.j.f<T> implements i.a.e1.c.x<T> {
        private static final long serialVersionUID = 4066607327284737757L;
        public long count;
        public final T defaultValue;
        public boolean done;
        public final boolean errorOnFewer;
        public final long index;
        public Subscription upstream;

        public a(Subscriber<? super T> actual, long index, T defaultValue, boolean errorOnFewer) {
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

    public s0(i.a.e1.c.s<T> source, long index, T defaultValue, boolean errorOnFewer) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
