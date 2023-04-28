package i.a.y0.e.d;

import i.a.b0;
import i.a.i0;
import i.a.v;
import i.a.y;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableConcatMapMaybe.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class m<T, R> extends b0<R> {
    public final b0<T> b;
    public final i.a.x0.o<? super T, ? extends y<? extends R>> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.y0.j.j f28685d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28686e;

    /* compiled from: ObservableConcatMapMaybe.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<T, R> extends AtomicInteger implements i0<T>, i.a.u0.c {
        public static final int STATE_ACTIVE = 1;
        public static final int STATE_INACTIVE = 0;
        public static final int STATE_RESULT_VALUE = 2;
        private static final long serialVersionUID = -9140123220065488293L;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final i0<? super R> downstream;
        public final i.a.y0.j.j errorMode;
        public final i.a.y0.j.c errors;
        public final C0563a<R> inner;
        public R item;
        public final i.a.x0.o<? super T, ? extends y<? extends R>> mapper;
        public final i.a.y0.c.n<T> queue;
        public volatile int state;
        public i.a.u0.c upstream;

        /* compiled from: ObservableConcatMapMaybe.java */
        /* renamed from: i.a.y0.e.d.m$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
        public static final class C0563a<R> extends AtomicReference<i.a.u0.c> implements v<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            public final a<?, R> parent;

            public C0563a(a<?, R> aVar) {
            }

            public void dispose() {
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

        public a(i0<? super R> i0Var, i.a.x0.o<? super T, ? extends y<? extends R>> oVar, int i2, i.a.y0.j.j jVar) {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void drain() {
        }

        public void innerComplete() {
        }

        public void innerError(Throwable th) {
        }

        public void innerSuccess(R r) {
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
    }

    public m(b0<T> b0Var, i.a.x0.o<? super T, ? extends y<? extends R>> oVar, i.a.y0.j.j jVar, int i2) {
    }

    @Override // i.a.b0
    public void subscribeActual(i0<? super R> i0Var) {
    }
}
