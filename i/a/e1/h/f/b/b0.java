package i.a.e1.h.f.b;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;

/* compiled from: FlowableConcatWithSingle.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class b0<T> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.c.x0<? extends T> f26878d;

    /* compiled from: FlowableConcatWithSingle.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends i.a.e1.h.i.t<T, T> implements i.a.e1.c.u0<T> {
        private static final long serialVersionUID = -7346385463600070225L;
        public i.a.e1.c.x0<? extends T> other;
        public final AtomicReference<i.a.e1.d.f> otherDisposable;

        public a(Subscriber<? super T> actual, i.a.e1.c.x0<? extends T> other) {
        }

        @Override // i.a.e1.h.i.t, org.reactivestreams.Subscription
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

        @Override // i.a.e1.c.u0, i.a.e1.c.m
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // i.a.e1.c.u0
        public void onSuccess(T t) {
        }
    }

    public b0(i.a.e1.c.s<T> source, i.a.e1.c.x0<? extends T> other) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
