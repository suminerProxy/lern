package i.a.e1.h.f.b;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* compiled from: FlowableReduceMaybe.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class b3<T> extends i.a.e1.c.z<T> implements i.a.e1.h.c.j<T>, i.a.e1.h.c.d<T> {
    public final i.a.e1.c.s<T> b;
    public final i.a.e1.g.c<T, T, T> c;

    /* compiled from: FlowableReduceMaybe.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> implements i.a.e1.c.x<T>, i.a.e1.d.f {
        public final i.a.e1.c.c0<? super T> b;
        public final i.a.e1.g.c<T, T, T> c;

        /* renamed from: d  reason: collision with root package name */
        public T f26881d;

        /* renamed from: e  reason: collision with root package name */
        public Subscription f26882e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f26883f;

        public a(i.a.e1.c.c0<? super T> actual, i.a.e1.g.c<T, T, T> reducer) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
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

    public b3(i.a.e1.c.s<T> source, i.a.e1.g.c<T, T, T> reducer) {
    }

    @Override // i.a.e1.c.z
    public void U1(i.a.e1.c.c0<? super T> observer) {
    }

    @Override // i.a.e1.h.c.d
    public i.a.e1.c.s<T> c() {
    }

    @Override // i.a.e1.h.c.j
    public Publisher<T> source() {
    }
}
