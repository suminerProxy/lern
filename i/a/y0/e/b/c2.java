package i.a.y0.e.b;

import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;

/* compiled from: FlowableMapNotification.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class c2<T, R> extends i.a.y0.e.b.a<T, R> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super T, ? extends R> f28233d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.x0.o<? super Throwable, ? extends R> f28234e;

    /* renamed from: f  reason: collision with root package name */
    public final Callable<? extends R> f28235f;

    /* compiled from: FlowableMapNotification.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends i.a.y0.h.t<T, R> {
        private static final long serialVersionUID = 2757120512858778108L;
        public final Callable<? extends R> onCompleteSupplier;
        public final i.a.x0.o<? super Throwable, ? extends R> onErrorMapper;
        public final i.a.x0.o<? super T, ? extends R> onNextMapper;

        public a(Subscriber<? super R> subscriber, i.a.x0.o<? super T, ? extends R> oVar, i.a.x0.o<? super Throwable, ? extends R> oVar2, Callable<? extends R> callable) {
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
    }

    public c2(i.a.l<T> lVar, i.a.x0.o<? super T, ? extends R> oVar, i.a.x0.o<? super Throwable, ? extends R> oVar2, Callable<? extends R> callable) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super R> subscriber) {
    }
}
