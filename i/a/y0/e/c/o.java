package i.a.y0.e.c;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeDelayWithCompletable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class o<T> extends i.a.s<T> {
    public final i.a.y<T> b;
    public final i.a.i c;

    /* compiled from: MaybeDelayWithCompletable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> implements i.a.v<T> {
        public final AtomicReference<i.a.u0.c> b;
        public final i.a.v<? super T> c;

        public a(AtomicReference<i.a.u0.c> atomicReference, i.a.v<? super T> vVar) {
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

    /* compiled from: MaybeDelayWithCompletable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T> extends AtomicReference<i.a.u0.c> implements i.a.f, i.a.u0.c {
        private static final long serialVersionUID = 703409937383992161L;
        public final i.a.v<? super T> downstream;
        public final i.a.y<T> source;

        public b(i.a.v<? super T> vVar, i.a.y<T> yVar) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // i.a.f
        public void onComplete() {
        }

        @Override // i.a.f
        public void onError(Throwable th) {
        }

        @Override // i.a.f
        public void onSubscribe(i.a.u0.c cVar) {
        }
    }

    public o(i.a.y<T> yVar, i.a.i iVar) {
    }

    @Override // i.a.s
    public void q1(i.a.v<? super T> vVar) {
    }
}
