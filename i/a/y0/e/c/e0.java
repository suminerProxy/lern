package i.a.y0.e.c;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeFlatMapNotification.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class e0<T, R> extends i.a.y0.e.c.a<T, R> {
    public final i.a.x0.o<? super T, ? extends i.a.y<? extends R>> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super Throwable, ? extends i.a.y<? extends R>> f28642d;

    /* renamed from: e  reason: collision with root package name */
    public final Callable<? extends i.a.y<? extends R>> f28643e;

    /* compiled from: MaybeFlatMapNotification.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends AtomicReference<i.a.u0.c> implements i.a.v<T>, i.a.u0.c {
        private static final long serialVersionUID = 4375739915521278546L;
        public final i.a.v<? super R> downstream;
        public final Callable<? extends i.a.y<? extends R>> onCompleteSupplier;
        public final i.a.x0.o<? super Throwable, ? extends i.a.y<? extends R>> onErrorMapper;
        public final i.a.x0.o<? super T, ? extends i.a.y<? extends R>> onSuccessMapper;
        public i.a.u0.c upstream;

        /* compiled from: MaybeFlatMapNotification.java */
        /* renamed from: i.a.y0.e.c.e0$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class C0549a implements i.a.v<R> {
            public final /* synthetic */ a b;

            public C0549a(a aVar) {
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
            public void onSuccess(R r) {
            }
        }

        public a(i.a.v<? super R> vVar, i.a.x0.o<? super T, ? extends i.a.y<? extends R>> oVar, i.a.x0.o<? super Throwable, ? extends i.a.y<? extends R>> oVar2, Callable<? extends i.a.y<? extends R>> callable) {
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

    public e0(i.a.y<T> yVar, i.a.x0.o<? super T, ? extends i.a.y<? extends R>> oVar, i.a.x0.o<? super Throwable, ? extends i.a.y<? extends R>> oVar2, Callable<? extends i.a.y<? extends R>> callable) {
    }

    @Override // i.a.s
    public void q1(i.a.v<? super R> vVar) {
    }
}
