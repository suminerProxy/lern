package i.a.y0.e.c;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeFlatMapBiSelector.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class a0<T, U, R> extends i.a.y0.e.c.a<T, R> {
    public final i.a.x0.o<? super T, ? extends i.a.y<? extends U>> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.c<? super T, ? super U, ? extends R> f28621d;

    /* compiled from: MaybeFlatMapBiSelector.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, U, R> implements i.a.v<T>, i.a.u0.c {
        public final i.a.x0.o<? super T, ? extends i.a.y<? extends U>> b;
        public final C0547a<T, U, R> c;

        /* compiled from: MaybeFlatMapBiSelector.java */
        /* renamed from: i.a.y0.e.c.a0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class C0547a<T, U, R> extends AtomicReference<i.a.u0.c> implements i.a.v<U> {
            private static final long serialVersionUID = -2897979525538174559L;
            public final i.a.v<? super R> downstream;
            public final i.a.x0.c<? super T, ? super U, ? extends R> resultSelector;
            public T value;

            public C0547a(i.a.v<? super R> vVar, i.a.x0.c<? super T, ? super U, ? extends R> cVar) {
            }

            @Override // i.a.v
            public void onComplete() {
            }

            @Override // i.a.v
            public void onError(Throwable th) {
            }

            @Override // i.a.v
            public void onSubscribe(i.a.u0.c cVar) {
            }

            @Override // i.a.v, i.a.n0
            public void onSuccess(U u) {
            }
        }

        public a(i.a.v<? super R> vVar, i.a.x0.o<? super T, ? extends i.a.y<? extends U>> oVar, i.a.x0.c<? super T, ? super U, ? extends R> cVar) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // i.a.v
        public void onComplete() {
        }

        @Override // i.a.v
        public void onError(Throwable th) {
        }

        @Override // i.a.v
        public void onSubscribe(i.a.u0.c cVar) {
        }

        @Override // i.a.v, i.a.n0
        public void onSuccess(T t) {
        }
    }

    public a0(i.a.y<T> yVar, i.a.x0.o<? super T, ? extends i.a.y<? extends U>> oVar, i.a.x0.c<? super T, ? super U, ? extends R> cVar) {
    }

    @Override // i.a.s
    public void q1(i.a.v<? super R> vVar) {
    }
}
