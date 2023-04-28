package i.a.e1.h.f.b;

import org.reactivestreams.Subscriber;

/* compiled from: FlowableMapNotification.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class g2<T, R> extends i.a.e1.h.f.b.a<T, R> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super T, ? extends R> f26970d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.g.o<? super Throwable, ? extends R> f26971e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.e1.g.s<? extends R> f26972f;

    /* compiled from: FlowableMapNotification.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, R> extends i.a.e1.h.i.t<T, R> {
        private static final long serialVersionUID = 2757120512858778108L;
        public final i.a.e1.g.s<? extends R> onCompleteSupplier;
        public final i.a.e1.g.o<? super Throwable, ? extends R> onErrorMapper;
        public final i.a.e1.g.o<? super T, ? extends R> onNextMapper;

        public a(Subscriber<? super R> actual, i.a.e1.g.o<? super T, ? extends R> onNextMapper, i.a.e1.g.o<? super Throwable, ? extends R> onErrorMapper, i.a.e1.g.s<? extends R> onCompleteSupplier) {
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

    public g2(i.a.e1.c.s<T> source, i.a.e1.g.o<? super T, ? extends R> onNextMapper, i.a.e1.g.o<? super Throwable, ? extends R> onErrorMapper, i.a.e1.g.s<? extends R> onCompleteSupplier) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super R> s) {
    }
}
