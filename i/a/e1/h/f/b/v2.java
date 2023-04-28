package i.a.e1.h.f.b;

import org.reactivestreams.Subscriber;

/* compiled from: FlowableOnErrorReturn.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class v2<T> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super Throwable, ? extends T> f27193d;

    /* compiled from: FlowableOnErrorReturn.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T> extends i.a.e1.h.i.t<T, T> {
        private static final long serialVersionUID = -3740826063558713822L;
        public final i.a.e1.g.o<? super Throwable, ? extends T> valueSupplier;

        public a(Subscriber<? super T> actual, i.a.e1.g.o<? super Throwable, ? extends T> valueSupplier) {
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
    }

    public v2(i.a.e1.c.s<T> source, i.a.e1.g.o<? super Throwable, ? extends T> valueSupplier) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
