package i.a.e1.h.f.b;

import org.reactivestreams.Subscriber;

/* compiled from: FlowableDistinctUntilChanged.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class n0<T, K> extends i.a.e1.h.f.b.a<T, T> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super T, K> f27045d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.e1.g.d<? super K, ? super K> f27046e;

    /* compiled from: FlowableDistinctUntilChanged.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, K> extends i.a.e1.h.i.a<T, T> {

        /* renamed from: g  reason: collision with root package name */
        public final i.a.e1.g.o<? super T, K> f27047g;

        /* renamed from: h  reason: collision with root package name */
        public final i.a.e1.g.d<? super K, ? super K> f27048h;

        /* renamed from: i  reason: collision with root package name */
        public K f27049i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f27050j;

        public a(i.a.e1.h.c.c<? super T> actual, i.a.e1.g.o<? super T, K> keySelector, i.a.e1.g.d<? super K, ? super K> comparer) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public T poll() throws Throwable {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int mode) {
        }

        @Override // i.a.e1.h.c.c
        public boolean tryOnNext(T t) {
        }
    }

    /* compiled from: FlowableDistinctUntilChanged.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, K> extends i.a.e1.h.i.b<T, T> implements i.a.e1.h.c.c<T> {

        /* renamed from: g  reason: collision with root package name */
        public final i.a.e1.g.o<? super T, K> f27051g;

        /* renamed from: h  reason: collision with root package name */
        public final i.a.e1.g.d<? super K, ? super K> f27052h;

        /* renamed from: i  reason: collision with root package name */
        public K f27053i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f27054j;

        public b(Subscriber<? super T> actual, i.a.e1.g.o<? super T, K> keySelector, i.a.e1.g.d<? super K, ? super K> comparer) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public T poll() throws Throwable {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int mode) {
        }

        @Override // i.a.e1.h.c.c
        public boolean tryOnNext(T t) {
        }
    }

    public n0(i.a.e1.c.s<T> source, i.a.e1.g.o<? super T, K> keySelector, i.a.e1.g.d<? super K, ? super K> comparer) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super T> s) {
    }
}
