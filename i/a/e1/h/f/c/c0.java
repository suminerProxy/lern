package i.a.e1.h.f.c;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeFlatMapBiSelector.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
public final class c0<T, U, R> extends i.a.e1.h.f.c.a<T, R> {
    public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.f0<? extends U>> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.e1.g.c<? super T, ? super U, ? extends R> f27289d;

    /* compiled from: MaybeFlatMapBiSelector.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
    public static final class a<T, U, R> implements i.a.e1.c.c0<T>, i.a.e1.d.f {
        public final i.a.e1.g.o<? super T, ? extends i.a.e1.c.f0<? extends U>> b;
        public final C0455a<T, U, R> c;

        /* compiled from: MaybeFlatMapBiSelector.java */
        /* renamed from: i.a.e1.h.f.c.c0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_4.dex_6161784.dex */
        public static final class C0455a<T, U, R> extends AtomicReference<i.a.e1.d.f> implements i.a.e1.c.c0<U> {
            private static final long serialVersionUID = -2897979525538174559L;
            public final i.a.e1.c.c0<? super R> downstream;
            public final i.a.e1.g.c<? super T, ? super U, ? extends R> resultSelector;
            public T value;

            public C0455a(i.a.e1.c.c0<? super R> actual, i.a.e1.g.c<? super T, ? super U, ? extends R> resultSelector) {
            }

            @Override // i.a.e1.c.c0, i.a.e1.c.m
            public void onComplete() {
            }

            @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
            public void onError(Throwable e2) {
            }

            @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
            public void onSubscribe(i.a.e1.d.f d2) {
            }

            @Override // i.a.e1.c.c0, i.a.e1.c.u0
            public void onSuccess(U value) {
            }
        }

        public a(i.a.e1.c.c0<? super R> actual, i.a.e1.g.o<? super T, ? extends i.a.e1.c.f0<? extends U>> mapper, i.a.e1.g.c<? super T, ? super U, ? extends R> resultSelector) {
        }

        @Override // i.a.e1.d.f
        public void dispose() {
        }

        @Override // i.a.e1.d.f
        public boolean isDisposed() {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.m
        public void onComplete() {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
        public void onError(Throwable e2) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0, i.a.e1.c.m
        public void onSubscribe(i.a.e1.d.f d2) {
        }

        @Override // i.a.e1.c.c0, i.a.e1.c.u0
        public void onSuccess(T value) {
        }
    }

    public c0(i.a.e1.c.f0<T> source, i.a.e1.g.o<? super T, ? extends i.a.e1.c.f0<? extends U>> mapper, i.a.e1.g.c<? super T, ? super U, ? extends R> resultSelector) {
    }

    @Override // i.a.e1.c.z
    public void U1(i.a.e1.c.c0<? super R> observer) {
    }
}
