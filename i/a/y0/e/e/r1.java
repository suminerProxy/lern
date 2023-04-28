package i.a.y0.e.e;

import i.a.y0.e.e.k1;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableJoin.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class r1<TLeft, TRight, TLeftEnd, TRightEnd, R> extends i.a.y0.e.e.a<TLeft, R> {
    public final i.a.g0<? extends TRight> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super TLeft, ? extends i.a.g0<TLeftEnd>> f28934d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.x0.o<? super TRight, ? extends i.a.g0<TRightEnd>> f28935e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.x0.c<? super TLeft, ? super TRight, ? extends R> f28936f;

    /* compiled from: ObservableJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements i.a.u0.c, k1.b {
        public static final Integer LEFT_CLOSE = null;
        public static final Integer LEFT_VALUE = null;
        public static final Integer RIGHT_CLOSE = null;
        public static final Integer RIGHT_VALUE = null;
        private static final long serialVersionUID = -6071216598687999801L;
        public final AtomicInteger active;
        public volatile boolean cancelled;
        public final i.a.u0.b disposables;
        public final i.a.i0<? super R> downstream;
        public final AtomicReference<Throwable> error;
        public final i.a.x0.o<? super TLeft, ? extends i.a.g0<TLeftEnd>> leftEnd;
        public int leftIndex;
        public final Map<Integer, TLeft> lefts;
        public final i.a.y0.f.c<Object> queue;
        public final i.a.x0.c<? super TLeft, ? super TRight, ? extends R> resultSelector;
        public final i.a.x0.o<? super TRight, ? extends i.a.g0<TRightEnd>> rightEnd;
        public int rightIndex;
        public final Map<Integer, TRight> rights;

        public a(i.a.i0<? super R> i0Var, i.a.x0.o<? super TLeft, ? extends i.a.g0<TLeftEnd>> oVar, i.a.x0.o<? super TRight, ? extends i.a.g0<TRightEnd>> oVar2, i.a.x0.c<? super TLeft, ? super TRight, ? extends R> cVar) {
        }

        public void cancelAll() {
        }

        @Override // i.a.u0.c
        public void dispose() {
        }

        public void drain() {
        }

        public void errorAll(i.a.i0<?> i0Var) {
        }

        public void fail(Throwable th, i.a.i0<?> i0Var, i.a.y0.f.c<?> cVar) {
        }

        @Override // i.a.y0.e.e.k1.b
        public void innerClose(boolean z, k1.c cVar) {
        }

        @Override // i.a.y0.e.e.k1.b
        public void innerCloseError(Throwable th) {
        }

        @Override // i.a.y0.e.e.k1.b
        public void innerComplete(k1.d dVar) {
        }

        @Override // i.a.y0.e.e.k1.b
        public void innerError(Throwable th) {
        }

        @Override // i.a.y0.e.e.k1.b
        public void innerValue(boolean z, Object obj) {
        }

        @Override // i.a.u0.c
        public boolean isDisposed() {
        }
    }

    public r1(i.a.g0<TLeft> g0Var, i.a.g0<? extends TRight> g0Var2, i.a.x0.o<? super TLeft, ? extends i.a.g0<TLeftEnd>> oVar, i.a.x0.o<? super TRight, ? extends i.a.g0<TRightEnd>> oVar2, i.a.x0.c<? super TLeft, ? super TRight, ? extends R> cVar) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super R> i0Var) {
    }
}
