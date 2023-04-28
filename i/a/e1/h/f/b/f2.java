package i.a.e1.h.f.b;

import org.reactivestreams.Subscriber;

/* compiled from: FlowableMap.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class f2<T, U> extends i.a.e1.h.f.b.a<T, U> {

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.o<? super T, ? extends U> f26953d;

    /* compiled from: FlowableMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, U> extends i.a.e1.h.i.a<T, U> {

        /* renamed from: g  reason: collision with root package name */
        public final i.a.e1.g.o<? super T, ? extends U> f26954g;

        public a(i.a.e1.h.c.c<? super U> actual, i.a.e1.g.o<? super T, ? extends U> function) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public U poll() throws Throwable {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int mode) {
        }

        @Override // i.a.e1.h.c.c
        public boolean tryOnNext(T t) {
        }
    }

    /* compiled from: FlowableMap.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class b<T, U> extends i.a.e1.h.i.b<T, U> {

        /* renamed from: g  reason: collision with root package name */
        public final i.a.e1.g.o<? super T, ? extends U> f26955g;

        public b(Subscriber<? super U> actual, i.a.e1.g.o<? super T, ? extends U> mapper) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // i.a.e1.h.c.q
        @i.a.e1.b.g
        public U poll() throws Throwable {
        }

        @Override // i.a.e1.h.c.m
        public int requestFusion(int mode) {
        }
    }

    public f2(i.a.e1.c.s<T> source, i.a.e1.g.o<? super T, ? extends U> mapper) {
    }

    @Override // i.a.e1.c.s
    public void F6(Subscriber<? super U> s) {
    }
}
