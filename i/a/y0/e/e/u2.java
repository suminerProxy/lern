package i.a.y0.e.e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableRetryWhen.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class u2<T> extends i.a.y0.e.e.a<T, T> {
    public final i.a.x0.o<? super i.a.b0<Throwable>, ? extends i.a.g0<?>> c;

    /* compiled from: ObservableRetryWhen.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T> extends AtomicInteger implements i.a.i0<T>, i.a.u0.c {
        private static final long serialVersionUID = 802743776666017014L;
        public volatile boolean active;
        public final i.a.i0<? super T> downstream;
        public final i.a.y0.j.c error;
        public final a<T>.C0580a inner;
        public final i.a.g1.i<Throwable> signaller;
        public final i.a.g0<T> source;
        public final AtomicReference<i.a.u0.c> upstream;
        public final AtomicInteger wip;

        /* compiled from: ObservableRetryWhen.java */
        /* renamed from: i.a.y0.e.e.u2$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public final class C0580a extends AtomicReference<i.a.u0.c> implements i.a.i0<Object> {
            private static final long serialVersionUID = 3254781284376480842L;
            public final /* synthetic */ a this$0;

            public C0580a(a aVar) {
            }

            @Override // i.a.i0
            public void onComplete() {
            }

            @Override // i.a.i0
            public void onError(Throwable th) {
            }

            @Override // i.a.i0
            public void onNext(Object obj) {
            }

            @Override // i.a.i0
            public void onSubscribe(i.a.u0.c cVar) {
            }
        }

        public a(i.a.i0<? super T> i0Var, i.a.g1.i<Throwable> iVar, i.a.g0<T> g0Var) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void innerComplete() {
        }

        public void innerError(Throwable th) {
        }

        public void innerNext() {
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

        public void subscribeNext() {
        }
    }

    public u2(i.a.g0<T> g0Var, i.a.x0.o<? super i.a.b0<Throwable>, ? extends i.a.g0<?>> oVar) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super T> i0Var) {
    }
}
