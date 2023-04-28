package i.a.y0.e.c;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeTimeoutMaybe.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class j1<T, U> extends i.a.y0.e.c.a<T, T> {
    public final i.a.y<U> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.y<? extends T> f28645d;

    /* compiled from: MaybeTimeoutMaybe.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicReference<i.a.u0.c> implements i.a.v<T> {
        private static final long serialVersionUID = 8663801314800248617L;
        public final i.a.v<? super T> downstream;

        public a(i.a.v<? super T> vVar) {
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

    /* compiled from: MaybeTimeoutMaybe.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class b<T, U> extends AtomicReference<i.a.u0.c> implements i.a.v<T>, i.a.u0.c {
        private static final long serialVersionUID = -5955289211445418871L;
        public final i.a.v<? super T> downstream;
        public final i.a.y<? extends T> fallback;
        public final c<T, U> other;
        public final a<T> otherObserver;

        public b(i.a.v<? super T> vVar, i.a.y<? extends T> yVar) {
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

    /* compiled from: MaybeTimeoutMaybe.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c<T, U> extends AtomicReference<i.a.u0.c> implements i.a.v<Object> {
        private static final long serialVersionUID = 8663801314800248617L;
        public final b<T, U> parent;

        public c(b<T, U> bVar) {
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

    public j1(i.a.y<T> yVar, i.a.y<U> yVar2, i.a.y<? extends T> yVar3) {
    }

    @Override // i.a.s
    public void q1(i.a.v<? super T> vVar) {
    }
}
