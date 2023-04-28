package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableMergeWithCompletable.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class z1<T> extends i.a.y0.e.e.a<T, T> {
    public final i.a.i c;

    /* compiled from: ObservableMergeWithCompletable.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements i.a.i0<T>, i.a.u0.c {
        private static final long serialVersionUID = -4592979584110982903L;
        public final i.a.i0<? super T> downstream;
        public final i.a.y0.j.c error;
        public final AtomicReference<i.a.u0.c> mainDisposable;
        public volatile boolean mainDone;
        public volatile boolean otherDone;
        public final C0585a otherObserver;

        /* compiled from: ObservableMergeWithCompletable.java */
        /* renamed from: i.a.y0.e.e.z1$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class C0585a extends AtomicReference<i.a.u0.c> implements i.a.f {
            private static final long serialVersionUID = -2935427570954647017L;
            public final a<?> parent;

            public C0585a(a<?> aVar) {
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

        public a(i.a.i0<? super T> i0Var) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }

        @Override // i.a.i0
        public void onComplete() {
        }

        @Override // i.a.i0
        public void onError(Throwable th) {
        }

        @Override // i.a.i0
        public void onNext(T t) {
        }

        @Override // i.a.i0
        public void onSubscribe(i.a.u0.c cVar) {
        }

        public void otherComplete() {
        }

        public void otherError(Throwable th) {
        }
    }

    public z1(i.a.b0<T> b0Var, i.a.i iVar) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super T> i0Var) {
    }
}
