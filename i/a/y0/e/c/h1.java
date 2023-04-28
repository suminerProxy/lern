package i.a.y0.e.c;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeTakeUntilMaybe.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class h1<T, U> extends i.a.y0.e.c.a<T, T> {
    public final i.a.y<U> c;

    /* compiled from: MaybeTakeUntilMaybe.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, U> extends AtomicReference<i.a.u0.c> implements i.a.v<T>, i.a.u0.c {
        private static final long serialVersionUID = -2187421758664251153L;
        public final i.a.v<? super T> downstream;
        public final C0553a<U> other;

        /* compiled from: MaybeTakeUntilMaybe.java */
        /* renamed from: i.a.y0.e.c.h1$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class C0553a<U> extends AtomicReference<i.a.u0.c> implements i.a.v<U> {
            private static final long serialVersionUID = -1266041316834525931L;
            public final a<?, U> parent;

            public C0553a(a<?, U> aVar) {
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
            public void onSuccess(Object obj) {
            }
        }

        public a(i.a.v<? super T> vVar) {
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

        public void otherComplete() {
        }

        public void otherError(Throwable th) {
        }
    }

    public h1(i.a.y<T> yVar, i.a.y<U> yVar2) {
    }

    @Override // i.a.s
    public void q1(i.a.v<? super T> vVar) {
    }
}
