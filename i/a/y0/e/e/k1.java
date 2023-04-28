package i.a.y0.e.e;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableGroupJoin.java */
/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public final class k1<TLeft, TRight, TLeftEnd, TRightEnd, R> extends i.a.y0.e.e.a<TLeft, R> {
    public final i.a.g0<? extends TRight> c;

    /* renamed from: d  reason: collision with root package name */
    public final i.a.x0.o<? super TLeft, ? extends i.a.g0<TLeftEnd>> f28832d;

    /* renamed from: e  reason: collision with root package name */
    public final i.a.x0.o<? super TRight, ? extends i.a.g0<TRightEnd>> f28833e;

    /* renamed from: f  reason: collision with root package name */
    public final i.a.x0.c<? super TLeft, ? super i.a.b0<TRight>, ? extends R> f28834f;

    /* compiled from: ObservableGroupJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements i.a.u0.c, b {
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
        public final Map<Integer, i.a.g1.j<TRight>> lefts;
        public final i.a.y0.f.c<Object> queue;
        public final i.a.x0.c<? super TLeft, ? super i.a.b0<TRight>, ? extends R> resultSelector;
        public final i.a.x0.o<? super TRight, ? extends i.a.g0<TRightEnd>> rightEnd;
        public int rightIndex;
        public final Map<Integer, TRight> rights;

        public a(i.a.i0<? super R> i0Var, i.a.x0.o<? super TLeft, ? extends i.a.g0<TLeftEnd>> oVar, i.a.x0.o<? super TRight, ? extends i.a.g0<TRightEnd>> oVar2, i.a.x0.c<? super TLeft, ? super i.a.b0<TRight>, ? extends R> cVar) {
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
        public void innerClose(boolean z, c cVar) {
        }

        @Override // i.a.y0.e.e.k1.b
        public void innerCloseError(Throwable th) {
        }

        @Override // i.a.y0.e.e.k1.b
        public void innerComplete(d dVar) {
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

    /* compiled from: ObservableGroupJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public interface b {
        void innerClose(boolean z, c cVar);

        void innerCloseError(Throwable th);

        void innerComplete(d dVar);

        void innerError(Throwable th);

        void innerValue(boolean z, Object obj);
    }

    /* compiled from: ObservableGroupJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class c extends AtomicReference<i.a.u0.c> implements i.a.i0<Object>, i.a.u0.c {
        private static final long serialVersionUID = 1883890389173668373L;
        public final int index;
        public final boolean isLeft;
        public final b parent;

        public c(b bVar, boolean z, int i2) {
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
        public void onNext(Object obj) {
        }

        @Override // i.a.i0
        public void onSubscribe(i.a.u0.c cVar) {
        }
    }

    /* compiled from: ObservableGroupJoin.java */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public static final class d extends AtomicReference<i.a.u0.c> implements i.a.i0<Object>, i.a.u0.c {
        private static final long serialVersionUID = 1883890389173668373L;
        public final boolean isLeft;
        public final b parent;

        public d(b bVar, boolean z) {
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
        public void onNext(Object obj) {
        }

        @Override // i.a.i0
        public void onSubscribe(i.a.u0.c cVar) {
        }
    }

    public k1(i.a.g0<TLeft> g0Var, i.a.g0<? extends TRight> g0Var2, i.a.x0.o<? super TLeft, ? extends i.a.g0<TLeftEnd>> oVar, i.a.x0.o<? super TRight, ? extends i.a.g0<TRightEnd>> oVar2, i.a.x0.c<? super TLeft, ? super i.a.b0<TRight>, ? extends R> cVar) {
    }

    @Override // i.a.b0
    public void subscribeActual(i.a.i0<? super R> i0Var) {
    }
}
