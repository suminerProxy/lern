package i.a.y0.e.b;

import org.reactivestreams.Subscriber;

/* compiled from: FlowableDistinctUntilChanged.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class o0<T, K> extends i.a.y0.e.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super T, K> f28395d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.x0.d<? super K, ? super K> f28396e;

    /* compiled from: FlowableDistinctUntilChanged.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, K> extends i.a.y0.h.a<T, T> {

        /* renamed from: g  reason: collision with root package name */
        public final i.a.x0.o<? super T, K> f28397g;

        /* renamed from: h  reason: collision with root package name */
        public final i.a.x0.d<? super K, ? super K> f28398h;

        /* renamed from: i  reason: collision with root package name */
        public K f28399i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f28400j;

        public a(i.a.y0.c.a<? super T> aVar, i.a.x0.o<? super T, K> oVar, i.a.x0.d<? super K, ? super K> dVar) {
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

        @Override // i.a.y0.c.a
        public boolean tryOnNext(T t) {
        }
    }

    /* compiled from: FlowableDistinctUntilChanged.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, K> extends i.a.y0.h.b<T, T> implements i.a.y0.c.a<T> {

        /* renamed from: g  reason: collision with root package name */
        public final i.a.x0.o<? super T, K> f28401g;

        /* renamed from: h  reason: collision with root package name */
        public final i.a.x0.d<? super K, ? super K> f28402h;

        /* renamed from: i  reason: collision with root package name */
        public K f28403i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f28404j;

        public b(Subscriber<? super T> subscriber, i.a.x0.o<? super T, K> oVar, i.a.x0.d<? super K, ? super K> dVar) {
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

        @Override // i.a.y0.c.a
        public boolean tryOnNext(T t) {
        }
    }

    public o0(i.a.l<T> lVar, i.a.x0.o<? super T, K> oVar, i.a.x0.d<? super K, ? super K> dVar) {
    }

    @Override // i.a.l
    public void g6(Subscriber<? super T> subscriber) {
    }
}
