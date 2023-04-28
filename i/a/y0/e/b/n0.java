package i.a.y0.e.b;

import java.util.Collection;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;

/* compiled from: FlowableDistinct.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class n0<T, K> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super T, K> f28378d;

    /* renamed from: e  reason: collision with root package name */
    public final Callable<? extends Collection<? super K>> f28379e;

    /* compiled from: FlowableDistinct.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, K> extends i.a.y0.h.b<T, T> {

        /* renamed from: g  reason: collision with root package name */
        public final Collection<? super K> f28380g;

        /* renamed from: h  reason: collision with root package name */
        public final i.a.x0.o<? super T, K> f28381h;

        public a(Subscriber<? super T> subscriber, i.a.x0.o<? super T, K> oVar, Collection<? super K> collection) {
        }

        @Override // i.a.y0.h.b, i.a.y0.c.o
        public void clear() {
        }

        @Override // i.a.y0.h.b, org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // i.a.y0.h.b, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.y0.c.o
        @i.a.t0.g
        public T poll() throws Exception {
        }

        @Override // i.a.y0.c.k
        public int requestFusion(int i2) {
        }
    }

    public n0(i.a.l<T> lVar, i.a.x0.o<? super T, K> oVar, Callable<? extends Collection<? super K>> callable) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
